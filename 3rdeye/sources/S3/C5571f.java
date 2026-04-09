package s3;

import a6.C1653b;
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
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.L;
import com.vungle.ads.O;
import com.vungle.ads.k0;
import g6.C4394b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.l;
import q3.C5490a;

/* compiled from: VungleRtbNativeAd.java */
/* renamed from: s3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5571f extends UnifiedNativeAdMapper implements O {

    /* renamed from: b, reason: collision with root package name */
    public final MediationNativeAdConfiguration f46039b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f46040c;

    /* renamed from: d, reason: collision with root package name */
    public MediationNativeAdCallback f46041d;

    /* renamed from: e, reason: collision with root package name */
    public L f46042e;

    /* renamed from: f, reason: collision with root package name */
    public C4394b f46043f;

    /* renamed from: g, reason: collision with root package name */
    public String f46044g;

    /* renamed from: h, reason: collision with root package name */
    public final C5490a f46045h;

    /* compiled from: VungleRtbNativeAd.java */
    /* renamed from: s3.f$a */
    public class a implements a.InterfaceC0332a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f46046a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f46047b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f46048c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f46049d;

        public a(Context context, String str, int i, String str2) {
            this.f46046a = context;
            this.f46047b = str;
            this.f46048c = i;
            this.f46049d = str2;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void a(AdError adError) {
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            C5571f.this.f46040c.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void onInitializeSuccess() {
            C5571f c5571f = C5571f.this;
            c5571f.f46045h.getClass();
            Context context = this.f46046a;
            l.f(context, "context");
            String placementId = this.f46047b;
            l.f(placementId, "placementId");
            c5571f.f46042e = new L(context, placementId);
            c5571f.f46042e.setAdOptionsPosition(this.f46048c);
            c5571f.f46042e.setAdListener(c5571f);
            c5571f.f46043f = new C4394b(context);
            String str = this.f46049d;
            if (!TextUtils.isEmpty(str)) {
                c5571f.f46042e.getAdConfig().setWatermark(str);
            }
            c5571f.f46042e.load(c5571f.f46044g);
        }
    }

    /* compiled from: VungleRtbNativeAd.java */
    /* renamed from: s3.f$b */
    public static class b extends NativeAd.Image {

        /* renamed from: a, reason: collision with root package name */
        public Uri f46051a;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public final Drawable getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public final double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public final Uri getUri() {
            return this.f46051a;
        }
    }

    public C5571f(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, C5490a c5490a) {
        this.f46039b = mediationNativeAdConfiguration;
        this.f46040c = mediationAdLoadCallback;
        this.f46045h = c5490a;
    }

    public final void a() {
        int i;
        int i10;
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.f46039b;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        boolean zIsEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback = this.f46040c;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.f46044g = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            i = 3;
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i = 1;
                } else {
                    i10 = 2;
                }
            }
            com.google.ads.mediation.vungle.a.f22436c.a(string, context, new a(context, string2, i10, mediationNativeAdConfiguration.getWatermark()));
        }
        i = 0;
        i10 = i;
        com.google.ads.mediation.vungle.a.f22436c.a(string, context, new a(context, string2, i10, mediationNativeAdConfiguration.getWatermark()));
    }

    @Override // com.vungle.ads.O, com.vungle.ads.r
    public final void onAdClicked(AbstractC4059q abstractC4059q) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f46041d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f46041d.onAdOpened();
        }
    }

    @Override // com.vungle.ads.O, com.vungle.ads.r
    public final void onAdFailedToLoad(AbstractC4059q abstractC4059q, k0 k0Var) {
        this.f46040c.onFailure(VungleMediationAdapter.getAdError(k0Var));
    }

    @Override // com.vungle.ads.O, com.vungle.ads.r
    public final void onAdFailedToPlay(AbstractC4059q abstractC4059q, k0 k0Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(k0Var).toString());
    }

    @Override // com.vungle.ads.O, com.vungle.ads.r
    public final void onAdImpression(AbstractC4059q abstractC4059q) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f46041d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.O, com.vungle.ads.r
    public final void onAdLeftApplication(AbstractC4059q abstractC4059q) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f46041d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.O, com.vungle.ads.r
    public final void onAdLoaded(AbstractC4059q abstractC4059q) {
        setHeadline(this.f46042e.getAdTitle());
        setBody(this.f46042e.getAdBodyText());
        setCallToAction(this.f46042e.getAdCallToActionText());
        Double adStarRating = this.f46042e.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.f46042e.getAdSponsoredText());
        setMediaView(this.f46043f);
        String appIcon = this.f46042e.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(C1653b.FILE_SCHEME)) {
            Uri uri = Uri.parse(appIcon);
            b bVar = new b();
            bVar.f46051a = uri;
            setIcon(bVar);
        }
        if (TextUtils.isEmpty(this.f46044g)) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
        this.f46041d = this.f46040c.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) throws Throwable {
        super.trackViews(view, map, map2);
        String str = VungleMediationAdapter.TAG;
        Log.d(str, "trackViews()");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            L l5 = this.f46042e;
            if (l5 == null || !l5.canPlayAd().booleanValue()) {
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
            for (Map.Entry<String, View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    callback = (View) entry.getValue();
                }
            }
            if (callback instanceof ImageView) {
                imageView = (ImageView) callback;
            } else {
                Log.d(VungleMediationAdapter.TAG, "The view to display a Vungle native icon image is not a type of ImageView, so it can't be registered for click events.");
            }
            this.f46042e.registerViewForInteraction((FrameLayout) childAt, this.f46043f, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        super.untrackView(view);
        Log.d(VungleMediationAdapter.TAG, "untrackView()");
        L l5 = this.f46042e;
        if (l5 == null) {
            return;
        }
        l5.unregisterView();
    }

    @Override // com.vungle.ads.O, com.vungle.ads.r
    public final void onAdEnd(AbstractC4059q abstractC4059q) {
    }

    @Override // com.vungle.ads.O, com.vungle.ads.r
    public final void onAdStart(AbstractC4059q abstractC4059q) {
    }
}
