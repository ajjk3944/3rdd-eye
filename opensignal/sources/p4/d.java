package p4;

import br.l;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f20249a = c.f20248a;

    public static c a(androidx.fragment.app.b bVar) {
        while (bVar != null) {
            if (bVar.w()) {
                bVar.p();
            }
            bVar = bVar.T;
        }
        return f20249a;
    }

    public static void b(f fVar) {
        if (androidx.fragment.app.d.K(3)) {
            fVar.f20250a.getClass();
        }
    }

    public static final void c(androidx.fragment.app.b bVar, String str) {
        l.e(bVar, "fragment");
        l.e(str, "previousFragmentId");
        b(new a(bVar, "Attempting to reuse fragment " + bVar + " with previous ID " + str));
        a(bVar).getClass();
        b bVar2 = b.PENALTY_LOG;
    }
}
