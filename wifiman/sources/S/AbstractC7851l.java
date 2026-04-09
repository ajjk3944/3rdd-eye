package s;

import androidx.compose.ui.e;
import j0.AbstractC6234e;
import l0.C6533i;
import l0.C6537m;
import m0.Q0;
import m0.i1;

/* renamed from: s.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7851l {

    /* renamed from: a, reason: collision with root package name */
    private static final float f60772a = Y0.h.j(30);

    /* renamed from: b, reason: collision with root package name */
    private static final androidx.compose.ui.e f60773b;

    /* renamed from: c, reason: collision with root package name */
    private static final androidx.compose.ui.e f60774c;

    /* renamed from: s.l$a */
    public static final class a implements i1 {
        a() {
        }

        @Override // m0.i1
        public Q0 a(long j10, Y0.t tVar, Y0.d dVar) {
            float fX1 = dVar.x1(AbstractC7851l.b());
            return new Q0.b(new C6533i(0.0f, -fX1, C6537m.i(j10), C6537m.g(j10) + fX1));
        }
    }

    /* renamed from: s.l$b */
    public static final class b implements i1 {
        b() {
        }

        @Override // m0.i1
        public Q0 a(long j10, Y0.t tVar, Y0.d dVar) {
            float fX1 = dVar.x1(AbstractC7851l.b());
            return new Q0.b(new C6533i(-fX1, 0.0f, C6537m.i(j10) + fX1, C6537m.g(j10)));
        }
    }

    static {
        e.a aVar = androidx.compose.ui.e.f28771b0;
        f60773b = AbstractC6234e.a(aVar, new a());
        f60774c = AbstractC6234e.a(aVar, new b());
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, w.q qVar) {
        return eVar.b0(qVar == w.q.Vertical ? f60774c : f60773b);
    }

    public static final float b() {
        return f60772a;
    }
}
