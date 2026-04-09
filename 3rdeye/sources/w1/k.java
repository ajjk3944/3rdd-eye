package w1;

import A9.F;
import F9.C0663f;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.e;
import b9.C1992A;
import c9.C2099t;
import c9.C2100u;
import c9.C2101v;
import f9.InterfaceC4350h;
import i9.InterfaceC4463a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p9.InterfaceC5480a;

/* compiled from: RoomDatabase.android.kt */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public C0663f f47232a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4350h f47233b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f47234c;

    /* renamed from: d, reason: collision with root package name */
    public p f47235d;

    /* renamed from: e, reason: collision with root package name */
    public i f47236e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.room.c f47237f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47239h;

    /* renamed from: g, reason: collision with root package name */
    public final E7.b f47238g = new E7.b(new e(0, this, k.class, "onClosed", "onClosed()V", 0));
    public final ThreadLocal<Integer> i = new ThreadLocal<>();

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f47240j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public boolean f47241k = true;

    /* compiled from: RoomDatabase.android.kt */
    public static class a<T extends k> {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.internal.e f47242a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f47243b;

        /* renamed from: c, reason: collision with root package name */
        public final String f47244c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f47245d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f47246e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f47247f;

        /* renamed from: g, reason: collision with root package name */
        public Executor f47248g;

        /* renamed from: h, reason: collision with root package name */
        public T1.t f47249h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public final c f47250j;

        /* renamed from: k, reason: collision with root package name */
        public final long f47251k;

        /* renamed from: l, reason: collision with root package name */
        public final d f47252l;

        /* renamed from: m, reason: collision with root package name */
        public final LinkedHashSet f47253m;

        /* renamed from: n, reason: collision with root package name */
        public final LinkedHashSet f47254n;

        /* renamed from: o, reason: collision with root package name */
        public final ArrayList f47255o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f47256p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f47257q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f47258r;

        public a(Context context, Class<T> cls, String str) {
            kotlin.jvm.internal.l.f(context, "context");
            this.f47245d = new ArrayList();
            this.f47246e = new ArrayList();
            this.f47250j = c.AUTOMATIC;
            this.f47251k = -1L;
            this.f47252l = new d();
            this.f47253m = new LinkedHashSet();
            this.f47254n = new LinkedHashSet();
            this.f47255o = new ArrayList();
            this.f47256p = true;
            this.f47258r = true;
            this.f47242a = kotlin.jvm.internal.x.a(cls);
            this.f47243b = context;
            this.f47244c = str;
        }

        public final void a(A1.a... aVarArr) {
            for (A1.a aVar : aVarArr) {
                LinkedHashSet linkedHashSet = this.f47254n;
                linkedHashSet.add(Integer.valueOf(aVar.f5a));
                linkedHashSet.add(Integer.valueOf(aVar.f6b));
            }
            A1.a[] migrations = (A1.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
            d dVar = this.f47252l;
            dVar.getClass();
            kotlin.jvm.internal.l.f(migrations, "migrations");
            for (A1.a aVar2 : migrations) {
                dVar.a(aVar2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:94:0x0243, code lost:
        
            throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final T b() throws java.lang.ClassNotFoundException {
            /*
                Method dump skipped, instructions count: 1407
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.k.a.b():w1.k");
        }
    }

    /* compiled from: RoomDatabase.android.kt */
    public static abstract class b {
        public void a(F1.b db) {
            kotlin.jvm.internal.l.f(db, "db");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RoomDatabase.android.kt */
    public static final class c {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c AUTOMATIC = new c("AUTOMATIC", 0);
        public static final c TRUNCATE = new c("TRUNCATE", 1);
        public static final c WRITE_AHEAD_LOGGING = new c("WRITE_AHEAD_LOGGING", 2);

        private static final /* synthetic */ c[] $values() {
            return new c[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(cVarArr$values);
        }

        private c(String str, int i) {
        }

        public static InterfaceC4463a<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final c resolve$room_runtime_release(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: RoomDatabase.android.kt */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f47259a = new LinkedHashMap();

        public final void a(A1.a migration) {
            kotlin.jvm.internal.l.f(migration, "migration");
            LinkedHashMap linkedHashMap = this.f47259a;
            Integer numValueOf = Integer.valueOf(migration.f5a);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i = migration.f6b;
            if (treeMap2.containsKey(Integer.valueOf(i))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i), migration);
        }
    }

    /* compiled from: RoomDatabase.android.kt */
    public /* synthetic */ class e extends kotlin.jvm.internal.k implements InterfaceC5480a<C1992A> {
        @Override // p9.InterfaceC5480a
        public final C1992A invoke() throws Exception {
            k kVar = (k) this.receiver;
            C0663f c0663f = kVar.f47232a;
            if (c0663f == null) {
                kotlin.jvm.internal.l.l("coroutineScope");
                throw null;
            }
            F.b(c0663f, null);
            androidx.room.e eVar = kVar.h().i;
            if (eVar != null) {
                if (eVar.f16805e.compareAndSet(false, true)) {
                    androidx.room.c cVar = eVar.f16802b;
                    e.b observer = eVar.i;
                    kotlin.jvm.internal.l.f(observer, "observer");
                    ReentrantLock reentrantLock = cVar.f16793e;
                    reentrantLock.lock();
                    try {
                        androidx.room.f fVar = (androidx.room.f) cVar.f16792d.remove(observer);
                        if (fVar != null) {
                            u uVar = cVar.f16791c;
                            uVar.getClass();
                            int[] iArr = fVar.f16819b;
                            f fVar2 = uVar.f47291h;
                            fVar2.getClass();
                            ReentrantLock reentrantLock2 = fVar2.f47221a;
                            reentrantLock2.lock();
                            try {
                                boolean z10 = false;
                                for (int i : iArr) {
                                    long[] jArr = fVar2.f47222b;
                                    long j4 = jArr[i];
                                    jArr[i] = j4 - 1;
                                    if (j4 == 1) {
                                        fVar2.f47224d = true;
                                        z10 = true;
                                    }
                                }
                                if (z10) {
                                    y1.q.a(new androidx.room.d(cVar, null));
                                }
                            } finally {
                                reentrantLock2.unlock();
                            }
                        }
                        try {
                            androidx.room.b bVar = eVar.f16807g;
                            if (bVar != null) {
                                bVar.t(eVar.f16809j, eVar.f16806f);
                            }
                        } catch (RemoteException e4) {
                            Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e4);
                        }
                        eVar.f16803c.unbindService(eVar.f16810k);
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            }
            i iVar = kVar.f47236e;
            if (iVar != null) {
                iVar.f47228f.close();
                return C1992A.f18074a;
            }
            kotlin.jvm.internal.l.l("connectionManager");
            throw null;
        }
    }

    public final void a() {
        if (this.f47239h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (l() && !m() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        F1.b writableDatabase = i().getWritableDatabase();
        if (!writableDatabase.s0()) {
            y1.q.a(new w1.e(h(), null));
        }
        if (writableDatabase.z0()) {
            writableDatabase.Y();
        } else {
            writableDatabase.r();
        }
    }

    public abstract androidx.room.c d();

    public m e() {
        throw new b9.k(0);
    }

    public F1.c f(C5716b config) {
        kotlin.jvm.internal.l.f(config, "config");
        throw new b9.k(0);
    }

    public List g(LinkedHashMap linkedHashMap) {
        return C2099t.f18581b;
    }

    public final androidx.room.c h() {
        androidx.room.c cVar = this.f47237f;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.l.l("internalTracker");
        throw null;
    }

    public final F1.c i() {
        i iVar = this.f47236e;
        if (iVar == null) {
            kotlin.jvm.internal.l.l("connectionManager");
            throw null;
        }
        F1.c cVarJ = iVar.j();
        if (cVarJ != null) {
            return cVarJ;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set<Class<Object>> j() {
        return C2101v.f18583b;
    }

    public Map<Class<?>, List<Class<?>>> k() {
        return C2100u.f18582b;
    }

    public final boolean l() {
        i iVar = this.f47236e;
        if (iVar != null) {
            return iVar.j() != null;
        }
        kotlin.jvm.internal.l.l("connectionManager");
        throw null;
    }

    public final boolean m() {
        return p() && i().getWritableDatabase().s0();
    }

    public final void n() {
        i().getWritableDatabase().v();
        if (m()) {
            return;
        }
        androidx.room.c cVarH = h();
        cVarH.f16791c.e(cVarH.f16794f, cVarH.f16795g);
    }

    public final void o(E1.a connection) throws Exception {
        kotlin.jvm.internal.l.f(connection, "connection");
        androidx.room.c cVarH = h();
        u uVar = cVarH.f16791c;
        uVar.getClass();
        E1.c cVarK0 = connection.K0("PRAGMA query_only");
        try {
            cVarK0.x();
            boolean zT = cVarK0.T();
            cVarK0.close();
            if (!zT) {
                A2.l.v(connection, "PRAGMA temp_store = MEMORY");
                A2.l.v(connection, "PRAGMA recursive_triggers = 1");
                A2.l.v(connection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (uVar.f47287d) {
                    A2.l.v(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    A2.l.v(connection, y9.n.X("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                f fVar = uVar.f47291h;
                ReentrantLock reentrantLock = fVar.f47221a;
                reentrantLock.lock();
                try {
                    fVar.f47224d = true;
                    C1992A c1992a = C1992A.f18074a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (cVarH.f16797j) {
                try {
                    androidx.room.e eVar = cVarH.i;
                    if (eVar != null) {
                        Intent intent = cVarH.f16796h;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        eVar.a(intent);
                        C1992A c1992a2 = C1992A.f18074a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
        }
    }

    public final boolean p() {
        i iVar = this.f47236e;
        if (iVar == null) {
            kotlin.jvm.internal.l.l("connectionManager");
            throw null;
        }
        F1.b bVar = iVar.f47229g;
        if (bVar != null) {
            return bVar.isOpen();
        }
        return false;
    }

    public final <T> T q(InterfaceC5480a<? extends T> interfaceC5480a) {
        if (!l()) {
            return (T) B7.d.u(this, false, true, new I2.g(1, interfaceC5480a));
        }
        c();
        try {
            T tInvoke = interfaceC5480a.invoke();
            r();
            return tInvoke;
        } finally {
            n();
        }
    }

    public final void r() {
        i().getWritableDatabase().u();
    }
}
