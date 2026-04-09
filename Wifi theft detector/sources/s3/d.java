package s3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.r;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends UnifiedNativeAdMapper implements r {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f24264a;

    /* renamed from: b, reason: collision with root package name */
    public MediationNativeAdCallback f24265b;

    /* renamed from: c, reason: collision with root package name */
    public NativeAd f24266c;

    /* renamed from: d, reason: collision with root package name */
    public com.vungle.ads.internal.ui.view.d f24267d;

    /* renamed from: e, reason: collision with root package name */
    public String f24268e;

    /* renamed from: f, reason: collision with root package name */
    public final q3.b f24269f;

    public class a implements a.InterfaceC0194a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24270a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f24271b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f24272c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f24273d;

        public a(Context context, String str, int i10, String str2) {
            this.f24270a = context;
            this.f24271b = str;
            this.f24272c = i10;
            this.f24273d = str2;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void a(AdError adError) {
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            d.this.f24264a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void onInitializeSuccess() throws Throwable {
            d dVar = d.this;
            dVar.f24266c = dVar.f24269f.d(this.f24270a, this.f24271b);
            d.this.f24266c.setAdOptionsPosition(this.f24272c);
            d.this.f24266c.setAdListener(d.this);
            d.this.f24267d = new com.vungle.ads.internal.ui.view.d(this.f24270a);
            if (!TextUtils.isEmpty(this.f24273d)) {
                d.this.f24266c.getAdConfig().setWatermark(this.f24273d);
            }
            d.this.f24266c.load(d.this.f24268e);
        }
    }

    public static class b extends NativeAd.Image {

        /* renamed from: a, reason: collision with root package name */
        public Uri f24275a;

        public b(Uri uri) {
            this.f24275a = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f24275a;
        }
    }

    public d(MediationAdLoadCallback mediationAdLoadCallback, q3.b bVar) {
        this.f24264a = mediationAdLoadCallback;
        this.f24269f = bVar;
    }

    public final void g() {
        setHeadline(this.f24266c.getAdTitle());
        setBody(this.f24266c.getAdBodyText());
        setCallToAction(this.f24266c.getAdCallToActionText());
        Double adStarRating = this.f24266c.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.f24266c.getAdSponsoredText());
        setMediaView(this.f24267d);
        String appIcon = this.f24266c.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(q7.a.FILE_SCHEME)) {
            setIcon(new b(Uri.parse(appIcon)));
        }
        setMediaContentAspectRatio(this.f24266c.getMediaAspectRatio());
        if (VungleMediationAdapter.runtimeGmaSdkListensToAdapterReportedImpressions()) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
    }

    public void h(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        int i10;
        int i11;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            this.f24264a.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            this.f24264a.onFailure(adError2);
            return;
        }
        this.f24268e = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            i10 = 3;
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i10 = 1;
                } else {
                    i11 = 2;
                }
            }
            com.google.ads.mediation.vungle.a.a().b(string, context, new a(context, string2, i11, mediationNativeAdConfiguration.getWatermark()));
        }
        i10 = 0;
        i11 = i10;
        com.google.ads.mediation.vungle.a.a().b(string, context, new a(context, string2, i11, mediationNativeAdConfiguration.getWatermark()));
    }

    @Override // com.vungle.ads.r, com.vungle.ads.g
    public void onAdClicked(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f24265b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f24265b.onAdOpened();
        }
    }

    @Override // com.vungle.ads.r, com.vungle.ads.g
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f24264a.onFailure(VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.r, com.vungle.ads.g
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.r, com.vungle.ads.g
    public void onAdImpression(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f24265b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.r, com.vungle.ads.g
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f24265b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.r, com.vungle.ads.g
    public void onAdLoaded(BaseAd baseAd) {
        g();
        this.f24265b = (MediationNativeAdCallback) this.f24264a.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) throws Throwable {
        super.trackViews(view, map, map2);
        String str = VungleMediationAdapter.TAG;
        Log.d(str, "trackViews()");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            com.vungle.ads.NativeAd nativeAd = this.f24266c;
            if (nativeAd == null || !nativeAd.canPlayAd().booleanValue()) {
                return;
            }
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (!(childAt instanceof FrameLayout)) {
                Log.d(str, "Vungle requires a FrameLayout to render the native ad.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ImageView imageView = null;
            KeyEvent.Callback callback = null;
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add((View) entry.getValue());
                if (((String) entry.getKey()).equals("3003")) {
                    callback = (View) entry.getValue();
                }
            }
            if (callback instanceof ImageView) {
                imageView = (ImageView) callback;
            } else {
                Log.d(VungleMediationAdapter.TAG, "The view to display a Vungle native icon image is not a type of ImageView, so it can't be registered for click events.");
            }
            this.f24266c.registerViewForInteraction((FrameLayout) childAt, this.f24267d, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        super.untrackView(view);
        Log.d(VungleMediationAdapter.TAG, "untrackView()");
        com.vungle.ads.NativeAd nativeAd = this.f24266c;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }

    @Override // com.vungle.ads.r, com.vungle.ads.g
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.r, com.vungle.ads.g
    public void onAdStart(BaseAd baseAd) {
    }
}
