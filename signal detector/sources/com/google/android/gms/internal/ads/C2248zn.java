package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p2.C2771a;
import q2.C2841s;
import q2.InterfaceC2806a;

/* renamed from: com.google.android.gms.internal.ads.zn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2248zn {

    /* renamed from: a, reason: collision with root package name */
    public final C1276hk f17941a;

    /* renamed from: b, reason: collision with root package name */
    public final C2030vl f17942b;

    /* renamed from: c, reason: collision with root package name */
    public final C2191yk f17943c;

    /* renamed from: d, reason: collision with root package name */
    public final C0492Ek f17944d;

    /* renamed from: e, reason: collision with root package name */
    public final C0543Hk f17945e;

    /* renamed from: f, reason: collision with root package name */
    public final C0849Zk f17946f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f17947g;

    /* renamed from: h, reason: collision with root package name */
    public final C1976ul f17948h;
    public final C0643Ni i;

    /* renamed from: j, reason: collision with root package name */
    public final C2771a f17949j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1054df f17950k;

    /* renamed from: l, reason: collision with root package name */
    public final H6 f17951l;

    /* renamed from: m, reason: collision with root package name */
    public final C0781Vk f17952m;

    /* renamed from: n, reason: collision with root package name */
    public final C0633Mp f17953n;

    /* renamed from: o, reason: collision with root package name */
    public final C2202yv f17954o;

    /* renamed from: p, reason: collision with root package name */
    public final C0784Vn f17955p;

    /* renamed from: q, reason: collision with root package name */
    public final C2189yi f17956q;

    /* renamed from: r, reason: collision with root package name */
    public final C0478Dn f17957r;

    /* renamed from: s, reason: collision with root package name */
    public final C1280ho f17958s;

    /* renamed from: t, reason: collision with root package name */
    public final C0780Vj f17959t;

    /* renamed from: u, reason: collision with root package name */
    public final C0712Rj f17960u;

    public C2248zn(C1276hk c1276hk, C2191yk c2191yk, C0492Ek c0492Ek, C0543Hk c0543Hk, C0849Zk c0849Zk, Executor executor, C1976ul c1976ul, C0643Ni c0643Ni, C2771a c2771a, InterfaceC1054df interfaceC1054df, H6 h6, C0781Vk c0781Vk, C0633Mp c0633Mp, C2202yv c2202yv, C0784Vn c0784Vn, C2030vl c2030vl, C2189yi c2189yi, C0478Dn c0478Dn, C1280ho c1280ho, C0780Vj c0780Vj, C0712Rj c0712Rj) {
        this.f17941a = c1276hk;
        this.f17943c = c2191yk;
        this.f17944d = c0492Ek;
        this.f17945e = c0543Hk;
        this.f17946f = c0849Zk;
        this.f17947g = executor;
        this.f17948h = c1976ul;
        this.i = c0643Ni;
        this.f17949j = c2771a;
        this.f17950k = interfaceC1054df;
        this.f17951l = h6;
        this.f17952m = c0781Vk;
        this.f17953n = c0633Mp;
        this.f17954o = c2202yv;
        this.f17955p = c0784Vn;
        this.f17942b = c2030vl;
        this.f17956q = c2189yi;
        this.f17957r = c0478Dn;
        this.f17958s = c1280ho;
        this.f17959t = c0780Vj;
        this.f17960u = c0712Rj;
    }

    public static final C0657Of b(InterfaceC0828Yg interfaceC0828Yg, String str, String str2, Bundle bundle, Xu xu) {
        E9 e9 = H9.f8585E2;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            A.f.r(p2.j.f22785C.f22797k, bundle, "rendering-webview-load-html-start");
        }
        C0657Of c0657Of = new C0657Of();
        if (((Boolean) c2841s.f23270c.a(H9.ba)).booleanValue()) {
            Su suY = AbstractC1135f5.y(interfaceC0828Yg.getContext(), 112);
            suY.a();
            C1476lN.I(c0657Of, xu, suY, false);
        }
        interfaceC0828Yg.l0().f16014g = new C0889ae(bundle, 22, c0657Of);
        interfaceC0828Yg.B0(str, str2);
        return c0657Of;
    }

    public final void a(InterfaceC0828Yg interfaceC0828Yg, boolean z6, C0500Fb c0500Fb, Bundle bundle) {
        F6 f6;
        E9 e9 = H9.f8585E2;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            A.f.r(p2.j.f22785C.f22797k, bundle, "rendering-configure-webview-start");
        }
        interfaceC0828Yg.l0().u(new InterfaceC2806a() { // from class: com.google.android.gms.internal.ads.yn
            @Override // q2.InterfaceC2806a
            public final /* synthetic */ void onAdClicked() {
                this.f17761a.f17941a.onAdClicked();
            }
        }, this.f17944d, this.f17945e, new InterfaceC1966ub() { // from class: com.google.android.gms.internal.ads.wn
            @Override // com.google.android.gms.internal.ads.InterfaceC1966ub
            public final /* synthetic */ void q0(String str, String str2) {
                this.f17472a.f17946f.q0(str, str2);
            }
        }, new C1385jn(2, this), z6, c0500Fb, this.f17949j, new Rx(21, this), this.f17950k, this.f17953n, this.f17954o, this.f17955p, null, this.f17942b, null, null, null, this.f17956q, this.f17958s, this.f17959t, this.f17960u);
        interfaceC0828Yg.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.xn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C2248zn c2248zn = this.f17626a;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.mb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    c2248zn.f17957r.f7838a = motionEvent;
                }
                c2248zn.f17949j.f22747b = true;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        interfaceC0828Yg.setOnClickListener(new ViewOnClickListenerC0451Cd(this));
        if (((Boolean) g92.a(H9.f8755h3)).booleanValue() && (f6 = this.f17951l.f8555b) != null) {
            f6.h(interfaceC0828Yg.b0());
        }
        C1976ul c1976ul = this.f17948h;
        Executor executor = this.f17947g;
        c1976ul.z1(interfaceC0828Yg, executor);
        c1976ul.z1(new C0783Vm(interfaceC0828Yg, 2), executor);
        c1976ul.H1(interfaceC0828Yg.b0());
        interfaceC0828Yg.g0("/trackActiveViewUnit", new C0415Ab(this, 5, interfaceC0828Yg));
        C0643Ni c0643Ni = this.i;
        c0643Ni.getClass();
        c0643Ni.f10042j = new WeakReference(interfaceC0828Yg);
        if (((Boolean) g92.a(e9)).booleanValue()) {
            A.f.r(p2.j.f22785C.f22797k, bundle, "rendering-configure-webview-end");
        }
    }
}
