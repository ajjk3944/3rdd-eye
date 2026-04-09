package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzchf implements zzhfy {
    private final zzhgh zza;

    public zzchf(zzhgh zzhghVar) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzchg) this.zza).zza().getApplicationInfo();
        zzhgg.zzb(applicationInfo);
        return applicationInfo;
    }
}
