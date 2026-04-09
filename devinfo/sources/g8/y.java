package g8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f24608a;

    /* renamed from: b, reason: collision with root package name */
    public int f24609b;

    /* renamed from: c, reason: collision with root package name */
    public int f24610c;

    /* renamed from: d, reason: collision with root package name */
    public int f24611d;

    /* renamed from: e, reason: collision with root package name */
    public int f24612e;

    /* renamed from: f, reason: collision with root package name */
    public final a8.g f24613f;

    public y(InputStream inputStream, a8.g gVar) {
        super(inputStream);
        this.f24611d = -1;
        this.f24613f = gVar;
        this.f24608a = (byte[]) gVar.e(65536, byte[].class);
    }

    public static void g() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f24608a == null || inputStream == null) {
            g();
            throw null;
        }
        return (this.f24609b - this.f24612e) + inputStream.available();
    }

    public final int c(InputStream inputStream, byte[] bArr) throws IOException {
        int i4 = this.f24611d;
        if (i4 != -1) {
            int i10 = this.f24612e - i4;
            int i11 = this.f24610c;
            if (i10 < i11) {
                if (i4 == 0 && i11 > bArr.length && this.f24609b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f24613f.e(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f24608a = bArr2;
                    this.f24613f.i(bArr);
                    bArr = bArr2;
                } else if (i4 > 0) {
                    System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                }
                int i12 = this.f24612e - this.f24611d;
                this.f24612e = i12;
                this.f24611d = 0;
                this.f24609b = 0;
                int i13 = inputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.f24612e;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f24609b = i14;
                return i13;
            }
        }
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            this.f24611d = -1;
            this.f24612e = 0;
            this.f24609b = i15;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f24608a != null) {
            this.f24613f.i(this.f24608a);
            this.f24608a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void e() {
        if (this.f24608a != null) {
            this.f24613f.i(this.f24608a);
            this.f24608a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i4) {
        this.f24610c = Math.max(this.f24610c, i4);
        this.f24611d = this.f24612e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f24608a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            g();
            throw null;
        }
        if (this.f24612e >= this.f24609b && c(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f24608a && (bArr = this.f24608a) == null) {
            g();
            throw null;
        }
        int i4 = this.f24609b;
        int i10 = this.f24612e;
        if (i4 - i10 <= 0) {
            return -1;
        }
        this.f24612e = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f24608a == null) {
            throw new IOException("Stream is closed");
        }
        int i4 = this.f24611d;
        if (-1 == i4) {
            throw new androidx.datastore.preferences.protobuf.l("Mark has been invalidated, pos: " + this.f24612e + " markLimit: " + this.f24610c);
        }
        this.f24612e = i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f24608a;
        if (bArr == null) {
            g();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            g();
            throw null;
        }
        int i4 = this.f24609b;
        int i10 = this.f24612e;
        if (i4 - i10 >= j) {
            this.f24612e = (int) (i10 + j);
            return j;
        }
        long j8 = i4 - i10;
        this.f24612e = i4;
        if (this.f24611d == -1 || j > this.f24610c) {
            long jSkip = inputStream.skip(j - j8);
            if (jSkip > 0) {
                this.f24611d = -1;
            }
            return j8 + jSkip;
        }
        if (c(inputStream, bArr) == -1) {
            return j8;
        }
        int i11 = this.f24609b;
        int i12 = this.f24612e;
        if (i11 - i12 >= j - j8) {
            this.f24612e = (int) ((i12 + j) - j8);
            return j;
        }
        long j9 = (j8 + i11) - i12;
        this.f24612e = i11;
        return j9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i4, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.f24608a;
        if (bArr2 == null) {
            g();
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i13 = this.f24612e;
            int i14 = this.f24609b;
            if (i13 < i14) {
                int i15 = i14 - i13;
                if (i15 >= i10) {
                    i15 = i10;
                }
                System.arraycopy(bArr2, i13, bArr, i4, i15);
                this.f24612e += i15;
                if (i15 == i10 || inputStream.available() == 0) {
                    return i15;
                }
                i4 += i15;
                i11 = i10 - i15;
            } else {
                i11 = i10;
            }
            while (true) {
                if (this.f24611d == -1 && i11 >= bArr2.length) {
                    i12 = inputStream.read(bArr, i4, i11);
                    if (i12 == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                } else {
                    if (c(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                    if (bArr2 != this.f24608a && (bArr2 = this.f24608a) == null) {
                        g();
                        throw null;
                    }
                    int i16 = this.f24609b;
                    int i17 = this.f24612e;
                    i12 = i16 - i17;
                    if (i12 >= i11) {
                        i12 = i11;
                    }
                    System.arraycopy(bArr2, i17, bArr, i4, i12);
                    this.f24612e += i12;
                }
                i11 -= i12;
                if (i11 == 0) {
                    return i10;
                }
                if (inputStream.available() == 0) {
                    return i10 - i11;
                }
                i4 += i12;
            }
        } else {
            g();
            throw null;
        }
    }
}
