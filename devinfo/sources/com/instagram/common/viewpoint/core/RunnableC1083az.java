package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1083az implements Runnable {
    public final /* synthetic */ C1084b0 A00;
    public final /* synthetic */ InterfaceC1085b1 A01;

    public RunnableC1083az(C1084b0 c1084b0, InterfaceC1085b1 interfaceC1085b1) {
        this.A00 = c1084b0;
        this.A01 = interfaceC1085b1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
