package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.math.BigInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a50 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9206a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f9207b;

    /* renamed from: c, reason: collision with root package name */
    public final b60 f9208c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f9209d;

    public a50(b60 b60Var, es1 es1Var, x00 x00Var) {
        this.f9206a = 3;
        this.f9208c = b60Var;
        this.f9207b = es1Var;
        this.f9209d = x00Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        String string;
        switch (this.f9206a) {
            case 0:
                tb.a aVar = (tb.a) this.f9207b.a();
                bx bxVarA = ((h10) this.f9209d).a();
                String str = this.f9208c.b().g;
                rt rtVar = bxVarA.f9836c;
                synchronized (rtVar) {
                    string = ((BigInteger) rtVar.f15753b).toString();
                    rtVar.f15753b = ((BigInteger) rtVar.f15753b).add(BigInteger.ONE);
                    rtVar.f15754c = string;
                }
                return new vw(aVar, bxVarA, string, str);
            case 1:
                return new jl0((tb.a) this.f9207b.a(), this.f9208c.b(), ((Long) this.f9209d.a()).longValue());
            case 2:
                return b();
            case 3:
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new hl0(exVar, this.f9208c.b(), (PackageInfo) this.f9207b.a(), ((x00) this.f9209d).a());
            default:
                return c();
        }
    }

    public hl0 b() {
        ex exVar = fx.f11274a;
        al0.z(exVar);
        return new hl0(exVar, (gd0) this.f9207b.a(), this.f9208c.b(), (String) this.f9209d.a(), 2);
    }

    public hl0 c() {
        Context contextB = ((a10) this.f9207b).b();
        ex exVar = fx.f11274a;
        al0.z(exVar);
        return new hl0(contextB, exVar, this.f9208c.b(), ((g10) this.f9209d).b());
    }

    public a50(es1 es1Var, h10 h10Var, b60 b60Var) {
        this.f9206a = 0;
        this.f9207b = es1Var;
        this.f9209d = h10Var;
        this.f9208c = b60Var;
    }

    public /* synthetic */ a50(js1 js1Var, b60 b60Var, js1 js1Var2, int i4) {
        this.f9206a = i4;
        this.f9207b = js1Var;
        this.f9208c = b60Var;
        this.f9209d = js1Var2;
    }
}
