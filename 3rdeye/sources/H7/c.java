package H7;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: StorageStatementExecutor.kt */
/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final d f2288b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2289c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2290d;

    public c(d db) {
        kotlin.jvm.internal.l.f(db, "db");
        this.f2288b = db;
        this.f2289c = new ArrayList();
        this.f2290d = new ArrayList();
    }

    public final h a(String str, String... strArr) {
        return new h(g.f2292g, new F3.k(this, str, strArr));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f2289c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B7.d.i((SQLiteStatement) it.next());
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2290d;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Cursor cursor = (Cursor) it2.next();
            if (!cursor.isClosed()) {
                B7.d.i(cursor);
            }
        }
        arrayList2.clear();
    }

    public final SQLiteStatement t(String sql) {
        kotlin.jvm.internal.l.f(sql, "sql");
        SQLiteStatement sQLiteStatementT = this.f2288b.t(sql);
        this.f2289c.add(sQLiteStatementT);
        return sQLiteStatementT;
    }
}
