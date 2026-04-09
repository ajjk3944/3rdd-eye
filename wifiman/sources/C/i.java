package C;

import B.InterfaceC2449m;
import C0.N;
import Zg.AbstractC3689v;

/* loaded from: classes.dex */
public final class i implements InterfaceC2449m {

    /* renamed from: a, reason: collision with root package name */
    private final C f1995a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1996b;

    public i(C c10, int i10) {
        this.f1995a = c10;
        this.f1996b = i10;
    }

    @Override // B.InterfaceC2449m
    public int a() {
        return this.f1995a.F();
    }

    @Override // B.InterfaceC2449m
    public int b() {
        return Math.min(a() - 1, ((f) AbstractC3689v.B0(this.f1995a.C().h())).getIndex() + this.f1996b);
    }

    @Override // B.InterfaceC2449m
    public void c() {
        N nO = this.f1995a.O();
        if (nO != null) {
            nO.j();
        }
    }

    @Override // B.InterfaceC2449m
    public boolean d() {
        return !this.f1995a.C().h().isEmpty();
    }

    @Override // B.InterfaceC2449m
    public int e() {
        return Math.max(0, this.f1995a.y() - this.f1996b);
    }
}
