package Resources;

import POJO.Data;
import POJO.Objects;

public class BodydataPrepare {
	static Objects obj= new Objects();;
	public static Objects ObjectBodydata() {
		
		obj.setName("Deepak_Ingale");
		Data d=new Data();
		d.setColor("Red");
		d.setPrice(400);
		d.setYear(2024);	
		obj.setData(d);
		
		return obj;
	}	
		public static Objects UpdatedBodydata() {
			obj.setName("Pradeep");
			return obj;
		}
		
		
	
}
