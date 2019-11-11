import java.util.*;

public class Database{

   ArrayList<Object> data = new ArrayList<Object>();
   
   
   
   
   
   ArrayList getArrayList(){
   
      return data;
   }
   
   
   
   void createData(Object obj){
      data.add(obj);
   }
   
   
   void removeData(int id){
      for (int i = 0; i < data.size(); i++){
         if (data.get(i) instanceof Member){
            if (((Member) (data.get(i))).getId() == id){
               data.remove(i);
            }
         }
      }
         
   }
   
   
   

}