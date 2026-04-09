package com.mbridge.msdk.config.activity.backdispatcher;

import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.window.OnBackInvokedCallback;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    OnBackInvokedCallback f13085a;

    public void a(Window window, final b bVar) {
        if (Build.VERSION.SDK_INT < 33 || window == null || bVar == null) {
            return;
        }
        try {
            this.f13085a = new OnBackInvokedCallback() { // from class: com.mbridge.msdk.config.activity.backdispatcher.d
                public final void onBackInvoked() {
                    bVar.a();
                }
            };
            window.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f13085a);
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "registerOnBackInvokedCallback error");
        }
    }

    public void a(Window window) {
        if (Build.VERSION.SDK_INT < 33 || window == null) {
            return;
        }
        try {
            window.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f13085a);
            this.f13085a = null;
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "unregisterOnBackInvokedCallback error");
        }
    }
}
