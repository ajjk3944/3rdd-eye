package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class we2 implements gu {

    /* renamed from: a, reason: collision with root package name */
    private gu f34944a;

    public final void a(ye2 ye2Var) {
        this.f34944a = ye2Var;
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoCompleted() {
        gu guVar = this.f34944a;
        if (guVar != null) {
            guVar.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoError() {
        gu guVar = this.f34944a;
        if (guVar != null) {
            guVar.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoPaused() {
        gu guVar = this.f34944a;
        if (guVar != null) {
            guVar.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoPrepared() {
        gu guVar = this.f34944a;
        if (guVar != null) {
            guVar.onVideoPrepared();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoResumed() {
        gu guVar = this.f34944a;
        if (guVar != null) {
            guVar.onVideoResumed();
        }
    }
}
