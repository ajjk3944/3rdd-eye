package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC3132b4 implements Runnable {
    public final /* synthetic */ JU A00;

    public RunnableC3132b4(JU ju) {
        this.A00 = ju;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0Q) {
                this.A00.A0N();
            }
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
