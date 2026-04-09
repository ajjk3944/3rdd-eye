package com.bumptech.glide.load.data;

import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f34265a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f34266b;

    /* renamed from: c, reason: collision with root package name */
    private F2.b f34267c;

    /* renamed from: d, reason: collision with root package name */
    private int f34268d;

    public c(OutputStream outputStream, F2.b bVar) {
        this(outputStream, bVar, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    private void a() throws IOException {
        int i10 = this.f34268d;
        if (i10 > 0) {
            this.f34265a.write(this.f34266b, 0, i10);
            this.f34268d = 0;
        }
    }

    private void g() throws IOException {
        if (this.f34268d == this.f34266b.length) {
            a();
        }
    }

    private void h() {
        byte[] bArr = this.f34266b;
        if (bArr != null) {
            this.f34267c.d(bArr);
            this.f34266b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f34265a.close();
            h();
        } catch (Throwable th2) {
            this.f34265a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f34265a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f34266b;
        int i11 = this.f34268d;
        this.f34268d = i11 + 1;
        bArr[i11] = (byte) i10;
        g();
    }

    c(OutputStream outputStream, F2.b bVar, int i10) {
        this.f34265a = outputStream;
        this.f34267c = bVar;
        this.f34266b = (byte[]) bVar.e(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f34268d;
            if (i15 == 0 && i13 >= this.f34266b.length) {
                this.f34265a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f34266b.length - i15);
            System.arraycopy(bArr, i14, this.f34266b, this.f34268d, iMin);
            this.f34268d += iMin;
            i12 += iMin;
            g();
        } while (i12 < i11);
    }
}
