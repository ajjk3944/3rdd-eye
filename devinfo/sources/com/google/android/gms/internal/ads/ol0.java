package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ol0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14727a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14728b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14729c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14730d;

    public ol0(zw zwVar, ScheduledExecutorService scheduledExecutorService, w81 w81Var) {
        this.f14727a = 3;
        this.f14728b = zwVar;
        this.f14730d = scheduledExecutorService;
        this.f14729c = w81Var;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        switch (this.f14727a) {
            case 0:
                return 6;
            case 1:
                return 9;
            case 2:
                return 34;
            default:
                return 43;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        switch (this.f14727a) {
            case 0:
                vd.b bVar = (vd.b) this.f14728b;
                k20 k20Var = k20.f12995i;
                Executor executor = (Executor) this.f14729c;
                vd.b bVarF = yo0.F(bVar, k20Var, executor);
                if (((Integer) va.s.f36163e.f36166c.a(sk.Ld)).intValue() > 0) {
                    bVarF = yo0.E(bVarF, ((Integer) r3.f36166c.a(r1)).intValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f14730d);
                }
                return yo0.D(bVarF, Throwable.class, k20.f12994h, executor);
            case 1:
                return ((ex) ((w81) this.f14728b)).e(new qe(11, this));
            case 2:
                return ((ex) ((w81) this.f14729c)).e(new qe(24, this));
            default:
                pk pkVar = sk.B3;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    if (((Boolean) sVar.f36166c.a(sk.G3)).booleanValue()) {
                        ox0 ox0VarJ = al0.j(Tasks.forResult(null));
                        w81 w81Var = (w81) this.f14729c;
                        vd.b bVarF2 = yo0.F(ox0VarJ, k20.f12997l, w81Var);
                        if (((Boolean) jl.f12775a.u()).booleanValue()) {
                            bVarF2 = yo0.E(bVarF2, ((Long) jl.f12776b.u()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f14730d);
                        }
                        return yo0.C(bVarF2, Exception.class, new hu(5, this), w81Var);
                    }
                }
                return yo0.e(new am0(null, -1, 3));
        }
    }

    public /* synthetic */ ol0(Object obj, Object obj2, Object obj3, int i4) {
        this.f14727a = i4;
        this.f14728b = obj;
        this.f14729c = obj2;
        this.f14730d = obj3;
    }
}
