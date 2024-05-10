package view;

import controller.Controller;

public class View {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void apresentar(){
        while (true) {
        System.out.println("Você está na floresta e ouve um barulho!\n");
        System.out.println("Deseja se aproximar?");
        System.out.println("1. Sim.");
        System.out.println("2. Não.");
        System.out.println("\n 3. Desistir.");
        controller.acoesNaFloresta();
        }
    }

    public void opcaoInvalida(){
        System.out.println("Nao existe outra opçao!\n");
        System.out.println("o que vai fazer?");
        System.out.println("1. Me aproximar.");
        System.out.println("2. Ficar onde estou.");
        System.out.println("\n 3. Desistir.");
        controller.acoesNaFloresta();
    }
    
}
