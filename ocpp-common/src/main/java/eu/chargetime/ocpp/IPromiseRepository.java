package eu.chargetime.ocpp;

import eu.chargetime.ocpp.model.Response;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;



/**
 * Promise仓库。
 * 服务器发送请求给客户端，并收到客户端的确认后，做点什么。
 * 
 * 参考SseServer.java中的实现:
 * server.send(sessionIndex, request).whenComplete((confirmation, throwable) -> System.out.println(confirmation));
 */
public interface IPromiseRepository {
    CompletableFuture<Response> createPromise(String uniqueId);

    Optional<CompletableFuture<Response>> getPromise(String uniqueId);

    void removePromise(String uniqueId);
}
