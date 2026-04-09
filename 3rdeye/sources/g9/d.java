package g9;

import b9.n;
import f9.InterfaceC4347e;
import h9.g;
import kotlin.jvm.internal.l;

/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes3.dex */
public final class d extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC4347e<Object> interfaceC4347e) {
        super(interfaceC4347e);
        l.d(interfaceC4347e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        n.b(obj);
        return obj;
    }
}
