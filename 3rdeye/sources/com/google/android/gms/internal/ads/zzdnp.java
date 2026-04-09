package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdnp implements zzbkd {
    final /* synthetic */ zzdnr zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbkd zzd;

    public /* synthetic */ zzdnp(zzdnr zzdnrVar, WeakReference weakReference, String str, zzbkd zzbkdVar, zzdnq zzdnqVar) {
        this.zza = zzdnrVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbkdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
