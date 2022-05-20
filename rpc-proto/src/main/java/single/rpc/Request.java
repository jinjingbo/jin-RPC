package single.rpc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description：表示RPC的一个请求
 * @author： jinji
 * @create： 2022/5/17 21:07
 */
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Request {
    private ServiceDescriptor service;//表示所请求的服务
    private Object[]  parameters;//表示传进来的参数
}
