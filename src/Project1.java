import java.util.*;
class Project1{
    int empl(int n){
        switch(n){
            case 1001:
                return 0;
            // break;

            case 1002:
                return 1;
            // break;

            case 1003:
                return 2;
            // break;

            case 1004:
                return 3;
            // break;

            case 1005:
                return 4;
            // break;

            case 1006:
                return 5;
            // break;

            case 1007:
                return 6;
            // break;

            default:
                return -1;
            // break;

        }
    }
    public static void main(String args[]){
        Project1 obj=new Project1();

        String employee[][]={{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
                {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
                {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
                {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
                {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
                {"1006","Suman","01/01/2000","e","Manufacturing","23000","9000","4400"},
                {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}
        };

        System.out.println("Enter Employee number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ind=obj.empl(n);

        int da=0,salary=0;

        if(ind==-1){
            System.out.println("There is no emplyee with empid: "+n);
            System.exit(0);
        }

        else{
            int basic=Integer.parseInt(employee[ind][5]);
            int hra=Integer.parseInt(employee[ind][6]);
            int it=Integer.parseInt(employee[ind][7]);
            char dc=employee[ind][3].charAt(0);

            switch(dc){
                case 'e':
                    da=20000;
                    break;

                case 'c':
                    da=32000;
                    break;

                case 'k':
                    da=12000;
                    break;

                case 'r':
                    da=15000;
                    break;

                case 'm':
                    da=40000;
                    break;

                default:
                    da=0;
                    break;
            }

            salary=basic+hra+da-it;

            System.out.println("Emp No. "+employee[ind][0]);
            System.out.println("Emp Name: "+employee[ind][1]);
            System.out.println("Department: "+employee[ind][4]);
            System.out.println("Designation: "+employee[ind][3]);
            System.out.println("Salary: "+salary);
        }
    }
}