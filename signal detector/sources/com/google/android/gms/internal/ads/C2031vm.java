package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2031vm implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17325a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f17326b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f17327c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f17328d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f17329e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f17330f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1853sN f17331g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2069wN f17332h;
    public final InterfaceC2069wN i;

    public C2031vm(C0489Eh c0489Eh, C1113ek c1113ek, InterfaceC2069wN interfaceC2069wN, C1811ri c1811ri, InterfaceC1853sN interfaceC1853sN, InterfaceC1853sN interfaceC1853sN2, C1799rN c1799rN, C1799rN c1799rN2) {
        this.f17326b = c0489Eh;
        this.f17330f = c1113ek;
        this.f17327c = interfaceC2069wN;
        this.f17331g = c1811ri;
        this.f17332h = interfaceC1853sN;
        this.i = interfaceC1853sN2;
        this.f17328d = c1799rN;
        this.f17329e = c1799rN2;
    }

    public C1977um a() {
        C2909E c2909eC = ((C0489Eh) this.f17326b).c();
        C0960bu c0960buA = ((C1113ek) this.f17330f).a();
        C1600nm c1600nm = (C1600nm) this.f17327c.c();
        C1492lm c1492lmA = ((C1811ri) this.f17331g).a();
        C0443Bm c0443Bm = (C0443Bm) ((InterfaceC1853sN) this.f17332h).c();
        C0511Fm c0511Fm = (C0511Fm) ((InterfaceC1853sN) this.i).c();
        Executor executor = (Executor) this.f17328d.c();
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new C1977um(c2909eC, c0960buA, c1600nm, c1492lmA, c0443Bm, c0511Fm, executor, c0623Mf, (C1384jm) this.f17329e.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f17325a) {
            case 0:
                return a();
            case 1:
                return new C1439kn((C1276hk) this.f17326b.c(), (C2191yk) this.f17327c.c(), (C0492Ek) this.f17328d.c(), (C0543Hk) this.f17329e.c(), (C0849Zk) this.f17330f.c(), ((C2190yj) this.f17331g).a(), ((C2190yj) this.f17332h).f17749b.w(), (C2189yi) this.i.c());
            case 2:
                return new C0581Jo((C0615Lo) this.f17326b.c(), (C0768Uo) this.f17327c.c(), (C2249zo) this.f17328d.c(), ((C0540Hh) this.f17330f).a(), ((C0642Nh) this.f17331g).a(), (C0513Fo) this.f17329e.c(), (BinderC0751To) this.f17332h.c(), new SharedPreferencesOnSharedPreferenceChangeListenerC1647of(), new SharedPreferencesOnSharedPreferenceChangeListenerC1647of(), ((C0557Ih) this.i).c());
            default:
                return new Nt((String) ((C1907tN) this.f17330f).f16902a, (Lt) this.f17326b.c(), (Context) ((C1907tN) this.f17331g).f16902a, (It) this.f17327c.c(), (Yt) this.f17328d.c(), ((C0642Nh) this.f17329e).a(), (H6) this.f17332h.c(), (C0784Vn) this.i.c());
        }
    }

    public C2031vm(C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C0540Hh c0540Hh, C0642Nh c0642Nh, C1799rN c1799rN4, C1799rN c1799rN5, C0557Ih c0557Ih) {
        this.f17326b = c1799rN;
        this.f17327c = c1799rN2;
        this.f17328d = c1799rN3;
        this.f17330f = c0540Hh;
        this.f17331g = c0642Nh;
        this.f17329e = c1799rN4;
        this.f17332h = c1799rN5;
        this.i = c0557Ih;
    }

    public C2031vm(C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C1799rN c1799rN4, C1799rN c1799rN5, C2190yj c2190yj, C2190yj c2190yj2, C1799rN c1799rN6) {
        this.f17326b = c1799rN;
        this.f17327c = c1799rN2;
        this.f17328d = c1799rN3;
        this.f17329e = c1799rN4;
        this.f17330f = c1799rN5;
        this.f17331g = c2190yj;
        this.f17332h = c2190yj2;
        this.i = c1799rN6;
    }

    public C2031vm(C1907tN c1907tN, C1799rN c1799rN, C1907tN c1907tN2, C1799rN c1799rN2, C1799rN c1799rN3, C0642Nh c0642Nh, C1799rN c1799rN4, C1799rN c1799rN5) {
        this.f17330f = c1907tN;
        this.f17326b = c1799rN;
        this.f17331g = c1907tN2;
        this.f17327c = c1799rN2;
        this.f17328d = c1799rN3;
        this.f17329e = c0642Nh;
        this.f17332h = c1799rN4;
        this.i = c1799rN5;
    }
}
