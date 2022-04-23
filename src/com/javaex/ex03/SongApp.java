package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		Song s01 = new Song("아이유","좋은날","Real", "이민수" ,2010,3);
		s01.showInfo();
		
		Song s02 = new Song("BIGBANG","거짓말","Always","G-DRAGON",2007,2);
		s02.showInfo();
		
		Song s03 = new Song("버스커버스커","벚꽃엔딩","버스커버스커1집","장범준",2012,4);
		s03.showInfo();
	}

}
