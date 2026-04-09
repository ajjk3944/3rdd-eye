package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1170cO implements Runnable {
    public final /* synthetic */ KE A00;

    public RunnableC1170cO(KE ke2) {
        this.A00 = ke2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0M) {
                this.A00.A0K();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
