package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2748Nl {

    @Nullable
    public static HandlerC2747Nk A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC2747Nk A00(C3246cu c3246cu) {
        if (A00 == null) {
            A00 = new HandlerC2747Nk(c3246cu);
        }
        return A00;
    }

    public static void A01(C3246cu c3246cu) {
        if (UA.A0F(c3246cu)) {
            A03(c3246cu);
        }
    }

    public static void A02(C3246cu c3246cu) {
        if (UA.A0E(c3246cu)) {
            A03(c3246cu);
        }
    }

    public static void A03(C3246cu c3246cu) {
        if (A01.compareAndSet(false, true)) {
            XJ.A01.execute(new C3482go(c3246cu));
        }
    }
}
