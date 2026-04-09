package m2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f23387a;

    public h(WorkDatabase workDatabase) {
        this.f23387a = workDatabase;
    }

    public static void b(Context context, u1.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.u();
            try {
                bVar.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                bVar.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                bVar.B();
            } finally {
                bVar.E();
            }
        }
    }

    public boolean a() {
        Long lB = this.f23387a.x().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void c(boolean z10) {
        this.f23387a.x().a(new l2.d("reschedule_needed", z10));
    }
}
