package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3100aY implements Runnable {
    public final /* synthetic */ C2657Jx A00;

    public RunnableC3100aY(C2657Jx c2657Jx) {
        this.A00 = c2657Jx;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02 = true;
            if (((AbstractC3106ae) this.A00).A06.A0E() != null) {
                ((AbstractC3106ae) this.A00).A06.A0E().AFE(true);
            }
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
