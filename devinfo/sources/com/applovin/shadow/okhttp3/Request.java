package com.applovin.shadow.okhttp3;

import cm.g;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.HttpMethod;
import d.h;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nk.k;
import vk.p;
import yj.a;
import yj.i;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i4 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            this.headers.add(str, str2);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder cacheControl(CacheControl cacheControl) {
            k.e(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method("GET", null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            this.headers.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            k.e(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            k.e(str, "method");
            if (str.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                if (HttpMethod.requiresRequestBody(str)) {
                    throw new IllegalArgumentException(h.t("method ", str, " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(str)) {
                throw new IllegalArgumentException(h.t("method ", str, " must not have a request body.").toString());
            }
            this.method = str;
            this.body = requestBody;
            return this;
        }

        public Builder patch(RequestBody requestBody) {
            k.e(requestBody, "body");
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            k.e(requestBody, "body");
            return method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            k.e(requestBody, "body");
            return method("PUT", requestBody);
        }

        public Builder removeHeader(String str) {
            k.e(str, "name");
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            k.e(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            k.e(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            k.e(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            k.e(httpUrl, "url");
            this.url = httpUrl;
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public <T> Builder tag(Class<? super T> cls, T t10) {
            k.e(cls, "type");
            if (t10 == null) {
                this.tags.remove(cls);
                return this;
            }
            if (this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.tags;
            T tCast = cls.cast(t10);
            k.b(tCast);
            map.put(cls, tCast);
            return this;
        }

        public Builder url(String str) {
            k.e(str, "url");
            if (p.w0(str, "ws:", true)) {
                String strSubstring = str.substring(3);
                k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                str = "http:".concat(strSubstring);
            } else if (p.w0(str, "wss:", true)) {
                String strSubstring2 = str.substring(4);
                k.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                str = "https:".concat(strSubstring2);
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(Request request) {
            LinkedHashMap linkedHashMapM;
            k.e(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                linkedHashMapM = new LinkedHashMap();
            } else {
                linkedHashMapM = w.M(request.getTags$okhttp());
            }
            this.tags = linkedHashMapM;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url) {
            k.e(url, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String string = url.toString();
            k.d(string, "url.toString()");
            return url(companion.get(string));
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        k.e(httpUrl, "url");
        k.e(str, "method");
        k.e(headers, "headers");
        k.e(map, "tags");
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    @a
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m112deprecated_body() {
        return this.body;
    }

    @a
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m113deprecated_cacheControl() {
        return cacheControl();
    }

    @a
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m114deprecated_headers() {
        return this.headers;
    }

    @a
    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m115deprecated_method() {
        return this.method;
    }

    @a
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m116deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String str) {
        k.e(str, "name");
        return this.headers.get(str);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i4 = 0;
            for (i iVar : this.headers) {
                int i10 = i4 + 1;
                if (i4 < 0) {
                    g.N();
                    throw null;
                }
                i iVar2 = iVar;
                String str = (String) iVar2.f37638a;
                String str2 = (String) iVar2.f37639b;
                if (i4 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i4 = i10;
            }
            sb2.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        String string = sb2.toString();
        k.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String str) {
        k.e(str, "name");
        return this.headers.values(str);
    }

    public final <T> T tag(Class<? extends T> cls) {
        k.e(cls, "type");
        return cls.cast(this.tags.get(cls));
    }
}
