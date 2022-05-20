package example;

import single.rpc.server.RpcServer;
import single.rpc.server.RpcServerConfig;

/**
 * 类作用: todo
 * 项目名称: s-rpc
 * 包: single.rpc.example
 * 类名称: Server
 * 类描述: 类功能详细描述
 * 作者: wuguang
 * 创建时间:  2020/5/8 14:26
 */
public class Server {
    public static void main(String[] args) {
        //实现一个RpcServer服务器
        RpcServer server = new RpcServer(new RpcServerConfig());
        //注册方法
        server.register(CalcService.class, new CalcServiceImpl());

        server.start();
    }
}
