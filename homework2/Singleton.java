package homework2;

//github.com/medpaf

public class Singleton {
    private Singleton(){
        System.out.println("Singleton initialize only once");
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if ( instance == null)
            instance = new Singleton();
        System.out.println("Singleton does not have copies");
        return instance;
    }

}
