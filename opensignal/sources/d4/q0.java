package d4;

import androidx.datastore.core.NativeSharedCounter;
import lf.t1;

/* loaded from: classes.dex */
public final class q0 extends rq.j implements ar.n {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6864x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u0 f6865y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(u0 u0Var, pq.c cVar, int i10) {
        super(2, cVar);
        this.f6864x = i10;
        this.f6865y = u0Var;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f6864x) {
            case 0:
                return new q0(this.f6865y, cVar, 0);
            default:
                return new q0(this.f6865y, cVar, 1);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) {
        int i10 = this.f6864x;
        NativeSharedCounter nativeSharedCounter = a1.f6765b;
        u0 u0Var = this.f6865y;
        switch (i10) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((a1) u0Var.f6894i.getValue()).f6766a));
            default:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                t1.G(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((a1) u0Var.f6894i.getValue()).f6766a));
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        wt.t tVar = (wt.t) obj;
        pq.c cVar = (pq.c) obj2;
        switch (this.f6864x) {
        }
        return ((q0) o(tVar, cVar)).q(lq.b0.f15562a);
    }
}
