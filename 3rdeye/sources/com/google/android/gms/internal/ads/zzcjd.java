package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcjd implements zzezy {
    private final zzcij zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    public /* synthetic */ zzcjd(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final /* bridge */ /* synthetic */ zzezy zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final /* bridge */ /* synthetic */ zzezy zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final /* bridge */ /* synthetic */ zzezy zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final zzezz zzd() {
        zzhgg.zzc(this.zzb, Context.class);
        zzhgg.zzc(this.zzc, String.class);
        zzhgg.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcje(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
