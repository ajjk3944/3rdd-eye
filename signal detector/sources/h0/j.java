package H0;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class j extends i implements G0.c {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f1752b;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f1752b = sQLiteStatement;
    }

    public final long a() {
        return this.f1752b.executeInsert();
    }

    public final int b() {
        return this.f1752b.executeUpdateDelete();
    }
}
