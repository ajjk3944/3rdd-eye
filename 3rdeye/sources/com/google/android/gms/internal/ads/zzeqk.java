package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeqk implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;

    public zzeqk(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeti zzetiVarZzb = ((zzetk) this.zza).zzb();
        zzeom zzeomVar = (zzeom) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("35")) {
            return new zzesg(zzeomVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmp)).intValue(), scheduledExecutorService);
        }
        return new zzesg(zzetiVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmp)).intValue(), scheduledExecutorService);
    }
}
