package io.sentry.android.core;

import android.os.Debug;
import io.sentry.a3;

/* loaded from: classes.dex */
public final class k implements io.sentry.y0 {
    @Override // io.sentry.y0
    public final void a(a3 a3Var) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        a3Var.f11462b = Long.valueOf(jFreeMemory);
        a3Var.f11463c = Long.valueOf(nativeHeapSize);
    }

    @Override // io.sentry.y0
    public final void c() {
    }
}
