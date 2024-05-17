package LeetCode75;

public class Day84_1108_DefanginganIPAddress {

	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1.1"));		
	}
	public static String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            sb.append("[.]");
            else
            sb.append(address.charAt(i));
        }
        return sb.toString();
    }
}
