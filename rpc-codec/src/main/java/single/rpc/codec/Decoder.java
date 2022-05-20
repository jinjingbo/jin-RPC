package single.rpc.codec;

/**
 * @description：反序列化：将byte[]变成json
 * @author： jinji
 * @create： 2022/5/18 15:43
 */
public interface Decoder {
    <T> T decode(byte[] data, Class<T> clazz);
}
