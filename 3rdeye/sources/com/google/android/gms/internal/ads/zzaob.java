package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaob {
    private final List zza;
    private final zzaez[] zzc;
    private final String zzb = "video/mp2t";
    private final zzfz zzd = new zzfz(new zzfy() { // from class: com.google.android.gms.internal.ads.zzaoa
        @Override // com.google.android.gms.internal.ads.zzfy
        public final void zza(long j4, zzen zzenVar) {
            zzadg.zza(j4, zzenVar, this.zza.zzc);
        }
    });

    public zzaob(List list, String str) {
        this.zza = list;
        this.zzc = new zzaez[list.size()];
    }

    public final void zzb() {
        this.zzd.zzd();
    }

    public final void zzc(long j4, zzen zzenVar) {
        this.zzd.zzb(j4, zzenVar);
    }

    public final void zzd(zzadw zzadwVar, zzaol zzaolVar) {
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
            String strZzb = zzzVar.zza;
            if (strZzb == null) {
                strZzb = zzaolVar.zzb();
            }
            zzx zzxVar = new zzx();
            zzxVar.zzS(strZzb);
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

    public final void zze() {
        this.zzd.zzd();
    }

    public final void zzf(int i) {
        this.zzd.zze(i);
    }
}
