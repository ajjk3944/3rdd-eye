package r;

/* renamed from: r.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7524d0 implements D {

    /* renamed from: a, reason: collision with root package name */
    private final int f59694a;

    public C7524d0(int i10) {
        this.f59694a = i10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7524d0) && ((C7524d0) obj).f59694a == this.f59694a;
    }

    public int hashCode() {
        return this.f59694a;
    }

    @Override // r.H, r.InterfaceC7533i
    public y0 a(s0 s0Var) {
        return new F0(this.f59694a);
    }
}
