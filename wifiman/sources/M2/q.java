package m2;

import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m.C6653c;
import mh.InterfaceC6835l;
import n2.AbstractC6867a;
import r2.C7560c;
import s2.C7883f;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: o, reason: collision with root package name */
    public static final b f53040o = new b(null);

    /* renamed from: a, reason: collision with root package name */
    protected volatile SupportSQLiteDatabase f53041a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f53042b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f53043c;

    /* renamed from: d, reason: collision with root package name */
    private SupportSQLiteOpenHelper f53044d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f53046f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f53047g;

    /* renamed from: h, reason: collision with root package name */
    protected List f53048h;

    /* renamed from: k, reason: collision with root package name */
    private C6745c f53051k;

    /* renamed from: m, reason: collision with root package name */
    private final Map f53053m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f53054n;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.room.c f53045e = g();

    /* renamed from: i, reason: collision with root package name */
    private Map f53049i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    private final ReentrantReadWriteLock f53050j = new ReentrantReadWriteLock();

    /* renamed from: l, reason: collision with root package name */
    private final ThreadLocal f53052l = new ThreadLocal();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f53055a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f53056b;

        /* renamed from: c, reason: collision with root package name */
        private final String f53057c;

        /* renamed from: d, reason: collision with root package name */
        private final List f53058d;

        /* renamed from: e, reason: collision with root package name */
        private final List f53059e;

        /* renamed from: f, reason: collision with root package name */
        private List f53060f;

        /* renamed from: g, reason: collision with root package name */
        private Executor f53061g;

        /* renamed from: h, reason: collision with root package name */
        private Executor f53062h;

        /* renamed from: i, reason: collision with root package name */
        private SupportSQLiteOpenHelper.b f53063i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f53064j;

        /* renamed from: k, reason: collision with root package name */
        private c f53065k;

        /* renamed from: l, reason: collision with root package name */
        private Intent f53066l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f53067m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f53068n;

        /* renamed from: o, reason: collision with root package name */
        private long f53069o;

        /* renamed from: p, reason: collision with root package name */
        private TimeUnit f53070p;

        /* renamed from: q, reason: collision with root package name */
        private final d f53071q;

        /* renamed from: r, reason: collision with root package name */
        private Set f53072r;

        /* renamed from: s, reason: collision with root package name */
        private Set f53073s;

        /* renamed from: t, reason: collision with root package name */
        private String f53074t;

        /* renamed from: u, reason: collision with root package name */
        private File f53075u;

        /* renamed from: v, reason: collision with root package name */
        private Callable f53076v;

        public a(Context context, Class klass, String str) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(klass, "klass");
            this.f53055a = context;
            this.f53056b = klass;
            this.f53057c = str;
            this.f53058d = new ArrayList();
            this.f53059e = new ArrayList();
            this.f53060f = new ArrayList();
            this.f53065k = c.AUTOMATIC;
            this.f53067m = true;
            this.f53069o = -1L;
            this.f53071q = new d();
            this.f53072r = new LinkedHashSet();
        }

        public a a(AbstractC6867a... migrations) {
            AbstractC6492s.i(migrations, "migrations");
            if (this.f53073s == null) {
                this.f53073s = new HashSet();
            }
            for (AbstractC6867a abstractC6867a : migrations) {
                Set set = this.f53073s;
                AbstractC6492s.f(set);
                set.add(Integer.valueOf(abstractC6867a.f54290a));
                Set set2 = this.f53073s;
                AbstractC6492s.f(set2);
                set2.add(Integer.valueOf(abstractC6867a.f54291b));
            }
            this.f53071q.b((AbstractC6867a[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public q b() {
            Executor executor = this.f53061g;
            if (executor == null && this.f53062h == null) {
                Executor executorF = C6653c.f();
                this.f53062h = executorF;
                this.f53061g = executorF;
            } else if (executor != null && this.f53062h == null) {
                this.f53062h = executor;
            } else if (executor == null) {
                this.f53061g = this.f53062h;
            }
            Set set = this.f53073s;
            if (set != null) {
                AbstractC6492s.f(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (this.f53072r.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.b vVar = this.f53063i;
            if (vVar == null) {
                vVar = new C7883f();
            }
            if (vVar != null) {
                if (this.f53069o > 0) {
                    if (this.f53057c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.f53069o;
                    TimeUnit timeUnit = this.f53070p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f53061g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    vVar = new C6747e(vVar, new C6745c(j10, timeUnit, executor2));
                }
                String str = this.f53074t;
                if (str != null || this.f53075u != null || this.f53076v != null) {
                    if (this.f53057c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.f53075u;
                    int i11 = file == null ? 0 : 1;
                    Callable callable = this.f53076v;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    vVar = new v(str, file, callable, vVar);
                }
            } else {
                vVar = null;
            }
            SupportSQLiteOpenHelper.b bVar = vVar;
            if (bVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f53055a;
            String str2 = this.f53057c;
            d dVar = this.f53071q;
            List list = this.f53058d;
            boolean z10 = this.f53064j;
            c cVarResolve$room_runtime_release = this.f53065k.resolve$room_runtime_release(context);
            Executor executor3 = this.f53061g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f53062h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C6748f c6748f = new C6748f(context, str2, bVar, dVar, list, z10, cVarResolve$room_runtime_release, executor3, executor4, this.f53066l, this.f53067m, this.f53068n, this.f53072r, this.f53074t, this.f53075u, this.f53076v, null, this.f53059e, this.f53060f);
            q qVar = (q) p.b(this.f53056b, "_Impl");
            qVar.s(c6748f);
            return qVar;
        }

        public a c(SupportSQLiteOpenHelper.b bVar) {
            this.f53063i = bVar;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return C7560c.b(activityManager);
        }

        public final c resolve$room_runtime_release(Context context) {
            AbstractC6492s.i(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final Map f53077a = new LinkedHashMap();

        private final void a(AbstractC6867a abstractC6867a) {
            int i10 = abstractC6867a.f54290a;
            int i11 = abstractC6867a.f54291b;
            Map map = this.f53077a;
            Integer numValueOf = Integer.valueOf(i10);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + abstractC6867a);
            }
            treeMap2.put(Integer.valueOf(i11), abstractC6867a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List e(java.util.List r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L63
                goto L7
            L5:
                if (r9 <= r10) goto L63
            L7:
                java.util.Map r0 = r6.f53077a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r4 = "targetVersion"
                if (r8 == 0) goto L44
                int r5 = r9 + 1
                kotlin.jvm.internal.AbstractC6492s.h(r3, r4)
                int r4 = r3.intValue()
                if (r5 > r4) goto L26
                if (r4 > r10) goto L26
                goto L4f
            L44:
                kotlin.jvm.internal.AbstractC6492s.h(r3, r4)
                int r4 = r3.intValue()
                if (r10 > r4) goto L26
                if (r4 >= r9) goto L26
            L4f:
                java.lang.Object r9 = r0.get(r3)
                kotlin.jvm.internal.AbstractC6492s.f(r9)
                r7.add(r9)
                int r9 = r3.intValue()
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L0
                return r1
            L63:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.q.d.e(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(AbstractC6867a... migrations) {
            AbstractC6492s.i(migrations, "migrations");
            for (AbstractC6867a abstractC6867a : migrations) {
                a(abstractC6867a);
            }
        }

        public final boolean c(int i10, int i11) {
            Map mapF = f();
            if (!mapF.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map mapH = (Map) mapF.get(Integer.valueOf(i10));
            if (mapH == null) {
                mapH = U.h();
            }
            return mapH.containsKey(Integer.valueOf(i11));
        }

        public List d(int i10, int i11) {
            if (i10 == i11) {
                return AbstractC3689v.l();
            }
            return e(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map f() {
            return this.f53077a;
        }
    }

    public static abstract class e {
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {
        f() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SupportSQLiteDatabase it) {
            AbstractC6492s.i(it, "it");
            q.this.t();
            return null;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {
        g() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SupportSQLiteDatabase it) {
            AbstractC6492s.i(it, "it");
            q.this.u();
            return null;
        }
    }

    public q() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        AbstractC6492s.h(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f53053m = mapSynchronizedMap;
        this.f53054n = new LinkedHashMap();
    }

    private final Object B(Class cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof InterfaceC6749g) {
            return B(cls, ((InterfaceC6749g) supportSQLiteOpenHelper).a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        c();
        SupportSQLiteDatabase writableDatabase = m().getWritableDatabase();
        l().u(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        m().getWritableDatabase().endTransaction();
        if (r()) {
            return;
        }
        l().m();
    }

    public static /* synthetic */ Cursor z(q qVar, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return qVar.y(supportSQLiteQuery, cancellationSignal);
    }

    public void A() {
        m().getWritableDatabase().setTransactionSuccessful();
    }

    public void c() {
        if (!this.f53046f && w()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!r() && this.f53052l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        C6745c c6745c = this.f53051k;
        if (c6745c == null) {
            t();
        } else {
            c6745c.g(new f());
        }
    }

    public SupportSQLiteStatement f(String sql) {
        AbstractC6492s.i(sql, "sql");
        c();
        d();
        return m().getWritableDatabase().compileStatement(sql);
    }

    protected abstract androidx.room.c g();

    protected abstract SupportSQLiteOpenHelper h(C6748f c6748f);

    public void i() {
        C6745c c6745c = this.f53051k;
        if (c6745c == null) {
            u();
        } else {
            c6745c.g(new g());
        }
    }

    public List j(Map autoMigrationSpecs) {
        AbstractC6492s.i(autoMigrationSpecs, "autoMigrationSpecs");
        return AbstractC3689v.l();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock lock = this.f53050j.readLock();
        AbstractC6492s.h(lock, "readWriteLock.readLock()");
        return lock;
    }

    public androidx.room.c l() {
        return this.f53045e;
    }

    public SupportSQLiteOpenHelper m() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f53044d;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        AbstractC6492s.v("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f53042b;
        if (executor != null) {
            return executor;
        }
        AbstractC6492s.v("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return d0.e();
    }

    protected Map p() {
        return U.h();
    }

    public Executor q() {
        Executor executor = this.f53043c;
        if (executor != null) {
            return executor;
        }
        AbstractC6492s.v("internalTransactionExecutor");
        return null;
    }

    public boolean r() {
        return m().getWritableDatabase().inTransaction();
    }

    public void s(C6748f configuration) {
        AbstractC6492s.i(configuration, "configuration");
        this.f53044d = h(configuration);
        Set setO = o();
        BitSet bitSet = new BitSet();
        Iterator it = setO.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.f53030r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (cls.isAssignableFrom(configuration.f53030r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f53049i.put(cls, configuration.f53030r.get(i10));
            } else {
                int size2 = configuration.f53030r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (AbstractC6867a abstractC6867a : j(this.f53049i)) {
                    if (!configuration.f53016d.c(abstractC6867a.f54290a, abstractC6867a.f54291b)) {
                        configuration.f53016d.b(abstractC6867a);
                    }
                }
                u uVar = (u) B(u.class, m());
                if (uVar != null) {
                    uVar.j(configuration);
                }
                C6746d c6746d = (C6746d) B(C6746d.class, m());
                if (c6746d != null) {
                    this.f53051k = c6746d.f52985b;
                    l().p(c6746d.f52985b);
                }
                boolean z10 = configuration.f53019g == c.WRITE_AHEAD_LOGGING;
                m().setWriteAheadLoggingEnabled(z10);
                this.f53048h = configuration.f53017e;
                this.f53042b = configuration.f53020h;
                this.f53043c = new y(configuration.f53021i);
                this.f53046f = configuration.f53018f;
                this.f53047g = z10;
                if (configuration.f53022j != null) {
                    if (configuration.f53014b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    l().q(configuration.f53013a, configuration.f53014b, configuration.f53022j);
                }
                Map mapP = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapP.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.f53029q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i13 = size3 - 1;
                                if (cls3.isAssignableFrom(configuration.f53029q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i13 < 0) {
                                    break;
                                } else {
                                    size3 = i13;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f53054n.put(cls3, configuration.f53029q.get(size3));
                    }
                }
                int size4 = configuration.f53029q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f53029q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    protected void v(SupportSQLiteDatabase db2) {
        AbstractC6492s.i(db2, "db");
        l().j(db2);
    }

    public final boolean w() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean x() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.f53041a;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    public Cursor y(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        AbstractC6492s.i(query, "query");
        c();
        d();
        return cancellationSignal != null ? m().getWritableDatabase().query(query, cancellationSignal) : m().getWritableDatabase().query(query);
    }
}
