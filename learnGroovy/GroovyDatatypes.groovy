byte b = 10
println "byte: $b"
println b.class

short s = 30000
println "short: $s";

int i = 100000
println "Integer: $i"

long l = 100000000L
println "long: $l"

float f = 10.4F
println "long: $f"

double d = 20.99
println "double: $d"


char c = 'A';
println "double: $c"

boolean boo = false;
println "boo: $boo"

String str = "hello";
println "str: $str"

BigInteger bigInteger = new BigInteger("1234324234234234");
println "bigInteger: $bigInteger"

BigDecimal bigDecimal = new BigDecimal("123234.234");
println "bigDecimal: $bigDecimal"

List<Integer> list = [1,2,3,4,5]
println "list: $list"

Map<String,Integer> map = [name:1, age:25]
println "map: $map"

Range range = 1..5
println "range: $range"


def sayHello = { println "Hello, Groovy!!"}
sayHello()

def add = {a1, a2 -> a1 + a2}
println add(5,3)

def greet = { name -> println "Hello, $name!"}
greet("chanwu")

def square = {it * it}
println square(4)

def greetWithDefault = { name = "stranger" -> println "Hello, $name"}
greetWithDefault()
greetWithDefault("James")

def operate(a,b,operation) {
    return operation(a,b)
}

def result = operate(4,5, {x,y -> x*y})
println result

String nullableString =  null
// ?을 사용하면 null이 들어오더라도 NullPointer 예외가 발생하지 않고 그냥 null이 출력됨.
println "Nullable String Length: ${nullableString?.length}"

def dynamicVar = "this will be a string"
println "dynamicVar: $dynamicVar"

dynamicVar = 42
println "dynamicVar: $dynamicVar"

dynamicVar = [1,2,3]
println "dynamicVar: $dynamicVar"
