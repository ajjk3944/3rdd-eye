package g9;

import b9.n;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;
import p9.p;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes3.dex */
public final class c extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public int f37960l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f37961m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f37962n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC4347e interfaceC4347e, InterfaceC4350h interfaceC4350h, p pVar, Object obj) {
        super(interfaceC4347e, interfaceC4350h);
        this.f37961m = pVar;
        this.f37962n = obj;
        l.d(interfaceC4347e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        int i = this.f37960l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f37960l = 2;
            n.b(obj);
            return obj;
        }
        this.f37960l = 1;
        n.b(obj);
        p pVar = this.f37961m;
        l.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        z.b(2, pVar);
        return pVar.invoke(this.f37962n, this);
    }
}
