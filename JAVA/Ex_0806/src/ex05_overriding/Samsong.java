package ex05_overriding;

public class Samsong extends Computer{
	
	//오버라이드          오버로드
	//재정의	           중복정의
	
	
	@Override
	void PowerOn() {
		//같은메서드이지만 자식클래스의 상황에 맞게 재정의 하는것
		System.out.println("아이 러브 샘송");
//		super.PowerOn();
	}
	
}
