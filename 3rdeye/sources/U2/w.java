package U2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes.dex */
public final class w extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public volatile byte[] f12450b;

    /* renamed from: c, reason: collision with root package name */
    public int f12451c;

    /* renamed from: d, reason: collision with root package name */
    public int f12452d;

    /* renamed from: e, reason: collision with root package name */
    public int f12453e;

    /* renamed from: f, reason: collision with root package name */
    public int f12454f;

    /* renamed from: g, reason: collision with root package name */
    public final O2.g f12455g;

    /* compiled from: RecyclableBufferedInputStream.java */
    public static class a extends IOException {
    }

    public w(InputStream inputStream, O2.g gVar) {
        super(inputStream);
        this.f12453e = -1;
        this.f12455g = gVar;
        this.f12450b = (byte[]) gVar.d(65536, byte[].class);
    }

    public static void c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f12453e;
        if (i != -1) {
            int i10 = this.f12454f - i;
            int i11 = this.f12452d;
            if (i10 < i11) {
                if (i == 0 && i11 > bArr.length && this.f12451c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f12455g.d(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f12450b = bArr2;
                    this.f12455g.h(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i12 = this.f12454f - this.f12453e;
                this.f12454f = i12;
                this.f12453e = 0;
                this.f12451c = 0;
                int i13 = inputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.f12454f;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f12451c = i14;
                return i13;
            }
        }
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            this.f12453e = -1;
            this.f12454f = 0;
            this.f12451c = i15;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f12450b == null || inputStream == null) {
            c();
            throw null;
        }
        return (this.f12451c - this.f12454f) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f12450b != null) {
            this.f12455g.h(this.f12450b);
            this.f12450b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f12452d = Math.max(this.f12452d, i);
        this.f12453e = this.f12454f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.f12450b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            c();
            throw null;
        }
        if (this.f12454f >= this.f12451c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f12450b && (bArr = this.f12450b) == null) {
            c();
            throw null;
        }
        int i = this.f12451c;
        int i10 = this.f12454f;
        if (i - i10 <= 0) {
            return -1;
        }
        this.f12454f = i10 + 1;
        return bArr[i10] & 255;
    }

    public final synchronized void release() {
        if (this.f12450b != null) {
            this.f12455g.h(this.f12450b);
            this.f12450b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.f12450b == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f12453e;
        if (-1 == i) {
            throw new a("Mark has been invalidated, pos: " + this.f12454f + " markLimit: " + this.f12452d);
        }
        this.f12454f = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j4) throws IOException {
        if (j4 < 1) {
            return 0L;
        }
        byte[] bArr = this.f12450b;
        if (bArr == null) {
            c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            c();
            throw null;
        }
        int i = this.f12451c;
        int i10 = this.f12454f;
        if (i - i10 >= j4) {
            this.f12454f = (int) (i10 + j4);
            return j4;
        }
        long j10 = i - i10;
        this.f12454f = i;
        if (this.f12453e == -1 || j4 > this.f12452d) {
            long jSkip = inputStream.skip(j4 - j10);
            if (jSkip > 0) {
                this.f12453e = -1;
            }
            return j10 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j10;
        }
        int i11 = this.f12451c;
        int i12 = this.f12454f;
        if (i11 - i12 >= j4 - j10) {
            this.f12454f = (int) ((i12 + j4) - j10);
            return j4;
        }
        long j11 = (j10 + i11) - i12;
        this.f12454f = i11;
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i10) throws IOException {
        int i11;
        int i12;
        byte[] bArr2 = this.f12450b;
        if (bArr2 == null) {
            c();
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i13 = this.f12454f;
            int i14 = this.f12451c;
            if (i13 < i14) {
                int i15 = i14 - i13;
                if (i15 >= i10) {
                    i15 = i10;
                }
                System.arraycopy(bArr2, i13, bArr, i, i15);
                this.f12454f += i15;
                if (i15 == i10 || inputStream.available() == 0) {
                    return i15;
                }
                i += i15;
                i11 = i10 - i15;
            } else {
                i11 = i10;
            }
            while (true) {
                if (this.f12453e == -1 && i11 >= bArr2.length) {
                    i12 = inputStream.read(bArr, i, i11);
                    if (i12 == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                    if (bArr2 != this.f12450b && (bArr2 = this.f12450b) == null) {
                        c();
                        throw null;
                    }
                    int i16 = this.f12451c;
                    int i17 = this.f12454f;
                    i12 = i16 - i17;
                    if (i12 >= i11) {
                        i12 = i11;
                    }
                    System.arraycopy(bArr2, i17, bArr, i, i12);
                    this.f12454f += i12;
                }
                i11 -= i12;
                if (i11 == 0) {
                    return i10;
                }
                if (inputStream.available() == 0) {
                    return i10 - i11;
                }
                i += i12;
            }
        } else {
            c();
            throw null;
        }
    }
}
