package Y0;

import V0.m;
import W0.k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import e1.C2299b;
import e1.C2300c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4218a = m.h("Alarms");

    public static void a(Context context, int i, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        m.f().a(f4218a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, k kVar, String str, long j6) {
        int iIntValue;
        WorkDatabase workDatabase = kVar.f3992k;
        V2.e eVarQ = workDatabase.q();
        C2300c c2300cP = eVarQ.p(str);
        if (c2300cP != null) {
            a(context, c2300cP.f19901b, str);
            int i = c2300cP.f19901b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j6, service);
                return;
            }
            return;
        }
        synchronized (f1.f.class) {
            workDatabase.c();
            try {
                Long lN = workDatabase.p().n("next_alarm_manager_id");
                iIntValue = lN != null ? lN.intValue() : 0;
                workDatabase.p().r(new C2299b("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.m();
                workDatabase.j();
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
        eVarQ.t(new C2300c(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j6, service2);
        }
    }
}
