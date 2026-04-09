package io.sentry.util;

import io.sentry.q;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a extends ReentrantLock {
    public final q a() {
        lock();
        return new q(1, this);
    }
}
