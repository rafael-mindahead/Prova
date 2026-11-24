public  class Uchiha extends Ninja implements PoderOcular{
    public void habilidadeEspecial(){ // as classes filhas são obrigadas a implementar o método habilidadeEspecial
        System.out.println("Sharingan ativado");
    }
    public void ativarSharigan(){
        System.out.println("Sharigan ativado");
    }
}

// classes abstratas não podem ser instanciadas, ou seja, não é possível criar objetos a partir delas. Elas servem como base para outras classes que irão herdar suas características e implementar seus métodos abstratos.
// os metodos abstratos sao declarados na classe abstrata, mas nao possuem implementacao, alem de obrigar as classes filhas a implementaram 