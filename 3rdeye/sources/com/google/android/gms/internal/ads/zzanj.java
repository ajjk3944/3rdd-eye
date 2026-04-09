package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzanj implements zzamx {
    private final zzen zza;
    private final zzael zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzaez zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzanj(String str, int i, String str2) {
        zzen zzenVar = new zzen(4);
        this.zza = zzenVar;
        zzenVar.zzN()[0] = -1;
        this.zzb = new zzael();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zza(zzen zzenVar) {
        zzdd.zzb(this.zzf);
        while (zzenVar.zza() > 0) {
            int i = this.zzh;
            if (i == 0) {
                byte[] bArrZzN = zzenVar.zzN();
                int iZzc = zzenVar.zzc();
                int iZzd = zzenVar.zzd();
                while (true) {
                    if (iZzc >= iZzd) {
                        zzenVar.zzL(iZzd);
                        break;
                    }
                    int i10 = iZzc + 1;
                    byte b10 = bArrZzN[iZzc];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.zzk && (b10 & 224) == 224;
                    this.zzk = z10;
                    if (z11) {
                        zzenVar.zzL(i10);
                        this.zzk = false;
                        this.zza.zzN()[1] = bArrZzN[iZzc];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    iZzc = i10;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzenVar.zza(), this.zzm - this.zzi);
                this.zzf.zzr(zzenVar, iMin);
                int i11 = this.zzi + iMin;
                this.zzi = i11;
                if (i11 >= this.zzm) {
                    zzdd.zzf(this.zzn != -9223372036854775807L);
                    this.zzf.zzt(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int iMin2 = Math.min(zzenVar.zza(), 4 - this.zzi);
                zzen zzenVar2 = this.zza;
                zzenVar.zzH(zzenVar2.zzN(), this.zzi, iMin2);
                int i12 = this.zzi + iMin2;
                this.zzi = i12;
                if (i12 >= 4) {
                    zzenVar2.zzL(0);
                    zzael zzaelVar = this.zzb;
                    if (zzaelVar.zza(zzenVar2.zzg())) {
                        this.zzm = zzaelVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (zzaelVar.zzg * 1000000) / zzaelVar.zzd;
                            zzx zzxVar = new zzx();
                            zzxVar.zzS(this.zzg);
                            zzxVar.zzG(this.zze);
                            zzxVar.zzah(zzaelVar.zzb);
                            zzxVar.zzX(4096);
                            zzxVar.zzD(zzaelVar.zze);
                            zzxVar.zzai(zzaelVar.zzd);
                            zzxVar.zzW(this.zzc);
                            zzxVar.zzaf(this.zzd);
                            this.zzf.zzm(zzxVar.zzan());
                            this.zzj = true;
                        }
                        zzenVar2.zzL(0);
                        this.zzf.zzr(zzenVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzg = zzaolVar.zzb();
        this.zzf = zzadwVar.zzw(zzaolVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j4, int i) {
        this.zzn = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z10) {
    }
}
