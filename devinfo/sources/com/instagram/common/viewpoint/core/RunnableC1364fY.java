package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1364fY implements Runnable {
    public final /* synthetic */ C1367fb A00;

    public RunnableC1364fY(C1367fb c1367fb) {
        this.A00 = c1367fb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            this.A00.A01.removeCallbacks(this);
            this.A00.A01.postDelayed(this, 250L);
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
