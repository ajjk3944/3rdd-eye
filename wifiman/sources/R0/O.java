package R0;

import L0.C3174d;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class O implements InterfaceC3456i {

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f19411a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19412b;

    public O(C3174d c3174d, int i10) {
        this.f19411a = c3174d;
        this.f19412b = i10;
    }

    @Override // R0.InterfaceC3456i
    public void a(C3459l c3459l) {
        if (c3459l.l()) {
            int iF = c3459l.f();
            c3459l.m(c3459l.f(), c3459l.e(), c());
            if (c().length() > 0) {
                c3459l.n(iF, c().length() + iF);
            }
        } else {
            int iK = c3459l.k();
            c3459l.m(c3459l.k(), c3459l.j(), c());
            if (c().length() > 0) {
                c3459l.n(iK, c().length() + iK);
            }
        }
        int iG = c3459l.g();
        int i10 = this.f19412b;
        c3459l.o(AbstractC7978m.k(i10 > 0 ? (iG + i10) - 1 : (iG + i10) - c().length(), 0, c3459l.h()));
    }

    public final int b() {
        return this.f19412b;
    }

    public final String c() {
        return this.f19411a.k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return AbstractC6492s.d(c(), o10.c()) && this.f19412b == o10.f19412b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f19412b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + c() + "', newCursorPosition=" + this.f19412b + ')';
    }

    public O(String str, int i10) {
        this(new C3174d(str, null, null, 6, null), i10);
    }
}
