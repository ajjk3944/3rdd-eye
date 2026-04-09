package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.view.View;

/* loaded from: classes3.dex */
public final class g90 {

    /* renamed from: a, reason: collision with root package name */
    private final f90 f27589a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f27590b;

    /* renamed from: c, reason: collision with root package name */
    private final q10 f27591c;

    public g90(f90 feedDivContextFactory, mp1 reporter, q10 div2ViewFactory) {
        kotlin.jvm.internal.l.f(feedDivContextFactory, "feedDivContextFactory");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(div2ViewFactory, "div2ViewFactory");
        this.f27589a = feedDivContextFactory;
        this.f27590b = reporter;
        this.f27591c = div2ViewFactory;
    }

    public final pk1 a(w20 divKitDesign, pz1 ad) {
        kotlin.jvm.internal.l.f(divKitDesign, "divKitDesign");
        kotlin.jvm.internal.l.f(ad, "ad");
        try {
            oo ooVar = new oo();
            q20 q20Var = new q20(ooVar);
            e90 e90VarA = this.f27589a.a(q20Var);
            e90VarA.a(divKitDesign.b(), ad);
            this.f27591c.getClass();
            C0675l c0675l = new C0675l(e90VarA, null, 6);
            c0675l.F(divKitDesign.b(), divKitDesign.c());
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            c0675l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            return new pk1(divKitDesign, c0675l, ooVar, q20Var);
        } catch (Throwable th) {
            fp0.b(new Object[0]);
            this.f27590b.reportError("Failed to preload feed view", th);
            return null;
        }
    }
}
