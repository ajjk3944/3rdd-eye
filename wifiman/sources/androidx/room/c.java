package androidx.room;

import Yg.J;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import jh.AbstractC6329b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import m2.C6745c;
import m2.C6753k;
import m2.q;
import n.C6854b;
import r2.C7558a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: q, reason: collision with root package name */
    public static final a f32278q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f32279r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    private final q f32280a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f32281b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f32282c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f32283d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f32284e;

    /* renamed from: f, reason: collision with root package name */
    private C6745c f32285f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f32286g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f32287h;

    /* renamed from: i, reason: collision with root package name */
    private volatile SupportSQLiteStatement f32288i;

    /* renamed from: j, reason: collision with root package name */
    private final b f32289j;

    /* renamed from: k, reason: collision with root package name */
    private final C6753k f32290k;

    /* renamed from: l, reason: collision with root package name */
    private final C6854b f32291l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.room.d f32292m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f32293n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f32294o;

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f32295p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(SupportSQLiteDatabase database) {
            AbstractC6492s.i(database, "database");
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }

        public final String b(String tableName, String triggerType) {
            AbstractC6492s.i(tableName, "tableName");
            AbstractC6492s.i(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final a f32296e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final long[] f32297a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f32298b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f32299c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f32300d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(int i10) {
            this.f32297a = new long[i10];
            this.f32298b = new boolean[i10];
            this.f32299c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f32300d) {
                        return null;
                    }
                    long[] jArr = this.f32297a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f32298b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f32299c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f32299c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f32300d = false;
                    return (int[]) this.f32299c.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z10;
            AbstractC6492s.i(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f32297a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            this.f32300d = true;
                            z10 = true;
                        }
                    }
                    J j11 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final boolean c(int... tableIds) {
            boolean z10;
            AbstractC6492s.i(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f32297a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            this.f32300d = true;
                            z10 = true;
                        }
                    }
                    J j11 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f32298b, false);
                this.f32300d = true;
                J j10 = J.f24997a;
            }
        }
    }

    /* renamed from: androidx.room.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC1124c {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f32301a;

        public AbstractC1124c(String[] tables) {
            AbstractC6492s.i(tables, "tables");
            this.f32301a = tables;
        }

        public final String[] a() {
            return this.f32301a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set set);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1124c f32302a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f32303b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f32304c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f32305d;

        public d(AbstractC1124c observer, int[] tableIds, String[] tableNames) {
            AbstractC6492s.i(observer, "observer");
            AbstractC6492s.i(tableIds, "tableIds");
            AbstractC6492s.i(tableNames, "tableNames");
            this.f32302a = observer;
            this.f32303b = tableIds;
            this.f32304c = tableNames;
            this.f32305d = !(tableNames.length == 0) ? d0.c(tableNames[0]) : d0.e();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f32303b;
        }

        public final void b(Set invalidatedTablesIds) {
            Set setE;
            AbstractC6492s.i(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f32303b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set setB = d0.b();
                    int[] iArr2 = this.f32303b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            setB.add(this.f32304c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setE = d0.a(setB);
                } else {
                    setE = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f32305d : d0.e();
                }
            } else {
                setE = d0.e();
            }
            if (setE.isEmpty()) {
                return;
            }
            this.f32302a.c(setE);
        }

        public final void c(String[] tables) {
            Set setE;
            AbstractC6492s.i(tables, "tables");
            int length = this.f32304c.length;
            if (length == 0) {
                setE = d0.e();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        setE = d0.e();
                        break;
                    } else {
                        if (t.C(tables[i10], this.f32304c[0], true)) {
                            setE = this.f32305d;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set setB = d0.b();
                for (String str : tables) {
                    for (String str2 : this.f32304c) {
                        if (t.C(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setE = d0.a(setB);
            }
            if (setE.isEmpty()) {
                return;
            }
            this.f32302a.c(setE);
        }
    }

    public static final class e implements Runnable {
        e() {
        }

        private final Set a() {
            c cVar = c.this;
            Set setB = d0.b();
            Cursor cursorZ = q.z(cVar.f(), new C7558a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorZ.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorZ.getInt(0)));
                } finally {
                }
            }
            J j10 = J.f24997a;
            AbstractC6329b.a(cursorZ, null);
            Set setA = d0.a(setB);
            if (!setA.isEmpty()) {
                if (c.this.e() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                SupportSQLiteStatement supportSQLiteStatementE = c.this.e();
                if (supportSQLiteStatementE == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                supportSQLiteStatementE.executeUpdateDelete();
            }
            return setA;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setE;
            C6745c c6745c;
            C6745c c6745c2;
            Lock lockK = c.this.f().k();
            lockK.lock();
            try {
                try {
                } catch (SQLiteException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    setE = d0.e();
                    lockK.unlock();
                    c6745c = c.this.f32285f;
                    if (c6745c != null) {
                    }
                } catch (IllegalStateException e11) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                    setE = d0.e();
                    lockK.unlock();
                    c6745c = c.this.f32285f;
                    if (c6745c != null) {
                    }
                }
                if (!c.this.d()) {
                    if (c6745c2 != null) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!c.this.h().compareAndSet(true, false)) {
                    lockK.unlock();
                    C6745c c6745c3 = c.this.f32285f;
                    if (c6745c3 != null) {
                        c6745c3.e();
                        return;
                    }
                    return;
                }
                if (c.this.f().r()) {
                    lockK.unlock();
                    C6745c c6745c4 = c.this.f32285f;
                    if (c6745c4 != null) {
                        c6745c4.e();
                        return;
                    }
                    return;
                }
                SupportSQLiteDatabase writableDatabase = c.this.f().m().getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    setE = a();
                    writableDatabase.setTransactionSuccessful();
                    lockK.unlock();
                    c6745c = c.this.f32285f;
                    if (c6745c != null) {
                        c6745c.e();
                    }
                    if (setE.isEmpty()) {
                        return;
                    }
                    C6854b c6854bG = c.this.g();
                    c cVar = c.this;
                    synchronized (c6854bG) {
                        try {
                            Iterator it = cVar.g().iterator();
                            while (it.hasNext()) {
                                ((d) ((Map.Entry) it.next()).getValue()).b(setE);
                            }
                            J j10 = J.f24997a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } finally {
                lockK.unlock();
                c6745c2 = c.this.f32285f;
                if (c6745c2 != null) {
                    c6745c2.e();
                }
            }
        }
    }

    public c(q database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String lowerCase;
        AbstractC6492s.i(database, "database");
        AbstractC6492s.i(shadowTablesMap, "shadowTablesMap");
        AbstractC6492s.i(viewTables, "viewTables");
        AbstractC6492s.i(tableNames, "tableNames");
        this.f32280a = database;
        this.f32281b = shadowTablesMap;
        this.f32282c = viewTables;
        this.f32286g = new AtomicBoolean(false);
        this.f32289j = new b(tableNames.length);
        this.f32290k = new C6753k(database);
        this.f32291l = new C6854b();
        this.f32293n = new Object();
        this.f32294o = new Object();
        this.f32283d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale US = Locale.US;
            AbstractC6492s.h(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            AbstractC6492s.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f32283d.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f32281b.get(tableNames[i10]);
            if (str2 != null) {
                AbstractC6492s.h(US, "US");
                lowerCase = str2.toLowerCase(US);
                AbstractC6492s.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.f32284e = strArr;
        for (Map.Entry entry : this.f32281b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            AbstractC6492s.h(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            AbstractC6492s.h(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f32283d.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                AbstractC6492s.h(US2, "US");
                String lowerCase4 = str4.toLowerCase(US2);
                AbstractC6492s.h(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f32283d;
                map.put(lowerCase4, U.i(map, lowerCase3));
            }
        }
        this.f32295p = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f32294o) {
            this.f32287h = false;
            this.f32289j.d();
            SupportSQLiteStatement supportSQLiteStatement = this.f32288i;
            if (supportSQLiteStatement != null) {
                supportSQLiteStatement.close();
                J j10 = J.f24997a;
            }
        }
    }

    private final String[] o(String[] strArr) {
        Set setB = d0.b();
        for (String str : strArr) {
            Map map = this.f32282c;
            Locale US = Locale.US;
            AbstractC6492s.h(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC6492s.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f32282c;
                AbstractC6492s.h(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                AbstractC6492s.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                AbstractC6492s.f(obj);
                setB.addAll((Collection) obj);
            } else {
                setB.add(str);
            }
        }
        return (String[]) d0.a(setB).toArray(new String[0]);
    }

    private final void r(SupportSQLiteDatabase supportSQLiteDatabase, int i10) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f32284e[i10];
        for (String str2 : f32279r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f32278q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            AbstractC6492s.h(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    private final void s(SupportSQLiteDatabase supportSQLiteDatabase, int i10) {
        String str = this.f32284e[i10];
        for (String str2 : f32279r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f32278q.b(str, str2);
            AbstractC6492s.h(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    public void c(AbstractC1124c observer) {
        d dVar;
        AbstractC6492s.i(observer, "observer");
        String[] strArrO = o(observer.a());
        ArrayList arrayList = new ArrayList(strArrO.length);
        for (String str : strArrO) {
            Map map = this.f32283d;
            Locale US = Locale.US;
            AbstractC6492s.h(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC6492s.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrH1 = AbstractC3689v.h1(arrayList);
        d dVar2 = new d(observer, iArrH1, strArrO);
        synchronized (this.f32291l) {
            dVar = (d) this.f32291l.j(observer, dVar2);
        }
        if (dVar == null && this.f32289j.b(Arrays.copyOf(iArrH1, iArrH1.length))) {
            t();
        }
    }

    public final boolean d() {
        if (!this.f32280a.x()) {
            return false;
        }
        if (!this.f32287h) {
            this.f32280a.m().getWritableDatabase();
        }
        if (this.f32287h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final SupportSQLiteStatement e() {
        return this.f32288i;
    }

    public final q f() {
        return this.f32280a;
    }

    public final C6854b g() {
        return this.f32291l;
    }

    public final AtomicBoolean h() {
        return this.f32286g;
    }

    public final Map i() {
        return this.f32283d;
    }

    public final void j(SupportSQLiteDatabase database) {
        AbstractC6492s.i(database, "database");
        synchronized (this.f32294o) {
            if (this.f32287h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            u(database);
            this.f32288i = database.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f32287h = true;
            J j10 = J.f24997a;
        }
    }

    public final void k(String... tables) {
        AbstractC6492s.i(tables, "tables");
        synchronized (this.f32291l) {
            try {
                for (Map.Entry entry : this.f32291l) {
                    AbstractC6492s.h(entry, "(observer, wrapper)");
                    AbstractC1124c abstractC1124c = (AbstractC1124c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!abstractC1124c.b()) {
                        dVar.c(tables);
                    }
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m() {
        if (this.f32286g.compareAndSet(false, true)) {
            C6745c c6745c = this.f32285f;
            if (c6745c != null) {
                c6745c.j();
            }
            this.f32280a.n().execute(this.f32295p);
        }
    }

    public void n(AbstractC1124c observer) {
        d dVar;
        AbstractC6492s.i(observer, "observer");
        synchronized (this.f32291l) {
            dVar = (d) this.f32291l.k(observer);
        }
        if (dVar != null) {
            b bVar = this.f32289j;
            int[] iArrA = dVar.a();
            if (bVar.c(Arrays.copyOf(iArrA, iArrA.length))) {
                t();
            }
        }
    }

    public final void p(C6745c autoCloser) {
        AbstractC6492s.i(autoCloser, "autoCloser");
        this.f32285f = autoCloser;
        autoCloser.l(new Runnable() { // from class: m2.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f53034a.l();
            }
        });
    }

    public final void q(Context context, String name, Intent serviceIntent) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(serviceIntent, "serviceIntent");
        this.f32292m = new androidx.room.d(context, name, serviceIntent, this, this.f32280a.n());
    }

    public final void t() {
        if (this.f32280a.x()) {
            u(this.f32280a.m().getWritableDatabase());
        }
    }

    public final void u(SupportSQLiteDatabase database) {
        AbstractC6492s.i(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock lockK = this.f32280a.k();
            lockK.lock();
            try {
                synchronized (this.f32293n) {
                    int[] iArrA = this.f32289j.a();
                    if (iArrA == null) {
                        return;
                    }
                    f32278q.a(database);
                    try {
                        int length = iArrA.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = iArrA[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                r(database, i11);
                            } else if (i12 == 2) {
                                s(database, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.setTransactionSuccessful();
                        database.endTransaction();
                        J j10 = J.f24997a;
                    } catch (Throwable th2) {
                        database.endTransaction();
                        throw th2;
                    }
                }
            } finally {
                lockK.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
