
package giabao1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class kiemtrasonguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        int x =scanner.nextInt();
        if (x>0){
            System.out.println("Postive");
        }else if (x<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}

