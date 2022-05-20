package single.rpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @description：TODO序列化和反序列化实现，利用fastjson.JSON实现
 * @author： jinji
 * @create： 2022/5/18 16:12
 */
public class JSONDecoder implements Decoder {


    @Override
    public <T> T decode(byte[] data, Class<T> clazz) {
        //反序列化：将byte[]变成json,对象是class
        return JSON.parseObject(data, clazz);
    }
}
