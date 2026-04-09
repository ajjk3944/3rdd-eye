package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzclz implements zzclb {
    private final zzdvb zza;

    public zzclz(zzdvb zzdvbVar) {
        this.zza = zzdvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(Map map) throws JSONException {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals("true"));
    }
}
