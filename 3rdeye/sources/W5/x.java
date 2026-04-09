package w5;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.Iterator;

/* compiled from: SessionEvents.kt */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f47477a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final F3.f f47478b;

    static {
        b5.d dVar = new b5.d();
        dVar.a(w.class, C5732g.f47408a);
        dVar.a(C5724D.class, C5733h.f47412a);
        dVar.a(C5735j.class, C5730e.f47399a);
        dVar.a(C5727b.class, C5729d.f47392a);
        dVar.a(C5726a.class, C5728c.f47385a);
        dVar.a(q.class, C5731f.f47403a);
        dVar.f17190d = true;
        f47478b = new F3.f(dVar);
    }

    public static C5727b a(B4.e eVar) {
        Object next;
        String myProcessName;
        eVar.a();
        Context context = eVar.f487a;
        kotlin.jvm.internal.l.e(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        eVar.a();
        String str = eVar.f489c.f504b;
        kotlin.jvm.internal.l.e(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.l.e(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.l.e(RELEASE, "RELEASE");
        p pVar = p.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.l.e(packageName, "packageName");
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.l.e(MANUFACTURER, "MANUFACTURER");
        eVar.a();
        int iMyPid = Process.myPid();
        Iterator it = r.a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((q) next).f47438b == iMyPid) {
                break;
            }
        }
        q qVar = (q) next;
        if (qVar == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                myProcessName = Process.myProcessName();
                kotlin.jvm.internal.l.e(myProcessName, "myProcessName()");
            } else if ((i < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
                myProcessName = "";
            }
            qVar = new q(iMyPid, 0, myProcessName, false);
        }
        eVar.a();
        return new C5727b(str, pVar, new C5726a(packageName, str2, strValueOf, qVar, r.a(context)));
    }
}
