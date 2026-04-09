package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3328eG implements Runnable {
    public final /* synthetic */ C3331eJ A00;

    public RunnableC3328eG(C3331eJ c3331eJ) {
        this.A00 = c3331eJ;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            this.A00.A01.removeCallbacks(this);
            this.A00.A01.postDelayed(this, 250L);
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
