package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class w0 extends AbstractFlow {

    /* renamed from: a, reason: collision with root package name */
    public final l9.p f22491a;

    public w0(l9.p pVar) {
        this.f22491a = pVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object c(c cVar, c9.c cVar2) {
        Object objInvoke = this.f22491a.invoke(cVar, cVar2);
        return objInvoke == kotlin.coroutines.intrinsics.a.f() ? objInvoke : y8.s.f25199a;
    }
}
