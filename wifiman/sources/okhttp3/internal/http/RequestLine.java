package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Request;Ljava/net/Proxy$Type;)Z", "", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Request;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "url", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestLine {

    /* renamed from: a, reason: collision with root package name */
    public static final RequestLine f56478a = new RequestLine();

    private RequestLine() {
    }

    private final boolean b(Request request, Proxy.Type proxyType) {
        return !request.g() && proxyType == Proxy.Type.HTTP;
    }

    public final String a(Request request, Proxy.Type proxyType) {
        AbstractC6492s.i(request, "request");
        AbstractC6492s.i(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.getMethod());
        sb2.append(' ');
        RequestLine requestLine = f56478a;
        if (requestLine.b(request, proxyType)) {
            sb2.append(request.getUrl());
        } else {
            sb2.append(requestLine.c(request.getUrl()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(HttpUrl url) {
        AbstractC6492s.i(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
