package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzanq implements zzany {
    private zzz zza;
    private zzeu zzb;
    private zzaez zzc;

    public zzanq(String str, String str2) {
        zzx zzxVar = new zzx();
        zzxVar.zzG("video/mp2t");
        zzxVar.zzah(str);
        this.zza = zzxVar.zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(zzen zzenVar) {
        zzdd.zzb(this.zzb);
        String str = zzex.zza;
        long jZze = this.zzb.zze();
        long jZzf = this.zzb.zzf();
        if (jZze == -9223372036854775807L || jZzf == -9223372036854775807L) {
            return;
        }
        zzz zzzVar = this.zza;
        if (jZzf != zzzVar.zzt) {
            zzx zzxVarZzb = zzzVar.zzb();
            zzxVarZzb.zzal(jZzf);
            zzz zzzVarZzan = zzxVarZzb.zzan();
            this.zza = zzzVarZzan;
            this.zzc.zzm(zzzVarZzan);
        }
        int iZza = zzenVar.zza();
        this.zzc.zzr(zzenVar, iZza);
        this.zzc.zzt(jZze, 1, iZza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzeu zzeuVar, zzadw zzadwVar, zzaol zzaolVar) {
        this.zzb = zzeuVar;
        zzaolVar.zzc();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 5);
        this.zzc = zzaezVarZzw;
        zzaezVarZzw.zzm(this.zza);
    }
}
