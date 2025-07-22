package class_and_object_quiz;

public class Score { //	Score 클래스를 정의하세요.
	
	//	필드: int kor, int eng, int math
	
		int kor; 
		int eng;
		int math;
		
		public int printScore() { // printScore() 메서드 작성:
			return kor + eng + math;
		}
		
		public double printAverage() {
			return (kor + eng + math) / 3;
		}

}
