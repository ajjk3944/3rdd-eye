package com.bytedance.sdk.component.adexpress.yu;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    public static boolean ouw(String str) {
        return com.bytedance.sdk.component.adexpress.yu.vt() && vt(str);
    }

    private static boolean vt(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }
}
