package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Jq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583Jq {

    /* renamed from: c, reason: collision with root package name */
    public final PD f9375c;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0719Rq f9378f;

    /* renamed from: h, reason: collision with root package name */
    public final String f9380h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C0702Qq f9381j;

    /* renamed from: k, reason: collision with root package name */
    public Qt f9382k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9373a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9374b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9376d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9377e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public int f9379g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9383l = false;

    public C0583Jq(Xt xt, C0702Qq c0702Qq, PD pd) {
        this.i = ((St) xt.f12510b.f15174c).f11284r;
        this.f9381j = c0702Qq;
        this.f9375c = pd;
        this.f9380h = C0753Tq.a(xt);
        List list = (List) xt.f12510b.f15173b;
        for (int i = 0; i < list.size(); i++) {
            this.f9373a.put((Qt) list.get(i), Integer.valueOf(i));
        }
        this.f9374b.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2.v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r6.f9383l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r6.f9376d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.Qt) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.Qt a() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.e()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L43
            r0 = 0
        L8:
            java.util.ArrayList r1 = r6.f9374b     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2b
            if (r0 >= r2) goto L43
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.Qt r2 = (com.google.android.gms.internal.ads.Qt) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.f10794t0     // Catch: java.lang.Throwable -> L2b
            java.util.HashSet r4 = r6.f9377e     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L23
            int r0 = r0 + 1
            goto L8
        L23:
            boolean r5 = r2.v0     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2d
            r5 = 1
            r6.f9383l = r5     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L46
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L2b
        L36:
            java.util.ArrayList r3 = r6.f9376d     // Catch: java.lang.Throwable -> L2b
            r3.add(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.Qt r0 = (com.google.android.gms.internal.ads.Qt) r0     // Catch: java.lang.Throwable -> L2b
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0583Jq.a():com.google.android.gms.internal.ads.Qt");
    }

    public final synchronized void b(InterfaceC0719Rq interfaceC0719Rq, Qt qt) {
        this.f9383l = false;
        this.f9376d.remove(qt);
        if (d()) {
            interfaceC0719Rq.n();
            return;
        }
        Integer num = (Integer) this.f9373a.get(qt);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.f9379g) {
            this.f9381j.e(qt);
            return;
        }
        if (this.f9378f != null) {
            this.f9381j.e(this.f9382k);
        }
        this.f9379g = iIntValue;
        this.f9378f = interfaceC0719Rq;
        this.f9382k = qt;
        if (h()) {
            return;
        }
        i();
    }

    public final synchronized void c(Qt qt) {
        this.f9383l = false;
        this.f9376d.remove(qt);
        this.f9377e.remove(qt.f10794t0);
        if (d() || h()) {
            return;
        }
        i();
    }

    public final synchronized boolean d() {
        return this.f9375c.isDone();
    }

    public final synchronized boolean e() {
        if (this.f9383l) {
            return false;
        }
        ArrayList arrayList = this.f9374b;
        if (!arrayList.isEmpty() && ((Qt) arrayList.get(0)).v0 && !this.f9376d.isEmpty()) {
            return false;
        }
        if (!d()) {
            ArrayList arrayList2 = this.f9376d;
            if (arrayList2.size() < this.i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized boolean f(boolean z6) {
        try {
            ArrayList arrayList = this.f9374b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Qt qt = (Qt) obj;
                Integer num = (Integer) this.f9373a.get(qt);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z6 || !this.f9377e.contains(qt.f10794t0)) {
                    int i3 = this.f9379g;
                    if (iIntValue < i3) {
                        return true;
                    }
                    if (iIntValue > i3) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g() {
        try {
            ArrayList arrayList = this.f9376d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Integer num = (Integer) this.f9373a.get((Qt) obj);
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f9379g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
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
        this.f9381j.c(this.f9382k);
        InterfaceC0719Rq interfaceC0719Rq = this.f9378f;
        if (interfaceC0719Rq != null) {
            this.f9375c.d(interfaceC0719Rq);
        } else {
            this.f9375c.e(new C0736Sq(3, this.f9380h));
        }
    }
}
