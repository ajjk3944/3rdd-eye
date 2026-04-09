package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzakb extends zzakf {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzen zzenVar) {
        return zzk(zzenVar, zza);
    }

    private static boolean zzk(zzen zzenVar, byte[] bArr) {
        if (zzenVar.zza() < 8) {
            return false;
        }
        int iZzc = zzenVar.zzc();
        byte[] bArr2 = new byte[8];
        zzenVar.zzH(bArr2, 0, 8);
        zzenVar.zzL(iZzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final long zza(zzen zzenVar) {
        return zzg(zzaeo.zzd(zzenVar.zzN()));
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final boolean zzc(zzen zzenVar, long j4, zzakc zzakcVar) throws zzaz {
        if (zzk(zzenVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzenVar.zzN(), zzenVar.zzd());
            int i = bArrCopyOf[9] & 255;
            List listZze = zzaeo.zze(bArrCopyOf);
            if (zzakcVar.zza == null) {
                zzx zzxVar = new zzx();
                zzxVar.zzG("audio/ogg");
                zzxVar.zzah("audio/opus");
                zzxVar.zzD(i);
                zzxVar.zzai(48000);
                zzxVar.zzT(listZze);
                zzakcVar.zza = zzxVar.zzan();
                return true;
            }
        } else {
            if (!zzk(zzenVar, zzb)) {
                zzdd.zzb(zzakcVar.zza);
                return false;
            }
            zzdd.zzb(zzakcVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzenVar.zzM(8);
                zzav zzavVarZzb = zzaff.zzb(zzfyf.zzm(zzaff.zzc(zzenVar, false, false).zza));
                if (zzavVarZzb != null) {
                    zzx zzxVarZzb = zzakcVar.zza.zzb();
                    zzxVarZzb.zzaa(zzavVarZzb.zzd(zzakcVar.zza.zzl));
                    zzakcVar.zza = zzxVarZzb.zzan();
                }
            }
        }
        return true;
    }
}
