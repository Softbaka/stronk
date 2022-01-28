
package studlist;

import java.util.Scanner;

/**
 *
 * @author Preetinder Singh CHANGEY MOO
 */
public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] sList=new Student[3];//declare an array of objects
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<sList.length;i++)
        {
            sList[i]=new Student();//create objects for each index
            System.out.println("Enter Student name: ");
            sList[i].setName(input.nextLine());
            
       }
        for (int i = 0; i < sList.length; i++) {
        System.out.println("Student name: "+sList[i].getName());
            
        }
    }

}
