package com.google.android.gms.internal.ads;

import N7.H7;
import g0.C4356c;
import io.appmetrica.analytics.impl.Oo;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzen {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzfyk zzc = zzfyk.zzr(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzen(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
    }

    private final char zzO(ByteOrder byteOrder, int i) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zzd;
            int i10 = this.zze + i;
            return zzgbf.zza(bArr[i10], bArr[i10 + 1]);
        }
        byte[] bArr2 = this.zzd;
        int i11 = this.zze + i;
        return zzgbf.zza(bArr2[i11 + 1], bArr2[i11]);
    }

    private final char zzP(Charset charset, char[] cArr) {
        int iZzS;
        if (zza() >= zzR(charset) && (iZzS = zzS(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j4 = i;
                char c10 = (char) j4;
                zzfve.zzh(((long) c10) == j4, "Out of range: %s", j4);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.zze = zzgbi.zzb(iZzS & KotlinVersion.MAX_COMPONENT_VALUE) + this.zze;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    private static int zzQ(int i, int i10, int i11, int i12) {
        return zzgbi.zze((byte) 0, zzgbl.zza(((i & 7) << 2) | ((i10 & 48) >> 4)), zzgbl.zza(((i11 & 60) >> 2) | ((i10 & 15) << 4)), zzgbl.zza((i12 & 63) | ((i11 & 3) << 6)));
    }

    private static int zzR(Charset charset) {
        zzdd.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final int zzS(Charset charset) {
        int codePoint;
        int i;
        int iZzQ;
        zzdd.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (zza() < zzR(charset)) {
            throw new IndexOutOfBoundsException(H7.n(this.zze, this.zzf, "position=", ", limit="));
        }
        int i10 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.zzd[this.zze];
            if ((b10 & 128) == 0) {
                codePoint = b10 & 255;
                return (codePoint << 8) | i10;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.zzd[this.zze];
            if ((b11 & 128) == 0) {
                i = 1;
            } else if ((b11 & 224) == 192 && zza() >= 2 && zzT(this.zzd[this.zze + 1])) {
                i = 2;
            } else {
                if ((this.zzd[this.zze] & 240) == 224 && zza() >= 3) {
                    byte[] bArr = this.zzd;
                    int i11 = this.zze;
                    if (zzT(bArr[i11 + 1]) && zzT(bArr[i11 + 2])) {
                        i = 3;
                    }
                }
                if ((this.zzd[this.zze] & 248) == 240 && zza() >= 4) {
                    byte[] bArr2 = this.zzd;
                    int i12 = this.zze;
                    if (zzT(bArr2[i12 + 1]) && zzT(bArr2[i12 + 2]) && zzT(bArr2[i12 + 3])) {
                        i = 4;
                    }
                }
                i = 0;
            }
            if (i == 1) {
                iZzQ = this.zzd[this.zze] & 255;
            } else if (i == 2) {
                byte[] bArr3 = this.zzd;
                int i13 = this.zze;
                iZzQ = zzQ(0, 0, bArr3[i13], bArr3[i13 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr4 = this.zzd;
                        int i14 = this.zze;
                        iZzQ = zzQ(bArr4[i14], bArr4[i14 + 1], bArr4[i14 + 2], bArr4[i14 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zzd;
                int i15 = this.zze;
                iZzQ = zzQ(0, bArr5[i15] & 15, bArr5[i15 + 1], bArr5[i15 + 2]);
            }
            i10 = i;
            codePoint = iZzQ;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzO = zzO(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzO) || zza() < 4) {
                codePoint = cZzO;
                i10 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzO, zzO(byteOrder, 2));
                i10 = 4;
            }
        }
        return (codePoint << 8) | i10;
    }

    private static boolean zzT(byte b10) {
        return (b10 & 192) == 128;
    }

    public final String zzA(int i) {
        if (i == 0) {
            return "";
        }
        int i10 = this.zze;
        int i11 = (i10 + i) - 1;
        String strZzC = zzex.zzC(this.zzd, i10, (i11 >= this.zzf || this.zzd[i11] != 0) ? i : i - 1);
        this.zze += i;
        return strZzC;
    }

    public final String zzB(int i, Charset charset) {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        String str = new String(bArr, i10, i, charset);
        this.zze = i10 + i;
        return str;
    }

    public final Charset zzC() {
        if (zza() >= 3) {
            byte[] bArr = this.zzd;
            int i = this.zze;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.zze = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zza() < 2) {
            return null;
        }
        byte[] bArr2 = this.zzd;
        int i10 = this.zze;
        byte b10 = bArr2[i10];
        if (b10 == -2) {
            if (bArr2[i10 + 1] != -1) {
                return null;
            }
            this.zze = i10 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.zze = i10 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final short zzE() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        return (short) ((bArr[i10] & 255) | (i11 << 8));
    }

    public final void zzF(int i) {
        byte[] bArr = this.zzd;
        if (i > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i);
        }
    }

    public final void zzG(zzem zzemVar, int i) {
        zzH(zzemVar.zza, 0, i);
        zzemVar.zzl(0);
    }

    public final void zzH(byte[] bArr, int i, int i10) {
        System.arraycopy(this.zzd, this.zze, bArr, i, i10);
        this.zze += i10;
    }

    public final void zzI(int i) {
        byte[] bArr = this.zzd;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzJ(bArr, i);
    }

    public final void zzJ(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
        this.zze = 0;
    }

    public final void zzK(int i) {
        boolean z10 = false;
        if (i >= 0 && i <= this.zzd.length) {
            z10 = true;
        }
        zzdd.zzd(z10);
        this.zzf = i;
    }

    public final void zzL(int i) {
        boolean z10 = false;
        if (i >= 0 && i <= this.zzf) {
            z10 = true;
        }
        zzdd.zzd(z10);
        this.zze = i;
    }

    public final void zzM(int i) {
        zzL(this.zze + i);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    public final int zza() {
        return Math.max(this.zzf - this.zze, 0);
    }

    public final int zzb() {
        return this.zzd.length;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final int zze(Charset charset) {
        if (zzS(charset) != 0) {
            return zzgbi.zzb(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i + 3;
        this.zze = i14;
        int i15 = bArr[i12] & 255;
        this.zze = i + 4;
        return (bArr[i14] & 255) | (i11 << 24) | (i13 << 16) | (i15 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        this.zze = i + 3;
        return (bArr[i12] & 255) | ((i11 << 24) >> 8) | (i13 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i + 3;
        this.zze = i14;
        int i15 = bArr[i12] & 255;
        this.zze = i + 4;
        return ((bArr[i14] & 255) << 24) | (i13 << 8) | i11 | (i15 << 16);
    }

    public final int zzj() {
        int iZzi = zzi();
        if (iZzi >= 0) {
            return iZzi;
        }
        throw new IllegalStateException(C4356c.h(iZzi, "Top bit not zero: "));
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        this.zze = i + 1;
        return bArr[i] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        int i12 = bArr[i10] & 255;
        this.zze = i + 4;
        return i12 | (i11 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        this.zze = i + 3;
        return (bArr[i12] & 255) | (i11 << 16) | (i13 << 8);
    }

    public final int zzp() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new IllegalStateException(C4356c.h(iZzg, "Top bit not zero: "));
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        int i11 = bArr[i] & 255;
        this.zze = i + 2;
        return (bArr[i10] & 255) | (i11 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        long j4 = bArr[i];
        int i11 = i + 2;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i + 3;
        this.zze = i12;
        long j11 = bArr[i11];
        int i13 = i + 4;
        this.zze = i13;
        long j12 = bArr[i12];
        int i14 = i + 5;
        this.zze = i14;
        long j13 = bArr[i13];
        int i15 = i + 6;
        this.zze = i15;
        long j14 = bArr[i14];
        this.zze = i + 7;
        long j15 = bArr[i15];
        this.zze = i + 8;
        return ((bArr[r3] & 255) << 56) | (255 & j4) | ((j10 & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((j13 & 255) << 32) | ((j14 & 255) << 40) | ((j15 & 255) << 48);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        long j4 = bArr[i];
        int i11 = i + 2;
        this.zze = i11;
        long j10 = bArr[i10];
        this.zze = i + 3;
        long j11 = bArr[i11];
        this.zze = i + 4;
        return ((bArr[r2] & 255) << 24) | (j4 & 255) | ((j10 & 255) << 8) | ((j11 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        long j4 = bArr[i];
        int i11 = i + 2;
        this.zze = i11;
        long j10 = bArr[i10];
        int i12 = i + 3;
        this.zze = i12;
        long j11 = bArr[i11];
        int i13 = i + 4;
        this.zze = i13;
        long j12 = bArr[i12];
        int i14 = i + 5;
        this.zze = i14;
        long j13 = bArr[i13];
        int i15 = i + 6;
        this.zze = i15;
        long j14 = bArr[i14];
        this.zze = i + 7;
        long j15 = bArr[i15];
        this.zze = i + 8;
        return (bArr[r3] & 255) | ((j4 & 255) << 56) | ((j10 & 255) << 48) | ((j11 & 255) << 40) | ((j12 & 255) << 32) | ((j13 & 255) << 24) | ((j14 & 255) << 16) | ((j15 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i10 = i + 1;
        this.zze = i10;
        long j4 = bArr[i];
        int i11 = i + 2;
        this.zze = i11;
        long j10 = bArr[i10];
        this.zze = i + 3;
        long j11 = bArr[i11];
        this.zze = i + 4;
        return (bArr[r2] & 255) | ((j4 & 255) << 24) | ((j10 & 255) << 16) | ((j11 & 255) << 8);
    }

    public final long zzv() {
        long j4 = 0;
        for (int i = 0; i < 9; i++) {
            if (this.zze == this.zzf) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzm = zzm();
            j4 |= (127 & jZzm) << (i * 7);
            if ((jZzm & 128) == 0) {
                return j4;
            }
        }
        return j4;
    }

    public final long zzw() {
        long jZzt = zzt();
        if (jZzt >= 0) {
            return jZzt;
        }
        throw new IllegalStateException(Oo.d(jZzt, "Top bit not zero: "));
    }

    public final long zzx() {
        int i;
        int i10;
        long j4 = this.zzd[this.zze];
        int i11 = 7;
        while (true) {
            i = 0;
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j4) != 0) {
                i11--;
            } else if (i11 < 6) {
                j4 &= r7 - 1;
                i = 7 - i11;
            } else if (i11 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException(Oo.d(j4, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i; i10++) {
            if ((this.zzd[this.zze + i10] & 192) != 128) {
                throw new NumberFormatException(Oo.d(j4, "Invalid UTF-8 sequence continuation byte: "));
            }
            j4 = (j4 << 6) | (r2 & 63);
        }
        this.zze += i;
        return j4;
    }

    public final String zzy(char c10) {
        if (zza() == 0) {
            return null;
        }
        int i = this.zze;
        while (i < this.zzf && this.zzd[i] != 0) {
            i++;
        }
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        String strZzC = zzex.zzC(bArr, i10, i - i10);
        this.zze = i;
        if (i < this.zzf) {
            this.zze = i + 1;
        }
        return strZzC;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzz(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzfyk r0 = com.google.android.gms.internal.ads.zzen.zzc
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Unsupported charset: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.internal.ads.zzdd.zze(r0, r1)
            int r0 = r4.zza()
            if (r0 != 0) goto L1b
            r5 = 0
            return r5
        L1b:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L26
            r4.zzC()
        L26:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            r3 = 1
            if (r1 != 0) goto L5e
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L36
            goto L5e
        L36:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r3 = 2
            if (r0 != 0) goto L5e
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5e
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L50
            goto L5e
        L50:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            r0.<init>(r5)
            throw r0
        L5e:
            int r0 = r4.zze
        L60:
            int r1 = r4.zzf
            int r2 = r3 + (-1)
            int r2 = r1 - r2
            if (r0 >= r2) goto Lbd
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L78
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L82
        L78:
            byte[] r1 = r4.zzd
            r1 = r1[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzM(r1)
            if (r1 != 0) goto Lbe
        L82:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L92
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La2
        L92:
            byte[] r1 = r4.zzd
            r2 = r1[r0]
            if (r2 != 0) goto La2
            int r2 = r0 + 1
            r1 = r1[r2]
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzM(r1)
            if (r1 != 0) goto Lbe
        La2:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto Lbb
            int r1 = r0 + 1
            byte[] r2 = r4.zzd
            r1 = r2[r1]
            if (r1 != 0) goto Lbb
            r1 = r2[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzM(r1)
            if (r1 == 0) goto Lbb
            goto Lbe
        Lbb:
            int r0 = r0 + r3
            goto L60
        Lbd:
            r0 = r1
        Lbe:
            int r1 = r4.zze
            int r0 = r0 - r1
            java.lang.String r0 = r4.zzB(r0, r5)
            int r1 = r4.zze
            int r2 = r4.zzf
            if (r1 == r2) goto Lda
            char[] r1 = com.google.android.gms.internal.ads.zzen.zza
            char r1 = r4.zzP(r5, r1)
            r2 = 13
            if (r1 != r2) goto Lda
            char[] r1 = com.google.android.gms.internal.ads.zzen.zzb
            r4.zzP(r5, r1)
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.zzz(java.nio.charset.Charset):java.lang.String");
    }

    public zzen() {
        this.zzd = zzex.zzb;
    }

    public zzen(int i) {
        this.zzd = new byte[i];
        this.zzf = i;
    }

    public zzen(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
