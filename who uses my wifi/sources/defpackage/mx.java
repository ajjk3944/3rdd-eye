package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mx implements DatabaseErrorHandler {
    public final /* synthetic */ l92 a;
    public final /* synthetic */ lx[] b;

    public mx(l92 l92Var, lx[] lxVarArr) {
        this.a = l92Var;
        this.b = lxVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        lx lxVarA = nx.a(this.b, sQLiteDatabase);
        this.a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) lxVarA.g).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) lxVarA.g;
        if (!sQLiteDatabase2.isOpen()) {
            l92.f(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase2.getAttachedDbs();
            } finally {
                if (attachedDbs != null) {
                    Iterator<Pair<String, String>> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        l92.f((String) it.next().second);
                    }
                } else {
                    l92.f(sQLiteDatabase2.getPath());
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            lxVarA.close();
        } catch (IOException unused2) {
        }
    }
}
