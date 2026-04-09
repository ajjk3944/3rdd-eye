package com.google.android.gms.internal.ads;

import g0.C4356c;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzage extends zzagd {
    private final zzen zzb;
    private final zzen zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzage(zzaez zzaezVar) {
        super(zzaezVar);
        this.zzb = new zzen(zzfv.zza);
        this.zzc = new zzen(4);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zza(zzen zzenVar) throws zzagc {
        int iZzm = zzenVar.zzm();
        int i = iZzm >> 4;
        int i10 = iZzm & 15;
        if (i10 != 7) {
            throw new zzagc(C4356c.h(i10, "Video format not supported: "));
        }
        this.zzg = i;
        return i != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zzb(zzen zzenVar, long j4) throws zzaz {
        int i;
        int iZzm = zzenVar.zzm();
        long jZzh = zzenVar.zzh();
        if (iZzm == 0) {
            if (!this.zze) {
                zzen zzenVar2 = new zzen(new byte[zzenVar.zza()]);
                zzenVar.zzH(zzenVar2.zzN(), 0, zzenVar.zza());
                zzacy zzacyVarZza = zzacy.zza(zzenVar2);
                this.zzd = zzacyVarZza.zzb;
                zzx zzxVar = new zzx();
                zzxVar.zzG("video/x-flv");
                zzxVar.zzah("video/avc");
                zzxVar.zzE(zzacyVarZza.zzl);
                zzxVar.zzam(zzacyVarZza.zzc);
                zzxVar.zzQ(zzacyVarZza.zzd);
                zzxVar.zzad(zzacyVarZza.zzk);
                zzxVar.zzT(zzacyVarZza.zza);
                this.zza.zzm(zzxVar.zzan());
                this.zze = true;
                return false;
            }
        } else if (iZzm == 1 && this.zze) {
            int i10 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i10;
            } else if (i10 != 0) {
                i = 1;
            }
            zzen zzenVar3 = this.zzc;
            byte[] bArrZzN = zzenVar3.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i11 = 4 - this.zzd;
            int i12 = 0;
            while (zzenVar.zza() > 0) {
                zzenVar.zzH(zzenVar3.zzN(), i11, this.zzd);
                zzenVar3.zzL(0);
                zzen zzenVar4 = this.zzb;
                int iZzp = zzenVar3.zzp();
                zzenVar4.zzL(0);
                zzaez zzaezVar = this.zza;
                zzaezVar.zzr(zzenVar4, 4);
                zzaezVar.zzr(zzenVar, iZzp);
                i12 = i12 + 4 + iZzp;
            }
            this.zza.zzt((jZzh * 1000) + j4, i, i12, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
