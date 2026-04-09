package p2;

import M2.u;
import Y2.C0212n;
import a.AbstractC0241a;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C0435Be;
import com.google.android.gms.internal.ads.InterfaceC1407k8;
import com.google.android.gms.internal.ads.N9;
import com.google.android.gms.internal.ads.X9;
import java.util.TreeMap;
import q2.B0;
import q2.C2834o;
import q2.InterfaceC2803B;
import q2.InterfaceC2809b0;
import q2.InterfaceC2842s0;
import q2.InterfaceC2847v;
import q2.InterfaceC2853y;
import q2.InterfaceC2854y0;
import q2.K;
import q2.W;
import q2.Y0;
import q2.Z;
import q2.a1;
import q2.d1;
import q2.g1;
import u2.C2951a;

/* loaded from: classes.dex */
public final class i extends K {

    /* renamed from: a, reason: collision with root package name */
    public final C2951a f22778a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f22779b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f22780c;

    /* renamed from: d, reason: collision with root package name */
    public final C2834o f22781d;

    /* renamed from: e, reason: collision with root package name */
    public WebView f22782e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2853y f22783f;

    /* renamed from: g, reason: collision with root package name */
    public AsyncTask f22784g;

    public i(Context context, d1 d1Var, String str, C2951a c2951a) {
        this.f22780c = context;
        this.f22778a = c2951a;
        this.f22779b = d1Var;
        this.f22782e = new WebView(context);
        this.f22781d = new C2834o(context, str);
        K3(0);
        this.f22782e.setVerticalScrollBarEnabled(false);
        this.f22782e.getSettings().setJavaScriptEnabled(true);
        this.f22782e.setWebViewClient(new C0212n(2, this));
        this.f22782e.setOnTouchListener(new J3.g(2));
    }

    @Override // q2.L
    public final String A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // q2.L
    public final B0 C() {
        return null;
    }

    @Override // q2.L
    public final void C3(W w6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final void D1(d1 d1Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // q2.L
    public final boolean H() {
        return false;
    }

    @Override // q2.L
    public final void H3(N9 n9) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final void K() {
        throw new IllegalStateException("Unused method");
    }

    public final void K3(int i) {
        if (this.f22782e == null) {
            return;
        }
        this.f22782e.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // q2.L
    public final void L2(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final String L3() {
        String str = (String) this.f22781d.f23256f;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) X9.f12397d.v();
        return AbstractC1135f5.n(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // q2.L
    public final boolean M() {
        return false;
    }

    @Override // q2.L
    public final InterfaceC2854y0 N() {
        return null;
    }

    @Override // q2.L
    public final void O0(Y0 y02) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final void S0(boolean z6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final void S1(C0435Be c0435Be) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final InterfaceC2853y Y() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // q2.L
    public final long a0() {
        return 0L;
    }

    @Override // q2.L
    public final void b0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final S2.a c() {
        u.c("getAdFrame must be called on the main UI thread.");
        return new S2.b(this.f22782e);
    }

    @Override // q2.L
    public final void d() {
        u.c("pause must be called on the main UI thread.");
    }

    @Override // q2.L
    public final void e() {
        u.c("resume must be called on the main UI thread.");
    }

    @Override // q2.L
    public final boolean f0(a1 a1Var) {
        u.f(this.f22782e, "This Search Ad has already been torn down");
        C2834o c2834o = this.f22781d;
        TreeMap treeMap = (TreeMap) c2834o.f23254d;
        c2834o.f23255e = a1Var.f23173j.f23145a;
        Bundle bundle = a1Var.f23176m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) X9.f12396c.v();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    c2834o.f23256f = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f22778a.f23784a);
            if (((Boolean) X9.f12394a.v()).booleanValue()) {
                Bundle bundleF = AbstractC0241a.F((Context) c2834o.f23252b, (String) X9.f12395b.v());
                for (String str3 : bundleF.keySet()) {
                    treeMap.put(str3, bundleF.get(str3).toString());
                }
            }
        }
        this.f22784g = new h(this).execute(new Void[0]);
        return true;
    }

    @Override // q2.L
    public final void i() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final Bundle k() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final void k1(InterfaceC2853y interfaceC2853y) {
        this.f22783f = interfaceC2853y;
    }

    @Override // q2.L
    public final void l() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final boolean m() {
        return false;
    }

    @Override // q2.L
    public final void n() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final d1 o() {
        return this.f22779b;
    }

    @Override // q2.L
    public final void q() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final void q2(InterfaceC2847v interfaceC2847v) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final String r() {
        return null;
    }

    @Override // q2.L
    public final void s() {
        u.c("destroy must be called on the main UI thread.");
        this.f22784g.cancel(true);
        this.f22782e.destroy();
        this.f22782e = null;
    }

    @Override // q2.L
    public final void s1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final W u() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // q2.L
    public final void u2(g1 g1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final void v1(Z z6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final String w() {
        return null;
    }

    @Override // q2.L
    public final void w1(InterfaceC1407k8 interfaceC1407k8) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.L
    public final void B2(S2.a aVar) {
    }

    @Override // q2.L
    public final void I2(InterfaceC2809b0 interfaceC2809b0) {
    }

    @Override // q2.L
    public final void R0(long j6) {
    }

    @Override // q2.L
    public final void V2(InterfaceC2842s0 interfaceC2842s0) {
    }

    @Override // q2.L
    public final void w2(boolean z6) {
    }

    @Override // q2.L
    public final void x3(a1 a1Var, InterfaceC2803B interfaceC2803B) {
    }
}
