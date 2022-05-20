package single.rpc.client;

import single.rpc.Peer;
import single.rpc.transport.TransportClient;

import java.util.List;

/**
 * @description：client选择哪个Sever
 * @author： jinji
 * @create： 2022/5/20 11:10
 */
public interface TransportSelector {
    /**
     * 初始化selector
     *
     * @param peers 可以连接的server端点信息
     * @param count client于server建立多少个连接
     * @param clazz client实现的class
     */
    void init(List<Peer> peers, int count, Class<? extends TransportClient> clazz);
    /**
     * 选择一个transport于server做交互
     *
     * @return 网络client
     */
    TransportClient select();

    /**
     * 释放用完的client
     */
    void release(TransportClient client);

    void close();

}
