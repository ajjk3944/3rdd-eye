package pf;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g0 {
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        nk.k.e(context, "context");
        int i4 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = zj.s.f38317a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runningAppProcesses) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i4) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(zj.o.T(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            String str2 = runningAppProcessInfo.processName;
            nk.k.d(str2, "processName");
            arrayList3.add(new f0(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, nk.k.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList3;
    }

    public static f0 b(Context context) {
        Object obj;
        String strA;
        nk.k.e(context, "context");
        int iMyPid = Process.myPid();
        ArrayList arrayListA = a(context);
        int size = arrayListA.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayListA.get(i4);
            i4++;
            if (((f0) obj).f31815b == iMyPid) {
                break;
            }
        }
        f0 f0Var = (f0) obj;
        if (f0Var != null) {
            return f0Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            strA = Process.myProcessName();
            nk.k.d(strA, "myProcessName(...)");
        } else if ((i10 < 28 || (strA = Application.getProcessName()) == null) && (strA = tb.c.a()) == null) {
            strA = "";
        }
        return new f0(strA, iMyPid, 0, false);
    }
}
