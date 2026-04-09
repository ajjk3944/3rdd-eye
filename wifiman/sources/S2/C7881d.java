package s2;

import Yg.m;
import Yg.n;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import r2.C7559b;
import r2.C7561d;
import s2.C7881d;
import t2.C8025a;

/* renamed from: s2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7881d implements SupportSQLiteOpenHelper {

    /* renamed from: h, reason: collision with root package name */
    public static final a f61147h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f61148a;

    /* renamed from: b, reason: collision with root package name */
    private final String f61149b;

    /* renamed from: c, reason: collision with root package name */
    private final SupportSQLiteOpenHelper.a f61150c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f61151d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f61152e;

    /* renamed from: f, reason: collision with root package name */
    private final m f61153f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f61154g;

    /* renamed from: s2.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2.d$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C7880c f61155a;

        public b(C7880c c7880c) {
            this.f61155a = c7880c;
        }

        public final C7880c a() {
            return this.f61155a;
        }

        public final void b(C7880c c7880c) {
            this.f61155a = c7880c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2.d$c */
    static final class c extends SQLiteOpenHelper {

        /* renamed from: h, reason: collision with root package name */
        public static final C2132c f61156h = new C2132c(null);

        /* renamed from: a, reason: collision with root package name */
        private final Context f61157a;

        /* renamed from: b, reason: collision with root package name */
        private final b f61158b;

        /* renamed from: c, reason: collision with root package name */
        private final SupportSQLiteOpenHelper.a f61159c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f61160d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f61161e;

        /* renamed from: f, reason: collision with root package name */
        private final C8025a f61162f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f61163g;

        /* renamed from: s2.d$c$a */
        private static final class a extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            private final b f61164a;

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f61165b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                AbstractC6492s.i(callbackName, "callbackName");
                AbstractC6492s.i(cause, "cause");
                this.f61164a = callbackName;
                this.f61165b = cause;
            }

            public final b a() {
                return this.f61164a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f61165b;
            }
        }

        /* renamed from: s2.d$c$b */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: s2.d$c$c, reason: collision with other inner class name */
        public static final class C2132c {
            public /* synthetic */ C2132c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C7880c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                AbstractC6492s.i(refHolder, "refHolder");
                AbstractC6492s.i(sqLiteDatabase, "sqLiteDatabase");
                C7880c c7880cA = refHolder.a();
                if (c7880cA != null && c7880cA.h(sqLiteDatabase)) {
                    return c7880cA;
                }
                C7880c c7880c = new C7880c(sqLiteDatabase);
                refHolder.b(c7880c);
                return c7880c;
            }

            private C2132c() {
            }
        }

        /* renamed from: s2.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C2133d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f61166a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f61166a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final SupportSQLiteOpenHelper.a callback, boolean z10) {
            super(context, str, null, callback.f32357a, new DatabaseErrorHandler() { // from class: s2.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C7881d.c.g(callback, dbRef, sQLiteDatabase);
                }
            });
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(dbRef, "dbRef");
            AbstractC6492s.i(callback, "callback");
            this.f61157a = context;
            this.f61158b = dbRef;
            this.f61159c = callback;
            this.f61160d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                AbstractC6492s.h(str, "randomUUID().toString()");
            }
            this.f61162f = new C8025a(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(SupportSQLiteOpenHelper.a callback, b dbRef, SQLiteDatabase dbObj) {
            AbstractC6492s.i(callback, "$callback");
            AbstractC6492s.i(dbRef, "$dbRef");
            C2132c c2132c = f61156h;
            AbstractC6492s.h(dbObj, "dbObj");
            callback.c(c2132c.a(dbRef, dbObj));
        }

        private final SQLiteDatabase p(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                AbstractC6492s.h(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            AbstractC6492s.h(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase s(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f61163g;
            if (databaseName != null && !z11 && (parentFile = this.f61157a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return p(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return p(z10);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        Throwable cause = aVar.getCause();
                        int i10 = C2133d.f61166a[aVar.a().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f61160d) {
                        throw th2;
                    }
                    this.f61157a.deleteDatabase(databaseName);
                    try {
                        return p(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                C8025a.c(this.f61162f, false, 1, null);
                super.close();
                this.f61158b.b(null);
                this.f61163g = false;
            } finally {
                this.f61162f.d();
            }
        }

        public final SupportSQLiteDatabase h(boolean z10) throws IOException {
            try {
                this.f61162f.b((this.f61163g || getDatabaseName() == null) ? false : true);
                this.f61161e = false;
                SQLiteDatabase sQLiteDatabaseS = s(z10);
                if (!this.f61161e) {
                    C7880c c7880cJ = j(sQLiteDatabaseS);
                    this.f61162f.d();
                    return c7880cJ;
                }
                close();
                SupportSQLiteDatabase supportSQLiteDatabaseH = h(z10);
                this.f61162f.d();
                return supportSQLiteDatabaseH;
            } catch (Throwable th2) {
                this.f61162f.d();
                throw th2;
            }
        }

        public final C7880c j(SQLiteDatabase sqLiteDatabase) {
            AbstractC6492s.i(sqLiteDatabase, "sqLiteDatabase");
            return f61156h.a(this.f61158b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            if (!this.f61161e && this.f61159c.f32357a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.f61159c.b(j(db2));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            AbstractC6492s.i(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f61159c.d(j(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            AbstractC6492s.i(db2, "db");
            this.f61161e = true;
            try {
                this.f61159c.e(j(db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            if (!this.f61161e) {
                try {
                    this.f61159c.f(j(db2));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f61163g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            AbstractC6492s.i(sqLiteDatabase, "sqLiteDatabase");
            this.f61161e = true;
            try {
                this.f61159c.g(j(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    /* renamed from: s2.d$d, reason: collision with other inner class name */
    static final class C2134d extends AbstractC6494u implements InterfaceC6824a {
        C2134d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (C7881d.this.f61149b == null || !C7881d.this.f61151d) {
                cVar = new c(C7881d.this.f61148a, C7881d.this.f61149b, new b(null), C7881d.this.f61150c, C7881d.this.f61152e);
            } else {
                cVar = new c(C7881d.this.f61148a, new File(C7561d.a(C7881d.this.f61148a), C7881d.this.f61149b).getAbsolutePath(), new b(null), C7881d.this.f61150c, C7881d.this.f61152e);
            }
            C7559b.d(cVar, C7881d.this.f61154g);
            return cVar;
        }
    }

    public C7881d(Context context, String str, SupportSQLiteOpenHelper.a callback, boolean z10, boolean z11) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(callback, "callback");
        this.f61148a = context;
        this.f61149b = str;
        this.f61150c = callback;
        this.f61151d = z10;
        this.f61152e = z11;
        this.f61153f = n.b(new C2134d());
    }

    private final c v() {
        return (c) this.f61153f.getValue();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f61153f.m()) {
            v().close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.f61149b;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return v().h(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f61153f.m()) {
            C7559b.d(v(), z10);
        }
        this.f61154g = z10;
    }
}
