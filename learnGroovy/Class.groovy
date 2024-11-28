class Person {
    String name
    int age
    Person() {

    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    def setName(String name) {
        this.name = name;
    }
    def getName(){
        return this.name;
    }

    def showDetails() {
        println "Name: ${this.name}, Age: $age"
    }

    static def intro( ) {
        return "this is practice";
    }
}


def person = new Person("chanwy", 23);
println person.toString();

person.setName("ronal")
def name = person.getName();
println "after rename: $name"

println Person.intro();


class Player extends Person {
    String sport;

    Player(String name, int age, String sport) {
        super(name, age)
        this.sport = sport;
    }

    def getSport() {
        return this.sport;
    }
}

def player = new Player("kim", 30, "skating");
def sport = player.getSport();
println "sport: $sport"