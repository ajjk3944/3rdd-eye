package io.sentry.transport;

import io.sentry.h0;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface g extends Closeable {
    void a(boolean z10);

    void c(long j);

    p d();

    default boolean e() {
        return true;
    }

    void v(i4.b bVar, h0 h0Var);
}
