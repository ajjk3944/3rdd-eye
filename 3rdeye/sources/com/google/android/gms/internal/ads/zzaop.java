package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaop {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzaez[] zzc;
    private final zzfz zzd;

    public zzaop(List list, String str) {
        this.zza = list;
        this.zzc = new zzaez[list.size()];
        zzfz zzfzVar = new zzfz(new zzfy() { // from class: com.google.android.gms.internal.ads.zzaoo
            @Override // com.google.android.gms.internal.ads.zzfy
            public final void zza(long j4, zzen zzenVar) {
                zzadg.zzb(j4, zzenVar, this.zza.zzc);
            }
        });
        this.zzd = zzfzVar;
        zzfzVar.zze(3);
    }

    public final void zzb(long j4, zzen zzenVar) {
        if (zzenVar.zza() < 9) {
            return;
        }
        int iZzg = zzenVar.zzg();
        int iZzg2 = zzenVar.zzg();
        int iZzm = zzenVar.zzm();
        if (iZzg == 434 && iZzg2 == 1195456820 && iZzm == 3) {
            this.zzd.zzb(j4, zzenVar);
        }
    }

    public final void zzc(zzadw zzadwVar, zzaol zzaolVar) {
        int i = 0;
        while (true) {
            zzaez[] zzaezVarArr = this.zzc;
            if (i >= zzaezVarArr.length) {
                return;
            }
            zzaolVar.zzc();
            zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 3);
            zzz zzzVar = (zzz) this.zza.get(i);
            String str = zzzVar.zzo;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            zzdd.zze(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzx zzxVar = new zzx();
            zzxVar.zzS(zzaolVar.zzb());
            zzxVar.zzG(this.zzb);
            zzxVar.zzah(str);
            zzxVar.zzaj(zzzVar.zze);
            zzxVar.zzW(zzzVar.zzd);
            zzxVar.zzB(zzzVar.zzL);
            zzxVar.zzT(zzzVar.zzr);
            zzaezVarZzw.zzm(zzxVar.zzan());
            zzaezVarArr[i] = zzaezVarZzw;
            i++;
        }
    }
}
