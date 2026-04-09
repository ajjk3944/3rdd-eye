package u1;

import com.google.android.gms.internal.ads.C0752Tp;
import com.google.android.gms.internal.ads.EK;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class y extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f23778a;

    /* renamed from: b, reason: collision with root package name */
    public int f23779b;

    /* renamed from: c, reason: collision with root package name */
    public int f23780c;

    /* renamed from: d, reason: collision with root package name */
    public int f23781d;

    /* renamed from: e, reason: collision with root package name */
    public int f23782e;

    /* renamed from: f, reason: collision with root package name */
    public final C0752Tp f23783f;

    public y(InputStream inputStream, C0752Tp c0752Tp) {
        super(inputStream);
        this.f23781d = -1;
        this.f23783f = c0752Tp;
        this.f23778a = (byte[]) c0752Tp.e(65536, byte[].class);
    }

    public static void d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f23781d;
        if (i != -1) {
            int i3 = this.f23782e - i;
            int i6 = this.f23780c;
            if (i3 < i6) {
                if (i == 0 && i6 > bArr.length && this.f23779b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i6) {
                        i6 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f23783f.e(i6, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f23778a = bArr2;
                    this.f23783f.i(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i7 = this.f23782e - this.f23781d;
                this.f23782e = i7;
                this.f23781d = 0;
                this.f23779b = 0;
                int i8 = inputStream.read(bArr, i7, bArr.length - i7);
                int i9 = this.f23782e;
                if (i8 > 0) {
                    i9 += i8;
                }
                this.f23779b = i9;
                return i8;
            }
        }
        int i10 = inputStream.read(bArr);
        if (i10 > 0) {
            this.f23781d = -1;
            this.f23782e = 0;
            this.f23779b = i10;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f23778a == null || inputStream == null) {
            d();
            throw null;
        }
        return (this.f23779b - this.f23782e) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f23778a != null) {
            this.f23783f.i(this.f23778a);
            this.f23778a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f23778a != null) {
            this.f23783f.i(this.f23778a);
            this.f23778a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f23780c = Math.max(this.f23780c, i);
        this.f23781d = this.f23782e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f23778a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            d();
            throw null;
        }
        if (this.f23782e >= this.f23779b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f23778a && (bArr = this.f23778a) == null) {
            d();
            throw null;
        }
        int i = this.f23779b;
        int i3 = this.f23782e;
        if (i - i3 <= 0) {
            return -1;
        }
        this.f23782e = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f23778a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f23781d;
        if (-1 == i) {
            throw new EK("Mark has been invalidated, pos: " + this.f23782e + " markLimit: " + this.f23780c);
        }
        this.f23782e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0L;
        }
        byte[] bArr = this.f23778a;
        if (bArr == null) {
            d();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            d();
            throw null;
        }
        int i = this.f23779b;
        int i3 = this.f23782e;
        if (i - i3 >= j6) {
            this.f23782e = (int) (i3 + j6);
            return j6;
        }
        long j7 = i - i3;
        this.f23782e = i;
        if (this.f23781d == -1 || j6 > this.f23780c) {
            long jSkip = inputStream.skip(j6 - j7);
            if (jSkip > 0) {
                this.f23781d = -1;
            }
            return j7 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j7;
        }
        int i6 = this.f23779b;
        int i7 = this.f23782e;
        if (i6 - i7 >= j6 - j7) {
            this.f23782e = (int) ((i7 + j6) - j7);
            return j6;
        }
        long j8 = (j7 + i6) - i7;
        this.f23782e = i6;
        return j8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i3) {
        int i6;
        int i7;
        byte[] bArr2 = this.f23778a;
        if (bArr2 == null) {
            d();
            throw null;
        }
        if (i3 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i8 = this.f23782e;
            int i9 = this.f23779b;
            if (i8 < i9) {
                int i10 = i9 - i8;
                if (i10 >= i3) {
                    i10 = i3;
                }
                System.arraycopy(bArr2, i8, bArr, i, i10);
                this.f23782e += i10;
                if (i10 == i3 || inputStream.available() == 0) {
                    return i10;
                }
                i += i10;
                i6 = i3 - i10;
            } else {
                i6 = i3;
            }
            while (true) {
                if (this.f23781d == -1 && i6 >= bArr2.length) {
                    i7 = inputStream.read(bArr, i, i6);
                    if (i7 == -1) {
                        return i6 != i3 ? i3 - i6 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i6 != i3 ? i3 - i6 : -1;
                    }
                    if (bArr2 != this.f23778a && (bArr2 = this.f23778a) == null) {
                        d();
                        throw null;
                    }
                    int i11 = this.f23779b;
                    int i12 = this.f23782e;
                    i7 = i11 - i12;
                    if (i7 >= i6) {
                        i7 = i6;
                    }
                    System.arraycopy(bArr2, i12, bArr, i, i7);
                    this.f23782e += i7;
                }
                i6 -= i7;
                if (i6 == 0) {
                    return i3;
                }
                if (inputStream.available() == 0) {
                    return i3 - i6;
                }
                i += i7;
            }
        } else {
            d();
            throw null;
        }
    }
}
