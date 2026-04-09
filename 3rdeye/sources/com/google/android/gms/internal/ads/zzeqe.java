package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeqe implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzeqe(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzhghVar2;
        this.zzb = zzhghVar3;
        this.zzc = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzerr zzerrVarZza = zzert.zza();
        zzeom zzeomVar = (zzeom) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            return new zzesg(zzeomVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmu)).intValue(), scheduledExecutorService);
        }
        return new zzesg(zzerrVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmu)).intValue(), scheduledExecutorService);
    }
}
