package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgxp extends zzgxt {
    private final Iterable zza;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    public /* synthetic */ zzgxp(Iterable iterable, int i, boolean z10, zzgxs zzgxsVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i;
        this.zza = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i != 0) {
            zzM();
            return;
        }
        this.zzg = zzgzi.zzc;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzI() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws zzgzk {
        if (!this.zzf.hasNext()) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzM();
    }

    private final void zzK(byte[] bArr, int i, int i10) throws IOException {
        if (i10 > zzI()) {
            if (i10 > 0) {
                throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i11 = i10;
        while (i11 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzJ();
            }
            int iMin = Math.min(i11, (int) (this.zzo - this.zzm));
            long j4 = iMin;
            zzhbs.zzo(this.zzm, bArr, i10 - i11, j4);
            i11 -= iMin;
            this.zzm += j4;
        }
    }

    private final void zzL() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i10 = this.zzj;
        if (i <= i10) {
            this.zzi = 0;
            return;
        }
        int i11 = i - i10;
        this.zzi = i11;
        this.zzh = i - i11;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long jPosition = byteBuffer.position();
        this.zzm = jPosition;
        this.zzn = jPosition;
        this.zzo = this.zzg.limit();
        long jZze = zzhbs.zze(this.zzg);
        this.zzm += jZze;
        this.zzn += jZze;
        this.zzo += jZze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzA() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzB() throws IOException {
        return zzr() != 0;
    }

    public final long zzC() throws IOException {
        long j4 = 0;
        for (int i = 0; i < 64; i += 7) {
            j4 |= (r3 & 127) << i;
            if ((zzh() & 128) == 0) {
                return j4;
            }
        }
        throw new zzgzk("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzc() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzd(int i) throws zzgzk {
        if (i < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzc = i + zzc();
        int i10 = this.zzj;
        if (iZzc > i10) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = iZzc;
        zzL();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zze() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzf() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzg() throws IOException {
        return zzp();
    }

    public final byte zzh() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j4 = this.zzm;
        this.zzm = 1 + j4;
        return zzhbs.zza(j4);
    }

    public final int zzi() throws IOException {
        long j4 = this.zzo;
        long j10 = this.zzm;
        if (j4 - j10 < 4) {
            int iZzh = zzh() & 255;
            int iZzh2 = (zzh() & 255) << 8;
            return iZzh | iZzh2 | ((zzh() & 255) << 16) | ((zzh() & 255) << 24);
        }
        this.zzm = 4 + j10;
        int iZza = zzhbs.zza(j10) & 255;
        int iZza2 = (zzhbs.zza(1 + j10) & 255) << 8;
        return iZza | iZza2 | ((zzhbs.zza(2 + j10) & 255) << 16) | ((zzhbs.zza(j10 + 3) & 255) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzj() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzk() throws IOException {
        return zzgxt.zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int iZzp = zzp();
        this.zzk = iZzp;
        if ((iZzp >>> 3) != 0) {
            return iZzp;
        }
        throw new zzgzk("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzm() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzn() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzo() throws IOException {
        return zzr();
    }

    public final int zzp() throws IOException {
        int i;
        long j4 = this.zzm;
        if (this.zzo != j4) {
            long j10 = j4 + 1;
            byte bZza = zzhbs.zza(j4);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j11 = 2 + j4;
                int iZza = (zzhbs.zza(j10) << 7) ^ bZza;
                if (iZza < 0) {
                    i = iZza ^ (-128);
                } else {
                    long j12 = 3 + j4;
                    int iZza2 = (zzhbs.zza(j11) << 14) ^ iZza;
                    if (iZza2 >= 0) {
                        i = iZza2 ^ 16256;
                    } else {
                        long j13 = 4 + j4;
                        int iZza3 = iZza2 ^ (zzhbs.zza(j12) << 21);
                        if (iZza3 < 0) {
                            i = (-2080896) ^ iZza3;
                        } else {
                            j12 = 5 + j4;
                            byte bZza2 = zzhbs.zza(j13);
                            int i10 = (iZza3 ^ (bZza2 << 28)) ^ 266354560;
                            if (bZza2 < 0) {
                                j13 = 6 + j4;
                                if (zzhbs.zza(j12) < 0) {
                                    j12 = 7 + j4;
                                    if (zzhbs.zza(j13) < 0) {
                                        j13 = 8 + j4;
                                        if (zzhbs.zza(j12) < 0) {
                                            j12 = 9 + j4;
                                            if (zzhbs.zza(j13) < 0) {
                                                long j14 = j4 + 10;
                                                if (zzhbs.zza(j12) >= 0) {
                                                    i = i10;
                                                    j11 = j14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i10;
                            }
                            i = i10;
                        }
                        j11 = j13;
                    }
                    j11 = j12;
                }
                this.zzm = j11;
                return i;
            }
        }
        return (int) zzC();
    }

    public final long zzq() throws IOException {
        long j4 = this.zzo;
        long j10 = this.zzm;
        if (j4 - j10 < 8) {
            return ((zzh() & 255) << 56) | (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << 16) | ((zzh() & 255) << 24) | ((zzh() & 255) << 32) | ((zzh() & 255) << 40) | ((zzh() & 255) << 48);
        }
        this.zzm = 8 + j10;
        long jZza = zzhbs.zza(j10) & 255;
        long jZza2 = (zzhbs.zza(1 + j10) & 255) << 8;
        return jZza | jZza2 | ((zzhbs.zza(j10 + 2) & 255) << 16) | ((zzhbs.zza(3 + j10) & 255) << 24) | ((zzhbs.zza(j10 + 4) & 255) << 32) | ((zzhbs.zza(j10 + 5) & 255) << 40) | ((zzhbs.zza(j10 + 6) & 255) << 48) | ((zzhbs.zza(j10 + 7) & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j4;
        long j10;
        long j11 = this.zzm;
        if (this.zzo != j11) {
            long j12 = j11 + 1;
            byte bZza = zzhbs.zza(j11);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j13 = 2 + j11;
                int iZza = (zzhbs.zza(j12) << 7) ^ bZza;
                if (iZza < 0) {
                    j4 = iZza ^ (-128);
                } else {
                    long j14 = 3 + j11;
                    int iZza2 = (zzhbs.zza(j13) << 14) ^ iZza;
                    if (iZza2 >= 0) {
                        j4 = iZza2 ^ 16256;
                    } else {
                        long j15 = 4 + j11;
                        int iZza3 = iZza2 ^ (zzhbs.zza(j14) << 21);
                        if (iZza3 < 0) {
                            j4 = (-2080896) ^ iZza3;
                            j13 = j15;
                        } else {
                            j14 = 5 + j11;
                            long jZza = (zzhbs.zza(j15) << 28) ^ iZza3;
                            if (jZza >= 0) {
                                j4 = 266354560 ^ jZza;
                            } else {
                                long j16 = 6 + j11;
                                long jZza2 = jZza ^ (zzhbs.zza(j14) << 35);
                                if (jZza2 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    long j17 = 7 + j11;
                                    long jZza3 = jZza2 ^ (zzhbs.zza(j16) << 42);
                                    if (jZza3 >= 0) {
                                        j4 = 4363953127296L ^ jZza3;
                                    } else {
                                        j16 = 8 + j11;
                                        jZza2 = jZza3 ^ (zzhbs.zza(j17) << 49);
                                        if (jZza2 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j17 = 9 + j11;
                                            long jZza4 = (jZza2 ^ (zzhbs.zza(j16) << 56)) ^ 71499008037633920L;
                                            if (jZza4 < 0) {
                                                long j18 = j11 + 10;
                                                if (zzhbs.zza(j17) >= 0) {
                                                    j13 = j18;
                                                    j4 = jZza4;
                                                }
                                            } else {
                                                j4 = jZza4;
                                            }
                                        }
                                    }
                                    j13 = j17;
                                }
                                j4 = j10 ^ jZza2;
                                j13 = j16;
                            }
                        }
                    }
                    j13 = j14;
                }
                this.zzm = j13;
                return j4;
            }
        }
        return zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzs() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzt() throws IOException {
        return zzgxt.zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzu() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final zzgxn zzv() throws IOException {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j4 = this.zzo;
            long j10 = this.zzm;
            long j11 = iZzp;
            if (j11 <= j4 - j10) {
                byte[] bArr = new byte[iZzp];
                zzhbs.zzo(j10, bArr, 0L, j11);
                this.zzm += j11;
                zzgxn zzgxnVar = zzgxn.zzb;
                return new zzgxk(bArr);
            }
        }
        if (iZzp > 0 && iZzp <= zzI()) {
            byte[] bArr2 = new byte[iZzp];
            zzK(bArr2, 0, iZzp);
            zzgxn zzgxnVar2 = zzgxn.zzb;
            return new zzgxk(bArr2);
        }
        if (iZzp == 0) {
            return zzgxn.zzb;
        }
        if (iZzp < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzw() throws IOException {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j4 = this.zzo;
            long j10 = this.zzm;
            long j11 = iZzp;
            if (j11 <= j4 - j10) {
                byte[] bArr = new byte[iZzp];
                zzhbs.zzo(j10, bArr, 0L, j11);
                String str = new String(bArr, zzgzi.zza);
                this.zzm += j11;
                return str;
            }
        }
        if (iZzp > 0 && iZzp <= zzI()) {
            byte[] bArr2 = new byte[iZzp];
            zzK(bArr2, 0, iZzp);
            return new String(bArr2, zzgzi.zza);
        }
        if (iZzp == 0) {
            return "";
        }
        if (iZzp < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzx() throws IOException {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j4 = this.zzo;
            long j10 = this.zzm;
            long j11 = iZzp;
            if (j11 <= j4 - j10) {
                String strZzg = zzhbx.zzg(this.zzg, (int) (j10 - this.zzn), iZzp);
                this.zzm += j11;
                return strZzg;
            }
        }
        if (iZzp >= 0 && iZzp <= zzI()) {
            byte[] bArr = new byte[iZzp];
            zzK(bArr, 0, iZzp);
            return zzhbx.zzh(bArr, 0, iZzp);
        }
        if (iZzp == 0) {
            return "";
        }
        if (iZzp <= 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzy(int i) throws zzgzk {
        if (this.zzk != i) {
            throw new zzgzk("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzz(int i) {
        this.zzj = i;
        zzL();
    }
}
