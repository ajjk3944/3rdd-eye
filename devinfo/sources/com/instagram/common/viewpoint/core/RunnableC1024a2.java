package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1024a2 implements Runnable {
    public final /* synthetic */ C1026a4 A00;

    public RunnableC1024a2(C1026a4 c1026a4) {
        this.A00 = c1026a4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02.getVisibility() == 0) {
                this.A00.A07(8);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
