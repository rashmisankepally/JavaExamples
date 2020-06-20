package CollectionsAndString;

/*
Write multiple String, StringBuffer and String Builder operations,
at least 10 methods of String and 5 methods each of StringBuilder and StringBuffer.
 */

public class StringExample {

    public static void main(String args[]){
        String s = "I love Java ";
        System.out.println(s.charAt(5));
        System.out.println(s.compareTo("abc"));
        System.out.println(s.substring(3,10));
        System.out.println(s.concat("and that\'s really true"));
        System.out.println(s.trim());
        System.out.println(s.length());
        System.out.println(s.split(" "));
        System.out.println(s=="I love Java ");
        System.out.println(s.compareTo("I love Java "));
        System.out.println(s.toLowerCase());

        StringBuilder sb = new StringBuilder("I love Java ");
        System.out.println(sb.reverse());
        System.out.println(sb.hashCode());
        System.out.println(sb.append('K'));
        System.out.println(sb.append("and that\'s really true"));
        System.out.println(sb.delete(2, 6));

        StringBuffer sbf = new StringBuffer("I love Java");
        System.out.println(sbf.reverse());
        System.out.println(sbf.hashCode());
        System.out.println(sbf.append('K'));
        System.out.println(sbf.append("and that\'s really true"));
        System.out.println(sbf.delete(2, 6));

    }


}
