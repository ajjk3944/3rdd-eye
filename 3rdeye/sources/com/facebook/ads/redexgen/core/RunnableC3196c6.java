package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3196c6 implements Runnable {
    public final /* synthetic */ C22744n A00;

    public RunnableC3196c6(C22744n c22744n) {
        this.A00 = c22744n;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = true;
            this.A00.A0M.AFE(true);
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
