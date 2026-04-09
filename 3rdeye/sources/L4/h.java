package L4;

import Q4.T;
import Q4.f0;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: ProcessDetailsProvider.kt */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f4062a = new h();

    public static T a(h hVar, String str, int i, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        hVar.getClass();
        T.a aVar = new T.a();
        aVar.f11107a = str;
        aVar.f11108b = i;
        byte b10 = (byte) (aVar.f11111e | 1);
        aVar.f11109c = i10;
        aVar.f11110d = false;
        aVar.f11111e = (byte) (((byte) (b10 | 2)) | 4);
        return aVar.a();
    }

    public static ArrayList b(Context context) {
        l.f(context, "context");
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
            T.a aVar = new T.a();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            aVar.f11107a = str2;
            aVar.f11108b = runningAppProcessInfo.pid;
            byte b10 = (byte) (aVar.f11111e | 1);
            aVar.f11109c = runningAppProcessInfo.importance;
            aVar.f11111e = (byte) (b10 | 2);
            aVar.f11110d = l.b(str2, str);
            aVar.f11111e = (byte) (aVar.f11111e | 4);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public final f0.e.d.a.c c(Context context) {
        Object next;
        String processName;
        l.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = b(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((f0.e.d.a.c) next).b() == iMyPid) {
                break;
            }
        }
        f0.e.d.a.c cVar = (f0.e.d.a.c) next;
        if (cVar != null) {
            return cVar;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            processName = Process.myProcessName();
            l.e(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return a(this, processName, iMyPid, 0, 12);
    }
}
