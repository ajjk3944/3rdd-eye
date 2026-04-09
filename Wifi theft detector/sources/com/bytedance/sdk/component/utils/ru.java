package com.bytedance.sdk.component.utils;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public class ru {
    public static void emc(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
