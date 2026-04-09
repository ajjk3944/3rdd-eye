package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbji implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZza;
        zzcfe zzcfeVar = (zzcfe) obj;
        zzbgb zzbgbVarZzK = zzcfeVar.zzK();
        if (zzbgbVarZzK == null || (jSONObjectZza = zzbgbVarZzK.zza()) == null) {
            zzcfeVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcfeVar.zze("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
