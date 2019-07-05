import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serializer {
    
    private ObjectOutputStream output;

    public Serializer() {
        try {
            output = new ObjectOutputStream(new FileOutputStream("guessTheArtist.ser"));
        } catch (IOException ioe){
            System.err.println("ERROR OPENING FILE.");
        }   
    }

    void addRecord(Menu menu) {
        try {
            output.writeObject(String.valueOf(menu.getPoints()));
        } catch (IOException ioe) {
            System.err.println("ERROR WRITING TO FILE.");
            return;
        }
    }

    void closeFile(){
        try {
            output.close();
        } catch (IOException ioe) {
            System.err.println("ERROR CLOSING FILE.");
            System.exit(1);
        }
    }
}