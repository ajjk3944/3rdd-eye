package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import p.AbstractC7176d;
import p.C7174b;
import p.C7175c;

/* renamed from: o.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7030v {

    /* renamed from: a, reason: collision with root package name */
    private int f55009a;

    /* renamed from: b, reason: collision with root package name */
    private final C7175c f55010b;

    /* renamed from: c, reason: collision with root package name */
    private final C7174b f55011c;

    /* renamed from: d, reason: collision with root package name */
    private int f55012d;

    /* renamed from: e, reason: collision with root package name */
    private int f55013e;

    /* renamed from: f, reason: collision with root package name */
    private int f55014f;

    /* renamed from: g, reason: collision with root package name */
    private int f55015g;

    /* renamed from: h, reason: collision with root package name */
    private int f55016h;

    /* renamed from: i, reason: collision with root package name */
    private int f55017i;

    public C7030v(int i10) {
        this.f55009a = i10;
        if (!(i10 > 0)) {
            AbstractC7176d.a("maxSize <= 0");
        }
        this.f55010b = new C7175c(0, 0.75f);
        this.f55011c = new C7174b();
    }

    private final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (!(iG >= 0)) {
            AbstractC7176d.b("Negative size: " + obj + '=' + obj2);
        }
        return iG;
    }

    protected Object a(Object key) {
        AbstractC6492s.i(key, "key");
        return null;
    }

    protected void b(boolean z10, Object key, Object oldValue, Object obj) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(oldValue, "oldValue");
    }

    public final Object c(Object key) {
        Object objD;
        AbstractC6492s.i(key, "key");
        synchronized (this.f55011c) {
            Object objA = this.f55010b.a(key);
            if (objA != null) {
                this.f55016h++;
                return objA;
            }
            this.f55017i++;
            Object objA2 = a(key);
            if (objA2 == null) {
                return null;
            }
            synchronized (this.f55011c) {
                try {
                    this.f55014f++;
                    objD = this.f55010b.d(key, objA2);
                    if (objD != null) {
                        this.f55010b.d(key, objD);
                    } else {
                        this.f55012d += f(key, objA2);
                        Yg.J j10 = Yg.J.f24997a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objD != null) {
                b(false, key, objA2, objD);
                return objD;
            }
            i(this.f55009a);
            return objA2;
        }
    }

    public final Object d(Object key, Object value) {
        Object objD;
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        synchronized (this.f55011c) {
            try {
                this.f55013e++;
                this.f55012d += f(key, value);
                objD = this.f55010b.d(key, value);
                if (objD != null) {
                    this.f55012d -= f(key, objD);
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objD != null) {
            b(false, key, objD, value);
        }
        i(this.f55009a);
        return objD;
    }

    public final Object e(Object key) {
        Object objE;
        AbstractC6492s.i(key, "key");
        synchronized (this.f55011c) {
            try {
                objE = this.f55010b.e(key);
                if (objE != null) {
                    this.f55012d -= f(key, objE);
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objE != null) {
            b(false, key, objE, null);
        }
        return objE;
    }

    protected int g(Object key, Object value) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        return 1;
    }

    public final Map h() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f55011c) {
            linkedHashMap = new LinkedHashMap(this.f55010b.b().size());
            for (Map.Entry entry : this.f55010b.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(int r7) {
        /*
            r6 = this;
        L0:
            p.b r0 = r6.f55011c
            monitor-enter(r0)
            int r1 = r6.f55012d     // Catch: java.lang.Throwable -> L15
            r2 = 1
            if (r1 < 0) goto L19
            p.c r1 = r6.f55010b     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            int r1 = r6.f55012d     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L19
            goto L17
        L15:
            r7 = move-exception
            goto L63
        L17:
            r1 = r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L21
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            p.AbstractC7176d.b(r1)     // Catch: java.lang.Throwable -> L15
        L21:
            int r1 = r6.f55012d     // Catch: java.lang.Throwable -> L15
            if (r1 <= r7) goto L61
            p.c r1 = r6.f55010b     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L2e
            goto L61
        L2e:
            p.c r1 = r6.f55010b     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L15
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = Zg.AbstractC3689v.r0(r1)     // Catch: java.lang.Throwable -> L15
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
            p.c r4 = r6.f55010b     // Catch: java.lang.Throwable -> L15
            r4.e(r3)     // Catch: java.lang.Throwable -> L15
            int r4 = r6.f55012d     // Catch: java.lang.Throwable -> L15
            int r5 = r6.f(r3, r1)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r5
            r6.f55012d = r4     // Catch: java.lang.Throwable -> L15
            int r4 = r6.f55015g     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + r2
            r6.f55015g = r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            r0 = 0
            r6.b(r2, r3, r1, r0)
            goto L0
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7030v.i(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f55011c) {
            try {
                int i10 = this.f55016h;
                int i11 = this.f55017i + i10;
                str = "LruCache[maxSize=" + this.f55009a + ",hits=" + this.f55016h + ",misses=" + this.f55017i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
