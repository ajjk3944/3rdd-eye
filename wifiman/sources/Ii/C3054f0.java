package Ii;

/* renamed from: Ii.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3054f0 implements InterfaceC3067m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3052e0 f9323a;

    public C3054f0(InterfaceC3052e0 interfaceC3052e0) {
        this.f9323a = interfaceC3052e0;
    }

    @Override // Ii.InterfaceC3067m
    public void a(Throwable th2) {
        this.f9323a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f9323a + ']';
    }
}
