package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzetc implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;
    private final zzhgh zzf;
    private final zzhgh zzg;
    private final zzhgh zzh;
    private final zzhgh zzi;

    public zzetc(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5, zzhgh zzhghVar6, zzhgh zzhghVar7, zzhgh zzhghVar8, zzhgh zzhghVar9, zzhgh zzhghVar10) {
        this.zza = zzhghVar2;
        this.zzb = zzhghVar3;
        this.zzc = zzhghVar4;
        this.zzd = zzhghVar5;
        this.zze = zzhghVar6;
        this.zzf = zzhghVar7;
        this.zzg = zzhghVar8;
        this.zzh = zzhghVar9;
        this.zzi = zzhghVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeta(zzffm.zzc(), (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzejm) this.zzc.zzb(), (Context) this.zzd.zzb(), ((zzcvi) this.zze).zza(), (zzeji) this.zzf.zzb(), (zzdps) this.zzg.zzb(), (zzdui) this.zzh.zzb(), ((Integer) this.zzi.zzb()).intValue());
    }
}
