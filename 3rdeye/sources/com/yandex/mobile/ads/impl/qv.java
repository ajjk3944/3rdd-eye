package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class qv extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final ov f32355a;

    /* renamed from: b, reason: collision with root package name */
    private final sv f32356b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32358d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32359e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f32357c = new byte[1];

    public qv(g22 g22Var, sv svVar) {
        this.f32355a = g22Var;
        this.f32356b = svVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f32359e) {
            return;
        }
        this.f32355a.close();
        this.f32359e = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f32357c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f32357c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (!this.f32359e) {
            if (!this.f32358d) {
                this.f32355a.a(this.f32356b);
                this.f32358d = true;
            }
            int i11 = this.f32355a.read(bArr, i, i10);
            if (i11 == -1) {
                return -1;
            }
            return i11;
        }
        throw new IllegalStateException();
    }
}
