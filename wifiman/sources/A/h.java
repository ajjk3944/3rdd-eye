package A;

import B.InterfaceC2449m;
import C0.N;
import Zg.AbstractC3689v;

/* loaded from: classes.dex */
public final class h implements InterfaceC2449m {

    /* renamed from: a, reason: collision with root package name */
    private final B f86a;

    /* renamed from: b, reason: collision with root package name */
    private final int f87b;

    public h(B b10, int i10) {
        this.f86a = b10;
        this.f87b = i10;
    }

    @Override // B.InterfaceC2449m
    public int a() {
        return this.f86a.w().h();
    }

    @Override // B.InterfaceC2449m
    public int b() {
        return Math.min(a() - 1, ((l) AbstractC3689v.B0(this.f86a.w().j())).getIndex() + this.f87b);
    }

    @Override // B.InterfaceC2449m
    public void c() {
        N nD = this.f86a.D();
        if (nD != null) {
            nD.j();
        }
    }

    @Override // B.InterfaceC2449m
    public boolean d() {
        return !this.f86a.w().j().isEmpty();
    }

    @Override // B.InterfaceC2449m
    public int e() {
        return Math.max(0, this.f86a.r() - this.f87b);
    }
}
