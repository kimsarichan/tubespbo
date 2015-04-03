import java.util.Scanner;
import.java.util.InputMismatchException

public class home
{
	Scanner input= new Scanner(System.in);
	public void login()
	{

		System.out.println("Log In menu");
		System.out.println("Username :"); String username=input.next();
		System.out.println("Password :"); String password=input.nextLine();
			//mengecek username dan password pada database network
			/*
				//membuat current account berdasarkan username dan password yang telah dibuat
				/*
				account current_account= new account();
				*/
			*/
		//System.out.println ("Id : "+ current_account().nama);
		System.out.println ("1. Messages");
		System.out.println ("2. Search");
		System.out.println ("3. Timeline");
		System.out.println ("4. Group");
		System.out.println ("5. Logout");

		System.out.println ("Pilih menu :");int menu= input.nextInt();
		switch(menu)
		{
			case 1:
				//view messages from friends
				//send messages
			break;
			case 2:
				//searchGroup
			//SearchFriendbyUsername
							//SearchFriendbyCity
							//SearchFriendbySchool
							//add/join group/friends

			break;
			case 3:
							//add status
							//like commet
							//view friends timeline
			break;
			case 4:
							//create  Group
							//show joined group
							//show group profile
							//Show group messages
							//send chat messages in group
							//invite group
							//addnote
			break;
			case 5:

			break;
		}					
	}
	public void registration()
	{
		//try{
			System.out.println("Registration");
			System.out.println("1. Username 		: "); String username=input.next();
			//cek username ganda
			//end cek username ganda
			System.out.println("2. Nama 			: "); String nama=input.nextLine();
			System.out.println("3. Email 			: "); String email=input.next();
			//cek email ganda
			//end cek email ganda

			//cek input email
				
			//end cek input email
			System.out.println("4. password 		: "); String password=input.nextLine();
			System.out.println("5. Re-type password	: "); String repassword=input.nextLine();
			//cek kesamaan password dan repassword
				if(password.equals(repassword))
					System.out.println("Ok");
				else
					throw new Exception("Password tidak sama");
			//end cek kesamaan password dan re password
			System.out.println("6. Gender(M/F) 		: "); Char gender=input.nextChar();
			if (gender != 'M' || gender !='F')
				throw new InputMismatchException ("Input harus Char M(Male) atau F (Female)");
			System.out.println("7. Birthdate(dd-MM-yyyy): "); String birth_date=input.nextLine();
			//cek birthdate
				String birth_date_part[]=birth_date.split("-");
				int day=Integer.parseInt.birth_date_part[0];
				int month=Integer.parseInt.birth_date_part[1];
				int year=Integer.parseInt.birth_date_part[2];
				if(month<1 || month >12 || day<1||day >31)
					throw new Exception ("Tanggal lahir tidak valid");
				int sumday[]=new int{0,31,28,31,30,31,30,31,31,30,31,30,31};
				int daylimit=jumhari[month];
				if (month==2)
				{
					if(year % 4=0)
						batastanggal=29;
				}
				if(day>daylimit)
					throw new Exception("Tanggal lahir tidak valid");
			//end cek birthdate
		//} catch(){;}
			// Sending verification ke email
			/**/	
			//Save into database network
			/**/
			//back to menu awal
			/**/

	}
	public void home()
	{
		
		System.out.println("Welcome to FriendsBook");
		System.out.println("1. Log in to Friendsbook");
		System.out.println("2. Sign Up now !!");

		System.out.println("Pilih menu awal :");
		int main_menu= input.nextInt();
		switch (main_menu)
		{
			case 1:
				login();
			break;

			case 2:
				registration();
			break;
		}	
	}
	


}