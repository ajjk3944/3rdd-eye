package com.bytedance.sdk.component.ypw.emc.ypw;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.xbill.DNS.TTL;

/* loaded from: classes.dex */
public final class emc implements xq, ypw, Cloneable, ByteChannel {
    private static final byte[] xq = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    bw emc;
    long ypw;

    public final dg bw() {
        long j10 = this.ypw;
        if (j10 <= TTL.MAX_VALUE) {
            return dg((int) j10);
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
        long j10 = this.ypw;
        if (j10 != emcVar.ypw) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        bw bwVar = this.emc;
        bw bwVar2 = emcVar.emc;
        int i10 = bwVar.ypw;
        int i11 = bwVar2.ypw;
        while (j11 < this.ypw) {
            long jMin = Math.min(bwVar.xq - i10, bwVar2.xq - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (bwVar.emc[i10] != bwVar2.emc[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == bwVar.xq) {
                bwVar = bwVar.ycc;
                i10 = bwVar.ypw;
            }
            if (i11 == bwVar2.xq) {
                bwVar2 = bwVar2.ycc;
                i11 = bwVar2.ypw;
            }
            j11 += jMin;
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
        int i10 = 1;
        do {
            int i11 = bwVar.xq;
            for (int i12 = bwVar.ypw; i12 < i11; i12++) {
                i10 = (i10 * 31) + bwVar.emc[i12];
            }
            bwVar = bwVar.ycc;
        } while (bwVar != this.emc);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        bw bwVar = this.emc;
        if (bwVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), bwVar.xq - bwVar.ypw);
        byteBuffer.put(bwVar.emc, bwVar.ypw, iMin);
        int i10 = bwVar.ypw + iMin;
        bwVar.ypw = i10;
        this.ypw -= iMin;
        if (i10 == bwVar.xq) {
            this.emc = bwVar.ypw();
            ycc.emc(bwVar);
        }
        return iMin;
    }

    public String toString() {
        return bw().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            bw bwVarXq = xq(1);
            int iMin = Math.min(i10, 8192 - bwVarXq.xq);
            byteBuffer.get(bwVarXq.emc, bwVarXq.xq, iMin);
            i10 -= iMin;
            bwVarXq.xq += iMin;
        }
        this.ypw += iRemaining;
        return iRemaining;
    }

    public String xq() {
        try {
            return emc(this.ypw, zz.emc);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public byte ypw() {
        long j10 = this.ypw;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        bw bwVar = this.emc;
        int i10 = bwVar.ypw;
        int i11 = bwVar.xq;
        int i12 = i10 + 1;
        byte b10 = bwVar.emc[i10];
        this.ypw = j10 - 1;
        if (i12 != i11) {
            bwVar.ypw = i12;
            return b10;
        }
        this.emc = bwVar.ypw();
        ycc.emc(bwVar);
        return b10;
    }

    public String emc(long j10, Charset charset) throws EOFException {
        zz.emc(this.ypw, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > TTL.MAX_VALUE) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
        }
        if (j10 == 0) {
            return "";
        }
        bw bwVar = this.emc;
        int i10 = bwVar.ypw;
        if (i10 + j10 > bwVar.xq) {
            return new String(emc(j10), charset);
        }
        String str = new String(bwVar.emc, i10, (int) j10, charset);
        int i11 = (int) (bwVar.ypw + j10);
        bwVar.ypw = i11;
        this.ypw -= j10;
        if (i11 == bwVar.xq) {
            this.emc = bwVar.ypw();
            ycc.emc(bwVar);
        }
        return str;
    }

    public bw xq(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            bw bwVar = this.emc;
            if (bwVar == null) {
                bw bwVarEmc = ycc.emc();
                this.emc = bwVarEmc;
                bwVarEmc.uym = bwVarEmc;
                bwVarEmc.ycc = bwVarEmc;
                return bwVarEmc;
            }
            bw bwVar2 = bwVar.uym;
            return (bwVar2.xq + i10 > 8192 || !bwVar2.bw) ? bwVar2.emc(ycc.emc()) : bwVar2;
        }
        throw new IllegalArgumentException();
    }

    public final dg dg(int i10) {
        if (i10 == 0) {
            return dg.xq;
        }
        return new uym(this, i10);
    }

    public emc ypw(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            zz.emc(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                bw bwVarXq = xq(1);
                int iMin = Math.min(i12 - i10, 8192 - bwVarXq.xq);
                System.arraycopy(bArr, i10, bwVarXq.emc, bwVarXq.xq, iMin);
                i10 += iMin;
                bwVarXq.xq += iMin;
            }
            this.ypw += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] emc(long j10) throws EOFException {
        zz.emc(this.ypw, 0L, j10);
        if (j10 <= TTL.MAX_VALUE) {
            byte[] bArr = new byte[(int) j10];
            emc(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
    }

    public void emc(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int iEmc = emc(bArr, i10, bArr.length - i10);
            if (iEmc == -1) {
                throw new EOFException();
            }
            i10 += iEmc;
        }
    }

    public emc ypw(int i10) {
        bw bwVarXq = xq(1);
        byte[] bArr = bwVarXq.emc;
        int i11 = bwVarXq.xq;
        bwVarXq.xq = i11 + 1;
        bArr[i11] = (byte) i10;
        this.ypw++;
        return this;
    }

    public int emc(byte[] bArr, int i10, int i11) {
        zz.emc(bArr.length, i10, i11);
        bw bwVar = this.emc;
        if (bwVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, bwVar.xq - bwVar.ypw);
        System.arraycopy(bwVar.emc, bwVar.ypw, bArr, i10, iMin);
        int i12 = bwVar.ypw + iMin;
        bwVar.ypw = i12;
        this.ypw -= iMin;
        if (i12 == bwVar.xq) {
            this.emc = bwVar.ypw();
            ycc.emc(bwVar);
        }
        return iMin;
    }

    public emc ypw(long j10) {
        if (j10 == 0) {
            return ypw(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        bw bwVarXq = xq(iNumberOfTrailingZeros);
        byte[] bArr = bwVarXq.emc;
        int i10 = bwVarXq.xq;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = xq[(int) (15 & j10)];
            j10 >>>= 4;
        }
        bwVarXq.xq += iNumberOfTrailingZeros;
        this.ypw += iNumberOfTrailingZeros;
        return this;
    }

    public emc emc(String str) {
        return emc(str, 0, str.length());
    }

    public emc emc(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    bw bwVarXq = xq(1);
                    byte[] bArr = bwVarXq.emc;
                    int i12 = bwVarXq.xq - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = bwVarXq.xq;
                    int i15 = (i12 + i10) - i14;
                    bwVarXq.xq = i14 + i15;
                    this.ypw += i15;
                } else {
                    if (cCharAt2 < 2048) {
                        ypw((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        ypw((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            ypw((i17 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            ypw(((i17 >> 12) & 63) | 128);
                            ypw(((i17 >> 6) & 63) | 128);
                            ypw((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            ypw(63);
                            i10 = i16;
                        }
                    } else {
                        ypw((cCharAt2 >> '\f') | 224);
                        ypw(((cCharAt2 >> 6) & 63) | 128);
                        ypw((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    public emc emc(int i10) {
        if (i10 < 128) {
            ypw(i10);
            return this;
        }
        if (i10 < 2048) {
            ypw((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            ypw((i10 & 63) | 128);
            return this;
        }
        if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                ypw(63);
                return this;
            }
            ypw((i10 >> 12) | 224);
            ypw(((i10 >> 6) & 63) | 128);
            ypw((i10 & 63) | 128);
            return this;
        }
        if (i10 <= 1114111) {
            ypw((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            ypw(((i10 >> 12) & 63) | 128);
            ypw(((i10 >> 6) & 63) | 128);
            ypw((i10 & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
    }

    public emc emc(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            if (charset != null) {
                if (charset.equals(zz.emc)) {
                    return emc(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return ypw(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }
}
