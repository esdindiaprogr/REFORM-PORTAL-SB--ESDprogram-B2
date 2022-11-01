
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class AngelData extends Object {
	
	
	private String Name;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long A_Id;
	private String Area_of_Interest;
	private String Contacts;
   
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public long getA_Id() {
		return A_Id;
	}
	
	public void setA_Id(long a_Id) {
		A_Id = a_Id;
	}
	
	public String getArea_of_Interest() {
		return Area_of_Interest;
	}
	
	public void setArea_of_Interest(String area_of_Interest) {
		Area_of_Interest = area_of_Interest;
	}
	
	public String getContacts() {
		return Contacts;
	}
	
	public void setContacts(String contacts) {
		Contacts = contacts;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public long getU_Id() {
		return U_Id;
	}
	
	public void setU_Id(long u_Id) {
		U_Id = u_Id;
	}
	
	private String Address;
	private long U_Id;
	
	
	public AngelData(String Name,String Area_of_Interest,String Address) {
		this.Name=Name;
		
		this.Area_of_Interest=Area_of_Interest;
		this.Address=Address;
	}
		
		
		@Override
		public String toString() {
			return "AngelData [A_Id=" + A_Id + ",Name=" + Name +  ",Area_of_Interest =" + Area_of_Interest
					+ ", Address=" + Address + "]";
		}
	
	
}
