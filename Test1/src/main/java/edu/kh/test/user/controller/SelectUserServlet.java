package edu.kh.test.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.test.user.model.dao.UserDAO;
import edu.kh.test.user.model.vo.UserDTO;

/**
 * Servlet implementation class SelectUserServlet
 */
@WebServlet("/serverTest.do")
public class SelectUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	
		int userNo = Integer.parseInt(request.getParameter("userNo"));
		
		System.out.println(userNo);
		
		UserDTO ud=  new UserDAO().selectUser(userNo);
		
		if(ud != null) {
			request.setAttribute("userNo", ud.getUserNo());
			request.setAttribute("userId", ud.getUserId());
			request.setAttribute("userName", ud.getUserName());
			request.setAttribute("userAge", ud.getUserAge());
		}
		else {
			request.setAttribute("failMsg", "조회결과가 없습니다.");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
