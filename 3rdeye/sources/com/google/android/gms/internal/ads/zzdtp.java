package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdtp implements zzdtd {
    private final long zza;
    private final zzeky zzb;

    public zzdtp(long j4, Context context, zzdti zzdtiVar, zzcgz zzcgzVar, String str) {
        this.zza = j4;
        zzezy zzezyVarZzu = zzcgzVar.zzu();
        zzezyVarZzu.zzc(context);
        zzezyVarZzu.zza(new com.google.android.gms.ads.internal.client.zzr());
        zzezyVarZzu.zzb(str);
        zzeky zzekyVarZza = zzezyVarZzu.zzd().zza();
        this.zzb = zzekyVarZza;
        zzekyVarZza.zzD(new zzdto(this, zzdtiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
