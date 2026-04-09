package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzamp implements zzamx {
    private final zzem zza;
    private final zzen zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaez zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private long zzn;

    public zzamp(String str, int i, String str2) {
        zzem zzemVar = new zzem(new byte[128], 128);
        this.zza = zzemVar;
        this.zzb = new zzen(zzemVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zza(zzen zzenVar) {
        zzdd.zzb(this.zzg);
        while (zzenVar.zza() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (true) {
                    if (zzenVar.zza() <= 0) {
                        break;
                    }
                    if (this.zzj) {
                        int iZzm = zzenVar.zzm();
                        if (iZzm == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzen zzenVar2 = this.zzb;
                            zzenVar2.zzN()[0] = 11;
                            zzenVar2.zzN()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = iZzm == 11;
                    } else {
                        this.zzj = zzenVar.zzm() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzenVar.zza(), this.zzm - this.zzi);
                this.zzg.zzr(zzenVar, iMin);
                int i10 = this.zzi + iMin;
                this.zzi = i10;
                if (i10 == this.zzm) {
                    zzdd.zzf(this.zzn != -9223372036854775807L);
                    this.zzg.zzt(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzen zzenVar3 = this.zzb;
                byte[] bArrZzN = zzenVar3.zzN();
                int iMin2 = Math.min(zzenVar.zza(), 128 - this.zzi);
                zzenVar.zzH(bArrZzN, this.zzi, iMin2);
                int i11 = this.zzi + iMin2;
                this.zzi = i11;
                if (i11 == 128) {
                    zzem zzemVar = this.zza;
                    zzemVar.zzl(0);
                    zzacr zzacrVarZze = zzact.zze(zzemVar);
                    zzz zzzVar = this.zzl;
                    if (zzzVar == null || zzacrVarZze.zzc != zzzVar.zzG || zzacrVarZze.zzb != zzzVar.zzH || !Objects.equals(zzacrVarZze.zza, zzzVar.zzo)) {
                        zzx zzxVar = new zzx();
                        zzxVar.zzS(this.zzf);
                        zzxVar.zzG(this.zze);
                        String str = zzacrVarZze.zza;
                        zzxVar.zzah(str);
                        zzxVar.zzD(zzacrVarZze.zzc);
                        zzxVar.zzai(zzacrVarZze.zzb);
                        zzxVar.zzW(this.zzc);
                        zzxVar.zzaf(this.zzd);
                        int i12 = zzacrVarZze.zzf;
                        zzxVar.zzac(i12);
                        if ("audio/ac3".equals(str)) {
                            zzxVar.zzC(i12);
                        }
                        zzz zzzVarZzan = zzxVar.zzan();
                        this.zzl = zzzVarZzan;
                        this.zzg.zzm(zzzVarZzan);
                    }
                    this.zzm = zzacrVarZze.zzd;
                    this.zzk = (zzacrVarZze.zze * 1000000) / this.zzl.zzH;
                    zzenVar3.zzL(0);
                    this.zzg.zzr(zzenVar3, 128);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzf = zzaolVar.zzb();
        this.zzg = zzadwVar.zzw(zzaolVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j4, int i) {
        this.zzn = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z10) {
    }
}
