package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdsv implements zzhfy {
    private final zzdsr zza;
    private final zzhgh zzb;

    public zzdsv(zzdsr zzdsrVar, zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzdsrVar;
        this.zzb = zzhghVar;
    }

    public static Set zza(zzdsr zzdsrVar, zzdtb zzdtbVar, Executor executor) {
        Set setZzd = zzdsr.zzd(zzdtbVar, executor);
        zzhgg.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzdtb) this.zzb.zzb(), zzffm.zzc());
    }
}
