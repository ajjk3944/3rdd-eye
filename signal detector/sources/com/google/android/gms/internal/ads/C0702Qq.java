package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Qq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702Qq {

    /* renamed from: a, reason: collision with root package name */
    public final Q2.a f10710a;

    /* renamed from: b, reason: collision with root package name */
    public final C1338iu f10711b;

    /* renamed from: c, reason: collision with root package name */
    public final C2202yv f10712c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f10713d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10714e = ((Boolean) C2841s.f23267e.f23270c.a(H9.C7)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    public final C1228gq f10715f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10716g;

    /* renamed from: h, reason: collision with root package name */
    public long f10717h;
    public long i;

    public C0702Qq(Q2.a aVar, C1338iu c1338iu, C1228gq c1228gq, C2202yv c2202yv) {
        this.f10710a = aVar;
        this.f10711b = c1338iu;
        this.f10715f = c1228gq;
        this.f10712c = c2202yv;
    }

    public final synchronized void a() {
        this.f10710a.getClass();
        this.i = SystemClock.elapsedRealtime();
    }

    public final synchronized void b(List list) {
        this.f10710a.getClass();
        this.i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Qt qt = (Qt) it.next();
            String str = qt.f10798w;
            if (!TextUtils.isEmpty(str)) {
                this.f10713d.put(qt, new C0685Pq(str, qt.f10767f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void c(Qt qt) {
        try {
            this.f10710a.getClass();
            this.f10717h = SystemClock.elapsedRealtime() - this.i;
            if (qt != null) {
                this.f10715f.a(qt);
            }
            this.f10716g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(Xt xt, Qt qt, InterfaceFutureC2326a interfaceFutureC2326a, C2148xv c2148xv) {
        St st = (St) xt.f12510b.f15174c;
        this.f10710a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = qt.f10798w;
        if (str != null) {
            this.f10713d.put(qt, new C0685Pq(str, qt.f10767f0, 9, 0L, null));
            C0668Oq c0668Oq = new C0668Oq(this, jElapsedRealtime, st, qt, str, c2148xv, xt);
            interfaceFutureC2326a.a(new CD(interfaceFutureC2326a, 0, c0668Oq), AbstractC0640Nf.f10011g);
        }
    }

    public final synchronized void e(Qt qt) {
        C0685Pq c0685Pq = (C0685Pq) this.f10713d.get(qt);
        if (c0685Pq == null || this.f10716g) {
            return;
        }
        c0685Pq.f10519c = 8;
    }

    public final synchronized String f() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f10713d.entrySet().iterator();
            while (it.hasNext()) {
                C0685Pq c0685Pq = (C0685Pq) ((Map.Entry) it.next()).getValue();
                if (c0685Pq.f10519c != Integer.MAX_VALUE) {
                    arrayList.add(c0685Pq.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long g() {
        return this.f10717h;
    }

    public final boolean h(Qt qt) {
        synchronized (this) {
            C0685Pq c0685Pq = (C0685Pq) this.f10713d.get(qt);
            if (c0685Pq == null) {
                return false;
            }
            return c0685Pq.f10519c == 8;
        }
    }
}
