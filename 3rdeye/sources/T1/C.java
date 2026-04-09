package T1;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class C extends A1.a {

    /* renamed from: c, reason: collision with root package name */
    public final Context f12119c;

    public C(Context context) {
        super(9, 10);
        this.f12119c = context;
    }

    @Override // A1.a
    public final void a(F1.b db) throws SQLException {
        kotlin.jvm.internal.l.f(db, "db");
        db.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.f12119c;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j4 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            db.r();
            try {
                db.U(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j4)});
                db.U(new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                db.u();
            } finally {
            }
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i10 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            db.r();
            try {
                db.U(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                db.U(new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                sharedPreferences2.edit().clear().apply();
                db.u();
            } finally {
            }
        }
    }
}
