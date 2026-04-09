package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdgv implements zzhfy {
    private final zzhgh zza;

    public zzdgv(zzhgh zzhghVar) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdgs) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        zzhgg.zzb(setSingleton);
        return setSingleton;
    }
}
