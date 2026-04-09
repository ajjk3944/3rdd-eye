package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzduq implements zzhfy {
    private final zzhgh zza;

    public zzduq(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
    }

    public static zzddo zza(zzdup zzdupVar, Executor executor) {
        return new zzddo(zzdupVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzdup) this.zza.zzb(), zzffm.zzc());
    }
}
