package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3153bP implements Runnable {
    public final /* synthetic */ C2626Is A00;

    public RunnableC3153bP(C2626Is c2626Is) {
        this.A00 = c2626Is;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0D) {
                this.A00.A0L();
            }
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
