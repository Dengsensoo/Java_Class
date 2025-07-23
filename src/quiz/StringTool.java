package quiz;
//2. 문자열을 입력하면 입력한 문자열의 길이 값을 출력하는
//printLength 메서드를 가지고 있는 StringTool 클래스를 만드시오.(메소드만 있으면 됨)
//ex) Korea -> 5
public class StringTool {
	
	String string;
	int length;
	
	public StringTool() {
		
	}
	
	public StringTool(String string, int length) {
		this.string = string;
		this.length = length;
	}
	
	public int printLength() {
		return length;
	}
	
}
