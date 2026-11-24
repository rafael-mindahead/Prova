public class main {
    public static void main(String[] args) {
        //Ninja ninja = new Ninja(); // nao compila pois a classe Ninja e abstrata, ou seja nao pode ser instanciada
        //ninja.name = "Rafael";
        //ninja.aldeia = "Konoha";
        //ninja.idade = 20;
        Uzumaki Naruto = new Uzumaki();
        Naruto.name = "Naruto";
        Naruto.habilidadeEspecial();
        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke";
        Sasuke.habilidadeEspecial();
        Haruno Sakura = new Haruno();
        Sakura.name = "Sakura";
        Sakura.habilidadeEspecial();
        //Ninja Rafael = new Ninja(); // nao compila pois a classe Ninja e abstrata, ou seja nao pode ser instanciada
        //Rafael.name = "Rafael";
        //Rafael.habilidadeEspecial();
        Ninja isabela = new Uchiha();
        isabela.name = "Isabela";
        isabela.habilidadeEspecial();
        Naruto.apresentar();
        Naruto.habilidadeEspecial();
        Naruto.usarRasegan();
        Sasuke.apresentar();
        Sasuke.habilidadeEspecial();
        Sasuke.ativarSharigan();
        Sakura.apresentar();
        Sakura.habilidadeEspecial();
        Sakura.curar();
    }
        
}
