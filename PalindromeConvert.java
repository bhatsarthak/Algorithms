
public class PalindromeConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeConvert obj=new PalindromeConvert();
		String str1="nitin";
		int len=str1.length();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i< str1.length();i++){
			StringBuffer temp=new StringBuffer();
			temp.append(sb);
			temp.append(str1);
			if(obj.CheckifPalindrome(temp.toString())){
				System.out.println(temp);
				break;
			}
			sb.append(str1.charAt(len-1-i));
		}
	}
	boolean CheckifPalindrome(String str){
		StringBuilder obj=new StringBuilder(str);
		obj.reverse();
		if(obj.toString().equals(str)){
			return true;
		}
		return false;
	}

}
