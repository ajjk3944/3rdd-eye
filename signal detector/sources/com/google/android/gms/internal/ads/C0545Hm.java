package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Hm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545Hm implements InterfaceC1921tk {

    /* renamed from: a, reason: collision with root package name */
    public final C1492lm f8995a;

    /* renamed from: b, reason: collision with root package name */
    public final C1546mm f8996b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f8997c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f8998d;

    public C0545Hm(C1492lm c1492lm, C1546mm c1546mm, Executor executor, C0623Mf c0623Mf) {
        this.f8995a = c1492lm;
        this.f8996b = c1546mm;
        this.f8997c = executor;
        this.f8998d = c0623Mf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final void z() {
        InterfaceFutureC2326a interfaceFutureC2326a;
        if (this.f8996b.f15654e) {
            C1492lm c1492lm = this.f8995a;
            C0837Yp c0837YpW = c1492lm.w();
            if (c0837YpW == null) {
                synchronized (c1492lm) {
                    interfaceFutureC2326a = c1492lm.f15446m;
                }
                if (interfaceFutureC2326a != null && ((Boolean) C2841s.f23267e.f23270c.a(H9.h6)).booleanValue()) {
                    InterfaceFutureC2326a interfaceFutureC2326aU = c1492lm.u();
                    C0657Of c0657OfV = c1492lm.v();
                    if (interfaceFutureC2326aU == null || c0657OfV == null) {
                        return;
                    }
                    C1789rD c1789rD = new C1789rD(LB.n(new InterfaceFutureC2326a[]{interfaceFutureC2326aU, c0657OfV}), false);
                    c1789rD.a(new CD(c1789rD, 0, new Nx(16, this)), this.f8998d);
                    return;
                }
            }
            if (c0837YpW != null) {
                InterfaceC0828Yg interfaceC0828YgT = c1492lm.t();
                InterfaceC0828Yg interfaceC0828YgR = c1492lm.r();
                if (interfaceC0828YgT == null) {
                    interfaceC0828YgT = interfaceC0828YgR == null ? null : interfaceC0828YgR;
                }
                if (interfaceC0828YgT != null) {
                    this.f8997c.execute(new RunnableC1219gh(interfaceC0828YgT, 5));
                }
            }
        }
    }
}
