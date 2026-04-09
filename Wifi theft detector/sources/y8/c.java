package y8;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.x;

/* loaded from: classes4.dex */
public final class c extends b implements c9.c {

    /* renamed from: a, reason: collision with root package name */
    public l9.q f25167a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25168b;

    /* renamed from: c, reason: collision with root package name */
    public c9.c f25169c;

    /* renamed from: d, reason: collision with root package name */
    public Object f25170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l9.q block, Object obj) {
        super(null);
        kotlin.jvm.internal.p.e(block, "block");
        this.f25167a = block;
        this.f25168b = obj;
        kotlin.jvm.internal.p.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f25169c = this;
        this.f25170d = kotlin.a.f21919a;
    }

    @Override // y8.b
    public Object a(Object obj, c9.c cVar) {
        kotlin.jvm.internal.p.c(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f25169c = cVar;
        this.f25168b = obj;
        Object objF = kotlin.coroutines.intrinsics.a.f();
        if (objF == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objF;
    }

    public final Object b() {
        while (true) {
            Object obj = this.f25170d;
            c9.c cVar = this.f25169c;
            if (cVar == null) {
                kotlin.c.b(obj);
                return obj;
            }
            if (Result.d(kotlin.a.f21919a, obj)) {
                try {
                    l9.q qVar = this.f25167a;
                    Object obj2 = this.f25168b;
                    Object objE = !(qVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.e(qVar, this, obj2, cVar) : ((l9.q) x.b(qVar, 3)).invoke(this, obj2, cVar);
                    if (objE != kotlin.coroutines.intrinsics.a.f()) {
                        cVar.resumeWith(Result.b(objE));
                    }
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    cVar.resumeWith(Result.b(kotlin.c.a(th)));
                }
            } else {
                this.f25170d = kotlin.a.f21919a;
                cVar.resumeWith(obj);
            }
        }
    }

    @Override // c9.c
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.f21979a;
    }

    @Override // c9.c
    public void resumeWith(Object obj) {
        this.f25169c = null;
        this.f25170d = obj;
    }
}
