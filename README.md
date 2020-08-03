# java-classe-methods-final

Esse código aborda alguns exemlos de como pode ser utilizada a palavra "final" nas classes e métodos em java. 
Na classe SavingsAccount foi acrescentada a palavra "final" para identificar que a classe não terá subclasses. 
Portanto, a classe SavingsAccountPlus não herdará da classe SavingsAccount.
No exemplo da classe BussinesAccountPlus, ocorre a herança das classes normalmente, mas o método loan não será permitido, pois ele foi definido como "final" na classe ascendente. Tambem foi usado a anotação @Override antes do método para indicar uma sobreposição.

Por que usar?
Por segurança dependendo das regras de negócio é desejável que classe(s) seja(m) herdada(s) e/ou método(s) não seja(m) sobreposto(s).
Para métodos que ja foram sobrepostos, o uso do "final" é conveniente para evitar inconcistência no código.
Os atributos da classe do tipo final são analisados mais rápidos em tempo de execução. Ex. String.
A classe "public final class String" já é uma classe "final".
