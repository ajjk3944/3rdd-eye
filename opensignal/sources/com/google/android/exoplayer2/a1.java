package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: t, reason: collision with root package name */
    public static final ya.v f4047t = new ya.v(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final w1 f4048a;

    /* renamed from: b, reason: collision with root package name */
    public final ya.v f4049b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4050c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4051d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4052e;

    /* renamed from: f, reason: collision with root package name */
    public final n f4053f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4054g;

    /* renamed from: h, reason: collision with root package name */
    public final TrackGroupArray f4055h;

    /* renamed from: i, reason: collision with root package name */
    public final ob.n f4056i;
    public final List j;
    public final ya.v k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4057l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4058m;

    /* renamed from: n, reason: collision with root package name */
    public final b1 f4059n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4060o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4061p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f4062q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f4063r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f4064s;

    public a1(w1 w1Var, ya.v vVar, long j, long j7, int i10, n nVar, boolean z10, TrackGroupArray trackGroupArray, ob.n nVar2, List list, ya.v vVar2, boolean z11, int i11, b1 b1Var, long j10, long j11, long j12, boolean z12, boolean z13) {
        this.f4048a = w1Var;
        this.f4049b = vVar;
        this.f4050c = j;
        this.f4051d = j7;
        this.f4052e = i10;
        this.f4053f = nVar;
        this.f4054g = z10;
        this.f4055h = trackGroupArray;
        this.f4056i = nVar2;
        this.j = list;
        this.k = vVar2;
        this.f4057l = z11;
        this.f4058m = i11;
        this.f4059n = b1Var;
        this.f4062q = j10;
        this.f4063r = j11;
        this.f4064s = j12;
        this.f4060o = z12;
        this.f4061p = z13;
    }

    public static a1 h(ob.n nVar) {
        TrackGroupArray trackGroupArray = TrackGroupArray.f4456r;
        oe.f0 f0Var = oe.h0.f19336d;
        oe.u0 u0Var = oe.u0.f19383x;
        b1 b1Var = b1.f4069d;
        t1 t1Var = w1.f4774a;
        ya.v vVar = f4047t;
        return new a1(t1Var, vVar, -9223372036854775807L, 0L, 1, null, false, trackGroupArray, nVar, u0Var, vVar, false, 0, b1Var, 0L, 0L, 0L, false, false);
    }

    public final a1 a(ya.v vVar) {
        return new a1(this.f4048a, this.f4049b, this.f4050c, this.f4051d, this.f4052e, this.f4053f, this.f4054g, this.f4055h, this.f4056i, this.j, vVar, this.f4057l, this.f4058m, this.f4059n, this.f4062q, this.f4063r, this.f4064s, this.f4060o, this.f4061p);
    }

    public final a1 b(ya.v vVar, long j, long j7, long j10, long j11, TrackGroupArray trackGroupArray, ob.n nVar, List list) {
        return new a1(this.f4048a, vVar, j7, j10, this.f4052e, this.f4053f, this.f4054g, trackGroupArray, nVar, list, this.k, this.f4057l, this.f4058m, this.f4059n, this.f4062q, j11, j, this.f4060o, this.f4061p);
    }

    public final a1 c(boolean z10) {
        return new a1(this.f4048a, this.f4049b, this.f4050c, this.f4051d, this.f4052e, this.f4053f, this.f4054g, this.f4055h, this.f4056i, this.j, this.k, this.f4057l, this.f4058m, this.f4059n, this.f4062q, this.f4063r, this.f4064s, z10, this.f4061p);
    }

    public final a1 d(int i10, boolean z10) {
        return new a1(this.f4048a, this.f4049b, this.f4050c, this.f4051d, this.f4052e, this.f4053f, this.f4054g, this.f4055h, this.f4056i, this.j, this.k, z10, i10, this.f4059n, this.f4062q, this.f4063r, this.f4064s, this.f4060o, this.f4061p);
    }

    public final a1 e(n nVar) {
        return new a1(this.f4048a, this.f4049b, this.f4050c, this.f4051d, this.f4052e, nVar, this.f4054g, this.f4055h, this.f4056i, this.j, this.k, this.f4057l, this.f4058m, this.f4059n, this.f4062q, this.f4063r, this.f4064s, this.f4060o, this.f4061p);
    }

    public final a1 f(int i10) {
        return new a1(this.f4048a, this.f4049b, this.f4050c, this.f4051d, i10, this.f4053f, this.f4054g, this.f4055h, this.f4056i, this.j, this.k, this.f4057l, this.f4058m, this.f4059n, this.f4062q, this.f4063r, this.f4064s, this.f4060o, this.f4061p);
    }

    public final a1 g(w1 w1Var) {
        return new a1(w1Var, this.f4049b, this.f4050c, this.f4051d, this.f4052e, this.f4053f, this.f4054g, this.f4055h, this.f4056i, this.j, this.k, this.f4057l, this.f4058m, this.f4059n, this.f4062q, this.f4063r, this.f4064s, this.f4060o, this.f4061p);
    }
}
