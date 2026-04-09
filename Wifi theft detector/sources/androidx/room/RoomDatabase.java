package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q1.h;
import u1.c;

/* loaded from: classes.dex */
public abstract class RoomDatabase {

    /* renamed from: a, reason: collision with root package name */
    public volatile u1.b f4024a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f4025b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f4026c;

    /* renamed from: d, reason: collision with root package name */
    public u1.c f4027d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4029f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4030g;

    /* renamed from: h, reason: collision with root package name */
    public List f4031h;

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantReadWriteLock f4032i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f4033j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public final Map f4034k = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final d f4028e = e();

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public static boolean a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        public JournalMode b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f4039a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4040b;

        /* renamed from: c, reason: collision with root package name */
        public final Context f4041c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f4042d;

        /* renamed from: e, reason: collision with root package name */
        public Executor f4043e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f4044f;

        /* renamed from: g, reason: collision with root package name */
        public c.InterfaceC0488c f4045g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f4046h;

        /* renamed from: j, reason: collision with root package name */
        public boolean f4048j;

        /* renamed from: l, reason: collision with root package name */
        public boolean f4050l;

        /* renamed from: n, reason: collision with root package name */
        public Set f4052n;

        /* renamed from: o, reason: collision with root package name */
        public Set f4053o;

        /* renamed from: p, reason: collision with root package name */
        public String f4054p;

        /* renamed from: q, reason: collision with root package name */
        public File f4055q;

        /* renamed from: i, reason: collision with root package name */
        public JournalMode f4047i = JournalMode.AUTOMATIC;

        /* renamed from: k, reason: collision with root package name */
        public boolean f4049k = true;

        /* renamed from: m, reason: collision with root package name */
        public final c f4051m = new c();

        public a(Context context, Class cls, String str) {
            this.f4041c = context;
            this.f4039a = cls;
            this.f4040b = str;
        }

        public a a(b bVar) {
            if (this.f4042d == null) {
                this.f4042d = new ArrayList();
            }
            this.f4042d.add(bVar);
            return this;
        }

        public a b(r1.a... aVarArr) {
            if (this.f4053o == null) {
                this.f4053o = new HashSet();
            }
            for (r1.a aVar : aVarArr) {
                this.f4053o.add(Integer.valueOf(aVar.f24139a));
                this.f4053o.add(Integer.valueOf(aVar.f24140b));
            }
            this.f4051m.b(aVarArr);
            return this;
        }

        public a c() {
            this.f4046h = true;
            return this;
        }

        public RoomDatabase d() {
            Executor executor;
            if (this.f4041c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f4039a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f4043e;
            if (executor2 == null && this.f4044f == null) {
                Executor executorF = j.c.f();
                this.f4044f = executorF;
                this.f4043e = executorF;
            } else if (executor2 != null && this.f4044f == null) {
                this.f4044f = executor2;
            } else if (executor2 == null && (executor = this.f4044f) != null) {
                this.f4043e = executor;
            }
            Set<Integer> set = this.f4053o;
            if (set != null && this.f4052n != null) {
                for (Integer num : set) {
                    if (this.f4052n.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.f4045g == null) {
                this.f4045g = new v1.c();
            }
            String str = this.f4054p;
            if (str != null || this.f4055q != null) {
                if (this.f4040b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.f4055q != null) {
                    throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.f4045g = new q1.f(str, this.f4055q, this.f4045g);
            }
            Context context = this.f4041c;
            androidx.room.a aVar = new androidx.room.a(context, this.f4040b, this.f4045g, this.f4051m, this.f4042d, this.f4046h, this.f4047i.b(context), this.f4043e, this.f4044f, this.f4048j, this.f4049k, this.f4050l, this.f4052n, this.f4054p, this.f4055q);
            RoomDatabase roomDatabase = (RoomDatabase) f.b(this.f4039a, "_Impl");
            roomDatabase.l(aVar);
            return roomDatabase;
        }

        public a e() {
            this.f4049k = false;
            this.f4050l = true;
            return this;
        }

        public a f(c.InterfaceC0488c interfaceC0488c) {
            this.f4045g = interfaceC0488c;
            return this;
        }

        public a g(Executor executor) {
            this.f4043e = executor;
            return this;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public HashMap f4056a = new HashMap();

        public final void a(r1.a aVar) {
            int i10 = aVar.f24139a;
            int i11 = aVar.f24140b;
            TreeMap treeMap = (TreeMap) this.f4056a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f4056a.put(Integer.valueOf(i10), treeMap);
            }
            r1.a aVar2 = (r1.a) treeMap.get(Integer.valueOf(i11));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }

        public void b(r1.a... aVarArr) {
            for (r1.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        
            return r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List d(java.util.List r6, boolean r7, int r8, int r9) {
            /*
                r5 = this;
            L0:
                if (r7 == 0) goto L5
                if (r8 >= r9) goto L52
                goto L7
            L5:
                if (r8 <= r9) goto L52
            L7:
                java.util.HashMap r0 = r5.f4056a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r7 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4a
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r4 = r3.intValue()
                if (r7 == 0) goto L3d
                if (r4 > r9) goto L26
                if (r4 <= r8) goto L26
                goto L41
            L3d:
                if (r4 < r9) goto L26
                if (r4 >= r8) goto L26
            L41:
                java.lang.Object r8 = r0.get(r3)
                r6.add(r8)
                r8 = 1
                goto L4d
            L4a:
                r0 = 0
                r4 = r8
                r8 = r0
            L4d:
                if (r8 != 0) goto L50
                return r1
            L50:
                r8 = r4
                goto L0
            L52:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.c.d(java.util.List, boolean, int, int):java.util.List");
        }
    }

    public static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f4029f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f4033j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void c() {
        a();
        u1.b writableDatabase = this.f4027d.getWritableDatabase();
        this.f4028e.m(writableDatabase);
        writableDatabase.u();
    }

    public u1.f d(String str) {
        a();
        b();
        return this.f4027d.getWritableDatabase().J(str);
    }

    public abstract d e();

    public abstract u1.c f(androidx.room.a aVar);

    public void g() {
        this.f4027d.getWritableDatabase().E();
        if (k()) {
            return;
        }
        this.f4028e.f();
    }

    public Lock h() {
        return this.f4032i.readLock();
    }

    public u1.c i() {
        return this.f4027d;
    }

    public Executor j() {
        return this.f4025b;
    }

    public boolean k() {
        return this.f4027d.getWritableDatabase().S();
    }

    public void l(androidx.room.a aVar) {
        u1.c cVarF = f(aVar);
        this.f4027d = cVarF;
        if (cVarF instanceof q1.e) {
            ((q1.e) cVarF).b(aVar);
        }
        boolean z10 = aVar.f4063g == JournalMode.WRITE_AHEAD_LOGGING;
        this.f4027d.setWriteAheadLoggingEnabled(z10);
        this.f4031h = aVar.f4061e;
        this.f4025b = aVar.f4064h;
        this.f4026c = new h(aVar.f4065i);
        this.f4029f = aVar.f4062f;
        this.f4030g = z10;
        if (aVar.f4066j) {
            this.f4028e.i(aVar.f4058b, aVar.f4059c);
        }
    }

    public void m(u1.b bVar) {
        this.f4028e.d(bVar);
    }

    public boolean o() {
        u1.b bVar = this.f4024a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(u1.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(u1.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.f4027d.getWritableDatabase().T(eVar, cancellationSignal) : this.f4027d.getWritableDatabase().M(eVar);
    }

    public void r() {
        this.f4027d.getWritableDatabase().B();
    }

    public static abstract class b {
        public void a(u1.b bVar) {
        }

        public void b(u1.b bVar) {
        }

        public void c(u1.b bVar) {
        }
    }
}
