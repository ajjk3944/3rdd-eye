package C0;

import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import e5.C2313i;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f1054o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final p f1055a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1056b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1057c;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f1059e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f1061g;

    /* renamed from: h, reason: collision with root package name */
    public volatile H0.j f1062h;
    public final A1.s i;

    /* renamed from: j, reason: collision with root package name */
    public final V2.h f1063j;

    /* renamed from: n, reason: collision with root package name */
    public final k f1067n;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f1060f = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final q.f f1064k = new q.f();

    /* renamed from: l, reason: collision with root package name */
    public final Object f1065l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final Object f1066m = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1058d = new LinkedHashMap();

    public l(p pVar, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.f1055a = pVar;
        this.f1056b = map;
        this.f1057c = map2;
        this.i = new A1.s(strArr.length);
        this.f1063j = new V2.h(pVar);
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            q5.i.d(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            q5.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f1058d.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f1056b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                q5.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f1059e = strArr2;
        for (Map.Entry entry : this.f1056b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            q5.i.d(locale2, "US");
            String lowerCase3 = str3.toLowerCase(locale2);
            q5.i.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f1058d.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                q5.i.d(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f1058d;
                q5.i.e(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase3);
                if (obj == null && !linkedHashMap.containsKey(lowerCase3)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase3) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase4, obj);
            }
        }
        this.f1067n = new k(0, this);
    }

    public final w a(String[] strArr, Callable callable) {
        String[] strArrC = c(strArr);
        for (String str : strArrC) {
            Locale locale = Locale.US;
            q5.i.d(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            q5.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!this.f1058d.containsKey(lowerCase)) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        V2.h hVar = this.f1063j;
        hVar.getClass();
        return new w((p) hVar.f3875b, hVar, callable, strArrC);
    }

    public final boolean b() {
        H0.c cVar = this.f1055a.f1087a;
        if (cVar == null || !cVar.isOpen()) {
            return false;
        }
        if (!this.f1061g) {
            this.f1055a.g().i();
        }
        if (this.f1061g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final String[] c(String[] strArr) {
        C2313i c2313i = new C2313i();
        for (String str : strArr) {
            Locale locale = Locale.US;
            q5.i.d(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            q5.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            HashMap map = this.f1057c;
            if (map.containsKey(lowerCase)) {
                String lowerCase2 = str.toLowerCase(locale);
                q5.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map.get(lowerCase2);
                q5.i.b(obj);
                c2313i.addAll((Collection) obj);
            } else {
                c2313i.add(str);
            }
        }
        return (String[]) d5.y.b(c2313i).toArray(new String[0]);
    }

    public final void d(H0.c cVar, int i) throws SQLException {
        cVar.h("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f1059e[i];
        for (int i3 = 0; i3 < 3; i3++) {
            String str2 = f1054o[i3];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + a4.p.k(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            q5.i.d(str3, "StringBuilder().apply(builderAction).toString()");
            cVar.h(str3);
        }
    }

    public final void e(H0.c cVar) {
        q5.i.e(cVar, "database");
        if (cVar.m()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f1055a.f1094h.readLock();
            q5.i.d(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.f1065l) {
                    int[] iArrF = this.i.f();
                    if (iArrF != null) {
                        if (cVar.n()) {
                            cVar.b();
                        } else {
                            cVar.a();
                        }
                        try {
                            int length = iArrF.length;
                            int i = 0;
                            int i3 = 0;
                            while (i < length) {
                                int i6 = iArrF[i];
                                int i7 = i3 + 1;
                                if (i6 == 1) {
                                    d(cVar, i3);
                                } else if (i6 == 2) {
                                    String str = this.f1059e[i3];
                                    String[] strArr = f1054o;
                                    for (int i8 = 0; i8 < 3; i8++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + a4.p.k(str, strArr[i8]);
                                        q5.i.d(str2, "StringBuilder().apply(builderAction).toString()");
                                        cVar.h(str2);
                                    }
                                }
                                i++;
                                i3 = i7;
                            }
                            cVar.q();
                            cVar.e();
                        } catch (Throwable th) {
                            cVar.e();
                            throw th;
                        }
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException e6) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
        } catch (IllegalStateException e7) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
        }
    }
}
