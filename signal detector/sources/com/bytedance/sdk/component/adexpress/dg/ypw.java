package com.bytedance.sdk.component.adexpress.dg;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class ypw {
    public static boolean emc(Context context) {
        return context != null && TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1 && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
