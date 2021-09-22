import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Pokemon[] pokemon = new Pokemon[4];
        Scanner scanner = new Scanner(System.in);
        int escolha;
        Pokemon.criarPokemon();

        do {
            System.out.println("O que quer fazer?");
            System.out.println("1 - SAIR\n2 - VER DADOS DA POKÉDEX\n3 - CAPTURAR POKEMON\n4 - BRINCAR\n5 - FALAR\n6 - EVOLUIR");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    break;
                case 2:
                    System.out.println("De qual pokémon você quer ver os dados?");
                    String nome;
                    nome = scanner.next().toLowerCase(Locale.ROOT);
                    Pokemon.mostrarDados(nome);
                    break;
                case 3:
                    Pokemon.capturar();
                    break;
                case 4:
                    Pokemon.brincar();
                    break;
                case 5:
                    Pokemon.falar();
                    break;
                case 6:
                    Pokemon.evoluir();
                    break;

            }
        }while (escolha != 1);
    }
}
