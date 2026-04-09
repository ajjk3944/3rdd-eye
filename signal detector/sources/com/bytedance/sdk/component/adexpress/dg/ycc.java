package com.bytedance.sdk.component.adexpress.dg;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class ycc {
    public static boolean emc(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean ypw(String str) {
        return com.bytedance.sdk.component.adexpress.dg.ypw() && emc(str);
    }
}
