package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcin implements zzewt {
    private final zzcij zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcin(zzcij zzcijVar, zzcjn zzcjnVar) {
        this.zza = zzcijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final /* bridge */ /* synthetic */ zzewt zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final /* bridge */ /* synthetic */ zzewt zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final zzewu zzc() {
        zzhgg.zzc(this.zzb, Context.class);
        zzhgg.zzc(this.zzc, String.class);
        return new zzcio(this.zza, this.zzb, this.zzc);
    }
}
