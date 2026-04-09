package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3141bD implements Runnable {
    public final /* synthetic */ JR A00;

    public RunnableC3141bD(JR jr) {
        this.A00 = jr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A03 != null && this.A00.A03.getVisibility() == 0) {
                this.A00.A0S(8);
            }
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
