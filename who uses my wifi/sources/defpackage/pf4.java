package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.TreeMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pf4 extends n92 {
    public final e51 f;
    public final xe4 g;
    public final Context h;
    public final bu1 i;
    public WebView j;
    public d32 k;
    public AsyncTask l;

    public pf4(Context context, xe4 xe4Var, String str, e51 e51Var) {
        this.h = context;
        this.f = e51Var;
        this.g = xe4Var;
        this.j = new WebView(context);
        this.i = new bu1(context, str);
        B3(0);
        this.j.setVerticalScrollBarEnabled(false);
        this.j.getSettings().setJavaScriptEnabled(true);
        this.j.setWebViewClient(new er0(3, this));
        this.j.setOnTouchListener(new na(2));
    }

    @Override // defpackage.ba2
    public final py2 A() {
        return null;
    }

    @Override // defpackage.ba2
    public final void A1(vi4 vi4Var) {
        throw new IllegalStateException("Unused method");
    }

    public final void B3(int i) {
        if (this.j == null) {
            return;
        }
        this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // defpackage.ba2
    public final boolean C() {
        return false;
    }

    public final String C3() {
        String str = (String) this.i.k;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) h02.d.w();
        return ex0.l(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // defpackage.ba2
    public final void D1(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final String E() {
        return null;
    }

    @Override // defpackage.ba2
    public final void H() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void H2(b12 b12Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void I0(wi2 wi2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void J2(ih3 ih3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void K2(nw1 nw1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final boolean L() {
        return false;
    }

    @Override // defpackage.ba2
    public final tx2 N() {
        return null;
    }

    @Override // defpackage.ba2
    public final void N0(xe4 xe4Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // defpackage.ba2
    public final void N1(pk2 pk2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void W2(d32 d32Var) {
        this.k = d32Var;
    }

    @Override // defpackage.ba2
    public final boolean Z(pc4 pc4Var) {
        ou1.k(this.j, "This Search Ad has already been torn down");
        bu1 bu1Var = this.i;
        TreeMap treeMap = (TreeMap) bu1Var.i;
        bu1Var.j = pc4Var.o.f;
        Bundle bundle = pc4Var.r;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) h02.c.w();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    bu1Var.k = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f.f);
            if (((Boolean) h02.a.w()).booleanValue()) {
                Bundle bundleU = yc0.u((Context) bu1Var.g, (String) h02.b.w());
                for (String str3 : bundleU.keySet()) {
                    treeMap.put(str3, bundleU.get(str3).toString());
                }
            }
        }
        this.l = new ke4(this).execute(new Void[0]);
        return true;
    }

    @Override // defpackage.ba2
    public final void c() {
        ou1.h("pause must be called on the main UI thread.");
    }

    @Override // defpackage.ba2
    public final u10 d() {
        ou1.h("getAdFrame must be called on the main UI thread.");
        return new oi0(this.j);
    }

    @Override // defpackage.ba2
    public final void e() {
        ou1.h("resume must be called on the main UI thread.");
    }

    @Override // defpackage.ba2
    public final void i() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void i2() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final Bundle k() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final long k0() {
        return 0L;
    }

    @Override // defpackage.ba2
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ba2
    public final void m() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void n() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void n2(ma2 ma2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final xe4 o() {
        return this.g;
    }

    @Override // defpackage.ba2
    public final void o3(vz1 vz1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void p0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final d32 p2() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // defpackage.ba2
    public final void q() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final void r() {
        ou1.h("destroy must be called on the main UI thread.");
        this.l.cancel(true);
        this.j.destroy();
        this.j = null;
    }

    @Override // defpackage.ba2
    public final wi2 s() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // defpackage.ba2
    public final void t1(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.ba2
    public final String u() {
        return null;
    }

    @Override // defpackage.ba2
    public final String v() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // defpackage.ba2
    public final void Z1(zu2 zu2Var) {
    }

    @Override // defpackage.ba2
    public final void g1(boolean z) {
    }

    @Override // defpackage.ba2
    public final void k3(u10 u10Var) {
    }

    @Override // defpackage.ba2
    public final void o2(pl2 pl2Var) {
    }

    @Override // defpackage.ba2
    public final void s1(long j) {
    }

    @Override // defpackage.ba2
    public final void a1(pc4 pc4Var, p42 p42Var) {
    }
}
