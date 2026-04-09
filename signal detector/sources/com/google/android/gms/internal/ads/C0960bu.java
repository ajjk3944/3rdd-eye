package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import m2.C2654a;
import m2.C2657d;
import m2.C2658e;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.bu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960bu {

    /* renamed from: a, reason: collision with root package name */
    public final q2.Y0 f13479a;

    /* renamed from: b, reason: collision with root package name */
    public final C0942bc f13480b;

    /* renamed from: c, reason: collision with root package name */
    public final C2090wr f13481c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.a1 f13482d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f13483e;

    /* renamed from: f, reason: collision with root package name */
    public final q2.d1 f13484f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13485g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f13486h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final C0499Fa f13487j;

    /* renamed from: k, reason: collision with root package name */
    public final q2.g1 f13488k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13489l;

    /* renamed from: m, reason: collision with root package name */
    public final C2654a f13490m;

    /* renamed from: n, reason: collision with root package name */
    public final C2658e f13491n;

    /* renamed from: o, reason: collision with root package name */
    public final q2.W f13492o;

    /* renamed from: p, reason: collision with root package name */
    public final V0.m f13493p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f13494q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f13495r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f13496s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f13497t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f13498u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f13499v;

    /* renamed from: w, reason: collision with root package name */
    public final q2.Z f13500w;

    public C0960bu(C0905au c0905au) {
        this.f13484f = c0905au.f13242b;
        this.f13485g = c0905au.f13243c;
        this.f13500w = c0905au.f13262w;
        q2.a1 a1Var = c0905au.f13241a;
        this.f13483e = a1Var.f23164P;
        int i = a1Var.f23165a;
        long j6 = a1Var.f23166b;
        Bundle bundle = a1Var.f23167c;
        int i3 = a1Var.f23168d;
        List list = a1Var.f23169e;
        boolean z6 = a1Var.f23170f;
        int i6 = a1Var.f23171g;
        boolean z7 = true;
        if (!a1Var.f23172h && !c0905au.f13245e) {
            z7 = false;
        }
        String str = a1Var.i;
        q2.W0 w02 = a1Var.f23173j;
        Location location = a1Var.f23174k;
        String str2 = a1Var.f23175l;
        Bundle bundle2 = a1Var.f23176m;
        Bundle bundle3 = a1Var.f23177n;
        List list2 = a1Var.f23152C;
        String str3 = a1Var.f23153D;
        String str4 = a1Var.f23154E;
        boolean z8 = a1Var.f23155F;
        q2.O o5 = a1Var.f23156G;
        int i7 = a1Var.f23157H;
        String str5 = a1Var.f23158I;
        List list3 = a1Var.f23159J;
        int iT = C2911G.t(a1Var.f23160K);
        q2.a1 a1Var2 = c0905au.f13241a;
        q2.a1 a1Var3 = new q2.a1(i, j6, bundle, i3, list, z6, i6, z7, str, w02, location, str2, bundle2, bundle3, list2, str3, str4, z8, o5, i7, str5, list3, iT, a1Var2.f23161L, a1Var2.M, a1Var2.f23162N, a1Var2.f23163O);
        this.f13482d = a1Var3;
        q2.Y0 y02 = c0905au.f13244d;
        C0499Fa c0499Fa = null;
        if (y02 == null) {
            C0499Fa c0499Fa2 = c0905au.f13248h;
            y02 = c0499Fa2 != null ? c0499Fa2.f8132f : null;
        }
        this.f13479a = y02;
        ArrayList arrayList = c0905au.f13246f;
        this.f13486h = arrayList;
        this.i = c0905au.f13247g;
        if (arrayList != null && (c0499Fa = c0905au.f13248h) == null) {
            c0499Fa = new C0499Fa(new C2657d(new C2657d()));
        }
        this.f13487j = c0499Fa;
        this.f13488k = c0905au.i;
        this.f13489l = c0905au.f13252m;
        this.f13490m = c0905au.f13249j;
        this.f13491n = c0905au.f13250k;
        this.f13492o = c0905au.f13251l;
        this.f13480b = c0905au.f13253n;
        this.f13493p = new V0.m(c0905au.f13254o);
        this.f13494q = c0905au.f13255p;
        this.f13495r = c0905au.f13256q;
        this.f13481c = c0905au.f13257r;
        this.f13496s = c0905au.f13258s;
        this.f13497t = c0905au.f13259t;
        long j7 = a1Var3.f23163O;
        this.f13498u = j7 != 0 ? new AtomicLong(j7) : c0905au.f13260u;
        this.f13499v = c0905au.f13261v;
    }

    public final boolean a() {
        return this.f13485g.matches((String) C2841s.f23267e.f23270c.a(H9.f8663R3));
    }
}
