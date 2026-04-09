package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rm0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15702a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f15703b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f15704c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f15705d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f15706e;

    public /* synthetic */ rm0(fs1 fs1Var, es1 es1Var, es1 es1Var2, es1 es1Var3, int i4) {
        this.f15702a = i4;
        this.f15703b = fs1Var;
        this.f15704c = es1Var;
        this.f15705d = es1Var2;
        this.f15706e = es1Var3;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f15702a) {
            case 0:
                xl0 xl0VarB = ((yl0) this.f15703b).a();
                mm0 mm0Var = (mm0) this.f15704c.a();
                List list = (List) this.f15705d.a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15706e.a();
                if (list.contains("10")) {
                    return new jl0(mm0Var, ((Integer) va.s.f36163e.f36166c.a(sk.f16343td)).intValue(), scheduledExecutorService);
                }
                return new jl0(xl0VarB, ((Integer) va.s.f36163e.f36166c.a(sk.f16343td)).intValue(), scheduledExecutorService);
            case 1:
                xl0 xl0VarA = ((em0) this.f15703b).a();
                mm0 mm0Var2 = (mm0) this.f15704c.a();
                List list2 = (List) this.f15705d.a();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f15706e.a();
                if (list2.contains("54")) {
                    return new jl0(mm0Var2, ((Integer) va.s.f36163e.f36166c.a(sk.Dd)).intValue(), scheduledExecutorService2);
                }
                return new jl0(xl0VarA, ((Integer) va.s.f36163e.f36166c.a(sk.Dd)).intValue(), scheduledExecutorService2);
            case 2:
                vl0 vl0VarA = ((gm0) this.f15703b).a();
                mm0 mm0Var3 = (mm0) this.f15704c.a();
                List list3 = (List) this.f15705d.a();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f15706e.a();
                if (list3.contains("13")) {
                    return new jl0(mm0Var3, ((Integer) va.s.f36163e.f36166c.a(sk.Cd)).intValue(), scheduledExecutorService3);
                }
                return new jl0(vl0VarA, ((Integer) va.s.f36163e.f36166c.a(sk.Cd)).intValue(), scheduledExecutorService3);
            case 3:
                xl0 xl0VarA2 = ((xm0) this.f15703b).a();
                mm0 mm0Var4 = (mm0) this.f15704c.a();
                List list4 = (List) this.f15705d.a();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.f15706e.a();
                if (list4.contains("60")) {
                    return new jl0(mm0Var4, ((Integer) va.s.f36163e.f36166c.a(sk.f16097de)).intValue(), scheduledExecutorService4);
                }
                return new jl0(xl0VarA2, ((Integer) va.s.f36163e.f36166c.a(sk.f16097de)).intValue(), scheduledExecutorService4);
            case 4:
                hl0 hl0VarA = ((nn0) this.f15703b).a();
                mm0 mm0Var5 = (mm0) this.f15704c.a();
                List list5 = (List) this.f15705d.a();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) this.f15706e.a();
                if (list5.contains("35")) {
                    return new jl0(mm0Var5, ((Integer) va.s.f36163e.f36166c.a(sk.f16295qd)).intValue(), scheduledExecutorService5);
                }
                return new jl0(hl0VarA, ((Integer) va.s.f36163e.f36166c.a(sk.f16295qd)).intValue(), scheduledExecutorService5);
            default:
                vl0 vl0VarA2 = ((yn0) this.f15703b).a();
                mm0 mm0Var6 = (mm0) this.f15704c.a();
                List list6 = (List) this.f15705d.a();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) this.f15706e.a();
                if (list6.contains("39")) {
                    return new jl0(mm0Var6, ((Integer) va.s.f36163e.f36166c.a(sk.f16247nd)).intValue(), scheduledExecutorService6);
                }
                return new jl0(vl0VarA2, ((Integer) va.s.f36163e.f36166c.a(sk.f16247nd)).intValue(), scheduledExecutorService6);
        }
    }
}
