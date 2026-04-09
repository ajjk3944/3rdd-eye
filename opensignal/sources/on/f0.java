package on;

import com.survicate.surveys.entities.models.RespondentEvent;
import java.util.Iterator;
import lf.t1;

/* loaded from: classes.dex */
public final class f0 extends rq.j implements ar.n {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f19614x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g0 f19615y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, pq.c cVar) {
        super(2, cVar);
        this.f19615y = g0Var;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        f0 f0Var = new f0(this.f19615y, cVar);
        f0Var.f19614x = obj;
        return f0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        g0 g0Var = this.f19615y;
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        t1.G(obj);
        wt.t tVar = (wt.t) this.f19614x;
        while (!g0Var.f19621f.isEmpty()) {
            try {
                try {
                    Iterator it = g0Var.f19621f.iterator();
                    while (it.hasNext()) {
                        g0.b(g0Var, (RespondentEvent.SurveySeen) it.next());
                    }
                } catch (Exception e4) {
                    wt.w.j(tVar);
                    ((sm.f) g0Var.f19619d).N(e4, "Error occurred during synchronization of `seen` statuses");
                }
            } catch (Throwable th2) {
                g0Var.f19620e.set(false);
                throw th2;
            }
        }
        ((sm.f) g0Var.f19619d).getClass();
        g0Var.f19620e.set(false);
        return lq.b0.f15562a;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        f0 f0Var = (f0) o((wt.t) obj, (pq.c) obj2);
        lq.b0 b0Var = lq.b0.f15562a;
        f0Var.q(b0Var);
        return b0Var;
    }
}
