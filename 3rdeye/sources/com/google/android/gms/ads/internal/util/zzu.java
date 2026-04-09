package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbdc;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@TargetApi(24)
/* loaded from: classes.dex */
public class zzu extends zzt {
    public static final boolean zze(int i, int i10, int i11) {
        return Math.abs(i - i10) <= i11;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzd(Activity activity, Configuration configuration) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfj)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfl)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, configuration.screenHeightDp);
            int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, configuration.screenWidthDp);
            WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
            com.google.android.gms.ads.internal.zzv.zzr();
            DisplayMetrics displayMetricsZzu = zzs.zzu(windowManager);
            int i = displayMetricsZzu.heightPixels;
            int i10 = displayMetricsZzu.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfh)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
            if (!zze(i, iZzC + dimensionPixelSize, iIntValue) || !zze(i10, iZzC2, iIntValue)) {
                return true;
            }
        }
        return false;
    }
}
