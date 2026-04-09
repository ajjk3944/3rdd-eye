package f1;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20046a = V0.m.h("ProcessUtils");

    public static boolean a(Context context, V0.b bVar) {
        String processName;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object objInvoke;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, h.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
            } catch (Throwable th) {
                V0.m.f().a(f20046a, "Unable to check ActivityThread for processName", th);
            }
            if (objInvoke instanceof String) {
                processName = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty()) {
                    processName = null;
                } else {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            processName = runningAppProcessInfo.processName;
                            break;
                        }
                    }
                    processName = null;
                }
            }
        }
        bVar.getClass();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
