package T;

/* renamed from: T.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3554s0 implements InterfaceC3526f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3526f f21248a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21249b;

    /* renamed from: c, reason: collision with root package name */
    private int f21250c;

    public C3554s0(InterfaceC3526f interfaceC3526f, int i10) {
        this.f21248a = interfaceC3526f;
        this.f21249b = i10;
    }

    @Override // T.InterfaceC3526f
    public void a(int i10, int i11) {
        this.f21248a.a(i10 + (this.f21250c == 0 ? this.f21249b : 0), i11);
    }

    @Override // T.InterfaceC3526f
    public Object b() {
        return this.f21248a.b();
    }

    @Override // T.InterfaceC3526f
    public void c(int i10, Object obj) {
        this.f21248a.c(i10 + (this.f21250c == 0 ? this.f21249b : 0), obj);
    }

    @Override // T.InterfaceC3526f
    public void clear() {
        AbstractC3546o.r("Clear is not valid on OffsetApplier");
    }

    @Override // T.InterfaceC3526f
    public void d(Object obj) {
        this.f21250c++;
        this.f21248a.d(obj);
    }

    @Override // T.InterfaceC3526f
    public void f(int i10, int i11, int i12) {
        int i13 = this.f21250c == 0 ? this.f21249b : 0;
        this.f21248a.f(i10 + i13, i11 + i13, i12);
    }

    @Override // T.InterfaceC3526f
    public void g() {
        if (!(this.f21250c > 0)) {
            AbstractC3546o.r("OffsetApplier up called with no corresponding down");
        }
        this.f21250c--;
        this.f21248a.g();
    }

    @Override // T.InterfaceC3526f
    public void h(int i10, Object obj) {
        this.f21248a.h(i10 + (this.f21250c == 0 ? this.f21249b : 0), obj);
    }
}
