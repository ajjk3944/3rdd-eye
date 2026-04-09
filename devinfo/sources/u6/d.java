package u6;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends x5.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35144c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f35145d;

    public d(Context context, int i4, int i10) {
        super(i4, i10);
        this.f35145d = context;
    }

    @Override // x5.b
    public final void b(e6.a aVar) {
        int i4 = this.f35144c;
        Context context = this.f35145d;
        nk.k.e(aVar, "db");
        switch (i4) {
            case 0:
                if (this.f36976b >= 10) {
                    aVar.s(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                aVar.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j8 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    aVar.f();
                    try {
                        aVar.s(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        aVar.s(new Object[]{"reschedule_needed", Long.valueOf(j8)});
                        sharedPreferences.edit().clear().apply();
                        aVar.t();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    aVar.f();
                    try {
                        aVar.s(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        aVar.s(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        aVar.t();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public d(Context context) {
        super(9, 10);
        this.f35145d = context;
    }
}
