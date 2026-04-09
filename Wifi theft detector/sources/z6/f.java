package z6;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.nads.nsdk.WADModel;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public z6.c f25386a;

    public class a implements NativeAd.OnNativeAdLoadedListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(NativeAd nativeAd) {
            if (f.this.f25386a.a().g()) {
                f.this.f25386a.a().h(nativeAd);
            } else {
                f.this.g(nativeAd);
            }
        }
    }

    public class b extends AdListener {
        public b() {
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            super.onAdClicked();
            if (f.this.f25386a.b() != null) {
                f.this.f25386a.b().onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (f.this.f25386a.b() != null) {
                f.this.f25386a.b().a();
            }
        }
    }

    public class c extends VideoController.VideoLifecycleCallbacks {
        public c() {
        }

        @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
        public void onVideoEnd() {
            super.onVideoEnd();
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25390a;

        static {
            int[] iArr = new int[WADModel.values().length];
            f25390a = iArr;
            try {
                iArr[WADModel.AD_MODEL_LIGHT_BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public void c() {
        if (!this.f25386a.a().g()) {
            d();
            return;
        }
        if (this.f25386a.a().a() != null) {
            g(this.f25386a.a().a());
            this.f25386a.a().h(null);
        } else {
            if (this.f25386a.b() != null) {
                this.f25386a.b().a();
            }
            d();
        }
    }

    public final void d() {
        AdLoader.Builder builder = new AdLoader.Builder(this.f25386a.a().b(), this.f25386a.c());
        builder.forNativeAd(new a());
        builder.withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build());
        builder.withAdListener(new b()).build().loadAd(new AdRequest.Builder().build());
    }

    public final void e(NativeAd nativeAd, NativeAdView nativeAdView) {
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(z6.a.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(z6.a.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(z6.a.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(z6.a.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(z6.a.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(z6.a.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(z6.a.ad_stars));
        nativeAdView.setStoreView(nativeAdView.findViewById(z6.a.ad_store));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(z6.a.ad_advertiser));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        nativeAdView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        if (nativeAd.getBody() == null) {
            nativeAdView.getBodyView().setVisibility(8);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            nativeAdView.getCallToActionView().setVisibility(8);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            ((Button) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }
        if (nativeAd.getIcon() == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            nativeAdView.getIconView().setVisibility(0);
        }
        if (nativeAd.getPrice() == null) {
            nativeAdView.getPriceView().setVisibility(8);
        } else {
            nativeAdView.getPriceView().setVisibility(0);
            ((TextView) nativeAdView.getPriceView()).setText(nativeAd.getPrice());
        }
        if (nativeAd.getStore() == null) {
            nativeAdView.getStoreView().setVisibility(8);
        } else {
            nativeAdView.getStoreView().setVisibility(0);
            ((TextView) nativeAdView.getStoreView()).setText(nativeAd.getStore());
        }
        if (nativeAd.getStarRating() == null) {
            nativeAdView.getStarRatingView().setVisibility(8);
        } else {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            nativeAdView.getStarRatingView().setVisibility(0);
        }
        if (nativeAd.getAdvertiser() == null) {
            nativeAdView.getAdvertiserView().setVisibility(8);
        } else {
            ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            nativeAdView.getAdvertiserView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
        VideoController videoController = nativeAd.getMediaContent().getVideoController();
        if (nativeAd.getMediaContent() == null || !nativeAd.getMediaContent().hasVideoContent()) {
            return;
        }
        videoController.setVideoLifecycleCallbacks(new c());
    }

    public void f(z6.c cVar) {
        this.f25386a = cVar;
    }

    public final void g(NativeAd nativeAd) {
        int i10 = z6.b.view_admob_ad_unified1;
        if (this.f25386a.a().d() != null && d.f25390a[this.f25386a.a().d().ordinal()] == 1) {
            i10 = z6.b.view_admob_ad_unified_big;
        }
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(this.f25386a.a().b()).inflate(i10, (ViewGroup) null);
        e(nativeAd, nativeAdView);
        this.f25386a.a().f().removeAllViews();
        this.f25386a.a().f().addView(nativeAdView);
        if (this.f25386a.b() != null) {
            this.f25386a.b().onAdLoaded();
        }
    }
}
