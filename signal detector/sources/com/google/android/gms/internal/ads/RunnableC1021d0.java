package com.google.android.gms.internal.ads;

import q2.InterfaceC2854y0;

/* renamed from: com.google.android.gms.internal.ads.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1021d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13702a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13705d;

    public /* synthetic */ RunnableC1021d0(C0697Ql c0697Ql, Object obj, long j6) {
        this.f13704c = c0697Ql;
        this.f13705d = obj;
        this.f13703b = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13702a;
        long j6 = this.f13703b;
        Object obj = this.f13704c;
        Object obj2 = this.f13705d;
        switch (i) {
            case 0:
                String str = Vt.f12096a;
                UN un = ((NN) ((C0697Ql) obj).f10692c).f9997a;
                GO go = un.f11649G;
                BO boY = go.y();
                go.t(boY, 26, new C1448kw(boY, obj2, j6));
                if (un.b0 == obj2) {
                    C1009cp c1009cp = un.f11690n;
                    c1009cp.c(26, ZJ.f12817c);
                    c1009cp.d();
                    break;
                }
                break;
            case 1:
                C4 c42 = (C4) obj2;
                c42.f7516a.a(j6, (String) obj);
                c42.f7516a.b(c42.toString());
                break;
            default:
                Ev ev = (Ev) obj2;
                C1014cu c1014cu = ev.f8039r;
                if (c1014cu != null) {
                    InterfaceC2854y0 interfaceC2854y0 = (InterfaceC2854y0) obj;
                    Jv jv = ev.f8041t;
                    c1014cu.n("paa", "pano_ts", this.f13703b, ev.f8027e.f23142d, ev.r(), !(interfaceC2854y0 instanceof BinderC1168fk) ? null : ((BinderC1168fk) interfaceC2854y0).f14127d, jv, ev.f());
                    break;
                }
                break;
        }
    }

    public RunnableC1021d0(C4 c42, String str, long j6) {
        this.f13704c = str;
        this.f13703b = j6;
        this.f13705d = c42;
    }

    public RunnableC1021d0(Ev ev, long j6, InterfaceC2854y0 interfaceC2854y0) {
        this.f13703b = j6;
        this.f13704c = interfaceC2854y0;
        this.f13705d = ev;
    }
}
