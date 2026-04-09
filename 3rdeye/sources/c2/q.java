package c2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: ProcessUtils.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18426a;

    static {
        String strG = androidx.work.m.g("ProcessUtils");
        kotlin.jvm.internal.l.e(strG, "tagWithPrefix(\"ProcessUtils\")");
        f18426a = strG;
    }

    public static final boolean a(Context context, androidx.work.b configuration) {
        String strA;
        Object next;
        Object objInvoke;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strA = C2051a.f18407a.a();
        } else {
            strA = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, androidx.work.u.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, new Object[0]);
                kotlin.jvm.internal.l.c(objInvoke);
            } catch (Throwable th) {
                androidx.work.m.e().b(f18426a, "Unable to check ActivityThread for processName", th);
            }
            if (objInvoke instanceof String) {
                strA = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
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
                        strA = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        String str = configuration.i;
        return (str == null || str.length() == 0) ? kotlin.jvm.internal.l.b(strA, context.getApplicationInfo().processName) : kotlin.jvm.internal.l.b(strA, str);
    }
}
