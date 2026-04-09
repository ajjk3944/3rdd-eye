package M;

import l0.AbstractC6532h;
import l0.C6531g;

/* renamed from: M.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3239h implements androidx.compose.ui.window.q {

    /* renamed from: a, reason: collision with root package name */
    private final f0.c f12207a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3241j f12208b;

    /* renamed from: c, reason: collision with root package name */
    private long f12209c = C6531g.f52335b.c();

    public C3239h(f0.c cVar, InterfaceC3241j interfaceC3241j) {
        this.f12207a = cVar;
        this.f12208b = interfaceC3241j;
    }

    @Override // androidx.compose.ui.window.q
    public long a(Y0.p pVar, long j10, Y0.t tVar, long j11) {
        long jA = this.f12208b.a();
        if (!AbstractC6532h.c(jA)) {
            jA = this.f12209c;
        }
        this.f12209c = jA;
        return Y0.n.l(Y0.n.l(pVar.i(), Y0.o.d(jA)), this.f12207a.a(j11, Y0.r.f24545b.a(), tVar));
    }
}
