package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbkv implements zzbkd {
    private final zzbku zza;

    public zzbkv(zzbku zzbkuVar) {
        this.zza = zzbkuVar;
    }

    public static void zzb(zzcfe zzcfeVar, zzbku zzbkuVar) {
        zzcfeVar.zzag("/reward", new zzbkv(zzbkuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws NumberFormatException {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzbwm zzbwmVar = null;
        try {
            int i = Integer.parseInt((String) map.get(AppLovinEventParameters.REVENUE_AMOUNT));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbwmVar = new zzbwm(str2, i);
            }
        } catch (NumberFormatException e4) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to parse reward amount.", e4);
        }
        this.zza.zza(zzbwmVar);
    }
}
