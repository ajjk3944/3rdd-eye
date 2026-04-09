package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ac implements ec, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {
    public xt0 f;
    public long g;

    public final byte a(long j) {
        int i;
        long j2 = j;
        j41.a(this.g, j2, 1L);
        long j3 = this.g;
        if (j3 - j2 <= j2) {
            long j4 = j2 - j3;
            xt0 xt0Var = this.f;
            do {
                xt0Var = xt0Var.g;
                int i2 = xt0Var.c;
                i = xt0Var.b;
                j4 += i2 - i;
            } while (j4 < 0);
            return xt0Var.a[i + ((int) j4)];
        }
        xt0 xt0Var2 = this.f;
        while (true) {
            int i3 = xt0Var2.c;
            int i4 = xt0Var2.b;
            long j5 = i3 - i4;
            if (j2 < j5) {
                return xt0Var2.a[i4 + ((int) j2)];
            }
            j2 -= j5;
            xt0Var2 = xt0Var2.f;
        }
    }

    public final byte c() {
        long j = this.g;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        xt0 xt0Var = this.f;
        int i = xt0Var.b;
        int i2 = xt0Var.c;
        int i3 = i + 1;
        byte b = xt0Var.a[i];
        this.g = j - 1;
        if (i3 != i2) {
            xt0Var.b = i3;
            return b;
        }
        this.f = xt0Var.a();
        zt0.r(xt0Var);
        return b;
    }

    public final Object clone() {
        ac acVar = new ac();
        if (this.g == 0) {
            return acVar;
        }
        xt0 xt0VarC = this.f.c();
        acVar.f = xt0VarC;
        xt0VarC.g = xt0VarC;
        xt0VarC.f = xt0VarC;
        xt0 xt0Var = this.f;
        while (true) {
            xt0Var = xt0Var.f;
            if (xt0Var == this.f) {
                acVar.g = this.g;
                return acVar;
            }
            acVar.f.g.b(xt0Var.c());
        }
    }

    @Override // defpackage.ec
    public final boolean d(long j) {
        return this.g >= j;
    }

    @Override // defpackage.gx0
    public final long e(ac acVar, long j) {
        if (acVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        long j2 = this.g;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        acVar.k(this, j);
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        long j = this.g;
        if (j != acVar.g) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        xt0 xt0Var = this.f;
        xt0 xt0Var2 = acVar.f;
        int i = xt0Var.b;
        int i2 = xt0Var2.b;
        while (j2 < this.g) {
            long jMin = Math.min(xt0Var.c - i, xt0Var2.c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (xt0Var.a[i] != xt0Var2.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == xt0Var.c) {
                xt0Var = xt0Var.f;
                i = xt0Var.b;
            }
            if (i2 == xt0Var2.c) {
                xt0Var2 = xt0Var2.f;
                i2 = xt0Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final byte[] f(long j) throws EOFException {
        j41.a(this.g, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    public final String g(long j, Charset charset) {
        j41.a(this.g, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        xt0 xt0Var = this.f;
        int i = xt0Var.b;
        if (i + j > xt0Var.c) {
            return new String(f(j), charset);
        }
        String str = new String(xt0Var.a, i, (int) j, charset);
        int i2 = (int) (xt0Var.b + j);
        xt0Var.b = i2;
        this.g -= j;
        if (i2 == xt0Var.c) {
            this.f = xt0Var.a();
            zt0.r(xt0Var);
        }
        return str;
    }

    public final void h(long j) throws EOFException {
        while (j > 0) {
            if (this.f == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, r0.c - r0.b);
            long j2 = iMin;
            this.g -= j2;
            j -= j2;
            xt0 xt0Var = this.f;
            int i = xt0Var.b + iMin;
            xt0Var.b = i;
            if (i == xt0Var.c) {
                this.f = xt0Var.a();
                zt0.r(xt0Var);
            }
        }
    }

    public final int hashCode() {
        xt0 xt0Var = this.f;
        if (xt0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = xt0Var.c;
            for (int i3 = xt0Var.b; i3 < i2; i3++) {
                i = (i * 31) + xt0Var.a[i3];
            }
            xt0Var = xt0Var.f;
        } while (xt0Var != this.f);
        return i;
    }

    public final xt0 i(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        xt0 xt0Var = this.f;
        if (xt0Var == null) {
            xt0 xt0VarX = zt0.x();
            this.f = xt0VarX;
            xt0VarX.g = xt0VarX;
            xt0VarX.f = xt0VarX;
            return xt0VarX;
        }
        xt0 xt0Var2 = xt0Var.g;
        if (xt0Var2.c + i <= 8192 && xt0Var2.e) {
            return xt0Var2;
        }
        xt0 xt0VarX2 = zt0.x();
        xt0Var2.b(xt0VarX2);
        return xt0VarX2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void k(ac acVar, long j) {
        xt0 xt0VarX;
        if (acVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        j41.a(acVar.g, 0L, j);
        while (j > 0) {
            xt0 xt0Var = acVar.f;
            int i = xt0Var.c - xt0Var.b;
            if (j < i) {
                xt0 xt0Var2 = this.f;
                xt0 xt0Var3 = xt0Var2 != null ? xt0Var2.g : null;
                if (xt0Var3 != null && xt0Var3.e) {
                    if ((xt0Var3.c + j) - (xt0Var3.d ? 0 : xt0Var3.b) <= 8192) {
                        xt0Var.d(xt0Var3, (int) j);
                        acVar.g -= j;
                        this.g += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException();
                }
                if (i2 >= 1024) {
                    xt0VarX = xt0Var.c();
                } else {
                    xt0VarX = zt0.x();
                    System.arraycopy(xt0Var.a, xt0Var.b, xt0VarX.a, 0, i2);
                }
                xt0VarX.c = xt0VarX.b + i2;
                xt0Var.b += i2;
                xt0Var.g.b(xt0VarX);
                acVar.f = xt0VarX;
            }
            xt0 xt0Var4 = acVar.f;
            long j2 = xt0Var4.c - xt0Var4.b;
            acVar.f = xt0Var4.a();
            xt0 xt0Var5 = this.f;
            if (xt0Var5 == null) {
                this.f = xt0Var4;
                xt0Var4.g = xt0Var4;
                xt0Var4.f = xt0Var4;
            } else {
                xt0Var5.g.b(xt0Var4);
                xt0 xt0Var6 = xt0Var4.g;
                if (xt0Var6 == xt0Var4) {
                    throw new IllegalStateException();
                }
                if (xt0Var6.e) {
                    int i3 = xt0Var4.c - xt0Var4.b;
                    if (i3 <= (8192 - xt0Var6.c) + (xt0Var6.d ? 0 : xt0Var6.b)) {
                        xt0Var4.d(xt0Var6, i3);
                        xt0Var4.a();
                        zt0.r(xt0Var4);
                    }
                }
            }
            acVar.g -= j2;
            this.g += j2;
            j -= j2;
        }
    }

    public final void l(int i) {
        xt0 xt0VarI = i(1);
        byte[] bArr = xt0VarI.a;
        int i2 = xt0VarI.c;
        xt0VarI.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.g++;
    }

    public final void m(int i) {
        xt0 xt0VarI = i(4);
        byte[] bArr = xt0VarI.a;
        int i2 = xt0VarI.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        xt0VarI.c = i2 + 4;
        this.g += 4;
    }

    public final void n(String str, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(ex0.f("beginIndex < 0: ", i));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                xt0 xt0VarI = i(1);
                byte[] bArr = xt0VarI.a;
                int i3 = xt0VarI.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt;
                while (i4 < iMin) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) cCharAt2;
                    i4++;
                }
                int i5 = xt0VarI.c;
                int i6 = (i3 + i4) - i5;
                xt0VarI.c = i5 + i6;
                this.g += i6;
                i = i4;
            } else {
                if (cCharAt < 2048) {
                    l((cCharAt >> 6) | 192);
                    l((cCharAt & '?') | 128);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    l((cCharAt >> '\f') | 224);
                    l(((cCharAt >> 6) & 63) | 128);
                    l((cCharAt & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        l(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        l((i8 >> 18) | 240);
                        l(((i8 >> 12) & 63) | 128);
                        l(((i8 >> 6) & 63) | 128);
                        l((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        j41.a(bArr.length, i, i2);
        xt0 xt0Var = this.f;
        if (xt0Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, xt0Var.c - xt0Var.b);
        System.arraycopy(xt0Var.a, xt0Var.b, bArr, i, iMin);
        int i3 = xt0Var.b + iMin;
        xt0Var.b = i3;
        this.g -= iMin;
        if (i3 == xt0Var.c) {
            this.f = xt0Var.a();
            zt0.r(xt0Var);
        }
        return iMin;
    }

    public final String toString() {
        long j = this.g;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? jc.j : new au0(this, i)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.g);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            xt0 xt0VarI = i(1);
            int iMin = Math.min(i, 8192 - xt0VarI.c);
            byteBuffer.get(xt0VarI.a, xt0VarI.c, iMin);
            i -= iMin;
            xt0VarI.c += iMin;
        }
        this.g += iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        xt0 xt0Var = this.f;
        if (xt0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), xt0Var.c - xt0Var.b);
        byteBuffer.put(xt0Var.a, xt0Var.b, iMin);
        int i = xt0Var.b + iMin;
        xt0Var.b = i;
        this.g -= iMin;
        if (i == xt0Var.c) {
            this.f = xt0Var.a();
            zt0.r(xt0Var);
        }
        return iMin;
    }

    @Override // defpackage.ec
    public final ac b() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
