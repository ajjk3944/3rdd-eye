package f5;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public int f8582a;

    /* renamed from: b, reason: collision with root package name */
    public int f8583b;

    /* renamed from: c, reason: collision with root package name */
    public int f8584c;

    /* renamed from: d, reason: collision with root package name */
    public int f8585d;

    /* renamed from: e, reason: collision with root package name */
    public int f8586e;

    /* renamed from: f, reason: collision with root package name */
    public int f8587f;

    /* renamed from: g, reason: collision with root package name */
    public int f8588g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8589h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8590i;

    public u(InputStream inputStream) {
        this.f8587f = Integer.MAX_VALUE;
        this.f8589h = new byte[4096];
        this.f8582a = 0;
        this.f8584c = 0;
        this.f8586e = 0;
        this.f8590i = inputStream;
    }

    public static AudioAttributes f(androidx.media3.common.f fVar, boolean z10) {
        return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) fVar.a().f2481d;
    }

    public AudioTrack a(boolean z10, androidx.media3.common.f fVar, int i10) {
        int i11 = this.f8583b;
        try {
            AudioTrack audioTrackD = d(z10, fVar, i10);
            int state = audioTrackD.getState();
            if (state == 1) {
                return audioTrackD;
            }
            try {
                audioTrackD.release();
            } catch (Exception unused) {
            }
            throw new j(state, this.f8585d, this.f8586e, this.f8588g, (androidx.media3.common.r) this.f8589h, i11 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e4) {
            throw new j(0, this.f8585d, this.f8586e, this.f8588g, (androidx.media3.common.r) this.f8589h, i11 == 1, e4);
        }
    }

    public AudioTrack b(boolean z10, y9.b bVar, int i10) {
        int i11 = this.f8583b;
        try {
            AudioTrack audioTrackE = e(z10, bVar, i10);
            int state = audioTrackE.getState();
            if (state == 1) {
                return audioTrackE;
            }
            try {
                audioTrackE.release();
            } catch (Exception unused) {
            }
            throw new y9.l(state, this.f8585d, this.f8586e, this.f8588g, (Format) this.f8589h, i11 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e4) {
            throw new y9.l(0, this.f8585d, this.f8586e, this.f8588g, (Format) this.f8589h, i11 == 1, e4);
        }
    }

    public void c(int i10) throws rs.t {
        if (this.f8585d != i10) {
            throw new rs.t("Protocol message end-group tag did not match expected tag.");
        }
    }

    public AudioTrack d(boolean z10, androidx.media3.common.f fVar, int i10) {
        int i11 = this.f8587f;
        int i12 = this.f8586e;
        int i13 = this.f8585d;
        int i14 = a5.d0.f105a;
        if (i14 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(f(fVar, z10)).setAudioFormat(z.e(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(this.f8588g).setSessionId(i10).setOffloadedPlayback(this.f8583b == 1).build();
        }
        if (i14 >= 21) {
            return new AudioTrack(f(fVar, z10), z.e(i13, i12, i11), this.f8588g, 1, i10);
        }
        int iY = a5.d0.y(fVar.f1621g);
        return i10 == 0 ? new AudioTrack(iY, this.f8585d, this.f8586e, this.f8587f, this.f8588g, 1) : new AudioTrack(iY, this.f8585d, this.f8586e, this.f8587f, this.f8588g, 1, i10);
    }

    public AudioTrack e(boolean z10, y9.b bVar, int i10) {
        int i11 = this.f8587f;
        int i12 = this.f8586e;
        int i13 = this.f8585d;
        int i14 = qb.v.f20828a;
        if (i14 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : bVar.a()).setAudioFormat(y9.s.e(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(this.f8588g).setSessionId(i10).setOffloadedPlayback(this.f8583b == 1).build();
        }
        if (i14 >= 21) {
            return new AudioTrack(z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : bVar.a(), y9.s.e(i13, i12, i11), this.f8588g, 1, i10);
        }
        bVar.getClass();
        return i10 == 0 ? new AudioTrack(3, this.f8585d, this.f8586e, this.f8587f, this.f8588g, 1) : new AudioTrack(3, this.f8585d, this.f8586e, this.f8587f, this.f8588g, 1, i10);
    }

    public int g() {
        int i10 = this.f8587f;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f8586e + this.f8584c);
    }

    public int h(long j) {
        int i10;
        int i11 = this.f8587f;
        switch (i11) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                i10 = 80000;
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                i10 = 768000;
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                i10 = 192000;
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                i10 = 2250000;
                break;
            case 9:
                i10 = 40000;
                break;
            case 10:
                i10 = 100000;
                break;
            case 11:
                i10 = 16000;
                break;
            case 12:
                i10 = 7000;
                break;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                i10 = 3062500;
                break;
            case 15:
                i10 = 8000;
                break;
            case 16:
                i10 = 256000;
                break;
            case 17:
                i10 = 336000;
                break;
        }
        if (i11 == 5) {
            i10 *= 2;
        }
        return (int) ((j * i10) / 1000000);
    }

    public void i(int i10) {
        this.f8587f = i10;
        u();
    }

    public int j(int i10) throws rs.t {
        if (i10 < 0) {
            throw new rs.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f8586e + this.f8584c + i10;
        int i12 = this.f8587f;
        if (i11 > i12) {
            throw rs.t.a();
        }
        this.f8587f = i11;
        u();
        return i12;
    }

    public rs.w k() {
        int iQ = q();
        int i10 = this.f8582a;
        int i11 = this.f8584c;
        if (iQ > i10 - i11 || iQ <= 0) {
            return iQ == 0 ? rs.e.f21745a : new rs.w(n(iQ));
        }
        byte[] bArr = new byte[iQ];
        System.arraycopy((byte[]) this.f8589h, i11, bArr, 0, iQ);
        rs.w wVar = new rs.w(bArr);
        this.f8584c += iQ;
        return wVar;
    }

    public int l() {
        return q();
    }

    public rs.b m(rs.y yVar, rs.g gVar) throws rs.t {
        int iQ = q();
        if (this.f8588g >= 64) {
            throw new rs.t("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iJ = j(iQ);
        this.f8588g++;
        rs.b bVar = (rs.b) yVar.a(this, gVar);
        c(0);
        this.f8588g--;
        i(iJ);
        return bVar;
    }

    public byte[] n(int i10) throws IOException {
        byte[] bArr = (byte[]) this.f8589h;
        if (i10 <= 0) {
            if (i10 == 0) {
                return rs.s.f21775a;
            }
            throw new rs.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f8586e;
        int i12 = this.f8584c;
        int i13 = i11 + i12 + i10;
        int i14 = this.f8587f;
        if (i13 > i14) {
            x((i14 - i11) - i12);
            throw rs.t.a();
        }
        if (i10 < 4096) {
            byte[] bArr2 = new byte[i10];
            int i15 = this.f8582a - i12;
            System.arraycopy(bArr, i12, bArr2, 0, i15);
            this.f8584c = this.f8582a;
            int i16 = i10 - i15;
            if (i16 > 0) {
                v(i16);
            }
            System.arraycopy(bArr, 0, bArr2, i15, i16);
            this.f8584c = i16;
            return bArr2;
        }
        int i17 = this.f8582a;
        this.f8586e = i11 + i17;
        this.f8584c = 0;
        this.f8582a = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr3 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                int i20 = ((InputStream) this.f8590i).read(bArr3, i19, iMin - i19);
                if (i20 == -1) {
                    throw rs.t.a();
                }
                this.f8586e += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i10];
        System.arraycopy(bArr, i12, bArr4, 0, length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public int o() throws rs.t {
        int i10 = this.f8584c;
        if (this.f8582a - i10 < 4) {
            v(4);
            i10 = this.f8584c;
        }
        byte[] bArr = (byte[]) this.f8589h;
        this.f8584c = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long p() throws rs.t {
        int i10 = this.f8584c;
        if (this.f8582a - i10 < 8) {
            v(8);
            i10 = this.f8584c;
        }
        byte[] bArr = (byte[]) this.f8589h;
        this.f8584c = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public int q() {
        int i10;
        int i11 = this.f8584c;
        int i12 = this.f8582a;
        if (i12 != i11) {
            byte[] bArr = (byte[]) this.f8589h;
            int i13 = i11 + 1;
            byte b2 = bArr[i11];
            if (b2 >= 0) {
                this.f8584c = i13;
                return b2;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b2;
                long j = i15;
                if (j < 0) {
                    i10 = (int) ((-128) ^ j);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j7 = i17;
                    if (j7 >= 0) {
                        i10 = (int) (16256 ^ j7);
                    } else {
                        int i18 = i11 + 4;
                        long j10 = i17 ^ (bArr[i16] << 21);
                        if (j10 < 0) {
                            i10 = (int) ((-2080896) ^ j10);
                        } else {
                            i16 = i11 + 5;
                            int i19 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i18] < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i20 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i20;
                                                    i10 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i19;
                            }
                            i10 = i19;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f8584c = i14;
                return i10;
            }
        }
        return (int) s();
    }

    public long r() {
        long j;
        long j7;
        long j10;
        int i10 = this.f8584c;
        int i11 = this.f8582a;
        if (i11 != i10) {
            byte[] bArr = (byte[]) this.f8589h;
            int i12 = i10 + 1;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f8584c = i12;
                return b2;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j11 = (bArr[i12] << 7) ^ b2;
                if (j11 >= 0) {
                    int i14 = i10 + 3;
                    long j12 = j11 ^ (bArr[i13] << 14);
                    if (j12 >= 0) {
                        j10 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j11 = j12 ^ (bArr[i14] << 21);
                        if (j11 < 0) {
                            j7 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j12 = j11 ^ (bArr[i13] << 28);
                            if (j12 >= 0) {
                                j10 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j11 = j12 ^ (bArr[i14] << 35);
                                if (j11 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j12 = j11 ^ (bArr[i13] << 42);
                                    if (j12 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j11 = j12 ^ (bArr[i14] << 49);
                                        if (j11 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j13 = (j11 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j13 >= 0) {
                                                j = j13;
                                                i13 = i14;
                                                this.f8584c = i13;
                                                return j;
                                            }
                                            i13 = i10 + 10;
                                            if (bArr[i14] >= 0) {
                                                j = j13;
                                                this.f8584c = i13;
                                                return j;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j = j12 ^ j10;
                    i13 = i14;
                    this.f8584c = i13;
                    return j;
                }
                j7 = -128;
                j = j11 ^ j7;
                this.f8584c = i13;
                return j;
            }
        }
        return s();
    }

    public long s() throws rs.t {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f8584c == this.f8582a) {
                v(1);
            }
            byte[] bArr = (byte[]) this.f8589h;
            int i11 = this.f8584c;
            this.f8584c = i11 + 1;
            j |= (r3 & 127) << i10;
            if ((bArr[i11] & 128) == 0) {
                return j;
            }
        }
        throw new rs.t("CodedInputStream encountered a malformed varint.");
    }

    public int t() throws rs.t {
        if (this.f8584c == this.f8582a && !y(1)) {
            this.f8585d = 0;
            return 0;
        }
        int iQ = q();
        this.f8585d = iQ;
        if ((iQ >>> 3) != 0) {
            return iQ;
        }
        throw new rs.t("Protocol message contained an invalid tag (zero).");
    }

    public void u() {
        int i10 = this.f8582a + this.f8583b;
        this.f8582a = i10;
        int i11 = this.f8586e + i10;
        int i12 = this.f8587f;
        if (i11 <= i12) {
            this.f8583b = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f8583b = i13;
        this.f8582a = i10 - i13;
    }

    public void v(int i10) throws rs.t {
        if (!y(i10)) {
            throw rs.t.a();
        }
    }

    public boolean w(int i10, b5.m mVar) throws IOException {
        int iT;
        int i11 = i10 & 7;
        if (i11 == 0) {
            long jR = r();
            mVar.V(i10);
            mVar.W(jR);
            return true;
        }
        if (i11 == 1) {
            long jP = p();
            mVar.V(i10);
            mVar.U(jP);
            return true;
        }
        if (i11 == 2) {
            rs.w wVarK = k();
            mVar.V(i10);
            mVar.V(wVarK.size());
            mVar.R(wVarK);
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw new rs.t("Protocol message tag had invalid wire type.");
            }
            int iO = o();
            mVar.V(i10);
            mVar.T(iO);
            return true;
        }
        mVar.V(i10);
        do {
            iT = t();
            if (iT == 0) {
                break;
            }
        } while (w(iT, mVar));
        int i12 = ((i10 >>> 3) << 3) | 4;
        c(i12);
        mVar.V(i12);
        return true;
    }

    public void x(int i10) throws rs.t {
        int i11 = this.f8582a;
        int i12 = this.f8584c;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f8584c = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new rs.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f8586e;
        int i15 = i14 + i12 + i10;
        int i16 = this.f8587f;
        if (i15 > i16) {
            x((i16 - i14) - i12);
            throw rs.t.a();
        }
        this.f8584c = i11;
        v(1);
        while (true) {
            int i17 = i10 - i13;
            int i18 = this.f8582a;
            if (i17 <= i18) {
                this.f8584c = i17;
                return;
            } else {
                i13 += i18;
                this.f8584c = i18;
                v(1);
            }
        }
    }

    public boolean y(int i10) throws IOException {
        InputStream inputStream = (InputStream) this.f8590i;
        byte[] bArr = (byte[]) this.f8589h;
        int i11 = this.f8584c;
        int i12 = i11 + i10;
        int i13 = this.f8582a;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f8586e + i11 + i10 <= this.f8587f && inputStream != null) {
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f8586e += i11;
                this.f8582a -= i11;
                this.f8584c = 0;
            }
            int i14 = this.f8582a;
            int i15 = inputStream.read(bArr, i14, bArr.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f8582a += i15;
                if ((this.f8586e + i10) - 67108864 > 0) {
                    throw new rs.t("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                u();
                if (this.f8582a >= i10) {
                    return true;
                }
                return y(i10);
            }
        }
        return false;
    }

    public u(Format format, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, y9.g[] gVarArr) {
        int i16;
        this.f8589h = format;
        this.f8582a = i10;
        this.f8583b = i11;
        this.f8584c = i12;
        this.f8585d = i13;
        this.f8586e = i14;
        this.f8587f = i15;
        this.f8590i = gVarArr;
        if (i11 == 0) {
            float f10 = z10 ? 8.0f : 1.0f;
            int minBufferSize = AudioTrack.getMinBufferSize(i13, i14, i15);
            qb.b.j(minBufferSize != -2);
            i16 = qb.v.i(minBufferSize * 4, ((int) ((250000 * i13) / 1000000)) * i12, Math.max(minBufferSize, ((int) ((750000 * i13) / 1000000)) * i12));
            if (f10 != 1.0f) {
                i16 = Math.round(i16 * f10);
            }
        } else if (i11 == 1) {
            i16 = h(50000000L);
        } else if (i11 == 2) {
            i16 = h(250000L);
        } else {
            throw new IllegalStateException();
        }
        this.f8588g = i16;
    }

    public u(androidx.media3.common.r rVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, y4.c[] cVarArr) {
        this.f8589h = rVar;
        this.f8582a = i10;
        this.f8583b = i11;
        this.f8584c = i12;
        this.f8585d = i13;
        this.f8586e = i14;
        this.f8587f = i15;
        this.f8588g = i16;
        this.f8590i = cVarArr;
    }
}
