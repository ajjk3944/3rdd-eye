package Ii;

/* renamed from: Ii.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3084v extends C0 implements InterfaceC3082u {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3086w f9358e;

    public C3084v(InterfaceC3086w interfaceC3086w) {
        this.f9358e = interfaceC3086w;
    }

    @Override // Ii.InterfaceC3082u
    public boolean a(Throwable th2) {
        return t().I(th2);
    }

    @Override // Ii.InterfaceC3082u
    public InterfaceC3091y0 getParent() {
        return t();
    }

    @Override // Ii.C0
    public boolean u() {
        return true;
    }

    @Override // Ii.C0
    public void v(Throwable th2) {
        this.f9358e.h(t());
    }
}
