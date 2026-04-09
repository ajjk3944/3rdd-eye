package mg;

import cm.g;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.UserMessagingPlatform;
import com.liuzh.deviceinfo.splash.SplashActivity;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final List f29370b = g.t("AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IS", "IE", "IT", "LV", "LI", "LT", "LU", "MT", "NL", "NO", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB", "CH");

    /* renamed from: a, reason: collision with root package name */
    public final ConsentInformation f29371a;

    public c(SplashActivity splashActivity) {
        this.f29371a = UserMessagingPlatform.getConsentInformation(splashActivity);
    }

    public final void a(i.g gVar, a aVar) {
        ConsentInformation consentInformation = this.f29371a;
        consentInformation.canRequestAds();
        if (ci.b.u()) {
            consentInformation.requestConsentInfoUpdate(gVar, new ConsentRequestParameters.Builder().setTagForUnderAgeOfConsent(false).build(), new ah.d(this, gVar, aVar, 15), new com.applovin.impl.sdk.ad.f(15, this, aVar));
        } else {
            a.a.q();
            aVar.c();
        }
    }
}
