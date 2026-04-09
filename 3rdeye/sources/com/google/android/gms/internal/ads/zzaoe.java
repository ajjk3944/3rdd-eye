package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaoe {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzeu zza = new zzeu(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzen zzb = new zzen();

    public zzaoe(int i) {
    }

    private final int zze(zzadu zzaduVar) {
        byte[] bArr = zzex.zzb;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzaduVar.zzj();
        return 0;
    }

    public final int zza(zzadu zzaduVar, zzaep zzaepVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzaduVar);
            return 0;
        }
        long j4 = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaduVar);
                return 0;
            }
            if (this.zzd) {
                long j10 = this.zzf;
                if (j10 == -9223372036854775807L) {
                    zze(zzaduVar);
                    return 0;
                }
                zzeu zzeuVar = this.zza;
                this.zzh = zzeuVar.zzc(this.zzg) - zzeuVar.zzb(j10);
                zze(zzaduVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzaduVar.zzd());
            if (zzaduVar.zzf() != 0) {
                zzaepVar.zza = 0L;
                return 1;
            }
            zzen zzenVar = this.zzb;
            zzenVar.zzI(iMin);
            zzaduVar.zzj();
            zzaduVar.zzh(zzenVar.zzN(), 0, iMin);
            int iZzc = zzenVar.zzc();
            int iZzd = zzenVar.zzd();
            while (true) {
                if (iZzc >= iZzd) {
                    break;
                }
                if (zzenVar.zzN()[iZzc] == 71) {
                    long jZzb = zzaon.zzb(zzenVar, iZzc, i);
                    if (jZzb != -9223372036854775807L) {
                        j4 = jZzb;
                        break;
                    }
                }
                iZzc++;
            }
            this.zzf = j4;
            this.zzd = true;
            return 0;
        }
        long jZzd = zzaduVar.zzd();
        int iMin2 = (int) Math.min(112800L, jZzd);
        long j11 = jZzd - iMin2;
        if (zzaduVar.zzf() != j11) {
            zzaepVar.zza = j11;
            return 1;
        }
        zzen zzenVar2 = this.zzb;
        zzenVar2.zzI(iMin2);
        zzaduVar.zzj();
        zzaduVar.zzh(zzenVar2.zzN(), 0, iMin2);
        int iZzc2 = zzenVar2.zzc();
        int iZzd2 = zzenVar2.zzd();
        int i10 = iZzd2 - 188;
        while (true) {
            if (i10 < iZzc2) {
                break;
            }
            byte[] bArrZzN = zzenVar2.zzN();
            int i11 = -4;
            int i12 = 0;
            while (true) {
                if (i11 > 4) {
                    break;
                }
                int i13 = (i11 * 188) + i10;
                if (i13 < iZzc2 || i13 >= iZzd2 || bArrZzN[i13] != 71) {
                    i12 = 0;
                } else {
                    i12++;
                    if (i12 == 5) {
                        long jZzb2 = zzaon.zzb(zzenVar2, i10, i);
                        if (jZzb2 != -9223372036854775807L) {
                            j4 = jZzb2;
                            break;
                        }
                    }
                }
                i11++;
            }
            i10--;
        }
        this.zzg = j4;
        this.zze = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
