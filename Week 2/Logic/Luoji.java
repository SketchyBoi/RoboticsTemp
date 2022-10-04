import java.util.*;
public class Luoji {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tea = scan.nextInt();
        int candy = scan.nextInt();
        if (candy < 5 || tea < 5)
        {
            System.out.println(0);
        }
        else if (candy >= tea *2 || tea >= candy *2)
        {
            System.out.println(2);
        }
        else if (candy >= 5 && tea >= 5)
        {
            System.out.println(1);
        }
    }
}
