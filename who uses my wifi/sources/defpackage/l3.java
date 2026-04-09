package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class l3 {
    public static final /* synthetic */ int a = 0;

    static {
        h80.f("Alarms");
    }

    public static void a(int i, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, kg.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        h80.d().a(new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, ha1 ha1Var, String str, long j) {
        int iIntValue;
        WorkDatabase workDatabase = ha1Var.r;
        t83 t83VarK = workDatabase.k();
        sz0 sz0VarF = t83VarK.F(str);
        if (sz0VarF != null) {
            a(sz0VarF.b, context, str);
            int i = sz0VarF.b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, kg.b(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (f20.class) {
            workDatabase.c();
            try {
                Long lY = workDatabase.j().y("next_alarm_manager_id");
                iIntValue = lY != null ? lY.intValue() : 0;
                workDatabase.j().A(new xl0("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        t83VarK.J(new sz0(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, kg.b(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
