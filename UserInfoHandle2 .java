import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTextArea;


public class UserInfoHandle2 {
   private static File file= new File("UserInfo.txt");
    
   
   
   
   
   public static void searchOutputInTextarea(String toSearch,JTextArea area){
        area.setText("");
        BufferedReader br;
        FileReader fr;
                try{
        fr= new FileReader(file) ;
        br= new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
           if(line.contains(toSearch)) area.append(line);
            area.append("\n");
        }
        br.close();
        }
        catch(IOException e ){
            System.out.println("file not found ");
        }              
   } 
   
   
    public static void removeDuplicacy(){
        BufferedReader br;
        FileReader fr;
        FileWriter fw;
        BufferedWriter bw;
        Set<String> allInfo=new HashSet<>();
                try{
        fr= new FileReader(file) ;
        br= new BufferedReader(fr);
        String line;
        
        while((line=br.readLine())!=null){

            allInfo.add(line);
        }
        
        br.close();
        }
        catch(IOException e ){
            System.out.println("file not found ");
        }
        //rewrite
        try{
        fw= new FileWriter(file ) ;
        bw= new BufferedWriter(fw);
        for (String i : allInfo){
            bw.write(i);
            bw.newLine();
        }
        bw.close();
        }
        catch(IOException e){
            System.out.println("file not found");
        }
        
        
        
    }
   
   
   public static void deleteData(JTextArea deletArea){
       String deletUser= deletArea.getText();
        BufferedReader br;
        FileReader fr;
        FileWriter fw;
        BufferedWriter bw;
        ArrayList<String> allInfo=new ArrayList<>();
                try{
        fr= new FileReader(file) ;
        br= new BufferedReader(fr);
        String line;
        
        while((line=br.readLine())!=null){
            if(deletUser.contains(line)){
                continue;
            }
            allInfo.add(line);
        }
        
        br.close();
        }
        catch(IOException e ){
            System.out.println("file not found ");
        }
                
                //reWriting

        
        try{
        fw= new FileWriter(file ) ;
        bw= new BufferedWriter(fw);
        for (String i : allInfo){
            bw.write(i);
            bw.newLine();
        }
        bw.close();
        }
        catch(IOException e){
            System.out.println("file not found");
        }
       
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public static void readFile(){
        BufferedReader br;
        FileReader fr;
                try{
        fr= new FileReader(file) ;
        br= new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        }
        catch(IOException e ){
            System.out.println("file not found ");
        }
           
    }
     
   
   
   
   
   
   
   public static void readFileInTxtAera(JTextArea area){
        area.setText("");
        BufferedReader br;
        FileReader fr;
                try{
        fr= new FileReader(file) ;
        br= new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            area.append(line);
            area.append("\n");
        }
        br.close();
        }
        catch(IOException e ){
            System.out.println("file not found ");
        }
           
    }
    
    
    
    
    
    
    
    public static void appendFile(String toappend){
        FileWriter fw;
        BufferedWriter bw;
        String [] parts= toappend.split(",");
        try{
        fw= new FileWriter(file, true ) ;
        bw= new BufferedWriter(fw);
        for (String i : parts){
            bw.write(i);
            bw.newLine();
        }
        bw.close();
        }
        catch(IOException e){
            System.out.println("file not found");
        }
        
    }
    
    
    
    
    public static void sortUnser(){
        BufferedReader br;
        FileReader fr;
        FileWriter fw;
        BufferedWriter bw;
        ArrayList<String> allInfo=new ArrayList<>();
                try{
        fr= new FileReader(file) ;
        br= new BufferedReader(fr);
        String line;
        
        while((line=br.readLine())!=null){
            allInfo.add(line);
        }
        Collections.sort(allInfo);
        br.close();
        }
        catch(IOException e ){
            System.out.println("file not found ");
        }
                
                //reWriting

        
        try{
        fw= new FileWriter(file ) ;
        bw= new BufferedWriter(fw);
        for (String i : allInfo){
            bw.write(i);
            bw.newLine();
        }
        bw.close();
        }
        catch(IOException e){
            System.out.println("file not found");
        }


    }
    
    
    
    public static void appendInOneLine(String toappend){
        FileWriter fw;
        BufferedWriter bw;
        String [] parts= toappend.split(",");
        try{
        fw= new FileWriter(file, true ) ;
        bw= new BufferedWriter(fw);
        for (String i : parts){
            bw.write(i);
            bw.write(" ");
        }
        bw.newLine();
        bw.close();
        }
        catch(IOException e){
            System.out.println("file not found");
        }
        
    }
    
    
    public static void writeFile(String toappend){
        FileWriter fw;
        BufferedWriter bw;
        String [] parts= toappend.split(",");
        try{
        fw= new FileWriter(file ) ;
        bw= new BufferedWriter(fw);
        for (String i : parts){
            bw.write(i);
            bw.newLine();
        }
        bw.close();
        }
        catch(IOException e){
            System.out.println("file not found");
        }
        
    }
     
    
    
    public static void main(String[] args) {
//        appendInOneLine("str");
//        readFileInTxtAera(JTextArea area)
//        UnserInfoHandle.appendFile("456");
////       UnserInfoHandle.writeFile("123");
      // UserInfoHandle2.readFile();
       //sortUnser
        //searchOutputInTextarea
        //deleteData
                
    }
    
}
