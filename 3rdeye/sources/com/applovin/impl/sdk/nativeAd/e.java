package com.applovin.impl.sdk.nativeAd;

import android.view.View;
import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f21326c;

    public /* synthetic */ e(View.OnClickListener onClickListener, int i) {
        this.f21325b = i;
        this.f21326c = onClickListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21325b) {
            case 0:
                ((AppLovinVastMediaView.f) this.f21326c).a();
                break;
            default:
                ((AppLovinNativeAdImpl) this.f21326c).lambda$unregisterViewsForInteraction$0();
                break;
        }
    }
}
