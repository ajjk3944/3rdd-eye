package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.K;
import com.applovin.impl.o2;
import com.applovin.impl.p2;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.u2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MaxAdPlacer implements p2.a {

    /* renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f21980a;

    /* renamed from: b, reason: collision with root package name */
    private MaxNativeAdViewBinder f21981b;

    /* renamed from: c, reason: collision with root package name */
    private final o2 f21982c;

    /* renamed from: d, reason: collision with root package name */
    private final p2 f21983d;

    /* renamed from: e, reason: collision with root package name */
    private Listener f21984e;
    protected final o logger;
    protected final k sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, k.o());
    }

    public void clearAds() {
        a(this.f21982c.b(), new C8.a(this, 10));
    }

    public Collection<Integer> clearTrailingAds(int i) {
        Collection<Integer> collectionE = this.f21982c.e(i);
        if (!collectionE.isEmpty()) {
            a(collectionE, new a(this, i, collectionE));
        }
        return collectionE;
    }

    public void destroy() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f21983d.c();
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return -System.identityHashCode(this.f21982c.a(i));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i, int i10) {
        if (isFilledPosition(i)) {
            AppLovinSdkUtils.Size size = this.f21980a;
            boolean z10 = size != AppLovinSdkUtils.Size.ZERO;
            int iMin = Math.min(z10 ? size.getWidth() : 360, i10);
            u2 u2Var = (u2) this.f21982c.a(i);
            if ("small_template_1".equalsIgnoreCase(u2Var.o0())) {
                return new AppLovinSdkUtils.Size(iMin, z10 ? this.f21980a.getHeight() : 120);
            }
            if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(u2Var.o0())) {
                return new AppLovinSdkUtils.Size(iMin, (int) (iMin / (z10 ? this.f21980a.getWidth() / this.f21980a.getHeight() : 1.2d)));
            }
            if (z10) {
                return this.f21980a;
            }
            if (u2Var.l0() != null) {
                View mainView = u2Var.l0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i) {
        return this.f21982c.b(i);
    }

    public int getAdjustedPosition(int i) {
        return this.f21982c.c(i);
    }

    public int getOriginalPosition(int i) {
        return this.f21982c.d(i);
    }

    public void insertItem(int i) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i);
        }
        this.f21982c.f(i);
    }

    public boolean isAdPosition(int i) {
        return this.f21982c.g(i);
    }

    public boolean isFilledPosition(int i) {
        return this.f21982c.h(i);
    }

    public void loadAds() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f21983d.e();
    }

    public void moveItem(int i, int i10) {
        this.f21982c.b(i, i10);
    }

    @Override // com.applovin.impl.p2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f21984e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.p2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f21984e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.p2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (o.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.p2.a
    public void onNativeAdLoaded() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(int i) {
        a(isFilledPosition(i) ? Collections.singletonList(Integer.valueOf(i)) : Collections.EMPTY_LIST, new K(i, 1, this));
    }

    public void renderAd(int i, ViewGroup viewGroup) {
        MaxAd maxAdA = this.f21982c.a(i);
        if (maxAdA == null) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewL0 = ((u2) maxAdA).l0();
        if (maxNativeAdViewL0 == null) {
            if (this.f21981b == null) {
                if (o.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewL0 = new MaxNativeAdView(this.f21981b, viewGroup.getContext());
            if (this.f21983d.a(maxNativeAdViewL0, maxAdA)) {
                if (o.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i);
                }
            } else if (o.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i);
            }
        } else if (o.a()) {
            this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewL0.getParent() != null) {
            ((ViewGroup) maxNativeAdViewL0.getParent()).removeView(maxNativeAdViewL0);
        }
        viewGroup.addView(maxNativeAdViewL0, -1, -1);
    }

    public void setAdSize(int i, int i10) {
        this.f21980a = new AppLovinSdkUtils.Size(i, i10);
    }

    public void setListener(Listener listener) {
        this.f21984e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f21981b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i, int i10) {
        this.f21982c.c(i, i10);
        if (i == -1 || i10 == -1) {
            return;
        }
        a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, Collection collection) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i);
        }
        this.f21982c.a(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f21982c.a();
        this.f21983d.a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f21980a = AppLovinSdkUtils.Size.ZERO;
        k kVarA = appLovinSdk.a();
        this.sdk = kVarA;
        o oVarO = kVarA.O();
        this.logger = oVarO;
        this.f21982c = new o2(maxAdPlacerSettings);
        this.f21983d = new p2(maxAdPlacerSettings, context, this);
        if (o.a()) {
            oVarO.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i);
        }
        this.f21982c.i(i);
    }

    private void a() {
        int iC;
        while (this.f21983d.d() && (iC = this.f21982c.c()) != -1) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + iC);
            }
            this.f21982c.a(this.f21983d.b(), iC);
            Listener listener = this.f21984e;
            if (listener != null) {
                listener.onAdLoaded(iC);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f21983d.a(this.f21982c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f21984e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f21984e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
