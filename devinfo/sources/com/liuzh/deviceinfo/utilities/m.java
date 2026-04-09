package com.liuzh.deviceinfo.utilities;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class m {
    public static void a(View view) {
        WindowInsetsController windowInsetsController;
        nk.k.e(view, "view");
        if (wi.h.f36761f && (windowInsetsController = view.getWindowInsetsController()) != null) {
            windowInsetsController.hide(WindowInsets.Type.ime());
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void b(View view) {
        WindowInsetsController windowInsetsController;
        if (wi.h.f36761f && (windowInsetsController = view.getWindowInsetsController()) != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0);
        }
    }
}
