package T1;

import android.content.Context;
import android.database.SQLException;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class m extends A1.a {

    /* renamed from: c, reason: collision with root package name */
    public final Context f12199c;

    public m(Context context, int i, int i10) {
        super(i, i10);
        this.f12199c = context;
    }

    @Override // A1.a
    public final void a(F1.b db) throws SQLException {
        kotlin.jvm.internal.l.f(db, "db");
        if (this.f6b >= 10) {
            db.U(new Object[]{"reschedule_needed", 1});
        } else {
            this.f12199c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
