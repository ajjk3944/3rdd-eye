package ua;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.il;
import com.google.android.gms.internal.ads.ru0;
import com.google.android.gms.internal.ads.su;
import com.google.android.gms.internal.ads.vh;
import com.google.android.gms.internal.ads.xk;
import java.util.TreeMap;
import va.a1;
import va.a2;
import va.b0;
import va.c3;
import va.f3;
import va.k0;
import va.o;
import va.r1;
import va.v;
import va.v0;
import va.x1;
import va.x2;
import va.y;
import va.y0;
import va.z2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final za.a f35253a;

    /* renamed from: b, reason: collision with root package name */
    public final c3 f35254b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f35255c;

    /* renamed from: d, reason: collision with root package name */
    public final o f35256d;

    /* renamed from: e, reason: collision with root package name */
    public WebView f35257e;

    /* renamed from: f, reason: collision with root package name */
    public y f35258f;
    public AsyncTask g;

    public i(Context context, c3 c3Var, String str, za.a aVar) {
        this.f35255c = context;
        this.f35253a = aVar;
        this.f35254b = c3Var;
        this.f35257e = new WebView(context);
        this.f35256d = new o(context, str);
        h4(0);
        this.f35257e.setVerticalScrollBarEnabled(false);
        this.f35257e.getSettings().setJavaScriptEnabled(true);
        this.f35257e.setWebViewClient(new ru0(2, this));
        this.f35257e.setOnTouchListener(new hd.b(2));
    }

    @Override // va.l0
    public final void A2(f3 f3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void B1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final Bundle D1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void E0(boolean z3) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void E1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void F1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final c3 G1() {
        return this.f35254b;
    }

    @Override // va.l0
    public final y I() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // va.l0
    public final void I1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final String J1() {
        return null;
    }

    @Override // va.l0
    public final String L1() {
        return null;
    }

    @Override // va.l0
    public final long M() {
        return 0L;
    }

    @Override // va.l0
    public final String M1() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // va.l0
    public final void N() {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final x1 N1() {
        return null;
    }

    @Override // va.l0
    public final boolean P(z2 z2Var) {
        pb.y.i(this.f35257e, "This Search Ad has already been torn down");
        o oVar = this.f35256d;
        TreeMap treeMap = (TreeMap) oVar.f36148d;
        oVar.f36149e = z2Var.j.f36176a;
        Bundle bundle = z2Var.f36198m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) il.f12367c.u();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    oVar.f36150f = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    treeMap.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            treeMap.put("SDKVersion", this.f35253a.f38129a);
            if (((Boolean) il.f12365a.u()).booleanValue()) {
                Bundle bundleA = nh.a.A((Context) oVar.f36146b, (String) il.f12366b.u());
                for (String str3 : bundleA.keySet()) {
                    treeMap.put(str3, bundleA.get(str3).toString());
                }
            }
        }
        this.g = new h(this).execute(new Void[0]);
        return true;
    }

    @Override // va.l0
    public final void P2(x2 x2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void X3(v0 v0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final vb.a a() {
        pb.y.d("getAdFrame must be called on the main UI thread.");
        return new vb.b(this.f35257e);
    }

    @Override // va.l0
    public final void d() {
        pb.y.d("pause must be called on the main UI thread.");
    }

    @Override // va.l0
    public final void e() {
        pb.y.d("resume must be called on the main UI thread.");
    }

    @Override // va.l0
    public final void e4(xk xkVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final boolean f() {
        return false;
    }

    @Override // va.l0
    public final void g3(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void h() {
        pb.y.d("destroy must be called on the main UI thread.");
        this.g.cancel(true);
        this.f35257e.destroy();
        this.f35257e = null;
    }

    public final void h4(int i4) {
        if (this.f35257e == null) {
            return;
        }
        this.f35257e.setLayoutParams(new ViewGroup.LayoutParams(-1, i4));
    }

    @Override // va.l0
    public final v0 i() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final String i4() {
        String str = (String) this.f35256d.f36150f;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) il.f12368d.u();
        return r5.c.m(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // va.l0
    public final void j1(c3 c3Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // va.l0
    public final void n2(su suVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void p1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final boolean r() {
        return false;
    }

    @Override // va.l0
    public final void s1(y0 y0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void t() {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void t0(v vVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final void t1(vh vhVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // va.l0
    public final boolean u() {
        return false;
    }

    @Override // va.l0
    public final void x3(y yVar) {
        this.f35258f = yVar;
    }

    @Override // va.l0
    public final a2 y() {
        return null;
    }

    @Override // va.l0
    public final void D0(long j) {
    }

    @Override // va.l0
    public final void F0(a1 a1Var) {
    }

    @Override // va.l0
    public final void S2(boolean z3) {
    }

    @Override // va.l0
    public final void d1(r1 r1Var) {
    }

    @Override // va.l0
    public final void j3(vb.a aVar) {
    }

    @Override // va.l0
    public final void Z3(z2 z2Var, b0 b0Var) {
    }
}
