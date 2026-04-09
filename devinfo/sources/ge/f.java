package ge;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import me.c2;
import me.y0;
import me.z0;
import nk.k;
import zj.o;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f24700a = new f();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        k.e(context, "context");
        int i4 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = s.f38317a;
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
        ArrayList arrayList3 = new ArrayList(o.T(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            y0 y0Var = new y0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            y0Var.f29354a = str2;
            y0Var.f29355b = runningAppProcessInfo.pid;
            byte b10 = (byte) (y0Var.f29358e | 1);
            y0Var.f29356c = runningAppProcessInfo.importance;
            y0Var.f29358e = (byte) (b10 | 2);
            y0Var.f29357d = k.a(str2, str);
            y0Var.f29358e = (byte) (y0Var.f29358e | 4);
            arrayList3.add(y0Var.a());
        }
        return arrayList3;
    }

    public final c2 b(Context context) {
        Object obj;
        String processName;
        k.e(context, "context");
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
            if (((z0) ((c2) obj)).f29362b == iMyPid) {
                break;
            }
        }
        c2 c2Var = (c2) obj;
        if (c2Var != null) {
            return c2Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            processName = Process.myProcessName();
            k.b(processName);
        } else if (i10 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        k.e(processName, "processName");
        y0 y0Var = new y0();
        y0Var.f29354a = processName;
        y0Var.f29355b = iMyPid;
        byte b10 = (byte) (y0Var.f29358e | 1);
        y0Var.f29356c = 0;
        y0Var.f29357d = false;
        y0Var.f29358e = (byte) (((byte) (b10 | 2)) | 4);
        return y0Var.a();
    }
}
