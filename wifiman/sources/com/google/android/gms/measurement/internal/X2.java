package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.C4839e4;
import o3.C7062a;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class X2 extends AbstractC4830d4 {

    /* renamed from: B, reason: collision with root package name */
    static final Pair f36261B = new Pair("", 0L);

    /* renamed from: A, reason: collision with root package name */
    public final Z2 f36262A;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f36263c;

    /* renamed from: d, reason: collision with root package name */
    private Object f36264d;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f36265e;

    /* renamed from: f, reason: collision with root package name */
    public C4811b3 f36266f;

    /* renamed from: g, reason: collision with root package name */
    public final Y2 f36267g;

    /* renamed from: h, reason: collision with root package name */
    public final Y2 f36268h;

    /* renamed from: i, reason: collision with root package name */
    public final C4802a3 f36269i;

    /* renamed from: j, reason: collision with root package name */
    private String f36270j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f36271k;

    /* renamed from: l, reason: collision with root package name */
    private long f36272l;

    /* renamed from: m, reason: collision with root package name */
    public final Y2 f36273m;

    /* renamed from: n, reason: collision with root package name */
    public final W2 f36274n;

    /* renamed from: o, reason: collision with root package name */
    public final C4802a3 f36275o;

    /* renamed from: p, reason: collision with root package name */
    public final Z2 f36276p;

    /* renamed from: q, reason: collision with root package name */
    public final W2 f36277q;

    /* renamed from: r, reason: collision with root package name */
    public final Y2 f36278r;

    /* renamed from: s, reason: collision with root package name */
    public final Y2 f36279s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f36280t;

    /* renamed from: u, reason: collision with root package name */
    public W2 f36281u;

    /* renamed from: v, reason: collision with root package name */
    public W2 f36282v;

    /* renamed from: w, reason: collision with root package name */
    public Y2 f36283w;

    /* renamed from: x, reason: collision with root package name */
    public final C4802a3 f36284x;

    /* renamed from: y, reason: collision with root package name */
    public final C4802a3 f36285y;

    /* renamed from: z, reason: collision with root package name */
    public final Y2 f36286z;

    X2(C4976v3 c4976v3) {
        super(c4976v3);
        this.f36264d = new Object();
        this.f36273m = new Y2(this, "session_timeout", 1800000L);
        this.f36274n = new W2(this, "start_new_session", true);
        this.f36278r = new Y2(this, "last_pause_time", 0L);
        this.f36279s = new Y2(this, "session_id", 0L);
        this.f36275o = new C4802a3(this, "non_personalized_ads", null);
        this.f36276p = new Z2(this, "last_received_uri_timestamps_by_source", null);
        this.f36277q = new W2(this, "allow_remote_dynamite", false);
        this.f36267g = new Y2(this, "first_open_time", 0L);
        this.f36268h = new Y2(this, "app_install_time", 0L);
        this.f36269i = new C4802a3(this, "app_instance_id", null);
        this.f36281u = new W2(this, "app_backgrounded", false);
        this.f36282v = new W2(this, "deep_link_retrieval_complete", false);
        this.f36283w = new Y2(this, "deep_link_retrieval_attempts", 0L);
        this.f36284x = new C4802a3(this, "firebase_feature_rollouts", null);
        this.f36285y = new C4802a3(this, "deferred_attribution_cache", null);
        this.f36286z = new Y2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f36262A = new Z2(this, "default_event_parameters", null);
    }

    final boolean A() {
        SharedPreferences sharedPreferences = this.f36263c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final void B(Boolean bool) {
        j();
        SharedPreferences.Editor editorEdit = G().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled_from_api");
        }
        editorEdit.apply();
    }

    final void C(String str) {
        j();
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    final void D(boolean z10) {
        j();
        zzj().G().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    protected final SharedPreferences E() {
        j();
        l();
        if (this.f36265e == null) {
            synchronized (this.f36264d) {
                try {
                    if (this.f36265e == null) {
                        String str = zza().getPackageName() + "_preferences";
                        zzj().G().b("Default prefs file", str);
                        this.f36265e = zza().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f36265e;
    }

    final void F(String str) {
        j();
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    protected final SharedPreferences G() {
        j();
        l();
        AbstractC7901p.l(this.f36263c);
        return this.f36263c;
    }

    final SparseArray H() {
        Bundle bundleA = this.f36276p.a();
        if (bundleA == null) {
            return new SparseArray();
        }
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            zzj().C().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    final D I() {
        j();
        return D.d(G().getString("dma_consent_settings", null));
    }

    final C4839e4 J() {
        j();
        return C4839e4.f(G().getString("consent_settings", "G1"), G().getInt("consent_source", 100));
    }

    final Boolean K() {
        j();
        if (G().contains("use_service")) {
            return Boolean.valueOf(G().getBoolean("use_service", false));
        }
        return null;
    }

    final Boolean L() {
        j();
        if (G().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(G().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    final Boolean M() {
        j();
        if (G().contains("measurement_enabled")) {
            return Boolean.valueOf(G().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String N() {
        j();
        String string = G().getString("previous_os_version", null);
        b().l();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = G().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final String O() {
        j();
        return G().getString("admob_app_id", null);
    }

    final String P() {
        j();
        return G().getString("gmp_app_id", null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4830d4
    protected final void k() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f36263c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f36280t = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f36263c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f36266f = new C4811b3(this, "health_monitor", Math.max(0L, ((Long) N.f36070d.a(null)).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4830d4
    protected final boolean p() {
        return true;
    }

    final Pair q(String str) {
        j();
        if (!J().m(C4839e4.a.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long jC = zzb().c();
        if (this.f36270j != null && jC < this.f36272l) {
            return new Pair(this.f36270j, Boolean.valueOf(this.f36271k));
        }
        this.f36272l = jC + a().A(str);
        C7062a.b(true);
        try {
            C7062a.C1997a c1997aA = C7062a.a(zza());
            this.f36270j = "";
            String strA = c1997aA.a();
            if (strA != null) {
                this.f36270j = strA;
            }
            this.f36271k = c1997aA.b();
        } catch (Exception e10) {
            zzj().B().b("Unable to get advertising id", e10);
            this.f36270j = "";
        }
        C7062a.b(false);
        return new Pair(this.f36270j, Boolean.valueOf(this.f36271k));
    }

    final void r(Boolean bool) {
        j();
        SharedPreferences.Editor editorEdit = G().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void s(boolean z10) {
        j();
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.putBoolean("use_service", z10);
        editorEdit.apply();
    }

    final boolean t(int i10) {
        return C4839e4.l(i10, G().getInt("consent_source", 100));
    }

    final boolean u(long j10) {
        return j10 - this.f36273m.a() > this.f36278r.a();
    }

    final boolean v(D d10) {
        j();
        if (!C4839e4.l(d10.a(), I().a())) {
            return false;
        }
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.putString("dma_consent_settings", d10.j());
        editorEdit.apply();
        return true;
    }

    final boolean w(C4839e4 c4839e4) {
        j();
        int iB = c4839e4.b();
        if (!t(iB)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.putString("consent_settings", c4839e4.v());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        return true;
    }

    protected final boolean x(D6 d62) {
        j();
        String string = G().getString("stored_tcf_param", "");
        String strE = d62.e();
        if (strE.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.putString("stored_tcf_param", strE);
        editorEdit.apply();
        return true;
    }

    protected final String y() {
        j();
        return G().getString("stored_tcf_param", "");
    }

    final void z() {
        j();
        Boolean boolM = M();
        SharedPreferences.Editor editorEdit = G().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolM != null) {
            r(boolM);
        }
    }
}
