package androidx.lifecycle;

/* loaded from: classes.dex */
public final class A extends B implements InterfaceC0296s {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0298u f5170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f5171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C c6, InterfaceC0298u interfaceC0298u, E e6) {
        super(c6, e6);
        this.f5171f = c6;
        this.f5170e = interfaceC0298u;
    }

    @Override // androidx.lifecycle.InterfaceC0296s
    public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
        InterfaceC0298u interfaceC0298u2 = this.f5170e;
        EnumC0292n enumC0292n = interfaceC0298u2.j().f5259d;
        if (enumC0292n == EnumC0292n.f5243a) {
            this.f5171f.i(this.f5172a);
            return;
        }
        EnumC0292n enumC0292n2 = null;
        while (enumC0292n2 != enumC0292n) {
            c(h());
            enumC0292n2 = enumC0292n;
            enumC0292n = interfaceC0298u2.j().f5259d;
        }
    }

    @Override // androidx.lifecycle.B
    public final void f() {
        this.f5170e.j().f(this);
    }

    @Override // androidx.lifecycle.B
    public final boolean g(InterfaceC0298u interfaceC0298u) {
        return this.f5170e == interfaceC0298u;
    }

    @Override // androidx.lifecycle.B
    public final boolean h() {
        return this.f5170e.j().f5259d.compareTo(EnumC0292n.f5246d) >= 0;
    }
}
