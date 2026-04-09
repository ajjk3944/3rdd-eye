package com.applovin.impl.sdk;

import C.E;
import C.RunnableC0615b;
import C.T;
import C.g0;
import N7.C1154e9;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.A;
import com.applovin.impl.AbstractC2135n0;
import com.applovin.impl.C2107a1;
import com.applovin.impl.C2111c;
import com.applovin.impl.C2117f;
import com.applovin.impl.C2123i;
import com.applovin.impl.C2132m0;
import com.applovin.impl.C2139p0;
import com.applovin.impl.C2158z0;
import com.applovin.impl.a3;
import com.applovin.impl.a7;
import com.applovin.impl.b3;
import com.applovin.impl.e1;
import com.applovin.impl.e2;
import com.applovin.impl.e4;
import com.applovin.impl.f3;
import com.applovin.impl.f6;
import com.applovin.impl.g3;
import com.applovin.impl.h5;
import com.applovin.impl.j3;
import com.applovin.impl.k3;
import com.applovin.impl.k4;
import com.applovin.impl.l2;
import com.applovin.impl.l3;
import com.applovin.impl.l4;
import com.applovin.impl.m1;
import com.applovin.impl.m4;
import com.applovin.impl.m6;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n3;
import com.applovin.impl.n4;
import com.applovin.impl.o4;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q5;
import com.applovin.impl.r2;
import com.applovin.impl.r5;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u7;
import com.applovin.impl.w3;
import com.applovin.impl.w4;
import com.applovin.impl.y1;
import com.applovin.impl.y6;
import com.applovin.impl.y7;
import com.applovin.impl.z6;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import io.appmetrica.analytics.impl.Oo;
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

    /* renamed from: C0, reason: collision with root package name */
    public static k f21161C0;

    /* renamed from: D0, reason: collision with root package name */
    protected static Context f21162D0;

    /* renamed from: E0, reason: collision with root package name */
    private static boolean f21163E0;

    /* renamed from: G0, reason: collision with root package name */
    private static final boolean f21164G0;

    /* renamed from: H0, reason: collision with root package name */
    private static volatile C2111c f21165H0;

    /* renamed from: a, reason: collision with root package name */
    private String f21195a;

    /* renamed from: b, reason: collision with root package name */
    private String f21197b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f21199c;

    /* renamed from: d, reason: collision with root package name */
    private final long f21201d;

    /* renamed from: e, reason: collision with root package name */
    private long f21203e;

    /* renamed from: f, reason: collision with root package name */
    private long f21205f;

    /* renamed from: g, reason: collision with root package name */
    private Long f21207g;

    /* renamed from: h, reason: collision with root package name */
    private long f21209h;

    /* renamed from: i0, reason: collision with root package name */
    private com.applovin.impl.mediation.e f21211i0;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinSdkSettings f21212j;

    /* renamed from: k, reason: collision with root package name */
    private MaxSegmentCollection f21214k;

    /* renamed from: k0, reason: collision with root package name */
    private List f21215k0;

    /* renamed from: l, reason: collision with root package name */
    private String f21216l;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f21225p0;

    /* renamed from: q, reason: collision with root package name */
    private volatile AppLovinSdk f21226q;

    /* renamed from: u0, reason: collision with root package name */
    private String f21235u0;

    /* renamed from: v0, reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f21237v0;

    /* renamed from: y0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f21243y0;

    /* renamed from: z0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f21245z0;

    /* renamed from: I0, reason: collision with root package name */
    private static final Object f21166I0 = new Object();
    private static final long F0 = System.currentTimeMillis();
    private final AtomicBoolean i = new AtomicBoolean();

    /* renamed from: m, reason: collision with root package name */
    private final AtomicReference f21218m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicReference f21220n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f21222o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    private final AtomicReference f21224p = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    private final o f21228r = new o(this);

    /* renamed from: s, reason: collision with root package name */
    private final C2117f f21230s = new C2117f(this);

    /* renamed from: t, reason: collision with root package name */
    private final r2 f21232t = new r2(this);

    /* renamed from: u, reason: collision with root package name */
    private final m1 f21234u = new m1(this);

    /* renamed from: v, reason: collision with root package name */
    private final y6 f21236v = new y6(this);

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f21238w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicReference f21240x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    private final AtomicReference f21242y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    private final AtomicReference f21244z = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    private final AtomicReference f21167A = new AtomicReference();

    /* renamed from: B, reason: collision with root package name */
    private final AtomicReference f21169B = new AtomicReference();

    /* renamed from: C, reason: collision with root package name */
    private final AtomicReference f21171C = new AtomicReference();

    /* renamed from: D, reason: collision with root package name */
    private final AtomicReference f21172D = new AtomicReference();

    /* renamed from: E, reason: collision with root package name */
    private final AtomicReference f21173E = new AtomicReference();

    /* renamed from: F, reason: collision with root package name */
    private final AtomicReference f21174F = new AtomicReference();

    /* renamed from: G, reason: collision with root package name */
    private final AtomicReference f21175G = new AtomicReference();

    /* renamed from: H, reason: collision with root package name */
    private final AtomicReference f21176H = new AtomicReference();

    /* renamed from: I, reason: collision with root package name */
    private final AtomicReference f21177I = new AtomicReference();

    /* renamed from: J, reason: collision with root package name */
    private final AtomicReference f21178J = new AtomicReference();

    /* renamed from: K, reason: collision with root package name */
    private final AtomicReference f21179K = new AtomicReference();

    /* renamed from: L, reason: collision with root package name */
    private final AtomicReference f21180L = new AtomicReference();

    /* renamed from: M, reason: collision with root package name */
    private final AtomicReference f21181M = new AtomicReference();

    /* renamed from: N, reason: collision with root package name */
    private final AtomicReference f21182N = new AtomicReference();

    /* renamed from: O, reason: collision with root package name */
    private final AtomicReference f21183O = new AtomicReference();

    /* renamed from: P, reason: collision with root package name */
    private final AtomicReference f21184P = new AtomicReference();

    /* renamed from: Q, reason: collision with root package name */
    private final AtomicReference f21185Q = new AtomicReference();

    /* renamed from: R, reason: collision with root package name */
    private final AtomicReference f21186R = new AtomicReference();

    /* renamed from: S, reason: collision with root package name */
    private final AtomicReference f21187S = new AtomicReference();

    /* renamed from: T, reason: collision with root package name */
    private final AtomicReference f21188T = new AtomicReference();

    /* renamed from: U, reason: collision with root package name */
    private final AtomicReference f21189U = new AtomicReference();

    /* renamed from: V, reason: collision with root package name */
    private final AtomicReference f21190V = new AtomicReference();

    /* renamed from: W, reason: collision with root package name */
    private final AtomicReference f21191W = new AtomicReference();

    /* renamed from: X, reason: collision with root package name */
    private final AtomicReference f21192X = new AtomicReference();

    /* renamed from: Y, reason: collision with root package name */
    private final AtomicReference f21193Y = new AtomicReference();

    /* renamed from: Z, reason: collision with root package name */
    private final AtomicReference f21194Z = new AtomicReference();

    /* renamed from: a0, reason: collision with root package name */
    private final AtomicReference f21196a0 = new AtomicReference();

    /* renamed from: b0, reason: collision with root package name */
    private final AtomicReference f21198b0 = new AtomicReference();

    /* renamed from: c0, reason: collision with root package name */
    private final AtomicReference f21200c0 = new AtomicReference();

    /* renamed from: d0, reason: collision with root package name */
    private final AtomicReference f21202d0 = new AtomicReference();

    /* renamed from: e0, reason: collision with root package name */
    private final AtomicReference f21204e0 = new AtomicReference();

    /* renamed from: f0, reason: collision with root package name */
    private final AtomicReference f21206f0 = new AtomicReference();

    /* renamed from: g0, reason: collision with root package name */
    private final AtomicReference f21208g0 = new AtomicReference();

    /* renamed from: h0, reason: collision with root package name */
    private final AtomicReference f21210h0 = new AtomicReference();

    /* renamed from: j0, reason: collision with root package name */
    private final AtomicReference f21213j0 = new AtomicReference();

    /* renamed from: l0, reason: collision with root package name */
    private final Object f21217l0 = new Object();

    /* renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f21219m0 = new AtomicBoolean(true);

    /* renamed from: n0, reason: collision with root package name */
    private final AtomicBoolean f21221n0 = new AtomicBoolean();

    /* renamed from: o0, reason: collision with root package name */
    private final AtomicBoolean f21223o0 = new AtomicBoolean();

    /* renamed from: q0, reason: collision with root package name */
    private boolean f21227q0 = false;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f21229r0 = false;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f21231s0 = false;

    /* renamed from: t0, reason: collision with root package name */
    private int f21233t0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    private final Object f21239w0 = new Object();

    /* renamed from: x0, reason: collision with root package name */
    private SdkConfigurationImpl f21241x0 = new SdkConfigurationImpl(this);

    /* renamed from: A0, reason: collision with root package name */
    private final w4 f21168A0 = new f6(this, true, "scheduleAdLoadIntegrationError", new C8.a(this, 8));

    /* renamed from: B0, reason: collision with root package name */
    private final w4 f21170B0 = new f6(this, true, "sdkInit", new g0(this, 17));

    public class a implements h5.b {
        public a() {
        }

        @Override // com.applovin.impl.h5.b
        public void a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            k.this.c(jSONObject);
            if (((Boolean) k.this.a(g3.f19365C7)).booleanValue()) {
                k kVar = k.this;
                kVar.f21211i0 = new com.applovin.impl.mediation.e(kVar);
            }
            k.this.m().a();
            AbstractC2135n0.a(jSONObject, zIsValid, k.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            k.this.U().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k.this.E().b();
            k kVar2 = k.this;
            kVar2.f21215k0 = kVar2.a(jSONObject);
            if (zIsValid) {
                k.this.f21241x0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            k.this.s0().a(jSONObject);
            k.this.b(jSONObject);
            l2.b(((Boolean) k.this.a(l4.f19831S5)).booleanValue());
            l2.a(((Boolean) k.this.a(l4.f19838T5)).booleanValue());
            k.this.Q0();
            if (!((Boolean) k.this.a(l4.f19849V2)).booleanValue() || zIsValid || !AbstractC2135n0.a(k.o())) {
                k.this.O0();
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.this.T0();
        }
    }

    public class b implements C2139p0.c {
        public b() {
        }

        @Override // com.applovin.impl.C2139p0.c
        public void a(C2139p0.b bVar) {
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            k.this.f21223o0.set(bVar.b());
            if (!bVar.a()) {
                k.this.c("Initializing SDK in MAX environment...");
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            k.this.S0();
            k.this.R0();
        }
    }

    public class c implements h5.b {
        public c() {
        }

        @Override // com.applovin.impl.h5.b
        public void a(JSONObject jSONObject) {
            k.this.c(jSONObject);
            k.this.i.set(false);
            k.this.O0();
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new E3.a(1));
            f21164G0 = true;
        } catch (Throwable unused) {
            f21164G0 = false;
        }
    }

    public k(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f21225p0 = false;
        f21161C0 = this;
        this.f21212j = appLovinSdkSettings;
        this.f21201d = System.currentTimeMillis();
        this.f21225p0 = true;
        if (!F0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
        }
        f21162D0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f21199c = new WeakReference((Activity) context);
        }
    }

    private void A0() {
        Context context = f21162D0;
        o oVarO = O();
        o4 o4VarP0 = p0();
        C2139p0 c2139p0Y = y();
        a(context);
        m0();
        j();
        p();
        c0();
        S().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f21195a;
        if (str == null || str.length() != 86) {
            o.h("AppLovinSdk", "SDK key provided is invalid (" + this.f21195a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f21197b) && this.f21197b.length() != 36) {
            String strC = B4.f.c(new StringBuilder("Axon event key length "), this.f21197b, " is invalid - expected 36");
            if (a7.c(this)) {
                throw new IllegalArgumentException(strC);
            }
            o.h("AppLovinSdk", strC);
        }
        if (c2139p0Y.l()) {
            String str2 = "Terms Flow has been replaced. " + c2139p0Y.g();
            if (a7.c(this)) {
                throw new IllegalStateException(str2);
            }
            o.h("AppLovinSdk", str2);
        }
        if (a7.i()) {
            o.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!a7.b(this)) {
            o.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (a7.k(context)) {
            this.f21212j.setVerboseLogging(true);
        }
        o0().a(l4.f19955k, Boolean.valueOf(this.f21212j.isVerboseLoggingEnabled()));
        l3.d(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        n4 n4Var = n4.f20570c;
        if (TextUtils.isEmpty((String) o4VarP0.a(n4Var, (Object) null, defaultSharedPreferences))) {
            this.f21229r0 = true;
            o4VarP0.b(n4Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            o4VarP0.b(n4Var, Boolean.toString(false), defaultSharedPreferences);
        }
        n4 n4Var2 = n4.f20571d;
        if (((Boolean) o4VarP0.a(n4Var2, Boolean.FALSE)).booleanValue()) {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f21231s0 = true;
        } else {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            o4VarP0.b(n4Var2, Boolean.TRUE);
            o4VarP0.b(n4.f20584r, Boolean.valueOf(c2139p0Y.j()));
        }
        n4 n4Var3 = n4.f20572e;
        this.f21205f = ((Long) o4VarP0.a(n4Var3, 0L)).longValue() + 1;
        p0().b(n4Var3, Long.valueOf(this.f21205f));
        n4 n4Var4 = n4.f20573f;
        this.f21207g = (Long) o4VarP0.a(n4Var4, null);
        p0().b(n4Var4, Long.valueOf(F0));
        n4 n4Var5 = n4.f20574g;
        String str3 = (String) o4VarP0.a(n4Var5, null);
        if (StringUtils.isValidString(str3)) {
            if (AppLovinSdk.VERSION_CODE > a7.g(str3)) {
                o4VarP0.b(n4Var5, AppLovinSdk.VERSION);
            }
        } else {
            o4VarP0.b(n4Var5, AppLovinSdk.VERSION);
        }
        v0().d(y1.f21790e, CollectionUtils.map("details", "isInitProviderContextSet=" + f21163E0));
    }

    public static boolean F0() {
        return f21164G0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        if (q0().d()) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Timing out adapters init...");
        }
        q0().e();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        r5 r5VarQ0 = q0();
        int i = this.f21233t0 + 1;
        this.f21233t0 = i;
        r5VarQ0.a((w4) new h5(i, this, new c()), r5.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        if (G0()) {
            e2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        synchronized (this.f21217l0) {
            try {
                boolean zA = AbstractC2135n0.a(o());
                if (!G0()) {
                    O();
                    if (o.a()) {
                        O().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + V());
                    }
                }
                if (!((Boolean) a(l4.f19856W2)).booleanValue() || zA) {
                    S0();
                }
                if (((Boolean) a(l4.f19849V2)).booleanValue() && !zA) {
                    O();
                    if (o.a()) {
                        O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    T0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private r N0() {
        if (!e4.f(f21162D0)) {
            return null;
        }
        try {
            return new r(this);
        } catch (Throwable th) {
            o.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        Long l5 = (Long) a(l4.f19914e3);
        if (l5.longValue() >= 0 && this.i.compareAndSet(false, true)) {
            u7.a(l5.longValue(), false, this, new C2.h(this, 21));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0() {
        if (!G0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f21221n0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!y().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            y().a(u0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        n3 n3VarC0 = c0();
        n3VarC0.a(new d(n3VarC0));
    }

    private Map W() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(l4.f19870Y3)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    public static Context o() {
        return f21162D0;
    }

    public C2107a1 A() {
        Object c2107a1 = this.f21190V.get();
        if (c2107a1 == null) {
            synchronized (this.f21190V) {
                try {
                    c2107a1 = this.f21190V.get();
                    if (c2107a1 == null) {
                        c2107a1 = new C2107a1(this);
                        this.f21190V.set(c2107a1);
                    }
                } finally {
                }
            }
        }
        if (c2107a1 == this.f21190V) {
            c2107a1 = null;
        }
        return (C2107a1) c2107a1;
    }

    public l B() {
        Object lVar = this.f21167A.get();
        if (lVar == null) {
            synchronized (this.f21167A) {
                try {
                    lVar = this.f21167A.get();
                    if (lVar == null) {
                        lVar = new l(this);
                        this.f21167A.set(lVar);
                    }
                } finally {
                }
            }
        }
        if (lVar == this.f21167A) {
            lVar = null;
        }
        return (l) lVar;
    }

    public boolean B0() {
        boolean z10;
        synchronized (this.f21217l0) {
            z10 = this.f21227q0;
        }
        return z10;
    }

    public e1 C() {
        Object e1Var = this.f21173E.get();
        if (e1Var == null) {
            synchronized (this.f21173E) {
                try {
                    e1Var = this.f21173E.get();
                    if (e1Var == null) {
                        e1Var = new e1(this);
                        this.f21173E.set(e1Var);
                    }
                } finally {
                }
            }
        }
        if (e1Var == this.f21173E) {
            e1Var = null;
        }
        return (e1) e1Var;
    }

    public boolean C0() {
        return this.f21229r0;
    }

    public String D() {
        return this.f21235u0;
    }

    public boolean D0() {
        boolean z10;
        synchronized (this.f21239w0) {
            z10 = this.f21237v0 != null;
        }
        return z10;
    }

    public m1 E() {
        return this.f21234u;
    }

    public boolean E0() {
        boolean z10;
        synchronized (this.f21217l0) {
            z10 = this.f21225p0;
        }
        return z10;
    }

    public String F() {
        return w0().d();
    }

    public EventServiceImpl G() {
        Object eventServiceImpl = this.f21222o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f21222o) {
                try {
                    eventServiceImpl = this.f21222o.get();
                    if (eventServiceImpl == null) {
                        eventServiceImpl = new EventServiceImpl(this);
                        this.f21222o.set(eventServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (eventServiceImpl == this.f21222o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public boolean G0() {
        return StringUtils.containsIgnoreCase(V(), AppLovinMediationProvider.MAX);
    }

    public m H() {
        Object mVar = this.f21176H.get();
        if (mVar == null) {
            synchronized (this.f21176H) {
                try {
                    mVar = this.f21176H.get();
                    if (mVar == null) {
                        mVar = new m(this);
                        this.f21176H.set(mVar);
                    }
                } finally {
                }
            }
        }
        if (mVar == this.f21176H) {
            mVar = null;
        }
        return (m) mVar;
    }

    public boolean H0() {
        return a7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public n I() {
        Object nVar = this.f21178J.get();
        if (nVar == null) {
            synchronized (this.f21178J) {
                try {
                    nVar = this.f21178J.get();
                    if (nVar == null) {
                        nVar = new n(this);
                        this.f21178J.set(nVar);
                    }
                } finally {
                }
            }
        }
        if (nVar == this.f21178J) {
            nVar = null;
        }
        return (n) nVar;
    }

    public Activity J() {
        WeakReference weakReference;
        if (!((Boolean) a(l4.f19975m4)).booleanValue() || (weakReference = this.f21199c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration K() {
        return this.f21237v0;
    }

    public long L() {
        return this.f21201d;
    }

    public Long M() {
        return this.f21207g;
    }

    public void M0() {
        b(false);
    }

    public long N() {
        return this.f21205f;
    }

    public o O() {
        return this.f21228r;
    }

    public r2 P() {
        return this.f21232t;
    }

    public void P0() {
        if (StringUtils.isValidString(this.f21216l)) {
            return;
        }
        this.f21216l = AppLovinMediationProvider.MAX;
    }

    public com.applovin.impl.mediation.d Q() {
        Object dVar = this.f21210h0.get();
        if (dVar == null) {
            synchronized (this.f21210h0) {
                try {
                    dVar = this.f21210h0.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.mediation.d(this);
                        this.f21210h0.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.f21210h0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public com.applovin.impl.mediation.e R() {
        return this.f21211i0;
    }

    public void R0() {
        u().a();
    }

    public com.applovin.impl.mediation.f S() {
        Object fVar = this.f21200c0.get();
        if (fVar == null) {
            synchronized (this.f21200c0) {
                try {
                    fVar = this.f21200c0.get();
                    if (fVar == null) {
                        fVar = new com.applovin.impl.mediation.f(this);
                        this.f21200c0.set(fVar);
                    }
                } finally {
                }
            }
        }
        if (fVar == this.f21200c0) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public void S0() {
        synchronized (this.f21217l0) {
            this.f21225p0 = true;
            q0().f();
            d();
        }
    }

    public com.applovin.impl.mediation.g T() {
        Object gVar = this.f21198b0.get();
        if (gVar == null) {
            synchronized (this.f21198b0) {
                try {
                    gVar = this.f21198b0.get();
                    if (gVar == null) {
                        gVar = new com.applovin.impl.mediation.g(this);
                        this.f21198b0.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.f21198b0) {
            gVar = null;
        }
        return (com.applovin.impl.mediation.g) gVar;
    }

    public f3 U() {
        Object f3Var = this.f21206f0.get();
        if (f3Var == null) {
            synchronized (this.f21206f0) {
                try {
                    f3Var = this.f21206f0.get();
                    if (f3Var == null) {
                        f3Var = new f3(this);
                        this.f21206f0.set(f3Var);
                    }
                } finally {
                }
            }
        }
        if (f3Var == this.f21206f0) {
            f3Var = null;
        }
        return (f3) f3Var;
    }

    public void U0() {
        o.h("AppLovinSdk", "Resetting SDK state...");
        o0().a();
        o0().e();
        if (this.f21219m0.compareAndSet(true, false)) {
            S0();
        } else {
            this.f21219m0.set(true);
        }
    }

    public String V() {
        return this.f21216l;
    }

    public void V0() {
        if (StringUtils.isValidString(this.f21235u0)) {
            return;
        }
        this.f21235u0 = AppLovinMediationProvider.MAX;
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public void W0() {
        z().n();
    }

    public MediationServiceImpl X() {
        Object mediationServiceImpl = this.f21202d0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f21202d0) {
                try {
                    mediationServiceImpl = this.f21202d0.get();
                    if (mediationServiceImpl == null) {
                        mediationServiceImpl = new MediationServiceImpl(this);
                        this.f21202d0.set(mediationServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (mediationServiceImpl == this.f21202d0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public void X0() {
        a((Map) null);
    }

    public j3 Y() {
        Object j3Var = this.f21244z.get();
        if (j3Var == null) {
            synchronized (this.f21244z) {
                try {
                    j3Var = this.f21244z.get();
                    if (j3Var == null) {
                        j3Var = new j3(this);
                        this.f21244z.set(j3Var);
                    }
                } finally {
                }
            }
        }
        if (j3Var == this.f21244z) {
            j3Var = null;
        }
        return (j3) j3Var;
    }

    public void Y0() {
        if (AppLovinMediationProvider.ADMOB.equalsIgnoreCase(this.f21216l) && ((Boolean) a(l4.f19713C3)).booleanValue()) {
            String str = (String) a(l4.f19705B3);
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
            String strH = Oo.h("Mismatched AdMob adapter (", str, ") and AppLovin SDK (", str2, ") versions detected, which may cause compatibility issues.");
            o.h("AppLovinSdk", strH);
            AppLovinSdkUtils.runOnUiThread(true, new RunnableC0615b(16, this, strH));
        }
    }

    public k3 Z() {
        Object k3Var = this.f21204e0.get();
        if (k3Var == null) {
            synchronized (this.f21204e0) {
                try {
                    k3Var = this.f21204e0.get();
                    if (k3Var == null) {
                        k3Var = new k3();
                        this.f21204e0.set(k3Var);
                    }
                } finally {
                }
            }
        }
        if (k3Var == this.f21204e0) {
            k3Var = null;
        }
        return (k3) k3Var;
    }

    public p a0() {
        Object pVar = this.f21208g0.get();
        if (pVar == null) {
            synchronized (this.f21208g0) {
                try {
                    pVar = this.f21208g0.get();
                    if (pVar == null) {
                        pVar = new p(this);
                        this.f21208g0.set(pVar);
                    }
                } finally {
                }
            }
        }
        if (pVar == this.f21208g0) {
            pVar = null;
        }
        return (p) pVar;
    }

    public AppLovinNativeAdService b0() {
        Object appLovinNativeAdService = this.f21220n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f21220n) {
                try {
                    appLovinNativeAdService = this.f21220n.get();
                    if (appLovinNativeAdService == null) {
                        appLovinNativeAdService = new AppLovinNativeAdService(this);
                        this.f21220n.set(appLovinNativeAdService);
                    }
                } finally {
                }
            }
        }
        if (appLovinNativeAdService == this.f21220n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public n3 c0() {
        Object n3Var = this.f21181M.get();
        if (n3Var == null) {
            synchronized (this.f21181M) {
                try {
                    n3Var = this.f21181M.get();
                    if (n3Var == null) {
                        n3Var = new n3(o());
                        this.f21181M.set(n3Var);
                    }
                } finally {
                }
            }
        }
        if (n3Var == this.f21181M) {
            n3Var = null;
        }
        return (n3) n3Var;
    }

    public w3 d0() {
        Object w3Var = this.f21188T.get();
        if (w3Var == null) {
            synchronized (this.f21188T) {
                try {
                    w3Var = this.f21188T.get();
                    if (w3Var == null) {
                        w3Var = new w3(this);
                        this.f21188T.set(w3Var);
                    }
                } finally {
                }
            }
        }
        if (w3Var == this.f21188T) {
            w3Var = null;
        }
        return (w3) w3Var;
    }

    public com.applovin.impl.sdk.network.b e0() {
        Object bVar = this.f21194Z.get();
        if (bVar == null) {
            synchronized (this.f21194Z) {
                try {
                    bVar = this.f21194Z.get();
                    if (bVar == null) {
                        bVar = new com.applovin.impl.sdk.network.b(this);
                        this.f21194Z.set(bVar);
                    }
                } finally {
                }
            }
        }
        if (bVar == this.f21194Z) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public PostbackServiceImpl f0() {
        Object postbackServiceImpl = this.f21193Y.get();
        if (postbackServiceImpl == null) {
            synchronized (this.f21193Y) {
                try {
                    postbackServiceImpl = this.f21193Y.get();
                    if (postbackServiceImpl == null) {
                        postbackServiceImpl = new PostbackServiceImpl(this);
                        this.f21193Y.set(postbackServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (postbackServiceImpl == this.f21193Y) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public r g0() {
        Object objN0 = this.f21169B.get();
        if (objN0 == null) {
            synchronized (this.f21169B) {
                try {
                    objN0 = this.f21169B.get();
                    if (objN0 == null) {
                        objN0 = N0();
                        if (objN0 == null) {
                            objN0 = this.f21169B;
                        }
                        this.f21169B.set(objN0);
                    }
                } finally {
                }
            }
        }
        if (objN0 == this.f21169B) {
            objN0 = null;
        }
        return (r) objN0;
    }

    public String h0() {
        return w0().a();
    }

    public String i0() {
        return this.f21195a;
    }

    public MaxSegmentCollectionImpl j0() {
        return (MaxSegmentCollectionImpl) this.f21214k;
    }

    public Map k0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplJ0 = j0();
        if (maxSegmentCollectionImplJ0 == null) {
            return null;
        }
        return maxSegmentCollectionImplJ0.getJsonData();
    }

    public k4 l0() {
        Object k4Var = this.f21183O.get();
        if (k4Var == null) {
            synchronized (this.f21183O) {
                try {
                    k4Var = this.f21183O.get();
                    if (k4Var == null) {
                        k4Var = new k4(this);
                        this.f21183O.set(k4Var);
                    }
                } finally {
                }
            }
        }
        if (k4Var == this.f21183O) {
            k4Var = null;
        }
        return (k4) k4Var;
    }

    public SessionTracker m0() {
        Object sessionTracker = this.f21177I.get();
        if (sessionTracker == null) {
            synchronized (this.f21177I) {
                try {
                    sessionTracker = this.f21177I.get();
                    if (sessionTracker == null) {
                        sessionTracker = new SessionTracker(this);
                        this.f21177I.set(sessionTracker);
                    }
                } finally {
                }
            }
        }
        if (sessionTracker == this.f21177I) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public AppLovinSdkSettings n0() {
        return this.f21212j;
    }

    public m4 o0() {
        Object m4Var = this.f21240x.get();
        if (m4Var == null) {
            synchronized (this.f21240x) {
                try {
                    m4Var = this.f21240x.get();
                    if (m4Var == null) {
                        m4Var = new m4(this);
                        this.f21240x.set(m4Var);
                    }
                } finally {
                }
            }
        }
        if (m4Var == this.f21240x) {
            m4Var = null;
        }
        return (m4) m4Var;
    }

    public ArrayService p() {
        Object arrayService = this.f21189U.get();
        if (arrayService == null) {
            synchronized (this.f21189U) {
                try {
                    arrayService = this.f21189U.get();
                    if (arrayService == null) {
                        arrayService = new ArrayService(this);
                        this.f21189U.set(arrayService);
                    }
                } finally {
                }
            }
        }
        if (arrayService == this.f21189U) {
            arrayService = null;
        }
        return (ArrayService) arrayService;
    }

    public o4 p0() {
        Object o4Var = this.f21171C.get();
        if (o4Var == null) {
            synchronized (this.f21171C) {
                try {
                    o4Var = this.f21171C.get();
                    if (o4Var == null) {
                        o4Var = new o4(this);
                        this.f21171C.set(o4Var);
                    }
                } finally {
                }
            }
        }
        if (o4Var == this.f21171C) {
            o4Var = null;
        }
        return (o4) o4Var;
    }

    public i q() {
        Object iVar = this.f21184P.get();
        if (iVar == null) {
            synchronized (this.f21184P) {
                try {
                    iVar = this.f21184P.get();
                    if (iVar == null) {
                        iVar = new i(this);
                        this.f21184P.set(iVar);
                    }
                } finally {
                }
            }
        }
        if (iVar == this.f21184P) {
            iVar = null;
        }
        return (i) iVar;
    }

    public r5 q0() {
        Object r5Var = this.f21238w.get();
        if (r5Var == null) {
            synchronized (this.f21238w) {
                try {
                    r5Var = this.f21238w.get();
                    if (r5Var == null) {
                        r5Var = new r5(this);
                        this.f21238w.set(r5Var);
                    }
                } finally {
                }
            }
        }
        if (r5Var == this.f21238w) {
            r5Var = null;
        }
        return (r5) r5Var;
    }

    public String r() {
        return this.f21197b;
    }

    public m6 r0() {
        Object m6Var = this.f21186R.get();
        if (m6Var == null) {
            synchronized (this.f21186R) {
                try {
                    m6Var = this.f21186R.get();
                    if (m6Var == null) {
                        m6Var = new m6(this);
                        this.f21186R.set(m6Var);
                    }
                } finally {
                }
            }
        }
        if (m6Var == this.f21186R) {
            m6Var = null;
        }
        return (m6) m6Var;
    }

    public String s() {
        return w0().b();
    }

    public s6 s0() {
        Object s6Var = this.f21213j0.get();
        if (s6Var == null) {
            synchronized (this.f21213j0) {
                try {
                    s6Var = this.f21213j0.get();
                    if (s6Var == null) {
                        s6Var = new s6(this);
                        this.f21213j0.set(s6Var);
                    }
                } finally {
                }
            }
        }
        if (s6Var == this.f21213j0) {
            s6Var = null;
        }
        return (s6) s6Var;
    }

    public CmpServiceImpl t() {
        Object cmpServiceImpl = this.f21224p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f21224p) {
                try {
                    cmpServiceImpl = this.f21224p.get();
                    if (cmpServiceImpl == null) {
                        cmpServiceImpl = new CmpServiceImpl(this);
                        this.f21224p.set(cmpServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (cmpServiceImpl == this.f21224p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public long t0() {
        if (this.f21209h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f21209h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CoreSdk{sdkKey='");
        sb.append(this.f21195a);
        sb.append("', enabled=");
        sb.append(this.f21227q0);
        sb.append(", isFirstSession=");
        return C1154e9.k(sb, this.f21229r0, '}');
    }

    public j u() {
        Object jVar = this.f21182N.get();
        if (jVar == null) {
            synchronized (this.f21182N) {
                try {
                    jVar = this.f21182N.get();
                    if (jVar == null) {
                        jVar = new j(this);
                        this.f21182N.set(jVar);
                    }
                } finally {
                }
            }
        }
        if (jVar == this.f21182N) {
            jVar = null;
        }
        return (j) jVar;
    }

    public Activity u0() {
        Activity activityB = a(o()).b();
        return activityB != null ? activityB : J();
    }

    public String v() {
        return w0().c();
    }

    public y6 v0() {
        return this.f21236v;
    }

    public SdkConfigurationImpl w() {
        return this.f21241x0;
    }

    public z6 w0() {
        Object z6Var = this.f21172D.get();
        if (z6Var == null) {
            synchronized (this.f21172D) {
                try {
                    z6Var = this.f21172D.get();
                    if (z6Var == null) {
                        z6Var = new z6(this);
                        this.f21172D.set(z6Var);
                    }
                } finally {
                }
            }
        }
        if (z6Var == this.f21172D) {
            z6Var = null;
        }
        return (z6) z6Var;
    }

    public C2132m0 x() {
        Object c2132m0 = this.f21242y.get();
        if (c2132m0 == null) {
            synchronized (this.f21242y) {
                try {
                    c2132m0 = this.f21242y.get();
                    if (c2132m0 == null) {
                        c2132m0 = new C2132m0(this);
                        this.f21242y.set(c2132m0);
                    }
                } finally {
                }
            }
        }
        if (c2132m0 == this.f21242y) {
            c2132m0 = null;
        }
        return (C2132m0) c2132m0;
    }

    public y7 x0() {
        Object y7Var = this.f21180L.get();
        if (y7Var == null) {
            synchronized (this.f21180L) {
                try {
                    y7Var = this.f21180L.get();
                    if (y7Var == null) {
                        y7Var = new y7(this);
                        this.f21180L.set(y7Var);
                    }
                } finally {
                }
            }
        }
        if (y7Var == this.f21180L) {
            y7Var = null;
        }
        return (y7) y7Var;
    }

    public C2139p0 y() {
        Object c2139p0 = this.f21185Q.get();
        if (c2139p0 == null) {
            synchronized (this.f21185Q) {
                try {
                    c2139p0 = this.f21185Q.get();
                    if (c2139p0 == null) {
                        c2139p0 = new C2139p0(this);
                        this.f21185Q.set(c2139p0);
                    }
                } finally {
                }
            }
        }
        if (c2139p0 == this.f21185Q) {
            c2139p0 = null;
        }
        return (C2139p0) c2139p0;
    }

    public AppLovinSdk y0() {
        return this.f21226q;
    }

    public C2158z0 z() {
        Object c2158z0 = this.f21187S.get();
        if (c2158z0 == null) {
            synchronized (this.f21187S) {
                try {
                    c2158z0 = this.f21187S.get();
                    if (c2158z0 == null) {
                        c2158z0 = new C2158z0(this);
                        this.f21187S.set(c2158z0);
                    }
                } finally {
                }
            }
        }
        if (c2158z0 == this.f21187S) {
            c2158z0 = null;
        }
        return (C2158z0) c2158z0;
    }

    public boolean z0() {
        return this.f21231s0;
    }

    private void d() {
        r5 r5VarQ0 = q0();
        int i = this.f21233t0 + 1;
        this.f21233t0 = i;
        r5VarQ0.a((w4) new h5(i, this, new a()), r5.b.CORE);
    }

    public static long n() {
        return F0;
    }

    public C2111c e() {
        return a(f21162D0);
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar = this.f21175G.get();
        if (aVar == null) {
            synchronized (this.f21175G) {
                try {
                    aVar = this.f21175G.get();
                    if (aVar == null) {
                        aVar = new com.applovin.impl.sdk.a(this);
                        this.f21175G.set(aVar);
                    }
                } finally {
                }
            }
        }
        if (aVar == this.f21175G) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public C2117f g() {
        return this.f21230s;
    }

    public com.applovin.impl.sdk.d h() {
        Object dVar = this.f21191W.get();
        if (dVar == null) {
            synchronized (this.f21191W) {
                try {
                    dVar = this.f21191W.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.sdk.d(this);
                        this.f21191W.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.f21191W) {
            dVar = null;
        }
        return (com.applovin.impl.sdk.d) dVar;
    }

    public e i() {
        Object eVar = this.f21174F.get();
        if (eVar == null) {
            synchronized (this.f21174F) {
                try {
                    eVar = this.f21174F.get();
                    if (eVar == null) {
                        eVar = new e(this);
                        this.f21174F.set(eVar);
                    }
                } finally {
                }
            }
        }
        if (eVar == this.f21174F) {
            eVar = null;
        }
        return (e) eVar;
    }

    public C2123i j() {
        Object c2123i = this.f21196a0.get();
        if (c2123i == null) {
            synchronized (this.f21196a0) {
                try {
                    c2123i = this.f21196a0.get();
                    if (c2123i == null) {
                        c2123i = new C2123i(this);
                        this.f21196a0.set(c2123i);
                    }
                } finally {
                }
            }
        }
        if (c2123i == this.f21196a0) {
            c2123i = null;
        }
        return (C2123i) c2123i;
    }

    public AppLovinAdServiceImpl k() {
        Object appLovinAdServiceImpl = this.f21218m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f21218m) {
                try {
                    appLovinAdServiceImpl = this.f21218m.get();
                    if (appLovinAdServiceImpl == null) {
                        appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                        this.f21218m.set(appLovinAdServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (appLovinAdServiceImpl == this.f21218m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public g l() {
        Object gVar = this.f21179K.get();
        if (gVar == null) {
            synchronized (this.f21179K) {
                try {
                    gVar = this.f21179K.get();
                    if (gVar == null) {
                        gVar = new g(this);
                        this.f21179K.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.f21179K) {
            gVar = null;
        }
        return (g) gVar;
    }

    public h m() {
        Object hVar = this.f21192X.get();
        if (hVar == null) {
            synchronized (this.f21192X) {
                try {
                    hVar = this.f21192X.get();
                    if (hVar == null) {
                        hVar = new h(this);
                        this.f21192X.set(hVar);
                    }
                } finally {
                }
            }
        }
        if (hVar == this.f21192X) {
            hVar = null;
        }
        return (h) hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f21209h = System.currentTimeMillis();
            AbstractC2135n0.c(jSONObject, this);
            AbstractC2135n0.b(jSONObject, this);
            AbstractC2135n0.a(jSONObject, this);
            b3.f(jSONObject, this);
            b3.d(jSONObject, this);
            b3.e(jSONObject, this);
            b3.g(jSONObject, this);
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        f21162D0 = context.getApplicationContext();
        f21163E0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        A0();
        this.f21212j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            o.g("AppLovinSdk", "Setting plugin version: ".concat(pluginVersion));
            o0().a(l4.f19705B3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(l4.f20018s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        r5 r5VarQ0 = q0();
        w4 w4Var = this.f21168A0;
        r5.b bVar = r5.b.CORE;
        r5VarQ0.a(w4Var, bVar);
        q0().a(this.f21170B0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f21226q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i) {
        return a(i, (List) null);
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
        q0().a(new q5(this));
    }

    public static String a(int i, List list) throws Resources.NotFoundException {
        String string = o().getResources().getString(i);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public void c() {
        synchronized (this.f21217l0) {
            try {
                if (!this.f21225p0 && !this.f21227q0) {
                    S0();
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

    public static C2111c a(Context context) {
        if (f21165H0 == null) {
            synchronized (f21166I0) {
                try {
                    if (f21165H0 == null) {
                        f21165H0 = new C2111c(context);
                    }
                } finally {
                }
            }
        }
        return f21165H0;
    }

    public class d implements n3.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n3 f21249a;

        public d(n3 n3Var) {
            this.f21249a = n3Var;
        }

        @Override // com.applovin.impl.n3.a
        public void a() {
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.f21217l0) {
                try {
                    if (!k.this.f21225p0) {
                        k.this.S0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f21249a.b(this);
        }

        @Override // com.applovin.impl.n3.a
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!a7.c(this)) {
            HashMap map = new HashMap();
            map.put("details", AppLovinMediationProvider.ADMOB);
            map.put("error_message", str);
            E().a(y1.f21826w0, "adapterVersionMismatch", map);
            return;
        }
        throw new IllegalStateException(str);
    }

    public List c(l4 l4Var) {
        return o0().c(l4Var);
    }

    public void c(n4 n4Var) {
        p0().b(n4Var);
    }

    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f21239w0) {
            try {
                if (this.f21237v0 != null) {
                    o.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f21237v0 + ". Ignoring the provided initialization configuration.");
                    if (!B0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new B.c(21, this, sdkInitializationListener));
                    return;
                }
                this.f21203e = System.currentTimeMillis();
                this.f21237v0 = appLovinSdkInitializationConfiguration;
                this.f21243y0 = sdkInitializationListener;
                this.f21195a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f21197b = appLovinSdkInitializationConfiguration.getAxonEventKey();
                this.f21216l = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.f21214k = appLovinSdkInitializationConfiguration.getSegmentCollection();
                a7.a((Runnable) new E(10, this, appLovinSdkInitializationConfiguration));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(boolean z10) {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (y().i() || (sdkInitializationListener = this.f21243y0) == null) {
            return;
        }
        if (B0()) {
            this.f21243y0 = null;
            this.f21245z0 = null;
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.f21245z0 == sdkInitializationListener) {
                return;
            }
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(l4.f19994p)).booleanValue()) {
                this.f21243y0 = null;
            } else {
                this.f21245z0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", B0());
        JsonUtils.putBoolean(jSONObject, "timeout", z10);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.f21223o0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f21203e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f21236v.d(y1.i, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new T(23, this, sdkInitializationListener), Math.max(0L, ((Long) a(l4.f20002q)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f21241x0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA));
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
        sdkInitializationListener.onSdkInitialized(this.f21241x0);
    }

    public void a(boolean z10) {
        synchronized (this.f21217l0) {
            this.f21225p0 = false;
            this.f21227q0 = z10;
        }
        if (z10) {
            List listA = l3.a(this);
            if (listA.isEmpty()) {
                q0().e();
                M0();
                return;
            }
            Long l5 = (Long) a(g3.f19375L6);
            f6 f6Var = new f6(this, true, "timeoutInitAdapters", new A(1, this));
            O();
            if (o.a()) {
                O().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l5 + "ms...");
            }
            q0().a(f6Var, r5.b.TIMEOUT, l5.longValue(), true);
        }
    }

    public List b(l4 l4Var) {
        return o0().b(l4Var);
    }

    public void b(n4 n4Var, Object obj) {
        p0().b(n4Var, obj);
    }

    public Object b(n4 n4Var) {
        return p0().a(n4Var);
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
    
        r15.f21235u0 = (java.lang.String) r13.getValue();
        O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (com.applovin.impl.sdk.o.a() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        O().a("AppLovinSdk", "Detected mediation provider: " + r15.f21235u0);
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

    public void a(a3 a3Var) {
        if (q0().d()) {
            return;
        }
        List listA = l3.a(this);
        if (listA.size() <= 0 || !S().a().containsAll(listA)) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "All required adapters initialized");
        }
        q0().e();
        M0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f21215k0;
        return (list == null || list.size() <= 0 || this.f21215k0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) p0().a(n4.f20574g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < a7.g(str)) {
                o.h("AppLovinSdk", C1154e9.j(new StringBuilder("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
            }
        }
    }

    public Object a(l4 l4Var) {
        return o0().a(l4Var);
    }

    public boolean a(l4 l4Var, MaxAdFormat maxAdFormat) {
        return b(l4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        U().a(map);
    }

    public void a(Uri uri) {
        C().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        p0().a(str, obj, editor);
    }

    public Object a(n4 n4Var) {
        return a(n4Var, (Object) null);
    }

    public Object a(n4 n4Var, Object obj) {
        return p0().a(n4Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return o4.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        p0().a(sharedPreferences);
    }
}
