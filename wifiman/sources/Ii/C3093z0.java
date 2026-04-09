package Ii;

/* renamed from: Ii.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3093z0 extends D0 implements A {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9365c;

    public C3093z0(InterfaceC3091y0 interfaceC3091y0) {
        super(true);
        g0(interfaceC3091y0);
        this.f9365c = N0();
    }

    private final boolean N0() {
        D0 d0T;
        InterfaceC3082u interfaceC3082uX = X();
        C3084v c3084v = interfaceC3082uX instanceof C3084v ? (C3084v) interfaceC3082uX : null;
        if (c3084v != null && (d0T = c3084v.t()) != null) {
            while (!d0T.R()) {
                InterfaceC3082u interfaceC3082uX2 = d0T.X();
                C3084v c3084v2 = interfaceC3082uX2 instanceof C3084v ? (C3084v) interfaceC3082uX2 : null;
                if (c3084v2 == null || (d0T = c3084v2.t()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Ii.D0
    public boolean R() {
        return this.f9365c;
    }

    @Override // Ii.D0
    public boolean V() {
        return true;
    }

    @Override // Ii.A
    public boolean a(Throwable th2) {
        return m0(new C(th2, false, 2, null));
    }
}
