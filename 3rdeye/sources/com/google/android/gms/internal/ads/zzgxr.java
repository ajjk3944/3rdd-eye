package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgxr extends zzgxt {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzf;
    private final long zzg;
    private long zzh;
    private long zzi;
    private final long zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    public /* synthetic */ zzgxr(ByteBuffer byteBuffer, boolean z10, zzgxs zzgxsVar) {
        super(null);
        this.zzm = Integer.MAX_VALUE;
        this.zzf = byteBuffer.duplicate();
        long jZze = zzhbs.zze(byteBuffer);
        this.zzg = jZze;
        this.zzh = byteBuffer.limit() + jZze;
        long jPosition = jZze + byteBuffer.position();
        this.zzi = jPosition;
        this.zzj = jPosition;
    }

    private final int zzC() {
        return (int) (this.zzh - this.zzi);
    }

    private final void zzI() {
        long j4 = this.zzh + this.zzk;
        this.zzh = j4;
        int i = (int) (j4 - this.zzj);
        int i10 = this.zzm;
        if (i <= i10) {
            this.zzk = 0;
            return;
        }
        int i11 = i - i10;
        this.zzk = i11;
        this.zzh = j4 - i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzA() throws IOException {
        return this.zzi == this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzB() throws IOException {
        return zzq() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzc() {
        return (int) (this.zzi - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzd(int i) throws zzgzk {
        if (i < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzc = i + zzc();
        int i10 = this.zzm;
        if (iZzc > i10) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = iZzc;
        zzI();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zze() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzf() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzg() throws IOException {
        return zzi();
    }

    public final int zzh() throws IOException {
        long j4 = this.zzi;
        if (this.zzh - j4 < 4) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzi = 4 + j4;
        int iZza = zzhbs.zza(j4) & 255;
        int iZza2 = zzhbs.zza(1 + j4) & 255;
        int iZza3 = zzhbs.zza(2 + j4) & 255;
        return ((zzhbs.zza(j4 + 3) & 255) << 24) | (iZza2 << 8) | iZza | (iZza3 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhbs.zza(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzi() throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.zzi
            long r2 = r9.zzh
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.android.gms.internal.ads.zzhbs.zza(r0)
            if (r4 < 0) goto L16
            r9.zzi = r2
            return r4
        L16:
            long r5 = r9.zzh
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.android.gms.internal.ads.zzhbs.zza(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhbs.zza(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhbs.zza(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhbs.zza(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhbs.zza(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhbs.zza(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhbs.zza(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = com.google.android.gms.internal.ads.zzhbs.zza(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.android.gms.internal.ads.zzhbs.zza(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.zzi = r5
            return r0
        L92:
            long r0 = r9.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxr.zzi():int");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzj() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzk() throws IOException {
        return zzgxt.zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzl = 0;
            return 0;
        }
        int iZzi = zzi();
        this.zzl = iZzi;
        if ((iZzi >>> 3) != 0) {
            return iZzi;
        }
        throw new zzgzk("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzm() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzn() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzo() throws IOException {
        return zzq();
    }

    public final long zzp() throws IOException {
        long j4 = this.zzi;
        if (this.zzh - j4 < 8) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzi = 8 + j4;
        long jZza = zzhbs.zza(j4);
        long jZza2 = zzhbs.zza(1 + j4);
        long jZza3 = zzhbs.zza(2 + j4);
        long jZza4 = zzhbs.zza(3 + j4);
        long jZza5 = zzhbs.zza(4 + j4);
        return ((zzhbs.zza(j4 + 7) & 255) << 56) | (jZza & 255) | ((jZza2 & 255) << 8) | ((jZza3 & 255) << 16) | ((jZza4 & 255) << 24) | ((jZza5 & 255) << 32) | ((zzhbs.zza(5 + j4) & 255) << 40) | ((zzhbs.zza(6 + j4) & 255) << 48);
    }

    public final long zzq() throws IOException {
        long j4;
        long j10;
        int i;
        long j11 = this.zzi;
        if (this.zzh != j11) {
            long j12 = 1 + j11;
            byte bZza = zzhbs.zza(j11);
            if (bZza >= 0) {
                this.zzi = j12;
                return bZza;
            }
            if (this.zzh - j12 >= 9) {
                long j13 = 2 + j11;
                int iZza = (zzhbs.zza(j12) << 7) ^ bZza;
                if (iZza >= 0) {
                    long j14 = 3 + j11;
                    int iZza2 = iZza ^ (zzhbs.zza(j13) << 14);
                    if (iZza2 >= 0) {
                        j4 = iZza2 ^ 16256;
                    } else {
                        j13 = 4 + j11;
                        int iZza3 = iZza2 ^ (zzhbs.zza(j14) << 21);
                        if (iZza3 < 0) {
                            i = (-2080896) ^ iZza3;
                        } else {
                            j14 = 5 + j11;
                            long jZza = (zzhbs.zza(j13) << 28) ^ iZza3;
                            if (jZza < 0) {
                                long j15 = 6 + j11;
                                long jZza2 = (zzhbs.zza(j14) << 35) ^ jZza;
                                if (jZza2 >= 0) {
                                    long j16 = 7 + j11;
                                    long jZza3 = jZza2 ^ (zzhbs.zza(j15) << 42);
                                    if (jZza3 >= 0) {
                                        j4 = 4363953127296L ^ jZza3;
                                        j13 = j16;
                                    } else {
                                        j15 = 8 + j11;
                                        jZza2 = jZza3 ^ (zzhbs.zza(j16) << 49);
                                        if (jZza2 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j13 = j11 + 9;
                                            long jZza4 = (jZza2 ^ (zzhbs.zza(j15) << 56)) ^ 71499008037633920L;
                                            if (jZza4 < 0) {
                                                long j17 = j11 + 10;
                                                if (zzhbs.zza(j13) >= 0) {
                                                    j13 = j17;
                                                }
                                            }
                                            j4 = jZza4;
                                        }
                                    }
                                    this.zzi = j13;
                                    return j4;
                                }
                                j10 = -34093383808L;
                                j4 = j10 ^ jZza2;
                                j13 = j15;
                                this.zzi = j13;
                                return j4;
                            }
                            j4 = 266354560 ^ jZza;
                        }
                    }
                    j13 = j14;
                    this.zzi = j13;
                    return j4;
                }
                i = iZza ^ (-128);
                j4 = i;
                this.zzi = j13;
                return j4;
            }
        }
        return zzr();
    }

    public final long zzr() throws IOException {
        long j4 = 0;
        for (int i = 0; i < 64; i += 7) {
            long j10 = this.zzi;
            if (j10 == this.zzh) {
                throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.zzi = 1 + j10;
            j4 |= (r3 & 127) << i;
            if ((zzhbs.zza(j10) & 128) == 0) {
                return j4;
            }
        }
        throw new zzgzk("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzs() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzt() throws IOException {
        return zzgxt.zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzu() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final zzgxn zzv() throws IOException {
        int iZzi = zzi();
        if (iZzi <= 0 || iZzi > zzC()) {
            if (iZzi == 0) {
                return zzgxn.zzb;
            }
            if (iZzi < 0) {
                throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzi];
        long j4 = iZzi;
        zzhbs.zzo(this.zzi, bArr, 0L, j4);
        this.zzi += j4;
        zzgxn zzgxnVar = zzgxn.zzb;
        return new zzgxk(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzw() throws IOException {
        int iZzi = zzi();
        if (iZzi <= 0 || iZzi > zzC()) {
            if (iZzi == 0) {
                return "";
            }
            if (iZzi < 0) {
                throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzi];
        long j4 = iZzi;
        zzhbs.zzo(this.zzi, bArr, 0L, j4);
        String str = new String(bArr, zzgzi.zza);
        this.zzi += j4;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzx() throws IOException {
        int iZzi = zzi();
        if (iZzi > 0 && iZzi <= zzC()) {
            String strZzg = zzhbx.zzg(this.zzf, (int) (this.zzi - this.zzg), iZzi);
            this.zzi += iZzi;
            return strZzg;
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi <= 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzy(int i) throws zzgzk {
        if (this.zzl != i) {
            throw new zzgzk("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzz(int i) {
        this.zzm = i;
        zzI();
    }
}
