package tg;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final o f22838a = new o(1);

    /* renamed from: b, reason: collision with root package name */
    public static final o f22839b = new o(2);

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        br.l.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = mq.w.f16945a;
        }
        ArrayList arrayListP0 = mq.o.p0(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListP0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            br.l.d(str2, "processName");
            arrayList2.add(new c0(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, br.l.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static c0 b(Context context) {
        Object next;
        String strC;
        br.l.e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((c0) next).f22749b == iMyPid) {
                break;
            }
        }
        c0 c0Var = (c0) next;
        if (c0Var != null) {
            return c0Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            strC = Process.myProcessName();
            br.l.d(strC, "myProcessName(...)");
        } else if ((i10 < 28 || (strC = Application.getProcessName()) == null) && (strC = gc.b.c()) == null) {
            strC = "";
        }
        return new c0(strC, iMyPid, 0, false);
    }
}
