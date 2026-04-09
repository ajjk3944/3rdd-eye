package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcsv implements com.google.android.gms.ads.internal.client.zza {
    private final zzcsz zza;
    private final zzfco zzb;

    public zzcsv(zzcsz zzcszVar, zzfco zzfcoVar) {
        this.zza = zzcszVar;
        this.zzb = zzfcoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
