package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzduh implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;
    private final zzhgh zzf;
    private final zzhgh zzg;
    private final zzhgh zzh;
    private final zzhgh zzi;

    public zzduh(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5, zzhgh zzhghVar6, zzhgh zzhghVar7, zzhgh zzhghVar8, zzhgh zzhghVar9, zzhgh zzhghVar10) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar5;
        this.zze = zzhghVar6;
        this.zzf = zzhghVar7;
        this.zzg = zzhghVar8;
        this.zzh = zzhghVar9;
        this.zzi = zzhghVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdug((Executor) this.zza.zzb(), ((zzchg) this.zzb).zza(), ((zzchh) this.zzc).zza(), zzffm.zzc(), (zzdps) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzdsn) this.zzf.zzb(), ((zzchu) this.zzg).zza(), ((zzdcw) this.zzh).zzb(), (zzfhp) this.zzi.zzb());
    }
}
