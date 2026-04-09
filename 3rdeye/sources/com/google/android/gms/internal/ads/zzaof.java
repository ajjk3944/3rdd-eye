package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaof implements zzany {
    final /* synthetic */ zzaoh zza;
    private final zzem zzb = new zzem(new byte[4], 4);

    public zzaof(zzaoh zzaohVar) {
        this.zza = zzaohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(zzen zzenVar) {
        if (zzenVar.zzm() == 0 && (zzenVar.zzm() & 128) != 0) {
            zzenVar.zzM(6);
            int iZza = zzenVar.zza() / 4;
            for (int i = 0; i < iZza; i++) {
                zzem zzemVar = this.zzb;
                zzenVar.zzG(zzemVar, 4);
                int iZzd = zzemVar.zzd(16);
                zzemVar.zzn(3);
                if (iZzd == 0) {
                    zzemVar.zzn(13);
                } else {
                    int iZzd2 = zzemVar.zzd(13);
                    zzaoh zzaohVar = this.zza;
                    if (zzaohVar.zzg.get(iZzd2) == null) {
                        zzaohVar.zzg.put(iZzd2, new zzanz(new zzaog(zzaohVar, iZzd2)));
                        zzaohVar.zzm++;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzeu zzeuVar, zzadw zzadwVar, zzaol zzaolVar) {
    }
}
