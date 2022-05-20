package single.rpc.server;

import lombok.Data;
import single.rpc.codec.Decoder;
import single.rpc.codec.Encoder;
import single.rpc.codec.JSONDecoder;
import single.rpc.codec.JSONEncoder;
import single.rpc.transport.HttpTransportServer;
import single.rpc.transport.TransportServer;

/**
 * @description：RpcServerConfig的配置
 * @author： jinji
 * @create： 2022/5/19 18:35
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HttpTransportServer.class;//网络协议
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;//端口定义
}
