package com.bytedance.sdk.component.vt.ouw.vt;

import a0.g;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements lh, vt, Cloneable, ByteChannel {
    static final byte[] ouw = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: lh, reason: collision with root package name */
    long f7671lh;
    fkw vt;

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        ouw ouwVar = new ouw();
        if (this.f7671lh == 0) {
            return ouwVar;
        }
        fkw fkwVarOuw = this.vt.ouw();
        ouwVar.vt = fkwVarOuw;
        fkwVarOuw.ra = fkwVarOuw;
        fkwVarOuw.f7669le = fkwVarOuw;
        fkw fkwVar = this.vt;
        while (true) {
            fkwVar = fkwVar.f7669le;
            if (fkwVar == this.vt) {
                ouwVar.f7671lh = this.f7671lh;
                return ouwVar;
            }
            ouwVar.vt.ra.ouw(fkwVar.ouw());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouw)) {
            return false;
        }
        ouw ouwVar = (ouw) obj;
        long j = this.f7671lh;
        if (j != ouwVar.f7671lh) {
            return false;
        }
        long j8 = 0;
        if (j == 0) {
            return true;
        }
        fkw fkwVar = this.vt;
        fkw fkwVar2 = ouwVar.vt;
        int i4 = fkwVar.vt;
        int i10 = fkwVar2.vt;
        while (j8 < this.f7671lh) {
            long jMin = Math.min(fkwVar.f7670lh - i4, fkwVar2.f7670lh - i10);
            int i11 = 0;
            while (i11 < jMin) {
                int i12 = i4 + 1;
                int i13 = i10 + 1;
                if (fkwVar.ouw[i4] != fkwVar2.ouw[i10]) {
                    return false;
                }
                i11++;
                i4 = i12;
                i10 = i13;
            }
            if (i4 == fkwVar.f7670lh) {
                fkwVar = fkwVar.f7669le;
                i4 = fkwVar.vt;
            }
            if (i10 == fkwVar2.f7670lh) {
                fkwVar2 = fkwVar2.f7669le;
                i10 = fkwVar2.vt;
            }
            j8 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        fkw fkwVar = this.vt;
        if (fkwVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i10 = fkwVar.f7670lh;
            for (int i11 = fkwVar.vt; i11 < i10; i11++) {
                i4 = (i4 * 31) + fkwVar.ouw[i11];
            }
            fkwVar = fkwVar.f7669le;
        } while (fkwVar != this.vt);
        return i4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final String lh() {
        try {
            long j = this.f7671lh;
            Charset charset = bly.ouw;
            bly.ouw(j, 0L, j);
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
            }
            if (j == 0) {
                return "";
            }
            fkw fkwVar = this.vt;
            int i4 = fkwVar.vt;
            if (i4 + j > fkwVar.f7670lh) {
                bly.ouw(this.f7671lh, 0L, j);
                if (j > 2147483647L) {
                    throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
                }
                byte[] bArr = new byte[(int) j];
                ouw(bArr);
                return new String(bArr, charset);
            }
            String str = new String(fkwVar.ouw, i4, (int) j, charset);
            int i10 = (int) (fkwVar.vt + j);
            fkwVar.vt = i10;
            this.f7671lh -= j;
            if (i10 == fkwVar.f7670lh) {
                this.vt = fkwVar.vt();
                le.ouw(fkwVar);
            }
            return str;
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean ouw() {
        return this.f7671lh == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        fkw fkwVar = this.vt;
        if (fkwVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), fkwVar.f7670lh - fkwVar.vt);
        byteBuffer.put(fkwVar.ouw, fkwVar.vt, iMin);
        int i4 = fkwVar.vt + iMin;
        fkwVar.vt = i4;
        this.f7671lh -= iMin;
        if (i4 == fkwVar.f7670lh) {
            this.vt = fkwVar.vt();
            le.ouw(fkwVar);
        }
        return iMin;
    }

    public final String toString() {
        long j = this.f7671lh;
        if (j <= 2147483647L) {
            int i4 = (int) j;
            return (i4 == 0 ? yu.f7672lh : new ra(this, i4)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f7671lh);
    }

    public final byte vt() {
        long j = this.f7671lh;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        fkw fkwVar = this.vt;
        int i4 = fkwVar.vt;
        int i10 = fkwVar.f7670lh;
        int i11 = i4 + 1;
        byte b10 = fkwVar.ouw[i4];
        this.f7671lh = j - 1;
        if (i11 != i10) {
            fkwVar.vt = i11;
            return b10;
        }
        this.vt = fkwVar.vt();
        le.ouw(fkwVar);
        return b10;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i4 = iRemaining;
        while (i4 > 0) {
            fkw fkwVarLh = lh(1);
            int iMin = Math.min(i4, 8192 - fkwVarLh.f7670lh);
            byteBuffer.get(fkwVarLh.ouw, fkwVarLh.f7670lh, iMin);
            i4 -= iMin;
            fkwVarLh.f7670lh += iMin;
        }
        this.f7671lh += iRemaining;
        return iRemaining;
    }

    private void ouw(byte[] bArr) throws EOFException {
        int iMin;
        int i4 = 0;
        while (i4 < bArr.length) {
            int length = bArr.length - i4;
            bly.ouw(bArr.length, i4, length);
            fkw fkwVar = this.vt;
            if (fkwVar == null) {
                iMin = -1;
            } else {
                iMin = Math.min(length, fkwVar.f7670lh - fkwVar.vt);
                System.arraycopy(fkwVar.ouw, fkwVar.vt, bArr, i4, iMin);
                int i10 = fkwVar.vt + iMin;
                fkwVar.vt = i10;
                this.f7671lh -= iMin;
                if (i10 == fkwVar.f7670lh) {
                    this.vt = fkwVar.vt();
                    le.ouw(fkwVar);
                }
            }
            if (iMin == -1) {
                throw new EOFException();
            }
            i4 += iMin;
        }
    }

    public final ouw vt(int i4) {
        fkw fkwVarLh = lh(1);
        byte[] bArr = fkwVarLh.ouw;
        int i10 = fkwVarLh.f7670lh;
        fkwVarLh.f7670lh = i10 + 1;
        bArr[i10] = (byte) i4;
        this.f7671lh++;
        return this;
    }

    public final ouw ouw(String str) {
        return ouw(str, 0, str.length());
    }

    public final ouw ouw(String str, int i4, int i10) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i4)));
        }
        if (i10 >= i4) {
            if (i10 > str.length()) {
                StringBuilder sbW = u.w(i10, "endIndex > string.length: ", " > ");
                sbW.append(str.length());
                throw new IllegalArgumentException(sbW.toString());
            }
            while (i4 < i10) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128) {
                    fkw fkwVarLh = lh(1);
                    byte[] bArr = fkwVarLh.ouw;
                    int i11 = fkwVarLh.f7670lh - i4;
                    int iMin = Math.min(i10, 8192 - i11);
                    int i12 = i4 + 1;
                    bArr[i4 + i11] = (byte) cCharAt2;
                    while (true) {
                        i4 = i12;
                        if (i4 >= iMin || (cCharAt = str.charAt(i4)) >= 128) {
                            break;
                        }
                        i12 = i4 + 1;
                        bArr[i4 + i11] = (byte) cCharAt;
                    }
                    int i13 = fkwVarLh.f7670lh;
                    int i14 = (i11 + i4) - i13;
                    fkwVarLh.f7670lh = i13 + i14;
                    this.f7671lh += i14;
                } else {
                    if (cCharAt2 < 2048) {
                        vt((cCharAt2 >> 6) | 192);
                        vt((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i15 = i4 + 1;
                        char cCharAt3 = i15 < i10 ? str.charAt(i15) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i16 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            vt((i16 >> 18) | 240);
                            vt(((i16 >> 12) & 63) | 128);
                            vt(((i16 >> 6) & 63) | 128);
                            vt((i16 & 63) | 128);
                            i4 += 2;
                        } else {
                            vt(63);
                            i4 = i15;
                        }
                    } else {
                        vt((cCharAt2 >> '\f') | 224);
                        vt(((cCharAt2 >> 6) & 63) | 128);
                        vt((cCharAt2 & '?') | 128);
                    }
                    i4++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(g.i(i10, i4, "endIndex < beginIndex: ", " < "));
    }

    public final fkw lh(int i4) {
        if (i4 > 0 && i4 <= 8192) {
            fkw fkwVar = this.vt;
            if (fkwVar == null) {
                fkw fkwVarOuw = le.ouw();
                this.vt = fkwVarOuw;
                fkwVarOuw.ra = fkwVarOuw;
                fkwVarOuw.f7669le = fkwVarOuw;
                return fkwVarOuw;
            }
            fkw fkwVar2 = fkwVar.ra;
            return (fkwVar2.f7670lh + i4 > 8192 || !fkwVar2.fkw) ? fkwVar2.ouw(le.ouw()) : fkwVar2;
        }
        throw new IllegalArgumentException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    public final ouw ouw(int i4) {
        if (i4 < 128) {
            vt(i4);
            return this;
        }
        if (i4 < 2048) {
            vt((i4 >> 6) | 192);
            vt((i4 & 63) | 128);
            return this;
        }
        if (i4 < 65536) {
            if (i4 >= 55296 && i4 <= 57343) {
                vt(63);
                return this;
            }
            vt((i4 >> 12) | 224);
            vt(((i4 >> 6) & 63) | 128);
            vt((i4 & 63) | 128);
            return this;
        }
        if (i4 <= 1114111) {
            vt((i4 >> 18) | 240);
            vt(((i4 >> 12) & 63) | 128);
            vt(((i4 >> 6) & 63) | 128);
            vt((i4 & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i4));
    }

    public final ouw ouw(String str, int i4, int i10, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i4 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i4)));
        }
        if (i10 >= i4) {
            if (i10 > str.length()) {
                StringBuilder sbW = u.w(i10, "endIndex > string.length: ", " > ");
                sbW.append(str.length());
                throw new IllegalArgumentException(sbW.toString());
            }
            if (charset != null) {
                if (charset.equals(bly.ouw)) {
                    return ouw(str, i4, i10);
                }
                byte[] bytes = str.substring(i4, i10).getBytes(charset);
                return ouw(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(g.i(i10, i4, "endIndex < beginIndex: ", " < "));
    }

    private ouw ouw(byte[] bArr, int i4, int i10) {
        if (bArr != null) {
            long j = i10;
            bly.ouw(bArr.length, 0L, j);
            while (i4 < i10) {
                fkw fkwVarLh = lh(1);
                int iMin = Math.min(i10 - i4, 8192 - fkwVarLh.f7670lh);
                System.arraycopy(bArr, i4, fkwVarLh.ouw, fkwVarLh.f7670lh, iMin);
                i4 += iMin;
                fkwVarLh.f7670lh += iMin;
            }
            this.f7671lh += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }
}
