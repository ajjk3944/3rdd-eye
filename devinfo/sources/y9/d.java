package y9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import bb.t;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements AdListener, NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f37376a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeAdBase f37377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f37378c;

    public d(e eVar, Context context, NativeAdBase nativeAdBase) {
        this.f37378c = eVar;
        this.f37377b = nativeAdBase;
        this.f37376a = new WeakReference(context);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        e eVar = this.f37378c;
        eVar.f37381t.h();
        eVar.f37381t.e();
        eVar.f37381t.a();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        e eVar = this.f37378c;
        bb.e eVar2 = eVar.f37379r;
        if (ad2 != this.f37377b) {
            pa.a aVar = new pa.a(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            Log.e(FacebookMediationAdapter.TAG, "Ad Loaded is not a Native Ad.");
            eVar2.i(aVar);
            return;
        }
        Context context = (Context) this.f37376a.get();
        if (context == null) {
            pa.a aVar2 = new pa.a(FacebookMediationAdapter.ERROR_NULL_CONTEXT, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            Log.e(FacebookMediationAdapter.TAG, "Context is null.");
            eVar2.i(aVar2);
            return;
        }
        NativeAdBase nativeAdBase = eVar.f37380s;
        boolean z3 = false;
        boolean z10 = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        if (nativeAdBase instanceof NativeBannerAd) {
            z3 = z10;
        } else if (z10 && nativeAdBase.getAdCoverImage() != null && eVar.f37382u != null) {
            z3 = true;
        }
        if (!z3) {
            pa.a aVar3 = new pa.a(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN, null);
            String str = FacebookMediationAdapter.TAG;
            Log.w(str, "Ad from Meta Audience Network doesn't have all required assets.");
            Log.w(str, "Ad from Meta Audience Network doesn't have all required assets.");
            eVar2.i(aVar3);
            return;
        }
        eVar.f2094a = eVar.f37380s.getAdHeadline();
        if (eVar.f37380s.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new c(Uri.parse(eVar.f37380s.getAdCoverImage().getUrl())));
            eVar.f2095b = arrayList;
        }
        eVar.f2096c = eVar.f37380s.getAdBodyText();
        if (eVar.f37380s.getPreloadedIconViewDrawable() != null) {
            Drawable preloadedIconViewDrawable = eVar.f37380s.getPreloadedIconViewDrawable();
            c cVar = new c();
            cVar.f37374a = preloadedIconViewDrawable;
            eVar.f2097d = cVar;
        } else if (eVar.f37380s.getAdIcon() == null) {
            eVar.f2097d = new c();
        } else {
            eVar.f2097d = new c(Uri.parse(eVar.f37380s.getAdIcon().getUrl()));
        }
        eVar.f2098e = eVar.f37380s.getAdCallToAction();
        eVar.f2099f = eVar.f37380s.getAdvertiserName();
        eVar.f37382u.setListener(new o.e(25, eVar));
        eVar.f2102k = true;
        eVar.f2104m = eVar.f37382u;
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookMediationAdapter.KEY_ID, eVar.f37380s.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, eVar.f37380s.getAdSocialContext());
        eVar.f2106o = bundle;
        eVar.f2103l = new AdOptionsView(context, eVar.f37380s, null);
        eVar.f37381t = (t) eVar2.onSuccess(eVar);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        pa.a adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.f31512b);
        this.f37378c.f37379r.i(adError2);
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad2) {
        Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
    }
}
