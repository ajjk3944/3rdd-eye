package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcmm implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;
    private final zzhgh zzf;

    public zzcmm(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5, zzhgh zzhghVar6, zzhgh zzhghVar7) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
        this.zze = zzhghVar6;
        this.zzf = zzhghVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcml(((zzchg) this.zza).zza(), ((zzchd) this.zzb).zzb(), (zzeda) this.zzc.zzb(), (zzdph) this.zzd.zzb(), zzffm.zzc(), (zzgdm) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb());
    }
}
