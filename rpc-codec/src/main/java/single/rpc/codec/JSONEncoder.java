package single.rpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @description:序列化.序列化和反序列化实现，利用fastjson.JSON实现
 * @author： jinji
 * @create： 2022/5/18 16:16
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
    //将json转化成二进制

}
