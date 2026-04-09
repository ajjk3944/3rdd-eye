package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2993Xd {
    public static C2993Xd A02;
    public final C2773Om A00;
    public final C2995Xf A01;

    public C2993Xd(C3272dL c3272dL, Executor executor, TE te) {
        this.A01 = new C2995Xf(c3272dL);
        this.A00 = new C2773Om(executor, te, c3272dL);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C3272dL c3272dL, Executor executor, TE te) {
        if (!U7.A1X(c3272dL)) {
            return;
        }
        if (A02 == null) {
            A02 = new C2993Xd(c3272dL, executor, te);
            A02.A00();
        } else {
            A02.A02(te);
        }
    }

    private void A02(TE te) {
        this.A00.A07(te);
    }
}
