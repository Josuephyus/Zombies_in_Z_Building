package src;

public class Main {

    static Window window;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){public void run(){
            window = new Window("Zombies in Z Building!");
        }});
    }
}