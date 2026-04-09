package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC4453s3;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C4326d1;
import com.google.android.gms.measurement.internal.C4839e4;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import org.json.JSONException;
import org.json.JSONObject;
import s3.AbstractC7901p;
import t1.AbstractC8021a;

/* renamed from: com.google.android.gms.measurement.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4976v3 implements InterfaceC4821c4 {

    /* renamed from: H, reason: collision with root package name */
    private static volatile C4976v3 f36800H;

    /* renamed from: A, reason: collision with root package name */
    private long f36801A;

    /* renamed from: B, reason: collision with root package name */
    private volatile Boolean f36802B;

    /* renamed from: C, reason: collision with root package name */
    private volatile boolean f36803C;

    /* renamed from: D, reason: collision with root package name */
    private int f36804D;

    /* renamed from: E, reason: collision with root package name */
    private int f36805E;

    /* renamed from: G, reason: collision with root package name */
    final long f36807G;

    /* renamed from: a, reason: collision with root package name */
    private final Context f36808a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36809b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36810c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36811d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f36812e;

    /* renamed from: f, reason: collision with root package name */
    private final C4834e f36813f;

    /* renamed from: g, reason: collision with root package name */
    private final C4893l f36814g;

    /* renamed from: h, reason: collision with root package name */
    private final X2 f36815h;

    /* renamed from: i, reason: collision with root package name */
    private final L2 f36816i;

    /* renamed from: j, reason: collision with root package name */
    private final C4952s3 f36817j;

    /* renamed from: k, reason: collision with root package name */
    private final C4987w6 f36818k;

    /* renamed from: l, reason: collision with root package name */
    private final x7 f36819l;

    /* renamed from: m, reason: collision with root package name */
    private final D2 f36820m;

    /* renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.common.util.d f36821n;

    /* renamed from: o, reason: collision with root package name */
    private final C4994x5 f36822o;

    /* renamed from: p, reason: collision with root package name */
    private final C4945r4 f36823p;

    /* renamed from: q, reason: collision with root package name */
    private final B f36824q;

    /* renamed from: r, reason: collision with root package name */
    private final C4915n5 f36825r;

    /* renamed from: s, reason: collision with root package name */
    private final String f36826s;

    /* renamed from: t, reason: collision with root package name */
    private C2 f36827t;

    /* renamed from: u, reason: collision with root package name */
    private C5 f36828u;

    /* renamed from: v, reason: collision with root package name */
    private F f36829v;

    /* renamed from: w, reason: collision with root package name */
    private C5007z2 f36830w;

    /* renamed from: x, reason: collision with root package name */
    private C4939q5 f36831x;

    /* renamed from: z, reason: collision with root package name */
    private Boolean f36833z;

    /* renamed from: y, reason: collision with root package name */
    private boolean f36832y = false;

    /* renamed from: F, reason: collision with root package name */
    private AtomicInteger f36806F = new AtomicInteger(0);

    private C4976v3(C4922o4 c4922o4) {
        boolean z10 = false;
        AbstractC7901p.l(c4922o4);
        C4834e c4834e = new C4834e(c4922o4.f36620a);
        this.f36813f = c4834e;
        AbstractC4912n2.f36600a = c4834e;
        Context context = c4922o4.f36620a;
        this.f36808a = context;
        this.f36809b = c4922o4.f36621b;
        this.f36810c = c4922o4.f36622c;
        this.f36811d = c4922o4.f36623d;
        this.f36812e = c4922o4.f36627h;
        this.f36802B = c4922o4.f36624e;
        this.f36826s = c4922o4.f36629j;
        this.f36803C = true;
        AbstractC4453s3.l(context);
        com.google.android.gms.common.util.d dVarD = com.google.android.gms.common.util.g.d();
        this.f36821n = dVarD;
        Long l10 = c4922o4.f36628i;
        this.f36807G = l10 != null ? l10.longValue() : dVarD.a();
        this.f36814g = new C4893l(this);
        X2 x22 = new X2(this);
        x22.m();
        this.f36815h = x22;
        L2 l22 = new L2(this);
        l22.m();
        this.f36816i = l22;
        x7 x7Var = new x7(this);
        x7Var.m();
        this.f36819l = x7Var;
        this.f36820m = new D2(new C4953s4(c4922o4, this));
        this.f36824q = new B(this);
        C4994x5 c4994x5 = new C4994x5(this);
        c4994x5.v();
        this.f36822o = c4994x5;
        C4945r4 c4945r4 = new C4945r4(this);
        c4945r4.v();
        this.f36823p = c4945r4;
        C4987w6 c4987w6 = new C4987w6(this);
        c4987w6.v();
        this.f36818k = c4987w6;
        C4915n5 c4915n5 = new C4915n5(this);
        c4915n5.m();
        this.f36825r = c4915n5;
        C4952s3 c4952s3 = new C4952s3(this);
        c4952s3.m();
        this.f36817j = c4952s3;
        C4326d1 c4326d1 = c4922o4.f36626g;
        if (c4326d1 != null && c4326d1.f35194b != 0) {
            z10 = true;
        }
        boolean z11 = !z10;
        if (context.getApplicationContext() instanceof Application) {
            E().X0(z11);
        } else {
            zzj().H().a("Application context is not an Application");
        }
        c4952s3.z(new RunnableC4992x3(this, c4922o4));
    }

    public static C4976v3 a(Context context, C4326d1 c4326d1, Long l10) {
        Bundle bundle;
        if (c4326d1 != null && (c4326d1.f35197e == null || c4326d1.f35198f == null)) {
            c4326d1 = new C4326d1(c4326d1.f35193a, c4326d1.f35194b, c4326d1.f35195c, c4326d1.f35196d, null, null, c4326d1.f35199g, null);
        }
        AbstractC7901p.l(context);
        AbstractC7901p.l(context.getApplicationContext());
        if (f36800H == null) {
            synchronized (C4976v3.class) {
                try {
                    if (f36800H == null) {
                        f36800H = new C4976v3(new C4922o4(context, c4326d1, l10));
                    }
                } finally {
                }
            }
        } else if (c4326d1 != null && (bundle = c4326d1.f35199g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC7901p.l(f36800H);
            f36800H.i(c4326d1.f35199g.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC7901p.l(f36800H);
        return f36800H;
    }

    private static void c(AbstractC4845f1 abstractC4845f1) {
        if (abstractC4845f1 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void d(I2 i22) {
        if (i22 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (i22.s()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(i22.getClass()));
    }

    static /* synthetic */ void e(C4976v3 c4976v3, C4922o4 c4922o4) {
        c4976v3.zzl().j();
        F f10 = new F(c4976v3);
        f10.m();
        c4976v3.f36829v = f10;
        C5007z2 c5007z2 = new C5007z2(c4976v3, c4922o4.f36625f);
        c5007z2.v();
        c4976v3.f36830w = c5007z2;
        C2 c22 = new C2(c4976v3);
        c22.v();
        c4976v3.f36827t = c22;
        C5 c52 = new C5(c4976v3);
        c52.v();
        c4976v3.f36828u = c52;
        c4976v3.f36819l.n();
        c4976v3.f36815h.n();
        c4976v3.f36830w.w();
        C4939q5 c4939q5 = new C4939q5(c4976v3);
        c4939q5.v();
        c4976v3.f36831x = c4939q5;
        c4939q5.w();
        c4976v3.zzj().F().b("App measurement initialized, version", 118003L);
        c4976v3.zzj().F().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strC = c5007z2.C();
        if (TextUtils.isEmpty(c4976v3.f36809b)) {
            if (c4976v3.K().B0(strC, c4976v3.f36814g.R())) {
                c4976v3.zzj().F().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                c4976v3.zzj().F().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strC);
            }
        }
        c4976v3.zzj().B().a("Debug-level message logging enabled");
        if (c4976v3.f36804D != c4976v3.f36806F.get()) {
            c4976v3.zzj().C().c("Not all components initialized", Integer.valueOf(c4976v3.f36804D), Integer.valueOf(c4976v3.f36806F.get()));
        }
        c4976v3.f36832y = true;
    }

    public static /* synthetic */ void f(C4976v3 c4976v3, String str, int i10, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> listQueryIntentActivities;
        if ((i10 != 200 && i10 != 204 && i10 != 304) || th2 != null) {
            c4976v3.zzj().H().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th2);
            return;
        }
        c4976v3.C().f36282v.a(true);
        if (bArr == null || bArr.length == 0) {
            c4976v3.zzj().B().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            if (TextUtils.isEmpty(strOptString)) {
                c4976v3.zzj().B().a("Deferred Deep Link is empty.");
                return;
            }
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            String strOptString4 = jSONObject.optString("gad_source", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            Bundle bundle = new Bundle();
            x7 x7VarK = c4976v3.K();
            if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = x7VarK.zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                c4976v3.zzj().H().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            }
            if (!TextUtils.isEmpty(strOptString3)) {
                bundle.putString("gbraid", strOptString3);
            }
            if (!TextUtils.isEmpty(strOptString4)) {
                bundle.putString("gad_source", strOptString4);
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            c4976v3.f36823p.c1("auto", "_cmp", bundle);
            c4976v3.K().W(strOptString, dOptDouble);
        } catch (JSONException e10) {
            c4976v3.zzj().C().b("Failed to parse the Deferred Deep Link response. exception", e10);
        }
    }

    private static void g(AbstractC4803a4 abstractC4803a4) {
        if (abstractC4803a4 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void h(AbstractC4830d4 abstractC4830d4) {
        if (abstractC4830d4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC4830d4.o()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC4830d4.getClass()));
    }

    public final D2 A() {
        return this.f36820m;
    }

    public final L2 B() {
        L2 l22 = this.f36816i;
        if (l22 == null || !l22.o()) {
            return null;
        }
        return this.f36816i;
    }

    public final X2 C() {
        g(this.f36815h);
        return this.f36815h;
    }

    final C4952s3 D() {
        return this.f36817j;
    }

    public final C4945r4 E() {
        d(this.f36823p);
        return this.f36823p;
    }

    public final C4915n5 F() {
        h(this.f36825r);
        return this.f36825r;
    }

    public final C4939q5 G() {
        c(this.f36831x);
        return this.f36831x;
    }

    public final C4994x5 H() {
        d(this.f36822o);
        return this.f36822o;
    }

    public final C5 I() {
        d(this.f36828u);
        return this.f36828u;
    }

    public final C4987w6 J() {
        d(this.f36818k);
        return this.f36818k;
    }

    public final x7 K() {
        g(this.f36819l);
        return this.f36819l;
    }

    public final String L() {
        return this.f36809b;
    }

    public final String M() {
        return this.f36810c;
    }

    public final String N() {
        return this.f36811d;
    }

    public final String O() {
        return this.f36826s;
    }

    protected final void b(C4326d1 c4326d1) {
        C4839e4 c4839e4E;
        Boolean boolE;
        zzl().j();
        C4893l c4893l = this.f36814g;
        C4936q2 c4936q2 = N.f36044R0;
        boolean z10 = c4893l.p(c4936q2) && G().z() == B2.b.CLIENT_UPLOAD_ELIGIBLE;
        if ((com.google.android.gms.internal.measurement.U6.a() && this.f36814g.p(N.f36054W0) && K().R0()) || z10) {
            x7 x7VarK = K();
            x7VarK.j();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            if (x7VarK.a().p(c4936q2)) {
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            }
            AbstractC8021a.k(x7VarK.zza(), new z7(x7VarK.f36331a), intentFilter, 2);
            x7VarK.zzj().B().a("Registered app receiver");
        }
        if (z10) {
            G().y(((Long) N.f36013C.a(null)).longValue());
        }
        C4839e4 c4839e4J = C().J();
        int iB = c4839e4J.b();
        EnumC4866h4 enumC4866h4Z = this.f36814g.z("google_analytics_default_allow_ad_storage", false);
        EnumC4866h4 enumC4866h4Z2 = this.f36814g.z("google_analytics_default_allow_analytics_storage", false);
        EnumC4866h4 enumC4866h4 = EnumC4866h4.UNINITIALIZED;
        if (!(enumC4866h4Z == enumC4866h4 && enumC4866h4Z2 == enumC4866h4) && C().t(-10)) {
            c4839e4E = C4839e4.e(enumC4866h4Z, enumC4866h4Z2, -10);
        } else {
            if (!TextUtils.isEmpty(y().E()) && (iB == 0 || iB == 30 || iB == 10 || iB == 30 || iB == 30 || iB == 40)) {
                E().O(new C4839e4(null, null, -10), false);
            } else if (TextUtils.isEmpty(y().E()) && c4326d1 != null && c4326d1.f35199g != null && C().t(30)) {
                c4839e4E = C4839e4.c(c4326d1.f35199g, 30);
                if (!c4839e4E.y()) {
                }
            }
            c4839e4E = null;
        }
        if (c4839e4E != null) {
            E().O(c4839e4E, true);
            c4839e4J = c4839e4E;
        }
        E().N(c4839e4J);
        int iA = C().I().a();
        EnumC4866h4 enumC4866h4Z3 = this.f36814g.z("google_analytics_default_allow_ad_personalization_signals", true);
        if (enumC4866h4Z3 != enumC4866h4) {
            zzj().G().b("Default ad personalization consent from Manifest", enumC4866h4Z3);
        }
        EnumC4866h4 enumC4866h4Z4 = this.f36814g.z("google_analytics_default_allow_ad_user_data", true);
        if (enumC4866h4Z4 != enumC4866h4 && C4839e4.l(-10, iA)) {
            E().M(D.c(enumC4866h4Z4, -10), true);
        } else if (TextUtils.isEmpty(y().E()) || !(iA == 0 || iA == 30)) {
            if (TextUtils.isEmpty(y().E()) && c4326d1 != null && c4326d1.f35199g != null && C4839e4.l(30, iA)) {
                D dB = D.b(c4326d1.f35199g, 30);
                if (dB.k()) {
                    E().M(dB, true);
                }
            }
            if (TextUtils.isEmpty(y().E()) && c4326d1 != null && c4326d1.f35199g != null && C().f36275o.a() == null && (boolE = D.e(c4326d1.f35199g)) != null) {
                E().n0(c4326d1.f35197e, "allow_personalized_ads", boolE.toString(), false);
            }
        } else {
            E().M(new D(null, -10), true);
        }
        Boolean boolC = this.f36814g.C("google_analytics_tcf_data_enabled");
        if (boolC == null ? true : boolC.booleanValue()) {
            zzj().B().a("TCF client enabled.");
            E().J0();
            E().H0();
        }
        if (C().f36267g.a() == 0) {
            zzj().G().b("Persisting first open", Long.valueOf(this.f36807G));
            C().f36267g.b(this.f36807G);
        }
        E().f36703r.c();
        if (q()) {
            if (!TextUtils.isEmpty(y().E()) || !TextUtils.isEmpty(y().B())) {
                K();
                if (x7.i0(y().E(), C().P(), y().B(), C().O())) {
                    zzj().F().a("Rechecking which service to use due to a GMP App Id change");
                    C().z();
                    z().F();
                    this.f36828u.c0();
                    this.f36828u.b0();
                    C().f36267g.b(this.f36807G);
                    C().f36269i.b(null);
                }
                C().F(y().E());
                C().C(y().B());
            }
            if (!C().J().m(C4839e4.a.ANALYTICS_STORAGE)) {
                C().f36269i.b(null);
            }
            E().U0(C().f36269i.a());
            if (!K().S0() && !TextUtils.isEmpty(C().f36284x.a())) {
                zzj().H().a("Remote config removed with active feature rollouts");
                C().f36284x.b(null);
            }
            if (!TextUtils.isEmpty(y().E()) || !TextUtils.isEmpty(y().B())) {
                boolean zN = n();
                if (!C().A() && !this.f36814g.U()) {
                    C().D(!zN);
                }
                if (zN) {
                    E().C0();
                }
                J().f36854e.a();
                I().R(new AtomicReference());
                I().z(C().f36262A.a());
            }
        } else if (n()) {
            if (!K().C0("android.permission.INTERNET")) {
                zzj().C().a("App is missing INTERNET permission");
            }
            if (!K().C0("android.permission.ACCESS_NETWORK_STATE")) {
                zzj().C().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!w3.c.a(this.f36808a).e() && !this.f36814g.V()) {
                if (!x7.a0(this.f36808a)) {
                    zzj().C().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!x7.b0(this.f36808a, false)) {
                    zzj().C().a("AppMeasurementService not registered/enabled");
                }
            }
            zzj().C().a("Uploading is not possible. App measurement disabled");
        }
        if (com.google.android.gms.internal.measurement.U6.a() && this.f36814g.p(N.f36054W0) && K().R0()) {
            long jMax = Math.max(500L, ((((Integer) N.f36122w0.a(null)).intValue() * 1000) + new Random().nextInt(DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT)) - this.f36821n.c());
            if (jMax > 500) {
                zzj().G().b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(jMax));
            }
            E().Y0(jMax);
        }
        C().f36277q.a(true);
    }

    final void i(boolean z10) {
        this.f36802B = Boolean.valueOf(z10);
    }

    final void j() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void k() {
        this.f36806F.incrementAndGet();
    }

    final void l() {
        this.f36804D++;
    }

    public final boolean m() {
        return this.f36802B != null && this.f36802B.booleanValue();
    }

    public final boolean n() {
        return u() == 0;
    }

    public final boolean o() {
        zzl().j();
        return this.f36803C;
    }

    public final boolean p() {
        return TextUtils.isEmpty(this.f36809b);
    }

    protected final boolean q() {
        if (!this.f36832y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().j();
        Boolean bool = this.f36833z;
        if (bool == null || this.f36801A == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f36821n.c() - this.f36801A) > 1000)) {
            this.f36801A = this.f36821n.c();
            boolean z10 = true;
            Boolean boolValueOf = Boolean.valueOf(K().C0("android.permission.INTERNET") && K().C0("android.permission.ACCESS_NETWORK_STATE") && (w3.c.a(this.f36808a).e() || this.f36814g.V() || (x7.a0(this.f36808a) && x7.b0(this.f36808a, false))));
            this.f36833z = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!K().g0(y().E(), y().B()) && TextUtils.isEmpty(y().B())) {
                    z10 = false;
                }
                this.f36833z = Boolean.valueOf(z10);
            }
        }
        return this.f36833z.booleanValue();
    }

    public final boolean r() {
        return this.f36812e;
    }

    public final boolean s() {
        zzl().j();
        h(F());
        String strC = y().C();
        if (!this.f36814g.S()) {
            zzj().G().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair pairQ = C().q(strC);
        if (((Boolean) pairQ.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairQ.first)) {
            zzj().G().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!F().s()) {
            zzj().H().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        C5 c5I = I();
        c5I.j();
        c5I.u();
        if (!c5I.k0() || c5I.g().E0() >= 234200) {
            C4917o c4917oP0 = E().p0();
            Bundle bundle = c4917oP0 != null ? c4917oP0.f36617a : null;
            if (bundle == null) {
                int i10 = this.f36805E;
                this.f36805E = i10 + 1;
                boolean z10 = i10 < 10;
                zzj().B().b("Failed to retrieve DMA consent from the service, " + (z10 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f36805E));
                return z10;
            }
            C4839e4 c4839e4C = C4839e4.c(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(c4839e4C.u());
            D dB = D.b(bundle, 100);
            sb2.append("&dma=");
            sb2.append(!Objects.equals(dB.h(), Boolean.FALSE) ? 1 : 0);
            if (!TextUtils.isEmpty(dB.i())) {
                sb2.append("&dma_cps=");
                sb2.append(dB.i());
            }
            int i11 = !Objects.equals(D.e(bundle), Boolean.TRUE) ? 1 : 0;
            sb2.append("&npa=");
            sb2.append(i11);
            zzj().G().b("Consent query parameters to Bow", sb2);
        }
        x7 x7VarK = K();
        y();
        URL urlG = x7VarK.G(118003L, strC, (String) pairQ.first, C().f36283w.a() - 1, sb2.toString());
        if (urlG != null) {
            C4915n5 c4915n5F = F();
            InterfaceC4899l5 interfaceC4899l5 = new InterfaceC4899l5() { // from class: com.google.android.gms.measurement.internal.y3
                @Override // com.google.android.gms.measurement.internal.InterfaceC4899l5
                public final void a(String str, int i12, Throwable th2, byte[] bArr, Map map) {
                    C4976v3.f(this.f36882a, str, i12, th2, bArr, map);
                }
            };
            c4915n5F.l();
            AbstractC7901p.l(urlG);
            AbstractC7901p.l(interfaceC4899l5);
            c4915n5F.zzl().v(new RunnableC4931p5(c4915n5F, strC, urlG, null, null, interfaceC4899l5));
        }
        return false;
    }

    public final void t(boolean z10) {
        zzl().j();
        this.f36803C = z10;
    }

    public final int u() {
        zzl().j();
        if (this.f36814g.U()) {
            return 1;
        }
        if (!o()) {
            return 8;
        }
        Boolean boolM = C().M();
        if (boolM != null) {
            return boolM.booleanValue() ? 0 : 3;
        }
        Boolean boolC = this.f36814g.C("firebase_analytics_collection_enabled");
        return boolC != null ? boolC.booleanValue() ? 0 : 4 : (this.f36802B == null || this.f36802B.booleanValue()) ? 0 : 7;
    }

    public final B v() {
        c(this.f36824q);
        return this.f36824q;
    }

    public final C4893l w() {
        return this.f36814g;
    }

    public final F x() {
        h(this.f36829v);
        return this.f36829v;
    }

    public final C5007z2 y() {
        d(this.f36830w);
        return this.f36830w;
    }

    public final C2 z() {
        d(this.f36827t);
        return this.f36827t;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final Context zza() {
        return this.f36808a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final com.google.android.gms.common.util.d zzb() {
        return this.f36821n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final C4834e zzd() {
        return this.f36813f;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final L2 zzj() {
        h(this.f36816i);
        return this.f36816i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final C4952s3 zzl() {
        h(this.f36817j);
        return this.f36817j;
    }
}
