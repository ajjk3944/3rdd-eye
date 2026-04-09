package com.bytedance.sdk.openadsdk.yu;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.qbp;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {
    private static boolean fkw = false;

    /* renamed from: lh, reason: collision with root package name */
    private static Method f8839lh;
    private static Method ouw;
    private static Class<?> vt;
    private static Method yu;

    static {
        vt();
    }

    private static boolean lh() {
        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("s_i_e", 0) == 1;
    }

    public static JSONObject ouw() {
        Method method;
        List list;
        Method method2;
        Method method3;
        int i4 = Build.VERSION.SDK_INT;
        JSONObject jSONObject = null;
        if (i4 >= 35 && lh()) {
            vt();
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.zih.ouw().getSystemService(ActivityManager.class);
                    if (activityManager != null && (method = ouw) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                        Object obj = list.get(0);
                        if (i4 >= 36 && obj != null && (method3 = f8839lh) != null) {
                            jSONObject2.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                        }
                        if (obj != null && (method2 = yu) != null) {
                            jSONObject2.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                        }
                    }
                    return jSONObject2;
                } catch (Throwable th2) {
                    th = th2;
                    jSONObject = jSONObject2;
                    qbp.yu(th.getMessage(), new Object[0]);
                    return jSONObject;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return jSONObject;
    }

    private static void vt() {
        int i4;
        if (fkw || (i4 = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (lh()) {
                ouw = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                vt = cls;
                yu = cls.getMethod("getReason", null);
                if (i4 >= 36) {
                    f8839lh = vt.getMethod("getStartComponent", null);
                }
                fkw = true;
            }
        } catch (Throwable th2) {
            qbp.yu(th2.getMessage(), new Object[0]);
        }
    }
}
