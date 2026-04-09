package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0829Sk extends Thread {
    public final long A00;

    public C0829Sk(long j) {
        this.A00 = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    Thread.sleep(this.A00);
                } catch (InterruptedException unused) {
                }
                C0827Si.A01();
            } catch (Throwable th2) {
                WU.A00(th2, this);
                return;
            }
        }
    }
}
