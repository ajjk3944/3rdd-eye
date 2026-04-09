package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3047Zf implements Runnable {
    public final /* synthetic */ C3048Zg A00;
    public final /* synthetic */ InterfaceC3049Zh A01;

    public RunnableC3047Zf(C3048Zg c3048Zg, InterfaceC3049Zh interfaceC3049Zh) {
        this.A00 = c3048Zg;
        this.A01 = interfaceC3049Zh;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A01.ACO();
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
