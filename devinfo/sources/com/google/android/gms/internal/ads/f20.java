package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f20 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10965a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f10966b;

    public /* synthetic */ f20(js1 js1Var, int i4) {
        this.f10965a = i4;
        this.f10966b = js1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        Object f51Var;
        int i4 = this.f10965a;
        int i10 = 0;
        byte b10 = 0;
        int i11 = 1;
        js1 js1Var = this.f10966b;
        switch (i4) {
            case 0:
                return new ya.r(((a10) js1Var).b());
            case 1:
                return new i20(((x00) js1Var).a(), 0);
            case 2:
                return new i20(((x00) js1Var).a(), 1);
            case 3:
                return new j20((ff0) js1Var.a(), 0);
            case 4:
                return new n20(0, (ff0) js1Var.a());
            case 5:
                return new q20(((a10) js1Var).b());
            case 6:
                return new l20(i11, (vp0) js1Var.a());
            case 7:
                aw awVarO = aw.o(((e20) js1Var).f10678a.b());
                return new n20(1, new ce1((tb.a) awVarO.f9451b, b10 == true ? 1 : 0, (xv) ((es1) awVarO.f9453d).a(), 7));
            case 8:
                return new j20((ff0) js1Var.a(), 1);
            case 9:
                return new uq(((oq) js1Var.a()).f14769a);
            case 10:
                return new q80(new w30(i10, (k70) ((l40) js1Var).f13368a.f10094b), fx.g);
            case 11:
                return new q80((f50) js1Var.a(), fx.g);
            case 12:
                return new q80((f50) js1Var.a(), fx.g);
            case 13:
                return ((r30) js1Var).a();
            case 14:
                za.a aVarB = ((g10) js1Var).b();
                ya.f0 f0Var = ua.j.C.f35261c;
                return new vg(UUID.randomUUID().toString(), aVarB, "native", new JSONObject(), true);
            case 15:
                String packageName = ((a10) js1Var).b().getPackageName();
                al0.z(packageName);
                return packageName;
            case 16:
                Context contextB = ((a10) js1Var).b();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new dg0(contextB, exVar, 1);
            case 17:
                return b();
            case 18:
                return new ix0(29, ((i10) js1Var).a());
            case 19:
                return new ch0(((a10) js1Var).b());
            case 20:
                return new yh0(((a10) js1Var).b());
            case 21:
                return new nk(((a10) js1Var).b(), 3);
            case 22:
                return new ik0((ed0) js1Var.a());
            case 23:
                return new uk0((qd0) js1Var.a());
            case 24:
                return new el0(1, (Set) js1Var.a());
            case 25:
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                return new vl0(exVar2, ((a10) js1Var).b(), 0);
            case 26:
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                nm0 nm0Var = new nm0(exVar3, 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) js1Var.a();
                if (((Boolean) va.s.f36163e.f36166c.a(sk.O4)).booleanValue()) {
                    jl0 jl0Var = new jl0(nm0Var, ((Integer) r3.f36166c.a(sk.P4)).intValue(), scheduledExecutorService);
                    int i12 = e51.f10709c;
                    f51Var = new f51(jl0Var);
                } else {
                    int i13 = e51.f10709c;
                    f51Var = a61.j;
                }
                al0.z(f51Var);
                return f51Var;
            case 27:
                ex exVar4 = fx.f11274a;
                al0.z(exVar4);
                return new jl0(new nm0(exVar4, 1), ((Integer) va.s.f36163e.f36166c.a(sk.f16424yd)).intValue(), (ScheduledExecutorService) js1Var.a());
            case 28:
                Context contextB2 = ((a10) js1Var).b();
                ex exVar5 = fx.f11274a;
                al0.z(exVar5);
                return new vl0(contextB2, exVar5, 2);
            default:
                ex exVar6 = fx.f11274a;
                al0.z(exVar6);
                return new vl0(exVar6, ((a10) js1Var).b(), 3);
        }
    }

    public jg0 b() {
        Context contextB = ((a10) this.f10966b).b();
        jg0 jg0Var = new jg0();
        jg0Var.f12744h = 1;
        jg0Var.f11863f = new di(contextB, ua.j.C.f35276t.f(), jg0Var, jg0Var, 2);
        return jg0Var;
    }
}
