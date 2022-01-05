import java.util.*;

class  displayList{
    public static void main(String args[]){  
        Vector<String> check=new Vector<String>();  
        check.add("Gawsan");
        check.add("Kannu");
        check.add("Akash");
       
        Iterator <String> itr=check.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        } 

}
}