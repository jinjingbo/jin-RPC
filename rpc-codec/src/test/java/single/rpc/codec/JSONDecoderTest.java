package single.rpc.codec;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @description：反序列化test
 * @author： jinji
 * @create： 2022/5/18 16:19
 */

public class JSONDecoderTest {

    @Test
    public void decoder(){

        //有对象才能调用方法
        Decoder  decoder=new JSONDecoder();

        TestBean bean = new TestBean();
        bean.setName("jj");
        bean.setAge(18);

        Encoder encoder =new JSONEncoder();
        //先序列化
        byte[] encoded =encoder.encode(bean);

        //从这个序列反序列出一个bean
        TestBean bean2=decoder.decode(encoded,TestBean.class);
        assertEquals(bean.getAge(),bean2.getAge());
        assertEquals(bean.getName(),bean2.getName());

    }



}