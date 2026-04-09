package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fj0 {

    /* renamed from: c, reason: collision with root package name */
    public final d91 f11184c;

    /* renamed from: f, reason: collision with root package name */
    public oj0 f11187f;

    /* renamed from: h, reason: collision with root package name */
    public final String f11188h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11189i;
    public final nj0 j;

    /* renamed from: k, reason: collision with root package name */
    public wp0 f11190k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11182a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11183b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11185d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f11186e = new HashSet();
    public int g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11191l = false;

    public fj0(dq0 dq0Var, nj0 nj0Var, d91 d91Var) {
        this.f11189i = ((yp0) dq0Var.f10544b.f9452c).f18834r;
        this.j = nj0Var;
        this.f11184c = d91Var;
        this.f11188h = rj0.a(dq0Var);
        List list = (List) dq0Var.f10544b.f9451b;
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f11182a.put((wp0) list.get(i4), Integer.valueOf(i4));
        }
        this.f11183b.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2.f18113v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r6.f11191l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r6.f11185d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.wp0) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.wp0 a() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.e()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L43
            r0 = 0
        L8:
            java.util.ArrayList r1 = r6.f11183b     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2b
            if (r0 >= r2) goto L43
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.wp0 r2 = (com.google.android.gms.internal.ads.wp0) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.f18109t0     // Catch: java.lang.Throwable -> L2b
            java.util.HashSet r4 = r6.f11186e     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L23
            int r0 = r0 + 1
            goto L8
        L23:
            boolean r5 = r2.f18113v0     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2d
            r5 = 1
            r6.f11191l = r5     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L46
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L2b
        L36:
            java.util.ArrayList r3 = r6.f11185d     // Catch: java.lang.Throwable -> L2b
            r3.add(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.wp0 r0 = (com.google.android.gms.internal.ads.wp0) r0     // Catch: java.lang.Throwable -> L2b
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fj0.a():com.google.android.gms.internal.ads.wp0");
    }

    public final synchronized void b(oj0 oj0Var, wp0 wp0Var) {
        this.f11191l = false;
        this.f11185d.remove(wp0Var);
        if (d()) {
            oj0Var.F1();
            return;
        }
        Integer num = (Integer) this.f11182a.get(wp0Var);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.g) {
            this.j.e(wp0Var);
            return;
        }
        if (this.f11187f != null) {
            this.j.e(this.f11190k);
        }
        this.g = iIntValue;
        this.f11187f = oj0Var;
        this.f11190k = wp0Var;
        if (h()) {
            return;
        }
        i();
    }

    public final synchronized void c(wp0 wp0Var) {
        this.f11191l = false;
        this.f11185d.remove(wp0Var);
        this.f11186e.remove(wp0Var.f18109t0);
        if (d() || h()) {
            return;
        }
        i();
    }

    public final synchronized boolean d() {
        return this.f11184c.isDone();
    }

    public final synchronized boolean e() {
        if (this.f11191l) {
            return false;
        }
        ArrayList arrayList = this.f11183b;
        if (!arrayList.isEmpty() && ((wp0) arrayList.get(0)).f18113v0 && !this.f11185d.isEmpty()) {
            return false;
        }
        if (!d()) {
            ArrayList arrayList2 = this.f11185d;
            if (arrayList2.size() < this.f11189i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized boolean f(boolean z3) {
        try {
            ArrayList arrayList = this.f11183b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                wp0 wp0Var = (wp0) obj;
                Integer num = (Integer) this.f11182a.get(wp0Var);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z3 || !this.f11186e.contains(wp0Var.f18109t0)) {
                    int i10 = this.g;
                    if (iIntValue < i10) {
                        return true;
                    }
                    if (iIntValue > i10) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean g() {
        try {
            ArrayList arrayList = this.f11185d;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                Integer num = (Integer) this.f11182a.get((wp0) obj);
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean h() {
        if (!f(true)) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void i() {
        this.j.c(this.f11190k);
        oj0 oj0Var = this.f11187f;
        if (oj0Var != null) {
            this.f11184c.e(oj0Var);
        } else {
            this.f11184c.f(new qj0(3, this.f11188h));
        }
    }
}
