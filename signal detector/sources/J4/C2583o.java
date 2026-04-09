package j4;

import java.io.IOException;
import o4.AbstractC2763b;
import o4.C2762a;
import o4.C2764c;
import x.AbstractC2984e;

/* renamed from: j4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2583o extends g4.z {

    /* renamed from: b, reason: collision with root package name */
    public static final C2582n f21435b = new C2582n(0, new C2583o(g4.x.f20246b));

    /* renamed from: a, reason: collision with root package name */
    public final g4.x f21436a;

    public C2583o(g4.x xVar) {
        this.f21436a = xVar;
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        int iB = c2762a.B();
        int iC = AbstractC2984e.c(iB);
        if (iC == 5 || iC == 6) {
            return this.f21436a.a(c2762a);
        }
        if (iC == 8) {
            c2762a.x();
            return null;
        }
        throw new g4.p("Expecting number, got: " + AbstractC2763b.j(iB) + "; at path " + c2762a.n(false));
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        c2764c.v((Number) obj);
    }
}
