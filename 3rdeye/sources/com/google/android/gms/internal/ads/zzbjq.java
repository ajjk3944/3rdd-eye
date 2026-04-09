package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbjq implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfe zzcfeVar = (zzcfe) obj;
        try {
            String str = (String) map.get("enabled");
            zzbkd zzbkdVar = zzbkc.zza;
            if (!zzfuk.zzc("true", str) && !zzfuk.zzc("false", str)) {
                return;
            }
            zzfrs.zza(zzcfeVar.getContext()).zzb(Boolean.parseBoolean(str));
        } catch (IOException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
