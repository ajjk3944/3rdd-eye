package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdfr implements zzhfy {
    private final zzdey zza;
    private final zzhgh zzb;

    public zzdfr(zzdey zzdeyVar, zzhgh zzhghVar) {
        this.zza = zzdeyVar;
        this.zzb = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
