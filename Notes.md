# Notes

## Types and variables

|Type| |name ||assignment|

byte							-128							127			

short							-32.768					32768

int 				  			-2.147.483.648		2.147.483.648

long							stars hehe

float								-3,4028E + 38		3,4028E + 38

double							-1,7976E + 308		1,7976E + 308

boolean

char

### Exemplos

byte idade = 123;

short ano = 2022;

int cep = 21070333; // if it starts with zero, maybe it has to be another type (maybe instring)

long cpf = 98765432109L; // if it starts with zero, maybe it has to be another type

float pi = 3.14F;

double salario = 2500.00

## Operators

###  increments

number ++ = number +1

number -- = number -1

### 	boolean 

​	variavel = (false or true)

### 		Ternary

​		string variable= a==b ? "true" : "false"

​		or

​		int variable= a==b ? 1 : 0

### Relational

​			== equal

​			!= diferent

​			>  bigger

​			>= bigger or equal

​			< smaller

​			<= smaller or equal

### 				Logics

​				&&  = "and"

​				|| = "or"



## Methods

- Have to me nominated as a  verb

Principal questions:

1. What's the principal finality of our method?
2. what kind of return is expected after run our method?

### Examples:

"public class Myclass {

​	public double addUp(int num1,  num2){

​	return ... ;

​	}

}"



"public void print(String text){

​	//Here don't need the return cause is a void method.

}"



"private void privateMethod (){}"



## Escopes

 In nutshell,it's the lifetime of a variable.

 When created inside a method or flux, it is valid only inside it.



## Reserved words

 They are on hes totality 52 words.

### Package control

- import
- package

### Access modifiers

- public
- private
- protected



### Primitives types

- boolean
- byte
- char
- double
- int
- long
- short
- void



### Classes modifiers, variables or methods

- abstract
- class
- extends
- final
- implements
- interface
- native
- new
- static
- strictfp
- synchronized
- transient
- volatile



### Flux control inside code box

- break
- case
- continue



### Errors treatment

- assert
- catch
- finally
- throw
- throws
- try

### Reference variables

- super
- this

## Comments and java doc

### Comments

* // one line comment



- /* to bigger comments

​			*more lines

​			*used, creating a comment box

​			*/



* /**

​		*used to create documents

​		*to our methods

​		/*



### Java doc

on our terminal, type this code:

javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java



## Terminal and arguments



public class minhaClasse {

  public static void main(String[] args){

​    System.out.println("Oi, fui executado pelo terminal");



​      String nome = args[0];

​      String sobrenome = args [1];

​      int idade = Integer.valueOf(args[2]);

​      double altura = Double.valueOf(args[3]);



​        System.out.println("Ola, me chamo " + nome + " " + sobrenome);

​        System.out.println("tenho " + idade + "anos");

​        System.out.println("Minha altura  " + altura + "cm ");

  } 

}

____________________________________________________________________________________________________________________________________________________________________________________________

public class AboutMe {

  public static void main(String[] args){



​    Scanner scanner = new Scanner(System.in).uselocale(Locale.US);

​    

​    System.out.println("Digite seu nome");

​    String nome = scanner.next();



​    System.out.println("Digite seu sobrenome");

​    String sobrenome = scanner.next();



​    System.out.println("Digite sua idade");

​    int idade = scanner.nextInt();



​    System.out.println("Digite sua altura");

​    double altura = scanner.nextDouble();



​      System.out.println("Ola, me chamo " + nome + " " + sobrenome);

​      System.out.println("tenho " + idade + "anos");

​      System.out.println("Minha altura  " + altura + "cm ");

  } 

}



## Relational operators

we have two types of operators:

- similarity: same or different (==;!=)
- size: bigger, bigger or equal, little, little or equal.(> and >=; < and <=)



## Logical operators



### Conjunction &&

just true when both of operands are true

## Disjunction ||

just false when both operands are false



## Exclusive disjunction ^

Just true when both operands are opposites

## Negation !

Invert the operation 



## Flux control

- Decision: if, if-else,if-else-if, switch and ternary operator
- repetition: for, while, do while
- interruption: break, continue, return



## Repetition structures and arrays



[For consult](github.com/cami-la/loops-e-arrays)

### Array

type[] name = {position1, position2, position3 ...}

or

type[] name = [length];



### Multidimensional arrays

type[] [] name = [length] [length];



## Object orientation

[Exercises git hub](https://github.com/tlcdio)

### Basic strutures

#### Class: 

works like a base for our objects. Has to be substantives concretes or abstracts. Examples: ball, car, sell, computer ...

____

class car{

}

#### Attribute

Its the element responsible for define a data structure. Its usually a adjective. Examples: a color, a diameter, a distance, a value, a name...

____

class car {

String color;

String model;

int fuelTankCapacity;

}

#### Method

Its the element responsible for tell us what action our class can do for us. Its usually a verb. Examples: turn on, turn off, calculate, do a change...

Especial methods:

- constructor (must have the same name of the class). 

  Initialize a object 

  Example:

  class car{

  car(){

  ...

  ​	}

  }

- destructor

  Assist the destruction of an object

  Example:

  class car {

  void finalize(){

  ...

  ​	}

  }

#### Object and Message

- creation of a object: Car car = new Car();


-  its the communication for a action. Example:

​		Car car = new Car();

​		car.|method|;

​		Car.|method|;



#### Heritages

Use the word "extends". Example: class A extends B{...}

A a = new B(); upcast

A a = (B) new new A(); downcast

- types:
  - simple: the method that inherits just one main class
  - multiple: the method that inherits multiple main methods.



#### Polymorphism and override

- polymorphism: an action behaving differently.

- override: an action can behave differently.



#### Association

- Structural 

  - composition: "Com parte todo": when a data it's associated for a specific other one. Example:

    class Person{

    Address address;

    }

  

  - aggregation: "sem parte todo": when a data isn't  associated for a specific other one. Example:

    class Discipline{

    Student student;

    }

- Behavioral

  - Dependency: "depends on": when a data depends on the other one to exist. Example:

    class Buy{

    ...

    finalize(Cupom cupom, ...) {

    ​	...

    ​	}

    }



#### Interface

Its a tool created to run our methods. Example:

class Calculator implements mathOperators{

​	...

}

#### Packages

Used to organize our projects.

package ...;

import ...;

## Collections

Its an object that can gather multiples elements (variables or objects)

### List

[Exercises](https://drive.google.com/file/d/1tFsgADr5gYFEa4fQS0XzpK8i4ADqt95W/view)

Allow duplicated itens.

- ArrayList : Most used in search operations.
- LinkedList: Most used when we need to insert and delete more data's from our list.



### Set

[Exercises](https://drive.google.com/file/d/1tS3Np0gVTBbfr9CyOjgevsjjNd083peY/view)

Don't allow to search.

- HashSet: Store the data's aleatory. Allow one null element
- LinkedHashSet: keeps the data's order. Allow one null element
- TreeSet: Keeps the natural order of our data's. Don't allow null elements.

### Map

[Exercises](https://drive.google.com/file/d/1u02CyiElDJR4wmDQ8vq3aNYe10-iSVt-/view)

- HashMap: Store the data's aleatory. Allow one null element
- LinkedHashMap: keeps the data's order. Allow one null element
- TreeMap: Keeps the natural order of our data's. Don't allow null elements.



### Exceptions

[Exercises](https://github.com/cami-la/exceptions-java)

- Error
- Unchecked
- Checked

## Http communication protocol

[Content](https://drive.google.com/file/d/1IeS6XI7uc3Xy3X7kA2rgjKHClwxeP3hR/view)



## Spring framework

[Content](https://docs.google.com/presentation/d/1VfMegq5Je5qO4IP8chi2x4YR4ACOfBbN/edit#slide=id.p2)

Ioc = inversion of control

Bean = object created and managed by the container









# Notes:

- instancia x estatico: atributos e métodos
- Branchs
- estado de um objeto
- identidade de um objeto
- representaçao numerica de um objeto
- representaçao padrao de um objeto
- estudar polimorfismo e sobrescrita
- tipos de classe: abstrata e concreta
- metodos abstratos
- caracteristicas das associaçoes
- relaçoes entre classes e interface
- refatoraçao de codigo
- interface comparable
- método entry
- Exceptions

