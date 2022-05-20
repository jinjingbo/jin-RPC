package single.rpc.server;

import lombok.extern.slf4j.Slf4j;
import single.rpc.Request;
import single.rpc.ServiceDescriptor;
import single.rpc.common.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description：TODO
 * @author： jinji
 * @create： 2022/5/19 18:21
 */
@Slf4j
public class ServiceManager {
    private Map<ServiceDescriptor, ServiceInstance> services;//

    public ServiceManager(){
        this.services = new ConcurrentHashMap<>();
    }

    public <T> void register(Class<T> interfaceClass, T bean) {//具体对象的具体实现的方法
        //注册
        //扫描interfaceClass接口中的所以公共方法，和bean一起，实现ServiceInstance，存进map中
        //
        Method[] methods = ReflectionUtils.getPublicMethods(interfaceClass);
        for (Method method : methods) {
            ServiceInstance sis = new ServiceInstance(bean, method);
            ServiceDescriptor sdp = ServiceDescriptor.from(interfaceClass, method);
            services.put(sdp, sis);
            log.info("register service:{} {}", sdp.getClazz(), sdp.getMethod());
        }
    }

    public ServiceInstance lookup(Request request) {
        ServiceDescriptor sdp = request.getService();
        return services.get(sdp);///////////////重写hashmap和equals
    }
}
