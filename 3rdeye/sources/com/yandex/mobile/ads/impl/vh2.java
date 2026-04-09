package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class vh2 {

    /* renamed from: a, reason: collision with root package name */
    private final wj2 f34545a;

    public /* synthetic */ vh2() {
        this(new wj2());
    }

    public final Rect a(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA == null || !du1VarA.z0()) {
            return rect;
        }
        this.f34545a.getClass();
        Rect rectA = wj2.a(view);
        Rect rect2 = new Rect(rect);
        if (rect2.intersect(rectA)) {
            return rect2;
        }
        return null;
    }

    public vh2(wj2 windowVisibleRectProvider) {
        kotlin.jvm.internal.l.f(windowVisibleRectProvider, "windowVisibleRectProvider");
        this.f34545a = windowVisibleRectProvider;
    }
}
