import java.text.SimpleDateFormat;
import java.util.Date;
class group  {
	private acount member[]= new acount[100];
	private acount admin;
	private message pesan[]=new message[100];
	private note notes[]=new note[100];
	private int numberofpesan ;
	private int numberofnotes;
	private int numberofmember;
	private String nama ; 
	private String description;
	private Date tglberdiri ;
	public group(acount admin , String nama , String description , Date tglberdiri ){
		this.admin=admin;
		this.nama=nama;
		this.description=description;
		this.tglberdiri=tglberdiri;
	}
	public void sendmessage(message m){
		for (i=0; i<numberofmember;i++ ) {
			member[i].sendmessage(m);
		}
	};
	public void sendnote(note n){
		notes[numberofnotes]=n;
		numberofnotes=numberofnotes+1;
	};
	public void addmember(acount m){
		member[numberofmember]= m;
		numberofmember=numberofmember+1;
	}
}