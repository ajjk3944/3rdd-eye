package f1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f20039d = V0.m.h("ForceStopRunnable");

    /* renamed from: e, reason: collision with root package name */
    public static final long f20040e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f20041a;

    /* renamed from: b, reason: collision with root package name */
    public final W0.k f20042b;

    /* renamed from: c, reason: collision with root package name */
    public int f20043c = 0;

    public e(Context context, W0.k kVar) {
        this.f20041a = context.getApplicationContext();
        this.f20042b = kVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = N.a.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f20040e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.a():void");
    }

    public final boolean b() {
        V0.b bVar = this.f20042b.f3991j;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f20039d;
        if (zIsEmpty) {
            V0.m.f().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = h.a(this.f20041a, bVar);
        V0.m.f().a(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f20039d;
        W0.k kVar = this.f20042b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                W0.j.a(this.f20041a);
                V0.m.f().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e6) {
                    int i = this.f20043c + 1;
                    this.f20043c = i;
                    if (i >= 3) {
                        V0.m.f().e(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                        kVar.f3991j.getClass();
                        throw illegalStateException;
                    }
                    long j6 = i * 300;
                    V0.m.f().a(str, "Retrying after " + j6, e6);
                    try {
                        Thread.sleep(this.f20043c * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            kVar.I();
        }
    }
}
