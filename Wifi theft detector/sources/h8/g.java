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
public class g {

    /* renamed from: e, reason: collision with root package name */
    public static g f21479e;

    /* renamed from: a, reason: collision with root package name */
    public InterstitialAd f21480a;

    /* renamed from: b, reason: collision with root package name */
    public c f21481b;

    /* renamed from: c, reason: collision with root package name */
    public b f21482c;

    /* renamed from: d, reason: collision with root package name */
    public String f21483d = "ca-app-pub-8364346218942106/6009892893";

    public interface b {
        void onInterstitialDismissed();
    }

    public interface c {
        void a();

        void b();

        void c();

        void onInterstitialDismissed();
    }

    public static g d() {
        if (f21479e == null) {
            f21479e = new g();
        }
        return f21479e;
    }

    public boolean e() {
        return this.f21480a != null;
    }

    public final void f() {
        InterstitialAd.load(HackerApplication.l(), this.f21483d, new AdRequest.Builder().build(), new a());
    }

    public void g(c cVar) {
        this.f21481b = cVar;
        try {
            if (e()) {
                return;
            }
            f();
        } catch (Exception e10) {
            this.f21480a = null;
            c cVar2 = this.f21481b;
            if (cVar2 != null) {
                cVar2.c();
            }
            Log.e("ADError", Log.getStackTraceString(e10));
        }
    }

    public void h(Activity activity, b bVar) {
        this.f21482c = bVar;
        InterstitialAd interstitialAd = this.f21480a;
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
            g.this.f21480a = interstitialAd;
            interstitialAd.setFullScreenContentCallback(new C0412a());
            if (g.this.f21481b != null) {
                g.this.f21481b.b();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Log.e("ADError", loadAdError.getMessage());
            g.this.f21480a = null;
            if (g.this.f21481b != null) {
                g.this.f21481b.c();
            }
        }

        /* renamed from: h8.g$a$a, reason: collision with other inner class name */
        public class C0412a extends FullScreenContentCallback {
            public C0412a() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                g.this.f21480a = null;
                if (g.this.f21481b != null) {
                    g.this.f21481b.onInterstitialDismissed();
                }
                if (g.this.f21482c != null) {
                    g.this.f21482c.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                g.this.f21480a = null;
                if (g.this.f21481b != null) {
                    g.this.f21481b.a();
                }
                if (g.this.f21482c != null) {
                    g.this.f21482c.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
            }
        }
    }
}
