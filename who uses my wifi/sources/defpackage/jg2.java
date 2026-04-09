package defpackage;

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
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jg2 extends FrameLayout implements ag2 {
    public final og2 f;
    public final g4 g;
    public final AtomicBoolean h;

    public jg2(og2 og2Var, mv2 mv2Var) {
        super(og2Var.getContext());
        this.h = new AtomicBoolean();
        this.f = og2Var;
        this.g = new g4(og2Var.f.c, this, this, mv2Var);
        addView(og2Var);
    }

    @Override // defpackage.ag2
    public final ArrayList A() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ag2
    public final boolean B0() {
        return this.f.B0();
    }

    @Override // defpackage.fd1
    public final void C() {
        og2 og2Var = this.f;
        if (og2Var != null) {
            og2Var.C();
        }
    }

    @Override // defpackage.ag2
    public final q12 C0() {
        return this.f.C0();
    }

    @Override // defpackage.ag2
    public final void D(String str, String str2) {
        this.f.D(str, str2);
    }

    @Override // defpackage.ag2
    public final void E(String str, vg0 vg0Var) {
        this.f.E(str, vg0Var);
    }

    @Override // defpackage.ag2
    public final void E0(a83 a83Var, c83 c83Var) {
        og2 og2Var = this.f;
        og2Var.o = a83Var;
        og2Var.p = c83Var;
    }

    @Override // defpackage.ag2
    public final a83 F() {
        return this.f.o;
    }

    @Override // defpackage.ag2
    public final c83 F0() {
        return this.f.p;
    }

    @Override // defpackage.ag2
    public final void G(wz2 wz2Var) {
        this.f.G(wz2Var);
    }

    @Override // defpackage.ag2
    public final void H0() {
        xz2 xz2VarK0;
        wz2 wz2VarW0;
        og2 og2Var = this.f;
        TextView textView = new TextView(getContext());
        hg4 hg4Var = hg4.C;
        lf4 lf4Var = hg4Var.c;
        Resources resourcesC = hg4Var.h.c();
        textView.setText(resourcesC != null ? resourcesC.getString(R.string.s7) : "Test Ad");
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
        iz1 iz1Var = mz1.J5;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && (wz2VarW0 = og2Var.W0()) != null) {
            synchronized (wz2VarW0) {
                cc3 cc3Var = wz2VarW0.f;
                if (cc3Var != null) {
                    hg4Var.x.getClass();
                    su2.t(new sz2(cc3Var, textView, 1));
                    return;
                }
                return;
            }
        }
        if (((Boolean) tw1Var.c.a(mz1.I5)).booleanValue() && (xz2VarK0 = og2Var.k0()) != null && ((wb3) xz2VarK0.b.l) == wb3.g) {
            su2 su2Var = hg4Var.x;
            xb3 xb3Var = xz2VarK0.a;
            su2Var.getClass();
            su2.t(new rz2(xb3Var, textView, 0));
        }
    }

    @Override // defpackage.ag2
    public final void I(boolean z, int i, String str, boolean z2, boolean z3) {
        this.f.I(z, i, str, z2, z3);
    }

    @Override // defpackage.ag2
    public final void J0(String str, String str2) throws Throwable {
        this.f.J0(str, str2);
    }

    @Override // defpackage.ag2
    public final int K() {
        return ((Boolean) tw1.e.c.a(mz1.k4)).booleanValue() ? this.f.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // defpackage.ag2
    public final void K0() {
        this.f.g0 = true;
    }

    @Override // defpackage.ag2
    public final void L() {
        setBackgroundColor(0);
        this.f.setBackgroundColor(0);
    }

    @Override // defpackage.ag2
    public final void L0() {
        this.f.L0();
    }

    @Override // defpackage.ag2
    public final void M(fc2 fc2Var, boolean z, boolean z2, String str) {
        this.f.M(fc2Var, z, z2, str);
    }

    @Override // defpackage.ag2
    public final void M0(Context context) {
        this.f.M0(context);
    }

    @Override // defpackage.ag2
    public final void N(q12 q12Var) {
        this.f.N(q12Var);
    }

    @Override // defpackage.ag2
    public final void N0(boolean z) {
        this.f.N0(z);
    }

    @Override // defpackage.gd4
    public final void O() {
        this.f.O();
    }

    @Override // defpackage.ag2
    public final jh1 O0() {
        return this.f.O0();
    }

    @Override // defpackage.ag2
    public final void P() {
        this.f.P();
    }

    @Override // defpackage.ag2
    public final void P0(boolean z) {
        this.f.P0(z);
    }

    @Override // defpackage.ag2
    public final void Q(int i) {
        ee2 ee2Var = (ee2) this.g.k;
        if (ee2Var != null) {
            if (((Boolean) tw1.e.c.a(mz1.R)).booleanValue()) {
                ee2Var.g.setBackgroundColor(i);
                ee2Var.h.setBackgroundColor(i);
            }
        }
    }

    @Override // defpackage.ag2
    public final boolean R0() {
        return this.f.R0();
    }

    @Override // defpackage.ov1
    public final void S0(nv1 nv1Var) {
        this.f.S0(nv1Var);
    }

    @Override // defpackage.ag2
    public final void T0(pt2 pt2Var) {
        this.f.T0(pt2Var);
    }

    @Override // defpackage.xp2
    public final void U0() {
        og2 og2Var = this.f;
        if (og2Var != null) {
            og2Var.U0();
        }
    }

    @Override // defpackage.ag2
    public final String V() {
        return this.f.V();
    }

    @Override // defpackage.ag2
    public final void V0(qg2 qg2Var) {
        this.f.V0(qg2Var);
    }

    @Override // defpackage.ag2
    public final vs1 W() {
        return this.f.g;
    }

    @Override // defpackage.ag2
    public final wz2 W0() {
        return this.f.W0();
    }

    @Override // defpackage.ag2
    public final fw1 X() {
        return this.f.X();
    }

    @Override // defpackage.ag2
    public final void X0(boolean z) {
        this.f.X0(z);
    }

    @Override // defpackage.ag2
    public final boolean Y0() {
        return this.f.Y0();
    }

    @Override // defpackage.ag2
    public final void Z(zq zqVar) {
        this.f.Z(zqVar);
    }

    @Override // defpackage.ag2
    public final void Z0(int i, boolean z, boolean z2) {
        this.f.Z0(i, z, z2);
    }

    @Override // defpackage.l52
    public final void a(String str, Map map) {
        this.f.a(str, map);
    }

    @Override // defpackage.ag2
    public final Context a0() {
        return this.f.f.c;
    }

    @Override // defpackage.ag2
    public final boolean a1() {
        return this.f.a1();
    }

    @Override // defpackage.r52
    public final void b(String str, JSONObject jSONObject) {
        this.f.s(str, jSONObject.toString());
    }

    @Override // defpackage.ag2
    public final void b0() {
        this.f.b0();
    }

    @Override // defpackage.ag2
    public final void b1(int i) {
        this.f.b1(i);
    }

    @Override // defpackage.l52
    public final void c(String str, JSONObject jSONObject) {
        this.f.c(str, jSONObject);
    }

    @Override // defpackage.ag2
    public final void c0(jh1 jh1Var) {
        this.f.c0(jh1Var);
    }

    @Override // defpackage.ag2
    public final boolean canGoBack() {
        return this.f.canGoBack();
    }

    @Override // defpackage.ag2
    public final int d() {
        return ((Boolean) tw1.e.c.a(mz1.k4)).booleanValue() ? this.f.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // defpackage.ag2
    public final void d1(String str, ff2 ff2Var) {
        this.f.d1(str, ff2Var);
    }

    @Override // defpackage.ag2
    public final void destroy() {
        wz2 wz2VarW0;
        og2 og2Var = this.f;
        xz2 xz2VarK0 = og2Var.k0();
        if (xz2VarK0 != null) {
            i63 i63Var = lf4.l;
            i63Var.post(new fu1(18, xz2VarK0));
            i63Var.postDelayed(new ig2(og2Var, 1), ((Integer) tw1.e.c.a(mz1.H5)).intValue());
        } else if (!((Boolean) tw1.e.c.a(mz1.J5)).booleanValue() || (wz2VarW0 = og2Var.W0()) == null) {
            og2Var.destroy();
        } else {
            lf4.l.post(new n62(this, wz2VarW0, 10));
        }
    }

    @Override // defpackage.gd4
    public final void e() {
        this.f.e();
    }

    @Override // defpackage.ag2
    public final sg2 e0() {
        return this.f.s;
    }

    @Override // defpackage.ag2
    public final void e1(boolean z) {
        this.f.e1(z);
    }

    @Override // defpackage.ag2
    public final qg2 f() {
        return this.f.f();
    }

    @Override // defpackage.ag2
    public final g4 f0() {
        return this.g;
    }

    @Override // defpackage.ag2
    public final void f1(String str, y32 y32Var) {
        this.f.f1(str, y32Var);
    }

    @Override // defpackage.ag2
    public final Activity g() {
        return this.f.f.a;
    }

    @Override // defpackage.ag2
    public final void goBack() {
        this.f.goBack();
    }

    @Override // defpackage.ag2
    public final void h0(int i) {
        this.f.h0(i);
    }

    @Override // defpackage.ag2
    public final void i() {
        this.f.i();
    }

    @Override // defpackage.ag2
    public final boolean i0() {
        return this.h.get();
    }

    @Override // defpackage.ag2
    public final rz1 j() {
        return this.f.O;
    }

    @Override // defpackage.ag2
    public final void j0(fw1 fw1Var) {
        this.f.j0(fw1Var);
    }

    @Override // defpackage.ag2
    public final l92 k() {
        return this.f.l;
    }

    @Override // defpackage.ag2
    public final xz2 k0() {
        return this.f.k0();
    }

    @Override // defpackage.r52
    public final void l(String str) {
        this.f.B(str);
    }

    @Override // defpackage.ag2
    public final void l0() {
        this.f.l0();
    }

    @Override // defpackage.ag2
    public final void loadData(String str, String str2, String str3) {
        this.f.loadData(str, "text/html", str3);
    }

    @Override // defpackage.ag2
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        this.f.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // defpackage.ag2
    public final void loadUrl(String str) {
        this.f.loadUrl(str);
    }

    @Override // defpackage.ag2
    public final vq2 m() {
        return this.f.Q;
    }

    @Override // defpackage.ag2
    public final void m0(xz2 xz2Var) {
        this.f.m0(xz2Var);
    }

    @Override // defpackage.ag2
    public final String n() {
        return this.f.n();
    }

    @Override // defpackage.ag2
    public final String o() {
        return this.f.o();
    }

    @Override // defpackage.ag2
    public final boolean o0() {
        return this.f.o0();
    }

    @Override // defpackage.ag2
    public final void onPause() {
        ae2 ae2Var;
        g4 g4Var = this.g;
        g4Var.getClass();
        ou1.h("onPause must be called from the UI thread.");
        ee2 ee2Var = (ee2) g4Var.k;
        if (ee2Var != null && (ae2Var = ee2Var.l) != null) {
            ae2Var.i();
        }
        this.f.onPause();
    }

    @Override // defpackage.ag2
    public final void onResume() {
        this.f.onResume();
    }

    @Override // defpackage.ag2
    public final int q() {
        return this.f.q();
    }

    @Override // defpackage.ag2
    public final void q0(jh1 jh1Var) {
        this.f.q0(jh1Var);
    }

    public final void r() {
        g4 g4Var = this.g;
        g4Var.getClass();
        ou1.h("onDestroy must be called from the UI thread.");
        ee2 ee2Var = (ee2) g4Var.k;
        if (ee2Var != null) {
            ee2Var.j.a();
            ae2 ae2Var = ee2Var.l;
            if (ae2Var != null) {
                ae2Var.g();
            }
            ee2Var.d();
            ((jg2) g4Var.h).removeView((ee2) g4Var.k);
            g4Var.k = null;
        }
        this.f.r();
    }

    @Override // defpackage.r52
    public final void s(String str, String str2) {
        this.f.s("window.inspectorInfo", str2);
    }

    @Override // defpackage.xp2
    public final void s0() {
        og2 og2Var = this.f;
        if (og2Var != null) {
            og2Var.s0();
        }
    }

    @Override // android.view.View, defpackage.ag2
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, defpackage.ag2
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f.setOnTouchListener(onTouchListener);
    }

    @Override // defpackage.ag2
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f.setWebChromeClient(webChromeClient);
    }

    @Override // defpackage.ag2
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f.setWebViewClient(webViewClient);
    }

    @Override // defpackage.ag2
    public final WebView t() {
        return this.f;
    }

    @Override // defpackage.ag2
    public final n70 t0() {
        return this.f.t0();
    }

    @Override // defpackage.ag2
    public final e51 u() {
        return this.f.j;
    }

    @Override // defpackage.ag2
    public final m83 u0() {
        return this.f.h;
    }

    @Override // defpackage.ag2
    public final void v(boolean z, int i, String str, String str2, boolean z2) {
        this.f.v(z, i, str, str2, z2);
    }

    @Override // defpackage.ag2
    public final void v0(String str, y32 y32Var) {
        this.f.v0(str, y32Var);
    }

    @Override // defpackage.ag2
    public final ff2 w0(String str) {
        return this.f.w0(str);
    }

    @Override // defpackage.ag2
    public final zq x() {
        return this.f.x();
    }

    @Override // defpackage.ag2
    public final void x0(boolean z) {
        this.f.s.I = z;
    }

    @Override // defpackage.ag2
    public final void y(int i) {
        this.f.y(i);
    }

    @Override // defpackage.ag2
    public final void y0(boolean z) {
        this.f.y0(z);
    }

    @Override // defpackage.ag2
    public final void z(long j, boolean z) {
        this.f.z(j, z);
    }

    @Override // defpackage.ag2
    public final jh1 z0() {
        return this.f.z0();
    }

    @Override // defpackage.ag2
    public final View p0() {
        return this;
    }
}
