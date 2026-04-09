package G1;

import android.database.sqlite.SQLiteStatement;

/* compiled from: FrameworkSQLiteStatement.android.kt */
/* loaded from: classes.dex */
public final class j extends i implements F1.f {

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteStatement f1890c;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f1890c = sQLiteStatement;
    }

    @Override // F1.f
    public final int G() {
        return this.f1890c.executeUpdateDelete();
    }

    @Override // F1.f
    public final long I0() {
        return this.f1890c.executeInsert();
    }

    @Override // F1.f
    public final void execute() {
        this.f1890c.execute();
    }
}
