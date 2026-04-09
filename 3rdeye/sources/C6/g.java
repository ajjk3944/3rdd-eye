package C6;

import K6.M;
import N7.AbstractC1138d8;
import N7.AbstractC1293o4;
import N7.AbstractC1339r9;
import N7.AbstractC1408w8;
import N7.C1153e8;
import N7.C1185ga;
import N7.C1250l3;
import N7.C1353s9;
import N7.C1362t4;
import N7.C1412wc;
import N7.C9;
import N7.D8;
import N7.H9;
import N7.R6;
import N7.W4;
import N7.W8;
import b9.C1992A;

/* compiled from: ExpressionSubscribers.kt */
/* loaded from: classes.dex */
public final class g {
    public static final void a(i7.k kVar, R6.a aVar, A7.d resolver, p9.l<Object, C1992A> lVar) {
        kotlin.jvm.internal.l.f(kVar, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (aVar == null) {
            return;
        }
        kVar.b(aVar.f6155a.d(resolver, lVar));
        kVar.b(aVar.f6156b.d(resolver, lVar));
    }

    public static final void b(i7.k kVar, AbstractC1293o4 abstractC1293o4, A7.d resolver, p9.l<Object, C1992A> lVar) {
        kotlin.jvm.internal.l.f(kVar, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (abstractC1293o4 == null || !(abstractC1293o4 instanceof AbstractC1293o4.a)) {
            return;
        }
        C1353s9 c1353s9 = ((AbstractC1293o4.a) abstractC1293o4).f8855b;
        kVar.b(c1353s9.f9187a.d(resolver, lVar));
        h(kVar, c1353s9.f9188b, resolver, lVar);
        j(kVar, c1353s9.f9189c, resolver, lVar);
    }

    public static final void c(i7.k kVar, C1362t4 c1362t4, A7.d resolver, p9.l<Object, C1992A> lVar) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (c1362t4 == null) {
            return;
        }
        kVar.b(c1362t4.f9221f.d(resolver, lVar));
        kVar.b(c1362t4.f9216a.d(resolver, lVar));
        A7.b<Long> bVar = c1362t4.f9217b;
        A7.b<Long> bVar2 = c1362t4.f9220e;
        if (bVar2 == null && bVar == null) {
            kVar.b(c1362t4.f9218c.d(resolver, lVar));
            kVar.b(c1362t4.f9219d.d(resolver, lVar));
        } else {
            kVar.b(bVar2 != null ? bVar2.d(resolver, lVar) : null);
            kVar.b(bVar != null ? bVar.d(resolver, lVar) : null);
        }
    }

    public static final void d(i7.k kVar, W4 w42, A7.d resolver, p9.l<Object, C1992A> lVar) {
        kotlin.jvm.internal.l.f(kVar, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (w42 == null) {
            return;
        }
        kVar.b(w42.f7613b.d(resolver, lVar));
        kVar.b(w42.f7612a.d(resolver, lVar));
    }

    public static final void e(i7.k kVar, AbstractC1138d8 abstractC1138d8, A7.d resolver, M m10) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (abstractC1138d8 != null) {
            if (!(abstractC1138d8 instanceof AbstractC1138d8.a)) {
                if (abstractC1138d8 instanceof AbstractC1138d8.b) {
                    kVar.b(((AbstractC1138d8.b) abstractC1138d8).f8076b.f8645a.d(resolver, m10));
                }
            } else {
                C1153e8 c1153e8 = ((AbstractC1138d8.a) abstractC1138d8).f8075b;
                A7.b<Long> bVar = c1153e8.f8164b;
                kVar.b(bVar != null ? bVar.d(resolver, m10) : null);
                kVar.b(c1153e8.f8163a.d(resolver, m10));
            }
        }
    }

    public static final void f(i7.k kVar, AbstractC1408w8 abstractC1408w8, A7.d resolver, p9.l<Object, C1992A> lVar) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (abstractC1408w8 != null) {
            if (abstractC1408w8 instanceof AbstractC1408w8.a) {
                D8 d82 = ((AbstractC1408w8.a) abstractC1408w8).f9724b;
                kVar.b(d82.f5115a.d(resolver, lVar));
                kVar.b(d82.f5116b.d(resolver, lVar));
            } else if (abstractC1408w8 instanceof AbstractC1408w8.b) {
                kVar.b(((AbstractC1408w8.b) abstractC1408w8).f9725b.f5938a.d(resolver, lVar));
            }
        }
    }

    public static final void g(i7.k kVar, W8 w82, A7.d resolver, p9.l<Object, C1992A> lVar) {
        kotlin.jvm.internal.l.f(kVar, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (w82 == null) {
            return;
        }
        A7.b<Integer> bVar = w82.f7619a;
        kVar.b(bVar != null ? bVar.d(resolver, lVar) : null);
        d(kVar, w82.f7620b, resolver, lVar);
        d(kVar, w82.f7622d, resolver, lVar);
        d(kVar, w82.f7621c, resolver, lVar);
        j(kVar, w82.f7623e, resolver, lVar);
    }

    public static final void h(i7.k kVar, AbstractC1339r9 abstractC1339r9, A7.d resolver, p9.l<Object, C1992A> lVar) {
        C1250l3 c1250l3;
        kotlin.jvm.internal.l.f(kVar, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (abstractC1339r9 != null) {
            if (abstractC1339r9 instanceof AbstractC1339r9.b) {
                g(kVar, ((AbstractC1339r9.b) abstractC1339r9).f9080b, resolver, lVar);
                return;
            }
            if (!(abstractC1339r9 instanceof AbstractC1339r9.a) || (c1250l3 = ((AbstractC1339r9.a) abstractC1339r9).f9079b) == null) {
                return;
            }
            A7.b<Integer> bVar = c1250l3.f8727a;
            kVar.b(bVar != null ? bVar.d(resolver, lVar) : null);
            d(kVar, c1250l3.f8728b, resolver, lVar);
            j(kVar, c1250l3.f8729c, resolver, lVar);
        }
    }

    public static final void i(i7.k kVar, C9 c92, A7.d resolver, p9.l<Object, C1992A> lVar) {
        A7.b<H9> bVar;
        A7.b<H9> bVar2;
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (c92 != null) {
            if (c92 instanceof C9.a) {
                W4 w42 = ((C9.a) c92).f5043b;
                kVar.b(w42.f7613b.d(resolver, lVar));
                kVar.b(w42.f7612a.d(resolver, lVar));
                return;
            }
            if (c92 instanceof C9.b) {
                A7.b<Double> bVar3 = ((C9.b) c92).f5044b.f7573a;
                kVar.b(bVar3 != null ? bVar3.d(resolver, lVar) : null);
                return;
            }
            if (c92 instanceof C9.c) {
                C1412wc c1412wc = ((C9.c) c92).f5045b;
                A7.b<Boolean> bVar4 = c1412wc.f9737a;
                kVar.b(bVar4 != null ? bVar4.d(resolver, lVar) : null);
                C1412wc.a aVar = c1412wc.f9739c;
                kVar.b(aVar != null ? aVar.f9742b.d(resolver, lVar) : null);
                kVar.b((aVar == null || (bVar2 = aVar.f9741a) == null) ? null : bVar2.d(resolver, lVar));
                C1412wc.a aVar2 = c1412wc.f9738b;
                kVar.b(aVar2 != null ? aVar2.f9742b.d(resolver, lVar) : null);
                if (aVar2 != null && (bVar = aVar2.f9741a) != null) {
                    dVarD = bVar.d(resolver, lVar);
                }
                kVar.b(dVarD);
            }
        }
    }

    public static final void j(i7.k kVar, C1185ga c1185ga, A7.d resolver, p9.l<Object, C1992A> lVar) {
        kotlin.jvm.internal.l.f(kVar, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (c1185ga == null) {
            return;
        }
        kVar.b(c1185ga.f8299a.d(resolver, lVar));
        kVar.b(c1185ga.f8302d.d(resolver, lVar));
        kVar.b(c1185ga.f8301c.d(resolver, lVar));
    }
}
