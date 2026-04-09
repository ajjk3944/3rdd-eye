package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class g implements r {

    /* renamed from: a, reason: collision with root package name */
    private final r f18165a;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f18165a = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        this.f18165a.a(cVar, j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f18165a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18165a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.f18165a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f18165a.toString() + ")";
    }
}
