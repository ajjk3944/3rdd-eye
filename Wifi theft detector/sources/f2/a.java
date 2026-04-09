package f2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import d2.j;
import l2.g;
import l2.h;
import m2.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21051a = k.f("Alarms");

    public static void a(Context context, j jVar, String str) {
        h hVarY = jVar.o().y();
        g gVarA = hVarY.a(str);
        if (gVarA != null) {
            b(context, str, gVarA.f23070b);
            k.c().a(f21051a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            hVarY.d(str);
        }
    }

    public static void b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        k.c().a(f21051a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, j jVar, String str, long j10) {
        WorkDatabase workDatabaseO = jVar.o();
        h hVarY = workDatabaseO.y();
        g gVarA = hVarY.a(str);
        if (gVarA != null) {
            b(context, str, gVarA.f23070b);
            d(context, str, gVarA.f23070b, j10);
        } else {
            int iB = new f(workDatabaseO).b();
            hVarY.c(new g(str, iB));
            d(context, str, iB, j10);
        }
    }

    public static void d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
