package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeuw implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;

    public zzeuw(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5, zzhgh zzhghVar6, zzhgh zzhghVar7) {
        this.zza = zzhghVar2;
        this.zzb = zzhghVar3;
        this.zzc = zzhghVar5;
        this.zzd = zzhghVar6;
        this.zze = zzhghVar7;
    }

    public static zzeuu zza(zzbzh zzbzhVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z10, boolean z11) {
        return new zzeuu(zzbzhVar, context, scheduledExecutorService, executor, i, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeuu(zzcku.zza(), ((zzchg) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzffm.zzc(), ((zzewc) this.zzc).zzb().intValue(), ((zzewd) this.zzd).zzb().booleanValue(), ((zzewf) this.zze).zzb().booleanValue());
    }
}
