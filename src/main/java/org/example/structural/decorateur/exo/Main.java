package org.example.structural.decorateur.exo;

public class Main {
    public static void main(String[] args) {

        // crea texte de base

        Text textBasic = new PlainText();
        System.out.println(textBasic.Transform());

        System.out.println(" ");

        // rajout d'un prefixe
        Text textPrefix = new PrefixDecorator(textBasic);
        System.out.println(textPrefix.Transform());

        System.out.println(" ");

        // rejout suffixe
        Text textSufix = new SufixDecorator(textPrefix);
        System.out.println(textSufix.Transform());


    }
}
