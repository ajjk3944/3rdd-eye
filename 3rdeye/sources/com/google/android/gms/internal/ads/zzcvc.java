package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcvc implements zzhfy {
    private final zzcva zza;
    private final zzhgh zzb;

    public zzcvc(zzcva zzcvaVar, zzhgh zzhghVar) {
        this.zza = zzcvaVar;
        this.zzb = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzb = this.zza.zzb(((zzchg) this.zzb).zza());
        zzhgg.zzb(contextZzb);
        return contextZzb;
    }
}
