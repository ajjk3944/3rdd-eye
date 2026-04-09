package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcjf implements zzfbm {
    private final zzcij zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcjf(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    public final /* synthetic */ zzfbm zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    public final /* bridge */ /* synthetic */ zzfbm zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    public final zzfbn zzc() {
        zzhgg.zzc(this.zzb, Context.class);
        return new zzcjg(this.zza, this.zzb, this.zzc);
    }
}
