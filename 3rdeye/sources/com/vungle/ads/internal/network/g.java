package com.vungle.ads.internal.network;

import R9.AbstractC1564a;
import R9.C1568e;
import R9.t;
import U9.D;
import U9.E;
import U9.F;
import U9.t;
import U9.u;
import U9.v;
import U9.x;
import U9.y;
import U9.z;
import a6.C1653b;
import a6.C1654c;
import a6.C1655d;
import a6.C1657f;
import a6.C1658g;
import a6.C1659h;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import c9.C2092m;
import c9.C2097r;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.vungle.ads.C4055m;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleAds;
import com.vungle.ads.f0;
import com.vungle.ads.i0;
import com.vungle.ads.internal.load.c;
import com.vungle.ads.internal.protos.Sdk$MetricBatch;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKErrorBatch;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.k;
import d6.C4277a;
import e6.C4321c;
import e6.EnumC4319a;
import ia.C4468d;
import ia.q;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import p9.l;
import y9.n;

/* compiled from: VungleApiClient.kt */
/* loaded from: classes2.dex */
public final class g {
    private static final String BASE_URL;
    public static final b Companion;
    private static final String MANUFACTURER_AMAZON = "Amazon";
    private static final String TAG = "VungleApiClient";
    private static VungleAds.WrapperFramework WRAPPER_FRAMEWORK_SELECTED;
    private static String headerUa;
    private static final AbstractC1564a json;
    private static final Set<u> logInterceptors;
    private static final Set<u> networkInterceptors;
    private C1654c advertisingInfo;
    private VungleApi api;
    private C1655d appBody;
    private final Context applicationContext;
    private C1659h baseDeviceInfo;
    private final C4277a filePreferences;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private final com.vungle.ads.internal.platform.b platform;
    private u responseInterceptor;
    private Map<String, Long> retryAfterDataMap;
    private final InterfaceC2000g signalManager$delegate;
    private String uaString;

    /* compiled from: VungleApiClient.kt */
    public static final class a extends m implements l<C1568e, C1992A> {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
        }
    }

    /* compiled from: VungleApiClient.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String defaultHeader() {
            return ("Amazon".equals(Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/").concat("7.4.1");
        }

        public final String getBASE_URL$vungle_ads_release() {
            return g.BASE_URL;
        }

        public final String getHeaderUa() {
            return g.headerUa;
        }

        public final VungleAds.WrapperFramework getWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release() {
            return g.WRAPPER_FRAMEWORK_SELECTED;
        }

        public final void reset$vungle_ads_release() {
            setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(null);
            setHeaderUa(defaultHeader());
        }

        public final void setHeaderUa(String str) {
            kotlin.jvm.internal.l.f(str, "<set-?>");
            g.headerUa = str;
        }

        public final void setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(VungleAds.WrapperFramework wrapperFramework) {
            g.WRAPPER_FRAMEWORK_SELECTED = wrapperFramework;
        }

        private b() {
        }
    }

    /* compiled from: VungleApiClient.kt */
    public static final class c implements u {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        public static final a Companion = new a(null);
        private static final String GZIP = "gzip";

        /* compiled from: VungleApiClient.kt */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            private a() {
            }
        }

        /* compiled from: VungleApiClient.kt */
        public static final class b extends D {
            final /* synthetic */ C4468d $output;
            final /* synthetic */ D $requestBody;

            public b(D d10, C4468d c4468d) {
                this.$requestBody = d10;
                this.$output = c4468d;
            }

            @Override // U9.D
            public long contentLength() {
                return this.$output.f38643c;
            }

            @Override // U9.D
            public v contentType() {
                return this.$requestBody.contentType();
            }

            @Override // U9.D
            public void writeTo(ia.f sink) throws IOException {
                kotlin.jvm.internal.l.f(sink, "sink");
                sink.P(this.$output.u0());
            }
        }

        private final D gzip(D d10) throws Throwable {
            C4468d c4468d = new C4468d();
            ia.v vVarB = q.b(new ia.m(c4468d));
            d10.writeTo(vVarB);
            vVarB.close();
            return new b(d10, c4468d);
        }

        @Override // U9.u
        public E intercept(u.a chain) throws Throwable {
            kotlin.jvm.internal.l.f(chain, "chain");
            z zVarA = chain.A();
            D d10 = zVarA.f12798d;
            if (d10 == null || zVarA.f12797c.c(CONTENT_ENCODING) != null) {
                return chain.a(zVarA);
            }
            z.a aVarA = zVarA.a();
            aVarA.c(CONTENT_ENCODING, GZIP);
            aVarA.d(zVarA.f12796b, gzip(d10));
            return chain.a(aVarA.b());
        }
    }

    /* compiled from: VungleApiClient.kt */
    public static final class d extends ProxySelector {
        @Override // java.net.ProxySelector
        public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
            try {
                ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
            } catch (Exception unused) {
            }
        }

        @Override // java.net.ProxySelector
        public List<Proxy> select(URI uri) {
            try {
                List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                kotlin.jvm.internal.l.e(listSelect, "{\n                      …ri)\n                    }");
                return listSelect;
            } catch (Exception unused) {
                return E.u.G(Proxy.NO_PROXY);
            }
        }
    }

    /* compiled from: VungleApiClient.kt */
    public static final class e implements K0.b<String> {
        final /* synthetic */ f0 $uaMetric;
        final /* synthetic */ g this$0;

        public e(f0 f0Var, g gVar) {
            this.$uaMetric = f0Var;
            this.this$0 = gVar;
        }

        @Override // K0.b
        public void accept(String str) {
            if (str == null) {
                k.Companion.e(g.TAG, "Cannot Get UserAgent. Setting Default Device UserAgent");
                C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 7, "Fail to get user agent.", (String) null, (String) null, (String) null, 28, (Object) null);
            } else {
                this.$uaMetric.markEnd();
                C4055m.INSTANCE.logMetric$vungle_ads_release(this.$uaMetric.getMetricType(), (58 & 2) != 0 ? 0L : this.$uaMetric.calculateIntervalDuration(), (58 & 4) != 0 ? null : null, (58 & 8) != 0 ? null : null, (58 & 16) != 0 ? null : null, (58 & 32) != 0 ? null : null);
                this.this$0.uaString = str;
            }
        }
    }

    /* compiled from: VungleApiClient.kt */
    public static final class f implements com.vungle.ads.internal.network.b<Void> {
        final /* synthetic */ C4055m.b $requestListener;

        public f(C4055m.b bVar) {
            this.$requestListener = bVar;
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a<Void> aVar, Throwable th) {
            this.$requestListener.onFailure();
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a<Void> aVar, com.vungle.ads.internal.network.d<Void> dVar) {
            this.$requestListener.onSuccess();
        }
    }

    /* compiled from: VungleApiClient.kt */
    /* renamed from: com.vungle.ads.internal.network.g$g, reason: collision with other inner class name */
    public static final class C0385g implements com.vungle.ads.internal.network.b<Void> {
        final /* synthetic */ C4055m.b $requestListener;

        public C0385g(C4055m.b bVar) {
            this.$requestListener = bVar;
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a<Void> aVar, Throwable th) {
            this.$requestListener.onFailure();
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a<Void> aVar, com.vungle.ads.internal.network.d<Void> dVar) {
            this.$requestListener.onSuccess();
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class i extends m implements InterfaceC5480a<com.vungle.ads.internal.signals.b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.b, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.signals.b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.b.class);
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        BASE_URL = "https://config.ads.vungle.com/";
        headerUa = bVar.defaultHeader();
        networkInterceptors = new HashSet();
        logInterceptors = new HashSet();
        json = t.a(a.INSTANCE);
    }

    public g(Context applicationContext, com.vungle.ads.internal.platform.b platform, C4277a filePreferences) {
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.l.f(platform, "platform");
        kotlin.jvm.internal.l.f(filePreferences, "filePreferences");
        this.applicationContext = applicationContext;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = System.getProperty("http.agent");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = C2001h.a(b9.i.SYNCHRONIZED, new i(applicationContext));
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new u() { // from class: com.vungle.ads.internal.network.f
            @Override // U9.u
            public final E intercept(u.a aVar) {
                return g.m85responseInterceptor$lambda0(this.f23811a, (Z9.f) aVar);
            }
        };
        x.a aVar = new x.a();
        u interceptor = this.responseInterceptor;
        kotlin.jvm.internal.l.f(interceptor, "interceptor");
        ArrayList arrayList = aVar.f12776c;
        arrayList.add(interceptor);
        aVar.f12785m = new d();
        x xVar = new x(aVar);
        arrayList.add(new c());
        x xVar2 = new x(aVar);
        this.api = new com.vungle.ads.internal.network.h(xVar);
        this.gzipApi = new com.vungle.ads.internal.network.h(xVar2);
    }

    private final String bodyToString(D d10) {
        try {
            C4468d c4468d = new C4468d();
            if (d10 != null) {
                d10.writeTo(c4468d);
                return c4468d.p0();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private final E defaultErrorResponse(z request) {
        E.a aVar = new E.a();
        kotlin.jvm.internal.l.f(request, "request");
        aVar.f12575a = request;
        aVar.f12577c = 500;
        y protocol = y.HTTP_1_1;
        kotlin.jvm.internal.l.f(protocol, "protocol");
        aVar.f12576b = protocol;
        aVar.f12578d = "Server is busy";
        F.b bVar = F.Companion;
        Pattern pattern = v.f12729d;
        v vVarB = v.a.b("application/json; charset=utf-8");
        bVar.getClass();
        aVar.f12581g = F.b.b("{\"Error\":\"Server is busy\"}", vVarB);
        return aVar.a();
    }

    private final C1659h getBasicDeviceBody(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.l.e(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.l.e(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.l.e(RELEASE, "RELEASE");
        C1659h c1659h = new C1659h(MANUFACTURER, MODEL, RELEASE, com.vungle.ads.internal.platform.a.Companion.getCarrierName$vungle_ads_release(context), "Amazon".equals(MANUFACTURER) ? "amazon" : ConstantDeviceInfo.APP_PLATFORM, displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (C1659h.c) null, 1792, (kotlin.jvm.internal.g) null);
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            c1659h.setUa(userAgent);
            initUserAgentLazy();
            C1654c advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            return c1659h;
        } catch (Exception e4) {
            k.Companion.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e4.getLocalizedMessage());
            return c1659h;
        }
    }

    private final String getConnectionType() {
        if (E.u.q(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NONE";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? (type == 1 || type == 6) ? "WIFI" : type != 7 ? type != 9 ? "UNKNOWN" : "ETHERNET" : "BLUETOOTH" : "MOBILE";
    }

    private final C1659h getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    private final C1657f.h getExtBody(boolean z10) {
        String strGenerateSignals;
        String configExtension = com.vungle.ads.internal.f.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.filePreferences.getString("config_extension");
        }
        if (z10) {
            try {
                strGenerateSignals = getSignalManager().generateSignals();
            } catch (Exception e4) {
                k.Companion.e(TAG, "Couldn't convert signals for sending. Error: " + e4.getMessage());
            }
        } else {
            strGenerateSignals = null;
        }
        if ((configExtension == null || configExtension.length() == 0) && (strGenerateSignals == null || strGenerateSignals.length() == 0)) {
            return null;
        }
        return new C1657f.h(configExtension, strGenerateSignals, Long.valueOf(com.vungle.ads.internal.f.INSTANCE.configLastValidatedTimestamp()));
    }

    public static /* synthetic */ C1657f.h getExtBody$default(g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return gVar.getExtBody(z10);
    }

    private final String getPlacementID(D d10) {
        List<String> placements;
        try {
            AbstractC1564a abstractC1564a = json;
            C1657f.i request = ((C1657f) abstractC1564a.a(E.u.L(abstractC1564a.f11782b, kotlin.jvm.internal.x.b(C1657f.class)), bodyToString(d10))).getRequest();
            if (request == null || (placements = request.getPlacements()) == null) {
                return "";
            }
            String str = placements.get(0);
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    private final com.vungle.ads.internal.signals.b getSignalManager() {
        return (com.vungle.ads.internal.signals.b) this.signalManager$delegate.getValue();
    }

    private final C1657f.j getUserBody(boolean z10) {
        C1657f.j jVar = new C1657f.j((C1657f.C0221f) null, (C1657f.c) null, (C1657f.d) null, (Y5.c) null, (C1657f.g) null, 31, (kotlin.jvm.internal.g) null);
        C4321c c4321c = C4321c.INSTANCE;
        jVar.setGdpr(new C1657f.C0221f(c4321c.getConsentStatus(), c4321c.getConsentSource(), c4321c.getConsentTimestamp(), c4321c.getConsentMessageVersion()));
        jVar.setCcpa(new C1657f.c(c4321c.getCcpaStatus()));
        if (c4321c.getCoppaStatus() != EnumC4319a.COPPA_NOTSET) {
            jVar.setCoppa(new C1657f.d(c4321c.getCoppaStatus().getValue()));
        }
        if (c4321c.shouldSendTCFString()) {
            jVar.setIab(new C1657f.g(c4321c.getIABTCFString()));
        }
        if (z10) {
            jVar.setFpd(VungleAds.firstPartyData);
        }
        return jVar;
    }

    public static /* synthetic */ C1657f.j getUserBody$default(g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return gVar.getUserBody(z10);
    }

    private final void initUserAgentLazy() {
        f0 f0Var = new f0(Sdk$SDKMetric.b.USER_AGENT_LOAD_DURATION_MS);
        f0Var.markStart();
        this.platform.getUserAgentLazy(new e(f0Var, this));
    }

    public static /* synthetic */ C1657f requestBody$default(g gVar, boolean z10, boolean z11, int i10, Object obj) throws IllegalStateException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return gVar.requestBody(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final E m85responseInterceptor$lambda0(g this$0, u.a chain) throws NumberFormatException {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(chain, "chain");
        z zVarA = chain.A();
        try {
            try {
                E eA = chain.a(zVarA);
                String strC = eA.f12567g.c("Retry-After");
                if (strC == null || strC.length() == 0) {
                    return eA;
                }
                try {
                    long j4 = Long.parseLong(strC);
                    if (j4 <= 0) {
                        return eA;
                    }
                    String strB = zVarA.f12795a.b();
                    long jCurrentTimeMillis = (j4 * 1000) + System.currentTimeMillis();
                    if (!n.T(strB, "ads")) {
                        return eA;
                    }
                    String placementID = this$0.getPlacementID(zVarA.f12798d);
                    if (placementID.length() <= 0) {
                        return eA;
                    }
                    this$0.retryAfterDataMap.put(placementID, Long.valueOf(jCurrentTimeMillis));
                    return eA;
                } catch (Exception unused) {
                    k.Companion.d(TAG, "Retry-After value is not an valid value");
                    return eA;
                }
            } catch (Exception e4) {
                k.Companion.e(TAG, "Exception: " + e4.getMessage() + " for " + zVarA.f12795a);
                return this$0.defaultErrorResponse(zVarA);
            }
        } catch (OutOfMemoryError unused2) {
            k.Companion.e(TAG, "OOM for " + zVarA.f12795a);
            return this$0.defaultErrorResponse(zVarA);
        }
    }

    public final void addPlaySvcAvailabilityInCookie(boolean z10) {
        this.filePreferences.put("isPlaySvcAvailable", z10).apply();
    }

    public final boolean checkIsRetryAfterActive(String placementID) {
        kotlin.jvm.internal.l.f(placementID, "placementID");
        Long l5 = this.retryAfterDataMap.get(placementID);
        if ((l5 != null ? l5.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    public final com.vungle.ads.internal.network.a<C1658g> config() throws IOException {
        C1655d c1655d = this.appBody;
        if (c1655d == null) {
            return null;
        }
        C1657f c1657f = new C1657f(getDeviceBody$vungle_ads_release(true), c1655d, getUserBody$default(this, false, 1, null), (C1657f.h) null, (C1657f.i) null, 24, (kotlin.jvm.internal.g) null);
        C1657f.h extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            c1657f.setExt(extBody$default);
        }
        com.vungle.ads.internal.util.f fVar = com.vungle.ads.internal.util.f.INSTANCE;
        String strConcat = BASE_URL;
        if (!fVar.isValidUrl(strConcat)) {
            strConcat = "https://config.ads.vungle.com/";
        }
        if (!n.T(strConcat, "/")) {
            strConcat = strConcat.concat("/");
        }
        return this.api.config(headerUa, strConcat + "config", c1657f);
    }

    public final C1655d getAppBody$vungle_ads_release() {
        return this.appBody;
    }

    public final String getConnectionTypeDetail(int i10) {
        if (i10 == 1) {
            return "gprs";
        }
        if (i10 == 2) {
            return "edge";
        }
        if (i10 == 20) {
            return "5g";
        }
        switch (i10) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (i10) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    public final synchronized C1659h getDeviceBody$vungle_ads_release(boolean z10) throws IllegalStateException {
        C1659h c1659hCopy$default;
        String str;
        try {
            C1659h basicDeviceBody = this.baseDeviceInfo;
            if (basicDeviceBody == null) {
                basicDeviceBody = getBasicDeviceBody(this.applicationContext);
                this.baseDeviceInfo = basicDeviceBody;
            }
            c1659hCopy$default = C1659h.copy$default(basicDeviceBody, null, null, null, null, null, 0, 0, null, null, null, null, 2047, null);
            C1659h.c cVar = new C1659h.c(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, 262143, (kotlin.jvm.internal.g) null);
            C1654c advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
            C1654c c1654c = this.advertisingInfo;
            Boolean boolValueOf = c1654c != null ? Boolean.valueOf(c1654c.getLimitAdTracking()) : null;
            C4321c c4321c = C4321c.INSTANCE;
            if (c4321c.shouldSendAdIds()) {
                if (advertisingId != null) {
                    if ("Amazon".equals(Build.MANUFACTURER)) {
                        cVar.setAmazonAdvertisingId(advertisingId);
                    } else {
                        cVar.setGaid(advertisingId);
                    }
                    c1659hCopy$default.setIfa(advertisingId);
                } else {
                    c1659hCopy$default.setIfa("");
                }
            }
            if (z10 || !c4321c.shouldSendAdIds()) {
                c1659hCopy$default.setIfa(null);
                cVar.setGaid(null);
                cVar.setAmazonAdvertisingId(null);
            }
            Boolean bool = Boolean.TRUE;
            boolean zHasSystemFeature = false;
            c1659hCopy$default.setLmt(kotlin.jvm.internal.l.b(boolValueOf, bool) ? 1 : 0);
            cVar.setGooglePlayServicesAvailable(bool.equals(isGooglePlayServicesAvailable()));
            if (c4321c.allowDeviceIDFromTCF() != C4321c.a.DISABLE_ID) {
                String appSetId = this.platform.getAppSetId();
                if (appSetId != null) {
                    cVar.setAppSetId(appSetId);
                }
                Integer appSetIdScope = this.platform.getAppSetIdScope();
                if (appSetIdScope != null) {
                    cVar.setAppSetIdScope(Integer.valueOf(appSetIdScope.intValue()));
                }
            }
            Intent intentRegisterReceiver = this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    cVar.setBatteryLevel(intExtra / intExtra2);
                }
                int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra3 == -1) {
                    str = "UNKNOWN";
                } else if (intExtra3 == 2 || intExtra3 == 5) {
                    int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                    str = intExtra4 != 1 ? intExtra4 != 2 ? intExtra4 != 4 ? "BATTERY_PLUGGED_OTHERS" : "BATTERY_PLUGGED_WIRELESS" : "BATTERY_PLUGGED_USB" : "BATTERY_PLUGGED_AC";
                } else {
                    str = "NOT_CHARGING";
                }
            } else {
                str = "UNKNOWN";
            }
            cVar.setBatteryState(str);
            Object systemService = this.applicationContext.getSystemService("power");
            kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            cVar.setBatterySaverEnabled(((PowerManager) systemService).isPowerSaveMode() ? 1 : 0);
            String connectionType = getConnectionType();
            if (connectionType != null) {
                cVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                cVar.setConnectionTypeDetail(connectionTypeDetail);
            }
            cVar.setLocale(Locale.getDefault().toString());
            cVar.setLanguage(Locale.getDefault().getLanguage());
            cVar.setTimeZone(TimeZone.getDefault().getID());
            cVar.setVolumeLevel(this.platform.getVolumeLevel());
            cVar.setSoundEnabled(this.platform.isSoundEnabled() ? 1 : 0);
            if ("Amazon".equals(Build.MANUFACTURER)) {
                zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else {
                Object systemService2 = this.applicationContext.getSystemService("uimode");
                kotlin.jvm.internal.l.d(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
                    zHasSystemFeature = true;
                }
            }
            cVar.setTv(zHasSystemFeature);
            cVar.setSideloadEnabled(this.platform.isSideLoaded());
            cVar.setSdCardAvailable(this.platform.isSdCardPresent() ? 1 : 0);
            c1659hCopy$default.setUa(this.uaString);
            c1659hCopy$default.setExt(cVar);
        } catch (Throwable th) {
            throw th;
        }
        return c1659hCopy$default;
    }

    public final VungleApi getGzipApi$vungle_ads_release() {
        return this.gzipApi;
    }

    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            kotlin.jvm.internal.l.e(googleApiAvailabilityLight, "getInstance()");
            boolean z10 = googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0;
            boolValueOf = Boolean.valueOf(z10);
            addPlaySvcAvailabilityInCookie(z10);
            return boolValueOf;
        } catch (Exception unused) {
            k.Companion.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            k.Companion.w(TAG, "Play services Not available");
            boolValueOf = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
            } catch (Exception unused3) {
                k.Companion.w(TAG, "Failure to write GPS availability to DB");
            }
            return boolValueOf;
        }
    }

    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean("isPlaySvcAvailable");
    }

    public final u getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(String placementID) {
        kotlin.jvm.internal.l.f(placementID, "placementID");
        Long l5 = this.retryAfterDataMap.get(placementID);
        if (l5 != null) {
            return l5.longValue();
        }
        return 0L;
    }

    public final synchronized void initialize(String appId) {
        PackageInfo packageInfo;
        try {
            kotlin.jvm.internal.l.f(appId, "appId");
            this.api.setAppId(appId);
            this.gzipApi.setAppId(appId);
            String str = "1.0";
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                    kotlin.jvm.internal.l.e(packageInfo, "{\n                    ap…      )\n                }");
                } else {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                    kotlin.jvm.internal.l.e(packageInfo, "{\n                    ap…      )\n                }");
                }
                String str2 = packageInfo.versionName;
                kotlin.jvm.internal.l.e(str2, "packageInfo.versionName");
                str = str2;
            } catch (Exception unused) {
            }
            this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
            String packageName = this.applicationContext.getPackageName();
            kotlin.jvm.internal.l.e(packageName, "applicationContext.packageName");
            this.appBody = new C1655d(packageName, str, appId);
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    public final c.b pingTPAT(String url) {
        U9.t tVarA;
        E eRaw;
        kotlin.jvm.internal.l.f(url, "url");
        if (url.length() != 0) {
            Integer numValueOf = null;
            try {
                t.a aVar = new t.a();
                aVar.c(null, url);
                tVarA = aVar.a();
            } catch (IllegalArgumentException unused) {
                tVarA = null;
            }
            if (tVarA != null) {
                try {
                    if (!(Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(url).getHost()) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) && URLUtil.isHttpUrl(url)) {
                        return new c.b(121, "Clear Text Traffic is blocked", null, false, 12, null);
                    }
                    try {
                        String str = this.uaString;
                        if (str == null) {
                            str = "";
                        }
                        com.vungle.ads.internal.network.d<Void> dVarExecute = this.api.pingTPAT(str, url).execute();
                        if (dVarExecute != null && dVarExecute.isSuccessful()) {
                            return null;
                        }
                        if (dVarExecute != null && (eRaw = dVarExecute.raw()) != null) {
                            numValueOf = Integer.valueOf(eRaw.f12565e);
                        }
                        if (!C2097r.k0(C2092m.W(301, 302, 307, 308), numValueOf)) {
                            return new c.b(121, "Tpat ping was not successful", null, false, 12, null);
                        }
                        return new c.b(29, "Tpat ping was redirected with code " + numValueOf, null, false, 12, null);
                    } catch (Exception e4) {
                        String localizedMessage = e4.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = "IOException";
                        }
                        return new c.b(121, localizedMessage, null, false, 12, null);
                    }
                } catch (MalformedURLException e10) {
                    String localizedMessage2 = e10.getLocalizedMessage();
                    if (localizedMessage2 == null) {
                        localizedMessage2 = "MalformedURLException";
                    }
                    return new c.b(121, localizedMessage2, null, true, 4, null);
                }
            }
        }
        return new c.b(121, "Invalid URL : ".concat(url), null, true, 4, null);
    }

    public final void reportErrors(BlockingQueue<Sdk$SDKError.a> errors, C4055m.b requestListener) {
        kotlin.jvm.internal.l.f(errors, "errors");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        String errorLoggingEndpoint = com.vungle.ads.internal.f.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint == null || errorLoggingEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        for (Sdk$SDKError.a aVar : errors) {
            String connectionType = getConnectionType();
            if (connectionType != null) {
                aVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                aVar.setConnectionTypeDetail(connectionTypeDetail);
                aVar.setConnectionTypeDetailAndroid(connectionTypeDetail);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Sdk$SDKError.a> it = errors.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().build());
        }
        Sdk$SDKErrorBatch sdk$SDKErrorBatchBuild = Sdk$SDKErrorBatch.newBuilder().addAllErrors(arrayList).build();
        D.a aVar2 = D.Companion;
        byte[] byteArray = sdk$SDKErrorBatchBuild.toByteArray();
        kotlin.jvm.internal.l.e(byteArray, "batch.toByteArray()");
        Pattern pattern = v.f12729d;
        v vVarB = v.a.b("application/x-protobuf");
        int length = sdk$SDKErrorBatchBuild.toByteArray().length;
        aVar2.getClass();
        this.api.sendErrors(headerUa, errorLoggingEndpoint, D.a.a(vVarB, byteArray, 0, length)).enqueue(new f(requestListener));
    }

    public final void reportMetrics(BlockingQueue<Sdk$SDKMetric.a> metrics, C4055m.b requestListener) {
        kotlin.jvm.internal.l.f(metrics, "metrics");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        String metricsEndpoint = com.vungle.ads.internal.f.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        for (Sdk$SDKMetric.a aVar : metrics) {
            String connectionType = getConnectionType();
            if (connectionType != null) {
                aVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                aVar.setConnectionTypeDetail(connectionTypeDetail);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Sdk$SDKMetric.a> it = metrics.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().build());
        }
        Sdk$MetricBatch sdk$MetricBatchBuild = Sdk$MetricBatch.newBuilder().addAllMetrics(arrayList).build();
        D.a aVar2 = D.Companion;
        Pattern pattern = v.f12729d;
        v vVarB = v.a.b("application/x-protobuf");
        byte[] byteArray = sdk$MetricBatchBuild.toByteArray();
        kotlin.jvm.internal.l.e(byteArray, "batch.toByteArray()");
        this.api.sendMetrics(headerUa, metricsEndpoint, D.a.c(aVar2, vVarB, byteArray, 0, 12)).enqueue(new C0385g(requestListener));
    }

    public final com.vungle.ads.internal.network.a<C1653b> requestAd(String placement, i0 i0Var) throws IllegalStateException {
        kotlin.jvm.internal.l.f(placement, "placement");
        com.vungle.ads.internal.f fVar = com.vungle.ads.internal.f.INSTANCE;
        String adsEndpoint = fVar.getAdsEndpoint();
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            return null;
        }
        C1657f c1657fRequestBody = requestBody(!fVar.signalsDisabled(), fVar.fpdEnabled());
        C1657f.i iVar = new C1657f.i(E.u.G(placement), (C1657f.b) null, (Long) null, (String) null, (String) null, (String) null, 62, (kotlin.jvm.internal.g) null);
        if (i0Var != null) {
            iVar.setAdSize(new C1657f.b(i0Var.getWidth(), i0Var.getHeight()));
        }
        c1657fRequestBody.setRequest(iVar);
        return this.gzipApi.ads(headerUa, adsEndpoint, c1657fRequestBody);
    }

    public final C1657f requestBody(boolean z10, boolean z11) throws IllegalStateException {
        C1657f c1657f = new C1657f(getDeviceBody(), this.appBody, getUserBody(z11), (C1657f.h) null, (C1657f.i) null, 24, (kotlin.jvm.internal.g) null);
        C1657f.h extBody = getExtBody(z10);
        if (extBody != null) {
            c1657f.setExt(extBody);
        }
        return c1657f;
    }

    public final com.vungle.ads.internal.network.a<Void> ri(C1657f.i request) {
        C1655d c1655d;
        kotlin.jvm.internal.l.f(request, "request");
        String riEndpoint = com.vungle.ads.internal.f.INSTANCE.getRiEndpoint();
        if (riEndpoint == null || riEndpoint.length() == 0 || (c1655d = this.appBody) == null) {
            return null;
        }
        C1657f c1657f = new C1657f(getDeviceBody(), c1655d, getUserBody$default(this, false, 1, null), (C1657f.h) null, (C1657f.i) null, 24, (kotlin.jvm.internal.g) null);
        c1657f.setRequest(request);
        C1657f.h extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            c1657f.setExt(extBody$default);
        }
        return this.api.ri(headerUa, riEndpoint, c1657f);
    }

    public final void sendAdMarkup(String adMarkup, String endpoint) {
        kotlin.jvm.internal.l.f(adMarkup, "adMarkup");
        kotlin.jvm.internal.l.f(endpoint, "endpoint");
        VungleApi vungleApi = this.api;
        D.a aVar = D.Companion;
        Pattern pattern = v.f12729d;
        v vVarB = v.a.b("application/json");
        aVar.getClass();
        vungleApi.sendAdMarkup(endpoint, D.a.b(adMarkup, vVarB)).enqueue(new h());
    }

    public final void setAppBody$vungle_ads_release(C1655d c1655d) {
        this.appBody = c1655d;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        kotlin.jvm.internal.l.f(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(u uVar) {
        kotlin.jvm.internal.l.f(uVar, "<set-?>");
        this.responseInterceptor = uVar;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(Map<String, Long> map) {
        kotlin.jvm.internal.l.f(map, "<set-?>");
        this.retryAfterDataMap = map;
    }

    public final String getConnectionTypeDetail() {
        if (E.u.q(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return getConnectionTypeDetail(activeNetworkInfo.getSubtype());
        }
        return "unknown";
    }

    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    /* compiled from: VungleApiClient.kt */
    public static final class h implements com.vungle.ads.internal.network.b<Void> {
        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a<Void> aVar, Throwable th) {
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a<Void> aVar, com.vungle.ads.internal.network.d<Void> dVar) {
        }
    }
}
