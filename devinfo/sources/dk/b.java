package dk;

import ek.h;
import nk.k;
import nk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public int f22279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.e f22280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ck.c f22281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ck.c cVar, ck.c cVar2, mk.e eVar) {
        super(cVar);
        this.f22280b = eVar;
        this.f22281c = cVar2;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f22279a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f22279a = 2;
            ci.b.D(obj);
            return obj;
        }
        this.f22279a = 1;
        ci.b.D(obj);
        mk.e eVar = this.f22280b;
        k.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        x.d(2, eVar);
        return eVar.invoke(this.f22281c, this);
    }
}
