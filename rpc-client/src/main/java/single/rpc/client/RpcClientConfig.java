package single.rpc.client;

import lombok.Data;
import single.rpc.Peer;
import single.rpc.codec.Decoder;
import single.rpc.codec.Encoder;
import single.rpc.codec.JSONDecoder;
import single.rpc.codec.JSONEncoder;
import single.rpc.transport.HttpTransportClient;
import single.rpc.transport.TransportClient;

import java.util.Arrays;
import java.util.List;

/**
 * @description：配置
 * @author： jinji
 * @create： 2022/5/20 11:36
 */
@Data
public class RpcClientConfig {
    /**
     * 网络模块
     */
    private Class<? extends TransportClient> transportClass =
            HttpTransportClient.class;
    //序列化模块
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
   //选择server模块
    private Class<? extends TransportSelector> selectorClass =
            RandomTransportSelector.class;
    private int connectCount = 1;
    //初始化端口
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1",3000)
    );
}
