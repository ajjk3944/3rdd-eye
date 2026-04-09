package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f6712a;

    /* renamed from: b, reason: collision with root package name */
    private long f6713b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f6712a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        long jB = this.f6712a.b() - this.f6712a.c();
        if (jB > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jB;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f6713b = i;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f6712a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f6712a.b(this.f6713b);
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        return this.f6712a.a(j6);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) {
        return this.f6712a.b(bArr, i, i3);
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f6712a.d();
    }
}
