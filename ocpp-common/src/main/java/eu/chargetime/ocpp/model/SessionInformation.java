package eu.chargetime.ocpp.model;

import java.net.InetSocketAddress;

/**
 * Session信息
 */
public class SessionInformation {

    private String identifier;              // 标识符。比如: ws://128.0.0.1/token 中的 /token
    private InetSocketAddress address;      // session对应的客户端IP
    private String SOAPtoURL;               // ????

    public String getIdentifier() {
        return identifier;
    }
    public InetSocketAddress getAddress() { return address; }

    public String getSOAPtoURL() {
        return SOAPtoURL;
    }

    public static class Builder {

        private String identifier;
        private InetSocketAddress address;
        private String SOAPtoURL;

        public Builder Identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder InternetAddress(InetSocketAddress address) {
            this.address = address;
            return this;
        }

        public SessionInformation build() {
            SessionInformation sessionInformation = new SessionInformation();
            sessionInformation.identifier = this.identifier;
            sessionInformation.address = this.address;
            sessionInformation.SOAPtoURL = this.SOAPtoURL;
            return sessionInformation;
        }

        public Builder SOAPtoURL(String toUrl) {
            this.SOAPtoURL = toUrl;
            return this;
        }
    }
}
