public abstract class Ninja{
    String name;
    String aldeia;
    int idade;
    public abstract void habilidadeEspecial(); // Define uma obrigação para as classes filhas implementarem o método habilidadeEspecial
    public void apresentar() { //metodos nao abstratos possuem comportament definido
        System.out.println("Meu nome e " + name);
    }
}