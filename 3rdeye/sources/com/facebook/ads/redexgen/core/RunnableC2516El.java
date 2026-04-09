package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC2516El implements Runnable {
    public final InterfaceC2515Ek A00;

    public RunnableC2516El(InterfaceC2515Ek interfaceC2515Ek) {
        this.A00 = interfaceC2515Ek;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            this.A00.AE4();
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }
}
