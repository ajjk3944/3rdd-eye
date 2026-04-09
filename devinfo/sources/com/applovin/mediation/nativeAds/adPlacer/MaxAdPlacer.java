package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.o0;
import com.applovin.impl.adview.p;
import com.applovin.impl.d3;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w2;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxAdPlacer implements x2.a {

    /* renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f6409a;

    /* renamed from: b, reason: collision with root package name */
    private MaxNativeAdViewBinder f6410b;

    /* renamed from: c, reason: collision with root package name */
    private final w2 f6411c;

    /* renamed from: d, reason: collision with root package name */
    private final x2 f6412d;

    /* renamed from: e, reason: collision with root package name */
    private Listener f6413e;
    protected final o logger;
    protected final k sdk;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i4);

        void onAdRemoved(int i4);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, k.o());
    }

    public void clearAds() {
        a(this.f6411c.b(), new o0(15, this));
    }

    public Collection<Integer> clearTrailingAds(int i4) {
        Collection<Integer> collectionE = this.f6411c.e(i4);
        if (!collectionE.isEmpty()) {
            a(collectionE, new a(this, i4, collectionE, 0));
        }
        return collectionE;
    }

    public void destroy() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f6412d.c();
    }

    public long getAdItemId(int i4) {
        if (isFilledPosition(i4)) {
            return -System.identityHashCode(this.f6411c.a(i4));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i4) {
        if (isFilledPosition(i4)) {
            boolean z3 = this.f6409a != AppLovinSdkUtils.Size.ZERO;
            d3 d3Var = (d3) this.f6411c.a(i4);
            if (z3) {
                return this.f6409a;
            }
            if (d3Var.s0() != null) {
                View mainView = d3Var.s0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i4) {
        return this.f6411c.b(i4);
    }

    public int getAdjustedPosition(int i4) {
        return this.f6411c.c(i4);
    }

    public int getOriginalPosition(int i4) {
        return this.f6411c.d(i4);
    }

    public void insertItem(int i4) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i4);
        }
        this.f6411c.f(i4);
    }

    public boolean isAdPosition(int i4) {
        return this.f6411c.g(i4);
    }

    public boolean isFilledPosition(int i4) {
        return this.f6411c.h(i4);
    }

    public void loadAds() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f6412d.e();
    }

    public void moveItem(int i4, int i10) {
        this.f6411c.b(i4, i10);
    }

    @Override // com.applovin.impl.x2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f6413e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f6413e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (o.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdLoaded() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(int i4) {
        a(isFilledPosition(i4) ? Collections.singletonList(Integer.valueOf(i4)) : Collections.EMPTY_LIST, new p(this, i4, 2));
    }

    public void renderAd(int i4, ViewGroup viewGroup) {
        MaxAd maxAdA = this.f6411c.a(i4);
        if (maxAdA == null) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i4);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewS0 = ((d3) maxAdA).s0();
        if (maxNativeAdViewS0 == null) {
            if (this.f6410b == null) {
                if (o.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i4 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewS0 = new MaxNativeAdView(this.f6410b, viewGroup.getContext());
            if (this.f6412d.a(maxNativeAdViewS0, maxAdA)) {
                if (o.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i4);
                }
            } else if (o.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i4);
            }
        } else if (o.a()) {
            this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i4);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewS0.getParent() != null) {
            ((ViewGroup) maxNativeAdViewS0.getParent()).removeView(maxNativeAdViewS0);
        }
        viewGroup.addView(maxNativeAdViewS0, -1, -1);
    }

    public void setAdSize(int i4, int i10) {
        this.f6409a = new AppLovinSdkUtils.Size(i4, i10);
    }

    public void setListener(Listener listener) {
        this.f6413e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f6410b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i4, int i10) {
        this.f6411c.c(i4, i10);
        if (i4 == -1 || i10 == -1) {
            return;
        }
        a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i4, Collection collection) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i4);
        }
        this.f6411c.a(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f6411c.a();
        this.f6412d.a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f6409a = AppLovinSdkUtils.Size.ZERO;
        k kVarA = appLovinSdk.a();
        this.sdk = kVarA;
        o oVarO = kVarA.O();
        this.logger = oVarO;
        this.f6411c = new w2(maxAdPlacerSettings);
        this.f6412d = new x2(maxAdPlacerSettings, context, this);
        if (o.a()) {
            oVarO.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i4) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i4);
        }
        this.f6411c.i(i4);
    }

    private void a() {
        int iC;
        while (this.f6412d.d() && (iC = this.f6411c.c()) != -1) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + iC);
            }
            this.f6411c.a(this.f6412d.b(), iC);
            Listener listener = this.f6413e;
            if (listener != null) {
                listener.onAdLoaded(iC);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f6412d.a(this.f6411c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f6413e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f6413e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
