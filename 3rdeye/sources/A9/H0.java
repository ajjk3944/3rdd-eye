package A9;

import A9.C0605u0;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class H0<T> extends AbstractC0603t0 {

    /* renamed from: f, reason: collision with root package name */
    public final C0605u0.a f189f;

    public H0(C0605u0.a aVar) {
        this.f189f = aVar;
    }

    @Override // A9.InterfaceC0588l0
    public final void a(Throwable th) {
        Object objL = i().L();
        boolean z10 = objL instanceof C0602t;
        C0605u0.a aVar = this.f189f;
        if (z10) {
            aVar.resumeWith(b9.n.a(((C0602t) objL).f272a));
        } else {
            aVar.resumeWith(A0.b(objL));
        }
    }
}
