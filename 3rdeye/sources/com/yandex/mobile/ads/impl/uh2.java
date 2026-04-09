package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes3.dex */
public final class uh2 {

    /* renamed from: a, reason: collision with root package name */
    private final mf1 f34065a;

    /* renamed from: b, reason: collision with root package name */
    private final vh2 f34066b;

    public uh2(mf1 overlappingAreaProvider, vh2 visibleRectProvider) {
        kotlin.jvm.internal.l.f(overlappingAreaProvider, "overlappingAreaProvider");
        kotlin.jvm.internal.l.f(visibleRectProvider, "visibleRectProvider");
        this.f34065a = overlappingAreaProvider;
        this.f34066b = visibleRectProvider;
    }

    public final int a(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        boolean zD = jh2.d(view);
        Rect rectA = this.f34066b.a(view);
        if (zD || rectA == null) {
            return 0;
        }
        return (rectA.width() * rectA.height()) - this.f34065a.a(view, rectA);
    }
}
