package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1179cX implements Runnable {
    public final /* synthetic */ KB A00;

    public RunnableC1179cX(KB kb) {
        this.A00 = kb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A03 != null && this.A00.A03.getVisibility() == 0) {
                this.A00.A0T(8);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
