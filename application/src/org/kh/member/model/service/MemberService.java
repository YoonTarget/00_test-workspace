package org.kh.member.model.service;

import java.sql.Connection;

import static org.kh.common.JDBCTemplate.*;

import org.kh.member.model.dao.MemberDAO;
import org.kh.member.model.vo.MemberVO;

public class MemberService {
	
	public int insertMember(MemberVO m) {
		
		Connection conn = getConnection();
		
		int result = new MemberDAO().insertMember(conn, m);
		
		if(result > 0) {
			commit(conn);
		}
		else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
		
	}

}
