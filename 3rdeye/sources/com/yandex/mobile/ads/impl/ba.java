package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;

/* loaded from: classes3.dex */
public final class ba {
    public static final boolean a(Context context) {
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static final boolean a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }
}
