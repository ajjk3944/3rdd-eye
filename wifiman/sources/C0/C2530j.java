package C0;

/* renamed from: C0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2530j implements B {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2534n f2154a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2536p f2155b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC2537q f2156c;

    public C2530j(InterfaceC2534n interfaceC2534n, EnumC2536p enumC2536p, EnumC2537q enumC2537q) {
        this.f2154a = interfaceC2534n;
        this.f2155b = enumC2536p;
        this.f2156c = enumC2537q;
    }

    @Override // C0.InterfaceC2534n
    public int R(int i10) {
        return this.f2154a.R(i10);
    }

    @Override // C0.InterfaceC2534n
    public int S(int i10) {
        return this.f2154a.S(i10);
    }

    @Override // C0.B
    public androidx.compose.ui.layout.t T(long j10) {
        EnumC2537q enumC2537q = this.f2156c;
        EnumC2537q enumC2537q2 = EnumC2537q.Width;
        int iL = javax.jmdns.impl.constants.d.CLASS_MASK;
        if (enumC2537q == enumC2537q2) {
            int iS = this.f2155b == EnumC2536p.Max ? this.f2154a.S(Y0.b.k(j10)) : this.f2154a.R(Y0.b.k(j10));
            if (Y0.b.g(j10)) {
                iL = Y0.b.k(j10);
            }
            return new C2532l(iS, iL);
        }
        int iS2 = this.f2155b == EnumC2536p.Max ? this.f2154a.s(Y0.b.l(j10)) : this.f2154a.s0(Y0.b.l(j10));
        if (Y0.b.h(j10)) {
            iL = Y0.b.l(j10);
        }
        return new C2532l(iL, iS2);
    }

    @Override // C0.InterfaceC2534n
    public Object b() {
        return this.f2154a.b();
    }

    @Override // C0.InterfaceC2534n
    public int s(int i10) {
        return this.f2154a.s(i10);
    }

    @Override // C0.InterfaceC2534n
    public int s0(int i10) {
        return this.f2154a.s0(i10);
    }
}
