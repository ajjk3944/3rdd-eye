package Ii;

/* loaded from: classes4.dex */
final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final J f9280a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3069n f9281b;

    public P0(J j10, InterfaceC3069n interfaceC3069n) {
        this.f9280a = j10;
        this.f9281b = interfaceC3069n;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9281b.J(this.f9280a, Yg.J.f24997a);
    }
}
