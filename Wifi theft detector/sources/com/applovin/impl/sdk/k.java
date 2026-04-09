package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.a5;
import com.applovin.impl.c4;
import com.applovin.impl.c6;
import com.applovin.impl.d6;
import com.applovin.impl.f7;
import com.applovin.impl.h8;
import com.applovin.impl.i5;
import com.applovin.impl.j4;
import com.applovin.impl.k3;
import com.applovin.impl.l3;
import com.applovin.impl.l7;
import com.applovin.impl.l8;
import com.applovin.impl.m7;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n7;
import com.applovin.impl.p3;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t5;
import com.applovin.impl.u0;
import com.applovin.impl.u3;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.w4;
import com.applovin.impl.x4;
import com.applovin.impl.y3;
import com.applovin.impl.y4;
import com.applovin.impl.z2;
import com.applovin.impl.z4;
import com.applovin.impl.z6;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {
    public static k C0;
    protected static Context D0;
    private static boolean E0;
    private static final boolean G0;
    private static volatile com.applovin.impl.c H0;

    /* renamed from: a, reason: collision with root package name */
    private String f7816a;

    /* renamed from: b, reason: collision with root package name */
    private String f7818b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f7820c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7822d;

    /* renamed from: e, reason: collision with root package name */
    private long f7824e;

    /* renamed from: f, reason: collision with root package name */
    private long f7826f;

    /* renamed from: g, reason: collision with root package name */
    private Long f7828g;

    /* renamed from: h, reason: collision with root package name */
    private long f7830h;

    /* renamed from: i0, reason: collision with root package name */
    private com.applovin.impl.mediation.e f7833i0;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinSdkSettings f7834j;

    /* renamed from: k, reason: collision with root package name */
    private MaxSegmentCollection f7836k;

    /* renamed from: k0, reason: collision with root package name */
    private List f7837k0;

    /* renamed from: l, reason: collision with root package name */
    private String f7838l;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f7847p0;

    /* renamed from: q, reason: collision with root package name */
    private volatile AppLovinSdk f7848q;

    /* renamed from: u0, reason: collision with root package name */
    private String f7857u0;

    /* renamed from: v0, reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f7859v0;

    /* renamed from: y0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f7865y0;

    /* renamed from: z0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f7867z0;
    private static final Object I0 = new Object();
    private static final long F0 = System.currentTimeMillis();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f7832i = new AtomicBoolean();

    /* renamed from: m, reason: collision with root package name */
    private final AtomicReference f7840m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicReference f7842n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f7844o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    private final AtomicReference f7846p = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    private final o f7850r = new o(this);

    /* renamed from: s, reason: collision with root package name */
    private final com.applovin.impl.f f7852s = new com.applovin.impl.f(this);

    /* renamed from: t, reason: collision with root package name */
    private final z2 f7854t = new z2(this);

    /* renamed from: u, reason: collision with root package name */
    private final com.applovin.impl.r1 f7856u = new com.applovin.impl.r1(this);

    /* renamed from: v, reason: collision with root package name */
    private final l7 f7858v = new l7(this);

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f7860w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicReference f7862x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    private final AtomicReference f7864y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    private final AtomicReference f7866z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();

    /* renamed from: a0, reason: collision with root package name */
    private final AtomicReference f7817a0 = new AtomicReference();

    /* renamed from: b0, reason: collision with root package name */
    private final AtomicReference f7819b0 = new AtomicReference();

    /* renamed from: c0, reason: collision with root package name */
    private final AtomicReference f7821c0 = new AtomicReference();

    /* renamed from: d0, reason: collision with root package name */
    private final AtomicReference f7823d0 = new AtomicReference();

    /* renamed from: e0, reason: collision with root package name */
    private final AtomicReference f7825e0 = new AtomicReference();

    /* renamed from: f0, reason: collision with root package name */
    private final AtomicReference f7827f0 = new AtomicReference();

    /* renamed from: g0, reason: collision with root package name */
    private final AtomicReference f7829g0 = new AtomicReference();

    /* renamed from: h0, reason: collision with root package name */
    private final AtomicReference f7831h0 = new AtomicReference();

    /* renamed from: j0, reason: collision with root package name */
    private final AtomicReference f7835j0 = new AtomicReference();

    /* renamed from: l0, reason: collision with root package name */
    private final Object f7839l0 = new Object();

    /* renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f7841m0 = new AtomicBoolean(true);

    /* renamed from: n0, reason: collision with root package name */
    private final AtomicBoolean f7843n0 = new AtomicBoolean();

    /* renamed from: o0, reason: collision with root package name */
    private final AtomicBoolean f7845o0 = new AtomicBoolean();

    /* renamed from: q0, reason: collision with root package name */
    private boolean f7849q0 = false;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f7851r0 = false;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f7853s0 = false;

    /* renamed from: t0, reason: collision with root package name */
    private int f7855t0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    private final Object f7861w0 = new Object();

    /* renamed from: x0, reason: collision with root package name */
    private SdkConfigurationImpl f7863x0 = new SdkConfigurationImpl(this);
    private final i5 A0 = new r6(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.p0
        @Override // java.lang.Runnable
        public final void run() {
            this.f8071a.K0();
        }
    });
    private final i5 B0 = new r6(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.q0
        @Override // java.lang.Runnable
        public final void run() {
            this.f8076a.L0();
        }
    });

    public class a implements t5.b {
        public a() {
        }

        @Override // com.applovin.impl.t5.b
        public void a(JSONObject jSONObject) throws JSONException {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            k.this.c(jSONObject);
            if (((Boolean) k.this.a(r3.f7459e8)).booleanValue()) {
                k kVar = k.this;
                kVar.f7833i0 = new com.applovin.impl.mediation.e(kVar);
            }
            k.this.m().a();
            com.applovin.impl.r0.a(jSONObject, zIsValid, k.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            k.this.U().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k.this.D().b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(l.J()));
            JsonUtils.putBoolean(jSONObject2, "init_success", zIsValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(k.D0).getAll().size());
            k.this.v0().d(com.applovin.impl.d2.f5725f, CollectionUtils.map("details", jSONObject2.toString()));
            k kVar2 = k.this;
            kVar2.f7837k0 = kVar2.a(jSONObject);
            if (zIsValid) {
                k.this.f7863x0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            k.this.s0().a(jSONObject);
            k.this.b(jSONObject);
            t2.b(((Boolean) k.this.a(x4.f8609w6)).booleanValue());
            t2.a(((Boolean) k.this.a(x4.f8617x6)).booleanValue());
            k.this.P0();
            if (!((Boolean) k.this.a(x4.f8445d3)).booleanValue() || zIsValid || !com.applovin.impl.r0.a(k.o())) {
                k.this.N0();
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.this.S0();
        }
    }

    public class b implements u0.c {
        public b() {
        }

        @Override // com.applovin.impl.u0.c
        public void a(u0.b bVar) {
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            k.this.f7845o0.set(bVar.b());
            if (!bVar.a()) {
                k.this.c("Initializing SDK in MAX environment...");
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            k.this.R0();
            k.this.Q0();
        }
    }

    public class c implements t5.b {
        public c() {
        }

        @Override // com.applovin.impl.t5.b
        public void a(JSONObject jSONObject) {
            k.this.c(jSONObject);
            k.this.f7832i.set(false);
            k.this.N0();
        }
    }

    public class d implements y3.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y3 f7871a;

        public d(y3 y3Var) {
            this.f7871a = y3Var;
        }

        @Override // com.applovin.impl.y3.a
        public void a() {
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.f7839l0) {
                try {
                    if (!k.this.f7847p0) {
                        k.this.R0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f7871a.b(this);
        }

        @Override // com.applovin.impl.y3.a
        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k0
                @Override // java.lang.Runnable
                public final void run() {
                    n7.c();
                }
            });
            G0 = true;
        } catch (Throwable unused) {
            G0 = false;
        }
    }

    public k(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f7847p0 = false;
        C0 = this;
        this.f7834j = appLovinSdkSettings;
        this.f7822d = System.currentTimeMillis();
        this.f7847p0 = true;
        if (!F0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
        }
        D0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f7820c = new WeakReference((Activity) context);
        }
    }

    private void A0() {
        Context context = D0;
        o oVarO = O();
        a5 a5VarP0 = p0();
        com.applovin.impl.u0 u0VarX = x();
        a(context);
        m0();
        j();
        c0();
        S().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f7816a;
        if (str == null || str.length() != 86) {
            o.h("AppLovinSdk", "SDK key provided is invalid (" + this.f7816a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f7818b) && this.f7818b.length() != 36) {
            String str2 = "Axon event key length " + this.f7818b + " is invalid - expected 36";
            if (n7.c(this)) {
                throw new IllegalArgumentException(str2);
            }
            o.h("AppLovinSdk", str2);
        }
        if (u0VarX.l()) {
            String str3 = "Terms Flow has been replaced. " + u0VarX.g();
            if (n7.c(this)) {
                throw new IllegalStateException(str3);
            }
            o.h("AppLovinSdk", str3);
        }
        if (n7.j()) {
            o.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!n7.b(this)) {
            o.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (n7.m(context)) {
            this.f7834j.setVerboseLogging(true);
        }
        o0().a(x4.f8504k, Boolean.valueOf(this.f7834j.isVerboseLoggingEnabled()));
        w3.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        z4 z4Var = z4.f8776c;
        if (TextUtils.isEmpty((String) a5VarP0.a(z4Var, (Object) null, defaultSharedPreferences))) {
            this.f7851r0 = true;
            a5VarP0.b(z4Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            a5VarP0.b(z4Var, Boolean.toString(false), defaultSharedPreferences);
        }
        z4 z4Var2 = z4.f8777d;
        if (((Boolean) a5VarP0.a(z4Var2, Boolean.FALSE)).booleanValue()) {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f7853s0 = true;
        } else {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            a5VarP0.b(z4Var2, Boolean.TRUE);
            a5VarP0.b(z4.f8793t, Boolean.valueOf(u0VarX.j()));
        }
        z4 z4Var3 = z4.f8778e;
        this.f7826f = ((Long) a5VarP0.a(z4Var3, 0L)).longValue() + 1;
        p0().b(z4Var3, Long.valueOf(this.f7826f));
        z4 z4Var4 = z4.f8779f;
        this.f7828g = (Long) a5VarP0.a(z4Var4, null);
        p0().b(z4Var4, Long.valueOf(F0));
        z4 z4Var5 = z4.f8780g;
        String str4 = (String) a5VarP0.a(z4Var5, null);
        if (StringUtils.isValidString(str4)) {
            if (AppLovinSdk.VERSION_CODE > n7.g(str4)) {
                a5VarP0.b(z4Var5, AppLovinSdk.VERSION);
            }
        } else {
            a5VarP0.b(z4Var5, AppLovinSdk.VERSION);
        }
        v0().d(com.applovin.impl.d2.f5723e, CollectionUtils.map("details", "isInitProviderContextSet=" + E0));
    }

    public static boolean F0() {
        return G0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() throws JSONException {
        if (q0().f()) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Timing out adapters init...");
        }
        q0().g();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        d6 d6VarQ0 = q0();
        int i10 = this.f7855t0 + 1;
        this.f7855t0 = i10;
        d6VarQ0.a((i5) new t5(i10, this, new c()), d6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        if (G0()) {
            com.applovin.impl.k2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        synchronized (this.f7839l0) {
            try {
                boolean zA = com.applovin.impl.r0.a(o());
                if (!G0()) {
                    O();
                    if (o.a()) {
                        O().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + V());
                    }
                }
                if (!((Boolean) a(x4.f8454e3)).booleanValue() || zA) {
                    R0();
                }
                if (((Boolean) a(x4.f8445d3)).booleanValue() && !zA) {
                    O();
                    if (o.a()) {
                        O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    S0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        Long l10 = (Long) a(x4.f8526m3);
        if (l10.longValue() >= 0 && this.f7832i.compareAndSet(false, true)) {
            h8.a(l10.longValue(), false, this, new Runnable() { // from class: com.applovin.impl.sdk.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8059a.J0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        if (!G0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f7843n0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!x().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            x().a(u0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        y3 y3VarC0 = c0();
        y3VarC0.a(new d(y3VarC0));
    }

    private Map W() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(x4.f8491i4)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    public static Context o() {
        return D0;
    }

    public l A() {
        Object lVar = this.A.get();
        if (lVar == null) {
            synchronized (this.A) {
                try {
                    lVar = this.A.get();
                    if (lVar == null) {
                        lVar = new l(this);
                        this.A.set(lVar);
                    }
                } finally {
                }
            }
        }
        if (lVar == this.A) {
            lVar = null;
        }
        return (l) lVar;
    }

    public com.applovin.impl.j1 B() {
        Object j1Var = this.D.get();
        if (j1Var == null) {
            synchronized (this.D) {
                try {
                    j1Var = this.D.get();
                    if (j1Var == null) {
                        j1Var = new com.applovin.impl.j1(this);
                        this.D.set(j1Var);
                    }
                } finally {
                }
            }
        }
        if (j1Var == this.D) {
            j1Var = null;
        }
        return (com.applovin.impl.j1) j1Var;
    }

    public boolean B0() {
        boolean z10;
        synchronized (this.f7839l0) {
            z10 = this.f7849q0;
        }
        return z10;
    }

    public String C() {
        return this.f7857u0;
    }

    public boolean C0() {
        return this.f7851r0;
    }

    public com.applovin.impl.r1 D() {
        return this.f7856u;
    }

    public boolean D0() {
        boolean z10;
        synchronized (this.f7861w0) {
            z10 = this.f7859v0 != null;
        }
        return z10;
    }

    public String E() {
        return w0().d();
    }

    public boolean E0() {
        boolean z10;
        synchronized (this.f7839l0) {
            z10 = this.f7847p0;
        }
        return z10;
    }

    public EventServiceImpl F() {
        Object eventServiceImpl = this.f7844o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f7844o) {
                try {
                    eventServiceImpl = this.f7844o.get();
                    if (eventServiceImpl == null) {
                        eventServiceImpl = new EventServiceImpl(this);
                        this.f7844o.set(eventServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (eventServiceImpl == this.f7844o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public m G() {
        Object mVar = this.G.get();
        if (mVar == null) {
            synchronized (this.G) {
                try {
                    mVar = this.G.get();
                    if (mVar == null) {
                        mVar = new m(this);
                        this.G.set(mVar);
                    }
                } finally {
                }
            }
        }
        if (mVar == this.G) {
            mVar = null;
        }
        return (m) mVar;
    }

    public boolean G0() {
        return StringUtils.containsIgnoreCase(V(), AppLovinMediationProvider.MAX);
    }

    public n H() {
        Object nVar = this.I.get();
        if (nVar == null) {
            synchronized (this.I) {
                try {
                    nVar = this.I.get();
                    if (nVar == null) {
                        nVar = new n(this);
                        this.I.set(nVar);
                    }
                } finally {
                }
            }
        }
        if (nVar == this.I) {
            nVar = null;
        }
        return (n) nVar;
    }

    public boolean H0() {
        return n7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity I() {
        WeakReference weakReference;
        if (!((Boolean) a(x4.f8623y4)).booleanValue() || (weakReference = this.f7820c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration J() {
        return this.f7859v0;
    }

    public long K() {
        return this.f7822d;
    }

    public Long L() {
        return this.f7828g;
    }

    public long M() {
        return this.f7826f;
    }

    public void M0() throws JSONException {
        b(false);
    }

    public com.applovin.impl.o2 N() {
        Object o2Var = this.X.get();
        if (o2Var == null) {
            synchronized (this.X) {
                try {
                    o2Var = this.X.get();
                    if (o2Var == null) {
                        o2Var = new com.applovin.impl.o2(this);
                        this.X.set(o2Var);
                    }
                } finally {
                }
            }
        }
        if (o2Var == this.X) {
            o2Var = null;
        }
        return (com.applovin.impl.o2) o2Var;
    }

    public o O() {
        return this.f7850r;
    }

    public void O0() {
        if (StringUtils.isValidString(this.f7838l)) {
            return;
        }
        this.f7838l = AppLovinMediationProvider.MAX;
    }

    public z2 P() {
        return this.f7854t;
    }

    public com.applovin.impl.mediation.d Q() {
        Object dVar = this.f7831h0.get();
        if (dVar == null) {
            synchronized (this.f7831h0) {
                try {
                    dVar = this.f7831h0.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.mediation.d(this);
                        this.f7831h0.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.f7831h0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public void Q0() {
        t().a();
    }

    public com.applovin.impl.mediation.e R() {
        return this.f7833i0;
    }

    public void R0() {
        synchronized (this.f7839l0) {
            this.f7847p0 = true;
            q0().h();
            d();
        }
    }

    public com.applovin.impl.mediation.f S() {
        Object fVar = this.f7821c0.get();
        if (fVar == null) {
            synchronized (this.f7821c0) {
                try {
                    fVar = this.f7821c0.get();
                    if (fVar == null) {
                        fVar = new com.applovin.impl.mediation.f(this);
                        this.f7821c0.set(fVar);
                    }
                } finally {
                }
            }
        }
        if (fVar == this.f7821c0) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public com.applovin.impl.mediation.g T() {
        Object gVar = this.f7819b0.get();
        if (gVar == null) {
            synchronized (this.f7819b0) {
                try {
                    gVar = this.f7819b0.get();
                    if (gVar == null) {
                        gVar = new com.applovin.impl.mediation.g(this);
                        this.f7819b0.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.f7819b0) {
            gVar = null;
        }
        return (com.applovin.impl.mediation.g) gVar;
    }

    public void T0() {
        o.h("AppLovinSdk", "Resetting SDK state...");
        o0().a();
        o0().e();
        if (this.f7841m0.compareAndSet(true, false)) {
            R0();
        } else {
            this.f7841m0.set(true);
        }
    }

    public p3 U() {
        Object p3Var = this.f7827f0.get();
        if (p3Var == null) {
            synchronized (this.f7827f0) {
                try {
                    p3Var = this.f7827f0.get();
                    if (p3Var == null) {
                        p3Var = new p3(this);
                        this.f7827f0.set(p3Var);
                    }
                } finally {
                }
            }
        }
        if (p3Var == this.f7827f0) {
            p3Var = null;
        }
        return (p3) p3Var;
    }

    public void U0() {
        if (StringUtils.isValidString(this.f7857u0)) {
            return;
        }
        this.f7857u0 = AppLovinMediationProvider.MAX;
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public String V() {
        return this.f7838l;
    }

    public void V0() {
        y().n();
    }

    public void W0() {
        a((Map) null);
    }

    public MediationServiceImpl X() {
        Object mediationServiceImpl = this.f7823d0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f7823d0) {
                try {
                    mediationServiceImpl = this.f7823d0.get();
                    if (mediationServiceImpl == null) {
                        mediationServiceImpl = new MediationServiceImpl(this);
                        this.f7823d0.set(mediationServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (mediationServiceImpl == this.f7823d0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public void X0() {
        if (AppLovinMediationProvider.ADMOB.equalsIgnoreCase(this.f7838l) && ((Boolean) a(x4.M3)).booleanValue()) {
            String str = (String) a(x4.L3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb.append(str2);
            sb.append(".");
            if (str.startsWith(sb.toString())) {
                return;
            }
            final String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            o.h("AppLovinSdk", str3);
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7920a.b(str3);
                }
            });
        }
    }

    public u3 Y() {
        Object u3Var = this.f7866z.get();
        if (u3Var == null) {
            synchronized (this.f7866z) {
                try {
                    u3Var = this.f7866z.get();
                    if (u3Var == null) {
                        u3Var = new u3(this);
                        this.f7866z.set(u3Var);
                    }
                } finally {
                }
            }
        }
        if (u3Var == this.f7866z) {
            u3Var = null;
        }
        return (u3) u3Var;
    }

    public v3 Z() {
        Object v3Var = this.f7825e0.get();
        if (v3Var == null) {
            synchronized (this.f7825e0) {
                try {
                    v3Var = this.f7825e0.get();
                    if (v3Var == null) {
                        v3Var = new v3();
                        this.f7825e0.set(v3Var);
                    }
                } finally {
                }
            }
        }
        if (v3Var == this.f7825e0) {
            v3Var = null;
        }
        return (v3) v3Var;
    }

    public p a0() {
        Object pVar = this.f7829g0.get();
        if (pVar == null) {
            synchronized (this.f7829g0) {
                try {
                    pVar = this.f7829g0.get();
                    if (pVar == null) {
                        pVar = new p(this);
                        this.f7829g0.set(pVar);
                    }
                } finally {
                }
            }
        }
        if (pVar == this.f7829g0) {
            pVar = null;
        }
        return (p) pVar;
    }

    public AppLovinNativeAdService b0() {
        Object appLovinNativeAdService = this.f7842n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f7842n) {
                try {
                    appLovinNativeAdService = this.f7842n.get();
                    if (appLovinNativeAdService == null) {
                        appLovinNativeAdService = new AppLovinNativeAdService(this);
                        this.f7842n.set(appLovinNativeAdService);
                    }
                } finally {
                }
            }
        }
        if (appLovinNativeAdService == this.f7842n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public y3 c0() {
        Object y3Var = this.L.get();
        if (y3Var == null) {
            synchronized (this.L) {
                try {
                    y3Var = this.L.get();
                    if (y3Var == null) {
                        y3Var = new y3(o());
                        this.L.set(y3Var);
                    }
                } finally {
                }
            }
        }
        if (y3Var == this.L) {
            y3Var = null;
        }
        return (y3) y3Var;
    }

    public c4 d0() {
        Object c4Var = this.W.get();
        if (c4Var == null) {
            synchronized (this.W) {
                try {
                    c4Var = this.W.get();
                    if (c4Var == null) {
                        c4Var = new c4(this);
                        this.W.set(c4Var);
                    }
                } finally {
                }
            }
        }
        if (c4Var == this.W) {
            c4Var = null;
        }
        return (c4) c4Var;
    }

    public j4 e0() {
        Object j4Var = this.S.get();
        if (j4Var == null) {
            synchronized (this.S) {
                try {
                    j4Var = this.S.get();
                    if (j4Var == null) {
                        j4Var = new j4(this);
                        this.S.set(j4Var);
                    }
                } finally {
                }
            }
        }
        if (j4Var == this.S) {
            j4Var = null;
        }
        return (j4) j4Var;
    }

    public com.applovin.impl.sdk.network.b f0() {
        Object bVar = this.Z.get();
        if (bVar == null) {
            synchronized (this.Z) {
                try {
                    bVar = this.Z.get();
                    if (bVar == null) {
                        bVar = new com.applovin.impl.sdk.network.b(this);
                        this.Z.set(bVar);
                    }
                } finally {
                }
            }
        }
        if (bVar == this.Z) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public PostbackServiceImpl g0() {
        Object postbackServiceImpl = this.Y.get();
        if (postbackServiceImpl == null) {
            synchronized (this.Y) {
                try {
                    postbackServiceImpl = this.Y.get();
                    if (postbackServiceImpl == null) {
                        postbackServiceImpl = new PostbackServiceImpl(this);
                        this.Y.set(postbackServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (postbackServiceImpl == this.Y) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public String h0() {
        return w0().a();
    }

    public String i0() {
        return this.f7816a;
    }

    public MaxSegmentCollectionImpl j0() {
        return (MaxSegmentCollectionImpl) this.f7836k;
    }

    public Map k0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplJ0 = j0();
        if (maxSegmentCollectionImplJ0 == null) {
            return null;
        }
        return maxSegmentCollectionImplJ0.getJsonData();
    }

    public w4 l0() {
        Object w4Var = this.N.get();
        if (w4Var == null) {
            synchronized (this.N) {
                try {
                    w4Var = this.N.get();
                    if (w4Var == null) {
                        w4Var = new w4(this);
                        this.N.set(w4Var);
                    }
                } finally {
                }
            }
        }
        if (w4Var == this.N) {
            w4Var = null;
        }
        return (w4) w4Var;
    }

    public SessionTracker m0() {
        Object sessionTracker = this.H.get();
        if (sessionTracker == null) {
            synchronized (this.H) {
                try {
                    sessionTracker = this.H.get();
                    if (sessionTracker == null) {
                        sessionTracker = new SessionTracker(this);
                        this.H.set(sessionTracker);
                    }
                } finally {
                }
            }
        }
        if (sessionTracker == this.H) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public AppLovinSdkSettings n0() {
        return this.f7834j;
    }

    public y4 o0() {
        Object y4Var = this.f7862x.get();
        if (y4Var == null) {
            synchronized (this.f7862x) {
                try {
                    y4Var = this.f7862x.get();
                    if (y4Var == null) {
                        y4Var = new y4(this);
                        this.f7862x.set(y4Var);
                    }
                } finally {
                }
            }
        }
        if (y4Var == this.f7862x) {
            y4Var = null;
        }
        return (y4) y4Var;
    }

    public i p() {
        Object iVar = this.O.get();
        if (iVar == null) {
            synchronized (this.O) {
                try {
                    iVar = this.O.get();
                    if (iVar == null) {
                        iVar = new i(this);
                        this.O.set(iVar);
                    }
                } finally {
                }
            }
        }
        if (iVar == this.O) {
            iVar = null;
        }
        return (i) iVar;
    }

    public a5 p0() {
        Object a5Var = this.B.get();
        if (a5Var == null) {
            synchronized (this.B) {
                try {
                    a5Var = this.B.get();
                    if (a5Var == null) {
                        a5Var = new a5(this);
                        this.B.set(a5Var);
                    }
                } finally {
                }
            }
        }
        if (a5Var == this.B) {
            a5Var = null;
        }
        return (a5) a5Var;
    }

    public String q() {
        return this.f7818b;
    }

    public d6 q0() {
        Object d6Var = this.f7860w.get();
        if (d6Var == null) {
            synchronized (this.f7860w) {
                try {
                    d6Var = this.f7860w.get();
                    if (d6Var == null) {
                        d6Var = new d6(this);
                        this.f7860w.set(d6Var);
                    }
                } finally {
                }
            }
        }
        if (d6Var == this.f7860w) {
            d6Var = null;
        }
        return (d6) d6Var;
    }

    public String r() {
        return w0().b();
    }

    public z6 r0() {
        Object z6Var = this.Q.get();
        if (z6Var == null) {
            synchronized (this.Q) {
                try {
                    z6Var = this.Q.get();
                    if (z6Var == null) {
                        z6Var = new z6(this);
                        this.Q.set(z6Var);
                    }
                } finally {
                }
            }
        }
        if (z6Var == this.Q) {
            z6Var = null;
        }
        return (z6) z6Var;
    }

    public CmpServiceImpl s() {
        Object cmpServiceImpl = this.f7846p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f7846p) {
                try {
                    cmpServiceImpl = this.f7846p.get();
                    if (cmpServiceImpl == null) {
                        cmpServiceImpl = new CmpServiceImpl(this);
                        this.f7846p.set(cmpServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (cmpServiceImpl == this.f7846p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public f7 s0() {
        Object f7Var = this.f7835j0.get();
        if (f7Var == null) {
            synchronized (this.f7835j0) {
                try {
                    f7Var = this.f7835j0.get();
                    if (f7Var == null) {
                        f7Var = new f7(this);
                        this.f7835j0.set(f7Var);
                    }
                } finally {
                }
            }
        }
        if (f7Var == this.f7835j0) {
            f7Var = null;
        }
        return (f7) f7Var;
    }

    public j t() {
        Object jVar = this.M.get();
        if (jVar == null) {
            synchronized (this.M) {
                try {
                    jVar = this.M.get();
                    if (jVar == null) {
                        jVar = new j(this);
                        this.M.set(jVar);
                    }
                } finally {
                }
            }
        }
        if (jVar == this.M) {
            jVar = null;
        }
        return (j) jVar;
    }

    public long t0() {
        if (this.f7830h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f7830h;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f7816a + "', enabled=" + this.f7849q0 + ", isFirstSession=" + this.f7851r0 + '}';
    }

    public String u() {
        return w0().c();
    }

    public Activity u0() {
        Activity activityB = a(o()).b();
        return activityB != null ? activityB : I();
    }

    public SdkConfigurationImpl v() {
        return this.f7863x0;
    }

    public l7 v0() {
        return this.f7858v;
    }

    public com.applovin.impl.q0 w() {
        Object q0Var = this.f7864y.get();
        if (q0Var == null) {
            synchronized (this.f7864y) {
                try {
                    q0Var = this.f7864y.get();
                    if (q0Var == null) {
                        q0Var = new com.applovin.impl.q0(this);
                        this.f7864y.set(q0Var);
                    }
                } finally {
                }
            }
        }
        if (q0Var == this.f7864y) {
            q0Var = null;
        }
        return (com.applovin.impl.q0) q0Var;
    }

    public m7 w0() {
        Object m7Var = this.C.get();
        if (m7Var == null) {
            synchronized (this.C) {
                try {
                    m7Var = this.C.get();
                    if (m7Var == null) {
                        m7Var = new m7(this);
                        this.C.set(m7Var);
                    }
                } finally {
                }
            }
        }
        if (m7Var == this.C) {
            m7Var = null;
        }
        return (m7) m7Var;
    }

    public com.applovin.impl.u0 x() {
        Object u0Var = this.P.get();
        if (u0Var == null) {
            synchronized (this.P) {
                try {
                    u0Var = this.P.get();
                    if (u0Var == null) {
                        u0Var = new com.applovin.impl.u0(this);
                        this.P.set(u0Var);
                    }
                } finally {
                }
            }
        }
        if (u0Var == this.P) {
            u0Var = null;
        }
        return (com.applovin.impl.u0) u0Var;
    }

    public l8 x0() {
        Object l8Var = this.K.get();
        if (l8Var == null) {
            synchronized (this.K) {
                try {
                    l8Var = this.K.get();
                    if (l8Var == null) {
                        l8Var = new l8(this);
                        this.K.set(l8Var);
                    }
                } finally {
                }
            }
        }
        if (l8Var == this.K) {
            l8Var = null;
        }
        return (l8) l8Var;
    }

    public com.applovin.impl.e1 y() {
        Object e1Var = this.R.get();
        if (e1Var == null) {
            synchronized (this.R) {
                try {
                    e1Var = this.R.get();
                    if (e1Var == null) {
                        e1Var = new com.applovin.impl.e1(this);
                        this.R.set(e1Var);
                    }
                } finally {
                }
            }
        }
        if (e1Var == this.R) {
            e1Var = null;
        }
        return (com.applovin.impl.e1) e1Var;
    }

    public AppLovinSdk y0() {
        return this.f7848q;
    }

    public com.applovin.impl.f1 z() {
        Object f1Var = this.T.get();
        if (f1Var == null) {
            synchronized (this.T) {
                try {
                    f1Var = this.T.get();
                    if (f1Var == null) {
                        f1Var = new com.applovin.impl.f1(this);
                        this.T.set(f1Var);
                    }
                } finally {
                }
            }
        }
        if (f1Var == this.T) {
            f1Var = null;
        }
        return (com.applovin.impl.f1) f1Var;
    }

    public boolean z0() {
        return this.f7853s0;
    }

    private void d() {
        d6 d6VarQ0 = q0();
        int i10 = this.f7855t0 + 1;
        this.f7855t0 = i10;
        d6VarQ0.a((i5) new t5(i10, this, new a()), d6.b.CORE);
    }

    public static long n() {
        return F0;
    }

    public com.applovin.impl.c e() {
        return a(D0);
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar = this.F.get();
        if (aVar == null) {
            synchronized (this.F) {
                try {
                    aVar = this.F.get();
                    if (aVar == null) {
                        aVar = new com.applovin.impl.sdk.a(this);
                        this.F.set(aVar);
                    }
                } finally {
                }
            }
        }
        if (aVar == this.F) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public com.applovin.impl.f g() {
        return this.f7852s;
    }

    public com.applovin.impl.sdk.d h() {
        Object dVar = this.U.get();
        if (dVar == null) {
            synchronized (this.U) {
                try {
                    dVar = this.U.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.sdk.d(this);
                        this.U.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.U) {
            dVar = null;
        }
        return (com.applovin.impl.sdk.d) dVar;
    }

    public e i() {
        Object eVar = this.E.get();
        if (eVar == null) {
            synchronized (this.E) {
                try {
                    eVar = this.E.get();
                    if (eVar == null) {
                        eVar = new e(this);
                        this.E.set(eVar);
                    }
                } finally {
                }
            }
        }
        if (eVar == this.E) {
            eVar = null;
        }
        return (e) eVar;
    }

    public com.applovin.impl.j j() {
        Object jVar = this.f7817a0.get();
        if (jVar == null) {
            synchronized (this.f7817a0) {
                try {
                    jVar = this.f7817a0.get();
                    if (jVar == null) {
                        jVar = new com.applovin.impl.j(this);
                        this.f7817a0.set(jVar);
                    }
                } finally {
                }
            }
        }
        if (jVar == this.f7817a0) {
            jVar = null;
        }
        return (com.applovin.impl.j) jVar;
    }

    public AppLovinAdServiceImpl k() {
        Object appLovinAdServiceImpl = this.f7840m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f7840m) {
                try {
                    appLovinAdServiceImpl = this.f7840m.get();
                    if (appLovinAdServiceImpl == null) {
                        appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                        this.f7840m.set(appLovinAdServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (appLovinAdServiceImpl == this.f7840m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public g l() {
        Object gVar = this.J.get();
        if (gVar == null) {
            synchronized (this.J) {
                try {
                    gVar = this.J.get();
                    if (gVar == null) {
                        gVar = new g(this);
                        this.J.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.J) {
            gVar = null;
        }
        return (g) gVar;
    }

    public h m() {
        Object hVar = this.V.get();
        if (hVar == null) {
            synchronized (this.V) {
                try {
                    hVar = this.V.get();
                    if (hVar == null) {
                        hVar = new h(this);
                        this.V.set(hVar);
                    }
                } finally {
                }
            }
        }
        if (hVar == this.V) {
            hVar = null;
        }
        return (h) hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f7830h = System.currentTimeMillis();
            com.applovin.impl.r0.c(jSONObject, this);
            com.applovin.impl.r0.b(jSONObject, this);
            com.applovin.impl.r0.a(jSONObject, this);
            l3.f(jSONObject, this);
            l3.d(jSONObject, this);
            l3.e(jSONObject, this);
            l3.g(jSONObject, this);
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        D0 = context.getApplicationContext();
        E0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        A0();
        this.f7834j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            o.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            o0().a(x4.L3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(x4.f8570s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        d6 d6VarQ0 = q0();
        i5 i5Var = this.A0;
        d6.b bVar = d6.b.CORE;
        d6VarQ0.a(i5Var, bVar);
        q0().a(this.B0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f7848q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i10) {
        return a(i10, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextO = o();
        return a(contextO.getResources().getIdentifier(str, "string", contextO.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", str);
        }
        q0().a(new c6(this));
    }

    public static String a(int i10, List list) throws Resources.NotFoundException {
        String string = o().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public void c() {
        synchronized (this.f7839l0) {
            try {
                if (!this.f7847p0 && !this.f7849q0) {
                    R0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            o.h("AppLovinSdk", (String) it.next());
        }
    }

    public static com.applovin.impl.c a(Context context) {
        if (H0 == null) {
            synchronized (I0) {
                try {
                    if (H0 == null) {
                        H0 = new com.applovin.impl.c(context);
                    }
                } finally {
                }
            }
        }
        return H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!n7.c(this)) {
            HashMap map = new HashMap();
            map.put("details", AppLovinMediationProvider.ADMOB);
            map.put("error_message", str);
            D().a(com.applovin.impl.d2.S0, "adapterVersionMismatch", map);
            return;
        }
        throw new IllegalStateException(str);
    }

    public List c(x4 x4Var) {
        return o0().c(x4Var);
    }

    public void c(z4 z4Var) {
        p0().b(z4Var);
    }

    public void a(final AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f7861w0) {
            try {
                if (this.f7859v0 != null) {
                    o.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f7859v0 + ". Ignoring the provided initialization configuration.");
                    if (!B0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7806a.a(sdkInitializationListener);
                        }
                    });
                    return;
                }
                this.f7824e = System.currentTimeMillis();
                this.f7859v0 = appLovinSdkInitializationConfiguration;
                this.f7865y0 = sdkInitializationListener;
                this.f7816a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f7818b = appLovinSdkInitializationConfiguration.getAxonEventKey();
                this.f7838l = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.f7836k = appLovinSdkInitializationConfiguration.getSegmentCollection();
                n7.a(new Runnable() { // from class: com.applovin.impl.sdk.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7810a.a(appLovinSdkInitializationConfiguration);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(boolean z10) throws JSONException {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (x().i() || (sdkInitializationListener = this.f7865y0) == null) {
            return;
        }
        if (B0()) {
            this.f7865y0 = null;
            this.f7867z0 = null;
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.f7867z0 == sdkInitializationListener) {
                return;
            }
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(x4.f8546p)).booleanValue()) {
                this.f7865y0 = null;
            } else {
                this.f7867z0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", B0());
        JsonUtils.putBoolean(jSONObject, "timeout", z10);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.f7845o0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f7824e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f7858v.d(com.applovin.impl.d2.f5733j, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7893a.b(sdkInitializationListener);
            }
        }, Math.max(0L, ((Long) a(x4.f8554q)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f7863x0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f7863x0);
    }

    public void a(boolean z10) throws JSONException {
        synchronized (this.f7839l0) {
            this.f7847p0 = false;
            this.f7849q0 = z10;
        }
        if (z10) {
            List listA = w3.a(this);
            if (listA.isEmpty()) {
                q0().g();
                M0();
                return;
            }
            Long l10 = (Long) a(r3.f7471o7);
            r6 r6Var = new r6(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.m0
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f7904a.I0();
                }
            });
            O();
            if (o.a()) {
                O().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l10 + "ms...");
            }
            q0().a(r6Var, d6.b.TIMEOUT, l10.longValue(), true);
        }
    }

    public List b(x4 x4Var) {
        return o0().b(x4Var);
    }

    public void b(z4 z4Var, Object obj) {
        p0().b(z4Var, obj);
    }

    public Object b(z4 z4Var) {
        return p0().a(z4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r12.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r15.f7857u0 = (java.lang.String) r13.getValue();
        O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (com.applovin.impl.sdk.o.a() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        O().a("AppLovinSdk", "Detected mediation provider: " + r15.f7857u0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r6.booleanValue() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.b():java.lang.String");
    }

    public void a(k3 k3Var) throws JSONException {
        if (q0().f()) {
            return;
        }
        List listA = w3.a(this);
        if (listA.size() <= 0 || !S().a().containsAll(listA)) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "All required adapters initialized");
        }
        q0().g();
        M0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f7837k0;
        return (list == null || list.size() <= 0 || this.f7837k0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) p0().a(z4.f8780g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < n7.g(str)) {
                o.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public Object a(x4 x4Var) {
        return o0().a(x4Var);
    }

    public boolean a(x4 x4Var, MaxAdFormat maxAdFormat) {
        return b(x4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        U().a(map);
    }

    public void a(Uri uri) {
        B().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        p0().a(str, obj, editor);
    }

    public Object a(z4 z4Var) {
        return a(z4Var, (Object) null);
    }

    public Object a(z4 z4Var, Object obj) {
        return p0().a(z4Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a5.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        p0().a(sharedPreferences);
    }
}
