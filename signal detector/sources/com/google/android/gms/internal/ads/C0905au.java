package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import m2.C2654a;
import m2.C2658e;

/* renamed from: com.google.android.gms.internal.ads.au, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905au {

    /* renamed from: a, reason: collision with root package name */
    public q2.a1 f13241a;

    /* renamed from: b, reason: collision with root package name */
    public q2.d1 f13242b;

    /* renamed from: c, reason: collision with root package name */
    public String f13243c;

    /* renamed from: d, reason: collision with root package name */
    public q2.Y0 f13244d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13245e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f13246f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f13247g;

    /* renamed from: h, reason: collision with root package name */
    public C0499Fa f13248h;
    public q2.g1 i;

    /* renamed from: j, reason: collision with root package name */
    public C2654a f13249j;

    /* renamed from: k, reason: collision with root package name */
    public C2658e f13250k;

    /* renamed from: l, reason: collision with root package name */
    public q2.W f13251l;

    /* renamed from: m, reason: collision with root package name */
    public int f13252m = 1;

    /* renamed from: n, reason: collision with root package name */
    public C0942bc f13253n;

    /* renamed from: o, reason: collision with root package name */
    public final V0.m f13254o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13255p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13256q;

    /* renamed from: r, reason: collision with root package name */
    public C2090wr f13257r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13258s;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f13259t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f13260u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13261v;

    /* renamed from: w, reason: collision with root package name */
    public q2.Z f13262w;

    public C0905au() {
        V0.m mVar = new V0.m();
        mVar.f3830b = 2;
        this.f13254o = mVar;
        this.f13255p = false;
        this.f13256q = false;
        this.f13258s = false;
        this.f13260u = new AtomicLong();
        this.f13261v = false;
    }

    public final C0960bu a() {
        M2.u.f(this.f13243c, "ad unit must not be null");
        M2.u.f(this.f13242b, "ad size must not be null");
        M2.u.f(this.f13241a, "ad request must not be null");
        return new C0960bu(this);
    }
}
