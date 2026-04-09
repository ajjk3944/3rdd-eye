package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface qz extends va.a, t80, vp, aq, xg, ua.g {
    void A(int i4);

    void A0(long j, boolean z3);

    Activity A1();

    String B();

    void B0(String str, uy uyVar);

    void B1();

    void C();

    void C0(xa.e eVar, boolean z3, boolean z10, String str);

    uk C1();

    void D0(h0 h0Var);

    km.n D1();

    void E0(boolean z3, int i4, String str, boolean z10, boolean z11);

    rt E1();

    void F0();

    String F1();

    void G0(boolean z3, int i4, String str, boolean z10, String str2);

    String G1();

    oe H0();

    void I0(mh mhVar);

    int I1();

    void J0(int i4);

    za.a J1();

    boolean K0();

    jq0 L0();

    xh0 M();

    r7 M0();

    View N();

    void N0(boolean z3);

    boolean O0();

    int O1();

    uy P(String str);

    pm P0();

    void Q(g00 g00Var);

    void Q0();

    h0 R();

    void R0();

    void S(int i4);

    void S0(boolean z3);

    void T0(boolean z3);

    Context U();

    void V(String str, String str2);

    boolean V0();

    void W(String str, ix0 ix0Var);

    void W0(String str, oo ooVar);

    i00 X();

    void X0(boolean z3);

    boolean Y0();

    void Z(String str, oo ooVar);

    void a0();

    void b0(pm pmVar);

    mh c0();

    boolean canGoBack();

    void d0(xh0 xh0Var);

    void destroy();

    void f0();

    boolean g0();

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    ViewParent getParent();

    int getWidth();

    void goBack();

    vd.b h0();

    WebView i();

    void i0(wp0 wp0Var, yp0 yp0Var);

    boolean isAttachedToWindow();

    void j0(boolean z3);

    xa.i k0();

    void l0(xa.i iVar);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m0(wb0 wb0Var);

    yp0 n0();

    void o0();

    void onPause();

    void onResume();

    void p0(String str, String str2);

    void q0(xa.i iVar);

    wp0 s();

    void s0(Context context);

    void setBackgroundColor(int i4);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    xa.i t0();

    wh0 u0();

    boolean v0();

    void w0(int i4, boolean z3, boolean z10);

    void x0(wh0 wh0Var);

    ArrayList y();

    void y0(int i4);

    int z();

    void z0(boolean z3);

    g00 z1();
}
