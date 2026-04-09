package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "<init>", "()V", "", "method", "", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/lang/String;)Z", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "d", SnmpConfigurator.O_COMMUNITY, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpMethod {

    /* renamed from: a, reason: collision with root package name */
    public static final HttpMethod f56465a = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean b(String method) {
        AbstractC6492s.i(method, "method");
        return (AbstractC6492s.d(method, "GET") || AbstractC6492s.d(method, "HEAD")) ? false : true;
    }

    public static final boolean e(String method) {
        AbstractC6492s.i(method, "method");
        return AbstractC6492s.d(method, "POST") || AbstractC6492s.d(method, "PUT") || AbstractC6492s.d(method, "PATCH") || AbstractC6492s.d(method, "PROPPATCH") || AbstractC6492s.d(method, "REPORT");
    }

    public final boolean a(String method) {
        AbstractC6492s.i(method, "method");
        return AbstractC6492s.d(method, "POST") || AbstractC6492s.d(method, "PATCH") || AbstractC6492s.d(method, "PUT") || AbstractC6492s.d(method, "DELETE") || AbstractC6492s.d(method, "MOVE");
    }

    public final boolean c(String method) {
        AbstractC6492s.i(method, "method");
        return !AbstractC6492s.d(method, "PROPFIND");
    }

    public final boolean d(String method) {
        AbstractC6492s.i(method, "method");
        return AbstractC6492s.d(method, "PROPFIND");
    }
}
