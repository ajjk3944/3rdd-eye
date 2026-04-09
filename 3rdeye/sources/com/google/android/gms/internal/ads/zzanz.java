package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzanz implements zzaom {
    private final zzany zza;
    private final zzen zzb = new zzen(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzanz(zzany zzanyVar) {
        this.zza = zzanyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zza(zzen zzenVar, int i) {
        int i10 = i & 1;
        int iZzc = i10 != 0 ? zzenVar.zzc() + zzenVar.zzm() : -1;
        if (this.zzf) {
            if (i10 == 0) {
                return;
            }
            this.zzf = false;
            zzenVar.zzL(iZzc);
            this.zzd = 0;
        }
        while (zzenVar.zza() > 0) {
            int i11 = this.zzd;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iZzm = zzenVar.zzm();
                    zzenVar.zzL(zzenVar.zzc() - 1);
                    if (iZzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzenVar.zza(), 3 - this.zzd);
                zzen zzenVar2 = this.zzb;
                zzenVar.zzH(zzenVar2.zzN(), this.zzd, iMin);
                int i12 = this.zzd + iMin;
                this.zzd = i12;
                if (i12 == 3) {
                    zzenVar2.zzL(0);
                    zzenVar2.zzK(3);
                    zzenVar2.zzM(1);
                    int iZzm2 = zzenVar2.zzm();
                    boolean z10 = (iZzm2 & 128) != 0;
                    int iZzm3 = zzenVar2.zzm();
                    this.zze = z10;
                    this.zzc = (((iZzm2 & 15) << 8) | iZzm3) + 3;
                    int iZzb = zzenVar2.zzb();
                    int i13 = this.zzc;
                    if (iZzb < i13) {
                        int iZzb2 = zzenVar2.zzb();
                        zzenVar2.zzF(Math.min(4098, Math.max(i13, iZzb2 + iZzb2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzenVar.zza(), this.zzc - this.zzd);
                zzen zzenVar3 = this.zzb;
                zzenVar.zzH(zzenVar3.zzN(), this.zzd, iMin2);
                int i14 = this.zzd + iMin2;
                this.zzd = i14;
                int i15 = this.zzc;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzenVar3.zzK(i15);
                    } else {
                        if (zzex.zzf(zzenVar3.zzN(), 0, i15, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzenVar3.zzK(this.zzc - 4);
                    }
                    zzenVar3.zzL(0);
                    this.zza.zza(zzenVar3);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzb(zzeu zzeuVar, zzadw zzadwVar, zzaol zzaolVar) {
        this.zza.zzb(zzeuVar, zzadwVar, zzaolVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzc() {
        this.zzf = true;
    }
}
