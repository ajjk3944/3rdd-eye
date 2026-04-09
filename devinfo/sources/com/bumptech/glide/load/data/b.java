package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f6516a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6517b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.g f6518c;

    /* renamed from: d, reason: collision with root package name */
    public int f6519d;

    public b(FileOutputStream fileOutputStream, a8.g gVar) {
        this.f6516a = fileOutputStream;
        this.f6518c = gVar;
        this.f6517b = (byte[]) gVar.e(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f6516a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f6517b;
            if (bArr != null) {
                this.f6518c.i(bArr);
                this.f6517b = null;
            }
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i4 = this.f6519d;
        FileOutputStream fileOutputStream = this.f6516a;
        if (i4 > 0) {
            fileOutputStream.write(this.f6517b, 0, i4);
            this.f6519d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i4) throws IOException {
        byte[] bArr = this.f6517b;
        int i10 = this.f6519d;
        int i11 = i10 + 1;
        this.f6519d = i11;
        bArr[i10] = (byte) i4;
        if (i11 != bArr.length || i11 <= 0) {
            return;
        }
        this.f6516a.write(bArr, 0, i11);
        this.f6519d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i10) throws IOException {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i4 + i11;
            int i14 = this.f6519d;
            FileOutputStream fileOutputStream = this.f6516a;
            if (i14 == 0 && i12 >= this.f6517b.length) {
                fileOutputStream.write(bArr, i13, i12);
                return;
            }
            int iMin = Math.min(i12, this.f6517b.length - i14);
            System.arraycopy(bArr, i13, this.f6517b, this.f6519d, iMin);
            int i15 = this.f6519d + iMin;
            this.f6519d = i15;
            i11 += iMin;
            byte[] bArr2 = this.f6517b;
            if (i15 == bArr2.length && i15 > 0) {
                fileOutputStream.write(bArr2, 0, i15);
                this.f6519d = 0;
            }
        } while (i11 < i10);
    }
}
