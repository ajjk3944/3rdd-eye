package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC2828Qp implements Runnable {
    public final /* synthetic */ C2829Qq A00;

    public RunnableC2828Qp(C2829Qq c2829Qq) {
        this.A00 = c2829Qq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
