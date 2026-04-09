package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class j {
    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
