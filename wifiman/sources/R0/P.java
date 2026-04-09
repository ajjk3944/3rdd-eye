package R0;

import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class P implements InterfaceC3456i {

    /* renamed from: a, reason: collision with root package name */
    private final int f19413a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19414b;

    public P(int i10, int i11) {
        this.f19413a = i10;
        this.f19414b = i11;
    }

    @Override // R0.InterfaceC3456i
    public void a(C3459l c3459l) {
        int iK = AbstractC7978m.k(this.f19413a, 0, c3459l.h());
        int iK2 = AbstractC7978m.k(this.f19414b, 0, c3459l.h());
        if (iK < iK2) {
            c3459l.p(iK, iK2);
        } else {
            c3459l.p(iK2, iK);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return this.f19413a == p10.f19413a && this.f19414b == p10.f19414b;
    }

    public int hashCode() {
        return (this.f19413a * 31) + this.f19414b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f19413a + ", end=" + this.f19414b + ')';
    }
}
