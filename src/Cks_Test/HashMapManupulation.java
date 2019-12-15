package Cks_Test;

import java.util.HashMap;

public class HashMapManupulation {

	public static void main(String[] args) {
		
		System.out.println(getUsername("customer"));
		System.out.println(getPassword("customer"));
		

	}
	public static HashMap<String,String> getCredential() {
		HashMap<String,String> storeMap=new HashMap<String,String>();
		storeMap.put("customer", "cksingh:cks1233");
		storeMap.put("admin", "admin:admin1233");
		storeMap.put("account", "account:account1233");
		storeMap.put("finance", "finance:finance1233");
		
		return storeMap;
	}
	public static String getUsername(String role) {
		String credential=getCredential().get(role);
		return credential.split(":")[0];
		
	}
	public static String getPassword(String role) {
		String credential=getCredential().get(role);
		return credential.split(":")[1];
		
	}

}
