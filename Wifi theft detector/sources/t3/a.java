package t3;

import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.AdConfig;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a extends r3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MediationAdLoadCallback mediationAdLoadCallback, q3.b vungleFactory) {
        super(mediationAdLoadCallback, vungleFactory);
        p.e(mediationAdLoadCallback, "mediationAdLoadCallback");
        p.e(vungleFactory, "vungleFactory");
    }

    @Override // r3.a
    public String e(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.e(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        return null;
    }

    @Override // r3.a
    public void f(AdConfig adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.e(adConfig, "adConfig");
        p.e(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
    }
}
