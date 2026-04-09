package w5;

import android.app.ActivityManager;
import android.content.Context;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ProcessDetailsProvider.kt */
/* loaded from: classes2.dex */
public final class r {
    public static ArrayList a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = C2099t.f18581b;
        }
        ArrayList arrayListN0 = C2097r.n0(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListN0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.l.e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new q(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, kotlin.jvm.internal.l.b(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }
}
