public class concatenate {
    public static void main(String args[]) {
        concatenate Obj = new concatenate();
        Obj.consum(5 + "" + 6);
        Obj.consum("Ruby" + " " + "John");
    }

    void consum(int a) {
        System.out.println("Concated number:" + a);
    }

    void consum(String a) {
        System.out.println("Concated String=" + a);
    }
}