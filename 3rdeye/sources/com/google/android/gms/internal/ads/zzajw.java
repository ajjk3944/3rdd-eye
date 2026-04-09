package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzajw extends zzakf {
    private zzaee zza;
    private zzajv zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final long zza(zzen zzenVar) {
        if (!zzd(zzenVar.zzN())) {
            return -1L;
        }
        int i = (zzenVar.zzN()[2] & 255) >> 4;
        if (i == 6) {
            zzenVar.zzM(4);
            zzenVar.zzx();
        } else if (i == 7) {
            i = 7;
            zzenVar.zzM(4);
            zzenVar.zzx();
        }
        int iZza = zzaea.zza(zzenVar, i);
        zzenVar.zzL(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final boolean zzc(zzen zzenVar, long j4, zzakc zzakcVar) {
        byte[] bArrZzN = zzenVar.zzN();
        zzaee zzaeeVar = this.zza;
        if (zzaeeVar == null) {
            zzaee zzaeeVar2 = new zzaee(bArrZzN, 17);
            this.zza = zzaeeVar2;
            zzx zzxVarZzb = zzaeeVar2.zzc(Arrays.copyOfRange(bArrZzN, 9, zzenVar.zzd()), null).zzb();
            zzxVarZzb.zzG("audio/ogg");
            zzakcVar.zza = zzxVarZzb.zzan();
            return true;
        }
        if ((bArrZzN[0] & 127) == 3) {
            zzaed zzaedVarZzb = zzaeb.zzb(zzenVar);
            zzaee zzaeeVarZzf = zzaeeVar.zzf(zzaedVarZzb);
            this.zza = zzaeeVarZzf;
            this.zzb = new zzajv(zzaeeVarZzf, zzaedVarZzb);
            return true;
        }
        if (!zzd(bArrZzN)) {
            return true;
        }
        zzajv zzajvVar = this.zzb;
        if (zzajvVar != null) {
            zzajvVar.zza(j4);
            zzakcVar.zzb = this.zzb;
        }
        zzakcVar.zza.getClass();
        return false;
    }
}
