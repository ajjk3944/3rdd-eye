package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public class d {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f4074m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4076b;

    /* renamed from: c, reason: collision with root package name */
    public Map f4077c;

    /* renamed from: d, reason: collision with root package name */
    public final RoomDatabase f4078d;

    /* renamed from: g, reason: collision with root package name */
    public volatile u1.f f4081g;

    /* renamed from: h, reason: collision with root package name */
    public b f4082h;

    /* renamed from: i, reason: collision with root package name */
    public final q1.b f4083i;

    /* renamed from: k, reason: collision with root package name */
    public e f4085k;

    /* renamed from: e, reason: collision with root package name */
    public AtomicBoolean f4079e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4080f = false;

    /* renamed from: j, reason: collision with root package name */
    public final k.b f4084j = new k.b();

    /* renamed from: l, reason: collision with root package name */
    public Runnable f4086l = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4075a = new HashMap();

    public class a implements Runnable {
        public a() {
        }

        public final Set a() {
            HashSet hashSet = new HashSet();
            Cursor cursorP = d.this.f4078d.p(new u1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorP.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorP.getInt(0)));
                } catch (Throwable th) {
                    cursorP.close();
                    throw th;
                }
            }
            cursorP.close();
            if (!hashSet.isEmpty()) {
                d.this.f4081g.z();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.d r0 = androidx.room.d.this
                androidx.room.RoomDatabase r0 = r0.f4078d
                java.util.concurrent.locks.Lock r0 = r0.h()
                r1 = 0
                r0.lock()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.d r2 = androidx.room.d.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 != 0) goto L18
                r0.unlock()
                return
            L18:
                androidx.room.d r2 = androidx.room.d.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f4079e     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 != 0) goto L28
                r0.unlock()
                return
            L28:
                androidx.room.d r2 = androidx.room.d.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.RoomDatabase r2 = r2.f4078d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r2 = r2.k()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r2 == 0) goto L36
                r0.unlock()
                return
            L36:
                androidx.room.d r2 = androidx.room.d.this     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                androidx.room.RoomDatabase r2 = r2.f4078d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                boolean r3 = r2.f4030g     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                if (r3 == 0) goto L5f
                u1.c r2 = r2.i()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                u1.b r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                r2.u()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L5a
                r2.B()     // Catch: java.lang.Throwable -> L5a
                r2.E()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                goto L63
            L54:
                r1 = move-exception
                goto La1
            L56:
                r2 = move-exception
                goto L67
            L58:
                r2 = move-exception
                goto L67
            L5a:
                r3 = move-exception
                r2.E()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
                throw r3     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
            L5f:
                java.util.Set r1 = r5.a()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56 java.lang.IllegalStateException -> L58
            L63:
                r0.unlock()
                goto L6f
            L67:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L54
                goto L63
            L6f:
                if (r1 == 0) goto La0
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto La0
                androidx.room.d r0 = androidx.room.d.this
                k.b r0 = r0.f4084j
                monitor-enter(r0)
                androidx.room.d r2 = androidx.room.d.this     // Catch: java.lang.Throwable -> L9a
                k.b r2 = r2.f4084j     // Catch: java.lang.Throwable -> L9a
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9a
            L84:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9a
                if (r3 == 0) goto L9c
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9a
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L9a
                androidx.room.d$d r3 = (androidx.room.d.C0043d) r3     // Catch: java.lang.Throwable -> L9a
                r3.a(r1)     // Catch: java.lang.Throwable -> L9a
                goto L84
            L9a:
                r1 = move-exception
                goto L9e
            L9c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
                goto La0
            L9e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
                throw r1
            La0:
                return
            La1:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.d.a.run():void");
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f4088a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f4089b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f4090c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4091d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4092e;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f4088a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f4089b = zArr;
            this.f4090c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                try {
                    if (this.f4091d && !this.f4092e) {
                        int length = this.f4088a.length;
                        int i10 = 0;
                        while (true) {
                            int i11 = 1;
                            if (i10 >= length) {
                                this.f4092e = true;
                                this.f4091d = false;
                                return this.f4090c;
                            }
                            boolean z10 = this.f4088a[i10] > 0;
                            boolean[] zArr = this.f4089b;
                            if (z10 != zArr[i10]) {
                                int[] iArr = this.f4090c;
                                if (!z10) {
                                    i11 = 2;
                                }
                                iArr[i10] = i11;
                            } else {
                                this.f4090c[i10] = 0;
                            }
                            zArr[i10] = z10;
                            i10++;
                        }
                    }
                    return null;
                } finally {
                }
            }
        }

        public boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f4088a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            z10 = true;
                            this.f4091d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }

        public boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f4088a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            this.f4091d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }

        public void d() {
            synchronized (this) {
                this.f4092e = false;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f4093a;

        public c(String[] strArr) {
            this.f4093a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract boolean a();

        public abstract void b(Set set);
    }

    /* renamed from: androidx.room.d$d, reason: collision with other inner class name */
    public static class C0043d {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f4094a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f4095b;

        /* renamed from: c, reason: collision with root package name */
        public final c f4096c;

        /* renamed from: d, reason: collision with root package name */
        public final Set f4097d;

        public C0043d(c cVar, int[] iArr, String[] strArr) {
            this.f4096c = cVar;
            this.f4094a = iArr;
            this.f4095b = strArr;
            if (iArr.length != 1) {
                this.f4097d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f4097d = Collections.unmodifiableSet(hashSet);
        }

        public void a(Set set) {
            int length = this.f4094a.length;
            Set hashSet = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f4094a[i10]))) {
                    if (length == 1) {
                        hashSet = this.f4097d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet(length);
                        }
                        hashSet.add(this.f4095b[i10]);
                    }
                }
            }
            if (hashSet != null) {
                this.f4096c.b(hashSet);
            }
        }

        public void b(String[] strArr) {
            Set set = null;
            if (this.f4095b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (strArr[i10].equalsIgnoreCase(this.f4095b[0])) {
                        set = this.f4097d;
                        break;
                    }
                    i10++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4095b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            String str2 = strArr2[i11];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4096c.b(set);
            }
        }
    }

    public d(RoomDatabase roomDatabase, Map map, Map map2, String... strArr) {
        this.f4078d = roomDatabase;
        this.f4082h = new b(strArr.length);
        this.f4077c = map2;
        this.f4083i = new q1.b(roomDatabase);
        int length = strArr.length;
        this.f4076b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4075a.put(lowerCase, Integer.valueOf(i10));
            String str2 = (String) map.get(strArr[i10]);
            if (str2 != null) {
                this.f4076b[i10] = str2.toLowerCase(locale);
            } else {
                this.f4076b[i10] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f4075a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f4075a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    public void a(c cVar) {
        C0043d c0043d;
        String[] strArrH = h(cVar.f4093a);
        int[] iArr = new int[strArrH.length];
        int length = strArrH.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = (Integer) this.f4075a.get(strArrH[i10].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrH[i10]);
            }
            iArr[i10] = num.intValue();
        }
        C0043d c0043d2 = new C0043d(cVar, iArr, strArrH);
        synchronized (this.f4084j) {
            c0043d = (C0043d) this.f4084j.g(cVar, c0043d2);
        }
        if (c0043d == null && this.f4082h.b(iArr)) {
            l();
        }
    }

    public boolean c() {
        if (!this.f4078d.o()) {
            return false;
        }
        if (!this.f4080f) {
            this.f4078d.i().getWritableDatabase();
        }
        if (this.f4080f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public void d(u1.b bVar) {
        synchronized (this) {
            try {
                if (this.f4080f) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    return;
                }
                bVar.y("PRAGMA temp_store = MEMORY;");
                bVar.y("PRAGMA recursive_triggers='ON';");
                bVar.y("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                m(bVar);
                this.f4081g = bVar.J("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f4080f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String... strArr) {
        synchronized (this.f4084j) {
            try {
                Iterator it = this.f4084j.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!((c) entry.getKey()).a()) {
                        ((C0043d) entry.getValue()).b(strArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        if (this.f4079e.compareAndSet(false, true)) {
            this.f4078d.j().execute(this.f4086l);
        }
    }

    public void g(c cVar) {
        C0043d c0043d;
        synchronized (this.f4084j) {
            c0043d = (C0043d) this.f4084j.h(cVar);
        }
        if (c0043d == null || !this.f4082h.c(c0043d.f4094a)) {
            return;
        }
        l();
    }

    public final String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4077c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.f4077c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void i(Context context, String str) {
        this.f4085k = new e(context, str, this, this.f4078d.j());
    }

    public final void j(u1.b bVar, int i10) {
        bVar.y("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f4076b[i10];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4074m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i10);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.y(sb.toString());
        }
    }

    public final void k(u1.b bVar, int i10) {
        String str = this.f4076b[i10];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4074m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            bVar.y(sb.toString());
        }
    }

    public void l() {
        if (this.f4078d.o()) {
            m(this.f4078d.i().getWritableDatabase());
        }
    }

    public void m(u1.b bVar) {
        if (bVar.S()) {
            return;
        }
        while (true) {
            try {
                Lock lockH = this.f4078d.h();
                lockH.lock();
                try {
                    int[] iArrA = this.f4082h.a();
                    if (iArrA == null) {
                        return;
                    }
                    int length = iArrA.length;
                    bVar.u();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArrA[i10];
                            if (i11 == 1) {
                                j(bVar, i10);
                            } else if (i11 == 2) {
                                k(bVar, i10);
                            }
                        } finally {
                        }
                    }
                    bVar.B();
                    bVar.E();
                    this.f4082h.d();
                } finally {
                    lockH.unlock();
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}
