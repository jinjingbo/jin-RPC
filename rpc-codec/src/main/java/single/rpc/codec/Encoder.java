package single.rpc.codec;

/**
 * @description：序列化：将json转化成二进制
 * @author： jinji
 * @create： 2022/5/18 15:42
 */
public interface Encoder {
    byte[] encode(Object obj);
}
