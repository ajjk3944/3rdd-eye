package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1189ch implements Runnable {
    public final /* synthetic */ C0599Ji A00;

    public RunnableC1189ch(C0599Ji c0599Ji) {
        this.A00 = c0599Ji;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A09 != null && this.A00.getResources().getConfiguration().orientation == 1) {
                this.A00.A09.A0A();
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
