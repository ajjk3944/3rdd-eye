package P0;

import T0.q;
import T0.r;
import Yg.J;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final r f17996a = q.a();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f17997b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f17998c;

    /* renamed from: d, reason: collision with root package name */
    private int f17999d;

    /* renamed from: e, reason: collision with root package name */
    private int f18000e;

    /* renamed from: f, reason: collision with root package name */
    private int f18001f;

    /* renamed from: g, reason: collision with root package name */
    private int f18002g;

    /* renamed from: h, reason: collision with root package name */
    private int f18003h;

    /* renamed from: i, reason: collision with root package name */
    private int f18004i;

    /* renamed from: j, reason: collision with root package name */
    private int f18005j;

    public b(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f18000e = i10;
        this.f17997b = new HashMap(0, 0.75f);
        this.f17998c = new LinkedHashSet();
    }

    private final int g(Object obj, Object obj2) {
        int i10 = i(obj, obj2);
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object b(Object obj) {
        return null;
    }

    protected void c(boolean z10, Object obj, Object obj2, Object obj3) {
    }

    public final Object d(Object obj) {
        synchronized (this.f17996a) {
            Object obj2 = this.f17997b.get(obj);
            if (obj2 != null) {
                this.f17998c.remove(obj);
                this.f17998c.add(obj);
                this.f18004i++;
                return obj2;
            }
            this.f18005j++;
            Object objB = b(obj);
            if (objB == null) {
                return null;
            }
            synchronized (this.f17996a) {
                try {
                    this.f18002g++;
                    Object objPut = this.f17997b.put(obj, objB);
                    this.f17998c.remove(obj);
                    this.f17998c.add(obj);
                    if (objPut != null) {
                        this.f17997b.put(obj, objPut);
                        obj2 = objPut;
                    } else {
                        this.f17999d = h() + g(obj, objB);
                    }
                    J j10 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (obj2 != null) {
                c(false, obj, objB, obj2);
                return obj2;
            }
            j(this.f18000e);
            return objB;
        }
    }

    public final Object e(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f17996a) {
            try {
                this.f18001f++;
                this.f17999d = h() + g(obj, obj2);
                objPut = this.f17997b.put(obj, obj2);
                if (objPut != null) {
                    this.f17999d = h() - g(obj, objPut);
                }
                if (this.f17998c.contains(obj)) {
                    this.f17998c.remove(obj);
                }
                this.f17998c.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objPut != null) {
            c(false, obj, objPut, obj2);
        }
        j(this.f18000e);
        return objPut;
    }

    public final Object f(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.f17996a) {
            try {
                objRemove = this.f17997b.remove(obj);
                this.f17998c.remove(obj);
                if (objRemove != null) {
                    this.f17999d = h() - g(obj, objRemove);
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objRemove != null) {
            c(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public final int h() {
        int i10;
        synchronized (this.f17996a) {
            i10 = this.f17999d;
        }
        return i10;
    }

    protected int i(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(int r8) {
        /*
            r7 = this;
        L0:
            T0.r r0 = r7.f17996a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap r1 = r7.f17997b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r8 = move-exception
            goto L95
        L1b:
            java.util.HashMap r1 = r7.f17997b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r2 = r7.f17998c     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap r1 = r7.f17997b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet r1 = r7.f17998c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = Zg.AbstractC3689v.p0(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap r4 = r7.f17997b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap r5 = r7.f17997b     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = kotlin.jvm.internal.V.d(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r5 = r7.f17998c     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = kotlin.jvm.internal.V.a(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.h()     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.AbstractC6492s.f(r1)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.AbstractC6492s.f(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.g(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.f17999d = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.f18003h     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.f18003h = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            Yg.J r5 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            kotlin.jvm.internal.AbstractC6492s.f(r1)
            kotlin.jvm.internal.AbstractC6492s.f(r4)
            r7.c(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.b.j(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f17996a) {
            try {
                int i10 = this.f18004i;
                int i11 = this.f18005j + i10;
                str = "LruCache[maxSize=" + this.f18000e + ",hits=" + this.f18004i + ",misses=" + this.f18005j + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
