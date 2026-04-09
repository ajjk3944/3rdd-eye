package V7;

import P7.t;
import U7.h;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import g0.C4356c;
import kotlin.jvm.internal.l;

/* compiled from: AdMobInterstitialProvider.kt */
/* loaded from: classes3.dex */
public final class d extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f13048a;

    public d(h hVar) {
        this.f13048a = hVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        va.a.f47104a.a("[InterstitialManager] AdMob onAdClicked", new Object[0]);
        this.f13048a.a();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        va.a.f47104a.a("[InterstitialManager] AdMob onAdDismissedFullScreenContent", new Object[0]);
        this.f13048a.b();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError error) {
        l.f(error, "error");
        va.a.f47104a.a(C4356c.h(error.getCode(), "[InterstitialManager] AdMob onAdFailedToShowFullScreenContent. Error code="), new Object[0]);
        int code = error.getCode();
        this.f13048a.c(code != 0 ? code != 1 ? code != 2 ? code != 3 ? new t.o(error.getCode()) : t.m.f10809b : t.i.f10805b : t.g.f10803b : new t.f(error.getMessage()));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        va.a.f47104a.a("[InterstitialManager] AdMob onAdImpression", new Object[0]);
        this.f13048a.d();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        va.a.f47104a.a("[InterstitialManager] AdMob onAdShowedFullScreenContent", new Object[0]);
        this.f13048a.e();
    }
}
