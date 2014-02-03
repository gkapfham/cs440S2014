import java.io.File;

public class Traversal {

    public static void main (String args[]) {
        displayIt(new File(args[0]));
    }

    public static void displayIt(File node) {
        System.out.println(node.getAbsoluteFile());
        System.out.println(node.length());
        if(node.isDirectory()) {
            String[] subNote = node.list();
            for(String filename : subNote){
                displayIt(new File(node, filename));
            }
        }
    }
}
