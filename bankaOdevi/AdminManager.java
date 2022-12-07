package bankaOdevi;

public class AdminManager //extends Account
{
	//Account ac = new Account();
	//UserManager um = new UserManager();
	public void krediBasrusunuOnayla(Account account)
	{
		//um.flag=true;
		if(account.krediBasvurusu == true)
		{
			System.out.println("kredi başvurunuz onaylandı");
			account.setBakiye(account.getIstenenKredi()+account.getBakiye());
		}
		else if(account.krediBasvurusu == false)
		{
			System.out.println("Kredi başvurunuz bulunmamaktadır");
		}
	}
	public void krediBasrusunuReddet(Account account)
	{
		//um.flag=false;
		if(account.krediBasvurusu == true)
		{
			System.out.println("kredi başvurunuz onaylanmadı");
			account.setIstenenKredi(0);
		}
		else if(account.krediBasvurusu == false)
		{
			System.out.println("krediniz başvurunuz bulunmamaktadır");
		}
	}
}
