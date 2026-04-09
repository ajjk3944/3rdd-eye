package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1521bx implements Runnable {
    public final /* synthetic */ C0997Kc A00;

    public RunnableC1521bx(C0997Kc c0997Kc) {
        this.A00 = c0997Kc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC1527c3) this.A00).A07.A0D() != null) {
                ((AbstractC1527c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
