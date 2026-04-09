package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfsh extends zzfst {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfst
    public final zzfst zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfst
    public final zzfst zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfst
    public final zzfsu zzc() {
        return new zzfsj(this.zza, this.zzb, null);
    }
}
