package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class S2 extends Thread {
    public final long A00;

    public S2(long j4) {
        this.A00 = j4;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    Thread.sleep(this.A00);
                } catch (InterruptedException unused) {
                }
                S0.A01();
            } catch (Throwable th) {
                AbstractC2951Vl.A00(th, this);
                return;
            }
        }
    }
}
