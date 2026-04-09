package com.wifihacker.detector.common.util;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes3.dex */
public abstract class SystemUtil {

    public enum InstallOption {
        AUTO,
        EXTERNAL,
        INTERNAL,
        ERROR
    }

    public static int a() {
        return Build.VERSION.SDK_INT;
    }

    public static void b(Context context, View view, boolean z10) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (z10) {
            inputMethodManager.showSoftInput(view, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
