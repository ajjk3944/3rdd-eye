package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xv implements Runnable {
    public static final String i = h80.f("ForceStopRunnable");
    public static final long j = TimeUnit.DAYS.toMillis(3650);
    public final Context f;
    public final ha1 g;
    public int h = 0;

    public xv(Context context, ha1 ha1Var) {
        this.f = context.getApplicationContext();
        this.g = ha1Var;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = gc.a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
        long jCurrentTimeMillis = System.currentTimeMillis() + j;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        String str = i;
        ha1 ha1Var = this.g;
        try {
            ru0 ru0Var = ha1Var.q;
            ru0Var.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f;
            if (zIsEmpty) {
                h80.d().a(new Throwable[0]);
                zA = true;
            } else {
                zA = nm0.a(context, ru0Var);
                h80.d().a(new Throwable[0]);
            }
            if (!zA) {
                return;
            }
            while (true) {
                ba1.a(context);
                h80.d().a(new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i2 = this.h + 1;
                    this.h = i2;
                    if (i2 >= 3) {
                        h80.d().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        ha1Var.q.getClass();
                        throw illegalStateException;
                    }
                    h80.d().a(e);
                    try {
                        Thread.sleep(this.h * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            ha1Var.l0();
        }
    }
}
