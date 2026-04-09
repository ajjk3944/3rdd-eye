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
import com.apm.insight.R;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import q2.C2841s;
import s2.BinderC2894d;
import t2.C2911G;
import t2.HandlerC2908D;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.hh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273hh extends FrameLayout implements InterfaceC0828Yg {

    /* renamed from: a, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1433kh f14532a;

    /* renamed from: b, reason: collision with root package name */
    public final C1726q3 f14533b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f14534c;

    public C1273hh(ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh, C0784Vn c0784Vn) {
        super(viewTreeObserverOnGlobalLayoutListenerC1433kh.getContext());
        this.f14534c = new AtomicBoolean();
        this.f14532a = viewTreeObserverOnGlobalLayoutListenerC1433kh;
        this.f14533b = new C1726q3(viewTreeObserverOnGlobalLayoutListenerC1433kh.f15204a.f17318c, this, this, c0784Vn);
        addView(viewTreeObserverOnGlobalLayoutListenerC1433kh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void A0() {
        C0837Yp c0837YpA0;
        C0820Xp c0820XpE0;
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = this.f14532a;
        TextView textView = new TextView(getContext());
        p2.j jVar = p2.j.f22785C;
        C2911G c2911g = jVar.f22790c;
        Resources resourcesE = jVar.f22795h.e();
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
        E9 e9 = H9.d6;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && (c0820XpE0 = viewTreeObserverOnGlobalLayoutListenerC1433kh.E0()) != null) {
            synchronized (c0820XpE0) {
                Vv vv = c0820XpE0.f12501f;
                if (vv != null) {
                    jVar.f22810x.getClass();
                    C1437kl.q(new RunnableC0786Vp(vv, 1, textView));
                    return;
                }
                return;
            }
        }
        if (((Boolean) c2841s.f23270c.a(H9.c6)).booleanValue() && (c0837YpA0 = viewTreeObserverOnGlobalLayoutListenerC1433kh.a0()) != null && ((Qv) c0837YpA0.f12709b.f13526g) == Qv.HTML) {
            C1437kl c1437kl = jVar.f22810x;
            Rv rv = c0837YpA0.f12708a;
            c1437kl.getClass();
            C1437kl.q(new RunnableC0769Up(rv, textView, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void B0(String str, String str2) throws Throwable {
        this.f14532a.B0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final ArrayList C() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f14532a) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void C0(Context context) {
        this.f14532a.C0(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final BinderC2894d D0() {
        return this.f14532a.D0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C0820Xp E0() {
        return this.f14532a.E0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final boolean F0() {
        return this.f14532a.F0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final int G() {
        return ((Boolean) C2841s.f23267e.f23270c.a(H9.f8567B4)).booleanValue() ? this.f14532a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void G0(int i, boolean z6, boolean z7) {
        this.f14532a.G0(i, z6, z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void H0(C0820Xp c0820Xp) {
        this.f14532a.H0(c0820Xp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final Qt J() {
        return this.f14532a.f15220j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void J0(int i) {
        this.f14532a.J0(i);
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final void K(L7 l7) {
        this.f14532a.K(l7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void K0(boolean z6) {
        this.f14532a.K0(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void L() {
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = this.f14532a;
        if (viewTreeObserverOnGlobalLayoutListenerC1433kh != null) {
            viewTreeObserverOnGlobalLayoutListenerC1433kh.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void L0(long j6, boolean z6) {
        this.f14532a.L0(j6, z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final void M() {
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = this.f14532a;
        if (viewTreeObserverOnGlobalLayoutListenerC1433kh != null) {
            viewTreeObserverOnGlobalLayoutListenerC1433kh.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void M0(String str, AbstractC0454Cg abstractC0454Cg) {
        this.f14532a.M0(str, abstractC0454Cg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void N0(boolean z6, int i, String str, boolean z7, boolean z8) {
        this.f14532a.N0(z6, i, str, z7, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void O0() {
        setBackgroundColor(0);
        this.f14532a.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void P(int i) {
        C0946bg c0946bg = (C0946bg) this.f14533b.f16316f;
        if (c0946bg != null) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8746g0)).booleanValue()) {
                c0946bg.f13413b.setBackgroundColor(i);
                c0946bg.f13414c.setBackgroundColor(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void P0(boolean z6, int i, String str, boolean z7, String str2) {
        this.f14532a.P0(z6, i, str, z7, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final H6 Q0() {
        return this.f14532a.f15206b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final String R() {
        return this.f14532a.R();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void R0(String str, Rx rx) {
        this.f14532a.R0(str, rx);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void S0(InterfaceC0920b8 interfaceC0920b8) {
        this.f14532a.S0(interfaceC0920b8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void T() {
        this.f14532a.T();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void T0(int i) {
        this.f14532a.T0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final boolean U0() {
        return this.f14534c.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void V0(s2.e eVar, boolean z6, boolean z7, String str) {
        this.f14532a.V0(eVar, z6, z7, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C1068du W0() {
        return this.f14532a.f15207c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C1726q3 X0() {
        return this.f14533b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final AbstractC0454Cg Y0(String str) {
        return this.f14532a.Y0(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void Z0(boolean z6) {
        this.f14532a.f15228n.f16004S = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1322ic
    public final void a(String str, Map map) {
        this.f14532a.a(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C0837Yp a0() {
        return this.f14532a.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final boolean a1() {
        return this.f14532a.a1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void b(String str, JSONObject jSONObject) {
        this.f14532a.f(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final View b0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final InterfaceC0482Ea b1() {
        return this.f14532a.b1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void c(String str) {
        this.f14532a.z(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void c0(BinderC1541mh binderC1541mh) {
        this.f14532a.c0(binderC1541mh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void c1() {
        this.f14532a.f15231p0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final boolean canGoBack() {
        return this.f14532a.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final T2.d d0() {
        return this.f14532a.d0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void destroy() {
        C0820Xp c0820XpE0;
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = this.f14532a;
        C0837Yp c0837YpA0 = viewTreeObserverOnGlobalLayoutListenerC1433kh.a0();
        if (c0837YpA0 != null) {
            HandlerC2908D handlerC2908D = C2911G.f23576l;
            handlerC2908D.post(new RunnableC1883t(25, c0837YpA0));
            handlerC2908D.postDelayed(new RunnableC1219gh(viewTreeObserverOnGlobalLayoutListenerC1433kh, 1), ((Integer) C2841s.f23267e.f23270c.a(H9.b6)).intValue());
        } else if (!((Boolean) C2841s.f23267e.f23270c.a(H9.d6)).booleanValue() || (c0820XpE0 = viewTreeObserverOnGlobalLayoutListenerC1433kh.E0()) == null) {
            viewTreeObserverOnGlobalLayoutListenerC1433kh.destroy();
        } else {
            C2911G.f23576l.post(new CD(this, 15, c0820XpE0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void e0(int i) {
        this.f14532a.e0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void e1() {
        this.f14532a.e1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1590nc
    public final void f(String str, String str2) {
        this.f14532a.f("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void f0(String str, String str2) {
        this.f14532a.f0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void f1(T2.d dVar) {
        this.f14532a.f1(dVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final BinderC1541mh g() {
        return this.f14532a.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void g0(String str, InterfaceC0466Db interfaceC0466Db) {
        this.f14532a.g0(str, interfaceC0466Db);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void g1(boolean z6) {
        this.f14532a.g1(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void goBack() {
        this.f14532a.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final Activity h() {
        return this.f14532a.f15204a.f17316a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void h1(boolean z6) {
        this.f14532a.h1(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void i() {
        this.f14532a.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final Context i0() {
        return this.f14532a.f15204a.f17318c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final boolean i1() {
        return this.f14532a.i1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final J9 j() {
        return this.f14532a.f15205a0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void j0() {
        this.f14532a.j0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void j1(String str, InterfaceC0466Db interfaceC0466Db) {
        this.f14532a.j1(str, interfaceC0466Db);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final V2.h k() {
        return this.f14532a.f15215g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void k1(boolean z6) {
        this.f14532a.k1(z6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C0889ae l() {
        return this.f14532a.f15208c0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C1649oh l0() {
        return this.f14532a.f15228n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final boolean l1() {
        return this.f14532a.l1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void loadData(String str, String str2, String str3) {
        this.f14532a.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        this.f14532a.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void loadUrl(String str) {
        this.f14532a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final int m() {
        return ((Boolean) C2841s.f23267e.f23270c.a(H9.f8567B4)).booleanValue() ? this.f14532a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void m0(InterfaceC0482Ea interfaceC0482Ea) {
        this.f14532a.m0(interfaceC0482Ea);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final String n() {
        return this.f14532a.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final InterfaceC0920b8 n0() {
        return this.f14532a.n0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final String o() {
        return this.f14532a.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void o0(C0837Yp c0837Yp) {
        this.f14532a.o0(c0837Yp);
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() {
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = this.f14532a;
        if (viewTreeObserverOnGlobalLayoutListenerC1433kh != null) {
            viewTreeObserverOnGlobalLayoutListenerC1433kh.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void onPause() {
        AbstractC0827Yf abstractC0827Yf;
        C1726q3 c1726q3 = this.f14533b;
        c1726q3.getClass();
        M2.u.c("onPause must be called from the UI thread.");
        C0946bg c0946bg = (C0946bg) c1726q3.f16316f;
        if (c0946bg != null && (abstractC0827Yf = c0946bg.f13418g) != null) {
            abstractC0827Yf.i();
        }
        this.f14532a.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void onResume() {
        this.f14532a.onResume();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1322ic
    public final void p(String str, JSONObject jSONObject) {
        this.f14532a.p(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void p0(BinderC2894d binderC2894d) {
        this.f14532a.p0(binderC2894d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final int q() {
        return this.f14532a.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final C2951a r() {
        return this.f14532a.f15211e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void r0(BinderC2894d binderC2894d) {
        this.f14532a.r0(binderC2894d);
    }

    public final void s() {
        C1726q3 c1726q3 = this.f14533b;
        c1726q3.getClass();
        M2.u.c("onDestroy must be called from the UI thread.");
        C0946bg c0946bg = (C0946bg) c1726q3.f16316f;
        if (c0946bg != null) {
            c0946bg.f13416e.a();
            AbstractC0827Yf abstractC0827Yf = c0946bg.f13418g;
            if (abstractC0827Yf != null) {
                abstractC0827Yf.g();
            }
            c0946bg.d();
            ((C1273hh) c1726q3.f16314d).removeView((C0946bg) c1726q3.f16316f);
            c1726q3.f16316f = null;
        }
        this.f14532a.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void s0() {
        this.f14532a.s0();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f14532a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f14532a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f14532a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f14532a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final WebView t() {
        return this.f14532a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final boolean t0() {
        return this.f14532a.t0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final InterfaceFutureC2326a u0() {
        return this.f14532a.u0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void v0(Qt qt, St st) {
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = this.f14532a;
        viewTreeObserverOnGlobalLayoutListenerC1433kh.f15220j = qt;
        viewTreeObserverOnGlobalLayoutListenerC1433kh.f15222k = st;
    }

    @Override // p2.g
    public final void w() {
        this.f14532a.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void w0(boolean z6) {
        this.f14532a.w0(z6);
    }

    @Override // p2.g
    public final void x() {
        this.f14532a.x();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final BinderC2894d x0() {
        return this.f14532a.x0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final void y0(ViewTreeObserverOnGlobalLayoutListenerC0953bn viewTreeObserverOnGlobalLayoutListenerC0953bn) {
        this.f14532a.y0(viewTreeObserverOnGlobalLayoutListenerC0953bn);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0828Yg
    public final St z0() {
        return this.f14532a.f15222k;
    }
}
