package com.google.android.gms.internal.ads;

import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1752qc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1536mc f16383b;

    public /* synthetic */ RunnableC1752qc(C1536mc c1536mc, int i) {
        this.f16382a = i;
        this.f16383b = c1536mc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16382a) {
            case 0:
                C1536mc c1536mc = this.f16383b;
                InterfaceC0828Yg interfaceC0828Yg = c1536mc.f15630a;
                if (interfaceC0828Yg != null) {
                    interfaceC0828Yg.destroy();
                    c1536mc.f15630a = null;
                    break;
                }
                break;
            case 1:
                C1536mc c1536mc2 = this.f16383b;
                InterfaceC0828Yg interfaceC0828Yg2 = c1536mc2.f15630a;
                if (interfaceC0828Yg2 != null) {
                    interfaceC0828Yg2.destroy();
                    c1536mc2.f15630a = null;
                    break;
                }
                break;
            default:
                AbstractC2907C.m("maybeDestroy > Destroying engine.");
                C0415Ab c0415Ab = AbstractC0449Cb.f7607j;
                C1536mc c1536mc3 = this.f16383b;
                c1536mc3.d("/result", c0415Ab);
                InterfaceC0828Yg interfaceC0828Yg3 = c1536mc3.f15630a;
                if (interfaceC0828Yg3 != null) {
                    interfaceC0828Yg3.destroy();
                    c1536mc3.f15630a = null;
                    break;
                }
                break;
        }
    }
}
