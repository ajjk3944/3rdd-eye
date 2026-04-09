package okhttp3;

import Zg.AbstractC3689v;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001]B}\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b*\u0010CR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bD\u0010GR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b#\u0010E\u001a\u0004\bI\u0010GR\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\bK\u0010LR\u0017\u0010\u0015\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\bN\u0010LR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0011\u0010Z\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010\\\u001a\u00020S8G¢\u0006\u0006\u001a\u0004\bA\u0010[¨\u0006^"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "protocol", "", "message", "", "code", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "exchange", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "name", "defaultValue", SnmpConfigurator.O_PRIV_PROTOCOL, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Response$Builder;", SnmpConfigurator.O_PRIV_PASSPHRASE, "()Lokhttp3/Response$Builder;", "", "Lokhttp3/Challenge;", "j", "()Ljava/util/List;", "LYg/J;", "close", "()V", "toString", "()Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/Request;", "m0", "()Lokhttp3/Request;", SnmpConfigurator.O_BIND_ADDRESS, "Lokhttp3/Protocol;", "d0", "()Lokhttp3/Protocol;", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "S", "d", "I", "p", "()I", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lokhttp3/Handshake;", SnmpConfigurator.O_VERSION, "()Lokhttp3/Handshake;", "f", "Lokhttp3/Headers;", "J", "()Lokhttp3/Headers;", "g", "Lokhttp3/ResponseBody;", "()Lokhttp3/ResponseBody;", "h", "Lokhttp3/Response;", "T", "()Lokhttp3/Response;", "i", "b0", "k", "n0", "()J", "l", "f0", "m", "Lokhttp3/internal/connection/Exchange;", "s", "()Lokhttp3/internal/connection/Exchange;", "Lokhttp3/CacheControl;", SnmpConfigurator.O_CONTEXT_NAME, "Lokhttp3/CacheControl;", "lazyCacheControl", "", "P", "()Z", "isSuccessful", "()Lokhttp3/CacheControl;", "cacheControl", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Response implements Closeable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Request request;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Protocol protocol;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int code;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Handshake handshake;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Headers headers;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ResponseBody body;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Response networkResponse;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Response cacheResponse;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Response priorResponse;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long sentRequestAtMillis;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long receivedResponseAtMillis;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Exchange exchange;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private CacheControl lazyCacheControl;

    public Response(Request request, Protocol protocol, String message, int i10, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j10, long j11, Exchange exchange) {
        AbstractC6492s.i(request, "request");
        AbstractC6492s.i(protocol, "protocol");
        AbstractC6492s.i(message, "message");
        AbstractC6492s.i(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i10;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j10;
        this.receivedResponseAtMillis = j11;
        this.exchange = exchange;
    }

    public static /* synthetic */ String C(Response response, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return response.y(str, str2);
    }

    /* renamed from: J, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    public final boolean P() {
        int i10 = this.code;
        return 200 <= i10 && i10 < 300;
    }

    /* renamed from: S, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: T, reason: from getter */
    public final Response getNetworkResponse() {
        return this.networkResponse;
    }

    public final Builder Y() {
        return new Builder(this);
    }

    /* renamed from: a, reason: from getter */
    public final ResponseBody getBody() {
        return this.body;
    }

    /* renamed from: b0, reason: from getter */
    public final Response getPriorResponse() {
        return this.priorResponse;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    /* renamed from: d0, reason: from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    /* renamed from: f0, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final CacheControl g() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControlB = CacheControl.INSTANCE.b(this.headers);
        this.lazyCacheControl = cacheControlB;
        return cacheControlB;
    }

    /* renamed from: h, reason: from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    public final List j() {
        String str;
        Headers headers = this.headers;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return AbstractC3689v.l();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.a(headers, str);
    }

    /* renamed from: m0, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* renamed from: n0, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* renamed from: p, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: s, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.getUrl() + '}';
    }

    /* renamed from: v, reason: from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    public final String y(String name, String defaultValue) {
        AbstractC6492s.i(name, "name");
        String strB = this.headers.b(name);
        return strB == null ? defaultValue : strB;
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b0\u0010.J\u0019\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b2\u0010.J\u0017\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u000203H\u0016¢\u0006\u0004\b8\u00106J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010>R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010%\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010c\u001a\u0004\bd\u0010>\"\u0004\be\u0010\u0006R$\u0010/\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010c\u001a\u0004\bf\u0010>\"\u0004\bg\u0010\u0006R$\u00101\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010c\u001a\u0004\bh\u0010>\"\u0004\bi\u0010\u0006R\"\u00104\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u00107\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010j\u001a\u0004\bo\u0010l\"\u0004\bp\u0010nR$\u0010u\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010<¨\u0006v"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "", "name", "LYg/J;", "f", "(Ljava/lang/String;Lokhttp3/Response;)V", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lokhttp3/Request;", "request", SnmpConfigurator.O_RETRIES, "(Lokhttp3/Request;)Lokhttp3/Response$Builder;", "Lokhttp3/Protocol;", "protocol", "p", "(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", "", "code", "g", "(I)Lokhttp3/Response$Builder;", "message", "m", "(Ljava/lang/String;)Lokhttp3/Response$Builder;", "Lokhttp3/Handshake;", "handshake", "i", "(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;", "value", "j", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/Headers;", "headers", "k", "(Lokhttp3/Headers;)Lokhttp3/Response$Builder;", "Lokhttp3/ResponseBody;", "body", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;", "networkResponse", SnmpConfigurator.O_CONTEXT_NAME, "(Lokhttp3/Response;)Lokhttp3/Response$Builder;", "cacheResponse", "d", "priorResponse", SnmpConfigurator.O_OPERATION, "", "sentRequestAtMillis", "s", "(J)Lokhttp3/Response$Builder;", "receivedResponseAtMillis", "q", "Lokhttp3/internal/connection/Exchange;", "deferredTrailers", "l", "(Lokhttp3/internal/connection/Exchange;)V", SnmpConfigurator.O_COMMUNITY, "()Lokhttp3/Response;", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "I", "h", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "exchange", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Request request;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Protocol protocol;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int code;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String message;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Handshake handshake;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Headers.Builder headers;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private ResponseBody body;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Response networkResponse;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Response cacheResponse;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Response priorResponse;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private long sentRequestAtMillis;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseAtMillis;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Exchange exchange;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void e(Response response) {
            if (response != null && response.getBody() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String name, Response response) {
            if (response != null) {
                if (response.getBody() != null) {
                    throw new IllegalArgumentException((name + ".body != null").toString());
                }
                if (response.getNetworkResponse() != null) {
                    throw new IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (response.getCacheResponse() != null) {
                    throw new IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (response.getPriorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((name + ".priorResponse != null").toString());
            }
        }

        public Builder a(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            this.headers.a(name, value);
            return this;
        }

        public Builder b(ResponseBody body) {
            this.body = body;
            return this;
        }

        public Response c() {
            int i10 = this.code;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i10, this.handshake, this.headers.f(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        public Builder d(Response cacheResponse) {
            f("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        public Builder g(int code) {
            this.code = code;
            return this;
        }

        /* renamed from: h, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public Builder i(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder j(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            this.headers.j(name, value);
            return this;
        }

        public Builder k(Headers headers) {
            AbstractC6492s.i(headers, "headers");
            this.headers = headers.g();
            return this;
        }

        public final void l(Exchange deferredTrailers) {
            AbstractC6492s.i(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        public Builder m(String message) {
            AbstractC6492s.i(message, "message");
            this.message = message;
            return this;
        }

        public Builder n(Response networkResponse) {
            f("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public Builder o(Response priorResponse) {
            e(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        public Builder p(Protocol protocol) {
            AbstractC6492s.i(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder q(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public Builder r(Request request) {
            AbstractC6492s.i(request, "request");
            this.request = request;
            return this;
        }

        public Builder s(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public Builder(Response response) {
            AbstractC6492s.i(response, "response");
            this.code = -1;
            this.request = response.getRequest();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.handshake = response.getHandshake();
            this.headers = response.getHeaders().g();
            this.body = response.getBody();
            this.networkResponse = response.getNetworkResponse();
            this.cacheResponse = response.getCacheResponse();
            this.priorResponse = response.getPriorResponse();
            this.sentRequestAtMillis = response.getSentRequestAtMillis();
            this.receivedResponseAtMillis = response.getReceivedResponseAtMillis();
            this.exchange = response.getExchange();
        }
    }
}
