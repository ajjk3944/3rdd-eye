package fb;

import eb.InterfaceC5446j;
import eb.InterfaceC5447k;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* loaded from: classes3.dex */
public final class q extends WebSocketListener implements InterfaceC5446j {

    /* renamed from: f, reason: collision with root package name */
    public static final a f47282f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Map f47283g = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final String f47284a;

    /* renamed from: b, reason: collision with root package name */
    private final CookieJar f47285b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5447k f47286c;

    /* renamed from: d, reason: collision with root package name */
    private final long f47287d;

    /* renamed from: e, reason: collision with root package name */
    private final WebSocket f47288e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public q(String url, CookieJar cookieJar, SSLSocketFactory sSLSocketFactory, u trustManager, InterfaceC5447k listener, long j10) {
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(cookieJar, "cookieJar");
        AbstractC6492s.i(trustManager, "trustManager");
        AbstractC6492s.i(listener, "listener");
        this.f47284a = url;
        this.f47285b = cookieJar;
        this.f47286c = listener;
        this.f47287d = j10;
        Map map = f47283g;
        Object objF = map.get(url);
        if (objF == null) {
            Sj.a.f20830a.a("newSocket: " + url, new Object[0]);
            Request.Builder builderA = new Request.Builder().h(url).a("x-client-platform", "ucore-android");
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderM = builder.O(10L, timeUnit).e(5L, timeUnit).Q(10L, timeUnit).M(j10, timeUnit);
            if (sSLSocketFactory != null) {
                builderM.P(sSLSocketFactory, trustManager);
            }
            builderM.L(C5803a.f47231a);
            builderM.f(cookieJar);
            objF = builderM.c().F(builderA.b(), this);
            map.put(url, objF);
        }
        this.f47288e = (WebSocket) objF;
    }

    private final void g() {
        Sj.a.f20830a.a("onClosed: " + this.f47284a, new Object[0]);
        if (f47283g.remove(this.f47284a) != null) {
            this.f47286c.d();
        }
    }

    @Override // okhttp3.WebSocketListener
    public void a(WebSocket webSocket, int i10, String reason) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(reason, "reason");
        Sj.a.f20830a.a("onClosed " + this.f47284a + " code: " + i10 + " reason: " + reason, new Object[0]);
        g();
    }

    @Override // okhttp3.WebSocketListener
    public void b(WebSocket webSocket, int i10, String reason) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(reason, "reason");
        Sj.a.f20830a.a("onClosing " + this.f47284a + " code: " + i10 + " reason: " + reason, new Object[0]);
        g();
    }

    @Override // okhttp3.WebSocketListener
    public void c(WebSocket webSocket, Throwable t10, Response response) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(t10, "t");
        Sj.a.f20830a.b(t10, "onFailure " + this.f47284a + " response: " + response, new Object[0]);
        f47283g.remove(this.f47284a);
        this.f47286c.a(t10);
    }

    @Override // eb.InterfaceC5446j
    public void close() {
        Sj.a.f20830a.a("close: " + this.f47284a, new Object[0]);
        this.f47288e.c(1000, null);
        f47283g.remove(this.f47284a);
    }

    @Override // okhttp3.WebSocketListener
    public void d(WebSocket webSocket, ej.h bytes) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(bytes, "bytes");
        this.f47286c.b(bytes.a());
    }

    @Override // okhttp3.WebSocketListener
    public void e(WebSocket webSocket, String text) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(text, "text");
        InterfaceC5447k interfaceC5447k = this.f47286c;
        byte[] bytes = text.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        AbstractC6492s.h(byteBufferWrap, "wrap(...)");
        interfaceC5447k.b(byteBufferWrap);
    }

    @Override // okhttp3.WebSocketListener
    public void f(WebSocket webSocket, Response response) {
        AbstractC6492s.i(webSocket, "webSocket");
        AbstractC6492s.i(response, "response");
        Sj.a.f20830a.a("onOpen " + this.f47284a, new Object[0]);
        this.f47286c.c();
    }
}
