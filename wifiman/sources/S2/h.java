package s2;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class h extends g implements SupportSQLiteStatement {

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f61171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        AbstractC6492s.i(delegate, "delegate");
        this.f61171b = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        return this.f61171b.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        return this.f61171b.executeUpdateDelete();
    }
}
