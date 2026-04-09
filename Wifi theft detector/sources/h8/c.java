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
public class c {

    /* renamed from: e, reason: collision with root package name */
    public static c f21453e;

    /* renamed from: a, reason: collision with root package name */
    public InterstitialAd f21454a;

    /* renamed from: b, reason: collision with root package name */
    public b f21455b;

    /* renamed from: c, reason: collision with root package name */
    public String f21456c = "ca-app-pub-8364346218942106/5203945205";

    /* renamed from: d, reason: collision with root package name */
    public boolean f21457d = false;

    public interface b {
        void onInterstitialDismissed();
    }

    public static c d() {
        if (f21453e == null) {
            f21453e = new c();
        }
        return f21453e;
    }

    public boolean e() {
        return this.f21454a != null;
    }

    public final void f() {
        if (this.f21457d) {
            return;
        }
        this.f21457d = true;
        InterstitialAd.load(HackerApplication.l(), this.f21456c, new AdRequest.Builder().build(), new a());
    }

    public void g() {
        try {
            if (h8.a.f().e() <= 3 && !e()) {
                f();
            }
        } catch (Exception e10) {
            this.f21454a = null;
            Log.e("ADError", Log.getStackTraceString(e10));
            d.c().f();
        }
    }

    public void h(Activity activity, b bVar) {
        this.f21455b = bVar;
        InterstitialAd interstitialAd = this.f21454a;
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
            c.this.f21454a = interstitialAd;
            c.this.f21457d = false;
            interstitialAd.setFullScreenContentCallback(new C0408a());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Log.e("ADError", loadAdError.getMessage());
            c.this.f21454a = null;
            c.this.f21457d = false;
            d.c().f();
        }

        /* renamed from: h8.c$a$a, reason: collision with other inner class name */
        public class C0408a extends FullScreenContentCallback {
            public C0408a() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                c.this.f21454a = null;
                if (c.this.f21455b != null) {
                    c.this.f21455b.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                c.this.f21454a = null;
                if (c.this.f21455b != null) {
                    c.this.f21455b.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
            }
        }
    }
}
