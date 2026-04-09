package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcpp implements zzcwl {
    private final zzcfe zza;
    private final zzdsc zzb;
    private final zzfbt zzc;

    public zzcpp(zzcfe zzcfeVar, zzdsc zzdscVar, zzfbt zzfbtVar) {
        this.zza = zzcfeVar;
        this.zzb = zzdscVar;
        this.zzc = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        zzcfe zzcfeVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznc)).booleanValue() || (zzcfeVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzac.zza(zzcfeVar.zzF()) ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        zzdsb zzdsbVarZza = this.zzb.zza();
        zzdsbVarZza.zzb("action", "hcp");
        zzdsbVarZza.zzb("hcp", str);
        zzdsbVarZza.zzc(this.zzc);
        zzdsbVarZza.zzj();
    }
}
