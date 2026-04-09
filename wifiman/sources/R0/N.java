package R0;

import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class N implements InterfaceC3456i {

    /* renamed from: a, reason: collision with root package name */
    private final int f19409a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19410b;

    public N(int i10, int i11) {
        this.f19409a = i10;
        this.f19410b = i11;
    }

    @Override // R0.InterfaceC3456i
    public void a(C3459l c3459l) {
        if (c3459l.l()) {
            c3459l.a();
        }
        int iK = AbstractC7978m.k(this.f19409a, 0, c3459l.h());
        int iK2 = AbstractC7978m.k(this.f19410b, 0, c3459l.h());
        if (iK != iK2) {
            if (iK < iK2) {
                c3459l.n(iK, iK2);
            } else {
                c3459l.n(iK2, iK);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return this.f19409a == n10.f19409a && this.f19410b == n10.f19410b;
    }

    public int hashCode() {
        return (this.f19409a * 31) + this.f19410b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f19409a + ", end=" + this.f19410b + ')';
    }
}
