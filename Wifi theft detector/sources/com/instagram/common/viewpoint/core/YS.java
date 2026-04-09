package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C1137Pp A00;
    public final YU A01;

    public YS(C1814gi c1814gi, Executor executor, C1245Tw c1245Tw) {
        this.A01 = new YU(c1814gi);
        this.A00 = new C1137Pp(executor, c1245Tw, c1814gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1814gi c1814gi, Executor executor, C1245Tw c1245Tw) {
        if (!C1264Up.A1c(c1814gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c1814gi, executor, c1245Tw);
            A02.A00();
        } else {
            A02.A02(c1245Tw);
        }
    }

    private void A02(C1245Tw c1245Tw) {
        this.A00.A07(c1245Tw);
    }
}
