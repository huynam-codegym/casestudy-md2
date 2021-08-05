import java.util.ArrayList;
import java.util.Scanner;

public class ManagerEmployee {
     Scanner scanner = new Scanner(System.in);
     ArrayList< Employee> list = new ArrayList<>();
//      int count = 0;


      public Employee creat(String type){
          String Name;
          while (true){
              System.out.println(" Enter name Employee");
              Name = scanner.nextLine();
              if (Name != "" ){
                  break;
              }
              else {
                  System.out.println(" Fill full information");
              }
          }
         Integer Age;
          while (true){
              try{
              System.out.println("Enter age Employee");
              Age = Integer.parseInt(scanner.nextLine());
              break;}
              catch (Exception e){
                  System.out.println(" Age must be number");
              }

          }
          String Gender;
          while (true){
              try{
                  System.out.println(" Enter age Employee: male/female");
                  Gender = scanner.nextLine();
                  if (RegexGenderStatus.validate(Gender)){
                      break;
                  }

              }catch (Exception e){
                  System.out.println("Only two genders accepted: male/female");
              }
          }

          String Status;
          while (true){
              try{
                  System.out.println("Enter status employee : true/false");
                  Status = scanner.nextLine();
                  if (RegexGenderStatus.validate(Status)){
                      break;
                  }
              } catch( Exception e){
                  System.out.println("Employee has only two status : true/false ");
              }
          }

          Double Salary;
          while(true){
              try{
              System.out.println(" Enter salary employee");
              Salary = Double.parseDouble(scanner.nextLine());
                  break;
          }
              catch (NumberFormatException e){
                  System.out.println(" Salary must be number");
              }
          }
          if (type.equals(" Employee Part - time")){
              System.out.println(" Enter timework of employee Part-time");
              double workTime = Double.parseDouble(scanner.nextLine());
              Employee employee = new EmployeePasstime(Name,Status,Age,Gender,Salary,workTime,);
              return employee;
          }
          else {
              Employee employee = new EmployeeFulltime(Name,Status,Age,Gender,Salary);
              return employee;
          }

      }
      public void delete(){
          System.out.println(" Enter name employee want delete");
          String Name = scanner.nextLine();
          for (int i = 0; i < list.size() ; i++) {
              if (list.get(i).getName().equals(Name)){
                  System.out.println(list.get(i).toString()+ "----" + " Are in location " + i);
              }
          }
          System.out.println("Enter location employee want delete");
          int index = Integer.parseInt(scanner.nextLine());
          Employee employee = list.get(index);
          if (employee.getName().equals(Name)){
              list.remove(employee);
          }
//          chưa ghi file
      }
      public void update(String Name){
          for (int i = 0; i < list.size() ; i++) {
              if (list.get(i).getName().equals(Name)){
                  System.out.println(list.get(i).toString()+ "----" + " Are in location " + i);
              }
          }
          System.out.println("Enter location employee want update");
          int index = Integer.parseInt(scanner.nextLine());
          Employee employee;
          if (list.get(index) instanceof EmployeePasstime){
              employee = creat("Part-time");
          }else {
              employee = creat("Full-time");

          }
          list.set(index,employee);
      }
      public void show(){
          for ( Employee show1: list) {
              System.out.println(show1);
              System.out.println("<---------------------->");
          }
      }
    public void Status() {
        System.out.println("Enter name employee want check status ");
        String name = scanner.nextLine();
        for (Employee bolean : list) {
            if (bolean.getName().equals(name)) {
                System.out.println(bolean.getStatus());
            }

        }
    }
    public void Search() {
        System.out.println("Enter name employee want search");
        String Name = scanner.nextLine();
        for (Employee employee : list) {
            if (employee.getName().contains(Name)) {
                System.out.println(" -----Employee your want search -----" + employee);
            }

        }
    }

    public void updateStatus (){
        System.out.println(" Your want update status employee? ");
        String name = scanner.nextLine();
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).getName().equals(name)){
                System.out.println(" change the status to ");
                list.get(i).setStatus(scanner.nextLine());
            }

        }
    }



}
