package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcpn implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzcpn(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesg(((zzeob) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmL)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
