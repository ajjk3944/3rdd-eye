package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ac0 implements bc0 {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f24607b;

    /* renamed from: a, reason: collision with root package name */
    private final ao1 f24608a = bo1.a();

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(ac0.class, "forceImpressionTrackingListenerReference", "getForceImpressionTrackingListenerReference()Lcom/monetization/ads/base/impression/ForceImpressionTrackingListener;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f24607b = new w9.i[]{nVar};
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    public final void a() {
        bc0 bc0Var = (bc0) this.f24608a.getValue(this, f24607b[0]);
        if (bc0Var != null) {
            bc0Var.a();
        }
    }

    public final void a(bc0 trackingListener) {
        kotlin.jvm.internal.l.f(trackingListener, "trackingListener");
        this.f24608a.setValue(this, f24607b[0], trackingListener);
    }
}
