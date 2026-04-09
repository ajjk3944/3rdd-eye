package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbyc implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzbyc(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbyb((Clock) this.zza.zzb(), (com.google.android.gms.ads.internal.util.zzg) this.zzb.zzb(), (zzbym) this.zzc.zzb());
    }
}
