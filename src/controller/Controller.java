package controller;

import java.util.Scanner;

import model.Cena;
import model.Comportamento;
import model.Mob;
import view.View;

public class Controller {
    
    private View view;

    private Cena cena;
    private Scanner scanner;
    
    public Controller(Scanner scanner, Cena cena) {
        this.cena = cena;
        this.scanner = scanner;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void acoesNaFloresta(){

        Mob mob = cena.getMobs().stream().findFirst().orElse(null);
        switch (input()) {
            case 1:
                if(mob.getComportamento() == Comportamento.AGRESSIVO){
                    System.out.println(mob.agir());
                    System.out.println("Você morreu para um " + mob.getNome());
                }else{
                    mob.agir();
                    System.out.println("Você se deparou com um " + mob.getNome());
                }
                break;
            case 2:
                if(mob.getComportamento() == Comportamento.AGRESSIVO){
                    System.out.println("Você sabiamente fugiu de um " + mob.getNome());
                }else{
                    mob.agir();
                    System.out.println("Hahaha! você está fugindo de um " + mob.getNome());
                }
                break;
            case 3:
                System.out.println("Voce desistiu da jornada.");
                System.exit(0);
                break;
        
            default:
                break;
        }
    }

    public int input(){
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }
}
