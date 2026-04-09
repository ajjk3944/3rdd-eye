package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class zih {

    /* renamed from: lh, reason: collision with root package name */
    private static int f8545lh = -1;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context ouw;
    private static volatile vpp<com.bytedance.sdk.openadsdk.yu.ouw> vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application ouw;

        static {
            try {
                Object objVt = vt();
                ouw = (Application) objVt.getClass().getMethod("getApplication", null).invoke(objVt, null);
                com.bytedance.sdk.component.utils.ko.fkw("MyApplication", "application get success");
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.ouw("MyApplication", "application get failed", th2);
            }
        }

        public static Application ouw() {
            return ouw;
        }

        private static Object vt() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.ouw("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th2);
                return null;
            }
        }
    }

    public static com.bytedance.sdk.openadsdk.rn.lh.lh fkw() {
        return !com.bytedance.sdk.openadsdk.core.settings.ra.ouw() ? com.bytedance.sdk.openadsdk.rn.lh.fkw.ouw() : com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw();
    }

    public static vpp<com.bytedance.sdk.openadsdk.yu.ouw> lh() {
        if (vt == null) {
            synchronized (zih.class) {
                try {
                    if (vt == null) {
                        vt = new jqy(ouw);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }

    public static Context ouw() {
        if (ouw == null) {
            vt(null);
        }
        return ouw;
    }

    public static void vt(Context context) {
        if (ouw == null) {
            synchronized (zih.class) {
                try {
                    if (ouw == null) {
                        if (context != null) {
                            ouw = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                ouw = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationOuw = ouw.ouw();
                            if (applicationOuw != null) {
                                ouw = applicationOuw;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static com.bytedance.sdk.openadsdk.core.settings.cf yu() {
        return com.bytedance.sdk.openadsdk.core.settings.cf.vt();
    }

    public static Context ouw(Context context) {
        if (context == null) {
            context = ouw();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int vt() {
        Context contextOuw;
        if (f8545lh < 0 && (contextOuw = ouw()) != null) {
            f8545lh = ViewConfiguration.get(contextOuw).getScaledTouchSlop();
        }
        return f8545lh;
    }
}
