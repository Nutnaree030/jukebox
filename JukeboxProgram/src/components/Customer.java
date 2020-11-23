package components;


public class Customer{
    
    String[] name = new String[50];
    int i=0;
    public int addCustomer(String a){
        while(i<name.length){
            if(name[i]!=null){
                i++;
            }
            break;
        }
        name[i]=a;
        return i;
    }
    
}