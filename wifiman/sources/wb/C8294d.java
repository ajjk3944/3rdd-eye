package wb;

import Mj.x;
import Nj.g;
import Qj.k;
import Yg.J;
import Zg.AbstractC3689v;
import aj.AbstractC3868b;
import aj.C3871e;
import aj.w;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.conscrypt.PSKKeyManager;
import zb.C8725a;

/* renamed from: wb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8294d {

    /* renamed from: i, reason: collision with root package name */
    public static final a f64790i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final g f64791j;

    /* renamed from: k, reason: collision with root package name */
    private static final k f64792k;

    /* renamed from: a, reason: collision with root package name */
    private final String f64793a;

    /* renamed from: b, reason: collision with root package name */
    private final CookieJar f64794b;

    /* renamed from: c, reason: collision with root package name */
    private final List f64795c;

    /* renamed from: d, reason: collision with root package name */
    private final SSLSocketFactory f64796d;

    /* renamed from: e, reason: collision with root package name */
    private final X509TrustManager f64797e;

    /* renamed from: f, reason: collision with root package name */
    private final HostnameVerifier f64798f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC3868b f64799g;

    /* renamed from: h, reason: collision with root package name */
    private final HttpLoggingInterceptor.Level f64800h;

    /* renamed from: wb.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        g gVarF = g.f(Gg.a.d());
        AbstractC6492s.h(gVarF, "createWithScheduler(...)");
        f64791j = gVarF;
        k kVarF = k.f();
        AbstractC6492s.h(kVarF, "create(...)");
        f64792k = kVarF;
    }

    public C8294d(String url, CookieJar cookieJar, List interceptors, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, HostnameVerifier hostnameVerifier, AbstractC3868b json, InterfaceC8291a interfaceC8291a, HttpLoggingInterceptor.Level httpLogLevel) {
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(cookieJar, "cookieJar");
        AbstractC6492s.i(interceptors, "interceptors");
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(httpLogLevel, "httpLogLevel");
        this.f64793a = url;
        this.f64794b = cookieJar;
        this.f64795c = interceptors;
        this.f64796d = sSLSocketFactory;
        this.f64797e = x509TrustManager;
        this.f64798f = hostnameVerifier;
        this.f64799g = json;
        this.f64800h = httpLogLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(C3871e Json) {
        AbstractC6492s.i(Json, "$this$Json");
        Json.d(true);
        Json.f(true);
        Json.c("name");
        return J.f24997a;
    }

    private final OkHttpClient e() {
        X509TrustManager x509TrustManager;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        SSLSocketFactory sSLSocketFactory = this.f64796d;
        if (sSLSocketFactory != null && (x509TrustManager = this.f64797e) != null) {
            builder.P(sSLSocketFactory, x509TrustManager);
        }
        HostnameVerifier hostnameVerifier = this.f64798f;
        if (hostnameVerifier != null) {
            builder.L(hostnameVerifier);
        }
        builder.f(this.f64794b);
        Iterator it = this.f64795c.iterator();
        while (it.hasNext()) {
            builder.a((Interceptor) it.next());
        }
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: wb.b
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public final void a(String str) {
                C8294d.f(this.f64789c, str);
            }
        });
        httpLoggingInterceptor.c(this.f64800h);
        builder.a(httpLoggingInterceptor).a(new C8725a());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.e(30L, timeUnit).O(30L, timeUnit).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C8294d c8294d, String message) {
        AbstractC6492s.i(message, "message");
        c8294d.getClass();
    }

    private final x g() {
        x xVarE = new x.b().c(this.f64793a).b(f64792k).b(H5.c.a(this.f64799g, MediaType.INSTANCE.a("application/json"))).a(f64791j).g(e()).e();
        AbstractC6492s.h(xVarE, "build(...)");
        return xVarE;
    }

    public final x d() {
        return g();
    }

    public /* synthetic */ C8294d(String str, CookieJar cookieJar, List list, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, HostnameVerifier hostnameVerifier, AbstractC3868b abstractC3868b, InterfaceC8291a interfaceC8291a, HttpLoggingInterceptor.Level level, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CookieJar.f55998b : cookieJar, (i10 & 4) != 0 ? AbstractC3689v.l() : list, (i10 & 8) != 0 ? null : sSLSocketFactory, (i10 & 16) != 0 ? null : x509TrustManager, (i10 & 32) != 0 ? null : hostnameVerifier, (i10 & 64) != 0 ? w.b(null, new InterfaceC6835l() { // from class: wb.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C8294d.c((C3871e) obj);
            }
        }, 1, null) : abstractC3868b, (i10 & 128) == 0 ? interfaceC8291a : null, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? HttpLoggingInterceptor.Level.BASIC : level);
    }
}
