package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeeq implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzeeq(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeep zzb() {
        return new zzeep((Context) this.zza.zzb(), (zzcps) this.zzb.zzb());
    }
}
