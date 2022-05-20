package single.rpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description：表示网络传输的一个端点
 * @author： jinji
 * @create： 2022/5/17 20:48
 */
@Data//lombok
@AllArgsConstructor
public class Peer {
    private String host;//远程地址
    private int port;//端口
}
