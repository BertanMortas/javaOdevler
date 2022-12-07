package bankaOdevi;

public class Test {

	public static void main(String[] args) {
		
		Account ac1 = new Account();
		AccountManager acmg = new AccountManager();
		User user1 = new User("Bertan", "Mortas", ac1);
		UserManager usmg = new UserManager();
		AdminManager admg = new AdminManager();
		
		System.out.println("======================");
		
		acmg.paraYatır(ac1, 500);
		acmg.paraYatır(ac1, 2000);
		acmg.paraCek(ac1, 1000);
		acmg.hesapBilgileriniGoster(ac1);
		
		System.out.println("======================");
		
		usmg.otomatikEmailOlustur(user1);
		usmg.bilgileriGoster(user1);
		usmg.krediBasvurusundaBulun(ac1, 10000);
		admg.krediBasrusunuOnayla(ac1);
		//admg.krediBasrusunuReddet(ac1);    
		
		System.out.println("======================");
		
		acmg.hesapBilgileriniGoster(ac1);
		
		System.out.println("======================");
		
		usmg.krediKartiBorcuOde(ac1, 1000);
		usmg.krediKartiBorcuOde(ac1, 1000);
		usmg.krediKartiBorcuOde(ac1, 1000);
		usmg.krediKartiBorcuOde(ac1, 1000);
		usmg.bilgileriGoster(user1);
		
		System.out.println("======================");
		
		
		
		

	}

}
