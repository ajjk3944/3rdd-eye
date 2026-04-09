package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final FileOutputStream f22298b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f22299c;

    /* renamed from: d, reason: collision with root package name */
    public final O2.g f22300d;

    /* renamed from: e, reason: collision with root package name */
    public int f22301e;

    public c(FileOutputStream fileOutputStream, O2.g gVar) {
        this.f22298b = fileOutputStream;
        this.f22300d = gVar;
        this.f22299c = (byte[]) gVar.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f22298b;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f22299c;
            if (bArr != null) {
                this.f22300d.h(bArr);
                this.f22299c = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f22301e;
        FileOutputStream fileOutputStream = this.f22298b;
        if (i > 0) {
            fileOutputStream.write(this.f22299c, 0, i);
            this.f22301e = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f22299c;
        int i10 = this.f22301e;
        int i11 = i10 + 1;
        this.f22301e = i11;
        bArr[i10] = (byte) i;
        if (i11 != bArr.length || i11 <= 0) {
            return;
        }
        this.f22298b.write(bArr, 0, i11);
        this.f22301e = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i + i11;
            int i14 = this.f22301e;
            FileOutputStream fileOutputStream = this.f22298b;
            if (i14 == 0 && i12 >= this.f22299c.length) {
                fileOutputStream.write(bArr, i13, i12);
                return;
            }
            int iMin = Math.min(i12, this.f22299c.length - i14);
            System.arraycopy(bArr, i13, this.f22299c, this.f22301e, iMin);
            int i15 = this.f22301e + iMin;
            this.f22301e = i15;
            i11 += iMin;
            byte[] bArr2 = this.f22299c;
            if (i15 == bArr2.length && i15 > 0) {
                fileOutputStream.write(bArr2, 0, i15);
                this.f22301e = 0;
            }
        } while (i11 < i10);
    }
}
