package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcpe implements zzhfy {
    private final zzcou zza;
    private final zzhgh zzb;

    public zzcpe(zzcou zzcouVar, zzhgh zzhghVar) {
        this.zza = zzcouVar;
        this.zzb = zzhghVar;
    }

    public static Set zza(zzcou zzcouVar, zzcqk zzcqkVar) {
        Set setSingleton = Collections.singleton(new zzddo(zzcqkVar, zzcad.zzg));
        zzhgg.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcqk) this.zzb.zzb());
    }
}
