package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ef, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2510Ef extends QC<EY> {
    public int A01;
    public final int A02;
    public final C23196g A05;
    public final C3272dL A06;
    public final KE A07;
    public final List<String> A09;
    public int A00 = 0;
    public final Application.ActivityLifecycleCallbacks A03 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (activity == this.A00.A06.A0E()) {
                this.A00.A04.removeCallbacks(this.A00.A08);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            this.A00.A04.post(this.A00.A08);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A08 = new RunnableC3266dF(this);

    public C2510Ef(C3272dL c3272dL, List<String> screenshotUrls, int i, C23196g c23196g, KE ke, int i10) {
        this.A09 = screenshotUrls;
        this.A02 = i;
        this.A06 = c3272dL;
        this.A05 = c23196g;
        this.A07 = ke;
        this.A01 = i10;
        this.A04.post(this.A08);
        if (Build.VERSION.SDK_INT >= 29 && this.A06.A0E() != null) {
            this.A06.A0E().registerActivityLifecycleCallbacks(this.A03);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final EY A0F(ViewGroup viewGroup, int i) {
        EW ew = new EW(this.A06);
        if (U7.A1C(this.A06)) {
            ew.setOnClickListener(new ViewOnClickListenerC3267dG(this));
        }
        return new EY(ew);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void A0K(EY ey, int i) {
        String str = this.A09.get(i % this.A09.size());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(400, -1);
        int i10 = this.A02;
        int actualPosition = this.A02;
        marginLayoutParams.setMargins(i10, 0, actualPosition, 0);
        ey.A0p().setLayoutParams(marginLayoutParams);
        ey.A0p().setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A09.size() * 1000;
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final void A0L(C23196g c23196g) {
        super.A0L(c23196g);
        this.A04.removeCallbacks(this.A08);
        if (Build.VERSION.SDK_INT >= 29 && this.A06.A0E() != null) {
            this.A06.A0E().unregisterActivityLifecycleCallbacks(this.A03);
        }
    }

    public final void A0O(int i) {
        this.A01 = i;
    }
}
