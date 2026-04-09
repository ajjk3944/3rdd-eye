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
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static b f21447d;

    /* renamed from: a, reason: collision with root package name */
    public InterstitialAd f21448a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0407b f21449b;

    /* renamed from: c, reason: collision with root package name */
    public String f21450c = "ca-app-pub-8364346218942106/8181137222";

    /* renamed from: h8.b$b, reason: collision with other inner class name */
    public interface InterfaceC0407b {
        void onInterstitialDismissed();
    }

    public static b c() {
        if (f21447d == null) {
            f21447d = new b();
        }
        return f21447d;
    }

    public boolean d() {
        return this.f21448a != null;
    }

    public final void e() {
        InterstitialAd.load(HackerApplication.l(), this.f21450c, new AdRequest.Builder().build(), new a());
    }

    public void f() {
        try {
            if (d()) {
                return;
            }
            e();
        } catch (Exception e10) {
            this.f21448a = null;
            d.c().f();
            Log.e("ADError", Log.getStackTraceString(e10));
        }
    }

    public void g(Activity activity, InterfaceC0407b interfaceC0407b) {
        this.f21449b = interfaceC0407b;
        InterstitialAd interstitialAd = this.f21448a;
        if (interstitialAd != null) {
            interstitialAd.show(activity);
        } else if (interfaceC0407b != null) {
            interfaceC0407b.onInterstitialDismissed();
        }
    }

    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(InterstitialAd interstitialAd) {
            b.this.f21448a = interstitialAd;
            interstitialAd.setFullScreenContentCallback(new C0406a());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Log.e("ADError", loadAdError.getMessage());
            b.this.f21448a = null;
            d.c().f();
        }

        /* renamed from: h8.b$a$a, reason: collision with other inner class name */
        public class C0406a extends FullScreenContentCallback {
            public C0406a() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                b.this.f21448a = null;
                if (b.this.f21449b != null) {
                    b.this.f21449b.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                b.this.f21448a = null;
                if (b.this.f21449b != null) {
                    b.this.f21449b.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
            }
        }
    }
}
