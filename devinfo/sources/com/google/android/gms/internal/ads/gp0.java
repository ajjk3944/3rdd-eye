package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gp0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11571a;

    /* renamed from: b, reason: collision with root package name */
    public final gs1 f11572b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f11573c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f11574d;

    public /* synthetic */ gp0(gs1 gs1Var, es1 es1Var, es1 es1Var2, int i4) {
        this.f11571a = i4;
        this.f11572b = gs1Var;
        this.f11573c = es1Var;
        this.f11574d = es1Var2;
    }

    private final fp0 c() {
        ww wwVarS;
        Context context = (Context) this.f11572b.f11600a;
        tq0 tq0Var = (tq0) this.f11573c.a();
        fr0 fr0Var = (fr0) this.f11574d.a();
        pk pkVar = sk.f16058b7;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            wwVarS = ua.j.C.f35265h.i().s();
        } else {
            ya.c0 c0VarI = ua.j.C.f35265h.i();
            synchronized (c0VarI.f37402a) {
                wwVarS = c0VarI.f37413n;
            }
        }
        boolean z3 = false;
        if (wwVarS != null && wwVarS.j) {
            z3 = true;
        }
        if (((Integer) sVar.f36166c.a(sk.f16306r7)).intValue() > 0) {
            if (!((Boolean) sVar.f36166c.a(sk.f16041a7)).booleanValue() || z3) {
                er0 er0VarA = fr0Var.a(yq0.f18839c, context, tq0Var, new rg0(7, new kh0((byte) 0, 5)));
                l90 l90Var = new l90(16, new ne0(12));
                pq0 pq0Var = er0VarA.f10850a;
                ex exVar = fx.f11274a;
                return new ai(l90Var, new pq0(pq0Var, exVar), er0VarA.f10851b, ((zq0) pq0Var.f15074c).g, exVar);
            }
        }
        return new ne0(12);
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f11571a) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return new d01("0t12poYWosmBpngKvXFsIJ660Q+4XUg0b7zXGmPDXQpDG3a/Lo5YnElAjbhGuK/3", "2X8cf0JDVCgUXbkJnirLCT8PfoAeQLAghvQ5pw2PRcc=", (zc) this.f11572b.f11600a, (sz0) this.f11573c.a(), ((g21) this.f11574d.a()).a(114), 1);
            default:
                return new d01("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", (zc) this.f11572b.f11600a, (sz0) this.f11573c.a(), ((g21) this.f11574d.a()).a(117), 0);
        }
    }

    public fp0 b() {
        ww wwVarS;
        switch (this.f11571a) {
            case 0:
                return c();
            default:
                Context context = (Context) this.f11572b.f11600a;
                tq0 tq0Var = (tq0) this.f11573c.a();
                fr0 fr0Var = (fr0) this.f11574d.a();
                pk pkVar = sk.f16058b7;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    wwVarS = ua.j.C.f35265h.i().s();
                } else {
                    ya.c0 c0VarI = ua.j.C.f35265h.i();
                    synchronized (c0VarI.f37402a) {
                        wwVarS = c0VarI.f37413n;
                    }
                }
                boolean z3 = false;
                if (wwVarS != null && wwVarS.j) {
                    z3 = true;
                }
                if (((Integer) sVar.f36166c.a(sk.f16091d7)).intValue() > 0) {
                    if (!((Boolean) sVar.f36166c.a(sk.f16041a7)).booleanValue() || z3) {
                        er0 er0VarA = fr0Var.a(yq0.f18837a, context, tq0Var, new rg0(7, new kh0((byte) 0, 5)));
                        l90 l90Var = new l90(16, new ne0(12));
                        pq0 pq0Var = er0VarA.f10850a;
                        ex exVar = fx.f11274a;
                        return new ai(l90Var, new pq0(pq0Var, exVar), er0VarA.f10851b, ((zq0) pq0Var.f15074c).g, exVar);
                    }
                }
                return new ne0(12);
        }
    }
}
