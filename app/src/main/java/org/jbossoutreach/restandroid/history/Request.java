package org.jbossoutreach.restandroid.history;

final class Request {
    Method method;
    String url;

    Request(Method method, String url) {
        this.method = method;
        this.url = url;
    }

    enum Method {
        GET,
        POST,
        PUT,
        DELETE
    }
}
