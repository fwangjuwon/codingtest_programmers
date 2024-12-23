package study;

public class TranslateForm {
    public static void main(String[] args) {
        String a = "12345";
        Integer b = Integer.parseInt(a);
        Integer c = Integer.valueOf(a);
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());

        int d = 12345;
        String e = Integer.toString(d);
        String f = String.valueOf(d);
        String g = d + "";
        System.err.println(e.getClass().getName());
        System.out.println(f.getClass().getName());
        System.out.println(g.getClass().getName());
    }
}
