package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class td0 implements tr0 {

    /* renamed from: b, reason: collision with root package name */
    public final od0 f16787b;

    /* renamed from: c, reason: collision with root package name */
    public final tb.a f16788c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16786a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f16789d = new HashMap();

    public td0(od0 od0Var, Set set, tb.a aVar) {
        this.f16787b = od0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sd0 sd0Var = (sd0) it.next();
            HashMap map = this.f16789d;
            sd0Var.getClass();
            map.put(qr0.RENDERER, sd0Var);
        }
        this.f16788c = aVar;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void b(qr0 qr0Var, String str, Throwable th2) {
        HashMap map = this.f16786a;
        if (map.containsKey(qr0Var)) {
            this.f16788c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(qr0Var)).longValue();
            this.f16787b.f14674a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f16789d.containsKey(qr0Var)) {
            c(qr0Var, false);
        }
    }

    public final void c(qr0 qr0Var, boolean z3) {
        sd0 sd0Var = (sd0) this.f16789d.get(qr0Var);
        if (sd0Var == null) {
            return;
        }
        String str = true != z3 ? "f." : "s.";
        qr0 qr0Var2 = sd0Var.f15991b;
        HashMap map = this.f16786a;
        if (map.containsKey(qr0Var2)) {
            this.f16788c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(qr0Var2)).longValue();
            String str2 = sd0Var.f15990a;
            ConcurrentHashMap concurrentHashMap = this.f16787b.f14674a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2);
            sb2.append(str);
            sb2.append(jElapsedRealtime);
            concurrentHashMap.put("label.".concat(str2), sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void m(qr0 qr0Var, String str) {
        this.f16788c.getClass();
        this.f16786a.put(qr0Var, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void p(qr0 qr0Var, String str) {
        HashMap map = this.f16786a;
        if (map.containsKey(qr0Var)) {
            this.f16788c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(qr0Var)).longValue();
            this.f16787b.f14674a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f16789d.containsKey(qr0Var)) {
            c(qr0Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void a(String str) {
    }
}
