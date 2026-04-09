package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeph implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzeph(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzhghVar2;
        this.zzb = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeom(zzert.zza(), ((Long) zzber.zzf.zze()).longValue(), (Clock) this.zza.zzb(), zzffm.zzc(), (zzdsc) this.zzb.zzb());
    }
}
