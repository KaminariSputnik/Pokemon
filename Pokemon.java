import java.util.Random;

public class Pokemon{
    private String nome;
    private String tipo;
    private float peso;
    private float altura;
    private float chance_captura;
    private int felicidade;
    private boolean estado;

    public Pokemon(String nome, String tipo, float peso, float altura, float chance_captura, int felicidade, boolean estado){
        this.nome = nome;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.chance_captura = chance_captura;
        this.felicidade = felicidade;
        this.estado = estado;
    }

    public static Pokemon[] pokemon = new Pokemon[4];

    public static void criarPokemon(){
        pokemon[0] = new Pokemon("Eevee", "Normal", 6.5f, 0.3f, 45, 0, false);
        pokemon[1] = new Pokemon("Vaporeon", "Water", 29, 1, 45, 0, false);
        pokemon[2] = new Pokemon("Flareon", "Fire", 25, 0.9f, 45,0,false);
        pokemon[3] = new Pokemon("Jolteon", "Electric", 24.5f, 0.8f, 45, 0, false);
    }

    public static void mostrarDados(String nome){
        if (nome.equals("eevee")){
            System.out.println("Nome: " + pokemon[0].nome);
            System.out.println("Tipo: " + pokemon[0].tipo);
            System.out.println("Peso: " + pokemon[0].peso);
            System.out.println("Altura: " + pokemon[0].altura);
            System.out.println("Chance de captura: " + pokemon[0].chance_captura);

            if (pokemon[0].estado == true){
                System.out.println("Estado: capturado");
                System.out.println("Felicidade: " + pokemon[0].felicidade);
            }

        } else if (nome.equals("vaporeon")){
            System.out.println("Nome: " + pokemon[1].nome);
            System.out.println("Tipo: " + pokemon[1].tipo);
            System.out.println("Peso: " + pokemon[1].peso);
            System.out.println("Altura: " + pokemon[1].altura);
            System.out.println("Chance de captura: " + pokemon[1].chance_captura);

            if (pokemon[1].estado == true){
                System.out.println("Estado: capturado");
                System.out.println("Felicidade: " + pokemon[1].felicidade);
            }

        } else if (nome.equals("flareon")){
            System.out.println("Nome: " + pokemon[2].nome);
            System.out.println("Tipo: " + pokemon[2].tipo);
            System.out.println("Peso: " + pokemon[2].peso);
            System.out.println("Altura: " + pokemon[2].altura);
            System.out.println("Chance de captura: " + pokemon[2].chance_captura);

            if (pokemon[2].estado == true){
                System.out.println("Estado: capturado");
                System.out.println("Felicidade: " + pokemon[2].felicidade);
            }

        } else if (nome.equals("jolteon")){
            System.out.println("Nome: " + pokemon[3].nome);
            System.out.println("Tipo: " + pokemon[3].tipo);
            System.out.println("Peso: " + pokemon[3].peso);
            System.out.println("Altura: " + pokemon[3].altura);
            System.out.println("Chance de captura: " + pokemon[3].chance_captura);

            if (pokemon[3].estado == true){
                System.out.println("Estado: capturado");
                System.out.println("Felicidade: " + pokemon[3].felicidade);
            }
        } else {
            System.out.println("Você ainda não registrou esse pokemon na Pokédex.");
        }
    }

    public static void capturar(){
        if (pokemon[0].estado == true){
            System.out.println("Você já tem esse pokémon!");
        } else {
            System.out.println("Um eevee selvagem apareceu!");
            Random random = new Random();
            int N = random.nextInt(255);

            if (N < pokemon[0].chance_captura){
                pokemon[0].estado = true;
                System.out.println("Parabéns! Eevee foi pego!");
            } else {
                System.out.println("Agh! Quase pegou!");
            }
        }
    }

    public static void brincar(){
        for (int i = 0; i < 4; i++){
            if (pokemon[i].estado == true){
                pokemon[i].felicidade = pokemon[i].felicidade + 20;
                System.out.println(pokemon[i].nome + "está feliz em ter você por perto!");
            }
        }
    }

    public static void falar(){
        if (pokemon[0].estado == false && pokemon[1].estado == false && pokemon[2].estado == false && pokemon[3].estado == false){
            System.out.println("Você ainda não capturou nenhum pokémon.");
        }
        for (int i = 0; i < 4; i++){
            if (pokemon[i].estado == true){
                System.out.println(pokemon[i].nome + "!");
            }
        }
    }

    public static void evoluir(){
        if(pokemon[0].felicidade < 100){
            System.out.println("Não é possível evoluir.");
        } else {
            Random random = new Random();
            int evo = random.nextInt(100);
            evo = evo%4;
            if (evo < 1)
                evo++;
            System.out.println("Olhe! Seu Eevee está evoluindo!");
            if(evo == 1){
                pokemon[0].estado = false;
                pokemon[0].felicidade = 0;
                pokemon[1].estado = true;
                System.out.println("Seu Eeve evoluiu para Vaporeon!");
            }
            if(evo == 2){
                pokemon[0].estado = false;
                pokemon[0].felicidade = 0;
                pokemon[2].estado = true;
                System.out.println("Seu Eeve evoluiu para Flareon!");
            }
            if(evo == 3){
                pokemon[0].estado = false;
                pokemon[0].felicidade = 0;
                pokemon[3].estado = true;
                System.out.println("Seu Eeve evoluiu para Jolteon!");
            }

        }

    }
}