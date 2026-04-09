package I8;

import B4.f;
import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.zipoapps.premiumhelper.e;
import kotlin.jvm.internal.l;
import l8.d;
import r7.s;
import t4.C5603a;
import t4.InterfaceC5604b;
import va.a;

/* compiled from: UpdateManager.kt */
/* loaded from: classes3.dex */
public final class b {
    public static void a(Activity activity) {
        l.f(activity, "activity");
        e.f37006D.getClass();
        e eVarA = e.a.a();
        e eVarA2 = e.a.a();
        d<Boolean> PH_IN_APP_UPDATES_ENABLED = i8.d.f38524D;
        l.e(PH_IN_APP_UPDATES_ENABLED, "PH_IN_APP_UPDATES_ENABLED");
        if (!((Boolean) eVarA2.f37020j.h(PH_IN_APP_UPDATES_ENABLED)).booleanValue()) {
            a.b bVar = va.a.f47104a;
            bVar.o("PremiumHelper");
            bVar.a("UpdateManager: updates disabled", new Object[0]);
            return;
        }
        d<Integer> PH_MAX_UPDATE_REQUESTS = i8.d.f38526F;
        l.e(PH_MAX_UPDATE_REQUESTS, "PH_MAX_UPDATE_REQUESTS");
        Integer num = (Integer) eVarA.f37020j.h(PH_MAX_UPDATE_REQUESTS);
        if (num.intValue() <= 0) {
            a.b bVar2 = va.a.f47104a;
            bVar2.o("PremiumHelper");
            bVar2.a("UpdateManager: updates disabled by maxUpdateAttempts", new Object[0]);
        } else {
            InterfaceC5604b interfaceC5604bC = s.c(activity);
            l.e(interfaceC5604bC, "create(...)");
            Task<C5603a> taskA = interfaceC5604bC.a();
            l.e(taskA, "getAppUpdateInfo(...)");
            taskA.addOnSuccessListener(new B.d(new a(eVarA, num, interfaceC5604bC, activity), 7));
            taskA.addOnFailureListener(new f(3));
        }
    }
}
