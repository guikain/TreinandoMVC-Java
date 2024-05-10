import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Controller;
import model.Animal;
import model.Cena;
import model.Comportamento;
import model.Mob;
import view.View;

public class App {
    public static void main(String[] args) throws Exception {
        
        //entrada e saida de dados do usuario
        Scanner scanner = new Scanner(System.in);

        //models: minhas classes e elementos de dados.
        Cena cena = new Cena();
        List<Mob> mobs = new ArrayList<>();
        //mobs.add(new Monstro("Dragao", "AAAAAAAAAAARRRRGH!"));
        //mobs.add(new Animal("Cachorro", Comportamento.PACIFICO));
        mobs.add(new Animal("Leao", Comportamento.AGRESSIVO));
        cena.setMobs(mobs);

        //controller: gerencia as acoes da view com os dados.
        Controller controller = new Controller(scanner, cena);

        //view: coisas que aparecerão na tela
        View view = new View(controller);

        controller.setView(view);

        view.apresentar();









    }
}
