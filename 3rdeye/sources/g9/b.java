package g9;

import b9.n;
import f9.InterfaceC4347e;
import h9.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import p9.p;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes3.dex */
public final class b extends g {

    /* renamed from: l, reason: collision with root package name */
    public int f37957l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f37958m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f37959n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, Object obj, InterfaceC4347e interfaceC4347e) {
        super(interfaceC4347e);
        this.f37958m = pVar;
        this.f37959n = obj;
        l.d(interfaceC4347e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        int i = this.f37957l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f37957l = 2;
            n.b(obj);
            return obj;
        }
        this.f37957l = 1;
        n.b(obj);
        p pVar = this.f37958m;
        l.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        z.b(2, pVar);
        return pVar.invoke(this.f37959n, this);
    }
}
