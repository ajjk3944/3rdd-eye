package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class UG {
    public static UG A00 = new UG();

    public static UG A00() {
        return A00;
    }

    public final ZJ A01(T8 t82, boolean z3) {
        return new ZJ(t82, z3, new C0832Sn());
    }

    public final Map<String, String> A02(T8 t82) {
        try {
            return A01(t82, false).A06();
        } catch (Throwable th2) {
            t82.A08().A4I(th2);
            return U8.A01(t82);
        }
    }
}
