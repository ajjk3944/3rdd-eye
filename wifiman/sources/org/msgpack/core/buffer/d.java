package org.msgpack.core.buffer;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface d extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    MessageBuffer next();
}
