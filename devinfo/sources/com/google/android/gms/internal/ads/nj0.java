package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nj0 {

    /* renamed from: a, reason: collision with root package name */
    public final tb.a f14296a;

    /* renamed from: b, reason: collision with root package name */
    public final pq0 f14297b;

    /* renamed from: c, reason: collision with root package name */
    public final ct0 f14298c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f14299d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14300e = ((Boolean) va.s.f36163e.f36166c.a(sk.C7)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    public final ei0 f14301f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public long f14302h;

    /* renamed from: i, reason: collision with root package name */
    public long f14303i;

    public nj0(tb.a aVar, pq0 pq0Var, ei0 ei0Var, ct0 ct0Var) {
        this.f14296a = aVar;
        this.f14297b = pq0Var;
        this.f14301f = ei0Var;
        this.f14298c = ct0Var;
    }

    public final synchronized void a() {
        this.f14296a.getClass();
        this.f14303i = SystemClock.elapsedRealtime();
    }

    public final synchronized void b(List list) {
        this.f14296a.getClass();
        this.f14303i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wp0 wp0Var = (wp0) it.next();
            String str = wp0Var.f18114w;
            if (!TextUtils.isEmpty(str)) {
                this.f14299d.put(wp0Var, new mj0(str, wp0Var.f18083f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void c(wp0 wp0Var) {
        try {
            this.f14296a.getClass();
            this.f14302h = SystemClock.elapsedRealtime() - this.f14303i;
            if (wp0Var != null) {
                this.f14301f.a(wp0Var);
            }
            this.g = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(dq0 dq0Var, wp0 wp0Var, vd.b bVar, bt0 bt0Var) {
        yp0 yp0Var = (yp0) dq0Var.f10544b.f9452c;
        this.f14296a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = wp0Var.f18114w;
        if (str != null) {
            this.f14299d.put(wp0Var, new mj0(str, wp0Var.f18083f0, 9, 0L, null));
            lj0 lj0Var = new lj0(this, jElapsedRealtime, yp0Var, wp0Var, str, bt0Var, dq0Var);
            bVar.a(new q81(0, bVar, lj0Var), fx.g);
        }
    }

    public final synchronized void e(wp0 wp0Var) {
        mj0 mj0Var = (mj0) this.f14299d.get(wp0Var);
        if (mj0Var == null || this.g) {
            return;
        }
        mj0Var.f13911c = 8;
    }

    public final synchronized String f() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f14299d.entrySet().iterator();
            while (it.hasNext()) {
                mj0 mj0Var = (mj0) ((Map.Entry) it.next()).getValue();
                if (mj0Var.f13911c != Integer.MAX_VALUE) {
                    arrayList.add(mj0Var.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long g() {
        return this.f14302h;
    }

    public final boolean h(wp0 wp0Var) {
        synchronized (this) {
            mj0 mj0Var = (mj0) this.f14299d.get(wp0Var);
            if (mj0Var == null) {
                return false;
            }
            return mj0Var.f13911c == 8;
        }
    }
}
