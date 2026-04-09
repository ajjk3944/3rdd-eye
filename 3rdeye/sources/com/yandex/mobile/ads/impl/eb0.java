package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import com.yandex.mobile.ads.impl.gu0;

/* loaded from: classes3.dex */
public final class eb0 implements gu0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f26771a;

    /* renamed from: b, reason: collision with root package name */
    private final gu0.a f26772b;

    public eb0(ExtendedVideoAdControlsContainer container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f26771a = container;
        this.f26772b = new gu0.a();
    }

    @Override // com.yandex.mobile.ads.impl.gu0
    public final gu0.a a(int i, int i10) {
        int iY = com.google.gson.internal.c.y(this.f26771a.getHeight() * 0.1f);
        gu0.a aVar = this.f26772b;
        aVar.f27985a = i;
        aVar.f27986b = View.MeasureSpec.makeMeasureSpec(iY, 1073741824);
        return this.f26772b;
    }
}
