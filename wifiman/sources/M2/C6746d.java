package m2;

import Yg.J;
import Zg.AbstractC3689v;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import r2.C7560c;

/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6746d implements SupportSQLiteOpenHelper, InterfaceC6749g {

    /* renamed from: a, reason: collision with root package name */
    private final SupportSQLiteOpenHelper f52984a;

    /* renamed from: b, reason: collision with root package name */
    public final C6745c f52985b;

    /* renamed from: c, reason: collision with root package name */
    private final a f52986c;

    /* renamed from: m2.d$b */
    private static final class b implements SupportSQLiteStatement {

        /* renamed from: a, reason: collision with root package name */
        private final String f53002a;

        /* renamed from: b, reason: collision with root package name */
        private final C6745c f53003b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f53004c;

        /* renamed from: m2.d$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f53005a = new a();

            a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(SupportSQLiteStatement obj) {
                AbstractC6492s.i(obj, "obj");
                return Long.valueOf(obj.executeInsert());
            }
        }

        /* renamed from: m2.d$b$b, reason: collision with other inner class name */
        static final class C1950b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f53007b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1950b(InterfaceC6835l interfaceC6835l) {
                super(1);
                this.f53007b = interfaceC6835l;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SupportSQLiteDatabase db2) {
                AbstractC6492s.i(db2, "db");
                SupportSQLiteStatement supportSQLiteStatementCompileStatement = db2.compileStatement(b.this.f53002a);
                b.this.h(supportSQLiteStatementCompileStatement);
                return this.f53007b.invoke(supportSQLiteStatementCompileStatement);
            }
        }

        /* renamed from: m2.d$b$c */
        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f53008a = new c();

            c() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(SupportSQLiteStatement obj) {
                AbstractC6492s.i(obj, "obj");
                return Integer.valueOf(obj.executeUpdateDelete());
            }
        }

        public b(String sql, C6745c autoCloser) {
            AbstractC6492s.i(sql, "sql");
            AbstractC6492s.i(autoCloser, "autoCloser");
            this.f53002a = sql;
            this.f53003b = autoCloser;
            this.f53004c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(SupportSQLiteStatement supportSQLiteStatement) {
            Iterator it = this.f53004c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                Object obj = this.f53004c.get(i10);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i11);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.bindLong(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.bindDouble(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.bindString(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final Object j(InterfaceC6835l interfaceC6835l) {
            return this.f53003b.g(new C1950b(interfaceC6835l));
        }

        private final void p(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f53004c.size() && (size = this.f53004c.size()) <= i11) {
                while (true) {
                    this.f53004c.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f53004c.set(i11, obj);
        }

        @Override // r2.g
        public void bindBlob(int i10, byte[] value) {
            AbstractC6492s.i(value, "value");
            p(i10, value);
        }

        @Override // r2.g
        public void bindDouble(int i10, double d10) {
            p(i10, Double.valueOf(d10));
        }

        @Override // r2.g
        public void bindLong(int i10, long j10) {
            p(i10, Long.valueOf(j10));
        }

        @Override // r2.g
        public void bindNull(int i10) {
            p(i10, null);
        }

        @Override // r2.g
        public void bindString(int i10, String value) {
            AbstractC6492s.i(value, "value");
            p(i10, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long executeInsert() {
            return ((Number) j(a.f53005a)).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((Number) j(c.f53008a)).intValue();
        }
    }

    /* renamed from: m2.d$c */
    private static final class c implements Cursor {

        /* renamed from: a, reason: collision with root package name */
        private final Cursor f53009a;

        /* renamed from: b, reason: collision with root package name */
        private final C6745c f53010b;

        public c(Cursor delegate, C6745c autoCloser) {
            AbstractC6492s.i(delegate, "delegate");
            AbstractC6492s.i(autoCloser, "autoCloser");
            this.f53009a = delegate;
            this.f53010b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f53009a.close();
            this.f53010b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f53009a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f53009a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f53009a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f53009a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f53009a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f53009a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f53009a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f53009a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f53009a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f53009a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f53009a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f53009a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f53009a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f53009a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return C7560c.a(this.f53009a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return r2.f.a(this.f53009a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f53009a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f53009a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f53009a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f53009a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f53009a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f53009a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f53009a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f53009a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f53009a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f53009a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f53009a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f53009a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f53009a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f53009a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f53009a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f53009a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f53009a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f53009a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f53009a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f53009a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f53009a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            AbstractC6492s.i(extras, "extras");
            r2.e.a(this.f53009a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f53009a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            AbstractC6492s.i(cr, "cr");
            AbstractC6492s.i(uris, "uris");
            r2.f.b(this.f53009a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f53009a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f53009a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C6746d(SupportSQLiteOpenHelper delegate, C6745c autoCloser) {
        AbstractC6492s.i(delegate, "delegate");
        AbstractC6492s.i(autoCloser, "autoCloser");
        this.f52984a = delegate;
        this.f52985b = autoCloser;
        autoCloser.k(a());
        this.f52986c = new a(autoCloser);
    }

    @Override // m2.InterfaceC6749g
    public SupportSQLiteOpenHelper a() {
        return this.f52984a;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52986c.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.f52984a.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        this.f52986c.a();
        return this.f52986c;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f52984a.setWriteAheadLoggingEnabled(z10);
    }

    /* renamed from: m2.d$a */
    public static final class a implements SupportSQLiteDatabase {

        /* renamed from: a, reason: collision with root package name */
        private final C6745c f52987a;

        /* renamed from: m2.d$a$a, reason: collision with other inner class name */
        static final class C1948a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C1948a f52988a = new C1948a();

            C1948a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(SupportSQLiteDatabase obj) {
                AbstractC6492s.i(obj, "obj");
                return obj.getAttachedDbs();
            }
        }

        /* renamed from: m2.d$a$b */
        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f52989a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f52989a = str;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SupportSQLiteDatabase db2) {
                AbstractC6492s.i(db2, "db");
                db2.execSQL(this.f52989a);
                return null;
            }
        }

        /* renamed from: m2.d$a$c */
        /* synthetic */ class c extends C6490p implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f52990a = new c();

            c() {
                super(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(SupportSQLiteDatabase p02) {
                AbstractC6492s.i(p02, "p0");
                return Boolean.valueOf(p02.inTransaction());
            }
        }

        /* renamed from: m2.d$a$d, reason: collision with other inner class name */
        static final class C1949d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f52991a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f52992b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContentValues f52993c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1949d(String str, int i10, ContentValues contentValues) {
                super(1);
                this.f52991a = str;
                this.f52992b = i10;
                this.f52993c = contentValues;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(SupportSQLiteDatabase db2) {
                AbstractC6492s.i(db2, "db");
                return Long.valueOf(db2.insert(this.f52991a, this.f52992b, this.f52993c));
            }
        }

        /* renamed from: m2.d$a$e */
        static final class e extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final e f52994a = new e();

            e() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(SupportSQLiteDatabase db2) {
                AbstractC6492s.i(db2, "db");
                return Boolean.valueOf(db2.isWriteAheadLoggingEnabled());
            }
        }

        /* renamed from: m2.d$a$f */
        static final class f extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final f f52995a = new f();

            f() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(SupportSQLiteDatabase obj) {
                AbstractC6492s.i(obj, "obj");
                return obj.getPath();
            }
        }

        /* renamed from: m2.d$a$g */
        static final class g extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final g f52996a = new g();

            g() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SupportSQLiteDatabase it) {
                AbstractC6492s.i(it, "it");
                return null;
            }
        }

        /* renamed from: m2.d$a$h */
        static final class h extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f52997a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f52998b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContentValues f52999c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f53000d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object[] f53001e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f52997a = str;
                this.f52998b = i10;
                this.f52999c = contentValues;
                this.f53000d = str2;
                this.f53001e = objArr;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(SupportSQLiteDatabase db2) {
                AbstractC6492s.i(db2, "db");
                return Integer.valueOf(db2.update(this.f52997a, this.f52998b, this.f52999c, this.f53000d, this.f53001e));
            }
        }

        public a(C6745c autoCloser) {
            AbstractC6492s.i(autoCloser, "autoCloser");
            this.f52987a = autoCloser;
        }

        public final void a() {
            this.f52987a.g(g.f52996a);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.f52987a.j().beginTransaction();
            } catch (Throwable th2) {
                this.f52987a.e();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.f52987a.j().beginTransactionNonExclusive();
            } catch (Throwable th2) {
                this.f52987a.e();
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f52987a.d();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public SupportSQLiteStatement compileStatement(String sql) {
            AbstractC6492s.i(sql, "sql");
            return new b(sql, this.f52987a);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
            if (this.f52987a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                SupportSQLiteDatabase supportSQLiteDatabaseH = this.f52987a.h();
                AbstractC6492s.f(supportSQLiteDatabaseH);
                supportSQLiteDatabaseH.endTransaction();
            } finally {
                this.f52987a.e();
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(String sql) {
            AbstractC6492s.i(sql, "sql");
            this.f52987a.g(new b(sql));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public List getAttachedDbs() {
            return (List) this.f52987a.g(C1948a.f52988a);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public String getPath() {
            return (String) this.f52987a.g(f.f52995a);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.f52987a.h() == null) {
                return false;
            }
            return ((Boolean) this.f52987a.g(c.f52990a)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(String table, int i10, ContentValues values) {
            AbstractC6492s.i(table, "table");
            AbstractC6492s.i(values, "values");
            return ((Number) this.f52987a.g(new C1949d(table, i10, values))).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase supportSQLiteDatabaseH = this.f52987a.h();
            if (supportSQLiteDatabaseH == null) {
                return false;
            }
            return supportSQLiteDatabaseH.isOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.f52987a.g(e.f52994a)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(String query) {
            AbstractC6492s.i(query, "query");
            try {
                return new c(this.f52987a.j().query(query), this.f52987a);
            } catch (Throwable th2) {
                this.f52987a.e();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            J j10;
            SupportSQLiteDatabase supportSQLiteDatabaseH = this.f52987a.h();
            if (supportSQLiteDatabaseH != null) {
                supportSQLiteDatabaseH.setTransactionSuccessful();
                j10 = J.f24997a;
            } else {
                j10 = null;
            }
            if (j10 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(String table, int i10, ContentValues values, String str, Object[] objArr) {
            AbstractC6492s.i(table, "table");
            AbstractC6492s.i(values, "values");
            return ((Number) this.f52987a.g(new h(table, i10, values, str, objArr))).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(SupportSQLiteQuery query) {
            AbstractC6492s.i(query, "query");
            try {
                return new c(this.f52987a.j().query(query), this.f52987a);
            } catch (Throwable th2) {
                this.f52987a.e();
                throw th2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
            AbstractC6492s.i(query, "query");
            try {
                return new c(this.f52987a.j().query(query, cancellationSignal), this.f52987a);
            } catch (Throwable th2) {
                this.f52987a.e();
                throw th2;
            }
        }
    }
}
