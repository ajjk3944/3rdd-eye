package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes3.dex */
public final class wj2 {
    public static Rect a(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        Rect rect = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (NullPointerException unused) {
        }
        int[] iArr = {i, i};
        view.getRootView().getLocationOnScreen(iArr);
        int i = -iArr[0];
        int i10 = -iArr[1];
        rect.offset(i, i10);
        return rect;
    }
}
