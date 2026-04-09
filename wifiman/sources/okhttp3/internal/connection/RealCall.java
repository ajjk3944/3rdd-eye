package okhttp3.internal.connection;

import Yg.AbstractC3663g;
import Yg.J;
import ej.C5479c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0001W\u0018\u00002\u00020\u0001:\u0002stB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\"H\u0000¢\u0006\u0004\b)\u0010$J\u001d\u0010,\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J;\u0010:\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u00107\u001a\u0002002\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b<\u0010\u0010J\u0011\u0010>\u001a\u0004\u0018\u00010=H\u0000¢\u0006\u0004\b>\u0010?J\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u0006H\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0006¢\u0006\u0004\bC\u0010!J\u000f\u0010D\u001a\u00020\u0018H\u0000¢\u0006\u0004\bD\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010!R\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010PR\u001a\u0010V\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010aR(\u00104\u001a\u0004\u0018\u0001032\b\u0010c\u001a\u0004\u0018\u0001038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010d\u001a\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010MR(\u0010k\u001a\u0004\u0018\u0001002\b\u0010c\u001a\u0004\u0018\u0001008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bA\u0010h\u001a\u0004\bi\u0010jR\u0016\u0010l\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010MR\u0016\u0010m\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010MR\u0016\u0010n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u0016\u0010o\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u00107\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010hR$\u0010r\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010d\u001a\u0004\bp\u0010f\"\u0004\bq\u00106¨\u0006u"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/Request;", "originalRequest", "", "forWebSocket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "LYg/J;", "f", "()V", "Ljava/io/IOException;", SnmpConfigurator.O_CONTEXT_ENGINE_ID, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "F", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Address;", "i", "(Lokhttp3/HttpUrl;)Lokhttp3/Address;", "", "G", "()Ljava/lang/String;", "h", "()Lokhttp3/internal/connection/RealCall;", "j", "()Lokhttp3/Request;", "cancel", SnmpConfigurator.O_VERSION, "()Z", "Lokhttp3/Response;", "g", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "T", "(Lokhttp3/Callback;)V", SnmpConfigurator.O_TIMEOUT, "request", "newExchangeFinder", "k", "(Lokhttp3/Request;Z)V", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/connection/Exchange;", SnmpConfigurator.O_SECURITY_NAME, "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "Lokhttp3/internal/connection/RealConnection;", "connection", "d", "(Lokhttp3/internal/connection/RealConnection;)V", "exchange", "requestDone", "responseDone", "w", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "x", "Ljava/net/Socket;", SnmpConfigurator.O_AUTH_PASSPHRASE, "()Ljava/net/Socket;", "closeExchange", "l", "(Z)V", "B", "z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/OkHttpClient;", "m", "()Lokhttp3/OkHttpClient;", SnmpConfigurator.O_BIND_ADDRESS, "Lokhttp3/Request;", SnmpConfigurator.O_RETRIES, SnmpConfigurator.O_COMMUNITY, "Z", "p", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/EventListener;", "Lokhttp3/EventListener;", SnmpConfigurator.O_OPERATION, "()Lokhttp3/EventListener;", "eventListener", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "Ljava/lang/Object;", "callStackTrace", "Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinder", "<set-?>", "Lokhttp3/internal/connection/RealConnection;", SnmpConfigurator.O_CONTEXT_NAME, "()Lokhttp3/internal/connection/RealConnection;", "timeoutEarlyExit", "Lokhttp3/internal/connection/Exchange;", "q", "()Lokhttp3/internal/connection/Exchange;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "canceled", "getConnectionToCancel", "D", "connectionToCancel", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealCall implements Call {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Request originalRequest;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean forWebSocket;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final RealConnectionPool connectionPool;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final EventListener eventListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final RealCall$timeout$1 timeout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean executed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Object callStackTrace;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ExchangeFinder exchangeFinder;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private RealConnection connection;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean timeoutEarlyExit;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Exchange interceptorScopedExchange;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean requestBodyOpen;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean responseBodyOpen;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean expectMoreExchanges;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private volatile Exchange exchange;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private volatile RealConnection connectionToCancel;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/Callback;", "responseCallback", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "Lokhttp3/internal/connection/RealCall;", "other", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/util/concurrent/ExecutorService;)V", "run", "()V", "Lokhttp3/Callback;", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/util/concurrent/atomic/AtomicInteger;", SnmpConfigurator.O_COMMUNITY, "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "d", "()Ljava/lang/String;", "host", "()Lokhttp3/internal/connection/RealCall;", "call", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class AsyncCall implements Runnable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Callback responseCallback;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private volatile AtomicInteger callsPerHost;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RealCall f56409c;

        public AsyncCall(RealCall realCall, Callback responseCallback) {
            AbstractC6492s.i(responseCallback, "responseCallback");
            this.f56409c = realCall;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            AbstractC6492s.i(executorService, "executorService");
            Dispatcher dispatcher = this.f56409c.getClient().getDispatcher();
            if (Util.f56223h && Thread.holdsLock(dispatcher)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f56409c.x(interruptedIOException);
                    this.responseCallback.b(this.f56409c, interruptedIOException);
                    this.f56409c.getClient().getDispatcher().f(this);
                }
            } catch (Throwable th2) {
                this.f56409c.getClient().getDispatcher().f(this);
                throw th2;
            }
        }

        /* renamed from: b, reason: from getter */
        public final RealCall getF56409c() {
            return this.f56409c;
        }

        /* renamed from: c, reason: from getter */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String d() {
            return this.f56409c.r().getUrl().getHost();
        }

        public final void e(AsyncCall other) {
            AbstractC6492s.i(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            Dispatcher dispatcher;
            String str = "OkHttp " + this.f56409c.z();
            RealCall realCall = this.f56409c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                realCall.timeout.x();
                try {
                    try {
                        z10 = true;
                    } catch (IOException e11) {
                        z10 = false;
                        e10 = e11;
                    } catch (Throwable th3) {
                        z10 = false;
                        th2 = th3;
                    }
                    try {
                        this.responseCallback.a(realCall, realCall.t());
                        dispatcher = realCall.getClient().getDispatcher();
                    } catch (IOException e12) {
                        e10 = e12;
                        if (z10) {
                            Platform.INSTANCE.g().k("Callback failure for " + realCall.G(), 4, e10);
                        } else {
                            this.responseCallback.b(realCall, e10);
                        }
                        dispatcher = realCall.getClient().getDispatcher();
                        dispatcher.f(this);
                    } catch (Throwable th4) {
                        th2 = th4;
                        realCall.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th2);
                            AbstractC3663g.a(iOException, th2);
                            this.responseCallback.b(realCall, iOException);
                        }
                        throw th2;
                    }
                    dispatcher.f(this);
                } catch (Throwable th5) {
                    realCall.getClient().getDispatcher().f(this);
                    throw th5;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "", "callStackTrace", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Object;", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CallReference extends WeakReference<RealCall> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall referent, Object obj) {
            super(referent);
            AbstractC6492s.i(referent, "referent");
            this.callStackTrace = obj;
        }

        /* renamed from: a, reason: from getter */
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [ej.E, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient client, Request originalRequest, boolean z10) {
        AbstractC6492s.i(client, "client");
        AbstractC6492s.i(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z10;
        this.connectionPool = client.getConnectionPool().getDelegate();
        this.eventListener = client.getEventListenerFactory().a(this);
        ?? r42 = new C5479c() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // ej.C5479c
            protected void D() {
                this.f56411p.cancel();
            }
        };
        r42.h(client.getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r42;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    private final IOException F(IOException cause) {
        if (this.timeoutEarlyExit || !y()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getCanceled() ? "canceled " : "");
        sb2.append(this.forWebSocket ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(z());
        return sb2.toString();
    }

    private final IOException e(IOException e10) throws IOException {
        Socket socketA;
        boolean z10 = Util.f56223h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z10 && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                socketA = A();
            }
            if (this.connection == null) {
                if (socketA != null) {
                    Util.n(socketA);
                }
                this.eventListener.l(this, realConnection);
            } else if (socketA != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionF = F(e10);
        if (e10 != null) {
            EventListener eventListener = this.eventListener;
            AbstractC6492s.f(iOExceptionF);
            eventListener.e(this, iOExceptionF);
        } else {
            this.eventListener.d(this);
        }
        return iOExceptionF;
    }

    private final void f() {
        this.callStackTrace = Platform.INSTANCE.g().i("response.body().close()");
        this.eventListener.f(this);
    }

    private final Address i(HttpUrl url) {
        SSLSocketFactory sSLSocketFactoryP;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (url.getIsHttps()) {
            sSLSocketFactoryP = this.client.P();
            hostnameVerifier = this.client.getHostnameVerifier();
            certificatePinner = this.client.getCertificatePinner();
        } else {
            sSLSocketFactoryP = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(url.getHost(), url.getPort(), this.client.getDns(), this.client.getSocketFactory(), sSLSocketFactoryP, hostnameVerifier, certificatePinner, this.client.getProxyAuthenticator(), this.client.getProxy(), this.client.getProtocols(), this.client.getConnectionSpecs(), this.client.getProxySelector());
    }

    public final Socket A() {
        RealConnection realConnection = this.connection;
        AbstractC6492s.f(realConnection);
        if (Util.f56223h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List listO = realConnection.getCalls();
        Iterator it = listO.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC6492s.d(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listO.remove(i10);
        this.connection = null;
        if (listO.isEmpty()) {
            realConnection.D(System.nanoTime());
            if (this.connectionPool.c(realConnection)) {
                return realConnection.F();
            }
        }
        return null;
    }

    public final boolean B() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        AbstractC6492s.f(exchangeFinder);
        return exchangeFinder.e();
    }

    public final void D(RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    public final void E() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        y();
    }

    @Override // okhttp3.Call
    public void T(Callback responseCallback) {
        AbstractC6492s.i(responseCallback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        f();
        this.client.getDispatcher().a(new AsyncCall(this, responseCallback));
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.b();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.e();
        }
        this.eventListener.g(this);
    }

    public final void d(RealConnection connection) {
        AbstractC6492s.i(connection, "connection");
        if (!Util.f56223h || Thread.holdsLock(connection)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.connection = connection;
            connection.getCalls().add(new CallReference(this, this.callStackTrace));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // okhttp3.Call
    public Response g() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        x();
        f();
        try {
            this.client.getDispatcher().b(this);
            return t();
        } finally {
            this.client.getDispatcher().g(this);
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.Call
    /* renamed from: j, reason: from getter */
    public Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final void k(Request request, boolean newExchangeFinder) {
        AbstractC6492s.i(request, "request");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            J j10 = J.f24997a;
        }
        if (newExchangeFinder) {
            this.exchangeFinder = new ExchangeFinder(this.connectionPool, i(request.getUrl()), this, this.eventListener);
        }
    }

    public final void l(boolean closeExchange) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            J j10 = J.f24997a;
        }
        if (closeExchange && (exchange = this.exchange) != null) {
            exchange.d();
        }
        this.interceptorScopedExchange = null;
    }

    /* renamed from: m, reason: from getter */
    public final OkHttpClient getClient() {
        return this.client;
    }

    /* renamed from: n, reason: from getter */
    public final RealConnection getConnection() {
        return this.connection;
    }

    /* renamed from: o, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* renamed from: q, reason: from getter */
    public final Exchange getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    public final Request r() {
        return this.originalRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response t() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.getInterceptors()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            Zg.AbstractC3689v.C(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            okhttp3.CookieJar r1 = r1.getCookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            okhttp3.Cache r1 = r1.getCache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.f56356a
            r2.add(r0)
            boolean r0 = r11.forWebSocket
            if (r0 != 0) goto L4a
            okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.getNetworkInterceptors()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            Zg.AbstractC3689v.C(r2, r0)
        L4a:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.Request r5 = r11.originalRequest
            okhttp3.OkHttpClient r0 = r11.client
            int r6 = r0.getConnectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.client
            int r7 = r0.getReadTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.client
            int r8 = r0.getWriteTimeoutMillis()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.originalRequest     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            okhttp3.Response r2 = r9.b(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            boolean r3 = r11.getCanceled()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r3 != 0) goto L83
            r11.x(r0)
            return r2
        L83:
            okhttp3.internal.Util.m(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            throw r2     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
        L8e:
            r2 = move-exception
            goto La0
        L90:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.x(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.AbstractC6492s.g(r1, r3)     // Catch: java.lang.Throwable -> L9c
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        La0:
            if (r1 != 0) goto La5
            r11.x(r0)
        La5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.t():okhttp3.Response");
    }

    public final Exchange u(RealInterceptorChain chain) throws IOException {
        AbstractC6492s.i(chain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            J j10 = J.f24997a;
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        AbstractC6492s.f(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.a(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    @Override // okhttp3.Call
    /* renamed from: v, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    public final IOException w(Exchange exchange, boolean requestDone, boolean responseDone, IOException e10) {
        boolean z10;
        boolean z11;
        AbstractC6492s.i(exchange, "exchange");
        if (!AbstractC6492s.d(exchange, this.exchange)) {
            return e10;
        }
        synchronized (this) {
            z10 = false;
            if (requestDone) {
                try {
                    if (!this.requestBodyOpen) {
                        if (responseDone || !this.responseBodyOpen) {
                            z11 = false;
                        }
                    }
                    if (requestDone) {
                        this.requestBodyOpen = false;
                    }
                    if (responseDone) {
                        this.responseBodyOpen = false;
                    }
                    boolean z12 = this.requestBodyOpen;
                    boolean z13 = (z12 || this.responseBodyOpen) ? false : true;
                    if (!z12 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                        z10 = true;
                    }
                    z11 = z10;
                    z10 = z13;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                if (responseDone) {
                }
                z11 = false;
            }
            J j10 = J.f24997a;
        }
        if (z10) {
            this.exchange = null;
            RealConnection realConnection = this.connection;
            if (realConnection != null) {
                realConnection.t();
            }
        }
        return z11 ? e(e10) : e10;
    }

    public final IOException x(IOException e10) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
                        z10 = true;
                    }
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? e(e10) : e10;
    }

    public final String z() {
        return this.originalRequest.getUrl().r();
    }
}
