package com.google.android.gms.ads.internal.util;

import A4.a;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzcag;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbey.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    return;
                }
                a aVarZzb = new zzc(context).zzb();
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Updating ad debug logging enablement.");
                zzcag.zza(aVarZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to determine debug setting.", e4);
            }
        }
    }
}
