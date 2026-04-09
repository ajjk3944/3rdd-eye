package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfmy {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfmx(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfmu.zza() != zzflj.CTV) {
            return 2;
        }
        return zza;
    }
}
