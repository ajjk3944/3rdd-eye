package p3;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final MediationInterstitialListener f23885a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdapter f23886b;

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0452a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23887a;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            f23887a = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23887a[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23887a[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23887a[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23887a[UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.f23885a = mediationInterstitialListener;
        this.f23886b = mediationInterstitialAdapter;
    }

    public void a(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.f23885a == null) {
            return;
        }
        int i10 = C0452a.f23887a[adEvent.ordinal()];
        if (i10 == 1) {
            this.f23885a.onAdLoaded(this.f23886b);
            return;
        }
        if (i10 == 2) {
            this.f23885a.onAdOpened(this.f23886b);
            return;
        }
        if (i10 == 3) {
            this.f23885a.onAdClicked(this.f23886b);
        } else if (i10 == 4) {
            this.f23885a.onAdClosed(this.f23886b);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f23885a.onAdLeftApplication(this.f23886b);
        }
    }
}
