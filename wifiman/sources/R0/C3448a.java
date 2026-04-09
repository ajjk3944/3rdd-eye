package R0;

import L0.C3174d;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* renamed from: R0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3448a implements InterfaceC3456i {

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f19450a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19451b;

    public C3448a(C3174d c3174d, int i10) {
        this.f19450a = c3174d;
        this.f19451b = i10;
    }

    @Override // R0.InterfaceC3456i
    public void a(C3459l c3459l) {
        if (c3459l.l()) {
            c3459l.m(c3459l.f(), c3459l.e(), c());
        } else {
            c3459l.m(c3459l.k(), c3459l.j(), c());
        }
        int iG = c3459l.g();
        int i10 = this.f19451b;
        c3459l.o(AbstractC7978m.k(i10 > 0 ? (iG + i10) - 1 : (iG + i10) - c().length(), 0, c3459l.h()));
    }

    public final int b() {
        return this.f19451b;
    }

    public final String c() {
        return this.f19450a.k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3448a)) {
            return false;
        }
        C3448a c3448a = (C3448a) obj;
        return AbstractC6492s.d(c(), c3448a.c()) && this.f19451b == c3448a.f19451b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f19451b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + c() + "', newCursorPosition=" + this.f19451b + ')';
    }

    public C3448a(String str, int i10) {
        this(new C3174d(str, null, null, 6, null), i10);
    }
}
