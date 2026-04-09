package fm;

import android.content.Context;
import android.content.Intent;
import com.opensignal.sdk.data.task.TaskSdkService;
import lf.t1;
import lq.b0;

/* loaded from: classes.dex */
public final class f extends rq.j implements ar.k {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9005x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a8.f f9006y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(a8.f fVar, pq.c cVar, int i10) {
        super(1, cVar);
        this.f9005x = i10;
        this.f9006y = fVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        pq.c cVar = (pq.c) obj;
        switch (this.f9005x) {
            case 0:
                f fVar = new f(this.f9006y, cVar, 0);
                b0 b0Var = b0.f15562a;
                fVar.q(b0Var);
                return b0Var;
            default:
                f fVar2 = new f(this.f9006y, cVar, 1);
                b0 b0Var2 = b0.f15562a;
                fVar2.q(b0Var2);
                return b0Var2;
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        int i10 = this.f9005x;
        b0 b0Var = b0.f15562a;
        a8.f fVar = this.f9006y;
        switch (i10) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                em.a aVar2 = (em.a) fVar.f202h;
                if (aVar2 != null) {
                    aVar2.a();
                    break;
                }
                break;
            default:
                qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                Context context = ((kj.a) fVar.f195a).f14444a.f399a;
                context.stopService(new Intent(context, (Class<?>) TaskSdkService.class));
                aj.c cVar = ((kj.a) fVar.f195a).f14444a;
                cVar.f401c = null;
                cj.h hVar = cVar.f405g;
                if (hVar != null) {
                    hVar.J(cVar.f406h);
                }
                cVar.f405g = null;
                cVar.f406h = null;
                if (cVar.f400b) {
                    cVar.f400b = false;
                    cVar.f399a.unbindService(cVar.f404f);
                    break;
                }
                break;
        }
        return b0Var;
    }
}
