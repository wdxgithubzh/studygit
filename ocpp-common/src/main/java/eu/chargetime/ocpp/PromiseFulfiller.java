package eu.chargetime.ocpp;


import eu.chargetime.ocpp.model.Response;
import eu.chargetime.ocpp.model.Request;

import java.util.concurrent.CompletableFuture;

/**
 * 
 * 使用传入的Session处理器处理请求，并返回CompletableFuture。
 * 
 * 参考SimplePromiseFulfiller.java的实现
 */
public interface PromiseFulfiller {
    void fulfill(CompletableFuture<Response> promise, SessionEvents eventHandler, Request request);
}
