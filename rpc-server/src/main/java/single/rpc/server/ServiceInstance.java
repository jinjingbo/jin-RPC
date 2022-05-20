package single.rpc.server;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Method;

/**sever的实现类
 * @description：一个ServiceInstance类，需要定义哪个对象的哪个服务
 * @author： jinji
 * @create： 2022/5/19 18:03
 */
@Data
@AllArgsConstructor

public class ServiceInstance {
    private Object target;
    private Method method;

}
