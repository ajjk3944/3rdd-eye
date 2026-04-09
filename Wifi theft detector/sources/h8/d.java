package h8;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.wifihacker.detector.HackerApplication;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static d f21460d;

    /* renamed from: a, reason: collision with root package name */
    public InterstitialAd f21461a;

    /* renamed from: b, reason: collision with root package name */
    public b f21462b;

    /* renamed from: c, reason: collision with root package name */
    public String f21463c = "ca-app-pub-8364346218942106/1783751588";

    public interface b {
        void onInterstitialDismissed();
    }

    public static d c() {
        if (f21460d == null) {
            f21460d = new d();
        }
        return f21460d;
    }

    public boolean d() {
        return this.f21461a != null;
    }

    public final void e() {
        InterstitialAd.load(HackerApplication.l(), this.f21463c, new AdRequest.Builder().build(), new a());
    }

    public void f() {
        try {
            if (d()) {
                return;
            }
            e();
        } catch (Exception e10) {
            this.f21461a = null;
            Log.e("ADError", Log.getStackTraceString(e10));
        }
    }

    public void g(Activity activity, b bVar) {
        this.f21462b = bVar;
        InterstitialAd interstitialAd = this.f21461a;
        if (interstitialAd != null) {
            interstitialAd.show(activity);
        } else if (bVar != null) {
            bVar.onInterstitialDismissed();
        }
    }

    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(InterstitialAd interstitialAd) {
            d.this.f21461a = interstitialAd;
            interstitialAd.setFullScreenContentCallback(new C0409a());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Log.e("ADError", loadAdError.getMessage());
            d.this.f21461a = null;
        }

        /* renamed from: h8.d$a$a, reason: collision with other inner class name */
        public class C0409a extends FullScreenContentCallback {
            public C0409a() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                d.this.f21461a = null;
                if (d.this.f21462b != null) {
                    d.this.f21462b.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                d.this.f21461a = null;
                if (d.this.f21462b != null) {
                    d.this.f21462b.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
            }
        }
    }
}
