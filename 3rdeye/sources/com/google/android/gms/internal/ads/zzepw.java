package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzepw implements zzhfy {
    private final zzhgh zza;

    public zzepw(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfyk zzfykVarZzn;
        zzeoo zzeooVarZza = zzeoq.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeo)).booleanValue()) {
            zzfykVarZzn = zzfyk.zzo(new zzesg(zzeooVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzep)).intValue(), scheduledExecutorService));
        } else {
            zzfykVarZzn = zzfyk.zzn();
        }
        zzhgg.zzb(zzfykVarZzn);
        return zzfykVarZzn;
    }
}
