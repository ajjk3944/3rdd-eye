package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdfv implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzcxx zza;
    private final zzddi zzb;

    public zzdfv(zzcxx zzcxxVar, zzddi zzddiVar) {
        this.zza = zzcxxVar;
        this.zzb = zzddiVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
        this.zza.zzdH();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds() {
        this.zza.zzds();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        this.zza.zzdt();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        this.zza.zzdv();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw(int i) {
        this.zza.zzdw(i);
        this.zzb.zza();
    }
}
