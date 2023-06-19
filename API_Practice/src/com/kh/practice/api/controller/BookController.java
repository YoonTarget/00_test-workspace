package com.kh.practice.api.controller;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.practice.api.model.vo.Book;

public class BookController {
	// private 접근제한자로 크기 5의 Book 객체 배열 생성
	// 각각의 인덱스에 접근하여 샘플 데이터 넣어서 객체 생성
	private int count = 5;
//	private Book[] books = new Book[count];
//	{
//		books[0] = new Book("자바의 정석", "차은우", "나무", new Date(2023 - 1900, 06 - 1, 14), 10000);
//		books[1] = new Book("여러분 파이팅", "주지훈", "사과", new Date(2023 - 1900, 05 - 1, 11), 9000);
//		books[2] = new Book("API의 모든 것", "문동은", "오렌지", new Date(2020 - 1900, 04 - 1, 25), 5000);
//		books[3] = new Book("언어의 천재", "장원영", "키위", new Date(2015 - 1900, 01 - 1, 01), 15000);
//		books[4] = new Book("개발왕국", "시연쌤", "바나나", new Date(2022 - 1900, 12 - 1, 25), 12000);
//	}
	private ArrayList<Book> list = new ArrayList<Book>();
	{
		list.add(new Book("자바의 정석", "차은우", "나무", new Date(2023 - 1900, 06 - 1, 14), 10000));
		list.add(new Book("여러분 파이팅", "주지훈", "사과", new Date(2023 - 1900, 05 - 1, 11), 9000));
		list.add(new Book("API의 모든 것", "문동은", "오렌지", new Date(2020 - 1900, 04 - 1, 25), 5000));
		list.add(new Book("언어의 천재", "장원영", "키위", new Date(2015 - 1900, 01 - 1, 01), 15000));
		list.add(new Book("개발왕국", "시연쌤", "바나나", new Date(2022 - 1900, 12 - 1, 25), 12000));
	}
	
	Scanner sc = new Scanner(System.in);
	
	// 기본 생성자
	public BookController() {}
	
	// 1. 도서 전체 출력 기능 메소드
	public void printAll() {
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
		// 1) for loop문 방법
//		for(int i = 0; i < books.length; i++) {
//			System.out.println(books[i]);
//		}
		
		// 2) for each문 방법 (향상된 for문)
		for(Book b : list) {
			System.out.println(b);
		}
	}
	
	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, 
			String newPublisher, String newDate, String newPrice) {
		// 1. 매개변수로 전달받은 newPrice값 ==> String --> int로 변환작업 (int price라는 변수에 담으시오)
		// "20000" --> 20000
		int price = Integer.parseInt(newPrice);
		
		// 2. 매개변수로 전달받은 newDate값 ==> String --> Date로 변환 작업 (Date publishDate에 담으시오)
		// '-'를 구분자로 StringTokenizer를 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용
		// 1) StringTokenizer를 이용한 방법
		// 1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로분리("2020", "07", "01")
		StringTokenizer stn = new StringTokenizer(newDate, "-");
		
		// 1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기
		
		int year = Integer.parseInt(stn.nextToken());
		int month = Integer.parseInt(stn.nextToken());
		int date = Integer.parseInt(stn.nextToken());
		
		// 1_3) year, month, date 가지고 Date객체 생성하기
		Date publishDate = new Date(year - 1900, month - 1, date);
		
//		// 2) split 메소드를 이용한 방법
//		// 2_1) split 메소드를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리후 String[] 배열에 담기
//		String[] arr = newDate.split("-");
//		// 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서int 변수들에 담기

//		int year2 = Integer.parseInt(arr[0]);
//		int month2 = Integer.parseInt(arr[1]);
//		int date2 = Integer.parseInt(arr[1]);
//		
//		// 2_3) year, month, date 가지고 Date객체 생성하기
//		Date publishDate2 = new Date(year2 - 1900, month2 - 1, date2);
		
		// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을가지고
		// Book클래스의 매개변수 생성자를 통해 생성
		
		count++;

		list.add(new Book(newTitle, newAuthor, newPublisher, publishDate, price));
		
		System.out.println("추가도서 추가 완료!!");
	}
	
	// 3. 도서 출간일 출력 기능 메소드
	public void printBookPublisherDate() {
		// 새로 입력받은 도서 (5번째 도서)의 출간일 출력
		// "xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력
		// SimpleDateFormat을 이용하여 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		String str = sdf.format(list.get(count - 1).getPublishDate());
		System.out.println(str);
	}
	
	// 4. 도서 검색 기능 메소드
	public void searchBook(String searchTitle) {
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		// 전달받은 검색명을 포함(HINT : String클래스의 contains메소드 활용)한!! 도서들 전체 출력 
		// 1) for loop문 방법
//		for(int i = 0; i < books.length; i++) {
//			if(books[i].getTitle().contains(searchTitle)) {
//				System.out.println(books[i]);
//			}
//		}
		
		// 2) for each문 방법 (향상된 for문)
		int total = 0;
		for(Book b : list) {
			if(b.getTitle().contains(searchTitle)) {
				System.out.println(b);
				total++;
			}
		}
		
		if(total == 0) {
			System.out.println("해당 도서는 없는 도서입니다.");
		}
		
	}
	
	public void randomBook() {
		
		// 주사위 값 : 3
		// 추천 도서 : 3권
		// books[0] ~ books[count - 1] 사이의 인덱스 중에 중복 없이 추천
		
		int num = (int)(Math.random() * 6 + 1);
		
		System.out.println("주사위의 값 : " + num);
		
		int[] arr = new int[num];
		
		// i == 0, arr[0] == 1, j == 0 => pass (!= j < i)
		// i == 1, arr[1] == 1, j == 0, arr[0] == 1 => 다시 (i--)
		// i == 1, arr[1] == 2, j == 0, arr[0] == 1 => pass
		// i == 2, arr[2] == 3, j == 0, arr[0] == 1, j == 1, arr[1] == 2 => pass
		
		System.out.println("추천 도서는");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * count - 1 + 0);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(list.get(arr[i]));
		}
		
		System.out.println("입니다.");
		
	}
	
	public void assign() {
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = 1; j < list.size(); j++) {
				if(list.get(j - 1).getPrice() > list.get(j).getPrice()) {
					list.add(j, list.get(j - 1));
					list.remove(j - 1);
				}
			}
		}
		
		for(Book b : list) {
			System.out.println(b);
		}
		
	}
	
//	public void down() {
//		
//		for(int i = 0; i < books.length; i++) {
//			for(int j = 1; j < books.length; j++) {
//				int result = books[j -1].getPublishDate().compareTo(books[j].getPublishDate());
//				if(result == -1) {
//					temp = books[j];
//					books[j] = books[j - 1];
//					books[j - 1] = temp;
//				}
//			}
//		}
//		
//		for(Book bk : books) {
//			System.out.println(bk);
//		}
//		
//	}
//	
//	public void rockScissorPaper() {
//		
//		System.out.println("가위바위보 시이이이작!!!");
//		
//		int total = 0;
//		int win = 0;
//		int draw = 0;
//		int lose = 0;
//		
//		while(true) {
//			int num = (int)(Math.random() * 3 + 1);
//			String com = "";
//			
//			switch(num) {
//			case 1 :
//				com = "가위";
//				break;
//			case 2 :
//				com = "바위";
//				break;
//			default :
//				com = "보";
//			}
//			
//			System.out.print("가위/바위/보 입력 : ");
//			String user = sc.nextLine();
//			
//			System.out.println("유저 : " + user);
//			System.out.println("컴퓨터 : " + com);
//			
//			total++;
//			if(user.equals(com)) {
//				System.out.println("비겼네용!");
//				draw++;
//			} else if(user.equals("가위") && com.equals("보") || user.equals("바위") && com.equals("가위") || user.equals("보") && com.equals("바위")) {
//				System.out.println("이겼어요!!");
//				win++;
//				System.out.printf("총전적 : %d전 %d승 %d무 %d패\n", total, win, draw, lose);
//				break;
//			} else {
//				System.out.println("졌어요ㅠㅠ");
//				lose++;
//			}
//		}
//		
//		int[] arr = new int[total];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * (count - 1) + 0);
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//				}
//			}
//		}
//		
//		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("recommendBooks.txt"))) {
//			oos.writeBytes("추천도서는");
//			for(int i = 0; i < arr.length; i++) {
//				oos.writeObject(books[arr[i]]);
//			}
//			oos.writeBytes("입니다.");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public void fileRead() {
//		
//		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("recommendBooks.txt"))) {
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//	}

}
