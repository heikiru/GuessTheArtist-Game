import java.util.ArrayList;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {
    private ObjectInputStream input;
    public Deserializer() throws FileNotFoundException {
        try {
            input = new ObjectInputStream(new FileInputStream("guessTheArtist.ser"));
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            System.err.println("ERROR OPENING FILE: " + e.getMessage());
        }
    } 

    public ArrayList<String> readRecords() {
        Menu menu;

        ArrayList<String> list = new ArrayList<String>();
        try { 
            while (true){
                menu = (Menu) input.readObject();
                list.add(String.valueOf(menu.getScore()));
            }
        } catch (ClassNotFoundException e) {
            System.err.println("UNABLE TO CREATE OBJECT.");
            System.exit(1);
        } catch (EOFException e) {
            System.out.println("que");
        } catch (IOException e) {
            System.err.println("ERROR DURING READING FROM FILE: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("capitche?");
            return list;
    } 

    public void closeFile(){
        try {
            input.close();
        } catch ( IOException ioException )
        {
            System.err.println("ERROR CLOSING FILE.");
            System.exit(1);
        }
    }
} 