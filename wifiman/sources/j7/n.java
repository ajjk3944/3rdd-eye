package J7;

import I7.C2997g;
import K7.c;
import Mj.x;
import Y6.r;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudError;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestResponse;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseConnection;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseIce;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseTokenFetch;
import com.ubnt.teleport.unifi.util.moshi.ForcedStringValueAdapter;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes3.dex */
public abstract class n implements K7.c {

    /* renamed from: g, reason: collision with root package name */
    public static final a f9874g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final OkHttpClient f9875a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpUrl f9876b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f9877c;

    /* renamed from: d, reason: collision with root package name */
    private final K7.a f9878d;

    /* renamed from: e, reason: collision with root package name */
    private final Y6.h f9879e;

    /* renamed from: f, reason: collision with root package name */
    private final Y6.h f9880f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9881a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y6.r invoke() {
            return new r.a().b(new ForcedStringValueAdapter()).a(K7.b.f10465a.a()).a(com.ubnt.teleport.unifi.cloud.api.a.f39589a.a()).c();
        }
    }

    public static final class c implements HttpLoggingInterceptor.Logger {

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f9882a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f9882a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f9882a;
            }
        }

        c() {
        }

        @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
        public void a(String message) {
            AbstractC6492s.i(message, "message");
            N7.a.b(new a(message));
        }
    }

    public static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC6835l f9883a;

        public d(InterfaceC6835l function) {
            AbstractC6492s.i(function, "function");
            this.f9883a = function;
        }

        @Override // kg.InterfaceC6469f
        public final /* synthetic */ void accept(Object obj) {
            this.f9883a.invoke(obj);
        }
    }

    public static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC6835l f9884a;

        public e(InterfaceC6835l function) {
            AbstractC6492s.i(function, "function");
            this.f9884a = function;
        }

        @Override // kg.n
        public final /* synthetic */ Object apply(Object obj) {
            return this.f9884a.invoke(obj);
        }
    }

    public n(OkHttpClient sharedOkhttpClient, String url) {
        AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
        AbstractC6492s.i(url, "url");
        this.f9875a = sharedOkhttpClient;
        HttpUrl httpUrlF = HttpUrl.INSTANCE.f(url);
        if (httpUrlF == null) {
            throw new IllegalArgumentException("Teleport Cloud URL is invalid - " + url);
        }
        this.f9876b = httpUrlF;
        this.f9877c = Yg.n.b(b.f9881a);
        this.f9878d = (K7.a) new x.b().d(httpUrlF).a(Nj.g.d()).b(Pj.a.g(k())).g(l()).e().b(K7.a.class);
        this.f9879e = k().c(com.ubnt.teleport.unifi.cloud.api.a.class);
        this.f9880f = k().c(ApiTeleportCloudError.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public K7.a j() {
        return this.f9878d;
    }

    protected final Y6.r k() {
        Object value = this.f9877c.getValue();
        AbstractC6492s.h(value, "<get-moshi>(...)");
        return (Y6.r) value;
    }

    protected final OkHttpClient l() {
        OkHttpClient.Builder builderE = this.f9875a.E();
        if (C2997g.f8908a.d()) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new c());
            httpLoggingInterceptor.c(HttpLoggingInterceptor.Level.BODY);
            builderE.b(httpLoggingInterceptor);
        }
        return builderE.c();
    }

    public void m(ApiTeleportCloudRequestResponse apiTeleportCloudRequestResponse) throws TeleportCloud.Error.InvalidResponse {
        c.a.a(this, apiTeleportCloudRequestResponse);
    }

    public void n(ApiTeleportCloudResponseConnection apiTeleportCloudResponseConnection) throws TeleportCloud.Error.InvalidResponse {
        c.a.b(this, apiTeleportCloudResponseConnection);
    }

    public void o(ApiTeleportCloudResponseIce apiTeleportCloudResponseIce) throws TeleportCloud.Error.InvalidResponse {
        c.a.c(this, apiTeleportCloudResponseIce);
    }

    public void p(ApiTeleportCloudResponseTokenFetch apiTeleportCloudResponseTokenFetch) throws TeleportCloud.Error.InvalidResponse {
        c.a.d(this, apiTeleportCloudResponseTokenFetch);
    }
}
