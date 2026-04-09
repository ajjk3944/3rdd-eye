package g9;

import b9.n;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import kotlin.jvm.internal.l;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes3.dex */
public final class e extends h9.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC4347e<Object> interfaceC4347e, InterfaceC4350h interfaceC4350h) {
        super(interfaceC4347e, interfaceC4350h);
        l.d(interfaceC4347e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        n.b(obj);
        return obj;
    }
}
