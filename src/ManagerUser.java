import java.util.ArrayList;
import java.util.Scanner;

public class ManagerUser {
    static ArrayList<User> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static User nam;
     public static User getnam(){
         return getnam();
     }
     public static void Menu(){
         while(true){
             System.out.println("1: Log in to your Account");
             System.out.println("2: Sign up for an Account");
             System.out.println("3: Exit");
             int choice = 0;
             try{
                 choice = Integer.parseInt(scanner.nextLine());
             }
             catch (Exception e) {
                 System.out.println("Retype");
             }
             switch (choice){
                 case 1:
                     login();
                     break;
                 case 2:
                     singUp();
                     break;
                 case 3:
                     System.exit(0);
             }
         }
     }
     private static void login(){
         System.out.println("Enter userName");
         String userName = scanner.nextLine();
         System.out.println("Enter passWord");
         String passWork = scanner.nextLine();

         for (User menuUser: list) {
             if (menuUser.getUserName().equalsIgnoreCase(userName)
                 && menuUser.getPassword().equalsIgnoreCase(passWork)){
                 System.out.println("   Welcome to your  "  + userName);
                 nam = menuUser;

//                 gọi menu chính khi đăng  nhập đúng (chưa làm)
                 return;
             }
             
         }
         System.out.println("Incorrect account or password information");
         System.out.println("You Please return to the position of regular Employee");
//         goi 1 menu phụ ra hiển thị chưa làm menu

     }

     private static void singUp(){
         System.out.println("Enter userName registration");
         String name = scanner.nextLine();
         System.out.println("Enter password registration");
         String pass = scanner.nextLine();


         for (User menuUser: list) {
             if( menuUser.getUserName().equalsIgnoreCase(name)){
                 System.out.println("Account already exists");
                 return;
             }
         }
         System.out.println("Account successfully created");
         list.add(new User(name, pass));

         login();
     }
}
