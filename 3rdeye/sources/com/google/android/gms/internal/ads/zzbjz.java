package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbjz implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcfeVar.zzdg();
        } else if ("resume".equals(str)) {
            zzcfeVar.zzdh();
        }
    }
}
