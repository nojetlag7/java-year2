import java.io.*;

public class FileHandles{
    public static void main(String[] args){

        //make sure you create the file before trying to run it
        // imports to use: java.io.*
        //creating a file
        
        try {
            File file = new File("newfile.txt"); //gets saved to the working directory the program is in
            
            //File file = new File(<absolute path you wish file to be created to or accessed from>)

            if(file.createNewFile()){
                System.out.println("FIle created: " + file.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
         

         //writing to a file (that exists)
         
         try{
            //creating the file first,
            File file = new File("Writing.txt");
            FileWriter writer = new FileWriter(file.getName(),true); 
            //the boolean as the second argument tells the compiler to append text and not overwrite the file

            if(file.createNewFile()){
                System.out.println("File was created. Name: " + file.getName());
            }
            else{
                System.out.println("FIle already exists");
            }
            
            writer.write("Additional line of text added to file.");
            writer.write("Last line for the file.");
            writer.close();
            System.out.println("Sucessfully wrote to the file.");
        }
         catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
         

          

        //reading from a file that exists

        // try {
        //     File file = new File("Writing.txt");
        //     Scanner input = new Scanner(file);

        //     while(input.hasNextLine()){
        //         String line = input.nextLine();
        //         System.out.println(line);
        //     }
        //     input.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

    }
}

