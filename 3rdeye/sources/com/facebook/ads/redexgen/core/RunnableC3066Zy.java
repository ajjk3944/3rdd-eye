package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3066Zy implements Runnable {
    public final /* synthetic */ KL A00;

    public RunnableC3066Zy(KL kl) {
        this.A00 = kl;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0m();
            this.A00.A0n();
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
