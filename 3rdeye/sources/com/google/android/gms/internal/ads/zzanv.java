package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzanv {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzeu zza = new zzeu(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzen zzb = new zzen();

    public static long zzc(zzen zzenVar) {
        int iZzc = zzenVar.zzc();
        if (zzenVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzenVar.zzH(bArr, 0, 9);
        zzenVar.zzL(iZzc);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j4 = b10;
        long j10 = b11;
        long j11 = (248 & j10) >> 3;
        long j12 = (bArr[1] & 255) << 20;
        long j13 = (j10 & 3) << 13;
        return j13 | j12 | ((j4 & 3) << 28) | (((j4 & 56) >> 3) << 30) | (j11 << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
    }

    private final int zzf(zzadu zzaduVar) {
        byte[] bArr = zzex.zzb;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzaduVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        long j4 = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzaduVar.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j10 = jZzd - iMin;
            if (zzaduVar.zzf() != j10) {
                zzaepVar.zza = j10;
                return 1;
            }
            zzen zzenVar = this.zzb;
            zzenVar.zzI(iMin);
            zzaduVar.zzj();
            zzaduVar.zzh(zzenVar.zzN(), 0, iMin);
            int iZzc = zzenVar.zzc();
            int iZzd = zzenVar.zzd() - 4;
            while (true) {
                if (iZzd < iZzc) {
                    break;
                }
                if (zzg(zzenVar.zzN(), iZzd) == 442) {
                    zzenVar.zzL(iZzd + 4);
                    long jZzc = zzc(zzenVar);
                    if (jZzc != -9223372036854775807L) {
                        j4 = jZzc;
                        break;
                    }
                }
                iZzd--;
            }
            this.zzg = j4;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzaduVar);
            return 0;
        }
        if (this.zzd) {
            long j11 = this.zzf;
            if (j11 == -9223372036854775807L) {
                zzf(zzaduVar);
                return 0;
            }
            zzeu zzeuVar = this.zza;
            this.zzh = zzeuVar.zzc(this.zzg) - zzeuVar.zzb(j11);
            zzf(zzaduVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzaduVar.zzd());
        if (zzaduVar.zzf() != 0) {
            zzaepVar.zza = 0L;
            return 1;
        }
        zzen zzenVar2 = this.zzb;
        zzenVar2.zzI(iMin2);
        zzaduVar.zzj();
        zzaduVar.zzh(zzenVar2.zzN(), 0, iMin2);
        int iZzc2 = zzenVar2.zzc();
        int iZzd2 = zzenVar2.zzd();
        while (true) {
            if (iZzc2 >= iZzd2 - 3) {
                break;
            }
            if (zzg(zzenVar2.zzN(), iZzc2) == 442) {
                zzenVar2.zzL(iZzc2 + 4);
                long jZzc2 = zzc(zzenVar2);
                if (jZzc2 != -9223372036854775807L) {
                    j4 = jZzc2;
                    break;
                }
            }
            iZzc2++;
        }
        this.zzf = j4;
        this.zzd = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
