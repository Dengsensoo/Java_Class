package class_and_object_quiz;

public class Main_movie { // 라이브러리로 제공되는 클래스의 이름은 사용하지 말 것

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie see_movie = new Movie();
		see_movie.title = "슈퍼맨";
		see_movie.genre = "SF";
		see_movie.runtime = 150;
		
		System.out.println("긴 영화인가요? " + see_movie.isLongMovie());
		
//		Movie movie2 = new Movie("판타스틱4", "SF", 110);
//		System.out.println("긴 영화인가요? " + movie2.isLongMovie());
//		
//		Movie movie3 = new Movie("90분컷", 90);
//		System.out.println("짧은 영화네요. " + movie3.isLongMovie());
		
	}

}
