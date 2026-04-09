package com.google.ads.mediation.unity;

import android.app.Activity;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

/* loaded from: classes.dex */
public class c {
    public d a(Activity activity, String str, UnityBannerSize unityBannerSize) {
        return new d(new BannerView(activity, str, unityBannerSize));
    }
}
