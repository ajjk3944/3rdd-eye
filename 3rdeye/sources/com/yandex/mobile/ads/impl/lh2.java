package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class lh2 {

    public interface a {
        boolean b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        return ((a) view).b() && view.hasWindowFocus() && !jh2.d(view);
    }
}
