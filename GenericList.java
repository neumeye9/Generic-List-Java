import java.util.*;

class GenericList{
    public static void main(String[] args){

        List myList = new ArrayList();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        System.out.println(myList);

        try{
            for(int i = 0; i < myList.size(); i ++){
                int castedValue = (int) myList.get(i);
                System.out.println("Casting Successful");
            }
        } catch(RuntimeException e){
            System.out.println("Casting Successful, converted string to integer");
            }
        }
    }