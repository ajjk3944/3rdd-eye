package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfsq extends zzftt {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzftt
    public final zzftt zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final zzftt zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final zzftu zzc() {
        return new zzfss(this.zza, this.zzb, null);
    }
}
