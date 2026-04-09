package p3;

import F3.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: FacebookRtbNativeAd.java */
/* renamed from: p3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5450c extends UnifiedNativeAdMapper {

    /* renamed from: b, reason: collision with root package name */
    public final MediationNativeAdConfiguration f45111b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f45112c;

    /* renamed from: d, reason: collision with root package name */
    public NativeAdBase f45113d;

    /* renamed from: e, reason: collision with root package name */
    public MediationNativeAdCallback f45114e;

    /* renamed from: f, reason: collision with root package name */
    public MediaView f45115f;

    /* compiled from: FacebookRtbNativeAd.java */
    /* renamed from: p3.c$a */
    public class a extends NativeAd.Image {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f45116a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f45117b;

        public a(Uri uri) {
            this.f45117b = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public final Drawable getDrawable() {
            return this.f45116a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public final double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public final Uri getUri() {
            return this.f45117b;
        }
    }

    public C5450c(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f45112c = mediationAdLoadCallback;
        this.f45111b = mediationNativeAdConfiguration;
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.f45113d;
        if (!(nativeAdBase instanceof NativeBannerAd)) {
            if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
                Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            }
            com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
            if (view2 instanceof ImageView) {
                nativeAd.registerViewForInteraction(view, this.f45115f, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
                nativeAd.registerViewForInteraction(view, this.f45115f, arrayList);
                return;
            }
        }
        if (view2 == null) {
            Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
            return;
        }
        if (view2 instanceof ImageView) {
            ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
            return;
        }
        Log.w(FacebookMediationAdapter.TAG, "Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: " + view2.getClass() + ".");
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        NativeAdBase nativeAdBase = this.f45113d;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }

    /* compiled from: FacebookRtbNativeAd.java */
    /* renamed from: p3.c$b */
    public class b implements AdListener, NativeAdListener {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<Context> f45118b;

        /* renamed from: c, reason: collision with root package name */
        public final NativeAdBase f45119c;

        public b(Context context, NativeAdBase nativeAdBase) {
            this.f45119c = nativeAdBase;
            this.f45118b = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            C5450c c5450c = C5450c.this;
            c5450c.f45114e.reportAdClicked();
            c5450c.f45114e.onAdOpened();
            c5450c.f45114e.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            C5450c c5450c = C5450c.this;
            NativeAdBase nativeAdBase = this.f45119c;
            MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback = c5450c.f45112c;
            if (ad != nativeAdBase) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                mediationAdLoadCallback.onFailure(adError);
                return;
            }
            Context context = this.f45118b.get();
            if (context == null) {
                AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
                mediationAdLoadCallback.onFailure(adError2);
                return;
            }
            NativeAdBase nativeAdBase2 = c5450c.f45113d;
            boolean z10 = false;
            boolean z11 = (nativeAdBase2.getAdHeadline() == null || nativeAdBase2.getAdBodyText() == null || nativeAdBase2.getAdIcon() == null || nativeAdBase2.getAdCallToAction() == null) ? false : true;
            if (nativeAdBase2 instanceof NativeBannerAd) {
                z10 = z11;
            } else if (z11 && nativeAdBase2.getAdCoverImage() != null && c5450c.f45115f != null) {
                z10 = true;
            }
            if (!z10) {
                AdError adError3 = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
                String str = FacebookMediationAdapter.TAG;
                Log.w(str, adError3.getMessage());
                Log.w(str, adError3.getMessage());
                mediationAdLoadCallback.onFailure(adError3);
                return;
            }
            c5450c.setHeadline(c5450c.f45113d.getAdHeadline());
            if (c5450c.f45113d.getAdCoverImage() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new a(Uri.parse(c5450c.f45113d.getAdCoverImage().getUrl())));
                c5450c.setImages(arrayList);
            }
            c5450c.setBody(c5450c.f45113d.getAdBodyText());
            if (c5450c.f45113d.getPreloadedIconViewDrawable() != null) {
                Drawable preloadedIconViewDrawable = c5450c.f45113d.getPreloadedIconViewDrawable();
                a aVar = new a();
                aVar.f45116a = preloadedIconViewDrawable;
                c5450c.setIcon(aVar);
            } else if (c5450c.f45113d.getAdIcon() == null) {
                c5450c.setIcon(new a());
            } else {
                c5450c.setIcon(new a(Uri.parse(c5450c.f45113d.getAdIcon().getUrl())));
            }
            c5450c.setCallToAction(c5450c.f45113d.getAdCallToAction());
            c5450c.setAdvertiser(c5450c.f45113d.getAdvertiserName());
            c5450c.f45115f.setListener(new f(c5450c));
            c5450c.setHasVideoContent(true);
            c5450c.setMediaView(c5450c.f45115f);
            Bundle bundle = new Bundle();
            bundle.putCharSequence(FacebookMediationAdapter.KEY_ID, c5450c.f45113d.getId());
            bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, c5450c.f45113d.getAdSocialContext());
            c5450c.setExtras(bundle);
            c5450c.setAdChoicesContent(new AdOptionsView(context, c5450c.f45113d, null));
            c5450c.f45114e = mediationAdLoadCallback.onSuccess(c5450c);
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            C5450c.this.f45112c.onFailure(adError2);
        }

        @Override // com.facebook.ads.NativeAdListener
        public final void onMediaDownloaded(Ad ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
        }
    }
}
