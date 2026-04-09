package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzafm implements zzafh {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzafm(int i, int i10, int i11, int i12) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
    }

    public static zzafm zzb(zzen zzenVar) {
        int iZzi = zzenVar.zzi();
        zzenVar.zzM(8);
        int iZzi2 = zzenVar.zzi();
        int iZzi3 = zzenVar.zzi();
        zzenVar.zzM(4);
        int iZzi4 = zzenVar.zzi();
        zzenVar.zzM(12);
        return new zzafm(iZzi, iZzi2, iZzi3, iZzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final int zza() {
        return 1751742049;
    }
}
