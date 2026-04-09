package v1;

import android.database.sqlite.SQLiteStatement;
import u1.f;

/* loaded from: classes.dex */
public class e extends d implements f {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f24700b;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f24700b = sQLiteStatement;
    }

    @Override // u1.f
    public long H() {
        return this.f24700b.executeInsert();
    }

    @Override // u1.f
    public int z() {
        return this.f24700b.executeUpdateDelete();
    }
}
