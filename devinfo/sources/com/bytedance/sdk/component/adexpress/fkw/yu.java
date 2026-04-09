package com.bytedance.sdk.component.adexpress.fkw;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.ouw.qbp;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    private WeakReference<qbp> ouw;

    public yu(qbp qbpVar) {
        this.ouw = new WeakReference<>(qbpVar);
    }

    @JavascriptInterface
    public final void invokeMethod(String str) {
        WeakReference<qbp> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().invokeMethod(str);
    }

    public final void ouw(qbp qbpVar) {
        this.ouw = new WeakReference<>(qbpVar);
    }
}
