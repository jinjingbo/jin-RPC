package single.rpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @description：处理网络请求的handle
 * @author： jinji
 * @create： 2022/5/18 20:26
 */

public interface RequestHandler {
    void onRequest(InputStream recive, OutputStream toRespon);//处理网络请求的handle

}
