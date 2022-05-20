package single.rpc.common;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @description：TODO
 * @author： jinji
 * @create： 2022/5/17 22:19
 */
public class ReflectionUtilsTest {
    @Test
    public void newInstance(){
        TestClass testClass=ReflectionUtils.newInstance(TestClass.class);//调用方法
        assertNotNull(testClass);
    }
    @Test
    public void getPublicMethods(){
        Method[] methods=ReflectionUtils.getPublicMethods(TestClass.class);
        for(Method method:methods){
            System.out.println(method.getName());
        }//
        assertEquals(4,methods.length);
        //String[] strs=new String[]{methods[0].getName(),methods[1].getName()};
        //assertEquals("Aa",strs[0]);
        //assertEquals("Cc",strs[1]);
    }
    @Test
    public void invoke() {
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        for(Method method:methods){
            System.out.println(method.getName());//
        }

        Method a = methods[0];
        TestClass testClass = ReflectionUtils.newInstance(TestClass.class);

        Object invoke = ReflectionUtils.invoke(testClass, a);
        //assertEquals("Aa", invoke);
        System.out.println(invoke);

    }
}
