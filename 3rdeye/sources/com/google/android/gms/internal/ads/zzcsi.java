package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcsi implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzcsi(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzchx) this.zzb).zzb().zzc((Clock) this.zza.zzb(), ((zzcvi) this.zzc).zza().zzf);
    }
}
