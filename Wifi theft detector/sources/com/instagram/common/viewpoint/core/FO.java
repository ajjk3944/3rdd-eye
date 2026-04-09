package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class FO extends AbstractC1162Qq<FB> {
    public int A00;
    public final int A01;
    public final C7M A04;
    public final C1814gi A05;
    public final ViewOnClickListenerC1012Kr A06;
    public final List<String> A08;
    public final Application.ActivityLifecycleCallbacks A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (activity == this.A00.A05.A0E()) {
                this.A00.A03.removeCallbacks(this.A00.A07);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            this.A00.A03.post(this.A00.A07);
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
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Runnable A07 = new RunnableC1679eX(this);

    public FO(C1814gi c1814gi, List<String> screenshotUrls, int i10, C7M c7m, ViewOnClickListenerC1012Kr viewOnClickListenerC1012Kr, int i11) {
        this.A08 = screenshotUrls;
        this.A01 = i10;
        this.A05 = c1814gi;
        this.A04 = c7m;
        this.A06 = viewOnClickListenerC1012Kr;
        this.A00 = i11;
        this.A03.post(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().registerActivityLifecycleCallbacks(this.A02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final FB A0F(ViewGroup viewGroup, int i10) {
        F9 f92 = new F9(this.A05);
        if (C1264Up.A1D(this.A05)) {
            f92.setOnClickListener(new ViewOnClickListenerC1680eY(this));
        }
        return new FB(f92);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void A0K(FB fb, int i10) {
        String str = this.A08.get(i10 % this.A08.size());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(400, -1);
        int i11 = this.A01;
        int actualPosition = this.A01;
        marginLayoutParams.setMargins(i11, 0, actualPosition, 0);
        fb.A0p().setLayoutParams(marginLayoutParams);
        fb.A0p().setUrl(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    public final int A0B() {
        return this.A08.size() * 1000;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    public final void A0L(C7M c7m) {
        super.A0L(c7m);
        this.A03.removeCallbacks(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().unregisterActivityLifecycleCallbacks(this.A02);
        }
    }

    public final void A0O(int i10) {
        this.A00 = i10;
    }
}
