package eu.chargetime.ocpp;

import eu.chargetime.ocpp.model.Request;

import java.util.UUID;

/**
 * ISession接口
 */
public interface ISession {

    /**
     * 获取SessionId
     * @return
     */
    UUID getSessionId();

    /**
     * 建立会话（客户端使用）
     * @param uri
     * @param eventHandler
     */
    void open(String uri, SessionEvents eventHandler);

    /**
     * 接收会话（服务端使用）
     * @param eventHandler
     */
    void accept(SessionEvents eventHandler);

    /**
     * 缓存请求
     * @param payload
     * @return
     */
    String storeRequest(Request payload);

    /**
     * 发送请求
     * @param action
     * @param payload
     * @param uuid
     */
    void sendRequest(String action, Request payload, String uuid);

    /**
     * 关闭会话
     */
    void close();
}
