package c7;

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
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f2772e = v.g("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f2773f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f2774a;

    /* renamed from: b, reason: collision with root package name */
    public final u6.r f2775b;

    /* renamed from: c, reason: collision with root package name */
    public final o7.d f2776c;

    /* renamed from: d, reason: collision with root package name */
    public int f2777d = 0;

    public d(Context context, u6.r rVar) {
        this.f2774a = context.getApplicationContext();
        this.f2775b = rVar;
        this.f2776c = rVar.j;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i4 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i4);
        long jCurrentTimeMillis = System.currentTimeMillis() + f2773f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.d.a():void");
    }

    public final boolean b() {
        t6.b bVar = this.f2775b.f35176e;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f2772e;
        if (zIsEmpty) {
            v.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = k.a(this.f2774a, bVar);
        v.e().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f2774a;
        String str = f2772e;
        u6.r rVar = this.f2775b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    com.bumptech.glide.e.H(context);
                    v.e().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i4 = this.f2777d + 1;
                        this.f2777d = i4;
                        if (i4 >= 3) {
                            String str2 = com.bumptech.glide.f.n(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            v.e().d(str, str2, e2);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e2);
                            rVar.f35176e.getClass();
                            throw illegalStateException;
                        }
                        v.e().b(str, "Retrying after " + (i4 * 300), e2);
                        try {
                            Thread.sleep(this.f2777d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e10) {
                    v.e().c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                    rVar.f35176e.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            rVar.F();
        }
    }
}
