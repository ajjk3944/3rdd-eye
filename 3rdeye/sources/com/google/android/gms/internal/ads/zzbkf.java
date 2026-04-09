package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbkf implements zzbkd {
    private final zzbkg zza;

    public zzbkf(zzbkg zzbkgVar) {
        this.zza = zzbkgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcfe zzcfeVar = (zzcfe) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to parse float", e4);
        }
        zzbkg zzbkgVar = this.zza;
        zzbkgVar.zzc(zEquals);
        zzbkgVar.zzb(zEquals2, f10);
        zzcfeVar.zzay(zEquals);
    }
}
