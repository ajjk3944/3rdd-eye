package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzesr implements zzetu {
    private final String zza;
    private final int zzb;

    public zzesr(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return zzgdb.zzh(new zzess(this.zza, this.zzb));
    }
}
