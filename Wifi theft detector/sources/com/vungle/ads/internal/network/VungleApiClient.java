package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.UserAgentError;
import com.vungle.ads.a0;
import com.vungle.ads.b0;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk$MetricBatch;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKErrorBatch;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.z;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import l9.l;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.d;
import q7.e;
import s9.r;
import y8.s;
import z8.q;
import z9.k;

/* loaded from: classes3.dex */
public final class VungleApiClient {

    @NotNull
    private static final String TAG = "VungleApiClient";

    @Nullable
    private q7.b advertisingInfo;

    @NotNull
    private VungleApi api;

    @Nullable
    private q7.c appBody;

    @NotNull
    private final Context applicationContext;

    @Nullable
    private q7.e baseDeviceInfo;

    @NotNull
    private final t7.b filePreferences;

    @NotNull
    private VungleApi gzipApi;

    @Nullable
    private Boolean isGooglePlayServicesAvailable;

    @NotNull
    private final com.vungle.ads.internal.platform.d platform;

    @NotNull
    private Interceptor responseInterceptor;

    @NotNull
    private Map<String, Long> retryAfterDataMap;

    @NotNull
    private final y8.h signalManager$delegate;

    @Nullable
    private String uaString;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String BASE_URL = "https://config.ads.vungle.com/";

    @NotNull
    private static final Set<Interceptor> networkInterceptors = new HashSet();

    @NotNull
    private static final Set<Interceptor> logInterceptors = new HashSet();

    @NotNull
    private static final z9.a json = k.b(null, new l() { // from class: com.vungle.ads.internal.network.VungleApiClient$Companion$json$1
        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((z9.c) obj);
            return s.f25199a;
        }

        public final void invoke(@NotNull z9.c Json) {
            p.e(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
        }
    }, 1, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$ConnectionTypeDetail;", "", "<init>", "()V", "Companion", "a", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.f21920a)
    public @interface ConnectionTypeDetail {

        @NotNull
        public static final String CDMA_1XRTT = "cdma_1xrtt";

        @NotNull
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";

        @NotNull
        public static final String CDMA_EVDO_A = "cdma_evdo_a";

        @NotNull
        public static final String CDMA_EVDO_B = "cdma_evdo_b";

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @NotNull
        public static final String EDGE = "edge";

        @NotNull
        public static final String FIFTH_G = "5g";

        @NotNull
        public static final String GPRS = "gprs";

        @NotNull
        public static final String HRPD = "hrpd";

        @NotNull
        public static final String HSDPA = "hsdpa";

        @NotNull
        public static final String HSUPA = "hsupa";

        @NotNull
        public static final String LTE = "lte";

        @NotNull
        public static final String UNKNOWN = "unknown";

        @NotNull
        public static final String WCDMA = "wcdma";

        /* renamed from: com.vungle.ads.internal.network.VungleApiClient$ConnectionTypeDetail$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            public static final String CDMA_1XRTT = "cdma_1xrtt";

            @NotNull
            public static final String CDMA_EVDO_0 = "cdma_evdo_0";

            @NotNull
            public static final String CDMA_EVDO_A = "cdma_evdo_a";

            @NotNull
            public static final String CDMA_EVDO_B = "cdma_evdo_b";

            @NotNull
            public static final String EDGE = "edge";

            @NotNull
            public static final String FIFTH_G = "5g";

            @NotNull
            public static final String GPRS = "gprs";

            @NotNull
            public static final String HRPD = "hrpd";

            @NotNull
            public static final String HSDPA = "hsdpa";

            @NotNull
            public static final String HSUPA = "hsupa";

            @NotNull
            public static final String LTE = "lte";

            @NotNull
            public static final String UNKNOWN = "unknown";

            @NotNull
            public static final String WCDMA = "wcdma";

            private Companion() {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        @NotNull
        public final String getBASE_URL$vungle_ads_release() {
            return VungleApiClient.BASE_URL;
        }

        public final void reset$vungle_ads_release() {
            j.INSTANCE.reset();
        }

        private a() {
        }
    }

    public static final class b implements Interceptor {

        @NotNull
        private static final String CONTENT_ENCODING = "Content-Encoding";

        @NotNull
        public static final a Companion = new a(null);

        @NotNull
        private static final String GZIP = "gzip";

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
                this();
            }

            private a() {
            }
        }

        /* renamed from: com.vungle.ads.internal.network.VungleApiClient$b$b, reason: collision with other inner class name */
        public static final class C0368b extends RequestBody {
            final /* synthetic */ Buffer $output;
            final /* synthetic */ RequestBody $requestBody;

            public C0368b(RequestBody requestBody, Buffer buffer) {
                this.$requestBody = requestBody;
                this.$output = buffer;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.$output.size();
            }

            @Override // okhttp3.RequestBody
            @Nullable
            /* renamed from: contentType */
            public MediaType get$contentType() {
                return this.$requestBody.get$contentType();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(@NotNull BufferedSink sink) throws IOException {
                p.e(sink, "sink");
                sink.write(this.$output.snapshot());
            }
        }

        private final RequestBody gzip(RequestBody requestBody) throws IOException {
            Buffer buffer = new Buffer();
            BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(buffer));
            requestBody.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.close();
            return new C0368b(requestBody, buffer);
        }

        @Override // okhttp3.Interceptor
        @NotNull
        public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
            p.e(chain, "chain");
            Request request = chain.request();
            RequestBody requestBodyBody = request.body();
            return (requestBodyBody == null || request.header(CONTENT_ENCODING) != null) ? chain.proceed(request) : chain.proceed(request.newBuilder().header(CONTENT_ENCODING, GZIP).method(request.method(), gzip(requestBodyBody)).build());
        }
    }

    public static final class c extends ProxySelector {
        @Override // java.net.ProxySelector
        public void connectFailed(@Nullable URI uri, @Nullable SocketAddress socketAddress, @Nullable IOException iOException) {
            try {
                ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
            } catch (Exception unused) {
            }
        }

        @Override // java.net.ProxySelector
        @NotNull
        public List<Proxy> select(@Nullable URI uri) {
            try {
                List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                p.d(listSelect, "{\n                      …ri)\n                    }");
                return listSelect;
            } catch (Exception unused) {
                return q.e(Proxy.NO_PROXY);
            }
        }
    }

    public static final class d implements r0.b {
        final /* synthetic */ z $uaMetric;

        public d(z zVar) {
            this.$uaMetric = zVar;
        }

        @Override // r0.b
        public void accept(@Nullable String str) throws Throwable {
            String str2;
            if ((str == null || str.length() == 0) && ((str2 = VungleApiClient.this.uaString) == null || str2.length() == 0)) {
                str = VungleApiClient.this.platform.getUserAgent();
            }
            if (str == null || str.length() == 0) {
                com.vungle.ads.internal.util.p.Companion.e(VungleApiClient.TAG, "All UA sources failed, logging USER_AGENT_ERROR");
                new UserAgentError().logErrorNoReturnValue$vungle_ads_release();
            } else {
                this.$uaMetric.markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.$uaMetric, (o) null, (String) null, 6, (Object) null);
                VungleApiClient.this.uaString = str;
            }
        }
    }

    public static final class e implements com.vungle.ads.internal.network.b {
        final /* synthetic */ AnalyticsClient.a $requestListener;

        public e(AnalyticsClient.a aVar) {
            this.$requestListener = aVar;
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable Throwable th) {
            this.$requestListener.onFailure();
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable com.vungle.ads.internal.network.e eVar) {
            this.$requestListener.onSuccess();
        }
    }

    public static final class f implements com.vungle.ads.internal.network.b {
        final /* synthetic */ AnalyticsClient.a $requestListener;

        public f(AnalyticsClient.a aVar) {
            this.$requestListener = aVar;
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable Throwable th) {
            this.$requestListener.onFailure();
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable com.vungle.ads.internal.network.e eVar) {
            this.$requestListener.onSuccess();
        }
    }

    public static final class g implements com.vungle.ads.internal.network.b {
        @Override // com.vungle.ads.internal.network.b
        public void onFailure(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable Throwable th) {
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(@Nullable com.vungle.ads.internal.network.a aVar, @Nullable com.vungle.ads.internal.network.e eVar) {
        }
    }

    public VungleApiClient(@NotNull final Context applicationContext, @NotNull com.vungle.ads.internal.platform.d platform, @NotNull t7.b filePreferences) {
        p.e(applicationContext, "applicationContext");
        p.e(platform, "platform");
        p.e(filePreferences, "filePreferences");
        this.applicationContext = applicationContext;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = System.getProperty("http.agent");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.signalManager$delegate = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.network.VungleApiClient$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final SignalManager invoke() {
                return ServiceLocator.Companion.getInstance(applicationContext).getService(SignalManager.class);
            }
        });
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new Interceptor() { // from class: com.vungle.ads.internal.network.i
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return VungleApiClient.m326responseInterceptor$lambda0(this.f20197a, chain);
            }
        };
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderProxySelector = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).addInterceptor(this.responseInterceptor).proxySelector(new c());
        OkHttpClient okHttpClientBuild = builderProxySelector.build();
        OkHttpClient okHttpClientBuild2 = builderProxySelector.addInterceptor(new b()).build();
        this.api = new VungleApiImpl(okHttpClientBuild);
        this.gzipApi = new VungleApiImpl(okHttpClientBuild2);
    }

    private final String bodyToString(RequestBody requestBody) {
        try {
            Buffer buffer = new Buffer();
            if (requestBody != null) {
                requestBody.writeTo(buffer);
                return buffer.readUtf8();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private final Response defaultErrorResponse(Request request) {
        return new Response.Builder().request(request).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.INSTANCE.create("{\"Error\":\"Server is busy\"}", MediaType.INSTANCE.parse("application/json"))).build();
    }

    @VisibleForTesting
    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final q7.e getBasicDeviceBody(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        p.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        p.d(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        p.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        p.d(RELEASE, "RELEASE");
        q7.e eVar = new q7.e(MANUFACTURER, MODEL, RELEASE, AndroidPlatform.Companion.getCarrierName$vungle_ads_release(context), p.a("Amazon", MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (e.c) null, 1792, (kotlin.jvm.internal.i) null);
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            eVar.setUa(userAgent);
            initUserAgentLazy();
            q7.b advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            return eVar;
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e10.getLocalizedMessage());
            return eVar;
        }
    }

    private final String getConnectionType() {
        if (ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        p.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NONE";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? (type == 1 || type == 6) ? "WIFI" : type != 7 ? type != 9 ? "UNKNOWN" : "ETHERNET" : "BLUETOOTH" : "MOBILE";
    }

    private final q7.e getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    private final d.h getExtBody(boolean z10) {
        String strGenerateSignals;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.filePreferences.getString("config_extension");
        }
        if (z10) {
            try {
                strGenerateSignals = getSignalManager().generateSignals();
            } catch (Exception e10) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "Couldn't convert signals for sending. Error: " + e10.getMessage());
            }
        } else {
            strGenerateSignals = null;
        }
        if ((configExtension == null || configExtension.length() == 0) && (strGenerateSignals == null || strGenerateSignals.length() == 0)) {
            return null;
        }
        return new d.h(configExtension, strGenerateSignals, Long.valueOf(ConfigManager.INSTANCE.configLastValidatedTimestamp()));
    }

    public static /* synthetic */ d.h getExtBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getExtBody(z10);
    }

    @VisibleForTesting
    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    private final String getPlacementID(RequestBody requestBody) {
        List<String> placements;
        try {
            z9.a aVar = json;
            String strBodyToString = bodyToString(requestBody);
            kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(aVar.a(), t.m(q7.d.class));
            p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            d.i request = ((q7.d) aVar.b(bVarB, strBodyToString)).getRequest();
            if (request != null && (placements = request.getPlacements()) != null) {
                String str = placements.get(0);
                if (str != null) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @VisibleForTesting
    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    private final d.j getUserBody(boolean z10) {
        d.j jVar = new d.j((d.f) null, (d.c) null, (d.C0471d) null, (FirstPartyData) null, (d.g) null, 31, (kotlin.jvm.internal.i) null);
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        jVar.setGdpr(new d.f(privacyManager.getConsentStatus(), privacyManager.getConsentSource(), privacyManager.getConsentTimestamp(), privacyManager.getConsentMessageVersion()));
        jVar.setCcpa(new d.c(privacyManager.getCcpaStatus()));
        if (privacyManager.getCoppaStatus() != COPPA.COPPA_NOTSET) {
            jVar.setCoppa(new d.C0471d(privacyManager.getCoppaStatus().getValue()));
        }
        if (privacyManager.shouldSendTCFString()) {
            jVar.setIab(new d.g(privacyManager.getIABTCFString()));
        }
        if (z10) {
            jVar.setFpd(b0.firstPartyData);
        }
        return jVar;
    }

    public static /* synthetic */ d.j getUserBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getUserBody(z10);
    }

    private final void initUserAgentLazy() {
        z zVar = new z(Sdk$SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
        zVar.markStart();
        this.platform.getUserAgentLazy(new d(zVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q7.f pingTPAT$default(VungleApiClient vungleApiClient, String str, Map map, String str2, HttpMethod httpMethod, o oVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            httpMethod = HttpMethod.GET;
        }
        if ((i10 & 16) != 0) {
            oVar = null;
        }
        return vungleApiClient.pingTPAT(str, map, str2, httpMethod, oVar);
    }

    public static /* synthetic */ q7.d requestBody$default(VungleApiClient vungleApiClient, boolean z10, boolean z11, int i10, Object obj) throws IllegalStateException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return vungleApiClient.requestBody(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final Response m326responseInterceptor$lambda0(VungleApiClient this$0, Interceptor.Chain chain) throws NumberFormatException {
        p.e(this$0, "this$0");
        p.e(chain, "chain");
        Request request = chain.request();
        try {
            try {
                Response responseProceed = chain.proceed(request);
                String str = responseProceed.headers().get(CommonGatewayClient.HEADER_RETRY_AFTER);
                if (str != null && str.length() != 0) {
                    try {
                        long j10 = Long.parseLong(str);
                        if (j10 > 0) {
                            String strEncodedPath = request.url().encodedPath();
                            long jCurrentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
                            if (r.w(strEncodedPath, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, false, 2, null)) {
                                String placementID = this$0.getPlacementID(request.body());
                                if (placementID.length() > 0) {
                                    this$0.retryAfterDataMap.put(placementID, Long.valueOf(jCurrentTimeMillis));
                                }
                            }
                        }
                    } catch (Exception unused) {
                        com.vungle.ads.internal.util.p.Companion.d(TAG, "Retry-After value is not an valid value");
                    }
                }
                return responseProceed;
            } catch (OutOfMemoryError unused2) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "OOM for " + request.url());
                return this$0.defaultErrorResponse(request);
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Exception: " + e10.getMessage() + " for " + request.url());
            return this$0.defaultErrorResponse(request);
        }
    }

    @VisibleForTesting
    public final void addPlaySvcAvailabilityInCookie(boolean z10) {
        this.filePreferences.put("isPlaySvcAvailable", z10).apply();
    }

    public final boolean checkIsRetryAfterActive(@NotNull String placementID) {
        p.e(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if ((l10 != null ? l10.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    @Nullable
    public final com.vungle.ads.internal.network.a config() throws IOException {
        q7.c cVar = this.appBody;
        if (cVar == null) {
            return null;
        }
        q7.d dVar = new q7.d(getDeviceBody$vungle_ads_release(true), cVar, getUserBody$default(this, false, 1, null), (d.h) null, (d.i) null, 24, (kotlin.jvm.internal.i) null);
        d.h extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            dVar.setExt(extBody$default);
        }
        com.vungle.ads.internal.util.i iVar = com.vungle.ads.internal.util.i.INSTANCE;
        String str = BASE_URL;
        if (!iVar.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        if (!r.w(str, "/", false, 2, null)) {
            str = str + '/';
        }
        return this.api.config(j.INSTANCE.getHeaderUa(), str + "config", dVar);
    }

    @Nullable
    public final q7.c getAppBody$vungle_ads_release() {
        return this.appBody;
    }

    @NotNull
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

    @Nullable
    public final String getConnectionTypeDetail$vungle_ads_release() {
        if (ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        p.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : "unknown";
    }

    @VisibleForTesting
    @NotNull
    public final synchronized q7.e getDeviceBody$vungle_ads_release(boolean z10) throws IllegalStateException {
        q7.e eVarCopy$default;
        String str;
        try {
            q7.e basicDeviceBody = this.baseDeviceInfo;
            if (basicDeviceBody == null) {
                basicDeviceBody = getBasicDeviceBody(this.applicationContext);
                this.baseDeviceInfo = basicDeviceBody;
            }
            eVarCopy$default = q7.e.copy$default(basicDeviceBody, null, null, null, null, null, 0, 0, null, null, null, null, 2047, null);
            e.c cVar = new e.c(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (kotlin.jvm.internal.i) null);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = this.applicationContext.getSystemService("window");
            p.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            eVarCopy$default.setH(displayMetrics.heightPixels);
            eVarCopy$default.setW(displayMetrics.widthPixels);
            q7.b advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
            q7.b bVar = this.advertisingInfo;
            Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.getLimitAdTracking()) : null;
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            if (privacyManager.shouldSendAdIds()) {
                if (advertisingId != null) {
                    if (p.a("Amazon", Build.MANUFACTURER)) {
                        cVar.setAmazonAdvertisingId(advertisingId);
                    } else {
                        cVar.setGaid(advertisingId);
                    }
                    eVarCopy$default.setIfa(advertisingId);
                } else {
                    eVarCopy$default.setIfa("");
                }
            }
            if (z10 || !privacyManager.shouldSendAdIds()) {
                eVarCopy$default.setIfa(null);
                cVar.setGaid(null);
                cVar.setAmazonAdvertisingId(null);
            }
            Boolean bool = Boolean.TRUE;
            boolean zHasSystemFeature = false;
            eVarCopy$default.setLmt(p.a(boolValueOf, bool) ? 1 : 0);
            cVar.setGooglePlayServicesAvailable(p.a(bool, isGooglePlayServicesAvailable()));
            if (privacyManager.allowDeviceIDFromTCF() != PrivacyManager.DeviceIdAllowed.DISABLE_ID) {
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
                int intExtra3 = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
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
            cVar.setBatterySaverEnabled(this.platform.isBatterySaverEnabled() ? 1 : 0);
            String connectionType = getConnectionType();
            if (connectionType != null) {
                cVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                cVar.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            cVar.setLocale(Locale.getDefault().toString());
            cVar.setLanguage(Locale.getDefault().getLanguage());
            cVar.setTimeZone(TimeZone.getDefault().getID());
            cVar.setVolumeLevel(this.platform.getVolumeLevel());
            cVar.setSoundEnabled(this.platform.isSoundEnabled() ? 1 : 0);
            if (p.a("Amazon", Build.MANUFACTURER)) {
                zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else {
                Object systemService2 = this.applicationContext.getSystemService("uimode");
                p.c(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
                    zHasSystemFeature = true;
                }
            }
            cVar.setTv(zHasSystemFeature);
            cVar.setSideloadEnabled(this.platform.isSideLoaded());
            cVar.setSdCardAvailable(this.platform.isSdCardPresent() ? 1 : 0);
            if (ConfigManager.INSTANCE.otEnabled()) {
                cVar.setSit(Long.valueOf(this.platform.getSDKInstallationTime()));
                cVar.setOit(Long.valueOf(this.platform.getOSInstallationTime()));
                cVar.setOrt(Long.valueOf(this.platform.getLastBootTime()));
                cVar.setObt(Long.valueOf(this.platform.getBuildTime()));
            }
            cVar.setGpVersion(this.platform.getGPVersion());
            eVarCopy$default.setUa(this.uaString);
            eVarCopy$default.setExt(cVar);
        } catch (Throwable th) {
            throw th;
        }
        return eVarCopy$default;
    }

    @NotNull
    public final VungleApi getGzipApi$vungle_ads_release() {
        return this.gzipApi;
    }

    @VisibleForTesting
    @Nullable
    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            p.d(googleApiAvailabilityLight, "getInstance()");
            boolean z10 = googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0;
            boolValueOf = Boolean.valueOf(z10);
            addPlaySvcAvailabilityInCookie(z10);
            return boolValueOf;
        } catch (Exception unused) {
            com.vungle.ads.internal.util.p.Companion.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            com.vungle.ads.internal.util.p.Companion.w(TAG, "Play services Not available");
            boolValueOf = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
            } catch (Exception unused3) {
                com.vungle.ads.internal.util.p.Companion.w(TAG, "Failure to write GPS availability to DB");
            }
            return boolValueOf;
        }
    }

    @VisibleForTesting
    @Nullable
    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean("isPlaySvcAvailable");
    }

    @NotNull
    public final Interceptor getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    @NotNull
    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(@NotNull String placementID) {
        p.e(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final synchronized void initialize(@NotNull String appId) {
        PackageInfo packageInfo;
        try {
            p.e(appId, "appId");
            j.INSTANCE.setAppId(appId);
            String str = "1.0";
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                    p.d(packageInfo, "{\n                    ap…      )\n                }");
                } else {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                    p.d(packageInfo, "{\n                    ap…      )\n                }");
                }
                String str2 = packageInfo.versionName;
                p.d(str2, "packageInfo.versionName");
                str = str2;
            } catch (Exception unused) {
            }
            j.INSTANCE.setAppVersion(str);
            this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
            String packageName = this.applicationContext.getPackageName();
            p.d(packageName, "applicationContext.packageName");
            this.appBody = new q7.c(packageName, str, appId);
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    @Nullable
    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    @Nullable
    public final q7.f pingTPAT(@NotNull String url, @Nullable Map<String, String> map, @Nullable String str, @NotNull HttpMethod requestType, @Nullable o oVar) {
        Response responseRaw;
        p.e(url, "url");
        p.e(requestType, "requestType");
        if (!com.vungle.ads.internal.util.i.INSTANCE.isValidUrl(url)) {
            return new q7.f("Invalid URL", true, false, 4, null);
        }
        try {
            if (!(Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(url).getHost()) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) && URLUtil.isHttpUrl(url)) {
                return new q7.f("Clear Text Traffic is blocked", false, false, 6, null);
            }
            try {
                String str2 = this.uaString;
                if (str2 == null) {
                    str2 = "";
                }
                com.vungle.ads.internal.network.e eVarExecute = this.api.pingTPAT(str2, url, requestType, map, str != null ? RequestBody.INSTANCE.create(str, MediaType.INSTANCE.parse("application/json")) : null).execute();
                if (eVarExecute != null && eVarExecute.isSuccessful()) {
                    return null;
                }
                Integer numValueOf = (eVarExecute == null || (responseRaw = eVarExecute.raw()) == null) ? null : Integer.valueOf(responseRaw.code());
                if (z8.z.C(z8.r.l(Integer.valueOf(Sdk$SDKError.Reason.MRAID_ERROR_VALUE), Integer.valueOf(Sdk$SDKError.Reason.INVALID_IFA_STATUS_VALUE), 307, 308), numValueOf)) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk$SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, oVar, url, 2, null);
                    return null;
                }
                boolean z10 = numValueOf != null && new q9.c(500, CommonGatewayClient.CODE_599).h(numValueOf.intValue());
                StringBuilder sb = new StringBuilder();
                sb.append("unsuccessful response, error code: ");
                sb.append(numValueOf);
                sb.append(", message: ");
                sb.append(eVarExecute != null ? eVarExecute.message() : null);
                return new q7.f(sb.toString(), false, z10, 2, null);
            } catch (Throwable th) {
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new q7.f(localizedMessage, false, true, 2, null);
            }
        } catch (MalformedURLException e10) {
            String localizedMessage2 = e10.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new q7.f(localizedMessage2, true, false, 4, null);
        }
    }

    public final void reportErrors(@NotNull BlockingQueue<Sdk$SDKError.a> errors, @NotNull AnalyticsClient.a requestListener) {
        p.e(errors, "errors");
        p.e(requestListener, "requestListener");
        String errorLoggingEndpoint = ConfigManager.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk$SDKError.a aVar : errors) {
            aVar.setSessionId(getSignalManager().getUuid());
            q7.h placement = ConfigManager.INSTANCE.getPlacement(aVar.getPlacementReferenceId());
            if (placement != null) {
                aVar.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                aVar.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                aVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                aVar.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk$SDKError sdk$SDKError = (Sdk$SDKError) aVar.build();
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Sending Error: " + sdk$SDKError.getReason());
            linkedBlockingQueue.add(sdk$SDKError);
        }
        Sdk$SDKErrorBatch sdk$SDKErrorBatch = (Sdk$SDKErrorBatch) Sdk$SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        byte[] byteArray = sdk$SDKErrorBatch.toByteArray();
        p.d(byteArray, "batch.toByteArray()");
        this.api.sendErrors(j.INSTANCE.getHeaderUa(), errorLoggingEndpoint, companion.create(byteArray, MediaType.INSTANCE.parse(CommonGatewayClient.HEADER_PROTOBUF), 0, sdk$SDKErrorBatch.toByteArray().length)).enqueue(new e(requestListener));
    }

    public final void reportMetrics(@NotNull BlockingQueue<Sdk$SDKMetric.a> metrics, @NotNull AnalyticsClient.a requestListener) {
        p.e(metrics, "metrics");
        p.e(requestListener, "requestListener");
        String metricsEndpoint = ConfigManager.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk$SDKMetric.a aVar : metrics) {
            aVar.setSessionId(getSignalManager().getUuid());
            q7.h placement = ConfigManager.INSTANCE.getPlacement(aVar.getPlacementReferenceId());
            if (placement != null) {
                aVar.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                aVar.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                aVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                aVar.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk$SDKMetric sdk$SDKMetric = (Sdk$SDKMetric) aVar.build();
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Sending Metric: " + sdk$SDKMetric.getType());
            linkedBlockingQueue.add(sdk$SDKMetric);
        }
        Sdk$MetricBatch sdk$MetricBatch = (Sdk$MetricBatch) Sdk$MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        RequestBody.Companion companion = RequestBody.INSTANCE;
        MediaType mediaType = MediaType.INSTANCE.parse(CommonGatewayClient.HEADER_PROTOBUF);
        byte[] byteArray = sdk$MetricBatch.toByteArray();
        p.d(byteArray, "batch.toByteArray()");
        this.api.sendMetrics(j.INSTANCE.getHeaderUa(), metricsEndpoint, RequestBody.Companion.create$default(companion, mediaType, byteArray, 0, 0, 12, (Object) null)).enqueue(new f(requestListener));
    }

    @Nullable
    public final com.vungle.ads.internal.network.a requestAd(@NotNull String placement, @Nullable a0 a0Var) throws IllegalStateException {
        p.e(placement, "placement");
        ConfigManager configManager = ConfigManager.INSTANCE;
        String adsEndpoint = configManager.getAdsEndpoint();
        q7.d dVarRequestBody = requestBody(!configManager.signalsDisabled(), configManager.fpdEnabled());
        d.i iVar = new d.i(q.e(placement), (d.b) null, (Long) null, (String) null, (String) null, (String) null, 62, (kotlin.jvm.internal.i) null);
        if (a0Var != null) {
            iVar.setAdSize(new d.b(a0Var.getWidth(), a0Var.getHeight()));
        }
        dVarRequestBody.setRequest(iVar);
        return this.gzipApi.ads(j.INSTANCE.getHeaderUa(), adsEndpoint, dVarRequestBody);
    }

    @NotNull
    public final q7.d requestBody(boolean z10, boolean z11) throws IllegalStateException {
        q7.d dVar = new q7.d(getDeviceBody(), this.appBody, getUserBody(z11), (d.h) null, (d.i) null, 24, (kotlin.jvm.internal.i) null);
        d.h extBody = getExtBody(z10);
        if (extBody != null) {
            dVar.setExt(extBody);
        }
        return dVar;
    }

    @Nullable
    public final com.vungle.ads.internal.network.a ri(@NotNull d.i request) {
        q7.c cVar;
        p.e(request, "request");
        String riEndpoint = ConfigManager.INSTANCE.getRiEndpoint();
        if (riEndpoint == null || riEndpoint.length() == 0 || (cVar = this.appBody) == null) {
            return null;
        }
        q7.d dVar = new q7.d(getDeviceBody(), cVar, getUserBody$default(this, false, 1, null), (d.h) null, (d.i) null, 24, (kotlin.jvm.internal.i) null);
        dVar.setRequest(request);
        d.h extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            dVar.setExt(extBody$default);
        }
        return this.api.ri(j.INSTANCE.getHeaderUa(), riEndpoint, dVar);
    }

    public final void sendAdMarkup(@NotNull String adMarkup, @NotNull String endpoint) {
        p.e(adMarkup, "adMarkup");
        p.e(endpoint, "endpoint");
        this.api.sendAdMarkup(endpoint, RequestBody.INSTANCE.create(adMarkup, MediaType.INSTANCE.parse("application/json"))).enqueue(new g());
    }

    public final void setAppBody$vungle_ads_release(@Nullable q7.c cVar) {
        this.appBody = cVar;
    }

    public final void setGzipApi$vungle_ads_release(@NotNull VungleApi vungleApi) {
        p.e(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(@NotNull Interceptor interceptor) {
        p.e(interceptor, "<set-?>");
        this.responseInterceptor = interceptor;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(@NotNull Map<String, Long> map) {
        p.e(map, "<set-?>");
        this.retryAfterDataMap = map;
    }
}
