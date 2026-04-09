package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3382f9 implements Runnable {
    public final /* synthetic */ C2450Bw A00;

    public RunnableC3382f9(C2450Bw c2450Bw) {
        this.A00 = c2450Bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            C2450Bw.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
