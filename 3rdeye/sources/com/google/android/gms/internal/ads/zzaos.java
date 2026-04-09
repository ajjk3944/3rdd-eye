package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaos implements zzaor {
    private final zzadw zza;
    private final zzaez zzb;
    private final zzaou zzc;
    private final zzz zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaos(zzadw zzadwVar, zzaez zzaezVar, zzaou zzaouVar, String str, int i) throws zzaz {
        this.zza = zzadwVar;
        this.zzb = zzaezVar;
        this.zzc = zzaouVar;
        int i10 = zzaouVar.zzb * zzaouVar.zze;
        int i11 = zzaouVar.zzd;
        int i12 = i10 / 8;
        if (i11 != i12) {
            throw zzaz.zza("Expected block size: " + i12 + "; got: " + i11, null);
        }
        int i13 = zzaouVar.zzc * i12;
        int i14 = i13 * 8;
        int iMax = Math.max(i12, i13 / 10);
        this.zze = iMax;
        zzx zzxVar = new zzx();
        zzxVar.zzG("audio/wav");
        zzxVar.zzah(str);
        zzxVar.zzC(i14);
        zzxVar.zzac(i14);
        zzxVar.zzX(iMax);
        zzxVar.zzD(zzaouVar.zzb);
        zzxVar.zzai(zzaouVar.zzc);
        zzxVar.zzab(i);
        this.zzd = zzxVar.zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zza(int i, long j4) {
        zzaox zzaoxVar = new zzaox(this.zzc, 1, i, j4);
        this.zza.zzP(zzaoxVar);
        zzaez zzaezVar = this.zzb;
        zzaezVar.zzm(this.zzd);
        zzaezVar.zzl(zzaoxVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zzb(long j4) {
        this.zzf = j4;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final boolean zzc(zzadu zzaduVar, long j4) throws IOException {
        int i;
        int i10;
        long j10 = j4;
        while (j10 > 0 && (i = this.zzg) < (i10 = this.zze)) {
            int iZzf = this.zzb.zzf(zzaduVar, (int) Math.min(i10 - i, j10), true);
            if (iZzf == -1) {
                j10 = 0;
            } else {
                this.zzg += iZzf;
                j10 -= iZzf;
            }
        }
        zzaou zzaouVar = this.zzc;
        int i11 = this.zzg;
        int i12 = zzaouVar.zzd;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long jZzu = this.zzf + zzex.zzu(this.zzh, 1000000L, zzaouVar.zzc, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.zzg - i14;
            this.zzb.zzt(jZzu, 1, i14, i15, null);
            this.zzh += i13;
            this.zzg = i15;
        }
        return j10 <= 0;
    }
}
