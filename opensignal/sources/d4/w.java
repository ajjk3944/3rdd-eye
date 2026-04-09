package d4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.opensignal.sdk.data.task.TaskSdkService;
import java.util.Timer;
import lf.t1;

/* loaded from: classes.dex */
public final class w extends rq.j implements ar.k {
    public Object B;
    public final /* synthetic */ Object D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6900x;

    /* renamed from: y, reason: collision with root package name */
    public int f6901y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(a8.f fVar, Object obj, pq.c cVar, int i10) {
        super(1, cVar);
        this.f6900x = i10;
        this.B = fVar;
        this.D = obj;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        pq.c cVar = (pq.c) obj;
        switch (this.f6900x) {
            case 0:
                return new w((c0) this.D, cVar).q(lq.b0.f15562a);
            case 1:
                return new w((a8.f) this.B, (Context) this.D, cVar, 1).q(lq.b0.f15562a);
            default:
                return new w((a8.f) this.B, (tm.c) this.D, cVar, 2).q(lq.b0.f15562a);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) throws Throwable {
        f1 x0Var;
        int i10 = this.f6900x;
        int i11 = 2;
        lq.b0 b0Var = lq.b0.f15562a;
        Intent intentB = null;
        byte b2 = 0;
        Object obj2 = this.D;
        int i12 = 1;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) obj2;
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i13 = this.f6901y;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    n0 n0VarH = c0Var.h();
                    this.B = th;
                    this.f6901y = 2;
                    obj = n0VarH.d(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i13 == 0) {
                    t1.G(obj);
                    this.f6901y = 1;
                    obj = c0.g(c0Var, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.B;
                        t1.G(obj);
                        x0Var = new x0(th, ((Number) obj).intValue());
                        return new lq.l(x0Var, Boolean.TRUE);
                    }
                    t1.G(obj);
                }
                x0Var = (f1) obj;
                return new lq.l(x0Var, Boolean.TRUE);
            case 1:
                a8.f fVar = (a8.f) this.B;
                kj.a aVar2 = (kj.a) fVar.f195a;
                qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
                int i14 = this.f6901y;
                if (i14 == 0) {
                    t1.G(obj);
                    fm.i iVar = (fm.i) fVar.f199e;
                    this.f6901y = 1;
                    iVar.getClass();
                    du.f fVar2 = wt.d0.f24610a;
                    obj = wt.w.B(du.e.f7570g, new d1(i11, b2 == true ? 1 : 0, i12), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    new Timer().schedule(new fm.b(fVar, (Context) obj2), 1000L);
                    return b0Var;
                }
                aj.c cVar = aVar2.f14444a;
                cVar.f402d = aVar2;
                cVar.f406h = new aj.a(cVar);
                cVar.f401c = aVar2;
                aVar2.f14445b = (b9.c) fVar.f201g;
                aj.c cVar2 = aVar2.f14444a;
                Context context = cVar2.f399a;
                mk.c cVar3 = cVar2.f403e;
                br.l.e(cVar3, "binderType");
                ch.l.f3962t5.k();
                Bundle bundle = new Bundle();
                ic.a.F(bundle, "BINDER_TYPE", cVar3);
                TaskSdkService.Companion.getClass();
                context.bindService(cj.r.a(context, bundle), cVar2.f404f, 1);
                return b0Var;
            default:
                a8.f fVar3 = (a8.f) this.B;
                qq.a aVar4 = qq.a.COROUTINE_SUSPENDED;
                int i15 = this.f6901y;
                if (i15 == 0) {
                    t1.G(obj);
                    fVar3.f200f = (tm.c) obj2;
                    this.f6901y = 1;
                    if (a8.f.b(fVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                kj.a aVar5 = (kj.a) fVar3.f195a;
                gk.c cVar4 = gk.c.f9614o;
                br.l.e(cVar4, "schedule");
                aj.c cVar5 = aVar5.f14444a;
                Context context2 = cVar5.f399a;
                ch.l lVar = ch.l.f3962t5;
                hk.h hVarS0 = lVar.P0().s0("manual");
                if (hVarS0 == null) {
                    ak.v0 v0VarF0 = lVar.n().F0("manual");
                    hVarS0 = v0VarF0 != null ? lVar.N0().a(v0VarF0) : null;
                }
                if (hVarS0 == null) {
                    ch.n.c("TaskService", "Task does not exist. Returning null.");
                } else {
                    intentB = cj.t.b(context2, hVarS0.f10804a, hVarS0.f10805b, cVar4, "");
                }
                if (intentB != null) {
                    context2.bindService(intentB, cVar5.f404f, 1);
                    return b0Var;
                }
                ch.n.g("SdkServiceDataSource", "Intent for executing manual (taskNameOverride: ) task is null. Not binding.");
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0 c0Var, pq.c cVar) {
        super(1, cVar);
        this.f6900x = 0;
        this.D = c0Var;
    }
}
