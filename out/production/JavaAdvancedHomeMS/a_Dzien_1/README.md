<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#### Zadanie 1

1. W pliku `Main1` umieszczony został kod, który umieszcza w tablicy obiekty. Następnie wykonuje sortowanie tablicy.
2. Po uruchomieniu programu zauważysz że zwracany jest wyjątek, popraw kod dodając instrukcję `implements`
w następujący sposób:
    ````java
    public class Person implements Comparable<Person>
    ````
3. Dodaj implementację wymaganej metody, ma ona porównywać osoby względem pierwszej litery nazwiska.
4. Możesz w tym celu wykorzystać metodę klasy `String` - `compareTo`;
5. Po wprowadzeniu zmian uruchom ponownie program i zweryfikuj czy działa poprawnie.

Zapoznaj się z interfejsem -  [*Comparable*][comparable]

Pamiętaj że jeżeli operujesz na danych pobieranych z bazy danych możesz je odpowiednio sortować przy pomocy zapytania SQL.

Takiej możliwości może nie być w przypadku korzystania z API od zewnętrznego dostawcy.

#### Zadanie 2

1. W pliku `Main2` w metodzie `main` utwórz listę obiektów klasy `Person` następnie uzupełnij ją przynajmniej trzema obiektami tej klasy.
2. Wykonaj metodę `Collections.sort(lista obiektow)`.
3. Wyświetl elementy listy.

#### Zadanie 3

1. Dla dowolnej bazy danych wywołaj polecenie `sql`, znajdujące się w pliku **dump.sql**.
2. Zmodyfikuj dane połączenia z klasy **DbUtil** oraz dołącz do projektu sterownik bazy danych.
3. Uruchom metodę `main` z klasy **dao/Main**.
4. Przeanalizuj działanie poszczególnych klas oraz metod z przykładu.

#### Zadanie 4 

1. Utwórz klasę **Exercise** zawierającą pola:
    * private Long id;
    * private String title;
    * private String description;

2. Utwórz klasę **ExerciseDao**, analogicznie do udostępnionej w przykładzie klasy **GroupDao**.
3. Zastanów się jakie modyfikacje można wprowadzić tak, by kod był bardziej uniwersalny.     

#### Zadanie 5 - dodatkowe

1. Utwórz klasę **User** zawierającą dowolne pola użytkownika oraz połączenie z klasą **Group**.
2. Utwórz klasę **UserDao**, analogicznie do udostępnionej w przykładzie klasy **GroupDao**.

Zapoznaj się z definicją  [*metody szablonowej*][template-method] repozytorium z zadaniami.


**Zadania dodatkowe - są to przykładowe zadania z egzaminu OCJP - dawniej SCJP**

Spróbuj odpowiedzieć na zadane pytania - następnie uruchom kod i przeanalizuj swoją odpowiedź.

#### Zadanie 1

Given:
public interface Word {boolean isSpelled(String w); }

And three files:

1. abstract class Verb1 implements Word{boolean isSpelled(){}}
2. abstract class Verb2 implements Word{boolean isSpelled(){return true;}}
3. abstract class Verb3 implements Word{boolean isSpelled(String w){return true;}}

Which is true:
    * A. Only the first file will compile
    * B. Only the first and second files will compile.
    * C. Only the first and third will compile.
    * D. Only the second file will  compile.
    * E. All three files will compile.

#### Zadanie 2
What is the output for the below code ?
```java
interface A {
	public void printValue();
}
```

```java
public class Test {
	public static void main(String[] args) {
		A a1 = new A() {
			public void printValue() {
				System.out.println("A");
			}
		};
		a1.printValue();
	}
}
```

Options are:
   1. Compilation fails due to an error on line 3
   1. A
   1. Compilation fails due to an error on line 8
   1. null

#### Zadanie 3
What is the output for the below code ?
```java
public interface InfA {
    protected String getName();
}
public class Test implements InfA{
    public String getName(){
        return "test-name";
    }
    public static void main (String[] args){
        Test t = new Test();
        System.out.println(t.getName());
    }
}
```
Options are:
   1. test-name  
   1. Compilation fails due to an error on lines 2  
   1. Compilation fails due to an error on lines 1  
   1. Compilation succeed but Runtime Exception  

<!-- Links -->
[comparable]: https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
