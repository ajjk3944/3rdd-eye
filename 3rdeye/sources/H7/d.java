package H7;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* compiled from: DatabaseOpenHelper.kt */
/* loaded from: classes.dex */
public interface d extends Closeable {
    Cursor V(String str, String[] strArr);

    void r();

    SQLiteStatement t(String str);

    void u();

    void v();
}
