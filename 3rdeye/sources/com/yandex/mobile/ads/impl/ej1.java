package com.yandex.mobile.ads.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ej1 extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final jm f26878a;

    public ej1(jm jmVar, int i) {
        this.f26878a = jmVar;
        ((ByteArrayOutputStream) this).buf = jmVar.a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f26878a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f26878a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        int i10 = ((ByteArrayOutputStream) this).count + 1;
        if (i10 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] bArrA = this.f26878a.a(i10 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
            this.f26878a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = bArrA;
        }
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i10) {
        int i11 = ((ByteArrayOutputStream) this).count + i10;
        if (i11 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] bArrA = this.f26878a.a(i11 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
            this.f26878a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = bArrA;
        }
        super.write(bArr, i, i10);
    }
}
