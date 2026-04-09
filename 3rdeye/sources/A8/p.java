package A8;

import b9.C1992A;
import p9.InterfaceC5480a;

/* compiled from: RelaunchCoordinator.kt */
/* loaded from: classes3.dex */
public final class p extends P7.s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5480a<C1992A> f154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j4, k kVar, InterfaceC5480a<C1992A> interfaceC5480a) {
        super(j4, 3);
        this.f153c = kVar;
        this.f154d = interfaceC5480a;
    }

    @Override // P7.s
    public final void b() {
        this.f154d.invoke();
    }

    @Override // P7.s
    public final void c(P7.t tVar) {
        this.f154d.invoke();
    }

    @Override // P7.s
    public final void e() {
        this.f153c.f141g = true;
    }
}
