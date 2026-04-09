package v1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import u1.c;

/* loaded from: classes.dex */
public class b implements u1.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24687a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24688b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f24689c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24690d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f24691e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public a f24692f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24693g;

    public static class a extends SQLiteOpenHelper {

        /* renamed from: a, reason: collision with root package name */
        public final v1.a[] f24694a;

        /* renamed from: b, reason: collision with root package name */
        public final c.a f24695b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f24696c;

        /* renamed from: v1.b$a$a, reason: collision with other inner class name */
        public class C0492a implements DatabaseErrorHandler {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.a f24697a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v1.a[] f24698b;

            public C0492a(c.a aVar, v1.a[] aVarArr) {
                this.f24697a = aVar;
                this.f24698b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f24697a.c(a.b(this.f24698b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, v1.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f24487a, new C0492a(aVar, aVarArr));
            this.f24695b = aVar;
            this.f24694a = aVarArr;
        }

        public static v1.a b(v1.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            v1.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new v1.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        public v1.a a(SQLiteDatabase sQLiteDatabase) {
            return b(this.f24694a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f24694a[0] = null;
        }

        public synchronized u1.b d() {
            this.f24696c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f24696c) {
                return a(writableDatabase);
            }
            close();
            return d();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f24695b.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f24695b.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f24696c = true;
            this.f24695b.e(a(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f24696c) {
                return;
            }
            this.f24695b.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f24696c = true;
            this.f24695b.g(a(sQLiteDatabase), i10, i11);
        }
    }

    public b(Context context, String str, c.a aVar, boolean z10) {
        this.f24687a = context;
        this.f24688b = str;
        this.f24689c = aVar;
        this.f24690d = z10;
    }

    @Override // u1.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d().close();
    }

    public final a d() {
        a aVar;
        synchronized (this.f24691e) {
            try {
                if (this.f24692f == null) {
                    v1.a[] aVarArr = new v1.a[1];
                    if (this.f24688b == null || !this.f24690d) {
                        this.f24692f = new a(this.f24687a, this.f24688b, aVarArr, this.f24689c);
                    } else {
                        this.f24692f = new a(this.f24687a, new File(this.f24687a.getNoBackupFilesDir(), this.f24688b).getAbsolutePath(), aVarArr, this.f24689c);
                    }
                    this.f24692f.setWriteAheadLoggingEnabled(this.f24693g);
                }
                aVar = this.f24692f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // u1.c
    public String getDatabaseName() {
        return this.f24688b;
    }

    @Override // u1.c
    public u1.b getWritableDatabase() {
        return d().d();
    }

    @Override // u1.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f24691e) {
            try {
                a aVar = this.f24692f;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z10);
                }
                this.f24693g = z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
