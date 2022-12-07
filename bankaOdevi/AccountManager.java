package bankaOdevi;

public class AccountManager // extends Account
{
	//Account ac = new Account();
	// üsttekinin yerine 	public Account ac; 	olur muydu sor.
	
	public double paraYatır(Account account,double miktar) {
		
		// get set metodları kontrol et
		// çalışıyor
		
		if(miktar<10000)
		{
			account.setBakiye(account.bakiye+miktar);
			System.out.println("yatırılan miktar "+miktar+" güncel bakiyeniz "+account.getBakiye());
		}
		else
		{
			System.out.println("yatırdığınız miktar 10.000 TL nin altında olmalıdır");
		}

		return account.getBakiye();
	}
	
	public double paraCek(Account account,double miktar) {
		
		if(miktar<account.getBakiye())
		{
			account.setBakiye(account.getBakiye()-miktar);
			System.out.println("çekilen miktar "+miktar+" güncel bakiyeniz "+account.getBakiye());
		}
		else
		{
			System.out.println("Bakiyeniz yetersiz");
		}

		return account.getBakiye();

	}
	
	public void hesapBilgileriniGoster(Account account) {

		System.out.println("hesap no: " + account.hesapNo+" bakiyeniz: "+account.getBakiye());
		
	}
	

}
