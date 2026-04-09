package com.bytedance.sdk.openadsdk.dg;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.ul;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw {
    private static boolean bw = false;
    private static Method dg;
    private static Method emc;
    private static Method xq;
    private static Class<?> ypw;

    static {
        ypw();
    }

    public static JSONObject emc() {
        Method method;
        List list;
        Method method2;
        Method method3;
        int i = Build.VERSION.SDK_INT;
        JSONObject jSONObject = null;
        if (i >= 35 && xq()) {
            ypw();
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.aa.emc().getSystemService(ActivityManager.class);
                    if (activityManager != null && (method = emc) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                        Object obj = list.get(0);
                        if (i >= 36 && obj != null && (method3 = xq) != null) {
                            jSONObject2.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                        }
                        if (obj != null && (method2 = dg) != null) {
                            jSONObject2.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                        }
                    }
                    return jSONObject2;
                } catch (Throwable th) {
                    th = th;
                    jSONObject = jSONObject2;
                    ul.xq(th.getMessage(), new Object[0]);
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return jSONObject;
    }

    private static boolean xq() {
        return com.bytedance.sdk.openadsdk.sra.emc.emc("s_i_e", 0) == 1;
    }

    private static void ypw() {
        int i;
        if (bw || (i = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (xq()) {
                emc = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                ypw = cls;
                dg = cls.getMethod("getReason", null);
                if (i >= 36) {
                    xq = ypw.getMethod("getStartComponent", null);
                }
                bw = true;
            }
        } catch (Throwable th) {
            ul.xq(th.getMessage(), new Object[0]);
        }
    }
}
