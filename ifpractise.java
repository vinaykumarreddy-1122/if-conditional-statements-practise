public class ifpractise {
    public static void main(String[] args) {
        //if condition1 ==============
         int i=10;    // if condition  is false
        if(i<0) {   
            System.out.println("This executes if con is true");
        }   
         int a=-10;
        if(a<0) {   // if condition is true
            System.out.println("This executes if condition is true");
        } 
         //if else condition2 ============
         int d =10;
        if(d<0) { //the if condition is false so goes to else 
            System.out.println("This executes if con is true");
        }
        else{
            System.out.println("this is else conditon OP. if cnd is false");
        }  //==============================================
         int j =10;
        if(j>9) {  // if cnd is true so dont goes to else cnd
            System.out.println("This executes if cnd is true");
        }
        else {
            System.out.println("this is else condition OP. if cnd is false");
        } 
         
          String name = "vinay";   //if string condition
        if (name == "vinay") {
            System.out.println("this is correct string cnd");
        } 
                //if condition ==============
          int k=10;               //if int condition
        if(k<0) {
            System.out.println("the number is positive");
        }
        else {
            System.out.println("the number is negative");
        } 
        //if else if 3. =============
          String namea = "vinay";
          if (namea == "om") {
            System.out.println(" name1 is correct");
          }
            else if (namea == "jai") {
                System.out.println(" name2 is correct");
            }
            else if (namea == "sai"){
                System.out.println("name3 is correct");
            }
            else {
                System.out.println("above name is not correct");
            } 
         //nested if else statement 4.============ not known
           int n1=10, n2=12, n3= 14, largest;
            if(n1 >= n2) {
                if (n1 >= n3) {
                    largest = n3;
                }
                else {
                    largest = n3;
                }
            } else{
                largest = n3;
            }
            System.out.println("Largest Number:" + largest); 
    }
} //END
