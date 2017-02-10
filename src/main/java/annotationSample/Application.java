package annotationSample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Application {

    public static void main(String[] args) {

        ConsumerClass consumerClass = new ConsumerClass();
        Method[] methods = consumerClass.getClass().getMethods();

        for ( Method method : methods ) {

            MyAnno myAnno = method.getAnnotation(MyAnno.class);

            if ( myAnno != null) {

                int getAccessModifier = method.getModifiers();
                System.out.println( Modifier.isPrivate(getAccessModifier) );
                String des = myAnno.description();

                if ( des != ""){
                    System.out.println( des );
                }

                try {
                    method.invoke(consumerClass);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
