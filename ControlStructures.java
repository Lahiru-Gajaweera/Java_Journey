public class ControlStructures {
 
    public static void main (String [] args) {

        //Control Structures --> if statement 
        boolean var1 = true;
        boolean var2 = false;
        
        //if Statement Normal Situation
        System.out.println();
        System.out.println("If-else Statement Normal - Output ");

        if (var1) {
            System.out.println("\t Yes");
        }else{
            System.out.println("\t No");
        }

        //Special Moment of if Statement
        System.out.println("Special Moment of if Statement - Output");

        if(var1)
            System.out.println("\t Yes");
            System.out.println("\t No");//This Will Be Executed,But This Line Is Not In If Block


        //if else Ladder
        System.out.println("If-else Ladder - Output");

        if (var1) {
            System.out.println("\t var1");
        }else if (var2) {
            System.out.println("\t var2");
        }else{
            System.out.println("\t Nothing");
        }

        //Control Structures --> for loop 
        System.out.println("for loop - Output");
        System.out.print("\t");

        for (int i = 0;i<=5;i++) {
            System.out.print(i + " ");
        }
  
/*      We Can Code Like This
    
        int i = 0;

        for (;i<=5;) {
            System.out.print(i + " ");
            i++;
        }  
 */ 
        //Control Structures --> while loop
        System.out.println();
        System.out.println("while loop - Output");
        System.out.print("\t");

        int x = 0;

        while (x<=10) {
            System.out.print(x + " ");
            x+=1;
        }

        //Control Structures --> do while loop
        System.out.println();
        System.out.println("do while loop - Output");
        System.out.print("\t");

        int y = 0;

        do{
            System.out.print(y + " ");
            y += 2; // Can Code Like This --> y = y+2;
            
        }while (y<=10);

    }
}