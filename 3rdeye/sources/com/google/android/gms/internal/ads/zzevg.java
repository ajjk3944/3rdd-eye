package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzevg implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzevg(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar3;
        this.zzc = zzhghVar4;
    }

    public static zzeve zza(String str, zzbbd zzbbdVar, zzbzq zzbzqVar, ScheduledExecutorService scheduledExecutorService, zzgdm zzgdmVar) {
        return new zzeve(str, zzbbdVar, zzbzqVar, scheduledExecutorService, zzgdmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeve(((zzewb) this.zza).zza(), zzckm.zza(), (zzbzq) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzffm.zzc());
    }
}
