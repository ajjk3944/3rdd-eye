package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzafn implements zzafh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzafn(int i, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
    }

    public static zzafn zzd(zzen zzenVar) {
        int iZzi = zzenVar.zzi();
        zzenVar.zzM(12);
        int iZzi2 = zzenVar.zzi();
        int iZzi3 = zzenVar.zzi();
        int iZzi4 = zzenVar.zzi();
        zzenVar.zzM(4);
        int iZzi5 = zzenVar.zzi();
        int iZzi6 = zzenVar.zzi();
        zzenVar.zzM(4);
        return new zzafn(iZzi, iZzi2, iZzi3, iZzi4, iZzi5, iZzi6, zzenVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final int zza() {
        return 1752331379;
    }

    public final int zzb() {
        int i = this.zza;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        zzea.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
        return -1;
    }

    public final long zzc() {
        return zzex.zzu(this.zzd, this.zzb * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
