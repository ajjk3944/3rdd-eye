package io.sentry;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface e1 {
    void d(long j);

    void e();

    boolean isClosed();

    Future q(Runnable runnable, long j);

    Future submit(Runnable runnable);
}
