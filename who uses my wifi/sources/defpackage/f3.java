package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class f3 {
    public abstract d51 getSDKVersionInfo();

    public abstract d51 getVersionInfo();

    public abstract void initialize(Context context, r20 r20Var, List<pz> list);

    public void loadAppOpenAd(dd0 dd0Var, ad0 ad0Var) {
        ad0Var.C(new r2(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(ed0 ed0Var, ad0 ad0Var) {
        ad0Var.C(new r2(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(gd0 gd0Var, ad0 ad0Var) {
        ad0Var.C(new r2(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(id0 id0Var, ad0 ad0Var) {
        ad0Var.C(new r2(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(id0 id0Var, ad0 ad0Var) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(kd0 kd0Var, ad0 ad0Var) {
        ad0Var.C(new r2(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(kd0 kd0Var, ad0 ad0Var) {
        ad0Var.C(new r2(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
