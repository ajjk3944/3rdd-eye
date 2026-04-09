package com.bytedance.sdk.openadsdk.core.ru.emc;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private static volatile ypw emc;
    private final ArrayList<String> ypw = new ArrayList<>();
    private final AtomicBoolean xq = new AtomicBoolean(false);
    private long dg = System.currentTimeMillis();
    private long bw = 0;
    private long ycc = 0;
    private String uym = "";
    private String msw = "";
    private String zz = "";
    private boolean ru = false;
    private boolean gbl = false;

    public static ypw emc(Application application) {
        if (emc == null) {
            synchronized (ypw.class) {
                try {
                    if (emc == null) {
                        ypw ypwVar = new ypw();
                        emc = ypwVar;
                        ypwVar.ru = emc((Context) application);
                        emc.gbl = emc(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        emc.emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public void ypw(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.ypw.contains(localClassName)) {
            this.ypw.remove(localClassName);
        }
        if (this.ypw.size() == 0) {
            this.dg = System.currentTimeMillis();
            this.xq.set(true);
            this.msw = localClassName;
        }
    }

    private static int emc(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean emc(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void emc(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.ypw.size() == 0) {
            this.uym = localClassName;
            this.bw = System.currentTimeMillis();
            this.ycc = System.currentTimeMillis() - this.dg;
            this.xq.set(false);
        }
        if (!this.ypw.contains(localClassName)) {
            this.ypw.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.zz = localClassName;
    }

    private void emc() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            boolean z6 = true;
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object objValueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.ypw.contains(localClassName)) {
                            this.ypw.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.xq;
                if (this.ypw.size() > 0) {
                    z6 = false;
                }
                atomicBoolean.set(z6);
            }
        } catch (Throwable unused) {
        }
    }

    public String emc(String str, long j6, int i) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = jCurrentTimeMillis - this.bw;
        long j8 = jCurrentTimeMillis - j6;
        int i3 = j8 < 500 ? 1 : 0;
        if (this.xq.get() && this.gbl) {
            i3 |= 2;
        }
        if (!this.xq.get() && this.ycc >= 5000 && j7 < 1000) {
            i3 = this.msw.equals(this.zz) ? i3 | 4 : i3 | 8;
        }
        try {
            string = new JSONObject().put("rst", i3).put("adtag", str).put("bakdur", this.ycc).put("rit", i).put("poptime", j7).put("unlocktime", j8).put("bakground", this.xq).put("alert", this.gbl).put("sys", this.ru).put("actsize", this.ypw.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.ypw.xq()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.uym = "";
        this.ycc = 0L;
        this.bw = 0L;
        this.dg = System.currentTimeMillis();
        return string;
    }
}
