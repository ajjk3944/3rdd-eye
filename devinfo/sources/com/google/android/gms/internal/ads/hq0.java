package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hq0 {

    /* renamed from: a, reason: collision with root package name */
    public final va.x2 f11941a;

    /* renamed from: b, reason: collision with root package name */
    public final op f11942b;

    /* renamed from: c, reason: collision with root package name */
    public final uk0 f11943c;

    /* renamed from: d, reason: collision with root package name */
    public final va.z2 f11944d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f11945e;

    /* renamed from: f, reason: collision with root package name */
    public final va.c3 f11946f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f11947h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f11948i;
    public final qm j;

    /* renamed from: k, reason: collision with root package name */
    public final va.f3 f11949k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11950l;

    /* renamed from: m, reason: collision with root package name */
    public final sa.a f11951m;

    /* renamed from: n, reason: collision with root package name */
    public final sa.e f11952n;

    /* renamed from: o, reason: collision with root package name */
    public final va.v0 f11953o;

    /* renamed from: p, reason: collision with root package name */
    public final s9 f11954p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f11955q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f11956r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f11957s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f11958t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f11959u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f11960v;

    /* renamed from: w, reason: collision with root package name */
    public final va.y0 f11961w;

    public hq0(gq0 gq0Var) {
        this.f11946f = gq0Var.f11577b;
        this.g = gq0Var.f11578c;
        this.f11961w = gq0Var.f11596w;
        va.z2 z2Var = gq0Var.f11576a;
        this.f11945e = z2Var.B;
        int i4 = z2Var.f36188a;
        long j = z2Var.f36189b;
        Bundle bundle = z2Var.f36190c;
        int i10 = z2Var.f36191d;
        List list = z2Var.f36192e;
        boolean z3 = z2Var.f36193f;
        int i11 = z2Var.g;
        boolean z10 = true;
        if (!z2Var.f36194h && !gq0Var.f11580e) {
            z10 = false;
        }
        String str = z2Var.f36195i;
        va.v2 v2Var = z2Var.j;
        Location location = z2Var.f36196k;
        String str2 = z2Var.f36197l;
        Bundle bundle2 = z2Var.f36198m;
        Bundle bundle3 = z2Var.f36199n;
        List list2 = z2Var.f36200o;
        String str3 = z2Var.f36201p;
        String str4 = z2Var.f36202q;
        boolean z11 = z2Var.f36203r;
        va.o0 o0Var = z2Var.f36204s;
        int i12 = z2Var.f36205t;
        String str5 = z2Var.f36206u;
        List list3 = z2Var.f36207v;
        int iT = ya.f0.t(z2Var.f36208w);
        va.z2 z2Var2 = gq0Var.f11576a;
        va.z2 z2Var3 = new va.z2(i4, j, bundle, i10, list, z3, i11, z10, str, v2Var, location, str2, bundle2, bundle3, list2, str3, str4, z11, o0Var, i12, str5, list3, iT, z2Var2.f36209x, z2Var2.f36210y, z2Var2.f36211z, z2Var2.A);
        this.f11944d = z2Var3;
        va.x2 x2Var = gq0Var.f11579d;
        qm qmVar = null;
        if (x2Var == null) {
            qm qmVar2 = gq0Var.f11582h;
            x2Var = qmVar2 != null ? qmVar2.f15370f : null;
        }
        this.f11941a = x2Var;
        ArrayList arrayList = gq0Var.f11581f;
        this.f11947h = arrayList;
        this.f11948i = gq0Var.g;
        if (arrayList != null && (qmVar = gq0Var.f11582h) == null) {
            qmVar = new qm(new sa.d(new sa.d()));
        }
        this.j = qmVar;
        this.f11949k = gq0Var.f11583i;
        this.f11950l = gq0Var.f11586m;
        this.f11951m = gq0Var.j;
        this.f11952n = gq0Var.f11584k;
        this.f11953o = gq0Var.f11585l;
        this.f11942b = gq0Var.f11587n;
        this.f11954p = new s9(gq0Var.f11588o);
        this.f11955q = gq0Var.f11589p;
        this.f11956r = gq0Var.f11590q;
        this.f11943c = gq0Var.f11591r;
        this.f11957s = gq0Var.f11592s;
        this.f11958t = gq0Var.f11593t;
        long j8 = z2Var3.A;
        this.f11959u = j8 != 0 ? new AtomicLong(j8) : gq0Var.f11594u;
        this.f11960v = gq0Var.f11595v;
    }

    public final boolean a() {
        return this.g.matches((String) va.s.f36163e.f36166c.a(sk.R3));
    }
}
