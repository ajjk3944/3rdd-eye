package on;

import com.survicate.surveys.entities.models.RespondentEvent;
import java.util.Iterator;
import java.util.List;
import lf.t1;

/* loaded from: classes.dex */
public final class e0 extends rq.j implements ar.n {

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f19610x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g0 f19611y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, pq.c cVar) {
        super(2, cVar);
        this.f19611y = g0Var;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        e0 e0Var = new e0(this.f19611y, cVar);
        e0Var.f19610x = obj;
        return e0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        no.b bVar;
        g0 g0Var = this.f19611y;
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        t1.G(obj);
        wt.t tVar = (wt.t) this.f19610x;
        while (true) {
            try {
                try {
                    List list = g0Var.f19623h;
                    bVar = g0Var.f19619d;
                    if (list.isEmpty()) {
                        break;
                    }
                    Iterator it = g0Var.f19623h.iterator();
                    while (it.hasNext()) {
                        g0.a(g0Var, (RespondentEvent.QuestionAnswered) it.next());
                        ((sm.f) bVar).getClass();
                    }
                } catch (Exception e4) {
                    wt.w.j(tVar);
                    ((sm.f) g0Var.f19619d).N(e4, "Answers synchronization failed - it will retry later");
                }
            } catch (Throwable th2) {
                g0Var.f19622g.set(false);
                throw th2;
            }
        }
        ((sm.f) bVar).getClass();
        g0Var.f19622g.set(false);
        return lq.b0.f15562a;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        e0 e0Var = (e0) o((wt.t) obj, (pq.c) obj2);
        lq.b0 b0Var = lq.b0.f15562a;
        e0Var.q(b0Var);
        return b0Var;
    }
}
