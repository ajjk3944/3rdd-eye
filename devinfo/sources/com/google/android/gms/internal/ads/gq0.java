package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gq0 {

    /* renamed from: a, reason: collision with root package name */
    public va.z2 f11576a;

    /* renamed from: b, reason: collision with root package name */
    public va.c3 f11577b;

    /* renamed from: c, reason: collision with root package name */
    public String f11578c;

    /* renamed from: d, reason: collision with root package name */
    public va.x2 f11579d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11580e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f11581f;
    public ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public qm f11582h;

    /* renamed from: i, reason: collision with root package name */
    public va.f3 f11583i;
    public sa.a j;

    /* renamed from: k, reason: collision with root package name */
    public sa.e f11584k;

    /* renamed from: l, reason: collision with root package name */
    public va.v0 f11585l;

    /* renamed from: m, reason: collision with root package name */
    public int f11586m = 1;

    /* renamed from: n, reason: collision with root package name */
    public op f11587n;

    /* renamed from: o, reason: collision with root package name */
    public final s9 f11588o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11589p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11590q;

    /* renamed from: r, reason: collision with root package name */
    public uk0 f11591r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11592s;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f11593t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f11594u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11595v;

    /* renamed from: w, reason: collision with root package name */
    public va.y0 f11596w;

    public gq0() {
        s9 s9Var = new s9(3);
        s9Var.f15910b = 2;
        this.f11588o = s9Var;
        this.f11589p = false;
        this.f11590q = false;
        this.f11592s = false;
        this.f11594u = new AtomicLong();
        this.f11595v = false;
    }

    public final hq0 a() {
        pb.y.i(this.f11578c, "ad unit must not be null");
        pb.y.i(this.f11577b, "ad size must not be null");
        pb.y.i(this.f11576a, "ad request must not be null");
        return new hq0(this);
    }
}
