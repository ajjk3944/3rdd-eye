package T6;

import E.u;
import N7.X9;
import N7.Z;
import b9.j;
import c9.C2092m;
import c9.C2099t;
import i7.C4460a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: NewToken.kt */
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: e, reason: collision with root package name */
    public a f12305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i7.b item, int i, a aVar) {
        super(item, i);
        l.f(item, "item");
        this.f12305e = aVar;
    }

    public final List<c> b() {
        Z z10;
        i7.b bVar = this.f12319a;
        A7.d dVar = bVar.f38461b;
        Z z11 = bVar.f38460a;
        boolean z12 = z11 instanceof Z.p;
        C2099t c2099t = C2099t.f18581b;
        if (!z12 && !(z11 instanceof Z.f) && !(z11 instanceof Z.d) && !(z11 instanceof Z.k) && !(z11 instanceof Z.g) && !(z11 instanceof Z.l) && !(z11 instanceof Z.h) && !(z11 instanceof Z.j) && !(z11 instanceof Z.q) && !(z11 instanceof Z.n)) {
            if (z11 instanceof Z.a) {
                return c(C4460a.b(((Z.a) z11).f7813c, dVar));
            }
            if (z11 instanceof Z.b) {
                return c(C4460a.l(C4460a.h(((Z.b) z11).f7814c), dVar));
            }
            if (z11 instanceof Z.e) {
                return c(C4460a.j(((Z.e) z11).f7817c, dVar));
            }
            if (z11 instanceof Z.c) {
                return c(C4460a.c(((Z.c) z11).f7815c, dVar));
            }
            if (z11 instanceof Z.i) {
                return c(C4460a.d(((Z.i) z11).f7821c, dVar));
            }
            if (z11 instanceof Z.o) {
                return c(C4460a.k(((Z.o) z11).f7827c, dVar));
            }
            if (!(z11 instanceof Z.m)) {
                throw new j();
            }
            X9.a aVarC = C6.e.c(((Z.m) z11).f7825c, dVar);
            if (aVarC != null && (z10 = aVarC.f7747c) != null) {
                return c(u.G(C4460a.m(z10, dVar)));
            }
        }
        return c2099t;
    }

    public final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            arrayList.add(new c((i7.b) obj, i, this.f12305e));
            i = i10;
        }
        return arrayList;
    }
}
