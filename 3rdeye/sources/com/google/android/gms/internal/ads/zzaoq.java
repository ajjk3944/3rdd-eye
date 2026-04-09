package com.google.android.gms.internal.ads;

import N7.C1094a9;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaoq implements zzaor {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzadw zzc;
    private final zzaez zzd;
    private final zzaou zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzen zzh;
    private final int zzi;
    private final zzz zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaoq(zzadw zzadwVar, zzaez zzaezVar, zzaou zzaouVar) throws zzaz {
        this.zzc = zzadwVar;
        this.zzd = zzaezVar;
        this.zze = zzaouVar;
        int iMax = Math.max(1, zzaouVar.zzc / 10);
        this.zzi = iMax;
        zzen zzenVar = new zzen(zzaouVar.zzf);
        zzenVar.zzk();
        int iZzk = zzenVar.zzk();
        this.zzf = iZzk;
        int i = zzaouVar.zzb;
        int i10 = zzaouVar.zzd;
        int iD = C1094a9.d(i10 - (i * 4), 8, zzaouVar.zze * i, 1);
        if (iZzk != iD) {
            throw zzaz.zza("Expected frames per block: " + iD + "; got: " + iZzk, null);
        }
        String str = zzex.zza;
        int i11 = ((iMax + iZzk) - 1) / iZzk;
        this.zzg = new byte[i10 * i11];
        this.zzh = new zzen((iZzk + iZzk) * i * i11);
        int i12 = ((zzaouVar.zzc * zzaouVar.zzd) * 8) / iZzk;
        zzx zzxVar = new zzx();
        zzxVar.zzah("audio/raw");
        zzxVar.zzC(i12);
        zzxVar.zzac(i12);
        zzxVar.zzX((iMax + iMax) * i);
        zzxVar.zzD(zzaouVar.zzb);
        zzxVar.zzai(zzaouVar.zzc);
        zzxVar.zzab(2);
        this.zzj = zzxVar.zzan();
    }

    private final int zzd(int i) {
        int i10 = this.zze.zzb;
        return i / (i10 + i10);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long jZzu = this.zzl + zzex.zzu(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int iZze = zze(i);
        this.zzd.zzt(jZzu, 1, iZze, this.zzm - iZze, null);
        this.zzn += i;
        this.zzm -= iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zza(int i, long j4) {
        zzaox zzaoxVar = new zzaox(this.zze, this.zzf, i, j4);
        this.zzc.zzP(zzaoxVar);
        zzaez zzaezVar = this.zzd;
        zzaezVar.zzm(this.zzj);
        zzaezVar.zzl(zzaoxVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zzb(long j4) {
        this.zzk = 0;
        this.zzl = j4;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:4:0x0022). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadu r26, long r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoq.zzc(com.google.android.gms.internal.ads.zzadu, long):boolean");
    }
}
