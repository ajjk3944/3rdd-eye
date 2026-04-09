package com.applovin.shadow.okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface Sink extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    Timeout timeout();

    void write(Buffer buffer, long j) throws IOException;
}
