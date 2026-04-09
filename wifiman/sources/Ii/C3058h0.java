package Ii;

/* renamed from: Ii.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3058h0 implements InterfaceC3083u0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9328a;

    public C3058h0(boolean z10) {
        this.f9328a = z10;
    }

    @Override // Ii.InterfaceC3083u0
    public I0 b() {
        return null;
    }

    @Override // Ii.InterfaceC3083u0
    public boolean isActive() {
        return this.f9328a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
