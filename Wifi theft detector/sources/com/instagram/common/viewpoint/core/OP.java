package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C1810ge c1810ge) {
        if (A00 == null) {
            A00 = new OO(c1810ge);
        }
        return A00;
    }

    public static void A01(C1810ge c1810ge) {
        if (AbstractC1267Us.A0F(c1810ge)) {
            A03(c1810ge);
        }
    }

    public static void A02(C1810ge c1810ge) {
        if (AbstractC1267Us.A0E(c1810ge)) {
            A03(c1810ge);
        }
    }

    public static void A03(C1810ge c1810ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C1913iN(c1810ge));
        }
    }
}
