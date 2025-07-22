package class_and_object_quiz;

public class Main_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score subject = new Score();
		subject.kor = 90;
		subject.eng = 80;
		subject.math = 60;
		
		// 총점, 평균을 출력
		int total = subject.printScore();
		System.out.println("총점: " + total);
		
		double avg = subject.printAverage();
		System.out.println("평균: " + avg);
		
		//	평균이 90점 이상이면 "우수",
		//	60점 미만이면 "재시험",
		//	그 외는 "보통" 출력
		if(avg >= 90) {
			System.out.println("우수");
		} else if(avg < 60) {
			System.out.println("재시험");
		} else {
			System.out.println("보통");
		}
		//	[실행 예시]
		//	총점: 270  
		//	평균: 90.0  
		//	우수
	}

}
