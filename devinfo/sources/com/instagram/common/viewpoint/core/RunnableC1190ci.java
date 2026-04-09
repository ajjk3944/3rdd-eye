package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ci, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1190ci implements Runnable {
    public final /* synthetic */ C0599Ji A00;

    public RunnableC1190ci(C0599Ji c0599Ji) {
        this.A00 = c0599Ji;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0D) {
                this.A00.A0M();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
