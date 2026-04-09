package T1;

import android.database.SQLException;

/* compiled from: WorkDatabaseMigrations.kt */
/* renamed from: T1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1597i extends A1.a {

    /* renamed from: c, reason: collision with root package name */
    public static final C1597i f12181c = new C1597i(3, 4);

    @Override // A1.a
    public final void a(F1.b db) throws SQLException {
        kotlin.jvm.internal.l.f(db, "db");
        db.C("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
