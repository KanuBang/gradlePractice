

int add1(int a, int b){
    return a + b
}

int add1_1(int a, int b){
    a + b
}

println add1(2,5)
println add1_1(2, 5)
// 왠만해서는 명확성을 위해 리턴 타입, 매개 변수 타입을 지정하는 게 좋다.

def add3(a,b) {
    return a + b
}
def add2(int a, int b) {
    return a + b
}
// 매개 변수 타입을 지정하지 않을 수 있긴 한데 다른 개발자가 코드를 읽을 때 모호함이 생긴다.

println add3(2,5)
println add4(2,5)

def add4(a,b){
    a * b
    a + b
}
println add4(2,5)
// 맨 마지막 줄이 리턴된다.