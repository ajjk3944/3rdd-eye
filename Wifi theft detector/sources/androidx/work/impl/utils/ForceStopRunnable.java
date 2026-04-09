package androidx.work.impl.utils;

import android.app.ActivityManager;
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
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BuildCompat;
import androidx.work.WorkInfo$State;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import d2.f;
import d2.h;
import d2.j;
import g2.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l2.n;
import l2.p;
import l2.q;
import m2.d;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4478d = k.f("ForceStopRunnable");

    /* renamed from: e, reason: collision with root package name */
    public static final long f4479e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4480a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4481b;

    /* renamed from: c, reason: collision with root package name */
    public int f4482c = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f4483a = k.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            k.c().g(f4483a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, j jVar) {
        this.f4480a = context.getApplicationContext();
        this.f4481b = jVar;
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntentD = d(context, BuildCompat.b() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f4479e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = l.i(this.f4480a, this.f4481b);
        WorkDatabase workDatabaseO = this.f4481b.o();
        q qVarB = workDatabaseO.B();
        n nVarA = workDatabaseO.A();
        workDatabaseO.c();
        try {
            List<p> listQ = qVarB.q();
            boolean z10 = (listQ == null || listQ.isEmpty()) ? false : true;
            if (z10) {
                for (p pVar : listQ) {
                    qVarB.b(WorkInfo$State.ENQUEUED, pVar.f23092a);
                    qVarB.l(pVar.f23092a, -1L);
                }
            }
            nVarA.b();
            workDatabaseO.r();
            workDatabaseO.g();
            return z10 || zI;
        } catch (Throwable th) {
            workDatabaseO.g();
            throw th;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            k.c().a(f4478d, "Rescheduling Workers.", new Throwable[0]);
            this.f4481b.s();
            this.f4481b.l().c(false);
        } else if (e()) {
            k.c().a(f4478d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f4481b.s();
        } else if (zA) {
            k.c().a(f4478d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f4481b.i(), this.f4481b.o(), this.f4481b.n());
        }
    }

    public boolean e() {
        try {
            PendingIntent pendingIntentD = d(this.f4480a, BuildCompat.b() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f4480a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                        if (d.a(historicalProcessExitReasons.get(i10)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f4480a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            k.c().h(f4478d, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            k.c().h(f4478d, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a aVarI = this.f4481b.i();
        if (TextUtils.isEmpty(aVarI.c())) {
            k.c().a(f4478d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zB = m2.j.b(this.f4480a, aVarI);
        k.c().a(f4478d, String.format("Is default app process = %s", Boolean.valueOf(zB)), new Throwable[0]);
        return zB;
    }

    public boolean h() {
        return this.f4481b.l().a();
    }

    public void i(long j10) throws InterruptedException {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    h.e(this.f4480a);
                    k.c().a(f4478d, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                        i10 = this.f4482c + 1;
                        this.f4482c = i10;
                        if (i10 >= 3) {
                            k.c().b(f4478d, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            this.f4481b.i().d();
                            throw illegalStateException;
                        }
                        k.c().a(f4478d, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                        i(this.f4482c * 300);
                    }
                    k.c().a(f4478d, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                    i(this.f4482c * 300);
                }
            }
        } finally {
            this.f4481b.r();
        }
    }
}
