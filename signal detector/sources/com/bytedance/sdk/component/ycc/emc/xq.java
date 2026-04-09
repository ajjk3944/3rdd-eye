package com.bytedance.sdk.component.ycc.emc;

/* loaded from: classes.dex */
public class xq {
    public static void emc(Object obj, String str) {
        if (obj == null) {
            emc(str);
        }
    }

    public static void emc(String str) {
        throw new IllegalArgumentException(str);
    }
}
