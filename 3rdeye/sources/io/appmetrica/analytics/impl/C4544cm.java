package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4544cm {

    /* renamed from: A, reason: collision with root package name */
    public final Am f40637A;

    /* renamed from: B, reason: collision with root package name */
    public final Map f40638B;

    /* renamed from: C, reason: collision with root package name */
    public final U9 f40639C;

    /* renamed from: a, reason: collision with root package name */
    public final String f40640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40641b;

    /* renamed from: c, reason: collision with root package name */
    public final C4647gm f40642c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40643d;

    /* renamed from: e, reason: collision with root package name */
    public final List f40644e;

    /* renamed from: f, reason: collision with root package name */
    public final List f40645f;

    /* renamed from: g, reason: collision with root package name */
    public final List f40646g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f40647h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f40648j;

    /* renamed from: k, reason: collision with root package name */
    public final String f40649k;

    /* renamed from: l, reason: collision with root package name */
    public final String f40650l;

    /* renamed from: m, reason: collision with root package name */
    public final String f40651m;

    /* renamed from: n, reason: collision with root package name */
    public final G4 f40652n;

    /* renamed from: o, reason: collision with root package name */
    public final long f40653o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f40654p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f40655q;

    /* renamed from: r, reason: collision with root package name */
    public final String f40656r;

    /* renamed from: s, reason: collision with root package name */
    public final Je f40657s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f40658t;

    /* renamed from: u, reason: collision with root package name */
    public final long f40659u;

    /* renamed from: v, reason: collision with root package name */
    public final long f40660v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f40661w;

    /* renamed from: x, reason: collision with root package name */
    public final BillingConfig f40662x;

    /* renamed from: y, reason: collision with root package name */
    public final C5114z3 f40663y;

    /* renamed from: z, reason: collision with root package name */
    public final C4911r2 f40664z;

    public C4544cm(String str, String str2, C4647gm c4647gm) {
        this.f40640a = str;
        this.f40641b = str2;
        this.f40642c = c4647gm;
        this.f40643d = c4647gm.f40953a;
        this.f40644e = c4647gm.f40954b;
        this.f40645f = c4647gm.f40958f;
        this.f40646g = c4647gm.f40959g;
        this.f40647h = c4647gm.i;
        this.i = c4647gm.f40955c;
        this.f40648j = c4647gm.f40956d;
        this.f40649k = c4647gm.f40961j;
        this.f40650l = c4647gm.f40962k;
        this.f40651m = c4647gm.f40963l;
        this.f40652n = c4647gm.f40964m;
        this.f40653o = c4647gm.f40965n;
        this.f40654p = c4647gm.f40966o;
        this.f40655q = c4647gm.f40967p;
        this.f40656r = c4647gm.f40968q;
        this.f40657s = c4647gm.f40970s;
        this.f40658t = c4647gm.f40971t;
        this.f40659u = c4647gm.f40972u;
        this.f40660v = c4647gm.f40973v;
        this.f40661w = c4647gm.f40974w;
        this.f40662x = c4647gm.f40975x;
        this.f40663y = c4647gm.f40976y;
        this.f40664z = c4647gm.f40977z;
        this.f40637A = c4647gm.f40950A;
        this.f40638B = c4647gm.f40951B;
        this.f40639C = c4647gm.f40952C;
    }

    public final String a() {
        return this.f40640a;
    }

    public final String b() {
        return this.f40641b;
    }

    public final long c() {
        return this.f40660v;
    }

    public final long d() {
        return this.f40659u;
    }

    public final String e() {
        return this.f40643d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f40640a + ", deviceIdHash=" + this.f40641b + ", startupStateModel=" + this.f40642c + ')';
    }
}
