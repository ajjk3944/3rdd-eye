package qq;

import ar.n;
import br.b0;
import br.l;
import lf.t1;
import rq.h;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: d, reason: collision with root package name */
    public int f20954d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f20955g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f20956r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, Object obj, pq.c cVar) {
        super(cVar);
        this.f20955g = nVar;
        this.f20956r = obj;
        l.c(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // rq.a
    public final Object q(Object obj) {
        int i10 = this.f20954d;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f20954d = 2;
            t1.G(obj);
            return obj;
        }
        this.f20954d = 1;
        t1.G(obj);
        n nVar = this.f20955g;
        l.c(nVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        b0.c(2, nVar);
        return nVar.w(this.f20956r, this);
    }
}
