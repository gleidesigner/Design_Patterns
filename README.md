# Design Patterns (Padrões de Projeto) - Overview
  Representam as melhores práticas utilizadas por desenvolvedores experientes de software orientado a objetos.
  São soluções para os problemas gerais que desenvolvedores de software enfrentados durante o desenvolvimento do software.

# O que é Gang of Four (GOF)?
  São os nomes dos quatro autores Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides publicados
  um livro intitulado Padrões de Projeto - Elementos de Software Reutilizável Orientado a Objetos
  que iniciou o conceito de Design Pattern no desenvolvimento de software.

# Baseiam-se principalmente nos seguintes princípios de design orientado a objeto.
  - Programa de uma interface não uma implementação
  - Favorecer a composição de objetos sobre a herança

# Design Patterns tem dois usos principais no desenvolvimento de software:
  - Plataforma comum para desenvolvedores: padrões de projeto fornecem uma terminologia padrão e são específicos para determinado cenário.
  Por exemplo, um padrão de design singleton significa uso de único objeto para que todos os desenvolvedores familiarizados com o padrão
  de design único fará uso único objeto e eles podem dizer um ao outro que o programa está a seguir um padrão Singleton.
  - Melhores práticas: padrões de projeto foram evoluiu durante um longo período de tempo e que proporcionam melhores soluções
  para certos problemas enfrentados durante o desenvolvimento do software. Aprender esses padrões ajuda os desenvolvedores inexperientes
  para aprender design de software de uma maneira fácil e mais rápido.

# Tipos de Desing Patterns
  De acordo com o livros de referência Design Patterns - Elementos de Software Reutilizável Orientado a Objetos,
  existem 23 design patterns que podem ser classificados em três categorias: **Creacionais, Estruturais, Comportamentais**. 
  Também discutiremos outra categoria de padrão de projeto: **Padrões de Projeto J2EE**.

  
# Padrão e Descrição
  1. **Padrões de Criação:** Estes padrões de projeto fornecem uma maneira de criar objetos enquanto esconde a lógica de criação,
  em vez de instanciar objetos diretamente usando nova opreator. Isto dá programa mais flexibilidade para decidir quais objetos
  precisam ser criados para um determinado caso de uso.
  
  2. **Padrões Estruturais:** Estes padrões de projeto preocupação de classe e composição de objetos. Conceito de herança é usado para
  compor as interfaces e definir formas de compor objetos para obter novas funcionalidades.
  
  3. **Padrões de Comportamento:** Estes padrões de design são especificamente preocupados com a comunicação entre objetos.
  
  4. **Padrẽs J2EE:** Estes padrões de design são especificamente preocupado com a camada de apresentação. Esses padrões são identificados pela Sun Java Center.
  
# 1. Padrões de Criação
## 1.1 - Design Pattern - Factory
  Factory é um dos design pattern mais utilizado em Java que permite as classes delegar para as subclasses o que deciderem.
  Este tipo de padrão de projeto vem sob padrão criacional como este padrão oferece uma das melhores maneiras de criar um objeto.
  
  No padrão de fábrica, criamos objeto sem expor a lógica de criação para o cliente e referem-se objeto recém-criado usando uma interface comum.
  
### Implementação
  Vamos usar a UML (Linguagem de Modelagem Unificada) para representar o diagram de class, criando uma interface Forma(Shape) e classes concretas que irão implementar essa interface.
  A ShapeFactory classe de fábrica é definido como um próximo passo.
  
  FactoryPatternDemo, a nossa classe de demonstração irá utilizar ShapeFactory para obter um objeto Shape.
  Ele vai passar informações (CIRCLE / RECTANGLE / QUADRADO) para ShapeFactory para obter o tipo de objeto que ele precisa.
  
### Diagrama Exemplo 1:

  <img src="https://github.com/gleidesigner/Design_Patterns/blob/master/src/factory/exemplo1/diagramFactory1.png" alt="Factory Pattern UML Diagram"/>
  
  
# Webgrafia
  http://www.tutorialspoint.com/design_pattern/index.htm
  https://pt.wikipedia.org/wiki/Padr%C3%A3o_de_projeto_de_software