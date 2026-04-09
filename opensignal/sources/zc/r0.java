package zc;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r0 extends j1 {
    public static final Pair W = new Pair("", 0L);
    public final d5.y0 B;
    public final d8.a D;
    public String E;
    public boolean F;
    public long G;
    public final d5.y0 H;
    public final p0 I;
    public final d8.a J;
    public final js.e K;
    public final p0 L;
    public final d5.y0 M;
    public final d5.y0 N;
    public boolean O;
    public final p0 P;
    public final p0 Q;
    public final d5.y0 R;
    public final d8.a S;
    public final d8.a T;
    public final d5.y0 U;
    public final js.e V;

    /* renamed from: r, reason: collision with root package name */
    public SharedPreferences f27121r;

    /* renamed from: x, reason: collision with root package name */
    public SharedPreferences f27122x;

    /* renamed from: y, reason: collision with root package name */
    public q0 f27123y;

    public r0(c1 c1Var) {
        super(c1Var);
        this.H = new d5.y0(this, "session_timeout", 1800000L);
        this.I = new p0(this, "start_new_session", true);
        this.M = new d5.y0(this, "last_pause_time", 0L);
        this.N = new d5.y0(this, "session_id", 0L);
        this.J = new d8.a(this, "non_personalized_ads");
        this.K = new js.e(this, "last_received_uri_timestamps_by_source");
        this.L = new p0(this, "allow_remote_dynamite", false);
        this.B = new d5.y0(this, "first_open_time", 0L);
        cc.s.e("app_install_time");
        this.D = new d8.a(this, "app_instance_id");
        this.P = new p0(this, "app_backgrounded", false);
        this.Q = new p0(this, "deep_link_retrieval_complete", false);
        this.R = new d5.y0(this, "deep_link_retrieval_attempts", 0L);
        this.S = new d8.a(this, "firebase_feature_rollouts");
        this.T = new d8.a(this, "deferred_attribution_cache");
        this.U = new d5.y0(this, "deferred_attribution_cache_timestamp", 0L);
        this.V = new js.e(this, "default_event_parameters");
    }

    public final boolean A1(f3 f3Var) {
        s1();
        String string = w1().getString("stored_tcf_param", "");
        String strA = f3Var.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = w1().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void B1(boolean z10) {
        s1();
        j0 j0Var = ((c1) this.f1504d).f26889y;
        c1.g(j0Var);
        j0Var.K.c(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = w1().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    public final boolean C1(long j) {
        return j - this.H.e() > this.M.e();
    }

    @Override // zc.j1
    public final boolean t1() {
        return true;
    }

    public final SharedPreferences w1() {
        s1();
        u1();
        cc.s.h(this.f27121r);
        return this.f27121r;
    }

    public final SharedPreferences x1() {
        s1();
        u1();
        if (this.f27122x == null) {
            c1 c1Var = (c1) this.f1504d;
            String strValueOf = String.valueOf(c1Var.f26884a.getPackageName());
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            su.b bVar = j0Var.K;
            String strConcat = strValueOf.concat("_preferences");
            bVar.c(strConcat, "Default prefs file");
            this.f27122x = c1Var.f26884a.getSharedPreferences(strConcat, 0);
        }
        return this.f27122x;
    }

    public final SparseArray y1() {
        Bundle bundleS0 = this.K.s0();
        int[] intArray = bundleS0.getIntArray("uriSources");
        long[] longArray = bundleS0.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.B.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final o1 z1() {
        s1();
        return o1.c(w1().getInt("consent_source", 100), w1().getString("consent_settings", "G1"));
    }
}
