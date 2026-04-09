package dk;

import ck.h;
import nk.k;
import nk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public int f22282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.e f22283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ck.c f22284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ck.c cVar, h hVar, mk.e eVar, ck.c cVar2) {
        super(cVar, hVar);
        this.f22283b = eVar;
        this.f22284c = cVar2;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f22282a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f22282a = 2;
            ci.b.D(obj);
            return obj;
        }
        this.f22282a = 1;
        ci.b.D(obj);
        mk.e eVar = this.f22283b;
        k.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        x.d(2, eVar);
        return eVar.invoke(this.f22284c, this);
    }
}
