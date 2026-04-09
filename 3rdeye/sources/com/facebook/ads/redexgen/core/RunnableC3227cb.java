package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3227cb implements Runnable {
    public final /* synthetic */ C22523r A00;

    public RunnableC3227cb(C22523r c22523r) {
        this.A00 = c22523r;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            ((G2) this.A00).A09.A4b(((G2) this.A00).A0A.A7o());
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
