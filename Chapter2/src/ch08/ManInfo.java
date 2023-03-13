package ch08;

public class ManInfo {
	public String height;
	public String weight;
	public String name;
	public String age;
	
	public ManInfo(String height, String weight ,String name , String age) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	
	public String showManInfo() {
		return "키 :" +height+" 몸무게 : "+weight+ " 이름 : "+name+ " 나이 :" +age;
	}
}
