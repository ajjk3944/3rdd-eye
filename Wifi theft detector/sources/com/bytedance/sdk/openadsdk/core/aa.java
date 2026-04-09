package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class aa {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context emc = null;
    private static int xq = -1;
    private static volatile sra<com.bytedance.sdk.openadsdk.dg.emc> ypw;

    public static class emc {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application emc;

        static {
            try {
                Object objYpw = ypw();
                emc = (Application) objYpw.getClass().getMethod("getApplication", null).invoke(objYpw, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.emc("MyApplication", "application get failed", th);
            }
        }

        @Nullable
        public static Application emc() {
            return emc;
        }

        private static Object ypw() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.emc("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }

    public static com.bytedance.sdk.openadsdk.vk.xq.xq bw() {
        return !com.bytedance.sdk.openadsdk.core.settings.uym.emc() ? com.bytedance.sdk.openadsdk.vk.xq.dg.emc() : com.bytedance.sdk.openadsdk.dg.emc.ypw.emc();
    }

    public static com.bytedance.sdk.openadsdk.core.settings.gbl dg() {
        return com.bytedance.sdk.openadsdk.core.settings.gbl.xq();
    }

    public static Context emc() {
        if (emc == null) {
            ypw(null);
        }
        return emc;
    }

    public static sra<com.bytedance.sdk.openadsdk.dg.emc> xq() {
        if (ypw == null) {
            synchronized (aa.class) {
                try {
                    if (ypw == null) {
                        ypw = new rie(emc);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    public static void ypw(Context context) {
        if (emc == null) {
            synchronized (aa.class) {
                try {
                    if (emc == null) {
                        if (context != null) {
                            emc = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                emc = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationEmc = emc.emc();
                            if (applicationEmc != null) {
                                emc = applicationEmc;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Context emc(Context context) {
        if (context == null) {
            context = emc();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int ypw() {
        Context contextEmc;
        if (xq < 0 && (contextEmc = emc()) != null) {
            xq = ViewConfiguration.get(contextEmc).getScaledTouchSlop();
        }
        return xq;
    }
}
