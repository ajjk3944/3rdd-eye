package com.bytedance.sdk.component.emc;

/* loaded from: classes.dex */
class msw {
    private static boolean emc;

    public static void emc(RuntimeException runtimeException) {
        if (emc) {
            throw runtimeException;
        }
    }
}
