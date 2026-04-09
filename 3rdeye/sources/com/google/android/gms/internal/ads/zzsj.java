package com.google.android.gms.internal.ads;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzsj {
    public static final boolean zza;

    static {
        boolean z10 = false;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            }
        }
        zza = z10;
    }
}
