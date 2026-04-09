package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdsc {
    private final zzdsh zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdsc(zzdsh zzdshVar, Executor executor) {
        this.zza = zzdshVar;
        this.zzc = zzdshVar.zza();
        this.zzb = executor;
    }

    public final zzdsb zza() {
        zzdsb zzdsbVar = new zzdsb(this);
        zzdsb.zza(zzdsbVar);
        return zzdsbVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlQ)).booleanValue()) {
            zzdsb zzdsbVarZza = zza();
            zzdsbVarZza.zzb("action", "pecr");
            zzdsbVarZza.zzj();
        }
    }
}
