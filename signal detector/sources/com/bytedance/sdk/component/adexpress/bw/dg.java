package com.bytedance.sdk.component.adexpress.bw;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.emc.ul;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class dg {
    private WeakReference<ul> emc;

    public dg(ul ulVar) {
        this.emc = new WeakReference<>(ulVar);
    }

    public void emc(ul ulVar) {
        this.emc = new WeakReference<>(ulVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<ul> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().invokeMethod(str);
    }
}
