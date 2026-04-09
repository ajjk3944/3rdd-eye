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
public class f {

    /* renamed from: e, reason: collision with root package name */
    public static f f21472e;

    /* renamed from: a, reason: collision with root package name */
    public InterstitialAd f21473a;

    /* renamed from: b, reason: collision with root package name */
    public c f21474b;

    /* renamed from: c, reason: collision with root package name */
    public b f21475c;

    /* renamed from: d, reason: collision with root package name */
    public String f21476d = "ca-app-pub-8364346218942106/7381921257";

    public interface b {
        void onInterstitialDismissed();
    }

    public interface c {
        void a();

        void b();

        void c();

        void onInterstitialDismissed();
    }

    public static f d() {
        if (f21472e == null) {
            f21472e = new f();
        }
        return f21472e;
    }

    public boolean e() {
        return this.f21473a != null;
    }

    public final void f() {
        InterstitialAd.load(HackerApplication.l(), this.f21476d, new AdRequest.Builder().build(), new a());
    }

    public void g(c cVar) {
        this.f21474b = cVar;
        try {
            if (e()) {
                return;
            }
            f();
        } catch (Exception e10) {
            this.f21473a = null;
            this.f21474b.c();
            Log.e("ADError", Log.getStackTraceString(e10));
        }
    }

    public void h(Activity activity, b bVar) {
        this.f21475c = bVar;
        InterstitialAd interstitialAd = this.f21473a;
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
            f.this.f21473a = interstitialAd;
            interstitialAd.setFullScreenContentCallback(new C0411a());
            if (f.this.f21474b != null) {
                f.this.f21474b.b();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Log.e("ADError", loadAdError.getMessage());
            f.this.f21473a = null;
            if (f.this.f21474b != null) {
                f.this.f21474b.c();
            }
        }

        /* renamed from: h8.f$a$a, reason: collision with other inner class name */
        public class C0411a extends FullScreenContentCallback {
            public C0411a() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                f.this.f21473a = null;
                if (f.this.f21474b != null) {
                    f.this.f21474b.onInterstitialDismissed();
                }
                if (f.this.f21475c != null) {
                    f.this.f21475c.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                f.this.f21473a = null;
                if (f.this.f21474b != null) {
                    f.this.f21474b.a();
                }
                if (f.this.f21475c != null) {
                    f.this.f21475c.onInterstitialDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
            }
        }
    }
}
