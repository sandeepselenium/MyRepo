
public class Test_Inheritance {

	public static void main(String[] args) {
		MobilePhone mob = new MobilePhone();
		
		mob.call();      //Phone class
		mob.voiceMail();  // phone class
		mob.roamFree();
		
		Phone p = new Phone();
		p.call();
		p.voiceMail();
		
		SmartPhone sm = new SmartPhone();
		sm.call();
		sm.voiceMail();
		sm.roamFree();
		sm.chatInternet();
		
		

	}

}
