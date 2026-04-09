package F1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import java.io.Closeable;

/* compiled from: SupportSQLiteDatabase.android.kt */
/* loaded from: classes.dex */
public interface b extends Closeable {
    void C(String str) throws SQLException;

    Cursor E(e eVar);

    int G0(ContentValues contentValues, Object[] objArr);

    void J();

    void U(Object[] objArr) throws SQLException;

    void Y();

    boolean isOpen();

    void r();

    boolean s0();

    f t(String str);

    void u();

    void v();

    boolean z0();
}
