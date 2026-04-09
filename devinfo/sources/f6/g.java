package f6;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import nk.k;
import t5.p;
import t7.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f23674h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23675a;

    /* renamed from: b, reason: collision with root package name */
    public final o7.c f23676b;

    /* renamed from: c, reason: collision with root package name */
    public final m f23677c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23678d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23679e;

    /* renamed from: f, reason: collision with root package name */
    public final g6.a f23680f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final o7.c cVar, final m mVar, boolean z3) {
        String string;
        super(context, str, null, mVar.f34473b, new DatabaseErrorHandler() { // from class: f6.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i4 = g.f23674h;
                k.b(sQLiteDatabase);
                c cVarK = pk.a.k(cVar, sQLiteDatabase);
                mVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + cVarK + ".path");
                SQLiteDatabase sQLiteDatabase2 = cVarK.f23663a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        m.k(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        cVarK.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            k.d(obj, "second");
                            m.k((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            m.k(path2);
                        }
                    }
                }
            }
        });
        k.e(context, "context");
        k.e(mVar, "callback");
        this.f23675a = context;
        this.f23676b = cVar;
        this.f23677c = mVar;
        this.f23678d = z3;
        if (str == null) {
            string = UUID.randomUUID().toString();
            k.d(string, "toString(...)");
        } else {
            string = str;
        }
        this.f23680f = new g6.a(context.getCacheDir(), string, false);
    }

    public final e6.a c(boolean z3) throws IOException {
        g6.a aVar = this.f23680f;
        try {
            aVar.a((this.g || getDatabaseName() == null) ? false : true);
            this.f23679e = false;
            SQLiteDatabase sQLiteDatabaseE = e(z3);
            if (!this.f23679e) {
                c cVarK = pk.a.k(this.f23676b, sQLiteDatabaseE);
                aVar.b();
                return cVarK;
            }
            close();
            e6.a aVarC = c(z3);
            aVar.b();
            return aVarC;
        } catch (Throwable th2) {
            aVar.b();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() throws IOException {
        g6.a aVar = this.f23680f;
        try {
            aVar.a(aVar.f24542a);
            super.close();
            this.f23676b.f30419b = null;
            this.g = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase e(boolean z3) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.g;
        Context context = this.f23675a;
        if (databaseName != null && !z10 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z3) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                k.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            k.b(readableDatabase3);
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z3) {
                    readableDatabase2 = getWritableDatabase();
                    k.b(readableDatabase2);
                } else {
                    readableDatabase2 = getReadableDatabase();
                    k.b(readableDatabase2);
                }
                return readableDatabase2;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof e) {
                    e eVar = (e) th;
                    int iOrdinal = eVar.f23666a.ordinal();
                    th = eVar.f23667b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new ac.m();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f23678d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z3) {
                        readableDatabase = getWritableDatabase();
                        k.b(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        k.b(readableDatabase);
                    }
                    return readableDatabase;
                } catch (e e2) {
                    throw e2.f23667b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        k.e(sQLiteDatabase, "db");
        boolean z3 = this.f23679e;
        m mVar = this.f23677c;
        if (!z3 && mVar.f34473b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            pk.a.k(this.f23676b, sQLiteDatabase);
            mVar.getClass();
        } catch (Throwable th2) {
            throw new e(f.f23668a, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        k.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            ((p) this.f23677c.f34474c).d(new w5.a(pk.a.k(this.f23676b, sQLiteDatabase)));
        } catch (Throwable th2) {
            throw new e(f.f23669b, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
        k.e(sQLiteDatabase, "db");
        this.f23679e = true;
        try {
            this.f23677c.s(pk.a.k(this.f23676b, sQLiteDatabase), i4, i10);
        } catch (Throwable th2) {
            throw new e(f.f23671d, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        k.e(sQLiteDatabase, "db");
        if (!this.f23679e) {
            try {
                m mVar = this.f23677c;
                c cVarK = pk.a.k(this.f23676b, sQLiteDatabase);
                p pVar = (p) mVar.f34474c;
                pVar.f(new w5.a(cVarK));
                pVar.g = cVarK;
            } catch (Throwable th2) {
                throw new e(f.f23672e, th2);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i10) {
        k.e(sQLiteDatabase, "sqLiteDatabase");
        this.f23679e = true;
        try {
            this.f23677c.s(pk.a.k(this.f23676b, sQLiteDatabase), i4, i10);
        } catch (Throwable th2) {
            throw new e(f.f23670c, th2);
        }
    }
}
