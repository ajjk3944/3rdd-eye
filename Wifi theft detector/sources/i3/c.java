package i3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
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
import h3.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends UnifiedNativeAdMapper {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f21579a;

    /* renamed from: b, reason: collision with root package name */
    public NativeAdBase f21580b;

    /* renamed from: c, reason: collision with root package name */
    public MediationNativeAdCallback f21581c;

    /* renamed from: d, reason: collision with root package name */
    public MediaView f21582d;

    /* renamed from: e, reason: collision with root package name */
    public final e f21583e;

    public class b extends NativeAd.Image {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f21585a;

        /* renamed from: b, reason: collision with root package name */
        public Uri f21586b;

        public b() {
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f21585a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f21586b;
        }

        public b(Uri uri) {
            this.f21586b = uri;
        }

        public b(Drawable drawable) {
            this.f21585a = drawable;
        }
    }

    /* renamed from: i3.c$c, reason: collision with other inner class name */
    public interface InterfaceC0415c {
        void a(AdError adError);

        void b();
    }

    public c(MediationAdLoadCallback mediationAdLoadCallback, e eVar) {
        this.f21579a = mediationAdLoadCallback;
        this.f21583e = eVar;
    }

    public final boolean d(NativeAdBase nativeAdBase) {
        boolean z10 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        return nativeAdBase instanceof NativeBannerAd ? z10 : (!z10 || nativeAdBase.getAdCoverImage() == null || this.f21582d == null) ? false : true;
    }

    public void e(Context context, InterfaceC0415c interfaceC0415c) {
        if (!d(this.f21580b)) {
            AdError adError = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            interfaceC0415c.a(adError);
            return;
        }
        setHeadline(this.f21580b.getAdHeadline());
        if (this.f21580b.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(Uri.parse(this.f21580b.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.f21580b.getAdBodyText());
        if (this.f21580b.getPreloadedIconViewDrawable() != null) {
            setIcon(new b(this.f21580b.getPreloadedIconViewDrawable()));
        } else if (this.f21580b.getAdIcon() == null) {
            setIcon(new b());
        } else {
            setIcon(new b(Uri.parse(this.f21580b.getAdIcon().getUrl())));
        }
        setCallToAction(this.f21580b.getAdCallToAction());
        setAdvertiser(this.f21580b.getAdvertiserName());
        this.f21582d.setListener(new a());
        setHasVideoContent(true);
        setMediaView(this.f21582d);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", this.f21580b.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f21580b.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.f21580b, null));
        interfaceC0415c.b();
    }

    public void f(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        String placementID = FacebookMediationAdapter.getPlacementID(mediationNativeAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f21579a.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationNativeAdConfiguration);
        this.f21582d = this.f21583e.c(mediationNativeAdConfiguration.getContext());
        try {
            this.f21580b = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.getContext(), placementID, mediationNativeAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration.getWatermark())) {
                this.f21580b.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.f21580b;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new d(mediationNativeAdConfiguration.getContext(), this.f21580b)).withBid(mediationNativeAdConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f21579a.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = (View) map.get("3003");
        NativeAdBase nativeAdBase = this.f21580b;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
                return;
            }
        }
        if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
            return;
        }
        com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
        if (view2 instanceof ImageView) {
            nativeAd.registerViewForInteraction(view, this.f21582d, (ImageView) view2, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.f21582d, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.f21580b;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }

    public class a implements MediaViewListener {
        public a() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onComplete(MediaView mediaView) {
            if (c.this.f21581c != null) {
                c.this.f21581c.onVideoComplete();
            }
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onEnterFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onExitFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenBackground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenForeground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPause(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPlay(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onVolumeChange(MediaView mediaView, float f10) {
        }
    }

    public class d implements AdListener, NativeAdListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f21588a;

        /* renamed from: b, reason: collision with root package name */
        public final NativeAdBase f21589b;

        public class a implements InterfaceC0415c {
            public a() {
            }

            @Override // i3.c.InterfaceC0415c
            public void a(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f21579a.onFailure(adError);
            }

            @Override // i3.c.InterfaceC0415c
            public void b() {
                c cVar = c.this;
                cVar.f21581c = (MediationNativeAdCallback) cVar.f21579a.onSuccess(c.this);
            }
        }

        public d(Context context, NativeAdBase nativeAdBase) {
            this.f21589b = nativeAdBase;
            this.f21588a = new WeakReference(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            c.this.f21581c.reportAdClicked();
            c.this.f21581c.onAdOpened();
            c.this.f21581c.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            if (ad != this.f21589b) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f21579a.onFailure(adError);
                return;
            }
            Context context = (Context) this.f21588a.get();
            if (context != null) {
                c.this.e(context, new a());
                return;
            }
            AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            c.this.f21579a.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            c.this.f21579a.onFailure(adError2);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }
    }
}
