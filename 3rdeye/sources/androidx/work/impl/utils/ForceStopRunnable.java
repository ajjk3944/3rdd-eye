package androidx.work.impl.utils;

import G0.t;
import T1.v;
import T1.z;
import android.annotation.SuppressLint;
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
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.b;
import androidx.work.m;
import b0.C1810a;
import c2.p;
import c2.q;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final String f16932f = m.g("ForceStopRunnable");

    /* renamed from: g, reason: collision with root package name */
    public static final long f16933g = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b, reason: collision with root package name */
    public final Context f16934b;

    /* renamed from: c, reason: collision with root package name */
    public final z f16935c;

    /* renamed from: d, reason: collision with root package name */
    public final p f16936d;

    /* renamed from: e, reason: collision with root package name */
    public int f16937e = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16938a = m.g("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((m.a) m.e()).f16950c <= 2) {
                Log.v(f16938a, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, z zVar) {
        this.f16934b = context.getApplicationContext();
        this.f16935c = zVar;
        this.f16936d = zVar.f12236g;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f16933g;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean b() {
        b bVar = this.f16935c.f12231b;
        boolean zIsEmpty = TextUtils.isEmpty(bVar.i);
        String str = f16932f;
        if (zIsEmpty) {
            m.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = q.a(this.f16934b, bVar);
        m.e().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f16934b;
        String str = f16932f;
        z zVar = this.f16935c;
        try {
            if (b()) {
                while (true) {
                    try {
                        v.a(context);
                        m.e().a(str, "Performing cleanup operations.");
                        try {
                            a();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e4) {
                            int i = this.f16937e + 1;
                            this.f16937e = i;
                            if (i >= 3) {
                                String str2 = t.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                m.e().d(str, str2, e4);
                                IllegalStateException illegalStateException = new IllegalStateException(str2, e4);
                                C1810a c1810a = zVar.f12231b.f16871g;
                                if (c1810a == null) {
                                    throw illegalStateException;
                                }
                                m.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                                c1810a.accept(illegalStateException);
                            } else {
                                m.e().b(str, "Retrying after " + (i * 300), e4);
                                try {
                                    Thread.sleep(this.f16937e * 300);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    } catch (SQLiteException e10) {
                        m.e().c(str, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                        C1810a c1810a2 = zVar.f12231b.f16871g;
                        if (c1810a2 == null) {
                            throw illegalStateException2;
                        }
                        c1810a2.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            zVar.e();
        }
    }
}
