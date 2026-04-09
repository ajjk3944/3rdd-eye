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
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static e f21466d;

    /* renamed from: a, reason: collision with root package name */
    public InterstitialAd f21467a;

    /* renamed from: b, reason: collision with root package name */
    public b f21468b;

    /* renamed from: c, reason: collision with root package name */
    public String f21469c = "ca-app-pub-8364346218942106/8181137222";

    public interface b {
        void onInterstitialDismissed();
    }

    public static e c() {
        if (f21466d == null) {
            f21466d = new e();
        }
        return f21466d;
    }

    public boolean d() {
        return this.f21467a != null;
    }

    public final void e() {
        InterstitialAd.load(HackerApplication.l(), this.f21469c, new AdRequest.Builder().build(), new a());
    }

    public void f() {
        try {
            if (d()) {
                return;
            }
            e();
        } catch (Exception e10) {
            this.f21467a = null;
            d.c().f();
            Log.e("ADError", Log.getStackTraceString(e10));
        }
    }

    public void g(Activity activity, b bVar) {
        this.f21468b = bVar;
        InterstitialAd interstitialAd = this.f21467a;
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
            e.this.f21467a = interstitialAd;
            interstitialAd.setFullScreenContentCallback(new C0410a());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Log.e("ADError", loadAdError.getMessage());
            e.this.f21467a = null;
            d.c().f();
        }

        /* renamed from: h8.e$a$a, reason: collision with other inner class name */
        public class C0410a extends FullScreenContentCallback {
            public C0410a() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                e.this.f21467a = null;
                if (e.this.f21468b != null) {
                    e.this.f21468b.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                e.this.f21467a = null;
                if (e.this.f21468b != null) {
                    e.this.f21468b.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
            }
        }
    }
}
