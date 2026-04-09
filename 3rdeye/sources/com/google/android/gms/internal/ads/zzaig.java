package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaig {
    public final zzael zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaig(zzael zzaelVar, long j4, long j10, long[] jArr, int i, int i10) {
        this.zza = new zzael(zzaelVar);
        this.zzb = j4;
        this.zzc = j10;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i10;
    }

    public static zzaig zzb(zzael zzaelVar, zzen zzenVar) {
        long[] jArr;
        int i;
        int i10;
        int iZzg = zzenVar.zzg();
        int iZzp = (iZzg & 1) != 0 ? zzenVar.zzp() : -1;
        long jZzu = (iZzg & 2) != 0 ? zzenVar.zzu() : -1L;
        if ((iZzg & 4) == 4) {
            jArr = new long[100];
            for (int i11 = 0; i11 < 100; i11++) {
                jArr[i11] = zzenVar.zzm();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iZzg & 8) != 0) {
            zzenVar.zzM(4);
        }
        if (zzenVar.zza() >= 24) {
            zzenVar.zzM(21);
            int iZzo = zzenVar.zzo();
            i10 = iZzo & 4095;
            i = iZzo >> 12;
        } else {
            i = -1;
            i10 = -1;
        }
        return new zzaig(zzaelVar, iZzp, jZzu, jArr2, i, i10);
    }

    public final long zza() {
        long j4 = this.zzb;
        if (j4 == -1 || j4 == 0) {
            return -9223372036854775807L;
        }
        return zzex.zzt((j4 * r4.zzg) - 1, this.zza.zzd);
    }
}
