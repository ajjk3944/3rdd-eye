package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3212cM implements Runnable {
    public final /* synthetic */ C4K A00;

    public RunnableC3212cM(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A = true;
            this.A00.A0V.AFE(true);
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
