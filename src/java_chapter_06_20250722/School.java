package java_chapter_06_20250722;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String a = "Kor";
//		String b = "Kor"; // a 와 b가 똑같은 메모리를 향함
//		String str = new String("Kor"); // 메모리를 새로 만듬

		
		// 필드
		Student stu1 = new Student(); // 메모리에 stu1이라는 객체 생성
		stu1.name = "홍길동";
		stu1.hakbun = "202507544";
		stu1.age = 22;
		stu1.phone = "010-1234-5555";
		stu1.address = "서울시 종로구";
		stu1.schoolName = "중정고등학교"; // 중앙고등학교에 다녔지만, 중정고등학교로 전학감.
		stu1.scores[0] = 90;
		stu1.outputName();
		
		
		Student stu2 = new Student();
		stu2.name = "김유신";
		stu2.hakbun = "202507547";
		stu2.age = 21;
		stu2.phone = "010-1234-8888";
		stu2.address = "서울시 강남구";
		stu2.outputName();
		
	}
	// instance = 메모리에 저장된 것
}
