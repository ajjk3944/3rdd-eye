package V1;

import H6.I;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.m;
import b2.C1828i;
import b2.C1834o;
import b2.InterfaceC1829j;
import c2.CallableC2060j;
import kotlin.jvm.internal.l;

/* compiled from: Alarms.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12870a = m.g("Alarms");

    /* compiled from: Alarms.java */
    /* renamed from: V1.a$a, reason: collision with other inner class name */
    public static class C0181a {
        public static void a(AlarmManager alarmManager, int i, long j4, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j4, pendingIntent);
        }
    }

    public static void a(Context context, C1834o c1834o, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = b.f12871g;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        b.e(intent, c1834o);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        m.e().a(f12870a, "Cancelling existing alarm with (workSpecId, systemId) (" + c1834o + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, C1834o c1834o, long j4) {
        InterfaceC1829j interfaceC1829jV = workDatabase.v();
        C1828i c1828iB = interfaceC1829jV.b(c1834o);
        int i = 0;
        if (c1828iB != null) {
            int i10 = c1828iB.f17121c;
            a(context, c1834o, i10);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = b.f12871g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            b.e(intent, c1834o);
            PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
            if (alarmManager != null) {
                C0181a.a(alarmManager, 0, j4, service);
                return;
            }
            return;
        }
        Object objQ = workDatabase.q(new H8.e(new CallableC2060j(new I(workDatabase), i), 7));
        l.e(objQ, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objQ).intValue();
        interfaceC1829jV.d(new C1828i(c1834o.f17128a, c1834o.f17129b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = b.f12871g;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        b.e(intent2, c1834o);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            C0181a.a(alarmManager2, 0, j4, service2);
        }
    }
}
