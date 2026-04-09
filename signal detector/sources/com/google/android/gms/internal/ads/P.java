package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10294a;

    /* renamed from: b, reason: collision with root package name */
    public final N f10295b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f10296c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10297d;

    /* renamed from: e, reason: collision with root package name */
    public final B f10298e;

    /* renamed from: f, reason: collision with root package name */
    public final C1994v2 f10299f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f10300g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10301h;
    public final U i;

    /* renamed from: j, reason: collision with root package name */
    public M3.o f10302j = new M3.o();

    /* renamed from: k, reason: collision with root package name */
    public C1231gt f10303k;

    /* renamed from: l, reason: collision with root package name */
    public Pair f10304l;

    /* renamed from: m, reason: collision with root package name */
    public int f10305m;

    /* renamed from: n, reason: collision with root package name */
    public int f10306n;

    /* renamed from: o, reason: collision with root package name */
    public long f10307o;

    /* renamed from: p, reason: collision with root package name */
    public int f10308p;

    public P(K k6) {
        this.f10294a = k6.f9408a;
        N n6 = k6.f9410c;
        n6.getClass();
        this.f10295b = n6;
        this.f10296c = new SparseArray();
        JB jb = LB.f9635b;
        C1197gC c1197gC = C1197gC.f14227e;
        this.f10297d = k6.f9411d;
        C1994v2 c1994v2 = k6.f9412e;
        this.f10299f = c1994v2;
        long j6 = k6.f9414g;
        this.f10301h = j6 != -9223372036854775807L ? -j6 : -9223372036854775807L;
        U u6 = k6.f9415h;
        this.i = u6;
        this.f10298e = new B(k6.f9409b, u6, c1994v2);
        this.f10300g = new CopyOnWriteArraySet();
        new TP(new C1855sP());
        this.f10307o = -9223372036854775807L;
        this.f10308p = -1;
        this.f10306n = 0;
    }
}
