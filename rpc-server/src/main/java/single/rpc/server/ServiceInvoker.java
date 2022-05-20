package single.rpc.server;

import single.rpc.Request;
import single.rpc.common.ReflectionUtils;

/**
 * @description：TODO
 * @author： jinji
 * @create： 2022/5/19 18:08
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance instance, Request request) {
        return ReflectionUtils.invoke(//Ctrl+b
                instance.getTarget(),
                instance.getMethod(),
                request.getParameters()
        );
    }

}
