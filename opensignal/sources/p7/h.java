package p7;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import bc.f0;
import br.l;
import io.sentry.android.core.e0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h extends SQLiteOpenHelper {
    public static final /* synthetic */ int B = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20323a;

    /* renamed from: d, reason: collision with root package name */
    public final c f20324d;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f20325g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20326r;

    /* renamed from: x, reason: collision with root package name */
    public final q7.a f20327x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20328y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String str, final c cVar, final f0 f0Var) {
        String string;
        super(context, str, null, f0Var.f2602d, new DatabaseErrorHandler() { // from class: p7.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                l.e(f0Var, "$callback");
                int i10 = h.B;
                l.d(sQLiteDatabase, "dbObj");
                b bVarV = i3.g.v(cVar, sQLiteDatabase);
                e0.d("SupportSQLite", "Corruption reported by sqlite on database: " + bVarV + ".path");
                SQLiteDatabase sQLiteDatabase2 = bVarV.f20316a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        f0.e(path);
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
                                l.d(obj, "p.second");
                                f0.e((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                f0.e(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    bVarV.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        l.e(f0Var, "callback");
        this.f20323a = context;
        this.f20324d = cVar;
        this.f20325g = f0Var;
        if (str == null) {
            string = UUID.randomUUID().toString();
            l.d(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        this.f20327x = new q7.a(string, context.getCacheDir(), false);
    }

    public final o7.a b(boolean z10) throws IOException {
        q7.a aVar = this.f20327x;
        try {
            aVar.a((this.f20328y || getDatabaseName() == null) ? false : true);
            this.f20326r = false;
            SQLiteDatabase sQLiteDatabaseH = h(z10);
            if (!this.f20326r) {
                b bVarV = i3.g.v(this.f20324d, sQLiteDatabaseH);
                aVar.b();
                return bVarV;
            }
            close();
            o7.a aVarB = b(z10);
            aVar.b();
            return aVarB;
        } catch (Throwable th2) {
            aVar.b();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        q7.a aVar = this.f20327x;
        try {
            aVar.a(aVar.f20721a);
            super.close();
            this.f20324d.f20317a = null;
            this.f20328y = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase f(boolean z10) {
        if (z10) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            l.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        l.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase h(boolean z10) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.f20328y;
        Context context = this.f20323a;
        if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                e0.p("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return f(z10);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return f(z10);
            } catch (Throwable th2) {
                super.close();
                if (!(th2 instanceof e)) {
                    if (th2 instanceof SQLiteException) {
                        throw th2;
                    }
                    throw th2;
                }
                e eVar = th2;
                int i10 = g.f20322a[eVar.f20320a.ordinal()];
                Throwable th3 = eVar.f20321d;
                if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(th3 instanceof SQLiteException)) {
                    throw th3;
                }
                context.deleteDatabase(databaseName);
                try {
                    return f(z10);
                } catch (e e4) {
                    throw e4.f20321d;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "db");
        boolean z10 = this.f20326r;
        f0 f0Var = this.f20325g;
        if (!z10 && f0Var.f2602d != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            i3.g.v(this.f20324d, sQLiteDatabase);
            f0Var.getClass();
        } catch (Throwable th2) {
            throw new e(f.ON_CONFIGURE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f20325g.n(i3.g.v(this.f20324d, sQLiteDatabase));
        } catch (Throwable th2) {
            throw new e(f.ON_CREATE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l.e(sQLiteDatabase, "db");
        this.f20326r = true;
        try {
            this.f20325g.p(i3.g.v(this.f20324d, sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new e(f.ON_DOWNGRADE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "db");
        if (!this.f20326r) {
            try {
                this.f20325g.o(i3.g.v(this.f20324d, sQLiteDatabase));
            } catch (Throwable th2) {
                throw new e(f.ON_OPEN, th2);
            }
        }
        this.f20328y = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l.e(sQLiteDatabase, "sqLiteDatabase");
        this.f20326r = true;
        try {
            this.f20325g.p(i3.g.v(this.f20324d, sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new e(f.ON_UPGRADE, th2);
        }
    }
}
