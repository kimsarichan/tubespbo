import java.util.Scanner;

public class home
{
	public void home(){

		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to FriendsBook");
		System.out.println("1. Log in to Friendsbook");
		System.out.println("2. Sign Up now !!");

		System.out.println("Pilih menu awal :");
		int main_menu= input.nextInt();
		switch (main_menu)
		{
			case 1:
			System.out.println("Log In menu");
			System.out.println("Username :"); String username=input.next();
			System.out.println("Password :"); String password=input.nextLine();
			//mengecek username dan password pada database network
			/**/
			//membuat current account berdasarkan username dan password yang telah dibuat
			/*
				account current_account= new account();
			*/
				System.out.println ("Id : "+ current_account.().nama);
				System.out.println ("1. Messages");
				System.out.println ("2. Search");
				System.out.println ("3. Timeline");
				System.out.println ("4. Group");
				System.out.println ("5. Logout");

				System.out.println ("Pilih menu :"); menu= input.nextInt();
				switch(menu)
				{
					case 1:
						//view messages
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
			break;

			case 2:
			System.out.println("Registration");
			System.out.println("1. Username 		: "); String username=input.nextLine();
			System.out.println("2. Nama 			: "); String nama=input.nextLine();
			System.out.println("3. Email 			: "); String email=input.nextLine();
			System.out.println("4. password 		: "); String password=input.nextLine();
			System.out.println("5. Gender(M/F) 		: "); Char gender=input.nextChar();
			System.out.println("6. Birthdate(dd-MM-yyy)	: "); String birth_date=input.nextLine();
		
			// Sending verification ke email
			/**/	
			//Save into database network
			/*
				//cek username atau email ganda
			*/
			//back to menu awal
			/**/

			break;
		}	
	}
	


}