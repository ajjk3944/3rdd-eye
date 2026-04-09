package ef;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import br.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lf.c2;
import lf.y0;
import lf.z0;
import mq.o;
import mq.p;
import mq.w;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f8190a = new d();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        l.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = w.f16945a;
        }
        ArrayList arrayListP0 = o.p0(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListP0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            y0 y0Var = new y0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            y0Var.f15475a = str2;
            y0Var.f15476b = runningAppProcessInfo.pid;
            byte b2 = (byte) (y0Var.f15479e | 1);
            y0Var.f15477c = runningAppProcessInfo.importance;
            y0Var.f15479e = (byte) (b2 | 2);
            y0Var.f15478d = l.a(str2, str);
            y0Var.f15479e = (byte) (y0Var.f15479e | 4);
            arrayList2.add(y0Var.a());
        }
        return arrayList2;
    }

    public c2 b(Context context) {
        Object next;
        String processName;
        l.e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((z0) ((c2) next)).f15483b == iMyPid) {
                break;
            }
        }
        c2 c2Var = (c2) next;
        if (c2Var != null) {
            return c2Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            processName = Process.myProcessName();
            l.b(processName);
        } else if (i10 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        int i11 = (12 & 4) != 0 ? 0 : 0;
        l.e(processName, "processName");
        y0 y0Var = new y0();
        y0Var.f15475a = processName;
        y0Var.f15476b = iMyPid;
        byte b2 = (byte) (y0Var.f15479e | 1);
        y0Var.f15477c = i11;
        y0Var.f15478d = false;
        y0Var.f15479e = (byte) (((byte) (b2 | 2)) | 4);
        return y0Var.a();
    }
}
