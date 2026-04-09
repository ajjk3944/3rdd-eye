package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fn0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final js1 f11239a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f11240b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f11241c;

    public fn0(es1 es1Var, es1 es1Var2, a10 a10Var) {
        this.f11239a = es1Var;
        this.f11240b = es1Var2;
        this.f11241c = a10Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dn0 a() {
        return new dn0((ApplicationInfo) this.f11239a.a(), (PackageInfo) this.f11240b.a(), ((a10) this.f11241c).b());
    }
}
