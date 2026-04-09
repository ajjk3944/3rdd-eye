package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.a3;
import com.applovin.impl.b5;
import com.applovin.impl.b6;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.d2;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.h3;
import com.applovin.impl.i5;
import com.applovin.impl.i6;
import com.applovin.impl.k3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n6;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u6;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6543a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f6544b;

    /* renamed from: c, reason: collision with root package name */
    private final b5 f6545c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f6546d = new AtomicReference();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6547a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f6547a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6547a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6547a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6547a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6547a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6547a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0078a {

        /* renamed from: a, reason: collision with root package name */
        private final y2 f6548a;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0078a f6549b;

        public b(y2 y2Var, a.InterfaceC0078a interfaceC0078a) {
            this.f6548a = y2Var;
            this.f6549b = interfaceC0078a;
        }

        public void b(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f6548a.a(bundle);
            t2.b(this.f6549b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f6548a.a(bundle);
            this.f6548a.b0();
            com.applovin.impl.sdk.o unused = MediationServiceImpl.this.f6544b;
            if (com.applovin.impl.sdk.o.a()) {
                MediationServiceImpl.this.f6544b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f6548a, this.f6549b);
            if (!((Boolean) MediationServiceImpl.this.f6543a.a(r3.f7488w8)).booleanValue() || this.f6548a.u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f6543a.l().a(this.f6548a, g.c.SHOW);
                MediationServiceImpl.this.f6543a.t().b(this.f6548a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f6543a.H().a(this.f6548a);
                }
                t2.c(this.f6549b, maxAd);
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f6548a.a(bundle);
            t2.d(this.f6549b, maxAd);
        }

        public void e(final MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f6548a.a(bundle);
            this.f6548a.c0();
            MediationServiceImpl.this.f6543a.l().a(this.f6548a, g.c.HIDE);
            MediationServiceImpl.this.a(this.f6548a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6940a.a(maxAd);
                }
            }, maxAd instanceof c3 ? ((c3) maxAd).l0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f6548a.a(bundle);
            this.f6548a.e0();
            MediationServiceImpl.this.f6543a.l().a(this.f6548a, g.c.LOAD);
            MediationServiceImpl.this.b(this.f6548a);
            t2.f(this.f6549b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) throws JSONException {
            a(maxAd, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) throws JSONException {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) throws JSONException {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) throws JSONException {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) throws JSONException {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) throws JSONException {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f6548a.e0();
            MediationServiceImpl.this.b(this.f6548a, maxError, this.f6549b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) throws JSONException {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) throws JSONException {
            a(maxAd, maxReward, (Bundle) null);
        }

        public void a(a.InterfaceC0078a interfaceC0078a) {
            this.f6549b = interfaceC0078a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f6543a.H().b(maxAd);
            }
            t2.e(this.f6549b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f6548a.a(bundle);
            MediationServiceImpl.this.f6543a.l().a(this.f6548a, g.c.CLICK);
            MediationServiceImpl.this.a(this.f6548a, this.f6549b);
            t2.a((MaxAdListener) this.f6549b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) throws JSONException {
            this.f6548a.a(bundle);
            this.f6548a.a0();
            MediationServiceImpl.this.a(this.f6548a, maxError, this.f6549b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof c3)) {
                ((c3) maxAd).j0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) throws JSONException {
            this.f6548a.a(bundle);
            t2.a(this.f6549b, maxAd, maxReward);
            MediationServiceImpl.this.f6543a.q0().a((i5) new n6((c3) maxAd, MediationServiceImpl.this.f6543a), d6.b.OTHER);
        }
    }

    public MediationServiceImpl(com.applovin.impl.sdk.k kVar) {
        this.f6543a = kVar;
        this.f6544b = kVar.O();
        this.f6545c = new b5(kVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(final d5 d5Var, Context context, final c5.a aVar) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        a3 a3VarU = d5Var.u();
        final String strB = a3VarU.b();
        final MaxAdFormat maxAdFormatA = a3VarU.a();
        c5 c5VarB = this.f6545c.b(d5Var, strB, maxAdFormatA);
        if (c5VarB != null) {
            aVar.a(c5.a(c5VarB));
            return;
        }
        final h hVarA = this.f6543a.T().a(d5Var, d5Var.A());
        if (hVarA == null) {
            aVar.a(c5.a(d5Var, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        final s4 s4Var = new s4("SignalCollection:" + d5Var.c());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = s4.f7547j;
        s4Var.a(executor, new s4.b() { // from class: com.applovin.impl.mediation.k
            @Override // com.applovin.impl.s4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                this.f6892a.a(jElapsedRealtime, hVarA, strB, d5Var, maxAdFormatA, aVar, z10, (String) obj, (MaxError) obj2);
            }
        });
        i6.a(d5Var.m(), s4Var, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + d5Var.c() + ") timed out collecting signal"), "MediationService", this.f6543a);
        final Activity activityU0 = context instanceof Activity ? (Activity) context : this.f6543a.u0();
        final MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(d5Var, strB, maxAdFormatA);
        if (d5Var.w()) {
            s4 s4VarA = this.f6543a.S().a(d5Var, activityU0);
            s4VarA.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6903a.a(s4Var, hVarA, maxAdapterParametersImplA, d5Var, activityU0);
                }
            });
            s4VarA.a(executor, new s4.a() { // from class: com.applovin.impl.mediation.m
                @Override // com.applovin.impl.s4.a
                public final void a(Object obj) {
                    this.f6912a.a(hVarA, s4Var, (String) obj);
                }
            });
            return;
        }
        if (d5Var.x()) {
            s4 s4VarA2 = this.f6543a.S().a(d5Var, activityU0);
            if (s4VarA2.e() && !d5Var.z()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6544b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVarA.g());
                }
                s4Var.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) s4VarA2.b())));
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6544b.a("MediationService", "Collecting signal for adapter: " + hVarA.g());
        }
        hVarA.a(maxAdapterParametersImplA, d5Var, activityU0, s4Var);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof y2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6544b.d("MediationService", "Destroying " + maxAd);
            }
            y2 y2Var = (y2) maxAd;
            h hVarA = y2Var.A();
            if (hVarA != null) {
                hVarA.a();
                y2Var.t();
            }
            this.f6543a.j().c(y2Var.Q());
            this.f6543a.l().a(y2Var, g.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f6546d.getAndSet(null);
    }

    public void loadAd(String str, @Nullable String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0078a interfaceC0078a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0078a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f6543a.V())) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.f6543a.B0()) {
            com.applovin.impl.sdk.o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = this.f6543a.J() != null ? this.f6543a.J().getAdUnitIds() : null;
        boolean zStartsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !zStartsWith) {
            if (n7.c(this.f6543a)) {
                String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://support.axon.ai/en/max/android/overview/advanced-settings#selective-init";
                if (((Boolean) this.f6543a.a(x4.B6)).booleanValue()) {
                    throw new RuntimeException(str3);
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6544b.b("MediationService", str3);
                }
            }
            this.f6543a.D().a(d2.S0, "uninitialized_ad_unit_id", CollectionUtils.hashMap(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str), "uninitialized_ad_unit_id" + str);
        }
        this.f6543a.c();
        if (str.length() != 16 && !zStartsWith && !this.f6543a.i0().startsWith("05TMD")) {
            com.applovin.impl.sdk.o.h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (!this.f6543a.a(maxAdFormat)) {
            this.f6543a.U0();
            t2.a((MaxAdRequestListener) interfaceC0078a, str, true);
            if (this.f6543a.R() != null) {
                this.f6543a.R().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0078a);
                return;
            } else {
                this.f6543a.Q().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0078a);
                return;
            }
        }
        com.applovin.impl.sdk.o.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
        t2.a(interfaceC0078a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
    }

    public void loadThirdPartyMediatedAd(final String str, final y2 y2Var, final Activity activity, final a.InterfaceC0078a interfaceC0078a) {
        s4 s4VarA;
        if (y2Var == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6544b.a("MediationService", "Loading " + y2Var + "...");
        }
        this.f6543a.P().a(d2.f5736k0, y2Var);
        this.f6543a.l().a(y2Var, g.c.LOADING);
        this.f6543a.t().b(y2Var, "WILL_LOAD");
        final h hVarA = this.f6543a.T().a(y2Var);
        if (hVarA == null) {
            String str2 = "Failed to load " + y2Var + ": adapter not loaded";
            com.applovin.impl.sdk.o.h("MediationService", str2);
            b(y2Var, new MaxErrorImpl(-5001, str2), interfaceC0078a);
            return;
        }
        final MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(y2Var);
        if (y2Var.Y()) {
            s4VarA = this.f6543a.S().a(y2Var, activity);
        } else {
            if (y2Var.Z()) {
                this.f6543a.S().a(y2Var, activity);
            }
            s4VarA = null;
        }
        final y2 y2VarA = y2Var.a(hVarA);
        hVarA.a(str, y2VarA);
        y2VarA.f0();
        if (s4VarA == null) {
            hVarA.a(str, maxAdapterParametersImplA, y2VarA, activity, new b(y2VarA, interfaceC0078a));
            return;
        }
        Executor executor = s4.f7547j;
        s4VarA.a(executor, new s4.a() { // from class: com.applovin.impl.mediation.n
            @Override // com.applovin.impl.s4.a
            public final void a(Object obj) {
                this.f6917a.a(y2Var, interfaceC0078a, (String) obj);
            }
        });
        s4VarA.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f6922a.a(hVarA, str, maxAdapterParametersImplA, y2VarA, activity, interfaceC0078a);
            }
        });
    }

    public void maybeFireAppKilledWhilePlayingMediatedAdPostback() {
        String str = (String) this.f6543a.b(z4.R);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, new JSONObject());
        if (a(JsonUtils.getLong(jSONObjectJsonObjectFromJsonString, "timestamp_ms", 0L))) {
            Long l10 = (Long) this.f6543a.b(z4.S);
            String string = l10 != null ? l10.toString() : "";
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "ad_info");
            Map mapTryToStringMap = jSONObject != null ? JsonUtils.tryToStringMap(jSONObject) : new HashMap(1);
            CollectionUtils.putStringIfValid("duration_ms", string, mapTryToStringMap);
            this.f6543a.D().d(d2.I0, mapTryToStringMap);
            List list = JsonUtils.getList(jSONObjectJsonObjectFromJsonString, "app_killed_urls", Collections.EMPTY_LIST);
            if (CollectionUtils.isEmpty(list)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6544b.k("MediationService", "Unable to track app killed during mediated ad from previous run. Missing app killed tracking URLs.");
                }
            } else {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "user_info");
                Map<String, String> mapTryToStringMap2 = jSONObject2 != null ? JsonUtils.tryToStringMap(jSONObject2) : w3.c(this.f6543a);
                mapTryToStringMap2.put("{IMP_DURATION_MS}", string);
                a("mappk", list, mapTryToStringMap2, null, null, null, true);
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, @Nullable Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objA = this.f6543a.H().a();
            if (objA instanceof y2) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (y2) objA, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, y2 y2Var) {
        a(maxError, y2Var, false);
    }

    public void processAdapterInitializationPostback(k3 k3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap map = new HashMap(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j10));
        a("minit", map, new MaxErrorImpl(str), k3Var);
        Map mapA = f2.a(k3Var);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j10), mapA);
        switch (a.f6547a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f6543a.P().d(d2.f5722d0, mapA);
                break;
            case 4:
                this.f6543a.P().d(d2.f5724e0, mapA);
                break;
            case 5:
            case 6:
                this.f6543a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6543a.O().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f6543a.D().a(d2.f5721d, "adapterNotInitializedForPostback", mapA);
                break;
        }
    }

    public void processCallbackAdImpressionPostback(y2 y2Var, a.InterfaceC0078a interfaceC0078a) {
        if (y2Var.O().endsWith("cimp")) {
            this.f6543a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) interfaceC0078a, (MaxAd) y2Var);
        }
        HashMap map = new HashMap(2);
        if (y2Var instanceof c3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((c3) y2Var).u0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f6543a.w0().e());
        if (!((Boolean) this.f6543a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mcimp", map, y2Var);
        this.f6543a.P().a(d2.f5746p0, y2Var);
    }

    public void processRawAdImpression(y2 y2Var, a.InterfaceC0078a interfaceC0078a) {
        this.f6543a.t().b(y2Var, "WILL_DISPLAY");
        if (y2Var.O().endsWith("mimp")) {
            this.f6543a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) interfaceC0078a, (MaxAd) y2Var);
        }
        if (((Boolean) this.f6543a.a(x4.M4)).booleanValue()) {
            this.f6543a.Y().a(s3.f7539g, t3.a(y2Var), Long.valueOf(System.currentTimeMillis() - this.f6543a.K()));
        }
        HashMap map = new HashMap(3);
        if (y2Var instanceof c3) {
            c3 c3Var = (c3) y2Var;
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(c3Var.p0()));
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(c3Var.u0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f6543a.w0().e());
        if (!((Boolean) this.f6543a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mimp", map, y2Var);
        this.f6543a.P().a(d2.f5744o0, y2Var);
    }

    public void processViewabilityAdImpressionPostback(h3 h3Var, long j10, a.InterfaceC0078a interfaceC0078a) {
        if (h3Var.O().endsWith("vimp")) {
            this.f6543a.t().b(h3Var);
            t2.a((MaxAdRevenueListener) interfaceC0078a, (MaxAd) h3Var);
        }
        HashMap map = new HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j10));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(h3Var.q0()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f6543a.w0().e());
        if (!((Boolean) this.f6543a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mvimp", map, h3Var);
        this.f6543a.P().a(d2.f5748q0, h3Var);
    }

    public void processWaterfallInfoPostback(MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, @Nullable MaxError maxError, long j10, long j11) {
        a3 requestParameters = maxAdWaterfallInfoImpl.getRequestParameters();
        String strB = requestParameters.b();
        MaxAdFormat maxAdFormatA = requestParameters.a();
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatA.getLabel(), map);
        CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j11), map);
        CollectionUtils.putStringIfValid("ad_event_id", maxAdWaterfallInfoImpl.getEventId(), map);
        if (maxError != null) {
            map.putAll(f2.a(maxError));
        }
        this.f6543a.P().d(d2.f5742n0, map);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap map2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), map2);
        CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, strB, map2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormatA.getLabel(), map2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), map2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j11), map2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j10), map2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), map2);
        map2.put("arn_info", requestParameters.f().e());
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap map3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), map3);
            map3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), map3);
            map3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap map4 = new HashMap(4);
                map4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                map4.put("error_message", maxErrorImpl.getMessage());
                map4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                map4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                map3.put("error_info", map4);
            }
            arrayList.add(map3);
        }
        map2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, map2, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f6546d.set(jSONObject);
    }

    public void showFullscreenAd(final c3 c3Var, final Activity activity, Map<String, Object> map, Map<String, Object> map2, final a.InterfaceC0078a interfaceC0078a) {
        if (c3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != c3Var.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f6543a.H().a(true);
        final h hVarB = b(c3Var);
        long jR0 = c3Var.r0();
        if (((Boolean) this.f6543a.a(r3.f7460f8)).booleanValue() && this.f6543a.R() == null && this.f6543a.Q().a((MaxAd) c3Var)) {
            this.f6543a.Q().a(c3Var.getAdUnitId(), (String) null, c3Var.getFormat(), com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (a.InterfaceC0078a) null);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6544b.d("MediationService", "Showing ad " + c3Var.getAdUnitId() + " with delay of " + jR0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f6877a.a(c3Var, hVarB, activity, interfaceC0078a);
            }
        }, jR0);
    }

    private h b(c3 c3Var) {
        h hVarA = c3Var.A();
        if (hVarA != null) {
            return hVarA;
        }
        this.f6543a.H().a(false);
        if (com.applovin.impl.sdk.o.a()) {
            this.f6544b.k("MediationService", "Failed to show " + c3Var + ": adapter not found");
        }
        com.applovin.impl.sdk.o.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + c3Var.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, h hVar, Activity activity, a.InterfaceC0078a interfaceC0078a) {
        a(c3Var);
        hVar.b(c3Var, activity);
        a(c3Var, interfaceC0078a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, h hVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, a.InterfaceC0078a interfaceC0078a) {
        a(c3Var);
        hVar.a(c3Var, viewGroup, lifecycle, activity);
        a(c3Var, interfaceC0078a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, y2Var);
        destroyAd(y2Var);
        t2.a(maxAdListener, y2Var.getAdUnitId(), maxError);
    }

    private void a(c3 c3Var) {
        if (c3Var.getFormat() == MaxAdFormat.REWARDED) {
            this.f6543a.q0().a((i5) new u6(c3Var, this.f6543a), d6.b.OTHER);
        }
    }

    public void showFullscreenAd(final c3 c3Var, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity, Map<String, Object> map, Map<String, Object> map2, final a.InterfaceC0078a interfaceC0078a) {
        if (c3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f6543a.H().a(true);
            final h hVarB = b(c3Var);
            long jR0 = c3Var.r0();
            if (((Boolean) this.f6543a.a(r3.f7460f8)).booleanValue() && this.f6543a.R() == null && this.f6543a.Q().a((MaxAd) c3Var)) {
                this.f6543a.Q().a(c3Var.getAdUnitId(), (String) null, c3Var.getFormat(), com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (a.InterfaceC0078a) null);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f6544b.d("MediationService", "Showing ad " + c3Var.getAdUnitId() + " with delay of " + jR0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6932a.a(c3Var, hVarB, viewGroup, lifecycle, activity, interfaceC0078a);
                }
            }, jR0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f6543a.t().b(y2Var, "DID_LOAD");
        if (y2Var.O().endsWith("load")) {
            this.f6543a.t().b(y2Var);
        }
        HashMap map = new HashMap(3);
        long jG = y2Var.G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jG));
        if (y2Var.getFormat().isFullscreenAd()) {
            n.a aVarB = this.f6543a.H().b(y2Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("load", map, y2Var);
        Map mapA = f2.a(y2Var);
        mapA.put("duration_ms", String.valueOf(jG));
        this.f6543a.P().d(d2.f5738l0, mapA);
    }

    private void a(c3 c3Var, a.InterfaceC0078a interfaceC0078a) {
        this.f6543a.H().a(false);
        a(c3Var, (MaxAdListener) interfaceC0078a);
        if (com.applovin.impl.sdk.o.a()) {
            this.f6544b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(c3Var, interfaceC0078a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(y2 y2Var, a.InterfaceC0078a interfaceC0078a, String str) {
        String str2 = "Failed to load " + y2Var + ": adapter init failed with error: " + str;
        if (com.applovin.impl.sdk.o.a()) {
            this.f6544b.k("MediationService", str2);
        }
        b(y2Var, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0078a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, y2 y2Var, Activity activity, a.InterfaceC0078a interfaceC0078a) {
        hVar.a(str, maxAdapterParametersImpl, y2Var, activity, new b(y2Var, interfaceC0078a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10, h hVar, String str, d5 d5Var, MaxAdFormat maxAdFormat, c5.a aVar, boolean z10, String str2, MaxError maxError) {
        c5 c5VarA;
        String str3;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6544b.a("MediationService", "Signal collection successful from: " + hVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
                str3 = str2;
            } else {
                str3 = str2;
            }
            c5VarA = c5.a(d5Var, hVar, str3, j10, jElapsedRealtime);
            this.f6545c.a(c5VarA, d5Var, str, maxAdFormat);
            HashMap map = new HashMap();
            CollectionUtils.putStringIfValid("network_name", d5Var.c(), map);
            CollectionUtils.putStringIfValid("adapter_class", d5Var.b(), map);
            CollectionUtils.putStringIfValid("adapter_version", hVar.b(), map);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jElapsedRealtime), map);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), map);
            CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str, map);
            this.f6543a.P().d(d2.f5726f0, map);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6544b.b("MediationService", "Signal collection failed from: " + hVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            c5VarA = c5.a(d5Var, hVar, maxError, j10, jElapsedRealtime);
            a(c5VarA, d5Var, hVar);
        }
        aVar.a(c5VarA);
        hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(s4 s4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, d5 d5Var, Activity activity) {
        if (s4Var.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6544b.a("MediationService", "Collecting signal for now-initialized adapter: " + hVar.g());
        }
        hVar.a(maxAdapterParametersImpl, d5Var, activity, s4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, s4 s4Var, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6544b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVar.g());
        }
        s4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, "Could not initialize adapter: " + str));
    }

    private void a(final c3 c3Var, final MaxAdListener maxAdListener) {
        final Long l10 = (Long) this.f6543a.a(r3.U7);
        if (l10.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f6885a.a(c3Var, l10, maxAdListener);
            }
        }, l10.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var, Long l10, MaxAdListener maxAdListener) {
        if (c3Var.u().get()) {
            return;
        }
        String str = "Ad (" + c3Var.k() + ") has not been displayed after " + l10 + "ms. Failing ad display...";
        com.applovin.impl.sdk.o.h("MediationService", str);
        a(c3Var, new MaxErrorImpl(-1, str), maxAdListener);
        this.f6543a.H().b(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var, MaxError maxError, MaxAdListener maxAdListener) {
        this.f6543a.l().a(y2Var, g.c.SHOW_ERROR);
        this.f6543a.t().b(y2Var, "DID_FAIL_DISPLAY");
        a(maxError, y2Var, true);
        if (y2Var.u().compareAndSet(false, true)) {
            t2.a(maxAdListener, y2Var, maxError);
        }
    }

    private void a(MaxError maxError, y2 y2Var) {
        HashMap map = new HashMap(3);
        long jG = y2Var.G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jG));
        if (y2Var.getFormat().isFullscreenAd()) {
            n.a aVarB = this.f6543a.H().b(y2Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("mlerr", map, maxError, y2Var);
        Map mapA = f2.a(y2Var);
        mapA.putAll(f2.a(maxError));
        mapA.put("duration_ms", String.valueOf(jG));
        this.f6543a.P().d(d2.f5740m0, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        this.f6543a.t().b(y2Var, "DID_HIDE");
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f6543a.w0().e());
        if (!((Boolean) this.f6543a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclose", map, y2Var);
        long jS = y2Var.S();
        long jH = y2Var.H();
        Map map2 = CollectionUtils.map("duration_ms", String.valueOf(jS));
        map2.put("details", "foreground_duration_ms = " + jH);
        this.f6543a.P().a(d2.f5752s0, y2Var, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var, a.InterfaceC0078a interfaceC0078a) {
        this.f6543a.t().b(y2Var, "DID_CLICKED");
        this.f6543a.t().b(y2Var, "DID_CLICK");
        if (y2Var.O().endsWith(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
            this.f6543a.t().b(y2Var);
            t2.a((MaxAdRevenueListener) interfaceC0078a, (MaxAd) y2Var);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f6543a.w0().e());
        if (!((Boolean) this.f6543a.a(x4.H3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclick", map, y2Var);
    }

    private void a(MaxError maxError, y2 y2Var, boolean z10) {
        HashMap map = new HashMap(1);
        if (y2Var instanceof c3) {
            map.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((c3) y2Var).u0()));
        }
        a("mierr", map, maxError, y2Var, z10);
        if (!z10 || y2Var == null) {
            return;
        }
        this.f6543a.P().a(d2.f5750r0, y2Var, maxError, CollectionUtils.map("duration_ms", String.valueOf(y2Var.F())));
    }

    private void a(c5 c5Var, d5 d5Var, h hVar) {
        long jB = c5Var.b();
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(jB));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", hVar.b(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", hVar.i(), map);
        a("serr", map, c5Var.c(), d5Var);
        Map mapA = f2.a(c5Var.c());
        CollectionUtils.putStringIfValid("network_name", d5Var.c(), mapA);
        CollectionUtils.putStringIfValid("adapter_class", d5Var.b(), mapA);
        CollectionUtils.putStringIfValid("adapter_version", hVar.b(), mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jB), mapA);
        this.f6543a.P().d(d2.f5728g0, mapA);
    }

    private void a(String str, Map map, k3 k3Var) {
        a(str, map, (MaxError) null, k3Var);
    }

    private void a(String str, Map map, MaxError maxError, k3 k3Var) {
        a(str, map, maxError, k3Var, true);
    }

    private void a(String str, Map map, MaxError maxError, k3 k3Var, boolean z10) {
        String strEmptyIfNull;
        Map map2 = CollectionUtils.map(map);
        String strEmptyIfNull2 = "";
        map2.put("{PLACEMENT}", z10 ? StringUtils.emptyIfNull(k3Var.getPlacement()) : "");
        if (!z10) {
            strEmptyIfNull = "";
        } else {
            strEmptyIfNull = StringUtils.emptyIfNull(k3Var.e());
        }
        map2.put("{CUSTOM_DATA}", strEmptyIfNull);
        if (k3Var instanceof y2) {
            y2 y2Var = (y2) k3Var;
            if (z10) {
                strEmptyIfNull2 = StringUtils.emptyIfNull(y2Var.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", strEmptyIfNull2);
        }
        a(str, null, map2, null, maxError, k3Var, z10);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, k3 k3Var, boolean z10) {
        this.f6543a.q0().a((i5) new b6(str, list, map, map2, maxError, k3Var, this.f6543a, z10), d6.b.OTHER);
    }

    private boolean a(long j10) {
        return System.currentTimeMillis() - j10 <= ((Long) this.f6543a.a(x4.E2)).longValue();
    }
}
