import java.util.HashMap;
public class Problems {

	/**
	 * @param args
	 */
	
	public static void perms(String s,String permu,HashMap<String,Boolean> H){
		if (s.length()==0){
			if (H.containsKey(permu)){
				
			}
			else{
			H.put(permu, true);	
			System.out.println(permu);
			}
		}
		else{
			for(int i=0;i<s.length();i++){
				String t=s.substring(0,i)+s.substring(i+1);
				perms(t,permu+s.substring(i,i+1),H);
			}
			
		}
	}
	public static boolean uniqueChar(String s){
		HashMap<String,Boolean> uniq= new HashMap<String,Boolean>();
		for(int i=0;i<s.length();i++){
			if (uniq.containsKey(s.substring(i,i+1))){
				return false;
			}
			else{
				uniq.put(s.substring(i,i+1),true);
			}
			}
		return true;
	}
	public static boolean stringPerm(String s,String t){
		HashMap<String,Integer> chars=new HashMap<String,Integer>();
		for(int i=0;i<s.length();i++){
			if (chars.containsKey(s.substring(i, i+1))){
				chars.put(s.substring(i,i+1), 1+chars.get(s.substring(i,i+1)));
				}
			else{
				chars.put(s.substring(i,i+1), 1);
				}
			}
		for(int i=0;i<t.length();i++){
			if (chars.containsKey(t.substring(i, i+1))){
				chars.put(t.substring(i,i+1), 1-chars.get(t.substring(i,i+1)));
				}
			else{
				chars.put(t.substring(i,i+1), 1);
				}
			}
		for (String m:chars.keySet()){
			if (chars.get(m)!=0){
				return false;
			}
		}
		return true;
		
	}
	public static String reverse(String s){
		char[] chars= s.toCharArray();
		for(int i=0;i<chars.length/2;i++){
			char c=chars[i];
			chars[i]=chars[chars.length-i-1];
			chars[chars.length-i-1]=c;
		}
		String t="";
		for(int i=0;i<chars.length;i++){
			t=t+chars[i];
		}
		return t;
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p=Problems.stringPerm("abc10000","cba1");
		System.out.println(Boolean.toString(p));
		System.out.println(Problems.reverse("sb"));
		HashMap<String,Boolean> H = new HashMap<String,Boolean>();
		perms("tree","",H);
		
		
	}

}
