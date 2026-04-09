package qq;

import ar.n;
import br.b0;
import br.l;
import lf.t1;
import pq.h;

/* loaded from: classes.dex */
public final class c extends rq.c {

    /* renamed from: r, reason: collision with root package name */
    public int f20957r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f20958x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f20959y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pq.c cVar, h hVar, n nVar, Object obj) {
        super(cVar, hVar);
        this.f20958x = nVar;
        this.f20959y = obj;
        l.c(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // rq.a
    public final Object q(Object obj) {
        int i10 = this.f20957r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f20957r = 2;
            t1.G(obj);
            return obj;
        }
        this.f20957r = 1;
        t1.G(obj);
        n nVar = this.f20958x;
        l.c(nVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        b0.c(2, nVar);
        return nVar.w(this.f20959y, this);
    }
}
