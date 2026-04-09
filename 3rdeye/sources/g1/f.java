package G1;

import F1.c;
import G1.f;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import b9.C2001h;
import b9.p;
import b9.x;
import i9.InterfaceC4463a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.l;

/* compiled from: FrameworkSQLiteOpenHelper.android.kt */
/* loaded from: classes.dex */
public final class f implements F1.c {

    /* renamed from: b, reason: collision with root package name */
    public final Context f1869b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1870c;

    /* renamed from: d, reason: collision with root package name */
    public final c.a f1871d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1872e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1873f;

    /* renamed from: g, reason: collision with root package name */
    public final p f1874g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1875h;

    /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public d f1876a = null;
    }

    /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
    public static final class b extends SQLiteOpenHelper {
        public static final /* synthetic */ int i = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Context f1877b;

        /* renamed from: c, reason: collision with root package name */
        public final a f1878c;

        /* renamed from: d, reason: collision with root package name */
        public final c.a f1879d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f1880e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f1881f;

        /* renamed from: g, reason: collision with root package name */
        public final H1.a f1882g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f1883h;

        /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
        public static final class a extends RuntimeException {

            /* renamed from: b, reason: collision with root package name */
            public final EnumC0034b f1884b;

            /* renamed from: c, reason: collision with root package name */
            public final Throwable f1885c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnumC0034b callbackName, Throwable th) {
                super(th);
                l.f(callbackName, "callbackName");
                this.f1884b = callbackName;
                this.f1885c = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f1885c;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
        /* renamed from: G1.f$b$b, reason: collision with other inner class name */
        public static final class EnumC0034b {
            private static final /* synthetic */ InterfaceC4463a $ENTRIES;
            private static final /* synthetic */ EnumC0034b[] $VALUES;
            public static final EnumC0034b ON_CONFIGURE = new EnumC0034b("ON_CONFIGURE", 0);
            public static final EnumC0034b ON_CREATE = new EnumC0034b("ON_CREATE", 1);
            public static final EnumC0034b ON_UPGRADE = new EnumC0034b("ON_UPGRADE", 2);
            public static final EnumC0034b ON_DOWNGRADE = new EnumC0034b("ON_DOWNGRADE", 3);
            public static final EnumC0034b ON_OPEN = new EnumC0034b("ON_OPEN", 4);

            private static final /* synthetic */ EnumC0034b[] $values() {
                return new EnumC0034b[]{ON_CONFIGURE, ON_CREATE, ON_UPGRADE, ON_DOWNGRADE, ON_OPEN};
            }

            static {
                EnumC0034b[] enumC0034bArr$values = $values();
                $VALUES = enumC0034bArr$values;
                $ENTRIES = com.google.gson.internal.c.l(enumC0034bArr$values);
            }

            private EnumC0034b(String str, int i) {
            }

            public static InterfaceC4463a<EnumC0034b> getEntries() {
                return $ENTRIES;
            }

            public static EnumC0034b valueOf(String str) {
                return (EnumC0034b) Enum.valueOf(EnumC0034b.class, str);
            }

            public static EnumC0034b[] values() {
                return (EnumC0034b[]) $VALUES.clone();
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
        public static final class c {
            public static G1.d a(a refHolder, SQLiteDatabase sQLiteDatabase) {
                l.f(refHolder, "refHolder");
                G1.d dVar = refHolder.f1876a;
                if (dVar != null && dVar.f1866b.equals(sQLiteDatabase)) {
                    return dVar;
                }
                G1.d dVar2 = new G1.d(sQLiteDatabase);
                refHolder.f1876a = dVar2;
                return dVar2;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.android.kt */
        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1886a;

            static {
                int[] iArr = new int[EnumC0034b.values().length];
                try {
                    iArr[EnumC0034b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0034b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0034b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC0034b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC0034b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f1886a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, final a aVar, final c.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.f1578a, new DatabaseErrorHandler() { // from class: G1.g
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i10 = f.b.i;
                    l.c(sQLiteDatabase);
                    d dVarA = f.b.c.a(aVar, sQLiteDatabase);
                    callback.getClass();
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + dVarA + ".path");
                    SQLiteDatabase sQLiteDatabase2 = dVarA.f1866b;
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            c.a.a(path);
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
                            dVarA.close();
                        } catch (IOException unused2) {
                        }
                        if (attachedDbs != null) {
                            return;
                        }
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object second = ((Pair) it.next()).second;
                                l.e(second, "second");
                                c.a.a((String) second);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                c.a.a(path2);
                            }
                        }
                    }
                }
            });
            l.f(context, "context");
            l.f(callback, "callback");
            this.f1877b = context;
            this.f1878c = aVar;
            this.f1879d = callback;
            this.f1880e = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                l.e(string, "toString(...)");
            } else {
                string = str;
            }
            this.f1882g = new H1.a(string, context.getCacheDir(), false);
        }

        public final F1.b a(boolean z10) throws IOException {
            H1.a aVar = this.f1882g;
            try {
                aVar.a((this.f1883h || getDatabaseName() == null) ? false : true);
                this.f1881f = false;
                SQLiteDatabase sQLiteDatabaseC = c(z10);
                if (!this.f1881f) {
                    G1.d dVarA = c.a(this.f1878c, sQLiteDatabaseC);
                    aVar.b();
                    return dVarA;
                }
                close();
                F1.b bVarA = a(z10);
                aVar.b();
                return bVarA;
            } catch (Throwable th) {
                aVar.b();
                throw th;
            }
        }

        public final SQLiteDatabase c(boolean z10) throws Throwable {
            SQLiteDatabase readableDatabase;
            SQLiteDatabase readableDatabase2;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f1883h;
            Context context = this.f1877b;
            if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z10) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    l.c(writableDatabase);
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase3 = getReadableDatabase();
                l.c(readableDatabase3);
                return readableDatabase3;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z10) {
                        readableDatabase2 = getWritableDatabase();
                        l.c(readableDatabase2);
                    } else {
                        readableDatabase2 = getReadableDatabase();
                        l.c(readableDatabase2);
                    }
                    return readableDatabase2;
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof a) {
                        a aVar = (a) th;
                        int i10 = d.f1886a[aVar.f1884b.ordinal()];
                        th = aVar.f1885c;
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                            throw th;
                        }
                        if (i10 != 5) {
                            throw new b9.j();
                        }
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.f1880e) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        if (z10) {
                            readableDatabase = getWritableDatabase();
                            l.c(readableDatabase);
                        } else {
                            readableDatabase = getReadableDatabase();
                            l.c(readableDatabase);
                        }
                        return readableDatabase;
                    } catch (a e4) {
                        throw e4.f1885c;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() throws IOException {
            H1.a aVar = this.f1882g;
            try {
                aVar.a(aVar.f2018a);
                super.close();
                this.f1878c.f1876a = null;
                this.f1883h = false;
            } finally {
                aVar.b();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase db) {
            l.f(db, "db");
            boolean z10 = this.f1881f;
            c.a aVar = this.f1879d;
            if (!z10 && aVar.f1578a != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                aVar.b(c.a(this.f1878c, db));
            } catch (Throwable th) {
                throw new a(EnumC0034b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sqLiteDatabase) {
            l.f(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f1879d.c(c.a(this.f1878c, sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(EnumC0034b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase db, int i10, int i11) {
            l.f(db, "db");
            this.f1881f = true;
            try {
                this.f1879d.d(c.a(this.f1878c, db), i10, i11);
            } catch (Throwable th) {
                throw new a(EnumC0034b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase db) {
            l.f(db, "db");
            if (!this.f1881f) {
                try {
                    this.f1879d.e(c.a(this.f1878c, db));
                } catch (Throwable th) {
                    throw new a(EnumC0034b.ON_OPEN, th);
                }
            }
            this.f1883h = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            l.f(sqLiteDatabase, "sqLiteDatabase");
            this.f1881f = true;
            try {
                this.f1879d.f(c.a(this.f1878c, sqLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(EnumC0034b.ON_UPGRADE, th);
            }
        }
    }

    public f(Context context, String str, c.a callback, boolean z10, boolean z11) {
        l.f(context, "context");
        l.f(callback, "callback");
        this.f1869b = context;
        this.f1870c = str;
        this.f1871d = callback;
        this.f1872e = z10;
        this.f1873f = z11;
        this.f1874g = C2001h.b(new e(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f1874g.f18091c != x.f18108a) {
            ((b) this.f1874g.getValue()).close();
        }
    }

    @Override // F1.c
    public final String getDatabaseName() {
        return this.f1870c;
    }

    @Override // F1.c
    public final F1.b getWritableDatabase() {
        return ((b) this.f1874g.getValue()).a(true);
    }

    @Override // F1.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f1874g.f18091c != x.f18108a) {
            ((b) this.f1874g.getValue()).setWriteAheadLoggingEnabled(z10);
        }
        this.f1875h = z10;
    }
}
