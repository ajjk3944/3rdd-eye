package com.ui.wifiman.model.ubiquiti.uisp;

import Mj.x;
import Yd.ApiUispAuthParams;
import Yd.ApiUispAuthResponse;
import Yd.ApiUispIspInfo;
import Yd.ApiUispSpeedtestReportParams;
import Yg.m;
import com.ui.wifiman.model.ubiquiti.uisp.UispController;
import com.ui.wifiman.model.ubiquiti.uisp.a;
import com.ui.wifiman.model.ubiquiti.uisp.b;
import fd.InterfaceC5808b;
import fe.AbstractC5817h;
import gg.AbstractC5912b;
import gg.i;
import gg.z;
import id.C6143b;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.p;
import kotlin.text.t;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import pd.s;

/* loaded from: classes4.dex */
public final class b implements UispController {

    /* renamed from: i, reason: collision with root package name */
    public static final c f43949i = new c(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wifiman.model.ubiquiti.uisp.a f43950a;

    /* renamed from: b, reason: collision with root package name */
    private final P7.a f43951b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5808b f43952c;

    /* renamed from: d, reason: collision with root package name */
    private final i f43953d;

    /* renamed from: e, reason: collision with root package name */
    private final i f43954e;

    /* renamed from: f, reason: collision with root package name */
    private final i f43955f;

    /* renamed from: g, reason: collision with root package name */
    private final i f43956g;

    /* renamed from: h, reason: collision with root package name */
    private final i f43957h;

    private static final class a implements Interceptor {

        /* renamed from: b, reason: collision with root package name */
        public static final C1506a f43958b = new C1506a(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f43959a;

        /* renamed from: com.ui.wifiman.model.ubiquiti.uisp.b$a$a, reason: collision with other inner class name */
        public static final class C1506a {
            public /* synthetic */ C1506a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1506a() {
            }
        }

        public a(String authToken) {
            AbstractC6492s.i(authToken, "authToken");
            this.f43959a = authToken;
        }

        @Override // okhttp3.Interceptor
        public Response a(Interceptor.Chain chain) {
            AbstractC6492s.i(chain, "chain");
            return chain.b(chain.getRequest().i().a("x-auth-token", this.f43959a).b());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    static final class d implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f43970a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.C1505a f43971b;

            a(b bVar, a.C1505a c1505a) {
                this.f43970a = bVar;
                this.f43971b = c1505a;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(ApiUispAuthResponse authResponse) {
                AbstractC6492s.i(authResponse, "authResponse");
                if (authResponse.getToken() != null) {
                    return new C6556a(this.f43970a.o(this.f43971b.a(), authResponse.getToken()));
                }
                throw UispController.Error.TokenUnavailable.f43914a;
            }
        }

        /* renamed from: com.ui.wifiman.model.ubiquiti.uisp.b$d$b, reason: collision with other inner class name */
        static final class C1508b implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1508b f43972a = new C1508b();

            /* renamed from: com.ui.wifiman.model.ubiquiti.uisp.b$d$b$a */
            static final class a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                public static final a f43973a = new a();

                a() {
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(Throwable it) {
                    AbstractC6492s.i(it, "it");
                    Z7.b.j("UISP Authentication failed", it, null, 4, null);
                }
            }

            C1508b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(i it) {
                AbstractC6492s.i(it, "it");
                return it.f0(a.f43973a).R(5000L, TimeUnit.MILLISECONDS);
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            a.C1505a c1505a = (a.C1505a) c6556a.a();
            if (c1505a != null) {
                i iVarP1 = b.this.o(c1505a.a(), null).c(new ApiUispAuthParams(c1505a.c(), c1505a.b())).O(Gg.a.d()).A(new a(b.this, c1505a)).W().z1(new C6556a(null)).p1(C1508b.f43972a);
                AbstractC6492s.f(iVarP1);
                return iVarP1;
            }
            i iVarK0 = i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43974a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!(it.b() == null));
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f43975a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Wc.b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Uisp ISP info emission", null, 2, null);
        }
    }

    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UispController.b f43976a;

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f43977a = new a();

            a() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                Z7.b.j("UISP Controller speedtest report failed: " + it.getMessage(), null, null, 6, null);
            }
        }

        /* renamed from: com.ui.wifiman.model.ubiquiti.uisp.b$g$b, reason: collision with other inner class name */
        public /* synthetic */ class C1509b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43978a;

            static {
                int[] iArr = new int[s.values().length];
                try {
                    iArr[s.INTERNET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s.CONSOLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s.LOCAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[s.APP_TO_APP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f43978a = iArr;
            }
        }

        g(UispController.b bVar) {
            this.f43976a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Z7.b.h("UISP Controller speedtest reported", null, 2, null);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Yg.s sVar) {
            ApiUispSpeedtestReportParams.a aVar;
            AbstractC6492s.i(sVar, "<destruct>");
            C6556a c6556a = (C6556a) sVar.a();
            C6556a c6556a2 = (C6556a) sVar.c();
            if (c6556a.b() == null) {
                return AbstractC5912b.D(UispController.Error.ControllerApiUnavailable.f43913a);
            }
            Object objB = c6556a.b();
            AbstractC6492s.f(objB);
            Xd.a aVar2 = (Xd.a) objB;
            String strC = this.f43976a.c();
            inet.ipaddr.g gVarD = this.f43976a.d();
            String strA0 = gVarD != null ? gVarD.a0() : null;
            Long lA = this.f43976a.a();
            Long lG = this.f43976a.g();
            int i10 = C1509b.f43978a[this.f43976a.f().ordinal()];
            if (i10 == 1) {
                aVar = ApiUispSpeedtestReportParams.a.INTERNET;
            } else {
                if (i10 != 2 && i10 != 3 && i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = ApiUispSpeedtestReportParams.a.LOCAL_DEVICE;
            }
            String apiId = aVar.getApiId();
            String strE = this.f43976a.e();
            Long lB = this.f43976a.b();
            Long lH = this.f43976a.h();
            a.C1505a c1505a = (a.C1505a) c6556a2.b();
            ApiUispSpeedtestReportParams apiUispSpeedtestReportParams = new ApiUispSpeedtestReportParams(strC, strA0, lA, lG, apiId, strE, lB, lH, c1505a != null ? c1505a.b() : null);
            Z7.b.h("UISP Controller speedtest report: " + apiUispSpeedtestReportParams, null, 2, null);
            return aVar2.b(apiUispSpeedtestReportParams).W(Gg.a.d()).x(new InterfaceC6464a() { // from class: com.ui.wifiman.model.ubiquiti.uisp.c
                @Override // kg.InterfaceC6464a
                public final void run() {
                    b.g.c();
                }
            }).z(a.f43977a);
        }
    }

    public b(com.ui.wifiman.model.ubiquiti.uisp.a discovery, P7.a analytics, InterfaceC5808b sharedOkHttpClientHolder) {
        AbstractC6492s.i(discovery, "discovery");
        AbstractC6492s.i(analytics, "analytics");
        AbstractC6492s.i(sharedOkHttpClientHolder, "sharedOkHttpClientHolder");
        this.f43950a = discovery;
        this.f43951b = analytics;
        this.f43952c = sharedOkHttpClientHolder;
        i iVarI1 = discovery.a().I1(new d());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        i iVarI2 = n9.c.c(iVarI1, new InterfaceC6835l() { // from class: Xd.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ui.wifiman.model.ubiquiti.uisp.b.j(this.f24306a, (C6556a) obj);
            }
        }).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43953d = iVarI2;
        i iVarI22 = iVarI2.N0(e.f43974a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43954e = iVarI22;
        i iVarI23 = AbstractC5817h.l(iVarI2, 5000L, false, new InterfaceC6835l() { // from class: Xd.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ui.wifiman.model.ubiquiti.uisp.b.l((a) obj);
            }
        }, 2, null).W().f0(f.f43975a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f43955f = iVarI23;
        i iVarI24 = AbstractC5817h.j(iVarI23, new InterfaceC6835l() { // from class: Xd.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ui.wifiman.model.ubiquiti.uisp.b.k(this.f24307a, (ApiUispIspInfo) obj);
            }
        }).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f43956g = iVarI24;
        i iVarI25 = AbstractC5817h.j(iVarI23, new InterfaceC6835l() { // from class: Xd.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ui.wifiman.model.ubiquiti.uisp.b.m(this.f24308a, (ApiUispIspInfo) obj);
            }
        }).W().o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f43957h = iVarI25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b j(b bVar, C6556a c6556a) {
        AbstractC6492s.i(c6556a, "<destruct>");
        if (((Xd.a) c6556a.a()) != null) {
            return bVar.n();
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.f(abstractC5912bM);
        return abstractC5912bM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UispController.a k(b bVar, ApiUispIspInfo it) {
        AbstractC6492s.i(it, "it");
        String name = it.getName();
        String logoUrl = it.getLogoUrl();
        String phoneNumber = it.getPhoneNumber();
        String email = it.getEmail();
        String webpage = it.getWebpage();
        return new UispController.a(name, logoUrl, phoneNumber, email, webpage != null ? q(bVar, webpage, null, 1, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z l(Xd.a it) {
        AbstractC6492s.i(it, "it");
        return it.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UispController.c m(b bVar, ApiUispIspInfo it) {
        AbstractC6492s.i(it, "it");
        String name = it.getName();
        String logoUrl = it.getLogoUrl();
        String serverUrl = it.getServerUrl();
        String strP = serverUrl != null ? bVar.p(serverUrl, "http") : null;
        if (strP != null) {
            return new UispController.c(logoUrl, name, strP);
        }
        throw new IllegalStateException("server is not specified");
    }

    private final AbstractC5912b n() {
        return this.f43951b.d(new P7.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Xd.a o(String str, String str2) throws NoSuchAlgorithmException, SecurityException, KeyManagementException {
        OkHttpClient.Builder builderE = this.f43952c.a().E();
        C6143b.f49144a.a(builderE);
        HttpUrl httpUrlF = HttpUrl.INSTANCE.f(str);
        AbstractC6492s.f(httpUrlF);
        OkHttpClient.Builder builderA = builderE.a(new C1507b(httpUrlF, false, false, false, 14, null));
        if (str2 != null) {
            builderA.a(new a(str2));
        }
        Object objB = new x.b().c(str).g(builderA.c()).a(Nj.g.e()).b(Oj.a.f()).e().b(Xd.a.class);
        AbstractC6492s.h(objB, "create(...)");
        return (Xd.a) objB;
    }

    private final String p(String str, String str2) {
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        HttpUrl httpUrlF = companion.f(str);
        if (httpUrlF == null) {
            httpUrlF = companion.f(str2 + "://" + str);
        }
        if (httpUrlF != null) {
            return httpUrlF.getUrl();
        }
        return null;
    }

    static /* synthetic */ String q(b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "https";
        }
        return bVar.p(str, str2);
    }

    @Override // com.ui.wifiman.model.ubiquiti.uisp.UispController
    public i a() {
        return this.f43956g;
    }

    @Override // com.ui.wifiman.model.ubiquiti.uisp.UispController
    public i b() {
        return this.f43954e;
    }

    @Override // com.ui.wifiman.model.ubiquiti.uisp.UispController
    public AbstractC5912b c(UispController.b report) {
        AbstractC6492s.i(report, "report");
        AbstractC5912b abstractC5912bT = Ag.c.f753a.a(this.f43953d, this.f43950a.a()).o0().t(new g(report));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    @Override // com.ui.wifiman.model.ubiquiti.uisp.UispController
    public i d() {
        return this.f43957h;
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.uisp.b$b, reason: collision with other inner class name */
    public static final class C1507b implements Interceptor {

        /* renamed from: i, reason: collision with root package name */
        public static final a f43960i = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final HttpUrl f43961a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f43962b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f43963c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f43964d;

        /* renamed from: e, reason: collision with root package name */
        private final String f43965e;

        /* renamed from: f, reason: collision with root package name */
        private final m f43966f;

        /* renamed from: g, reason: collision with root package name */
        private final m f43967g;

        /* renamed from: h, reason: collision with root package name */
        private final m f43968h;

        /* renamed from: com.ui.wifiman.model.ubiquiti.uisp.b$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public C1507b(HttpUrl baseUrl, boolean z10, boolean z11, boolean z12) {
            AbstractC6492s.i(baseUrl, "baseUrl");
            this.f43961a = baseUrl;
            this.f43962b = z10;
            this.f43963c = z11;
            this.f43964d = z12;
            String host = baseUrl.getHost();
            if (t.W(host, "%", false, 2, null)) {
                host = "[" + new p("[\\[\\]]").n(new p("%\\w+").n(host, ""), "") + "]";
            }
            this.f43965e = host;
            this.f43966f = Yg.n.b(new InterfaceC6824a() { // from class: Xd.j
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return b.C1507b.h(this.f24309a);
                }
            });
            this.f43967g = Yg.n.b(new InterfaceC6824a() { // from class: Xd.k
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return b.C1507b.i(this.f24310a);
                }
            });
            this.f43968h = Yg.n.b(new InterfaceC6824a() { // from class: Xd.l
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return b.C1507b.j(this.f24311a);
                }
            });
        }

        private final String e() {
            return (String) this.f43966f.getValue();
        }

        private final String f() {
            return (String) this.f43967g.getValue();
        }

        private final String g() {
            return (String) this.f43968h.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String h(C1507b c1507b) {
            return c1507b.f43965e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String i(C1507b c1507b) {
            return c1507b.f43961a.getScheme() + "://" + c1507b.f43965e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j(C1507b c1507b) {
            return c1507b.f43961a.getScheme() + "://" + c1507b.f43965e + MqttTopic.TOPIC_LEVEL_SEPARATOR;
        }

        @Override // okhttp3.Interceptor
        public Response a(Interceptor.Chain chain) {
            AbstractC6492s.i(chain, "chain");
            Request.Builder builderI = chain.getRequest().i();
            if (this.f43962b) {
                builderI.a("Host", e());
            }
            if (this.f43963c) {
                builderI.a("Origin", f());
            }
            if (this.f43964d) {
                builderI.a("Referer", g());
            }
            builderI.a("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            return chain.b(builderI.b());
        }

        public /* synthetic */ C1507b(HttpUrl httpUrl, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(httpUrl, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? true : z11, (i10 & 8) != 0 ? true : z12);
        }
    }
}
