package org.example.structural.decorateur.exo;

public class Main {
    public static void main(String[] args) {

        // crea texte de base

        Text textBasic = new PlainText();
        System.out.println(textBasic.Transform("tata"));

        System.out.println(" ");

//        // rajout d'un prefixe
//        Text textPrefix = new PrefixDecorator(textBasic);
//        System.out.println("rajoute un prefix");
//        System.out.println(textPrefix.Transform("toto"));
//
//        System.out.println(" ");
//
//        // rejout suffixe
//        System.out.println("rajoute un suffix");
//        Text textSufix = new SufixDecorator(textBasic);
//        System.out.println(textSufix.Transform("tutu"));
//

    }
}
