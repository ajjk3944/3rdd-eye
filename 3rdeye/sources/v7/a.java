package V7;

import com.applovin.impl.AbstractActivityC2136o;
import com.applovin.impl.AbstractActivityC2138p;
import com.applovin.impl.C2131m;
import com.applovin.impl.d2;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.yandex.mobile.ads.impl.a8;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.j71;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.ox0;
import com.yandex.mobile.ads.impl.x51;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements OnPaidEventListener, k2.a, UserMessagingPlatform.OnConsentFormLoadFailureListener, ox0.a, nr0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13037e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.f13034b = i;
        this.f13035c = obj;
        this.f13036d = obj2;
        this.f13037e = obj3;
    }

    @Override // com.applovin.impl.k2.a
    public void a(d2 d2Var, j2 j2Var) {
        switch (this.f13034b) {
            case 1:
                ((AbstractActivityC2136o) this.f13035c).a((k) this.f13036d, (C2131m) this.f13037e, d2Var, j2Var);
                break;
            default:
                ((AbstractActivityC2138p) this.f13035c).a((List) this.f13036d, (k) this.f13037e, d2Var, j2Var);
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        ((ed) obj).getClass();
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((com.applovin.impl.privacy.cmp.a) this.f13035c).a((a.InterfaceC0315a) this.f13036d, (FormError) this.f13037e, formError);
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        l.f(adValue, "adValue");
        ((e) this.f13035c).f13049e.m((String) this.f13036d, adValue, ((InterstitialAd) this.f13037e).getResponseInfo().getMediationAdapterClassName());
    }

    @Override // com.yandex.mobile.ads.impl.ox0.a
    public void a(a8 a8Var) {
        j71.a((MediatedNativeAd) this.f13035c, (j71) this.f13036d, (x51) this.f13037e, a8Var);
    }
}
