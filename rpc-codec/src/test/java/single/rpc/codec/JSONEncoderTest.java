package single.rpc.codec;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @description：序列化
 * @author： jinji
 * @create： 2022/5/18 16:19
 */
public class JSONEncoderTest {
    @Test
    public void encode(){
        Encoder encoder = new JSONEncoder();
        TestBean bean=new TestBean();
        bean.setName("jjj");
        bean.setAge(12);

        byte[] encode=encoder.encode(bean);
        assertNotNull(encode);

    }

}
