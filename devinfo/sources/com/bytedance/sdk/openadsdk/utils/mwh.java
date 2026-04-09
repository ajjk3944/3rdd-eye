package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh {
    public static void ouw(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.lh(th2.getMessage());
            }
        }
    }
}
