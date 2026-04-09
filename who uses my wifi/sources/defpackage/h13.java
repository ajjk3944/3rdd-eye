package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h13 {
    public final wq3 c;
    public p13 f;
    public final String h;
    public final int i;
    public final o13 j;
    public a83 k;
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public int g = Integer.MAX_VALUE;
    public boolean l = false;

    public h13(h83 h83Var, o13 o13Var, wq3 wq3Var) {
        this.i = ((c83) h83Var.b.g).r;
        this.j = o13Var;
        this.c = wq3Var;
        this.h = s13.a(h83Var);
        List list = (List) h83Var.b.f;
        for (int i = 0; i < list.size(); i++) {
            this.a.put((a83) list.get(i), Integer.valueOf(i));
        }
        this.b.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2.v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r6.l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r6.d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return (defpackage.a83) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.a83 a() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.d()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L43
            r0 = 0
        L8:
            java.util.ArrayList r1 = r6.b     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2b
            if (r0 >= r2) goto L43
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L2b
            a83 r2 = (defpackage.a83) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.t0     // Catch: java.lang.Throwable -> L2b
            java.util.HashSet r4 = r6.e     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L23
            int r0 = r0 + 1
            goto L8
        L23:
            boolean r5 = r2.v0     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2d
            r5 = 1
            r6.l = r5     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L46
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L2b
        L36:
            java.util.ArrayList r3 = r6.d     // Catch: java.lang.Throwable -> L2b
            r3.add(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L2b
            a83 r0 = (defpackage.a83) r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r0
        L43:
            monitor-exit(r6)
            r0 = 0
            return r0
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h13.a():a83");
    }

    public final synchronized void b(p13 p13Var, a83 a83Var) {
        boolean z;
        z = false;
        this.l = false;
        this.d.remove(a83Var);
        synchronized (this) {
        }
        if (this.c.isDone()) {
            p13Var.n();
            return;
        }
        Integer num = (Integer) this.a.get(a83Var);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.g) {
            this.j.c(a83Var);
            return;
        }
        if (this.f != null) {
            this.j.c(this.k);
        }
        this.g = iIntValue;
        this.f = p13Var;
        this.k = a83Var;
        synchronized (this) {
            if (e(true)) {
                z = true;
                break;
            }
            synchronized (this) {
                try {
                    ArrayList arrayList = this.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        Integer num2 = (Integer) this.a.get((a83) obj);
                        if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) < this.g) {
                            z = true;
                            break;
                        }
                    }
                } finally {
                }
            }
            if (z) {
                return;
            }
            f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0057 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0002, B:5:0x0010, B:7:0x0017, B:9:0x001a, B:27:0x004f, B:34:0x0057, B:31:0x0053, B:41:0x0060, B:46:0x0065, B:6:0x0011, B:11:0x001c, B:13:0x0022, B:24:0x004c, B:26:0x004e, B:30:0x0052), top: B:53:0x0002, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(defpackage.a83 r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r6.l = r0     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r1 = r6.d     // Catch: java.lang.Throwable -> L5c
            r1.remove(r7)     // Catch: java.lang.Throwable -> L5c
            java.util.HashSet r1 = r6.e     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r7.t0     // Catch: java.lang.Throwable -> L5c
            r1.remove(r7)     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5c
            wq3 r7 = r6.c     // Catch: java.lang.Throwable -> L63
            boolean r7 = r7.isDone()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            if (r7 != 0) goto L61
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5c
            r7 = 1
            boolean r1 = r6.e(r7)     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L53
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r1 = r6.d     // Catch: java.lang.Throwable -> L43
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L43
            r3 = r0
        L2a:
            if (r3 >= r2) goto L4e
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L43
            int r3 = r3 + 1
            a83 r4 = (defpackage.a83) r4     // Catch: java.lang.Throwable -> L43
            java.util.HashMap r5 = r6.a     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L45
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L43
            goto L48
        L43:
            r7 = move-exception
            goto L51
        L45:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L48:
            int r5 = r6.g     // Catch: java.lang.Throwable -> L43
            if (r4 >= r5) goto L2a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5e
            goto L53
        L4e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            goto L55
        L51:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L43
            throw r7     // Catch: java.lang.Throwable -> L5e
        L53:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            r0 = r7
        L55:
            if (r0 != 0) goto L61
            r6.f()     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r6)
            return
        L5c:
            r7 = move-exception
            goto L66
        L5e:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5e
            throw r7     // Catch: java.lang.Throwable -> L5c
        L61:
            monitor-exit(r6)
            return
        L63:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            throw r7     // Catch: java.lang.Throwable -> L5c
        L66:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h13.c(a83):void");
    }

    public final synchronized boolean d() {
        if (this.l) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty() && ((a83) arrayList.get(0)).v0 && !this.d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.c.isDone()) {
                ArrayList arrayList2 = this.d;
                if (arrayList2.size() < this.i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean e(boolean z) {
        try {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                a83 a83Var = (a83) obj;
                Integer num = (Integer) this.a.get(a83Var);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z || !this.e.contains(a83Var.t0)) {
                    int i2 = this.g;
                    if (iIntValue < i2) {
                        return true;
                    }
                    if (iIntValue > i2) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f() {
        o13 o13Var = this.j;
        a83 a83Var = this.k;
        synchronized (o13Var) {
            try {
                o13Var.a.getClass();
                o13Var.h = SystemClock.elapsedRealtime() - o13Var.i;
                if (a83Var != null) {
                    o13Var.f.a(a83Var);
                }
                o13Var.g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        p13 p13Var = this.f;
        if (p13Var != null) {
            this.c.d(p13Var);
        } else {
            this.c.e(new r13(this.h, 3));
        }
    }
}
