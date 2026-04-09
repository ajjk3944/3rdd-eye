package A9;

import F9.C0658a;
import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: Builders.common.kt */
/* loaded from: classes3.dex */
public final class B0<T> extends M<T> {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4347e<C1992A> f183e;

    public B0(InterfaceC4350h interfaceC4350h, p9.p<? super E, ? super InterfaceC4347e<? super T>, ? extends Object> pVar) {
        super(interfaceC4350h, true, false);
        this.f183e = com.google.gson.internal.c.k(pVar, this, this);
    }

    @Override // A9.C0605u0
    public final void Y() {
        try {
            C0658a.a(com.google.gson.internal.c.r(this.f183e), C1992A.f18074a);
        } catch (Throwable th) {
            resumeWith(b9.n.a(th));
            throw th;
        }
    }
}
