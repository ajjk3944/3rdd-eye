package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.C0752Tp;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f6538a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6539b;

    /* renamed from: c, reason: collision with root package name */
    public final C0752Tp f6540c;

    /* renamed from: d, reason: collision with root package name */
    public int f6541d;

    public b(FileOutputStream fileOutputStream, C0752Tp c0752Tp) {
        this.f6538a = fileOutputStream;
        this.f6540c = c0752Tp;
        this.f6539b = (byte[]) c0752Tp.e(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f6538a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f6539b;
            if (bArr != null) {
                this.f6540c.i(bArr);
                this.f6539b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f6541d;
        FileOutputStream fileOutputStream = this.f6538a;
        if (i > 0) {
            fileOutputStream.write(this.f6539b, 0, i);
            this.f6541d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f6539b;
        int i3 = this.f6541d;
        int i6 = i3 + 1;
        this.f6541d = i6;
        bArr[i3] = (byte) i;
        if (i6 != bArr.length || i6 <= 0) {
            return;
        }
        this.f6538a.write(bArr, 0, i6);
        this.f6541d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i3) throws IOException {
        int i6 = 0;
        do {
            int i7 = i3 - i6;
            int i8 = i + i6;
            int i9 = this.f6541d;
            FileOutputStream fileOutputStream = this.f6538a;
            if (i9 == 0 && i7 >= this.f6539b.length) {
                fileOutputStream.write(bArr, i8, i7);
                return;
            }
            int iMin = Math.min(i7, this.f6539b.length - i9);
            System.arraycopy(bArr, i8, this.f6539b, this.f6541d, iMin);
            int i10 = this.f6541d + iMin;
            this.f6541d = i10;
            i6 += iMin;
            byte[] bArr2 = this.f6539b;
            if (i10 == bArr2.length && i10 > 0) {
                fileOutputStream.write(bArr2, 0, i10);
                this.f6541d = 0;
            }
        } while (i6 < i3);
    }
}
