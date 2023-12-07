package logic;

public class CWR_DuplicateCharcter {
	
	public static void main(String[] args) {
		String name="banannatime";
		String name1=name.replaceAll(" ", "");
		int l=name1.length();
		char c[]=name1.toCharArray();
		
		for(int i=0; i<l; i++) {
			for(int j=i+1; j<l; j++) {
				if(c[i]==c[j]) {
					System.out.println("Duplicate charcters are "+c[j]);
					break;
				}
				
			}
		}
		
	
	}

}
