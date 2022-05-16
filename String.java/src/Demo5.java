/*
 * Divide a string into even parts
 */

import java.util.*;
public class Demo5 {

	
	public static void main(String[] args) {
		int i;
		
		StringBuffer sb = new StringBuffer("Royal Technosoft Pvt Ltd is the best coaching center for computer courses");
	
		for(i=0;i<sb.length();i=i+2) {
			sb.substring(i,i+1);
			System.out.println(sb);
			}	
	
	}
	
}//demo
