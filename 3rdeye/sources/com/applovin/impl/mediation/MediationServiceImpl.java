package com.applovin.impl.mediation;

import N7.C1154e9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
import com.applovin.impl.EnumC2121h;
import com.applovin.impl.a2;
import com.applovin.impl.a3;
import com.applovin.impl.a7;
import com.applovin.impl.b6;
import com.applovin.impl.g3;
import com.applovin.impl.g4;
import com.applovin.impl.h3;
import com.applovin.impl.h6;
import com.applovin.impl.i3;
import com.applovin.impl.l2;
import com.applovin.impl.l4;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.p4;
import com.applovin.impl.p5;
import com.applovin.impl.q2;
import com.applovin.impl.q4;
import com.applovin.impl.r4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.w4;
import com.applovin.impl.w5;
import com.applovin.impl.y1;
import com.applovin.impl.y2;
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
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.internal.Constants;
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
    private final com.applovin.impl.sdk.k f20206a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f20207b;

    /* renamed from: c, reason: collision with root package name */
    private final p4 f20208c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f20209d = new AtomicReference();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20210a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f20210a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20210a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20210a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20210a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20210a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20210a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0312a {

        /* renamed from: a, reason: collision with root package name */
        private final q2 f20211a;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0312a f20212b;

        public b(q2 q2Var, a.InterfaceC0312a interfaceC0312a) {
            this.f20211a = q2Var;
            this.f20212b = interfaceC0312a;
        }

        public void b(MaxAd maxAd, Bundle bundle) throws JSONException {
            this.f20211a.a(bundle);
            l2.b(this.f20212b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.f20211a.a(bundle);
            com.applovin.impl.sdk.o unused = MediationServiceImpl.this.f20207b;
            if (com.applovin.impl.sdk.o.a()) {
                MediationServiceImpl.this.f20207b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f20211a, this.f20212b);
            if (!((Boolean) MediationServiceImpl.this.f20206a.a(g3.f19383P7)).booleanValue() || this.f20211a.u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f20206a.l().a(this.f20211a, g.c.SHOW);
                MediationServiceImpl.this.f20206a.u().b(this.f20211a, "DID_DISPLAY");
                MediationServiceImpl.this.f20206a.p().maybeSendAdEvent(this.f20211a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f20206a.I().a(this.f20211a);
                }
                l2.c(this.f20212b, maxAd);
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f20211a.a(bundle);
            l2.d(this.f20212b, maxAd);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            this.f20211a.a(bundle);
            MediationServiceImpl.this.f20206a.l().a(this.f20211a, g.c.HIDE);
            MediationServiceImpl.this.a(this.f20211a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new o(0, this, maxAd), maxAd instanceof t2 ? ((t2) maxAd).e0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f20211a.a(bundle);
            this.f20211a.X();
            MediationServiceImpl.this.f20206a.l().a(this.f20211a, g.c.LOAD);
            MediationServiceImpl.this.b(this.f20211a);
            l2.f(this.f20212b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f20211a.X();
            MediationServiceImpl.this.b(this.f20211a, maxError, this.f20212b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public void a(a.InterfaceC0312a interfaceC0312a) {
            this.f20212b = interfaceC0312a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f20206a.I().b(maxAd);
            }
            l2.e(this.f20212b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f20211a.a(bundle);
            MediationServiceImpl.this.f20206a.l().a(this.f20211a, g.c.CLICK);
            MediationServiceImpl.this.a(this.f20211a, this.f20212b);
            l2.a((MaxAdListener) this.f20212b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f20211a.a(bundle);
            MediationServiceImpl.this.a(this.f20211a, maxError, this.f20212b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof t2)) {
                ((t2) maxAd).c0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f20211a.a(bundle);
            l2.a(this.f20212b, maxAd, maxReward);
            MediationServiceImpl.this.f20206a.q0().a((w4) new b6((t2) maxAd, MediationServiceImpl.this.f20206a), r5.b.OTHER);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    public MediationServiceImpl(com.applovin.impl.sdk.k kVar) {
        this.f20206a = kVar;
        this.f20207b = kVar.O();
        this.f20208c = new p4(kVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(final String str, final MaxAdFormat maxAdFormat, final r4 r4Var, Context context, final q4.a aVar) {
        if (r4Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        q4 q4VarB = this.f20208c.b(r4Var, str, maxAdFormat);
        if (q4VarB != null) {
            aVar.a(q4.a(q4VarB));
            return;
        }
        final h hVarA = this.f20206a.T().a(r4Var, r4Var.z());
        if (hVarA == null) {
            aVar.a(q4.a(r4Var, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        final g4 g4Var = new g4("SignalCollection:" + r4Var.c());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = g4.i;
        g4Var.a(executor, new g4.b() { // from class: com.applovin.impl.mediation.j
            @Override // com.applovin.impl.g4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                MediationServiceImpl mediationServiceImpl = this.f20472b;
                h hVar = hVarA;
                r4 r4Var2 = r4Var;
                q4.a aVar2 = aVar;
                mediationServiceImpl.a(jElapsedRealtime, hVar, str, r4Var2, maxAdFormat, aVar2, z10, (String) obj, (MaxError) obj2);
            }
        });
        w5.a(r4Var.m(), g4Var, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + r4Var.c() + ") timed out collecting signal"), "MediationService", this.f20206a);
        Activity activityU0 = context instanceof Activity ? (Activity) context : this.f20206a.u0();
        final MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(r4Var, str, maxAdFormat);
        if (r4Var.v()) {
            g4 g4VarA = this.f20206a.S().a(r4Var, activityU0);
            final Activity activity = activityU0;
            g4VarA.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20479b.a(g4Var, hVarA, maxAdapterParametersImplA, r4Var, activity);
                }
            });
            g4VarA.a(executor, new F3.k(this, hVarA, g4Var));
            return;
        }
        if (r4Var.w()) {
            g4 g4VarA2 = this.f20206a.S().a(r4Var, activityU0);
            if (g4VarA2.d() && !r4Var.y()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20207b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVarA.g());
                }
                g4Var.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) g4VarA2.a())));
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f20207b.a("MediationService", "Collecting signal for adapter: " + hVarA.g());
        }
        hVarA.a(maxAdapterParametersImplA, r4Var, activityU0, g4Var);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof q2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20207b.d("MediationService", "Destroying " + maxAd);
            }
            q2 q2Var = (q2) maxAd;
            h hVarA = q2Var.A();
            if (hVarA != null) {
                hVarA.a();
                q2Var.t();
            }
            this.f20206a.j().c(q2Var.O());
            this.f20206a.l().a(q2Var, g.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f20209d.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, EnumC2121h enumC2121h, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0312a interfaceC0312a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0312a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f20206a.V())) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.f20206a.B0()) {
            com.applovin.impl.sdk.o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = this.f20206a.K() != null ? this.f20206a.K().getAdUnitIds() : null;
        boolean zStartsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !zStartsWith) {
            if (a7.c(this.f20206a)) {
                String strI = C1154e9.i("Ad Unit ID ", str, " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://developers.applovin.com/en/max/android/overview/advanced-settings#selective-init");
                if (((Boolean) this.f20206a.a(l4.f19865X5)).booleanValue()) {
                    throw new RuntimeException(strI);
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20207b.b("MediationService", strI);
                }
            }
            this.f20206a.E().a(y1.f21826w0, "uninitialized_ad_unit_id", CollectionUtils.hashMap(Constants.ADMON_AD_UNIT_ID, str), "uninitialized_ad_unit_id".concat(str));
        }
        this.f20206a.c();
        if (str.length() != 16 && !zStartsWith && !this.f20206a.i0().startsWith("05TMD")) {
            com.applovin.impl.sdk.o.h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (this.f20206a.a(maxAdFormat)) {
            com.applovin.impl.sdk.o.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
            l2.a(interfaceC0312a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
            return;
        }
        this.f20206a.V0();
        l2.a((MaxAdRequestListener) interfaceC0312a, str, true);
        if (this.f20206a.R() != null) {
            this.f20206a.R().a(str, str2, maxAdFormat, enumC2121h, map, map2, context, interfaceC0312a);
        } else {
            this.f20206a.Q().a(str, str2, maxAdFormat, enumC2121h, map, map2, context, interfaceC0312a);
        }
    }

    public void loadThirdPartyMediatedAd(final String str, final q2 q2Var, final Activity activity, final a.InterfaceC0312a interfaceC0312a) {
        g4 g4VarA;
        if (q2Var == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f20207b.a("MediationService", "Loading " + q2Var + "...");
        }
        this.f20206a.P().a(y1.f21779V, q2Var);
        this.f20206a.l().a(q2Var, g.c.LOADING);
        this.f20206a.u().b(q2Var, "WILL_LOAD");
        this.f20206a.p().maybeSendAdEvent(q2Var, "WILL_LOAD");
        final h hVarA = this.f20206a.T().a(q2Var);
        if (hVarA == null) {
            String str2 = "Failed to load " + q2Var + ": adapter not loaded";
            com.applovin.impl.sdk.o.h("MediationService", str2);
            b(q2Var, new MaxErrorImpl(-5001, str2), interfaceC0312a);
            return;
        }
        final MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(q2Var);
        if (q2Var.V()) {
            g4VarA = this.f20206a.S().a(q2Var, activity);
        } else {
            if (q2Var.W()) {
                this.f20206a.S().a(q2Var, activity);
            }
            g4VarA = null;
        }
        final q2 q2VarA = q2Var.a(hVarA);
        hVarA.a(str, q2VarA);
        q2VarA.Y();
        if (g4VarA == null) {
            hVarA.a(str, maxAdapterParametersImplA, q2VarA, activity, new b(q2VarA, interfaceC0312a));
            return;
        }
        Executor executor = g4.i;
        g4VarA.a(executor, new g4.a() { // from class: com.applovin.impl.mediation.l
            @Override // com.applovin.impl.g4.a
            public final void a(Object obj) {
                this.f20485b.a(q2Var, interfaceC0312a, (String) obj);
            }
        });
        g4VarA.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f20488b.a(hVarA, str, maxAdapterParametersImplA, q2VarA, activity, interfaceC0312a);
            }
        });
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objA = this.f20206a.I().a();
            if (objA instanceof q2) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (q2) objA, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, q2 q2Var) {
        a(maxError, q2Var, false);
    }

    public void processAdapterInitializationPostback(a3 a3Var, long j4, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap map = new HashMap(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j4));
        a("minit", map, new MaxErrorImpl(str), a3Var);
        Map mapA = a2.a(a3Var);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j4), mapA);
        switch (a.f20210a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f20206a.P().d(y1.f21772O, mapA);
                break;
            case 4:
                this.f20206a.P().d(y1.f21773P, mapA);
                break;
            case 5:
            case 6:
                this.f20206a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20206a.O().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f20206a.E().a(y1.f21788d, "adapterNotInitializedForPostback", mapA);
                break;
        }
    }

    public void processCallbackAdImpressionPostback(q2 q2Var, a.InterfaceC0312a interfaceC0312a) {
        if (q2Var.M().endsWith("cimp")) {
            this.f20206a.u().b(q2Var);
            l2.a((MaxAdRevenueListener) interfaceC0312a, (MaxAd) q2Var);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f20206a.w0().e());
        if (!((Boolean) this.f20206a.a(l4.f20062x3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mcimp", map, q2Var);
        this.f20206a.P().a(y1.f21784a0, q2Var);
    }

    public void processRawAdImpression(q2 q2Var, a.InterfaceC0312a interfaceC0312a) {
        this.f20206a.u().b(q2Var, "WILL_DISPLAY");
        this.f20206a.p().maybeSendAdEvent(q2Var, "WILL_DISPLAY");
        if (q2Var.M().endsWith("mimp")) {
            this.f20206a.u().b(q2Var);
            l2.a((MaxAdRevenueListener) interfaceC0312a, (MaxAd) q2Var);
        }
        if (((Boolean) this.f20206a.a(l4.f19983n4)).booleanValue()) {
            this.f20206a.Y().a(h3.f19497d, i3.a(q2Var), Long.valueOf(System.currentTimeMillis() - this.f20206a.L()));
        }
        HashMap map = new HashMap(2);
        if (q2Var instanceof t2) {
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(((t2) q2Var).i0()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f20206a.w0().e());
        if (!((Boolean) this.f20206a.a(l4.f20062x3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mimp", map, q2Var);
        this.f20206a.P().a(y1.f21783Z, q2Var);
    }

    public void processViewabilityAdImpressionPostback(y2 y2Var, long j4, a.InterfaceC0312a interfaceC0312a) {
        if (y2Var.M().endsWith("vimp")) {
            this.f20206a.u().b(y2Var);
            l2.a((MaxAdRevenueListener) interfaceC0312a, (MaxAd) y2Var);
        }
        HashMap map = new HashMap(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j4));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(y2Var.j0()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f20206a.w0().e());
        if (!((Boolean) this.f20206a.a(l4.f20062x3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mvimp", map, y2Var);
        this.f20206a.P().a(y1.f21785b0, y2Var);
    }

    public void processWaterfallInfoPostback(String str, MaxAdFormat maxAdFormat, MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, MaxError maxError, long j4, long j10) {
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), map);
        CollectionUtils.putStringIfValid(Constants.ADMON_AD_UNIT_ID, str, map);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j10), map);
        if (maxError != null) {
            map.putAll(a2.a(maxError));
        }
        this.f20206a.P().d(y1.f21782Y, map);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap map2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), map2);
        CollectionUtils.putStringIfValid(Constants.ADMON_AD_UNIT_ID, str, map2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), map2);
        CollectionUtils.putStringIfValid(AppMeasurementSdk.ConditionalUserProperty.NAME, maxAdWaterfallInfoImpl.getName(), map2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j10), map2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j4), map2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), map2);
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap map3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), map3);
            map3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, mediatedNetwork.getName());
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
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, (Map) map2, (MaxError) null, (a3) null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f20209d.set(jSONObject);
    }

    public void showFullscreenAd(final t2 t2Var, final Activity activity, final a.InterfaceC0312a interfaceC0312a) {
        if (t2Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != t2Var.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f20206a.I().a(true);
        final h hVarB = b(t2Var);
        long jK0 = t2Var.k0();
        if (com.applovin.impl.sdk.o.a()) {
            this.f20207b.d("MediationService", "Showing ad " + t2Var.getAdUnitId() + " with delay of " + jK0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f20467b.a(t2Var, hVarB, activity, interfaceC0312a);
            }
        }, jK0);
    }

    private h b(t2 t2Var) {
        h hVarA = t2Var.A();
        if (hVarA != null) {
            return hVarA;
        }
        this.f20206a.I().a(false);
        if (com.applovin.impl.sdk.o.a()) {
            this.f20207b.k("MediationService", "Failed to show " + t2Var + ": adapter not found");
        }
        com.applovin.impl.sdk.o.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + t2Var.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(t2 t2Var, h hVar, Activity activity, a.InterfaceC0312a interfaceC0312a) {
        a(t2Var);
        hVar.b(t2Var, activity);
        a(t2Var, interfaceC0312a);
    }

    public void showFullscreenAd(final t2 t2Var, final ViewGroup viewGroup, final AbstractC1781n abstractC1781n, final Activity activity, final a.InterfaceC0312a interfaceC0312a) {
        if (t2Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f20206a.I().a(true);
            final h hVarB = b(t2Var);
            long jK0 = t2Var.k0();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20207b.d("MediationService", "Showing ad " + t2Var.getAdUnitId() + " with delay of " + jK0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.n
                @Override // java.lang.Runnable
                public final void run() {
                    Activity activity2 = activity;
                    this.f20495b.a(t2Var, hVarB, viewGroup, abstractC1781n, activity2, interfaceC0312a);
                }
            }, jK0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(t2 t2Var, h hVar, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity, a.InterfaceC0312a interfaceC0312a) {
        a(t2Var);
        hVar.a(t2Var, viewGroup, abstractC1781n, activity);
        a(t2Var, interfaceC0312a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(q2 q2Var, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, q2Var);
        destroyAd(q2Var);
        l2.a(maxAdListener, q2Var.getAdUnitId(), maxError);
    }

    private void a(t2 t2Var) {
        if (t2Var.getFormat() == MaxAdFormat.REWARDED) {
            this.f20206a.q0().a((w4) new h6(t2Var, this.f20206a), r5.b.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(q2 q2Var) {
        this.f20206a.u().b(q2Var, "DID_LOAD");
        this.f20206a.p().maybeSendAdEvent(q2Var, "DID_LOAD");
        if (q2Var.M().endsWith("load")) {
            this.f20206a.u().b(q2Var);
        }
        HashMap map = new HashMap(3);
        long jG = q2Var.G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jG));
        if (q2Var.getFormat().isFullscreenAd()) {
            n.a aVarB = this.f20206a.I().b(q2Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("load", map, q2Var);
        Map mapA = a2.a(q2Var);
        mapA.put("duration_ms", String.valueOf(jG));
        this.f20206a.P().d(y1.f21780W, mapA);
    }

    private void a(t2 t2Var, a.InterfaceC0312a interfaceC0312a) {
        this.f20206a.I().a(false);
        a(t2Var, (MaxAdListener) interfaceC0312a);
        if (com.applovin.impl.sdk.o.a()) {
            this.f20207b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(t2Var, interfaceC0312a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(q2 q2Var, a.InterfaceC0312a interfaceC0312a, String str) {
        String str2 = "Failed to load " + q2Var + ": adapter init failed with error: " + str;
        if (com.applovin.impl.sdk.o.a()) {
            this.f20207b.k("MediationService", str2);
        }
        b(q2Var, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0312a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, q2 q2Var, Activity activity, a.InterfaceC0312a interfaceC0312a) {
        hVar.a(str, maxAdapterParametersImpl, q2Var, activity, new b(q2Var, interfaceC0312a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j4, h hVar, String str, r4 r4Var, MaxAdFormat maxAdFormat, q4.a aVar, boolean z10, String str2, MaxError maxError) {
        q4 q4VarA;
        String str3;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j4;
        if (z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20207b.a("MediationService", "Signal collection successful from: " + hVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
                str3 = str2;
            } else {
                str3 = str2;
            }
            q4VarA = q4.a(r4Var, hVar, str3, j4, jElapsedRealtime);
            this.f20208c.a(q4VarA, r4Var, str, maxAdFormat);
            HashMap map = new HashMap();
            CollectionUtils.putStringIfValid("network_name", r4Var.c(), map);
            CollectionUtils.putStringIfValid("adapter_class", r4Var.b(), map);
            CollectionUtils.putStringIfValid("adapter_version", hVar.b(), map);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jElapsedRealtime), map);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), map);
            CollectionUtils.putStringIfValid(Constants.ADMON_AD_UNIT_ID, str, map);
            this.f20206a.P().d(y1.f21774Q, map);
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20207b.b("MediationService", "Signal collection failed from: " + hVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            q4VarA = q4.a(r4Var, hVar, maxError, j4, jElapsedRealtime);
            a(q4VarA, r4Var, hVar);
        }
        aVar.a(q4VarA);
        hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g4 g4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, r4 r4Var, Activity activity) {
        if (g4Var.c()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f20207b.a("MediationService", "Collecting signal for now-initialized adapter: " + hVar.g());
        }
        hVar.a(maxAdapterParametersImpl, r4Var, activity, g4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, g4 g4Var, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20207b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVar.g());
        }
        g4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, androidx.work.s.d("Could not initialize adapter: ", str)));
    }

    private void a(t2 t2Var, MaxAdListener maxAdListener) {
        Long l5 = (Long) this.f20206a.a(g3.f19416r7);
        if (l5.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new D3.a(this, t2Var, l5, maxAdListener, 1), l5.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(t2 t2Var, Long l5, MaxAdListener maxAdListener) {
        if (t2Var.u().get()) {
            return;
        }
        String str = "Ad (" + t2Var.k() + ") has not been displayed after " + l5 + "ms. Failing ad display...";
        com.applovin.impl.sdk.o.h("MediationService", str);
        a(t2Var, new MaxErrorImpl(-1, str), maxAdListener);
        this.f20206a.I().b(t2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(q2 q2Var, MaxError maxError, MaxAdListener maxAdListener) {
        this.f20206a.l().a(q2Var, g.c.SHOW_ERROR);
        this.f20206a.u().b(q2Var, "DID_FAIL_DISPLAY");
        this.f20206a.p().maybeSendAdEvent(q2Var, "DID_FAIL_DISPLAY");
        a(maxError, q2Var, true);
        if (q2Var.u().compareAndSet(false, true)) {
            l2.a(maxAdListener, q2Var, maxError);
        }
    }

    private void a(MaxError maxError, q2 q2Var) {
        HashMap map = new HashMap(3);
        long jG = q2Var.G();
        map.put("{LOAD_TIME_MS}", String.valueOf(jG));
        if (q2Var.getFormat().isFullscreenAd()) {
            n.a aVarB = this.f20206a.I().b(q2Var.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.a()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.b()));
        }
        a("mlerr", map, maxError, q2Var);
        Map mapA = a2.a(q2Var);
        mapA.putAll(a2.a(maxError));
        mapA.put("duration_ms", String.valueOf(jG));
        this.f20206a.P().d(y1.f21781X, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(q2 q2Var) {
        this.f20206a.u().b(q2Var, "DID_HIDE");
        this.f20206a.p().maybeSendAdEvent(q2Var, "DID_HIDE");
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f20206a.w0().e());
        if (!((Boolean) this.f20206a.a(l4.f20062x3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclose", map, q2Var);
        this.f20206a.P().a(y1.f21789d0, q2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(q2 q2Var, a.InterfaceC0312a interfaceC0312a) {
        this.f20206a.u().b(q2Var, "DID_CLICKED");
        this.f20206a.u().b(q2Var, "DID_CLICK");
        this.f20206a.p().maybeSendAdEvent(q2Var, "DID_CLICK");
        if (q2Var.M().endsWith("click")) {
            this.f20206a.u().b(q2Var);
            l2.a((MaxAdRevenueListener) interfaceC0312a, (MaxAd) q2Var);
        }
        HashMap map = new HashMap(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f20206a.w0().e());
        if (!((Boolean) this.f20206a.a(l4.f20062x3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mclick", map, q2Var);
    }

    private void a(MaxError maxError, q2 q2Var, boolean z10) {
        a("mierr", Collections.EMPTY_MAP, maxError, q2Var, z10);
        if (!z10 || q2Var == null) {
            return;
        }
        this.f20206a.P().a(y1.f21787c0, q2Var, maxError);
    }

    private void a(q4 q4Var, r4 r4Var, h hVar) {
        long jB = q4Var.b();
        HashMap map = new HashMap(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(jB));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", hVar.b(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", hVar.i(), map);
        a("serr", map, q4Var.c(), r4Var);
        Map mapA = a2.a(q4Var.c());
        CollectionUtils.putStringIfValid("network_name", r4Var.c(), mapA);
        CollectionUtils.putStringIfValid("adapter_class", r4Var.b(), mapA);
        CollectionUtils.putStringIfValid("adapter_version", hVar.b(), mapA);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(jB), mapA);
        this.f20206a.P().d(y1.f21775R, mapA);
    }

    private void a(String str, Map map, a3 a3Var) {
        a(str, map, (MaxError) null, a3Var);
    }

    private void a(String str, Map map, MaxError maxError, a3 a3Var) {
        a(str, map, maxError, a3Var, true);
    }

    private void a(String str, Map map, MaxError maxError, a3 a3Var, boolean z10) {
        String strEmptyIfNull;
        Map map2 = CollectionUtils.map(map);
        String strEmptyIfNull2 = "";
        map2.put("{PLACEMENT}", z10 ? StringUtils.emptyIfNull(a3Var.getPlacement()) : "");
        if (!z10) {
            strEmptyIfNull = "";
        } else {
            strEmptyIfNull = StringUtils.emptyIfNull(a3Var.e());
        }
        map2.put("{CUSTOM_DATA}", strEmptyIfNull);
        if (a3Var instanceof q2) {
            q2 q2Var = (q2) a3Var;
            if (z10) {
                strEmptyIfNull2 = StringUtils.emptyIfNull(q2Var.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", strEmptyIfNull2);
        }
        a(str, (List) null, map2, (Map) null, maxError, a3Var, z10);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, a3 a3Var, boolean z10) {
        this.f20206a.q0().a((w4) new p5(str, list, map, map2, maxError, a3Var, this.f20206a, z10), r5.b.OTHER);
    }
}
