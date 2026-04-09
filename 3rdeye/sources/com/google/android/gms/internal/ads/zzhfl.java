package com.google.android.gms.internal.ads;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhfl extends zzhfq {
    final String zza;

    public zzhfl(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhfq
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb.append(str2);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
