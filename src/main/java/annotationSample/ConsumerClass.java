package annotationSample;

public class ConsumerClass {

    public void methodA(){
        System.out.println("methodA() = A");
    }

    @MyAnno( description = "Sample description")
    public void methodB(){
        System.out.println("methodB() = B");
    }

    public void methodC(){
        System.out.println("methodC() = C");
    }

    @MyAnno( description = "")
    public void methodD(){
        System.out.println("methodD() = D");
    }
}
