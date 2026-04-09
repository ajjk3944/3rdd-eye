package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbka implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        if (map.keySet().contains("start")) {
            zzcfeVar.zzN().zzp();
        } else if (map.keySet().contains("stop")) {
            zzcfeVar.zzN().zzq();
        } else if (map.keySet().contains("cancel")) {
            zzcfeVar.zzN().zzo();
        }
    }
}
