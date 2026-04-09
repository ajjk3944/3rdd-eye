package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzciy implements zzdtm {
    private final zzcij zza;
    private Context zzb;
    private zzblc zzc;

    public /* synthetic */ zzciy(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final /* bridge */ /* synthetic */ zzdtm zza(zzblc zzblcVar) {
        zzblcVar.getClass();
        this.zzc = zzblcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final /* bridge */ /* synthetic */ zzdtm zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtm
    public final zzdtn zzc() {
        zzhgg.zzc(this.zzb, Context.class);
        zzhgg.zzc(this.zzc, zzblc.class);
        return new zzciz(this.zza, this.zzb, this.zzc);
    }
}
