package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzchn implements zzhfy {
    private final zzhgh zza;

    public zzchn(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbN)).booleanValue() ? Collections.singleton(new zzddo((zzdui) this.zza.zzb(), zzffm.zzc())) : Collections.EMPTY_SET;
        zzhgg.zzb(setSingleton);
        return setSingleton;
    }
}
