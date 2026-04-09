package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzamw implements zzamx {
    private final List zza;
    private final zzaez[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzamw(List list, String str) {
        this.zza = list;
        this.zzc = new zzaez[list.size()];
    }

    private final boolean zzf(zzen zzenVar, int i) {
        if (zzenVar.zza() == 0) {
            return false;
        }
        if (zzenVar.zzm() != i) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zza(zzen zzenVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzenVar, 32)) {
                if (this.zze != 1 || zzf(zzenVar, 0)) {
                    int iZzc = zzenVar.zzc();
                    int iZza = zzenVar.zza();
                    for (zzaez zzaezVar : this.zzc) {
                        zzenVar.zzL(iZzc);
                        zzaezVar.zzr(zzenVar, iZza);
                    }
                    this.zzf += iZza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        int i = 0;
        while (true) {
            zzaez[] zzaezVarArr = this.zzc;
            if (i >= zzaezVarArr.length) {
                return;
            }
            zzaoi zzaoiVar = (zzaoi) this.zza.get(i);
            zzaolVar.zzc();
            zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 3);
            zzx zzxVar = new zzx();
            zzxVar.zzS(zzaolVar.zzb());
            zzxVar.zzG(this.zzb);
            zzxVar.zzah("application/dvbsubs");
            zzxVar.zzT(Collections.singletonList(zzaoiVar.zzb));
            zzxVar.zzW(zzaoiVar.zza);
            zzaezVarZzw.zzm(zzxVar.zzan());
            zzaezVarArr[i] = zzaezVarZzw;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z10) {
        if (this.zzd) {
            zzdd.zzf(this.zzg != -9223372036854775807L);
            for (zzaez zzaezVar : this.zzc) {
                zzaezVar.zzt(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j4, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j4;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }
}
