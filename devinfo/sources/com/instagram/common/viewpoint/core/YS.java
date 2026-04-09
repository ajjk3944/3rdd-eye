package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C0759Pp A00;
    public final YU A01;

    public YS(C1436gi c1436gi, Executor executor, C0867Tw c0867Tw) {
        this.A01 = new YU(c1436gi);
        this.A00 = new C0759Pp(executor, c0867Tw, c1436gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1436gi c1436gi, Executor executor, C0867Tw c0867Tw) {
        if (!C0886Up.A1c(c1436gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c1436gi, executor, c0867Tw);
            A02.A00();
        } else {
            A02.A02(c0867Tw);
        }
    }

    private void A02(C0867Tw c0867Tw) {
        this.A00.A07(c0867Tw);
    }
}
