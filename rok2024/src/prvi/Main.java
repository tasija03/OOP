package prvi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Svinja s = new Svinja("Napoleon");
        Ovca o1 = new Ovca("Moli", new String[]{});
        Ovca o2 = new Ovca("Poli", new String[]{});

        Scanner sc = new Scanner(System.in);
        System.out.println("Br parola za Poli:");
        int brParolaP = sc.nextInt();
        sc.nextLine();
        String[] tmp = new String[brParolaP];
        System.out.println("Parole:");
        for(int i = 0; i < brParolaP; i++){
            tmp[i] = sc.nextLine();
        }
        o2.setNizParola(tmp);

        System.out.println("Br parola za Moli:");
        int brParolaM = sc.nextInt();
        sc.nextLine();
        String[] tmp2 = new String[brParolaM];
        for(int i = 0; i < brParolaM; i++){
            tmp2[i] = sc.nextLine();
        }
        o1.setNizParola(tmp2);

        System.out.println("Parola za Napoleona:");
        s.setParola(sc.nextLine());

        System.out.println("Naoleon:");
        System.out.println(s.toString());

        System.out.println("Moli:");
        o1.uglas();
        System.out.println("Poli:");
        o2.uglas();

        Direktiva d = new Direktiva("Poli", "CETRI NOGE DOBRE, DVE BOLJE!");
        o2.naredi(d);

        System.out.println(o2.toString());

        s.setParola("Sve zivotinje su jednake");
        System.out.println(s.toString());
    }
}

