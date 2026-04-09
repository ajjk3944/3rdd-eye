package com.bytedance.sdk.openadsdk.component;

import b9.b;
import com.bytedance.sdk.component.utils.ko;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw implements b, com.bytedance.sdk.openadsdk.component.le.ouw {
    public void lh() {
        ko.ouw("AppOpenAdCallbackCollection", "open_ad", "onClickDislike");
    }

    @Override // b9.b
    public final void ouw(long j, int i4) {
        ko.ouw("AppOpenAdCallbackCollection", "open_ad", "onComplete");
    }

    @Override // b9.b
    public void vt(long j, int i4) {
        ko.ouw("AppOpenAdCallbackCollection", "open_ad", "onError");
    }

    public void yu() {
        ko.ouw("AppOpenAdCallbackCollection", "open_ad", "onCountDownFinish");
    }

    @Override // b9.b
    public void ouw() {
        ko.ouw("AppOpenAdCallbackCollection", "open_ad", "onTimeOut");
    }

    public void vt() {
        ko.ouw("AppOpenAdCallbackCollection", "open_ad", "onClickSkip");
    }

    @Override // b9.b
    public void ouw(long j, long j8) {
        ko.ouw("AppOpenAdCallbackCollection", "open_ad", "onProgressUpdate");
    }

    public void ouw(int i4, boolean z3) {
        ko.ouw("AppOpenAdCallbackCollection", "open_ad", "onTimeChanged");
    }

    public void fkw() {
    }

    public void le() {
    }

    public void ra() {
    }
}
