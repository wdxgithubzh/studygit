package eu.chargetime.ocpp.feature.profile;

import eu.chargetime.ocpp.feature.Feature;
import eu.chargetime.ocpp.model.Response;
import eu.chargetime.ocpp.model.Request;

import java.util.UUID;

/**
 * 
 * Interface used for Feature Profiles.
 */
public interface Profile {

    /**
     * Get a list of supported Feature for this Feature Profile.
     *
     * @return supported {@link Feature}s
     */
    Feature[] getFeatureList();

    /**
     * Handle {@link Request}
     *
     * @param sessionIndex source of the request.
     * @param request the {@link Request} to be handled.
     * @return the {@link Response} to be send.
     */
    Response handleRequest(UUID sessionIndex, Request request);
}
