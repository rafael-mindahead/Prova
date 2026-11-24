public class Haruno extends Ninja implements NinjaMedico {
    public void habilidadeEspecial(){
        System.out.println("Cura ativada");
    }

    public void curar(){
        System.out.println("Cura ativad");
    }
    // apartir do momento que a classe Haruno implementa a interface ninjamEDICO, ela e obrigada a implementa o metodo curar, que e definido
    // o texto pode ser qualquer coisa, mas a assinatura do metodo deve ser igual a da interface, ou seja, o nome do metodo e os parametros devem ser iguais
}
