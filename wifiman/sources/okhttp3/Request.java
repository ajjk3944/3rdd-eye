package okhttp3;

import Yg.s;
import Zg.AbstractC3689v;
import Zg.U;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00016BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b\u001e\u0010*R*\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b%\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010.R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b\"\u00104¨\u00067"}, d2 = {"Lokhttp3/Request;", "", "Lokhttp3/HttpUrl;", "url", "", "method", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "", "Ljava/lang/Class;", "tags", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "name", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/lang/String;)Ljava/util/List;", "T", "type", "j", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/Request$Builder;", "i", "()Lokhttp3/Request$Builder;", "toString", "()Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/HttpUrl;", "k", "()Lokhttp3/HttpUrl;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "h", SnmpConfigurator.O_COMMUNITY, "Lokhttp3/Headers;", "f", "()Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "()Lokhttp3/RequestBody;", "Ljava/util/Map;", "()Ljava/util/Map;", "Lokhttp3/CacheControl;", "Lokhttp3/CacheControl;", "lazyCacheControl", "", "g", "()Z", "isHttps", "()Lokhttp3/CacheControl;", "cacheControl", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String method;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Headers headers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final RequestBody body;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map tags;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private CacheControl lazyCacheControl;

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map tags) {
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(method, "method");
        AbstractC6492s.i(headers, "headers");
        AbstractC6492s.i(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    /* renamed from: a, reason: from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    public final CacheControl b() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlB = CacheControl.INSTANCE.b(this.headers);
        this.lazyCacheControl = cacheControlB;
        return cacheControlB;
    }

    /* renamed from: c, reason: from getter */
    public final Map getTags() {
        return this.tags;
    }

    public final String d(String name) {
        AbstractC6492s.i(name, "name");
        return this.headers.b(name);
    }

    public final List e(String name) {
        AbstractC6492s.i(name, "name");
        return this.headers.k(name);
    }

    /* renamed from: f, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    public final boolean g() {
        return this.url.getIsHttps();
    }

    /* renamed from: h, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final Builder i() {
        return new Builder(this);
    }

    public final Object j(Class type) {
        AbstractC6492s.i(type, "type");
        return type.cast(this.tags.get(type));
    }

    /* renamed from: k, reason: from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (s sVar : this.headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                s sVar2 = sVar;
                String str = (String) sVar2.a();
                String str2 = (String) sVar2.c();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u001d2\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001e2\b\u0010 \u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0018\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0015\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R2\u0010@\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0004\u0012\u00020\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)V", "Lokhttp3/HttpUrl;", "url", "i", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", "", "h", "(Ljava/lang/String;)Lokhttp3/Request$Builder;", "name", "value", SnmpConfigurator.O_COMMUNITY, "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", SnmpConfigurator.O_AUTH_PROTOCOL, "f", "Lokhttp3/Headers;", "headers", "d", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", "method", "Lokhttp3/RequestBody;", "body", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "T", "Ljava/lang/Class;", "type", "tag", "g", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", SnmpConfigurator.O_BIND_ADDRESS, "()Lokhttp3/Request;", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "tags", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private HttpUrl url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String method;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Headers.Builder headers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private RequestBody body;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Map tags;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public Builder a(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            this.headers.a(name, value);
            return this;
        }

        public Request b() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.f(), this.body, Util.W(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder c(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            this.headers.j(name, value);
            return this;
        }

        public Builder d(Headers headers) {
            AbstractC6492s.i(headers, "headers");
            this.headers = headers.g();
            return this;
        }

        public Builder e(String method, RequestBody body) {
            AbstractC6492s.i(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (body == null) {
                if (HttpMethod.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public Builder f(String name) {
            AbstractC6492s.i(name, "name");
            this.headers.i(name);
            return this;
        }

        public Builder g(Class type, Object tag) {
            AbstractC6492s.i(type, "type");
            if (tag == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map map = this.tags;
                Object objCast = type.cast(tag);
                AbstractC6492s.f(objCast);
                map.put(type, objCast);
            }
            return this;
        }

        public Builder h(String url) {
            AbstractC6492s.i(url, "url");
            if (t.N(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                AbstractC6492s.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (t.N(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String strSubstring2 = url.substring(4);
                AbstractC6492s.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return i(HttpUrl.INSTANCE.d(url));
        }

        public Builder i(HttpUrl url) {
            AbstractC6492s.i(url, "url");
            this.url = url;
            return this;
        }

        public Builder(Request request) {
            Map mapX;
            AbstractC6492s.i(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.getUrl();
            this.method = request.getMethod();
            this.body = request.getBody();
            if (request.getTags().isEmpty()) {
                mapX = new LinkedHashMap();
            } else {
                mapX = U.x(request.getTags());
            }
            this.tags = mapX;
            this.headers = request.getHeaders().g();
        }
    }
}
