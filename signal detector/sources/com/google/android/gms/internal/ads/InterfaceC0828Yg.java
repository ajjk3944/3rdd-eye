package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import q2.InterfaceC2806a;
import s2.BinderC2894d;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0828Yg extends InterfaceC2806a, InterfaceC2084wl, InterfaceC1322ic, InterfaceC1590nc, M7, p2.g {
    void A0();

    void B0(String str, String str2);

    ArrayList C();

    void C0(Context context);

    BinderC2894d D0();

    C0820Xp E0();

    boolean F0();

    int G();

    void G0(int i, boolean z6, boolean z7);

    void H0(C0820Xp c0820Xp);

    Qt J();

    void J0(int i);

    void K0(boolean z6);

    void L0(long j6, boolean z6);

    void M0(String str, AbstractC0454Cg abstractC0454Cg);

    void N0(boolean z6, int i, String str, boolean z7, boolean z8);

    void O0();

    void P(int i);

    void P0(boolean z6, int i, String str, boolean z7, String str2);

    H6 Q0();

    String R();

    void R0(String str, Rx rx);

    void S0(InterfaceC0920b8 interfaceC0920b8);

    void T();

    void T0(int i);

    boolean U0();

    void V0(s2.e eVar, boolean z6, boolean z7, String str);

    C1068du W0();

    C1726q3 X0();

    AbstractC0454Cg Y0(String str);

    void Z0(boolean z6);

    C0837Yp a0();

    boolean a1();

    View b0();

    InterfaceC0482Ea b1();

    void c0(BinderC1541mh binderC1541mh);

    void c1();

    boolean canGoBack();

    T2.d d0();

    void destroy();

    void e0(int i);

    void e1();

    void f0(String str, String str2);

    void f1(T2.d dVar);

    BinderC1541mh g();

    void g0(String str, InterfaceC0466Db interfaceC0466Db);

    void g1(boolean z6);

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    ViewParent getParent();

    int getWidth();

    void goBack();

    Activity h();

    void h1(boolean z6);

    void i();

    Context i0();

    boolean i1();

    boolean isAttachedToWindow();

    J9 j();

    void j0();

    void j1(String str, InterfaceC0466Db interfaceC0466Db);

    V2.h k();

    void k1(boolean z6);

    C0889ae l();

    C1649oh l0();

    boolean l1();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    int m();

    void m0(InterfaceC0482Ea interfaceC0482Ea);

    String n();

    InterfaceC0920b8 n0();

    String o();

    void o0(C0837Yp c0837Yp);

    void onPause();

    void onResume();

    void p0(BinderC2894d binderC2894d);

    int q();

    C2951a r();

    void r0(BinderC2894d binderC2894d);

    void s0();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    WebView t();

    boolean t0();

    InterfaceFutureC2326a u0();

    void v0(Qt qt, St st);

    void w0(boolean z6);

    BinderC2894d x0();

    void y0(ViewTreeObserverOnGlobalLayoutListenerC0953bn viewTreeObserverOnGlobalLayoutListenerC0953bn);

    St z0();
}
