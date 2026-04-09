package Q7;

import H6.B;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import kotlin.jvm.internal.l;
import l8.d;

/* compiled from: AdmobUnitIdProvider.kt */
/* loaded from: classes3.dex */
public final class b extends B {
    @Override // H6.B
    public final String i() {
        l8.b bVar = (l8.b) this.f2034b;
        PremiumHelperConfiguration premiumHelperConfiguration = bVar.f43910b;
        if (premiumHelperConfiguration.isDebugMode() && premiumHelperConfiguration.getAdManagerTestAds()) {
            return "ca-app-pub-3940256099942544/9214589741";
        }
        d<String> PH_AD_UNIT_ADMOB_BANNER = i8.d.f38551c;
        l.e(PH_AD_UNIT_ADMOB_BANNER, "PH_AD_UNIT_ADMOB_BANNER");
        Object objH = bVar.h(PH_AD_UNIT_ADMOB_BANNER);
        l.e(objH, "get(...)");
        return (String) objH;
    }

    @Override // H6.B
    public final String j() {
        l8.b bVar = (l8.b) this.f2034b;
        PremiumHelperConfiguration premiumHelperConfiguration = bVar.f43910b;
        if (premiumHelperConfiguration.isDebugMode() && premiumHelperConfiguration.getAdManagerTestAds()) {
            return "ca-app-pub-3940256099942544/1033173712";
        }
        d<String> PH_AD_UNIT_ADMOB_INTERSTITIAL = i8.d.f38553d;
        l.e(PH_AD_UNIT_ADMOB_INTERSTITIAL, "PH_AD_UNIT_ADMOB_INTERSTITIAL");
        Object objH = bVar.h(PH_AD_UNIT_ADMOB_INTERSTITIAL);
        l.e(objH, "get(...)");
        return (String) objH;
    }

    @Override // H6.B
    public final String k() {
        return i();
    }
}
