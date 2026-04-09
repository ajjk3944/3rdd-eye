package R0;

/* renamed from: R0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3454g implements InterfaceC3456i {

    /* renamed from: a, reason: collision with root package name */
    private final int f19479a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19480b;

    public C3454g(int i10, int i11) {
        this.f19479a = i10;
        this.f19480b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    @Override // R0.InterfaceC3456i
    public void a(C3459l c3459l) {
        int iJ = c3459l.j();
        int i10 = this.f19480b;
        int iH = iJ + i10;
        if (((iJ ^ iH) & (i10 ^ iH)) < 0) {
            iH = c3459l.h();
        }
        c3459l.b(c3459l.j(), Math.min(iH, c3459l.h()));
        int iK = c3459l.k();
        int i11 = this.f19479a;
        int i12 = iK - i11;
        if (((iK ^ i12) & (i11 ^ iK)) < 0) {
            i12 = 0;
        }
        c3459l.b(Math.max(0, i12), c3459l.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3454g)) {
            return false;
        }
        C3454g c3454g = (C3454g) obj;
        return this.f19479a == c3454g.f19479a && this.f19480b == c3454g.f19480b;
    }

    public int hashCode() {
        return (this.f19479a * 31) + this.f19480b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f19479a + ", lengthAfterCursor=" + this.f19480b + ')';
    }
}
