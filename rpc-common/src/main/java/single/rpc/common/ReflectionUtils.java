package single.rpc.common;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * @description：1.有class创建对象 2.得到类class 中的所以公共方法 3.调用指定对象的指定方法
 * @author： jinji
 * @create： 2022/5/17 21:51
 */
public class ReflectionUtils {
    /**
    * @Author: jinji
    * @Description: 根据class创建对象
    * @DateTime:  21:56
    * @Params: class
    * @Return new de 对象
    */
    
    public static <T> T newInstance(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }

    }
    /**
    * @Author: jinji
    * @Description: 获取class的公有方法的名字,public
    * @DateTime:  22:03
    * @Params: 
    * @Return 返回class的公有方法
    */
    
    public static Method[] getPublicMethods(Class<?> clazz){
        Method[] methods = clazz.getDeclaredMethods();
        List<Method> publicMethods =new ArrayList<>();
        //只需要公共方法
        for(Method method : methods){
            if(Modifier.isPublic(method.getModifiers())){
                publicMethods.add(method);
            }
        }
        return publicMethods.toArray(new Method[0]);
    }

    //核心，调用指定对象的指定方法，调用方法返回结果
    /**
     * 调用指定对象的指定方法
     *
     * @param obj 被调用方法的对象
     * @param method 被调用的方法
     * @param args 方法的参数
     * @return 返回结果
     */
    public static Object invoke(Object obj, Method method, Object... args){
        try {
            return method.invoke(obj, args);
        }  catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

}
