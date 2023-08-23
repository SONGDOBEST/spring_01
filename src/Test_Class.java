public class Test_Class {
    //필드 : 속성값. 해당 자원이 가질 수 있는 구체적 정보
    private int a;
    private int b;
    private String c;

    //생성자 : 해당 클래스 객체(인스턴스)를 만들 때 정의하는 규칙
    public TestClass(){

    }
    //매개변수가 있는 생성자

    public TestClass(int num, String name) {
        this.num = num;
        this.name = name;
    }


    // getter/setter method : 필드는 private로 보호하고, 필드값 접근을 위해 공개하는 method
    // getter : 필드값을 가져올 때(return 존재)
    // setter : 필드값을 저장할 때(return은 없지만 매개변수 존재)
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Test_Class{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                '}';
    }

    //Method : 특정 기능을 수행하기 위한 코드 모듈
    public String testMethod1(){
        return "안녕하세요";
    }
}
