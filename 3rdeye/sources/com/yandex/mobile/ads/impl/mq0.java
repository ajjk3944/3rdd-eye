package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes3.dex */
public final class mq0 {
    public static void a(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        Object systemService = view.getContext().getSystemService("input_method");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
