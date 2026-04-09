package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbjj implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzcfe zzcfeVar = (zzcfe) obj;
        zzbgb zzbgbVarZzK = zzcfeVar.zzK();
        if (zzbgbVarZzK == null || (jSONObjectZzb = zzbgbVarZzK.zzb()) == null) {
            zzcfeVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcfeVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
