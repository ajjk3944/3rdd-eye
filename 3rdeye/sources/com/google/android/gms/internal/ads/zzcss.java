package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcss implements zzhfy {
    private final zzhgh zza;

    public zzcss(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
    }

    public static zzddo zza(zzcmx zzcmxVar, Executor executor) {
        return new zzddo(zzcmxVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzcmx) this.zza.zzb(), zzffm.zzc());
    }
}
