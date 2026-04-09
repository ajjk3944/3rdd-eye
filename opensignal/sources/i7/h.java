package i7;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.b4;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase_Impl;
import io.sentry.android.core.e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import mq.b0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f11251m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final OpensignalDatabase_Impl f11252a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11253b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f11254c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f11255d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f11256e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f11257f;

    /* renamed from: g, reason: collision with root package name */
    public volatile o7.e f11258g;

    /* renamed from: h, reason: collision with root package name */
    public final d8.a f11259h;

    /* renamed from: i, reason: collision with root package name */
    public final r.f f11260i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final b4.e f11261l;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public h(OpensignalDatabase_Impl opensignalDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f11252a = opensignalDatabase_Impl;
        this.f11253b = map;
        int length = strArr.length;
        d8.a aVar = new d8.a();
        aVar.f7149c = new long[length];
        aVar.f7147a = new boolean[length];
        aVar.f7150d = new int[length];
        this.f11259h = aVar;
        br.l.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f11260i = new r.f();
        this.j = new Object();
        this.k = new Object();
        this.f11254c = new LinkedHashMap();
        int length2 = strArr.length;
        String[] strArr2 = new String[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            br.l.d(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            br.l.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f11254c.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f11253b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                br.l.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i10] = lowerCase2;
        }
        this.f11255d = strArr2;
        for (Map.Entry entry : this.f11253b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            br.l.d(locale2, "US");
            String lowerCase3 = str3.toLowerCase(locale2);
            br.l.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f11254c.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                br.l.d(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f11254c;
                linkedHashMap.put(lowerCase4, b0.O(linkedHashMap, lowerCase3));
            }
        }
        this.f11261l = new b4.e(10, this);
    }

    public final boolean a() {
        p7.b bVar = this.f11252a.f6075a;
        if (bVar == null || !bVar.f20316a.isOpen()) {
            return false;
        }
        if (!this.f11257f) {
            this.f11252a.g().I();
        }
        if (this.f11257f) {
            return true;
        }
        e0.d("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(o7.a aVar, int i10) {
        aVar.l("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f11255d[i10];
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = f11251m[i11];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + b4.I(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            br.l.d(str3, "StringBuilder().apply(builderAction).toString()");
            aVar.l(str3);
        }
    }

    public final void c(o7.a aVar) {
        br.l.e(aVar, "database");
        if (aVar.X()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f11252a.f6081g.readLock();
            br.l.d(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.j) {
                    int[] iArrG = this.f11259h.g();
                    if (iArrG != null) {
                        if (aVar.c0()) {
                            aVar.E();
                        } else {
                            aVar.j();
                        }
                        try {
                            int length = iArrG.length;
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < length) {
                                int i12 = iArrG[i10];
                                int i13 = i11 + 1;
                                if (i12 == 1) {
                                    b(aVar, i11);
                                } else if (i12 == 2) {
                                    String str = this.f11255d[i11];
                                    String[] strArr = f11251m;
                                    for (int i14 = 0; i14 < 3; i14++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + b4.I(str, strArr[i14]);
                                        br.l.d(str2, "StringBuilder().apply(builderAction).toString()");
                                        aVar.l(str2);
                                    }
                                }
                                i10++;
                                i11 = i13;
                            }
                            aVar.C();
                            aVar.K();
                        } catch (Throwable th2) {
                            aVar.K();
                            throw th2;
                        }
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException e4) {
            e0.c("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
        } catch (IllegalStateException e10) {
            e0.c("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
