package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import g0.C4356c;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfdl {
    public static void zza(Context context, boolean z10) {
        if (z10) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("This request is sent from a test device.");
        } else {
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            String strI = C1154e9.i("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", com.google.android.gms.ads.internal.util.client.zzf.zzD(context), "\")) to get test ads on this device.");
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strI);
        }
    }

    public static void zzb(int i, Throwable th, String str) {
        String strH = C4356c.h(i, "Ad failed to load : ");
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strH);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzv(th, str);
    }
}
