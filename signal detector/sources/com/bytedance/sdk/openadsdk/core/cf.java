package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* loaded from: classes.dex */
public class cf {
    private final com.bytedance.sdk.openadsdk.utils.emc emc = new com.bytedance.sdk.openadsdk.utils.emc();
    private boolean ypw;

    public static class emc {
        private static final cf emc = new cf();
    }

    public static cf emc() {
        return emc.emc;
    }

    public com.bytedance.sdk.openadsdk.utils.emc bw() {
        return this.emc;
    }

    public boolean dg() {
        return this.emc.emc();
    }

    public boolean xq() {
        return this.ypw;
    }

    public void ypw() {
        try {
            Context contextEmc = aa.emc();
            if (contextEmc instanceof Application) {
                ((Application) contextEmc).registerActivityLifecycleCallbacks(this.emc);
                this.ypw = true;
            } else {
                if (contextEmc == null || contextEmc.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextEmc.getApplicationContext()).registerActivityLifecycleCallbacks(this.emc);
                this.ypw = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean emc(boolean z6) {
        return this.emc.emc(z6);
    }
}
