package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zm0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19122a;

    /* renamed from: b, reason: collision with root package name */
    public js1 f19123b;

    public /* synthetic */ zm0() {
        this.f19122a = 21;
    }

    public static void b(zm0 zm0Var, js1 js1Var) {
        if (zm0Var.f19123b != null) {
            throw new IllegalStateException();
        }
        zm0Var.f19123b = js1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f19122a) {
            case 0:
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new xl0(4, exVar, (ff0) this.f19123b.a());
            case 1:
                return new el0(4, (vp0) this.f19123b.a());
            case 2:
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                return new vl0(exVar2, ((a10) this.f19123b).b(), 4);
            case 3:
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                return new xl0(5, exVar3, (be0) this.f19123b.a());
            case 4:
                ex exVar4 = fx.f11274a;
                al0.z(exVar4);
                return new vl0(exVar4, ((a10) this.f19123b).b(), 5);
            case 5:
                ex exVar5 = fx.f11274a;
                al0.z(exVar5);
                ((a10) this.f19123b).b();
                return new nm0(exVar5, 3);
            case 6:
                return new oo0((tq0) this.f19123b.a());
            case 7:
                return new np0((tq0) this.f19123b.a());
            case 8:
                return new bs0((cs0) this.f19123b.a());
            case 9:
                return new bs0((cs0) this.f19123b.a());
            case 10:
                return new File(new File((File) this.f19123b.a(), "drgd"), "pmtd.d");
            case 11:
                return new File(new File((File) this.f19123b.a(), "drgd"), "pcbc.d");
            case 12:
                return new File(new File((File) this.f19123b.a(), "drgd"), "pcam.jar.d");
            case 13:
                return new File(new File((File) this.f19123b.a(), "drgd"), "pmtd");
            case 14:
                return new File(new File(new File((File) this.f19123b.a(), "drgd"), "v"), "pcopt");
            case 15:
                return new File(new File((File) this.f19123b.a(), "drgd"), "pcbc");
            case 16:
                return new File(new File((File) this.f19123b.a(), "drgd"), "pcam.jar.tmp");
            case 17:
                return new File(new File(new File((File) this.f19123b.a(), "drgd"), "v"), "pcam.jar");
            case 18:
                return new File(new File((File) this.f19123b.a(), "ocs"), "pmtd");
            case 19:
                return new File(new File((File) this.f19123b.a(), "ocs"), "pcbc");
            case 20:
                return new File(new File((File) this.f19123b.a(), "ocs"), "pcam.jar");
            default:
                js1 js1Var = this.f19123b;
                if (js1Var != null) {
                    return js1Var.a();
                }
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ zm0(js1 js1Var, int i4) {
        this.f19122a = i4;
        this.f19123b = js1Var;
    }
}
