package w2;

import android.content.Context;
import android.os.RemoteException;
import j2.C2545a;
import java.util.List;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2969a {
    public abstract j2.r getSDKVersionInfo();

    public abstract j2.r getVersionInfo();

    public abstract void initialize(Context context, InterfaceC2970b interfaceC2970b, List<m> list);

    public void loadAppOpenAd(i iVar, InterfaceC2973e interfaceC2973e) {
        interfaceC2973e.k(new C2545a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(k kVar, InterfaceC2973e interfaceC2973e) {
        interfaceC2973e.k(new C2545a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(o oVar, InterfaceC2973e interfaceC2973e) {
        interfaceC2973e.k(new C2545a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(r rVar, InterfaceC2973e interfaceC2973e) {
        interfaceC2973e.k(new C2545a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(r rVar, InterfaceC2973e interfaceC2973e) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(u uVar, InterfaceC2973e interfaceC2973e) {
        interfaceC2973e.k(new C2545a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(u uVar, InterfaceC2973e interfaceC2973e) {
        interfaceC2973e.k(new C2545a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
