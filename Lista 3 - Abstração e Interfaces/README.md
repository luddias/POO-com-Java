# Métodos Abstratos
**Conceito:** Uma método abstrato consiste em uma assinatura de método sem um corpo de método. Ela é marcada com a palavra-chave abstract.

**Características:**
* É prefixado com a palavra-chave abstract.
* Ele não tem um corpo de método. Em vez disso, seu cabeçalho termina com ponto e virgula.

**Exemplo**:

Uma superclasse "Animal" com método abstrato "act". A lista "lista" possui classes filhos de Animal, como Coelho, Raposa e Tigre.

~~~~java
for(Animal a: lista){
    animal.act(newAnimals);
}
~~~~
O "act" é um método abstrato que está em Animal e ela é reescrita dentro de cada uma das classes extendidas de animal.

~~~java
public class Animal{
    abstract public void act(List<Animal> newAnimals);
}

~~~~

# Classes Abstratas
**Conceito:** Uma classe abstrata é uma classe que não é concebida para criar instâncias. Seu próposito é servir como uma superclasse para outras classes. As classes abstratas podem conter métodos abstratos.

- Classes não abstratas são chamadas de *classes concretas*.
- Nenhuma instância pode ser riada a partir de classes abstratas.
- Somente classes abstratas podem ter métodos abstratos.
- As classes abstratas com métodos abstratos forçam as subclasses a sobrescrever e implementar esses métodos declarados como abstratos.

**Subclasse:** Para uma subclasse de uma classe abstrata se tornar-se concreta, ela deve fornecer  implementações para todos os métodos abstratos herdados. Caso contrário, a subclasse será, ela própria, abstrata.  

# Interfaces
À primeira vista, as interfaces são semelhantes aos métodos, com a diferença mais óbvia de que suas definições de método não incluem corpos de método. Portanto, elas são semelhantes a classes abstratas no sentidos de que *todos os métodos são abstratos*.

**Exemplo:**
~~~java
public interface Actor{
    void act(List<Actor> newActors);

    boolean isActive();
}
~~~

**Características:**  
- A palavra *interface* é utilizada ao invés de *class* no cabeçalho da declaração.
- Todos os métodos em uma interface são abstratos, nenhum corpo de método é permitido.
- A palavra abstract não é necessária nos métodos.
- As interfaces não contém construtores.
- Todas as assinaturas de método contém visibidade pública, e a visibilidade não precisa ser declarada.

Uma classe pode herdar de uma interface assim como ela herda de uma classe, porém se utiliza a palavra-chave "implements" para isso.  
Diz-se que uma classe *implementa* uma interface se ela incluir uma clásula implements em seu cabeçalho de classe.

**Exemplo:**
~~~java
public class Fox extends Animal implements Drawable{
    // Corpo da classe omitido
}
~~~

