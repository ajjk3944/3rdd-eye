package d4;

import android.view.Choreographer;
import com.opensignal.sdk.domain.model.TaskInfo;
import java.util.ArrayList;
import java.util.Iterator;
import lf.t1;

/* loaded from: classes.dex */
public final class d1 extends rq.j implements ar.n {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6793x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i10, pq.c cVar, int i11) {
        super(i10, cVar);
        this.f6793x = i11;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f6793x) {
            case 0:
                return new d1(2, cVar, 0);
            case 1:
                return new d1(2, cVar, 1);
            default:
                return new d1(2, cVar, 2);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        switch (this.f6793x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                return lq.b0.f15562a;
            case 1:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                boolean z10 = ah.f.f371a;
                ArrayList arrayListE = ch.l.f3962t5.M0().e();
                boolean z11 = false;
                if (!arrayListE.isEmpty()) {
                    Iterator it = arrayListE.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TaskInfo taskInfo = (TaskInfo) it.next();
                            if (taskInfo.f5863d.equals("currently_running_tasks") && br.l.a(taskInfo.f5864g, "manual")) {
                                z11 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z11);
            default:
                qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                return Choreographer.getInstance();
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f6793x) {
            case 0:
                d1 d1Var = (d1) o((zt.g) obj, (pq.c) obj2);
                lq.b0 b0Var = lq.b0.f15562a;
                d1Var.q(b0Var);
                break;
        }
        return ((d1) o((wt.t) obj, (pq.c) obj2)).q(lq.b0.f15562a);
    }
}
