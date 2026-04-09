package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbcp extends zzbct {
    public zzbcp(int i, String str, Long l5, Long l10) {
        super(1, str, l5, l10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zzm(), ((Long) zzl()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzm())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzm()))) : (Long) zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzm(), ((Long) zzl()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(zzm(), ((Long) obj).longValue());
    }
}
