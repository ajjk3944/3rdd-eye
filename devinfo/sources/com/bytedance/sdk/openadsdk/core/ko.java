package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko {
    public final com.bytedance.sdk.openadsdk.utils.ouw ouw = new com.bytedance.sdk.openadsdk.utils.ouw();
    public boolean vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        private static final ko ouw = new ko();
    }

    public static ko ouw() {
        return ouw.ouw;
    }

    public final void vt() {
        try {
            Context contextOuw = zih.ouw();
            if (contextOuw instanceof Application) {
                ((Application) contextOuw).registerActivityLifecycleCallbacks(this.ouw);
                this.vt = true;
            } else {
                if (contextOuw == null || contextOuw.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextOuw.getApplicationContext()).registerActivityLifecycleCallbacks(this.ouw);
                this.vt = true;
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th2);
        }
    }
}
