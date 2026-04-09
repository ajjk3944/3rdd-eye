package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z00 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18950a;

    /* renamed from: b, reason: collision with root package name */
    public final a10 f18951b;

    public /* synthetic */ z00(a10 a10Var, int i4) {
        this.f18950a = i4;
        this.f18951b = a10Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18950a) {
            case 0:
                ApplicationInfo applicationInfo = this.f18951b.b().getApplicationInfo();
                al0.z(applicationInfo);
                return applicationInfo;
            case 1:
                return new jv0(this.f18951b.b(), ua.j.C.f35276t.f());
            case 2:
                return pq0.o(this.f18951b.b());
            case 3:
                return new ue0(this.f18951b.b());
            case 4:
                return new qf0(this.f18951b.b());
            case 5:
                return new rf0(this.f18951b.b());
            case 6:
                Context contextB = this.f18951b.b();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new lh0(contextB, exVar);
            case 7:
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                return new im0(this.f18951b.b(), exVar2);
            case 8:
                Context contextB2 = this.f18951b.b();
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                return new vl0(contextB2, exVar3, 6);
            default:
                return new fo0(this.f18951b.b());
        }
    }
}
