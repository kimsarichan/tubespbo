import java.text.SimpleDateFormat;
import java.util.Date;
class acount extends profile {
	private  acount friend[]=new acount[100]; 
	private  message pesan[]=new message[100];
	private  status stat[]=new status[100];
	private  int numberoffriend;
	private  int numberofgroup;
	private  int numberofpesan;
	private  int numberofstatus;
	private  String notification;
	public 	acount(String nama , String job , String gender , String username , String password , String securityanswer , String securityquestion , String tanggal ){
		super( nama ,  job ,  gender ,  username , password , securityanswer , securityquestion , tanggal );
	}
	public void addfriend(acount f){
			friend[numberoffriend]=f;
			numberoffriend=numberoffriend+1;
	}
	public acount searchfriend(String nama) throws Exception{
		int i=0;
		acount a= null;
		boolean ketemu=false;
		while(i<numberoffriend && ketemu == false){
			if (friend[i].nama.equals(nama)) {
				a= friend[i];
				ketemu=true;
			}
			i++;
		}
		if (ketemu == true ) {
			return a;
		}
		else{
			throw new notfoundexception("teman tidak ditemukan");
		}
		
	}
	public void sendmessage( message m){
		pesan[numberofpesan]=m;
		numberofpesan=numberofpesan+1;
	}
	public void addstatus(status s){
		stat[numberofstatus]=s;
		numberofstatus=numberofstatus;
	}
	public String getnotification(){
		return  notification;
	}

	public static void main(String[] args) {
		try{
			acount a= new acount("sa", "jobs" ,"p", "sarichantik" , "1235","adres" , "adres" , "20/02/1995");
			acount b= neimport java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class profile  {
	SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
	protected String nama;
	protected String job;
	protected school sekolah[]=new school[5] ;
	protected int nsekolah;
	protected String gender;
	public adress alamat;
	public  String username;
	private String password;
	protected String securityquestion;
	protected String securityanswer;
	protected Date tgl;
	public profile(String nama , String job , String gender , String username , String password , String securityanswer , String securityquestion , String tanggal ){
		try { 
			this.nama=nama;
			this.gender=gender;
			this.job=job;
			this.username=username;
			this.password=password;
			this.securityanswer=securityanswer;
			this.securityquestion=securityquestion;
			tgl = format.parse(tanggal);
		}
		catch (ParseException e) {
			System.out.println("salah format tanggal "); 
		}

	}
	public void addschool(String schoolname, int yearattended){
		sekolah[nsekolah]= new school(schoolname,yearattended);
		nsekolah=nsekolah+1;
	}
	public void changepass(String p){
		password=p;
	}
	public void forgetpass(String securityans){
		Scanner s= new Scanner(System.in);
		System.out.println("jawab pertanyaan dibawah ini ");
		System.out.println(s.next());
		if (securityans.equals(securityanswer)) {
			System.out.println("tulis password baru ");
			changepass(s.next());
		}
		else {
			System.out.println("jawaban anda salah");
		}
	}

}w acount("sari", "jobs" ,"p", "sarichantik" , "1235","adres" , "adres" , "20/02/1995");
			acount c= new acount("ada", "jobs" ,"p", "sarichantik" , "1235","adres" , "adres" , "20/02/1995");
			a.addfriend(b);		
			a.addfriend(c);
			System.out.println(a.searchfriend("ada").nama);
			System.out.println(a.searchfriend("yusril").nama); 

			message m=new message()
		}
		catch (ParseException e) {
			System.out.println("salah format tanggal "); 
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}