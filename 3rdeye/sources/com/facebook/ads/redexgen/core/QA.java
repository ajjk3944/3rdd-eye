package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class QA implements Runnable {
    public final /* synthetic */ C23196g A00;

    public QA(C23196g c23196g) {
        this.A00 = c23196g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A05 != null) {
            this.A00.A05.A0I();
        }
        this.A00.A0K = false;
    }
}
