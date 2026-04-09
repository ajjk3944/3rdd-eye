package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class h implements s {

    /* renamed from: a, reason: collision with root package name */
    private final s f18166a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f18166a = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f18166a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18166a.close();
    }

    public final s d() {
        return this.f18166a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f18166a.toString() + ")";
    }
}
