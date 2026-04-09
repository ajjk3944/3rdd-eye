package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1742fY implements Runnable {
    public final /* synthetic */ C1745fb A00;

    public RunnableC1742fY(C1745fb c1745fb) {
        this.A00 = c1745fb;
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
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
