package p7;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class k extends j implements o7.e {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteStatement f20335d;

    public k(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f20335d = sQLiteStatement;
    }

    @Override // o7.e
    public final long j0() {
        return this.f20335d.executeInsert();
    }

    @Override // o7.e
    public final int n() {
        return this.f20335d.executeUpdateDelete();
    }
}
