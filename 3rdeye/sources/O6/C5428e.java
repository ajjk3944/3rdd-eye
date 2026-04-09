package o6;

import C.e0;
import H6.C0675l;
import H6.I;
import K6.C0745n;
import N7.AbstractC1142dc;
import N7.U3;
import N7.Vb;
import X0.n;
import Z6.d;
import a7.C1668e;
import androidx.work.s;
import b7.X0;
import b9.j;
import c9.C2099t;
import i6.C4458a;
import j6.C5195A;
import j6.g;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.l;
import o6.C5425b;
import p6.h;
import q6.C5494c;
import r6.C5529f;
import s6.C5581b;
import s6.k;
import s6.o;
import y9.C5828j;

/* compiled from: ExpressionsRuntimeProvider.kt */
/* renamed from: o6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5428e {

    /* renamed from: a, reason: collision with root package name */
    public final C5581b f44864a;

    /* renamed from: b, reason: collision with root package name */
    public final C0745n f44865b;

    /* renamed from: c, reason: collision with root package name */
    public final Q6.d f44866c;

    /* renamed from: d, reason: collision with root package name */
    public final g.a f44867d;

    /* renamed from: e, reason: collision with root package name */
    public final C5494c f44868e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, C5426c> f44869f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap<C0675l, Set<String>> f44870g;

    public C5428e(C5581b divVariableController, C0745n c0745n, Q6.d dVar, g.a logger, C5494c c5494c) {
        l.f(divVariableController, "divVariableController");
        l.f(logger, "logger");
        this.f44864a = divVariableController;
        this.f44865b = c0745n;
        this.f44866c = dVar;
        this.f44867d = logger;
        this.f44868e = c5494c;
        this.f44869f = Collections.synchronizedMap(new LinkedHashMap());
        this.f44870g = new WeakHashMap<>();
    }

    public final void a(C0675l c0675l) {
        h hVar;
        WeakHashMap<C0675l, Set<String>> weakHashMap = this.f44870g;
        Set<String> set = weakHashMap.get(c0675l);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                C5426c c5426c = this.f44869f.get((String) it.next());
                if (c5426c != null && (hVar = c5426c.f44861e) != null) {
                    hVar.f45225e = false;
                    C5195A<C5426c> c5195a = hVar.f45227g;
                    c5195a.getClass();
                    C5195A.a aVar = new C5195A.a();
                    while (aVar.hasNext()) {
                        C5426c c5426c2 = (C5426c) aVar.next();
                        if (!c5426c2.f44862f) {
                            c5426c2.f44862f = true;
                            C5529f c5529f = c5426c2.f44859c;
                            if (c5529f != null) {
                                c5529f.a();
                            }
                            c5426c2.f44858b.g();
                        }
                    }
                }
            }
        }
        weakHashMap.remove(c0675l);
    }

    public final C5426c b(C4458a tag, U3 data, C0675l div2View) {
        List<AbstractC1142dc> list;
        boolean z10;
        l.f(tag, "tag");
        l.f(data, "data");
        l.f(div2View, "div2View");
        Map<String, C5426c> runtimes = this.f44869f;
        l.e(runtimes, "runtimes");
        String str = tag.f38455a;
        C5426c c5426c = runtimes.get(str);
        Q6.d dVar = this.f44866c;
        List<AbstractC1142dc> list2 = data.f6380g;
        if (c5426c == null) {
            Q6.c cVarA = dVar.a(data, tag);
            o oVar = new o(null);
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    try {
                        oVar.e(s6.c.a((AbstractC1142dc) it.next()));
                    } catch (Z6.e e4) {
                        cVarA.a(e4);
                    }
                }
            }
            s6.e source = this.f44864a.f46089e;
            l.f(source, "source");
            source.b(oVar.f46118h);
            source.d(oVar.i);
            oVar.f46114d.add(source);
            H7.e eVar = new H7.e(X0.f17607b);
            C1668e c1668e = new C1668e(new n(oVar, new e0(18, this, cVarA), eVar, new I(cVarA, 12)));
            g.a aVar = this.f44867d;
            C0745n c0745n = this.f44865b;
            final h hVar = new h(c1668e, cVarA, aVar, c0745n);
            list = list2;
            C5425b c5425b = new C5425b(s.e("dataTag: '", str, '\''), hVar, oVar, c1668e, cVarA, new C5425b.a() { // from class: o6.d
                @Override // o6.C5425b.a
                public final void a(C5425b resolver, k kVar, H7.e functionProvider) {
                    h hVar2 = hVar;
                    l.f(resolver, "resolver");
                    l.f(functionProvider, "functionProvider");
                    hVar2.d(new C5426c(resolver, kVar, null, functionProvider, hVar2));
                }
            });
            C5426c c5426c2 = new C5426c(c5425b, oVar, new C5529f(oVar, c5425b, c1668e, cVarA, this.f44867d, c0745n), eVar, hVar);
            hVar.i = c5426c2;
            hVar.d(c5426c2);
            hVar.f45228h.c(c5426c2, null, "");
            c5426c2.b();
            runtimes.put(str, c5426c2);
            c5426c = c5426c2;
        } else {
            list = list2;
        }
        C5426c c5426c3 = c5426c;
        Q6.c cVarA2 = dVar.a(data, tag);
        WeakHashMap<C0675l, Set<String>> weakHashMap = this.f44870g;
        Set<String> linkedHashSet = weakHashMap.get(div2View);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            weakHashMap.put(div2View, linkedHashSet);
        }
        linkedHashSet.add(str);
        if (list != null) {
            for (AbstractC1142dc abstractC1142dc : list) {
                String strA = C5429f.a(abstractC1142dc);
                k kVar = c5426c3.f44858b;
                Z6.d dVarA = kVar.a(strA);
                if (dVarA == null) {
                    try {
                        kVar.e(s6.c.a(abstractC1142dc));
                    } catch (Z6.e e10) {
                        cVarA2.a(e10);
                    }
                } else {
                    if (abstractC1142dc instanceof AbstractC1142dc.b) {
                        z10 = dVarA instanceof d.b;
                    } else if (abstractC1142dc instanceof AbstractC1142dc.e) {
                        z10 = dVarA instanceof d.f;
                    } else if (abstractC1142dc instanceof AbstractC1142dc.f) {
                        z10 = dVarA instanceof d.e;
                    } else if (abstractC1142dc instanceof AbstractC1142dc.g) {
                        z10 = dVarA instanceof d.g;
                    } else if (abstractC1142dc instanceof AbstractC1142dc.c) {
                        z10 = dVarA instanceof d.c;
                    } else if (abstractC1142dc instanceof AbstractC1142dc.h) {
                        z10 = dVarA instanceof d.h;
                    } else if (abstractC1142dc instanceof AbstractC1142dc.d) {
                        z10 = dVarA instanceof d.C0207d;
                    } else {
                        if (!(abstractC1142dc instanceof AbstractC1142dc.a)) {
                            throw new j();
                        }
                        z10 = dVarA instanceof d.a;
                    }
                    if (!z10) {
                        cVarA2.a(new IllegalArgumentException(C5828j.L("\n                           Variable inconsistency detected!\n                           at DivData: " + C5429f.a(abstractC1142dc) + " (" + abstractC1142dc + ")\n                           at VariableController: " + kVar.a(C5429f.a(abstractC1142dc)) + "\n                        ")));
                    }
                }
            }
        }
        C5529f c5529f = c5426c3.f44859c;
        if (c5529f != null) {
            List<Vb> list3 = data.f6379f;
            if (list3 == null) {
                list3 = C2099t.f18581b;
            }
            c5529f.b(list3);
        }
        return c5426c3;
    }
}
