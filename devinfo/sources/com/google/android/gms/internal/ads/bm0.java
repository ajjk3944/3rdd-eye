package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bm0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9715a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9716b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9717c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9718d;

    /* renamed from: e, reason: collision with root package name */
    public final b50 f9719e;

    /* renamed from: f, reason: collision with root package name */
    public final sq0 f9720f;
    public final hq0 g;

    /* renamed from: h, reason: collision with root package name */
    public final ya.c0 f9721h = ua.j.C.f35265h.i();

    /* renamed from: i, reason: collision with root package name */
    public final od0 f9722i;
    public final e50 j;

    public bm0(Context context, String str, String str2, b50 b50Var, sq0 sq0Var, hq0 hq0Var, od0 od0Var, e50 e50Var, long j) {
        this.f9715a = context;
        this.f9716b = str;
        this.f9717c = str2;
        this.f9719e = b50Var;
        this.f9720f = sq0Var;
        this.g = hq0Var;
        this.f9722i = od0Var;
        this.j = e50Var;
        this.f9718d = j;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        Bundle bundle = new Bundle();
        od0 od0Var = this.f9722i;
        ConcurrentHashMap concurrentHashMap = od0Var.f14674a;
        String str = this.f9716b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue()) {
            ua.j.C.f35267k.getClass();
            od0Var.b("tsacc", String.valueOf(System.currentTimeMillis() - this.f9718d));
            od0Var.b("foreground", true != ya.f0.h(this.f9715a) ? "1" : "0");
        }
        b50 b50Var = this.f9719e;
        hq0 hq0Var = this.g;
        va.z2 z2Var = hq0Var.f11944d;
        vw vwVar = b50Var.f9594b;
        synchronized (vwVar.f17739d) {
            vwVar.f17736a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            vwVar.j = jElapsedRealtime;
            vwVar.f17737b.e(z2Var, jElapsedRealtime);
        }
        bundle.putAll(this.f9720f.b());
        return yo0.e(new cm0(this.f9715a, bundle, str, this.f9717c, this.f9721h, hq0Var.g, this.j));
    }
}
