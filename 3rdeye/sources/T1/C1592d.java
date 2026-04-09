package T1;

import android.database.SQLException;

/* compiled from: WorkDatabaseMigrations.kt */
/* renamed from: T1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1592d extends A1.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C1592d f12167d = new C1592d(11, 12, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final C1592d f12168e = new C1592d(4, 5, 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1592d(int i, int i10, int i11) {
        super(i, i10);
        this.f12169c = i11;
    }

    @Override // A1.a
    public final void a(F1.b db) throws SQLException {
        switch (this.f12169c) {
            case 0:
                kotlin.jvm.internal.l.f(db, "db");
                db.C("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                kotlin.jvm.internal.l.f(db, "db");
                db.C("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                db.C("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            default:
                db.C("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                break;
        }
    }
}
