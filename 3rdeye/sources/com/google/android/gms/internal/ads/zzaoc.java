package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaoc implements zzade {
    private final zzeu zza;
    private final zzen zzb = new zzen();
    private final int zzc;

    public zzaoc(int i, zzeu zzeuVar, int i10) {
        this.zzc = i;
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadd zza(zzadu zzaduVar, long j4) throws IOException {
        int iZza;
        int iZza2;
        long jZzf = zzaduVar.zzf();
        int iMin = (int) Math.min(112800L, zzaduVar.zzd() - jZzf);
        zzen zzenVar = this.zzb;
        zzenVar.zzI(iMin);
        zzaduVar.zzh(zzenVar.zzN(), 0, iMin);
        int iZzd = zzenVar.zzd();
        long j10 = -1;
        long j11 = -9223372036854775807L;
        long j12 = -1;
        while (zzenVar.zza() >= 188 && (iZza2 = (iZza = zzaon.zza(zzenVar.zzN(), zzenVar.zzc(), iZzd)) + 188) <= iZzd) {
            long jZzb = zzaon.zzb(zzenVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 > j4) {
                    return j11 == -9223372036854775807L ? zzadd.zzd(jZzb2, jZzf) : zzadd.zze(jZzf + j12);
                }
                j12 = iZza;
                if (100000 + jZzb2 > j4) {
                    return zzadd.zze(jZzf + j12);
                }
                j11 = jZzb2;
            }
            zzenVar.zzL(iZza2);
            j10 = iZza2;
        }
        return j11 != -9223372036854775807L ? zzadd.zzf(j11, jZzf + j10) : zzadd.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzb() {
        byte[] bArr = zzex.zzb;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
