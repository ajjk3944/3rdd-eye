package com.bytedance.sdk.openadsdk.core.tlj.ouw;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt {
    private static volatile vt bly;
    final ArrayList<String> ouw = new ArrayList<>();
    final AtomicBoolean vt = new AtomicBoolean(false);

    /* renamed from: lh, reason: collision with root package name */
    long f8469lh = System.currentTimeMillis();
    long yu = 0;
    long fkw = 0;

    /* renamed from: le, reason: collision with root package name */
    String f8468le = "";
    String ra = "";
    String pno = "";
    private boolean tlj = false;

    /* renamed from: cf, reason: collision with root package name */
    private boolean f8467cf = false;

    public static vt ouw(Application application) {
        int size;
        ApplicationInfo applicationInfo;
        if (bly == null) {
            synchronized (vt.class) {
                try {
                    if (bly == null) {
                        vt vtVar = new vt();
                        bly = vtVar;
                        vtVar.tlj = (application == null || (applicationInfo = application.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
                        bly.f8467cf = ouw(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        vt vtVar2 = bly;
                        try {
                            Class<?> cls = Class.forName("android.app.ActivityThread");
                            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
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
                                for (int i4 = 0; i4 < size; i4++) {
                                    Object objValueAt = arrayMap.valueAt(i4);
                                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                                        if (!vtVar2.ouw.contains(localClassName)) {
                                            vtVar2.ouw.add(localClassName);
                                        }
                                    }
                                }
                                vtVar2.vt.set(vtVar2.ouw.size() <= 0);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return bly;
    }

    private static int ouw(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final String ouw(String str, long j, int i4) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = jCurrentTimeMillis - this.yu;
        long j9 = jCurrentTimeMillis - j;
        int i10 = j9 < 500 ? 1 : 0;
        if (this.vt.get() && this.f8467cf) {
            i10 |= 2;
        }
        if (!this.vt.get() && this.fkw >= 5000 && j8 < 1000) {
            i10 = this.ra.equals(this.pno) ? i10 | 4 : i10 | 8;
        }
        try {
            string = new JSONObject().put("rst", i10).put("adtag", str).put("bakdur", this.fkw).put("rit", i4).put("poptime", j8).put("unlocktime", j9).put("bakground", this.vt).put("alert", this.f8467cf).put("sys", this.tlj).put("actsize", this.ouw.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.vt.lh()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.f8468le = "";
        this.fkw = 0L;
        this.yu = 0L;
        this.f8469lh = System.currentTimeMillis();
        return string;
    }
}
