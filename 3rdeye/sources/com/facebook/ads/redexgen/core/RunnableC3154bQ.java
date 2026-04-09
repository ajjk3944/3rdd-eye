package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3154bQ implements Runnable {
    public final /* synthetic */ C2626Is A00;

    public RunnableC3154bQ(C2626Is c2626Is) {
        this.A00 = c2626Is;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            this.A00.A0c.A0E().AFE(true);
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
