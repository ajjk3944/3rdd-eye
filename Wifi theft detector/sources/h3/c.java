package h3;

import com.facebook.ads.AdExperienceType;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* loaded from: classes.dex */
public class c extends b {
    public c(MediationAdLoadCallback mediationAdLoadCallback, e eVar) {
        super(mediationAdLoadCallback, eVar);
    }

    @Override // h3.b
    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL;
    }
}
