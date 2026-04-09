package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b00 extends FrameLayout implements qz {

    /* renamed from: a, reason: collision with root package name */
    public final e00 f9521a;

    /* renamed from: b, reason: collision with root package name */
    public final r7 f9522b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f9523c;

    public b00(e00 e00Var, qd0 qd0Var) {
        super(e00Var.getContext());
        this.f9523c = new AtomicBoolean();
        this.f9521a = e00Var;
        this.f9522b = new r7(e00Var.f10632a.f14825c, this, this, qd0Var);
        addView(e00Var);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void A(int i4) {
        sx sxVar = (sx) this.f9522b.f15561f;
        if (sxVar != null) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16132g0)).booleanValue()) {
                sxVar.f16568b.setBackgroundColor(i4);
                sxVar.f16569c.setBackgroundColor(i4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void A0(long j, boolean z3) {
        this.f9521a.A0(j, z3);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final Activity A1() {
        return this.f9521a.f10632a.f14823a;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final String B() {
        return this.f9521a.B();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void B0(String str, uy uyVar) {
        this.f9521a.B0(str, uyVar);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void B1() {
        this.f9521a.B1();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void C() {
        this.f9521a.C();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void C0(xa.e eVar, boolean z3, boolean z10, String str) {
        this.f9521a.C0(eVar, z3, z10, str);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final uk C1() {
        return this.f9521a.J;
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void D() {
        e00 e00Var = this.f9521a;
        if (e00Var != null) {
            e00Var.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void D0(h0 h0Var) {
        this.f9521a.D0(h0Var);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final km.n D1() {
        return this.f9521a.g;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void E0(boolean z3, int i4, String str, boolean z10, boolean z11) {
        this.f9521a.E0(z3, i4, str, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final rt E1() {
        return this.f9521a.L;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void F0() {
        setBackgroundColor(0);
        this.f9521a.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final String F1() {
        return this.f9521a.F1();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void G0(boolean z3, int i4, String str, boolean z10, String str2) {
        this.f9521a.G0(z3, i4, str, z10, str2);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final String G1() {
        return this.f9521a.G1();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final oe H0() {
        return this.f9521a.f10634b;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void I0(mh mhVar) {
        this.f9521a.I0(mhVar);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final int I1() {
        return this.f9521a.I1();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void J0(int i4) {
        this.f9521a.J0(i4);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final za.a J1() {
        return this.f9521a.f10638e;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final boolean K0() {
        return this.f9523c.get();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final jq0 L0() {
        return this.f9521a.f10636c;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final xh0 M() {
        return this.f9521a.M();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final r7 M0() {
        return this.f9522b;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void N0(boolean z3) {
        this.f9521a.f10645n.E = z3;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final boolean O0() {
        return this.f9521a.O0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final int O1() {
        return ((Boolean) va.s.f36163e.f36166c.a(sk.B4)).booleanValue() ? this.f9521a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final uy P(String str) {
        return this.f9521a.P(str);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final pm P0() {
        return this.f9521a.P0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void Q(g00 g00Var) {
        this.f9521a.Q(g00Var);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void Q0() {
        this.f9521a.f10635b0 = true;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final h0 R() {
        return this.f9521a.R();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void R0() {
        this.f9521a.R0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void S(int i4) {
        this.f9521a.S(i4);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void S0(boolean z3) {
        this.f9521a.S0(z3);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void T0(boolean z3) {
        this.f9521a.T0(z3);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final Context U() {
        return this.f9521a.f10632a.f14825c;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void V(String str, String str2) {
        this.f9521a.V(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final boolean V0() {
        return this.f9521a.V0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void W(String str, ix0 ix0Var) {
        this.f9521a.W(str, ix0Var);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void W0(String str, oo ooVar) {
        this.f9521a.W0(str, ooVar);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final i00 X() {
        return this.f9521a.f10645n;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void X0(boolean z3) {
        this.f9521a.X0(z3);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final boolean Y0() {
        return this.f9521a.Y0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void Z(String str, oo ooVar) {
        this.f9521a.Z(str, ooVar);
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final void a(String str, Map map) {
        this.f9521a.a(str, map);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a0() {
        this.f9521a.a0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void b0(pm pmVar) {
        this.f9521a.b0(pmVar);
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void c(String str, JSONObject jSONObject) {
        this.f9521a.f(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final mh c0() {
        return this.f9521a.c0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final boolean canGoBack() {
        return this.f9521a.canGoBack();
    }

    @Override // ua.g
    public final void d() {
        this.f9521a.d();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void d0(xh0 xh0Var) {
        this.f9521a.d0(xh0Var);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void destroy() {
        wh0 wh0VarU0;
        e00 e00Var = this.f9521a;
        xh0 xh0VarM = e00Var.M();
        if (xh0VarM != null) {
            ya.b0 b0Var = ya.f0.f37440l;
            b0Var.post(new s(24, xh0VarM));
            b0Var.postDelayed(new a00(e00Var, 1), ((Integer) va.s.f36163e.f36166c.a(sk.f16057b6)).intValue());
        } else if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16090d6)).booleanValue() || (wh0VarU0 = e00Var.u0()) == null) {
            e00Var.destroy();
        } else {
            ya.f0.f37440l.post(new q81(14, this, wh0VarU0));
        }
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void f(String str, String str2) {
        this.f9521a.f("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void f0() {
        this.f9521a.f0();
    }

    @Override // com.google.android.gms.internal.ads.aq
    public final void g(String str) {
        this.f9521a.o(str);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final boolean g0() {
        return this.f9521a.g0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void goBack() {
        this.f9521a.goBack();
    }

    @Override // com.google.android.gms.internal.ads.vp
    public final void h(String str, JSONObject jSONObject) {
        this.f9521a.h(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final vd.b h0() {
        return this.f9521a.h0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final WebView i() {
        return this.f9521a;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void i0(wp0 wp0Var, yp0 yp0Var) {
        e00 e00Var = this.f9521a;
        e00Var.j = wp0Var;
        e00Var.f10642k = yp0Var;
    }

    public final void j() {
        r7 r7Var = this.f9522b;
        r7Var.getClass();
        pb.y.d("onDestroy must be called from the UI thread.");
        sx sxVar = (sx) r7Var.f15561f;
        if (sxVar != null) {
            sxVar.f16571e.a();
            px pxVar = sxVar.g;
            if (pxVar != null) {
                pxVar.g();
            }
            sxVar.d();
            ((b00) r7Var.f15559d).removeView((sx) r7Var.f15561f);
            r7Var.f15561f = null;
        }
        this.f9521a.j();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void j0(boolean z3) {
        this.f9521a.j0(z3);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final xa.i k0() {
        return this.f9521a.k0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void l0(xa.i iVar) {
        this.f9521a.l0(iVar);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void loadData(String str, String str2, String str3) {
        this.f9521a.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        this.f9521a.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void loadUrl(String str) {
        this.f9521a.loadUrl(str);
    }

    @Override // ua.g
    public final void m() {
        this.f9521a.m();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void m0(wb0 wb0Var) {
        this.f9521a.m0(wb0Var);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final yp0 n0() {
        return this.f9521a.f10642k;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void o0() {
        xh0 xh0VarM;
        wh0 wh0VarU0;
        e00 e00Var = this.f9521a;
        TextView textView = new TextView(getContext());
        ua.j jVar = ua.j.C;
        ya.f0 f0Var = jVar.f35261c;
        Resources resourcesE = jVar.f35265h.e();
        textView.setText(resourcesE != null ? resourcesE.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        pk pkVar = sk.f16090d6;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && (wh0VarU0 = e00Var.u0()) != null) {
            synchronized (wh0VarU0) {
                zt0 zt0Var = wh0VarU0.f18027f;
                if (zt0Var != null) {
                    jVar.f35280x.getClass();
                    h80.s(new uh0(0, zt0Var, textView));
                    return;
                }
                return;
            }
        }
        if (((Boolean) sVar.f36166c.a(sk.f16074c6)).booleanValue() && (xh0VarM = e00Var.M()) != null && ((ut0) xh0VarM.f18391b.g) == ut0.HTML) {
            h80 h80Var = jVar.f35280x;
            vt0 vt0Var = xh0VarM.f18390a;
            h80Var.getClass();
            h80.s(new th0(vt0Var, textView, 0));
        }
    }

    @Override // va.a
    public final void onAdClicked() {
        e00 e00Var = this.f9521a;
        if (e00Var != null) {
            e00Var.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void onPause() {
        px pxVar;
        r7 r7Var = this.f9522b;
        r7Var.getClass();
        pb.y.d("onPause must be called from the UI thread.");
        sx sxVar = (sx) r7Var.f15561f;
        if (sxVar != null && (pxVar = sxVar.g) != null) {
            pxVar.n();
        }
        this.f9521a.onPause();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void onResume() {
        this.f9521a.onResume();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void p0(String str, String str2) throws Throwable {
        this.f9521a.p0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void q0(xa.i iVar) {
        this.f9521a.q0(iVar);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final wp0 s() {
        return this.f9521a.j;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void s0(Context context) {
        this.f9521a.s0(context);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.qz
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9521a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.qz
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f9521a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f9521a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f9521a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final xa.i t0() {
        return this.f9521a.t0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final wh0 u0() {
        return this.f9521a.u0();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final boolean v0() {
        return this.f9521a.v0();
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final void w(wg wgVar) {
        this.f9521a.w(wgVar);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void w0(int i4, boolean z3, boolean z10) {
        this.f9521a.w0(i4, z3, z10);
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void x() {
        e00 e00Var = this.f9521a;
        if (e00Var != null) {
            e00Var.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void x0(wh0 wh0Var) {
        this.f9521a.x0(wh0Var);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final ArrayList y() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt != this.f9521a) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void y0(int i4) {
        this.f9521a.y0(i4);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final int z() {
        return ((Boolean) va.s.f36163e.f36166c.a(sk.B4)).booleanValue() ? this.f9521a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void z0(boolean z3) {
        this.f9521a.z0(z3);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final g00 z1() {
        return this.f9521a.z1();
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final View N() {
        return this;
    }
}
