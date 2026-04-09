package E9;

import C9.u;
import D9.InterfaceC0645g;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: SendingCollector.kt */
/* loaded from: classes3.dex */
public final class r<T> implements InterfaceC0645g<T> {

    /* renamed from: b, reason: collision with root package name */
    public final u f1573b;

    public r(u uVar) {
        this.f1573b = uVar;
    }

    @Override // D9.InterfaceC0645g
    public final Object emit(T t10, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        Object objM = this.f1573b.m(interfaceC4347e, t10);
        return objM == g9.a.COROUTINE_SUSPENDED ? objM : C1992A.f18074a;
    }
}
