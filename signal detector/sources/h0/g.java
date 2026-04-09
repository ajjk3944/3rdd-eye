package H0;

import C0.s;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import d5.y;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1738g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1739a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1740b;

    /* renamed from: c, reason: collision with root package name */
    public final s f1741c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1742d;

    /* renamed from: e, reason: collision with root package name */
    public final I0.a f1743e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1744f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final d dVar, final s sVar) {
        String string;
        super(context, str, null, sVar.f1100a, new DatabaseErrorHandler() { // from class: H0.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                q5.i.e(sVar, "$callback");
                int i = g.f1738g;
                q5.i.d(sQLiteDatabase, "dbObj");
                c cVarL = y.l(dVar, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + cVarL + ".path");
                SQLiteDatabase sQLiteDatabase2 = cVarL.f1732a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        s.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                q5.i.d(obj, "p.second");
                                s.a((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                s.a(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    cVarL.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        q5.i.e(context, "context");
        q5.i.e(sVar, "callback");
        this.f1739a = context;
        this.f1740b = dVar;
        this.f1741c = sVar;
        if (str == null) {
            string = UUID.randomUUID().toString();
            q5.i.d(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        this.f1743e = new I0.a(context.getCacheDir(), string, false);
    }

    public final c a(boolean z6) throws IOException {
        I0.a aVar = this.f1743e;
        try {
            aVar.a((this.f1744f || getDatabaseName() == null) ? false : true);
            this.f1742d = false;
            SQLiteDatabase sQLiteDatabaseD = d(z6);
            if (!this.f1742d) {
                c cVarL = y.l(this.f1740b, sQLiteDatabaseD);
                aVar.b();
                return cVarL;
            }
            close();
            c cVarA = a(z6);
            aVar.b();
            return cVarA;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase b(boolean z6) {
        if (z6) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            q5.i.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        q5.i.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        I0.a aVar = this.f1743e;
        try {
            aVar.a(aVar.f1884a);
            super.close();
            this.f1740b.f1733a = null;
            this.f1744f = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z6) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z7 = this.f1744f;
        Context context = this.f1739a;
        if (databaseName != null && !z7 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return b(z6);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return b(z6);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof f)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                f fVar = th;
                int iC = AbstractC2984e.c(fVar.f1736a);
                Throwable th2 = fVar.f1737b;
                if (iC == 0 || iC == 1 || iC == 2 || iC == 3 || !(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return b(z6);
                } catch (f e6) {
                    throw e6.f1737b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        q5.i.e(sQLiteDatabase, "db");
        boolean z6 = this.f1742d;
        s sVar = this.f1741c;
        if (!z6 && sVar.f1100a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            y.l(this.f1740b, sQLiteDatabase);
            sVar.getClass();
        } catch (Throwable th) {
            throw new f(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        q5.i.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f1741c.c(y.l(this.f1740b, sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i3) {
        q5.i.e(sQLiteDatabase, "db");
        this.f1742d = true;
        try {
            this.f1741c.e(y.l(this.f1740b, sQLiteDatabase), i, i3);
        } catch (Throwable th) {
            throw new f(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        q5.i.e(sQLiteDatabase, "db");
        if (!this.f1742d) {
            try {
                this.f1741c.d(y.l(this.f1740b, sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(5, th);
            }
        }
        this.f1744f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i3) {
        q5.i.e(sQLiteDatabase, "sqLiteDatabase");
        this.f1742d = true;
        try {
            this.f1741c.e(y.l(this.f1740b, sQLiteDatabase), i, i3);
        } catch (Throwable th) {
            throw new f(3, th);
        }
    }
}
