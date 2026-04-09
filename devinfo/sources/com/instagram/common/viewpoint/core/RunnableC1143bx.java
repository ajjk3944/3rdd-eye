package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1143bx implements Runnable {
    public final /* synthetic */ C0619Kc A00;

    public RunnableC1143bx(C0619Kc c0619Kc) {
        this.A00 = c0619Kc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC1149c3) this.A00).A07.A0D() != null) {
                ((AbstractC1149c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
