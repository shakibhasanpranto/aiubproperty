public class MyString {
    public static void main(String[] args) {
        // String s = "Bangladesh";
        // int len = s.length();
        // System.out.println(len);

        // System.out.println(s.charAt(7));
        // String b = "C";
        // if(s.equals(b)) {
        //     System.out.println("Same");
        // }else {
        //     System.out.println("Diff");
        // }
        // System.out.println(s.equals(b));

        // System.out.println(s.compareTo(b));
        // System.out.println(s.indexOf('a'));
        // System.out.println(s.indexOf('b'));
        // System.out.println(s.substring(3, 7));

        // System.out.println(s.toUpperCase());
        // System.out.println(s.toLowerCase());

        String a = "hello";
        String b = "hello";
        if(a == b) {
            System.out.println("Same");
        }else {
            System.out.println("Diff");
        }

        String c = new String("hello");
        String d = new String("hello");
        if(c == d) {
            System.out.println("Same");
        }else {
            System.out.println("Diff");
        }
    }
}