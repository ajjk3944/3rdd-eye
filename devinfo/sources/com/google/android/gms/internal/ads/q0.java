package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15166a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f15167b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f15168c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15169d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f15170e;

    /* renamed from: f, reason: collision with root package name */
    public final w5 f15171f;
    public final CopyOnWriteArraySet g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15172h;

    /* renamed from: i, reason: collision with root package name */
    public final u0 f15173i;
    public k5 j = new k5();

    /* renamed from: k, reason: collision with root package name */
    public no0 f15174k;

    /* renamed from: l, reason: collision with root package name */
    public Pair f15175l;

    /* renamed from: m, reason: collision with root package name */
    public int f15176m;

    /* renamed from: n, reason: collision with root package name */
    public int f15177n;

    /* renamed from: o, reason: collision with root package name */
    public long f15178o;

    /* renamed from: p, reason: collision with root package name */
    public int f15179p;

    public q0(l0 l0Var) {
        this.f15166a = l0Var.f13306a;
        o0 o0Var = l0Var.f13308c;
        o0Var.getClass();
        this.f15167b = o0Var;
        this.f15168c = new SparseArray();
        v41 v41Var = x41.f18307b;
        u51 u51Var = u51.f17096e;
        this.f15169d = l0Var.f13309d;
        w5 w5Var = l0Var.f13310e;
        this.f15171f = w5Var;
        long j = l0Var.g;
        this.f15172h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        u0 u0Var = l0Var.f13312h;
        this.f15173i = u0Var;
        this.f15170e = new a0(l0Var.f13307b, u0Var, w5Var);
        this.g = new CopyOnWriteArraySet();
        new mx1(new lw1());
        this.f15178o = -9223372036854775807L;
        this.f15179p = -1;
        this.f15177n = 0;
    }
}
