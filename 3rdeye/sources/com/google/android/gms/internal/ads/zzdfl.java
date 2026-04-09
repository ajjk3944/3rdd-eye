package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdfl implements zzhfy {
    private final zzhgh zza;

    public zzdfl(zzdey zzdeyVar, zzhgh zzhghVar) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzddo((zzcum) this.zza.zzb(), zzcad.zzg));
        zzhgg.zzb(setSingleton);
        return setSingleton;
    }
}
