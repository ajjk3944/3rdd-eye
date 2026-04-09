package com.bytedance.sdk.component.ypw.emc.ypw;

import A.f;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class emc implements xq, ypw, Cloneable, ByteChannel {
    private static final byte[] xq = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    bw emc;
    long ypw;

    public final dg bw() {
        long j6 = this.ypw;
        if (j6 <= 2147483647L) {
            return dg((int) j6);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.ypw);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public emc clone() {
        emc emcVar = new emc();
        if (this.ypw == 0) {
            return emcVar;
        }
        bw bwVarEmc = this.emc.emc();
        emcVar.emc = bwVarEmc;
        bwVarEmc.uym = bwVarEmc;
        bwVarEmc.ycc = bwVarEmc;
        bw bwVar = this.emc;
        while (true) {
            bwVar = bwVar.ycc;
            if (bwVar == this.emc) {
                emcVar.ypw = this.ypw;
                return emcVar;
            }
            emcVar.emc.uym.emc(bwVar.emc());
        }
    }

    public boolean emc() {
        return this.ypw == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emc)) {
            return false;
        }
        emc emcVar = (emc) obj;
        long j6 = this.ypw;
        if (j6 != emcVar.ypw) {
            return false;
        }
        long j7 = 0;
        if (j6 == 0) {
            return true;
        }
        bw bwVar = this.emc;
        bw bwVar2 = emcVar.emc;
        int i = bwVar.ypw;
        int i3 = bwVar2.ypw;
        while (j7 < this.ypw) {
            long jMin = Math.min(bwVar.xq - i, bwVar2.xq - i3);
            int i6 = 0;
            while (i6 < jMin) {
                int i7 = i + 1;
                int i8 = i3 + 1;
                if (bwVar.emc[i] != bwVar2.emc[i3]) {
                    return false;
                }
                i6++;
                i = i7;
                i3 = i8;
            }
            if (i == bwVar.xq) {
                bwVar = bwVar.ycc;
                i = bwVar.ypw;
            }
            if (i3 == bwVar2.xq) {
                bwVar2 = bwVar2.ycc;
                i3 = bwVar2.ypw;
            }
            j7 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        bw bwVar = this.emc;
        if (bwVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i3 = bwVar.xq;
            for (int i6 = bwVar.ypw; i6 < i3; i6++) {
                i = (i * 31) + bwVar.emc[i6];
            }
            bwVar = bwVar.ycc;
        } while (bwVar != this.emc);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        bw bwVar = this.emc;
        if (bwVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), bwVar.xq - bwVar.ypw);
        byteBuffer.put(bwVar.emc, bwVar.ypw, iMin);
        int i = bwVar.ypw + iMin;
        bwVar.ypw = i;
        this.ypw -= iMin;
        if (i == bwVar.xq) {
            this.emc = bwVar.ypw();
            ycc.emc(bwVar);
        }
        return iMin;
    }

    public String toString() {
        return bw().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            bw bwVarXq = xq(1);
            int iMin = Math.min(i, 8192 - bwVarXq.xq);
            byteBuffer.get(bwVarXq.emc, bwVarXq.xq, iMin);
            i -= iMin;
            bwVarXq.xq += iMin;
        }
        this.ypw += iRemaining;
        return iRemaining;
    }

    public String xq() {
        try {
            return emc(this.ypw, zz.emc);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    public byte ypw() {
        long j6 = this.ypw;
        if (j6 == 0) {
            throw new IllegalStateException("size == 0");
        }
        bw bwVar = this.emc;
        int i = bwVar.ypw;
        int i3 = bwVar.xq;
        int i6 = i + 1;
        byte b5 = bwVar.emc[i];
        this.ypw = j6 - 1;
        if (i6 != i3) {
            bwVar.ypw = i6;
            return b5;
        }
        this.emc = bwVar.ypw();
        ycc.emc(bwVar);
        return b5;
    }

    public String emc(long j6, Charset charset) {
        zz.emc(this.ypw, 0L, j6);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j6 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j6)));
        }
        if (j6 == 0) {
            return "";
        }
        bw bwVar = this.emc;
        int i = bwVar.ypw;
        if (i + j6 > bwVar.xq) {
            return new String(emc(j6), charset);
        }
        String str = new String(bwVar.emc, i, (int) j6, charset);
        int i3 = (int) (bwVar.ypw + j6);
        bwVar.ypw = i3;
        this.ypw -= j6;
        if (i3 == bwVar.xq) {
            this.emc = bwVar.ypw();
            ycc.emc(bwVar);
        }
        return str;
    }

    public bw xq(int i) {
        if (i > 0 && i <= 8192) {
            bw bwVar = this.emc;
            if (bwVar == null) {
                bw bwVarEmc = ycc.emc();
                this.emc = bwVarEmc;
                bwVarEmc.uym = bwVarEmc;
                bwVarEmc.ycc = bwVarEmc;
                return bwVarEmc;
            }
            bw bwVar2 = bwVar.uym;
            return (bwVar2.xq + i > 8192 || !bwVar2.bw) ? bwVar2.emc(ycc.emc()) : bwVar2;
        }
        throw new IllegalArgumentException();
    }

    public final dg dg(int i) {
        if (i == 0) {
            return dg.xq;
        }
        return new uym(this, i);
    }

    public emc ypw(byte[] bArr, int i, int i3) {
        if (bArr != null) {
            long j6 = i3;
            zz.emc(bArr.length, i, j6);
            int i6 = i3 + i;
            while (i < i6) {
                bw bwVarXq = xq(1);
                int iMin = Math.min(i6 - i, 8192 - bwVarXq.xq);
                System.arraycopy(bArr, i, bwVarXq.emc, bwVarXq.xq, iMin);
                i += iMin;
                bwVarXq.xq += iMin;
            }
            this.ypw += j6;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] emc(long j6) throws EOFException {
        zz.emc(this.ypw, 0L, j6);
        if (j6 <= 2147483647L) {
            byte[] bArr = new byte[(int) j6];
            emc(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j6)));
    }

    public void emc(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iEmc = emc(bArr, i, bArr.length - i);
            if (iEmc == -1) {
                throw new EOFException();
            }
            i += iEmc;
        }
    }

    public emc ypw(int i) {
        bw bwVarXq = xq(1);
        byte[] bArr = bwVarXq.emc;
        int i3 = bwVarXq.xq;
        bwVarXq.xq = i3 + 1;
        bArr[i3] = (byte) i;
        this.ypw++;
        return this;
    }

    public int emc(byte[] bArr, int i, int i3) {
        zz.emc(bArr.length, i, i3);
        bw bwVar = this.emc;
        if (bwVar == null) {
            return -1;
        }
        int iMin = Math.min(i3, bwVar.xq - bwVar.ypw);
        System.arraycopy(bwVar.emc, bwVar.ypw, bArr, i, iMin);
        int i6 = bwVar.ypw + iMin;
        bwVar.ypw = i6;
        this.ypw -= iMin;
        if (i6 == bwVar.xq) {
            this.emc = bwVar.ypw();
            ycc.emc(bwVar);
        }
        return iMin;
    }

    public emc ypw(long j6) {
        if (j6 == 0) {
            return ypw(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j6)) / 4) + 1;
        bw bwVarXq = xq(iNumberOfTrailingZeros);
        byte[] bArr = bwVarXq.emc;
        int i = bwVarXq.xq;
        for (int i3 = (i + iNumberOfTrailingZeros) - 1; i3 >= i; i3--) {
            bArr[i3] = xq[(int) (15 & j6)];
            j6 >>>= 4;
        }
        bwVarXq.xq += iNumberOfTrailingZeros;
        this.ypw += iNumberOfTrailingZeros;
        return this;
    }

    public emc emc(String str) {
        return emc(str, 0, str.length());
    }

    public emc emc(String str, int i, int i3) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i3 >= i) {
            if (i3 > str.length()) {
                StringBuilder sbP = AbstractC1135f5.p(i3, "endIndex > string.length: ", " > ");
                sbP.append(str.length());
                throw new IllegalArgumentException(sbP.toString());
            }
            while (i < i3) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 < 128) {
                    bw bwVarXq = xq(1);
                    byte[] bArr = bwVarXq.emc;
                    int i6 = bwVarXq.xq - i;
                    int iMin = Math.min(i3, 8192 - i6);
                    int i7 = i + 1;
                    bArr[i + i6] = (byte) cCharAt2;
                    while (true) {
                        i = i7;
                        if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i7 = i + 1;
                        bArr[i + i6] = (byte) cCharAt;
                    }
                    int i8 = bwVarXq.xq;
                    int i9 = (i6 + i) - i8;
                    bwVarXq.xq = i8 + i9;
                    this.ypw += i9;
                } else {
                    if (cCharAt2 < 2048) {
                        ypw((cCharAt2 >> 6) | 192);
                        ypw((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i10 = i + 1;
                        char cCharAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i11 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            ypw((i11 >> 18) | 240);
                            ypw(((i11 >> 12) & 63) | 128);
                            ypw(((i11 >> 6) & 63) | 128);
                            ypw((i11 & 63) | 128);
                            i += 2;
                        } else {
                            ypw(63);
                            i = i10;
                        }
                    } else {
                        ypw((cCharAt2 >> '\f') | 224);
                        ypw(((cCharAt2 >> 6) & 63) | 128);
                        ypw((cCharAt2 & '?') | 128);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(f.g(i3, i, "endIndex < beginIndex: ", " < "));
    }

    public emc emc(int i) {
        if (i < 128) {
            ypw(i);
            return this;
        }
        if (i < 2048) {
            ypw((i >> 6) | 192);
            ypw((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                ypw(63);
                return this;
            }
            ypw((i >> 12) | 224);
            ypw(((i >> 6) & 63) | 128);
            ypw((i & 63) | 128);
            return this;
        }
        if (i <= 1114111) {
            ypw((i >> 18) | 240);
            ypw(((i >> 12) & 63) | 128);
            ypw(((i >> 6) & 63) | 128);
            ypw((i & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
    }

    public emc emc(String str, int i, int i3, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i3 >= i) {
            if (i3 > str.length()) {
                StringBuilder sbP = AbstractC1135f5.p(i3, "endIndex > string.length: ", " > ");
                sbP.append(str.length());
                throw new IllegalArgumentException(sbP.toString());
            }
            if (charset != null) {
                if (charset.equals(zz.emc)) {
                    return emc(str, i, i3);
                }
                byte[] bytes = str.substring(i, i3).getBytes(charset);
                return ypw(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(f.g(i3, i, "endIndex < beginIndex: ", " < "));
    }
}
