package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ko0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final zw f13219a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13220b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f13221c;

    /* renamed from: d, reason: collision with root package name */
    public final w81 f13222d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13223e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13224f;

    public ko0(zw zwVar, boolean z3, w81 w81Var, ScheduledExecutorService scheduledExecutorService, int i4, int i10) {
        this.f13219a = zwVar;
        this.f13220b = z3;
        this.f13222d = w81Var;
        this.f13221c = scheduledExecutorService;
        this.f13223e = i4;
        this.f13224f = i10;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        pk pkVar = sk.M7;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && this.f13220b) {
            return yo0.e(new ml0(null, 5));
        }
        if (this.f13224f == 2) {
            return yo0.e(new ml0(null, 5));
        }
        if (!Arrays.asList(((String) sVar.f36166c.a(sk.O7)).split(",")).contains(String.valueOf(this.f13223e))) {
            return yo0.e(new ml0(null, 5));
        }
        s81 s81Var = s81.f15906b;
        o5 o5Var = o5.f14553p;
        w81 w81Var = this.f13222d;
        return yo0.C(yo0.E(yo0.G(s81Var, o5Var, w81Var), ((Long) hm.f11917b.u()).longValue(), TimeUnit.MILLISECONDS, this.f13221c), Exception.class, new hu(6, this), w81Var);
    }
}
