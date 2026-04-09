package rg;

import hg.InterfaceC6043c;

/* loaded from: classes4.dex */
public final class f extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final Throwable f60528a;

    public f(Throwable th2) {
        this.f60528a = th2;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        pVar.c(InterfaceC6043c.n());
        pVar.onError(this.f60528a);
    }
}
