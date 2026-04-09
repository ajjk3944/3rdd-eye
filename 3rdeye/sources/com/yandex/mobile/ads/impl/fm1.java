package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.gu0;

/* loaded from: classes3.dex */
public final class fm1 implements gu0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f27387a;

    /* renamed from: b, reason: collision with root package name */
    private final gu0.a f27388b;

    /* renamed from: c, reason: collision with root package name */
    private final yf f27389c;

    public fm1(float f10) {
        this(f10, new gu0.a());
    }

    @Override // com.yandex.mobile.ads.impl.gu0
    public final gu0.a a(int i, int i10) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int iA = this.f27389c.a(size);
            if (mode2 == Integer.MIN_VALUE) {
                iA = (int) Math.min(size2, iA);
            }
            i10 = View.MeasureSpec.makeMeasureSpec(iA, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int iB = this.f27389c.b(size2);
            if (mode == Integer.MIN_VALUE) {
                iB = (int) Math.min(size, iB);
            }
            i = View.MeasureSpec.makeMeasureSpec(iB, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            if (size / size2 > this.f27387a) {
                i = View.MeasureSpec.makeMeasureSpec(this.f27389c.b(size2), 1073741824);
                i10 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int iA2 = this.f27389c.a(size);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i10 = View.MeasureSpec.makeMeasureSpec(iA2, 1073741824);
                i = iMakeMeasureSpec;
            }
        }
        gu0.a aVar = this.f27388b;
        aVar.f27985a = i;
        aVar.f27986b = i10;
        return aVar;
    }

    public /* synthetic */ fm1(float f10, gu0.a aVar) {
        this(f10, aVar, new yf(f10));
    }

    public fm1(float f10, gu0.a measureSpecHolder, yf aspectRatioResolver) {
        kotlin.jvm.internal.l.f(measureSpecHolder, "measureSpecHolder");
        kotlin.jvm.internal.l.f(aspectRatioResolver, "aspectRatioResolver");
        this.f27387a = f10;
        this.f27388b = measureSpecHolder;
        this.f27389c = aspectRatioResolver;
    }
}
