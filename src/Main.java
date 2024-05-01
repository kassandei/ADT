import Stack.StackV;

public class Main {
    public static void main(String[] args) {

        StackV vettore = new StackV(10);
        System.out.println(vettore);
        vettore.push("ciao");
        vettore.push(1);
        System.out.println(vettore);
        vettore.pop();
        System.out.println(vettore);
    }
}