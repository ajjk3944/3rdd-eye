package c7;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import t6.i0;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2785a;

    static {
        String strG = v.g("ProcessUtils");
        nk.k.d(strG, "tagWithPrefix(...)");
        f2785a = strG;
    }

    public static final boolean a(Context context, t6.b bVar) {
        String strB;
        Object next;
        Object objInvoke;
        nk.k.e(context, "context");
        nk.k.e(bVar, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strB = a.b();
        } else {
            strB = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, i0.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                nk.k.b(objInvoke);
            } catch (Throwable th2) {
                v.e().b(f2785a, "Unable to check ActivityThread for processName", th2);
            }
            if (objInvoke instanceof String) {
                strB = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                nk.k.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strB = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return nk.k.a(strB, context.getApplicationInfo().processName);
    }
}
