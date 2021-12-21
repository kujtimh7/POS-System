/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

/**
 *
 * @author KennyHakaj
 */
import java.util.Arrays;

public class register {
    static int ticketCounter;
    static String[] order = new String[100];
    static int[] tables = new int[100];
    static String[] oTables = new String[100];
    public static char[] oTypes= new char[100];
    int ticketNum;
    char orderType;
    static int cashCollected,onlineCash;
    
    
    
    
   

    public register(){}
    
    public register(char a){
        
    ticketCounter++;
    ticketNum=ticketCounter;
    orderType=a;
    oTypes[ticketCounter-1]=orderType;
    
    }
    
    public void addMoney( int total){
    
       cashCollected+=total;
      
    
    }
    
    public void addMoneyOnline( int total){
    
       onlineCash+=total;
      
    
    }
    
    public int money(){
    return cashCollected+onlineCash;
    }
    
     public int returnCash(){
    return cashCollected;
    }
     
      public int returnOnline(){
    return onlineCash;
    }
     
    
    public void refund(int refund){
    
        cashCollected-=refund;
        
        
        
    }
    
    
    
    public int ticketNum(){
    return ticketNum;
    }
    
    public int ticketCounter(){
    return ticketCounter;
    }
    
    public void addTable(int x, String y){
        
        
        for(int i=0;i<tables.length;i++){
        
        if(tables[i]==0){ 
        tables[i]=x;
        oTables[i]=y;
        break;
        }
            
        }
        
    }
    
    public int[] takenTables(){
    
        int[] takenTables = new int[100];
        int tCount=0;
        
        for(int i=0;i<tables.length;i++){
        
        if(tables[i]!=0){  
            
        takenTables[tCount]=tables[i];
        
        
        tCount++;}
            
        }
    
        return takenTables;
        
    }
   
    
    
    public boolean checkAvailible(int x){
    
        for(int i=0;i<tables.length;i++){
        
        if(tables[i]==x)  return false;
            
        }
        
        return true;
    }
    
    public void removeTable(int x){
    
        for(int i=0;i<tables.length;i++){
        
        if(tables[i]==x){ tables[i]=0; return;}
            
        }
        
    }
    
    public void saveOrder(String x){
        
        
        order[ticketNum-1]=x;
        
    } 
    
    public void clear(){
       
        Arrays.fill(order,"");
        ticketCounter=0;
        Arrays.fill(tables,0);
        Arrays.fill(oTypes,(char)0);
        cashCollected=0;
        onlineCash=0;

    }
    
    public String getOrder(int tick){
        
        String a = order[tick-1];
        
        if(a != null){
    return a;
        }
        
        return "Ticket Not Found";
    
    }
    
    public char[] getOrderTypes(){
    
    return oTypes;
    
    }
    
    public String getTableOrder(int table){
        
        for(int i=0;i<tables.length;i++){
            
            if(tables[i]==table) return oTables[i];
            
        }
        
        return "Not Found";
    }
    
    public void updateTicket(int x, String a){
    
    order[x-1]=a;
    
    }
    
    
    
}
