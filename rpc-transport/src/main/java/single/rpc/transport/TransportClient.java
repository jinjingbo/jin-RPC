package single.rpc.transport;

import single.rpc.Peer;

import java.io.InputStream;

/**
 *
 * @description:client网络协议接口
 * 类作用:
 *  * 1.创建连接
 *  * 2.发送数据，并且等待响应
 *  * 3.关闭连接
 * @author： jinji
 * @create： 2022/5/18 20:17
 */
public interface TransportClient {
   //连接端口
    void connect(Peer peer);
    //发送数据，io输入write
   InputStream write(InputStream data);
   //关闭
    void close();

}
