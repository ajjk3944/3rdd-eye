package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* loaded from: classes.dex */
public class sz {
    public static void emc(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
