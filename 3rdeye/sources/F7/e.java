package F7;

import H7.b;
import android.database.SQLException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements H7.f {
    @Override // H7.f
    public final void a(b.a aVar) throws SQLException {
        try {
            aVar.f2279b.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e4) {
            throw new SQLException("Create \"raw_json\" table", e4);
        }
    }
}
