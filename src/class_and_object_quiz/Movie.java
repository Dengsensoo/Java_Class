package class_and_object_quiz;

public class Movie { //	Movie 클래스를 정의하세요.
	
		// 필드:
		String title;
		String genre;
		int runtime;
		
//		public Movie() { // 기본 생성자
//			
//		}
//		
//		public Movie(String title, int runtime) { // 새로운 생성자
//			this.title = title;
//			this.runtime = runtime;
//		}
//		
//		public Movie(String title, String genre, int runtime) { // 새로운 생성자
//			this.title = title;
//			this.genre = genre;
//			this.runtime = runtime;
//		}
		
		public Movie() { // 기본 생성자
			
		} // Source Generate Constructors from superclass
		
		public Movie(String title, String genre, int runtime) { //
			this.title = title; // this 붙으면 로컬변수가 아닌 필드변수라는 뜻
			this.genre = genre;
			this.runtime = runtime;
		} // Source Generate Constructor using Fields

		// 메소드
		public boolean isLongMovie() {
			return runtime >= 120; // 이거 자체로 true 또는 false 여부가 반환됨
		}
		
}
