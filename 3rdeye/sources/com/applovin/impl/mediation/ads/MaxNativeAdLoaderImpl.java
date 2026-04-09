package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.C2123i;
import com.applovin.impl.EnumC2121h;
import com.applovin.impl.a7;
import com.applovin.impl.f6;
import com.applovin.impl.g3;
import com.applovin.impl.l2;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o1;
import com.applovin.impl.q2;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u2;
import com.applovin.impl.w4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0316a, C2123i.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* renamed from: a, reason: collision with root package name */
    private final c f20274a;

    /* renamed from: b, reason: collision with root package name */
    private String f20275b;

    /* renamed from: c, reason: collision with root package name */
    private String f20276c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC2121h f20277d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f20278e;

    /* renamed from: f, reason: collision with root package name */
    private MaxNativeAdListener f20279f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f20280g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f20281h;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f20282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f20283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f20284c;

        public a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f20282a = maxNativeAd;
            this.f20283b = list;
            this.f20284c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20282a.prepareForInteraction(this.f20283b, this.f20284c)) {
                return;
            }
            o.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f20286a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u2 f20287b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f20288c;

        public b(MaxNativeAdView maxNativeAdView, u2 u2Var, MaxNativeAd maxNativeAd) {
            this.f20286a = maxNativeAdView;
            this.f20287b = u2Var;
            this.f20288c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f20286a);
            }
            MaxNativeAdLoaderImpl.this.sdk.z().d(this.f20287b);
            this.f20286a.render(this.f20287b, MaxNativeAdLoaderImpl.this.f20274a, MaxNativeAdLoaderImpl.this.sdk);
            this.f20288c.setNativeAdView(this.f20286a);
            if (this.f20288c.prepareForInteraction(this.f20286a.getClickableViews(), this.f20286a)) {
                return;
            }
            this.f20288c.prepareViewForInteraction(this.f20286a);
        }
    }

    public class c implements a.InterfaceC0312a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f20279f);
            }
            l2.a(MaxNativeAdLoaderImpl.this.f20279f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f20279f);
            }
            l2.a(MaxNativeAdLoaderImpl.this.f20279f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new f(0, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            l2.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            u2 u2Var = (u2) maxAd;
            u2Var.g(MaxNativeAdLoaderImpl.this.f20275b);
            u2Var.f(MaxNativeAdLoaderImpl.this.f20276c);
            synchronized (MaxNativeAdLoaderImpl.this.f20278e) {
                MaxNativeAdLoaderImpl.this.f20281h.add(u2Var);
            }
            MaxNativeAdView maxNativeAdViewA = MaxNativeAdLoaderImpl.this.a(u2Var.J());
            if (maxNativeAdViewA == null) {
                o oVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (o.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                }
                String strO0 = u2Var.o0();
                if (StringUtils.isValidString(strO0)) {
                    o oVar3 = MaxNativeAdLoaderImpl.this.logger;
                    if (o.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "Using template: " + strO0 + "...");
                    }
                    maxNativeAdViewA = new MaxNativeAdView(strO0, k.o());
                }
            }
            if (maxNativeAdViewA == null) {
                o oVar4 = MaxNativeAdLoaderImpl.this.logger;
                if (o.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                o oVar5 = MaxNativeAdLoaderImpl.this.logger;
                if (o.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl5 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl5.logger.a(maxNativeAdLoaderImpl5.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f20279f);
                }
                l2.a(MaxNativeAdLoaderImpl.this.f20279f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(u2Var);
                return;
            }
            a(maxNativeAdViewA);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA, u2Var, u2Var.getNativeAd());
            o oVar6 = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl6 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl6.logger.a(maxNativeAdLoaderImpl6.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewA + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f20279f);
            }
            l2.a(MaxNativeAdLoaderImpl.this.f20279f, maxNativeAdViewA, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(u2Var);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            u2 u2VarB;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (u2VarB = adViewTracker.b()) == null) {
                return;
            }
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(u2VarB);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    public MaxNativeAdLoaderImpl(String str, k kVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", kVar);
        this.f20274a = new c(this, null);
        this.f20277d = EnumC2121h.PUBLISHER_INITIATED;
        this.f20278e = new Object();
        this.f20280g = new HashMap();
        this.f20281h = new HashSet();
        kVar.j().a(this);
        if (o.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f20279f = null;
        this.sdk.j().b(this);
        synchronized (this.f20278e) {
            this.f20280g.clear();
            this.f20281h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f20275b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((u2) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (o.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (o.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (o.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f20274a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.X().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f20277d, this.localExtraParameters, this.extraParameters, k.o(), this.f20274a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0316a
    public void onAdExpired(o1 o1Var) {
        if (o.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (o.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + o1Var + "), listener=" + this.f20279f);
        }
        l2.b(this.f20279f, (MaxAd) o1Var, true);
    }

    @Override // com.applovin.impl.C2123i.b
    public void onCreativeIdGenerated(String str, String str2) {
        u2 u2Var;
        Iterator it = this.f20281h.iterator();
        while (true) {
            if (!it.hasNext()) {
                u2Var = null;
                break;
            } else {
                u2Var = (u2) it.next();
                if (u2Var.O().equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        if (u2Var != null) {
            u2Var.h(str2);
            l2.b(this.adReviewListener, str2, u2Var);
            synchronized (this.f20278e) {
                this.f20281h.remove(u2Var);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        u2 u2Var = (u2) maxAd;
        MaxNativeAd nativeAd = u2Var.getNativeAd();
        if (nativeAd == null) {
            if (o.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        u2Var.a(viewGroup);
        this.sdk.z().d(u2Var);
        a((q2) u2Var);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(u2Var, viewGroup, this.f20274a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.q0().a((w4) new f6(this.sdk, "renderMaxNativeAd", aVar), r5.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof u2)) {
            o.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            o.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        u2 u2Var = (u2) maxAd;
        MaxNativeAd nativeAd = u2Var.getNativeAd();
        if (nativeAd == null) {
            if (o.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(g3.f19415q7)).booleanValue()) {
            o.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, u2Var, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        a7.b(str, this.tag);
        this.f20276c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof EnumC2121h)) {
            this.f20277d = (EnumC2121h) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (o.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f20279f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f20275b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f20279f + ", revenueListener=" + this.revenueListener + '}';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u2 u2Var) {
        if (u2Var.n0().get()) {
            return;
        }
        this.sdk.f().a(u2Var, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f20278e) {
            this.f20280g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof u2) {
            u2 u2Var = (u2) maxAd;
            if (u2Var.r0()) {
                if (o.a()) {
                    this.logger.a(this.tag, "Native ad (" + u2Var + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.f20278e) {
                this.f20281h.remove(u2Var);
            }
            MaxNativeAdView maxNativeAdViewL0 = u2Var.l0();
            if (maxNativeAdViewL0 != null && (adViewTracker = maxNativeAdViewL0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                maxNativeAdViewL0.recycle();
            }
            MaxNativeAd nativeAd = u2Var.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(u2Var);
            this.sdk.X().destroyAd(u2Var);
            if (this.sdk.R() != null) {
                this.sdk.R().c(this.adUnitId, u2Var.J());
                return;
            } else {
                this.sdk.Q().c(this.adUnitId, u2Var.J());
                return;
            }
        }
        if (o.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f20278e) {
            maxNativeAdView = (MaxNativeAdView) this.f20280g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, u2 u2Var, MaxNativeAd maxNativeAd) {
        u2Var.a(maxNativeAdView);
        a((q2) u2Var);
        b bVar = new b(maxNativeAdView, u2Var, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.q0().a((w4) new f6(this.sdk, "renderMaxNativeAd", bVar), r5.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.c();
    }
}
