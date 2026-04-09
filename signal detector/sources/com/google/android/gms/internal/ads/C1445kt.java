package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import f4.InterfaceFutureC2326a;
import java.util.HashSet;
import java.util.concurrent.Executor;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.kt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1445kt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15301a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f15302b;

    /* renamed from: c, reason: collision with root package name */
    public final C0710Rh f15303c;

    /* renamed from: d, reason: collision with root package name */
    public final C1391jt f15304d;

    /* renamed from: e, reason: collision with root package name */
    public final Bt f15305e;

    /* renamed from: f, reason: collision with root package name */
    public final C2951a f15306f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f15307g;

    /* renamed from: h, reason: collision with root package name */
    public final Yu f15308h;
    public final C0905au i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceFutureC2326a f15309j;

    public C1445kt(Context context, Executor executor, C0710Rh c0710Rh, Bt bt, C1391jt c1391jt, C0905au c0905au, C2951a c2951a) {
        this.f15301a = context;
        this.f15302b = executor;
        this.f15303c = c0710Rh;
        this.f15305e = bt;
        this.f15304d = c1391jt;
        this.i = c0905au;
        this.f15306f = c2951a;
        this.f15307g = new FrameLayout(context);
        this.f15308h = c0710Rh.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(q2.a1 r11, java.lang.String r12, com.google.android.gms.internal.ads.Cr r13, com.google.android.gms.internal.ads.Dr r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1445kt.a(q2.a1, java.lang.String, com.google.android.gms.internal.ads.Cr, com.google.android.gms.internal.ads.Dr):boolean");
    }

    public final synchronized C0744Th b(InterfaceC2254zt interfaceC2254zt) {
        C1177ft c1177ft = (C1177ft) interfaceC2254zt;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.m9)).booleanValue()) {
            C0895ak c0895ak = new C0895ak();
            c0895ak.f13213a = this.f15301a;
            c0895ak.f13214b = c1177ft.f14168a;
            C0895ak c0895ak2 = new C0895ak(c0895ak);
            K4.e eVar = new K4.e();
            C1391jt c1391jt = this.f15304d;
            Executor executor = this.f15302b;
            ((HashSet) eVar.f2247l).add(new C1922tl(c1391jt, executor));
            eVar.c(c1391jt, executor);
            C1277hl c1277hl = new C1277hl(eVar);
            C0744Th c0744Th = new C0744Th(this.f15303c.f10986b, 0);
            c0744Th.f11426f = c0895ak2;
            c0744Th.f11425e = c1277hl;
            return c0744Th;
        }
        C1391jt c1391jt2 = this.f15304d;
        C1391jt c1391jt3 = new C1391jt(c1391jt2.f15008a);
        c1391jt3.f15015h = c1391jt2;
        K4.e eVar2 = new K4.e();
        Executor executor2 = this.f15302b;
        eVar2.a(c1391jt3, executor2);
        ((HashSet) eVar2.f2243g).add(new C1922tl(c1391jt3, executor2));
        ((HashSet) eVar2.f2249n).add(new C1922tl(c1391jt3, executor2));
        ((HashSet) eVar2.f2248m).add(new C1922tl(c1391jt3, executor2));
        ((HashSet) eVar2.f2247l).add(new C1922tl(c1391jt3, executor2));
        eVar2.c(c1391jt3, executor2);
        eVar2.f2236C = c1391jt3;
        C0895ak c0895ak3 = new C0895ak();
        c0895ak3.f13213a = this.f15301a;
        c0895ak3.f13214b = c1177ft.f14168a;
        C0895ak c0895ak4 = new C0895ak(c0895ak3);
        C1277hl c1277hl2 = new C1277hl(eVar2);
        C0744Th c0744Th2 = new C0744Th(this.f15303c.f10986b, 0);
        c0744Th2.f11426f = c0895ak4;
        c0744Th2.f11425e = c1277hl2;
        return c0744Th2;
    }
}
