package ec;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.or;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b1 extends v1 {
    public static final Pair A = new Pair("", 0L);

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f22557d;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f22558e;

    /* renamed from: f, reason: collision with root package name */
    public b8.d f22559f;
    public final a1 g;

    /* renamed from: h, reason: collision with root package name */
    public final b5.i0 f22560h;

    /* renamed from: i, reason: collision with root package name */
    public String f22561i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f22562k;

    /* renamed from: l, reason: collision with root package name */
    public final a1 f22563l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f22564m;

    /* renamed from: n, reason: collision with root package name */
    public final b5.i0 f22565n;

    /* renamed from: o, reason: collision with root package name */
    public final a0.x0 f22566o;

    /* renamed from: p, reason: collision with root package name */
    public final z0 f22567p;

    /* renamed from: q, reason: collision with root package name */
    public final a1 f22568q;

    /* renamed from: r, reason: collision with root package name */
    public final a1 f22569r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22570s;

    /* renamed from: t, reason: collision with root package name */
    public final z0 f22571t;

    /* renamed from: u, reason: collision with root package name */
    public final z0 f22572u;

    /* renamed from: v, reason: collision with root package name */
    public final a1 f22573v;

    /* renamed from: w, reason: collision with root package name */
    public final b5.i0 f22574w;

    /* renamed from: x, reason: collision with root package name */
    public final b5.i0 f22575x;

    /* renamed from: y, reason: collision with root package name */
    public final a1 f22576y;

    /* renamed from: z, reason: collision with root package name */
    public final a0.x0 f22577z;

    public b1(o1 o1Var) {
        super(o1Var);
        this.f22563l = new a1(this, "session_timeout", 1800000L);
        this.f22564m = new z0(this, "start_new_session", true);
        this.f22568q = new a1(this, "last_pause_time", 0L);
        this.f22569r = new a1(this, "session_id", 0L);
        this.f22565n = new b5.i0(this, "non_personalized_ads");
        this.f22566o = new a0.x0(this, "last_received_uri_timestamps_by_source");
        this.f22567p = new z0(this, "allow_remote_dynamite", false);
        this.g = new a1(this, "first_open_time", 0L);
        pb.y.e("app_install_time");
        this.f22560h = new b5.i0(this, "app_instance_id");
        this.f22571t = new z0(this, "app_backgrounded", false);
        this.f22572u = new z0(this, "deep_link_retrieval_complete", false);
        this.f22573v = new a1(this, "deep_link_retrieval_attempts", 0L);
        this.f22574w = new b5.i0(this, "firebase_feature_rollouts");
        this.f22575x = new b5.i0(this, "deferred_attribution_cache");
        this.f22576y = new a1(this, "deferred_attribution_cache_timestamp", 0L);
        this.f22577z = new a0.x0(this, "default_event_parameters");
    }

    @Override // ec.v1
    public final boolean C() {
        return true;
    }

    public final SharedPreferences F() {
        B();
        D();
        pb.y.h(this.f22557d);
        return this.f22557d;
    }

    public final SharedPreferences G() {
        B();
        D();
        if (this.f22558e == null) {
            o1 o1Var = (o1) this.f218b;
            String strValueOf = String.valueOf(o1Var.f22949a.getPackageName());
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            or orVar = s0Var.f23060o;
            String strConcat = strValueOf.concat("_preferences");
            orVar.e(strConcat, "Default prefs file");
            this.f22558e = o1Var.f22949a.getSharedPreferences(strConcat, 0);
        }
        return this.f22558e;
    }

    public final SparseArray H() {
        Bundle bundleN = this.f22566o.N();
        int[] intArray = bundleN.getIntArray("uriSources");
        long[] longArray = bundleN.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.g.d("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = 0; i4 < intArray.length; i4++) {
            sparseArray.put(intArray[i4], Long.valueOf(longArray[i4]));
        }
        return sparseArray;
    }

    public final a2 I() {
        B();
        return a2.c(F().getInt("consent_source", 100), F().getString("consent_settings", "G1"));
    }

    public final boolean J(s3 s3Var) {
        B();
        String string = F().getString("stored_tcf_param", "");
        String strA = s3Var.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = F().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void K(boolean z3) {
        B();
        s0 s0Var = ((o1) this.f218b).f22954f;
        o1.m(s0Var);
        s0Var.f23060o.e(Boolean.valueOf(z3), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = F().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z3);
        editorEdit.apply();
    }

    public final boolean L(long j) {
        return j - this.f22563l.a() > this.f22568q.a();
    }
}
