package W7;

import A9.C0575f;
import A9.F;
import A9.K0;
import A9.U;
import F9.C0663f;
import F9.q;
import U7.h;
import U7.i;
import U7.m;
import android.app.Activity;
import com.applovin.mediation.ads.MaxInterstitialAd;
import kotlin.jvm.internal.l;

/* compiled from: ApplovinInterstitialProvider.kt */
/* loaded from: classes3.dex */
public final class d extends m<MaxInterstitialAd> {
    @Override // U7.m
    public final K0 c(Activity activity, String str, U7.c cVar, i iVar) {
        C0663f c0663fA = F.a(iVar.getContext());
        I9.c cVar2 = U.f211a;
        return C0575f.e(c0663fA, q.f1782a, null, new c(this, cVar, str, activity, null), 2);
    }

    @Override // U7.m
    public final void e(Activity activity, Object obj, h hVar) {
        MaxInterstitialAd interstitial = (MaxInterstitialAd) obj;
        l.f(activity, "activity");
        l.f(interstitial, "interstitial");
        interstitial.setListener(new b(hVar));
        interstitial.showAd(activity);
    }
}
