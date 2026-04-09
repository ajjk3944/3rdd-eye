package io.sentry.cache.tape;

import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class f implements Iterable, Closeable {
    public abstract void Y(int i10);

    public abstract void b(Object obj);

    public void clear() {
        Y(size());
    }

    public abstract int size();
}
