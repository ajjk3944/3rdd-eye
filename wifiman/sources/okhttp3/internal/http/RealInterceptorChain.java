package okhttp3.internal.http;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0003\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010!R\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b1\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b2\u0010\u0018R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u00064"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/internal/connection/RealCall;", "call", "", "Lokhttp3/Interceptor;", "interceptors", "", "index", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/Request;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Connection;", SnmpConfigurator.O_COMMUNITY, "()Lokhttp3/Connection;", SnmpConfigurator.O_AUTH_PROTOCOL, "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "d", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;", "Lokhttp3/Call;", "()Lokhttp3/Call;", "j", "()Lokhttp3/Request;", "Lokhttp3/Response;", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Request;)Lokhttp3/Response;", "Lokhttp3/internal/connection/RealCall;", "g", "()Lokhttp3/internal/connection/RealCall;", "Ljava/util/List;", "I", "Lokhttp3/internal/connection/Exchange;", "i", "()Lokhttp3/internal/connection/Exchange;", "Lokhttp3/Request;", "l", "f", "h", "k", "m", "calls", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RealCall call;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List interceptors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Exchange exchange;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Request request;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int readTimeoutMillis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int writeTimeoutMillis;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int calls;

    public RealInterceptorChain(RealCall call, List interceptors, int i10, Exchange exchange, Request request, int i11, int i12, int i13) {
        AbstractC6492s.i(call, "call");
        AbstractC6492s.i(interceptors, "interceptors");
        AbstractC6492s.i(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i10;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i11;
        this.readTimeoutMillis = i12;
        this.writeTimeoutMillis = i13;
    }

    public static /* synthetic */ RealInterceptorChain f(RealInterceptorChain realInterceptorChain, int i10, Exchange exchange, Request request, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = realInterceptorChain.index;
        }
        if ((i14 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        Exchange exchange2 = exchange;
        if ((i14 & 4) != 0) {
            request = realInterceptorChain.request;
        }
        Request request2 = request;
        if ((i14 & 8) != 0) {
            i11 = realInterceptorChain.connectTimeoutMillis;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = realInterceptorChain.readTimeoutMillis;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = realInterceptorChain.writeTimeoutMillis;
        }
        return realInterceptorChain.e(i10, exchange2, request2, i15, i16, i13);
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: a, reason: from getter */
    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public Response b(Request request) {
        AbstractC6492s.i(request, "request");
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.calls++;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder().g(request.getUrl())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (this.calls != 1) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain realInterceptorChainF = f(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        Interceptor interceptor = (Interceptor) this.interceptors.get(this.index);
        Response responseA = interceptor.a(realInterceptorChainF);
        if (responseA == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.exchange != null && this.index + 1 < this.interceptors.size() && realInterceptorChainF.calls != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (responseA.getBody() != null) {
            return responseA;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public Connection c() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection();
        }
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain d(int timeout, TimeUnit unit) {
        AbstractC6492s.i(unit, "unit");
        if (this.exchange == null) {
            return f(this, 0, null, null, 0, Util.k("readTimeout", timeout, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public final RealInterceptorChain e(int index, Exchange exchange, Request request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        AbstractC6492s.i(request, "request");
        return new RealInterceptorChain(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    /* renamed from: g, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    /* renamed from: h, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: i, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: j, reason: from getter */
    public Request getRequest() {
        return this.request;
    }

    public final int k() {
        return this.readTimeoutMillis;
    }

    public final Request l() {
        return this.request;
    }

    /* renamed from: m, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
