package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;

/* compiled from: ViewUtility.kt */
/* loaded from: classes2.dex */
public final class s {
    public static final s INSTANCE = new s();

    private s() {
    }

    public final int dpToPixels(Context context, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final b9.l<Integer, Integer> getDeviceWidthAndHeightWithOrientation(Context context, int i) {
        kotlin.jvm.internal.l.f(context, "context");
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i10 = resources.getConfiguration().orientation;
        if (i == 0) {
            i = i10;
        }
        return i == i10 ? new b9.l<>(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density))) : new b9.l<>(Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)));
    }

    public final WebView getWebView(Context context) throws InstantiationException {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            return new WebView(context);
        } catch (Resources.NotFoundException e4) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e4 + ".message");
        } catch (Exception e10) {
            throw new InstantiationException(e10.getMessage());
        }
    }
}
