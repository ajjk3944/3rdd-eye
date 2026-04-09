package d4;

import lf.t1;
import n0.l1;

/* loaded from: classes.dex */
public final class n extends rq.j implements ar.n {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6848x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6849y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10, pq.c cVar, int i11) {
        super(i10, cVar);
        this.f6848x = i11;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f6848x) {
            case 0:
                n nVar = new n(2, cVar, 0);
                nVar.f6849y = obj;
                return nVar;
            case 1:
                n nVar2 = new n(2, cVar, 1);
                nVar2.f6849y = obj;
                return nVar2;
            case 2:
                n nVar3 = new n(2, cVar, 2);
                nVar3.f6849y = obj;
                return nVar3;
            default:
                n nVar4 = new n(2, cVar, 3);
                nVar4.f6849y = obj;
                return nVar4;
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        switch (this.f6848x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                return Boolean.valueOf(!(((f1) this.f6849y) instanceof m0));
            case 1:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                return Boolean.valueOf(((l1) this.f6849y) == l1.ShutDown);
            case 2:
                qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                io.sentry.android.core.e0.d("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f6849y));
                return lq.b0.f15562a;
            default:
                qq.a aVar4 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                return Boolean.valueOf(((zt.h0) this.f6849y) != zt.h0.START);
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f6848x) {
            case 0:
                return ((n) o((f1) obj, (pq.c) obj2)).q(lq.b0.f15562a);
            case 1:
                return ((n) o((l1) obj, (pq.c) obj2)).q(lq.b0.f15562a);
            case 2:
                n nVar = (n) o((String) obj, (pq.c) obj2);
                lq.b0 b0Var = lq.b0.f15562a;
                nVar.q(b0Var);
                return b0Var;
            default:
                return ((n) o((zt.h0) obj, (pq.c) obj2)).q(lq.b0.f15562a);
        }
    }
}
