package R0;

/* renamed from: R0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3455h implements InterfaceC3456i {

    /* renamed from: a, reason: collision with root package name */
    private final int f19481a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19482b;

    public C3455h(int i10, int i11) {
        this.f19481a = i10;
        this.f19482b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    @Override // R0.InterfaceC3456i
    public void a(C3459l c3459l) {
        int i10 = this.f19481a;
        int i11 = 0;
        int i12 = 0;
        int iK = 0;
        while (true) {
            if (i12 < i10) {
                int i13 = iK + 1;
                if (c3459l.k() <= i13) {
                    iK = c3459l.k();
                    break;
                } else {
                    iK = AbstractC3457j.b(c3459l.c((c3459l.k() - i13) + (-1)), c3459l.c(c3459l.k() - i13)) ? iK + 2 : i13;
                    i12++;
                }
            } else {
                break;
            }
        }
        int i14 = this.f19482b;
        int iH = 0;
        while (true) {
            if (i11 >= i14) {
                break;
            }
            int i15 = iH + 1;
            if (c3459l.j() + i15 >= c3459l.h()) {
                iH = c3459l.h() - c3459l.j();
                break;
            } else {
                iH = AbstractC3457j.b(c3459l.c((c3459l.j() + i15) + (-1)), c3459l.c(c3459l.j() + i15)) ? iH + 2 : i15;
                i11++;
            }
        }
        c3459l.b(c3459l.j(), c3459l.j() + iH);
        c3459l.b(c3459l.k() - iK, c3459l.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3455h)) {
            return false;
        }
        C3455h c3455h = (C3455h) obj;
        return this.f19481a == c3455h.f19481a && this.f19482b == c3455h.f19482b;
    }

    public int hashCode() {
        return (this.f19481a * 31) + this.f19482b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f19481a + ", lengthAfterCursor=" + this.f19482b + ')';
    }
}
