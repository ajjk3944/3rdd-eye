package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.yandex.mobile.ads.impl.lh2;

/* loaded from: classes3.dex */
public final class l70 {

    /* renamed from: a, reason: collision with root package name */
    private final lh2 f29909a;

    public /* synthetic */ l70() {
        this(new lh2());
    }

    public final <T extends View & lh2.a> k70 a(T view) {
        int iA;
        kotlin.jvm.internal.l.f(view, "view");
        this.f29909a.getClass();
        RectF rectF = null;
        if (lh2.a(view)) {
            iA = jh2.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            kotlin.jvm.internal.l.e(context, "getContext(...)");
            if (rect != null) {
                float fA = jh2.a(context, rect.left);
                float fA2 = jh2.a(context, rect.top);
                float fA3 = jh2.a(context, rect.right);
                float fA4 = jh2.a(context, rect.bottom);
                float f10 = fA4 - fA2;
                if (fA3 - fA > 0.0f && f10 > 0.0f) {
                    rectF = new RectF(fA, fA2, fA3, fA4);
                }
            }
        } else {
            iA = 0;
        }
        return new k70(iA, rectF);
    }

    public l70(lh2 viewableChecker) {
        kotlin.jvm.internal.l.f(viewableChecker, "viewableChecker");
        this.f29909a = viewableChecker;
    }
}
