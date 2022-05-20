package single.rpc.transport;

/**
 * @description：Server网络协议
 *  类作用:
 *  * 1.启动 监听端口
 *  * 2.接受请求
 *  * 3.关闭监听
 * @author： jinji
 * @create： 2022/5/18 20:18
 */
public interface TransportServer {
    //要确定监听的RequestHandler
    //创建一个conect
    void init(int port,RequestHandler handler);
    //启动
    void start();
    //关闭
    void stop();

}
