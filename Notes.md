# Notes

## Types and variables

|Type| |name ||atribuation|

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









 





