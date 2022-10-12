
public class Me {
    String name;
    int age;
    Me(String n, int a)
    {
        this.age = a;
        this.name = n;
    }
    public String myname()
    {
        return name;
    }
    public int myage()
    {
        return age;
    }

    public static void main(String[] args) {
        Me mystuff = new Me("Raymond", 16);
        System.out.println(mystuff.myage());
        System.out.println(mystuff.myname());
    }
}
