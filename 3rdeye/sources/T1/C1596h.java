package T1;

import android.database.SQLException;

/* compiled from: WorkDatabaseMigrations.kt */
/* renamed from: T1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596h extends A1.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C1596h f12179d = new C1596h(1, 2, 0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1596h(int i, int i10, int i11) {
        super(i, i10);
        this.f12180c = i11;
    }

    @Override // A1.a
    public final void a(F1.b db) throws SQLException {
        switch (this.f12180c) {
            case 0:
                kotlin.jvm.internal.l.f(db, "db");
                db.C("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                db.C("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                db.C("DROP TABLE IF EXISTS alarmInfo");
                db.C("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                break;
            default:
                db.C("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                db.C("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                break;
        }
    }
}
