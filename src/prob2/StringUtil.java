package prob2;

public class StringUtil {
    public static String concatenate( String[] str ){
        return str[0].concat(str[1]).concat(str[2]);
    	
    }

    public static void main(String args[])  {         
        String[] strArr = { "SuperMan", "BatMan", "SpiderMan" };
        String resultStr = concatenate( strArr );
        System.out.println( "결과 문자열 : " + resultStr ); 
    }
}

