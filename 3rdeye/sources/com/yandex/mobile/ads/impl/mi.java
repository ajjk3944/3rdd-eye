package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;

/* loaded from: classes3.dex */
public final class mi<T extends View> implements sd<T> {
    @Override // com.yandex.mobile.ads.impl.sd
    public final void a(T view) {
        kotlin.jvm.internal.l.f(view, "view");
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(500);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sd
    public final void cancel() {
    }
}
