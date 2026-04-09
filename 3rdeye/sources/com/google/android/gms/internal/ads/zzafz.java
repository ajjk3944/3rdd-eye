package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzafz extends zzagd {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafz(zzaez zzaezVar) {
        super(zzaezVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zza(zzen zzenVar) throws zzagc {
        if (this.zzc) {
            zzenVar.zzM(1);
        } else {
            int iZzm = zzenVar.zzm();
            int i = iZzm >> 4;
            this.zze = i;
            if (i == 2) {
                int i10 = zzb[(iZzm >> 2) & 3];
                zzx zzxVar = new zzx();
                zzxVar.zzG("video/x-flv");
                zzxVar.zzah("audio/mpeg");
                zzxVar.zzD(1);
                zzxVar.zzai(i10);
                this.zza.zzm(zzxVar.zzan());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzx zzxVar2 = new zzx();
                zzxVar2.zzG("video/x-flv");
                zzxVar2.zzah(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzxVar2.zzD(1);
                zzxVar2.zzai(8000);
                this.zza.zzm(zzxVar2.zzan());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzagc(C4356c.h(i, "Audio format not supported: "));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zzb(zzen zzenVar, long j4) throws zzaz {
        if (this.zze == 2) {
            int iZza = zzenVar.zza();
            zzaez zzaezVar = this.zza;
            zzaezVar.zzr(zzenVar, iZza);
            zzaezVar.zzt(j4, 1, iZza, 0, null);
            return true;
        }
        int iZzm = zzenVar.zzm();
        if (iZzm != 0 || this.zzd) {
            if (this.zze == 10 && iZzm != 1) {
                return false;
            }
            int iZza2 = zzenVar.zza();
            zzaez zzaezVar2 = this.zza;
            zzaezVar2.zzr(zzenVar, iZza2);
            zzaezVar2.zzt(j4, 1, iZza2, 0, null);
            return true;
        }
        int iZza3 = zzenVar.zza();
        byte[] bArr = new byte[iZza3];
        zzenVar.zzH(bArr, 0, iZza3);
        zzaco zzacoVarZza = zzacq.zza(bArr);
        zzx zzxVar = new zzx();
        zzxVar.zzG("video/x-flv");
        zzxVar.zzah("audio/mp4a-latm");
        zzxVar.zzE(zzacoVarZza.zzc);
        zzxVar.zzD(zzacoVarZza.zzb);
        zzxVar.zzai(zzacoVarZza.zza);
        zzxVar.zzT(Collections.singletonList(bArr));
        this.zza.zzm(zzxVar.zzan());
        this.zzd = true;
        return false;
    }
}
