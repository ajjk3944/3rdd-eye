package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class m70 implements gq0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f30291b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f30292c;

    public m70(int i, RectF rectF) {
        this.f30291b = i;
        this.f30292c = rectF;
    }

    @Override // com.yandex.mobile.ads.impl.gq0
    public final String a() {
        Integer numValueOf = Integer.valueOf(this.f30291b);
        RectF rectF = this.f30292c;
        return C4215v0.a(new Object[]{numValueOf, rectF != null ? C4215v0.a(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4, "{x:%s,y:%s,width:%s,height:%s}", "format(...)") : null}, 2, "exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", "format(...)");
    }
}
