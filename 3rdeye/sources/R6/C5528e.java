package r6;

import H6.C0675l;
import H6.C0680q;
import K6.C0745n;
import N7.C1154e9;
import N7.C1175g0;
import N7.Vb;
import a7.AbstractC1664a;
import a7.C1665b;
import a7.C1668e;
import h7.C4420a;
import j6.C5195A;
import j6.g;
import j6.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import o6.C5425b;
import s6.o;

/* compiled from: TriggersController.kt */
/* renamed from: r6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5528e {

    /* renamed from: a, reason: collision with root package name */
    public final String f45723a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1664a.c f45724b;

    /* renamed from: c, reason: collision with root package name */
    public final C1668e f45725c;

    /* renamed from: d, reason: collision with root package name */
    public final List<C1175g0> f45726d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Vb.a> f45727e;

    /* renamed from: f, reason: collision with root package name */
    public final C5425b f45728f;

    /* renamed from: g, reason: collision with root package name */
    public final o f45729g;

    /* renamed from: h, reason: collision with root package name */
    public final Q6.c f45730h;
    public final g.a i;

    /* renamed from: j, reason: collision with root package name */
    public final C0745n f45731j;

    /* renamed from: k, reason: collision with root package name */
    public final C0680q f45732k;

    /* renamed from: l, reason: collision with root package name */
    public j6.d f45733l;

    /* renamed from: m, reason: collision with root package name */
    public Vb.a f45734m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45735n;

    /* renamed from: o, reason: collision with root package name */
    public j6.d f45736o;

    /* renamed from: p, reason: collision with root package name */
    public j6.d f45737p;

    /* renamed from: q, reason: collision with root package name */
    public j6.d f45738q;

    /* renamed from: r, reason: collision with root package name */
    public y f45739r;

    public C5528e(String str, AbstractC1664a.c cVar, C1668e c1668e, List list, A7.b mode, C5425b c5425b, o oVar, Q6.c cVar2, g.a logger, C0745n c0745n) {
        l.f(mode, "mode");
        l.f(logger, "logger");
        this.f45723a = str;
        this.f45724b = cVar;
        this.f45725c = c1668e;
        this.f45726d = list;
        this.f45727e = mode;
        this.f45728f = c5425b;
        this.f45729g = oVar;
        this.f45730h = cVar2;
        this.i = logger;
        this.f45731j = c0745n;
        this.f45732k = new C0680q(this, 8);
        this.f45733l = mode.e(c5425b, new C5525b(this));
        this.f45734m = Vb.a.ON_CONDITION;
        j6.c cVar3 = j6.d.f42990m8;
        this.f45736o = cVar3;
        this.f45737p = cVar3;
        this.f45738q = cVar3;
    }

    public final void a(y yVar) {
        this.f45739r = yVar;
        if (yVar == null) {
            this.f45733l.close();
            this.f45736o.close();
            this.f45737p.close();
            this.f45738q.close();
            return;
        }
        this.f45733l.close();
        AbstractC1664a.c cVar = this.f45724b;
        List<String> listC = cVar.c();
        final o oVar = this.f45729g;
        this.f45736o = oVar.b(listC, this.f45732k);
        final List<String> names = cVar.c();
        final E7.a aVar = new E7.a(this, 8);
        oVar.getClass();
        l.f(names, "names");
        for (String str : names) {
            LinkedHashMap linkedHashMap = oVar.f46116f;
            Object c5195a = linkedHashMap.get(str);
            if (c5195a == null) {
                c5195a = new C5195A();
                linkedHashMap.put(str, c5195a);
            }
            ((C5195A) c5195a).b(aVar);
        }
        this.f45737p = new j6.d() { // from class: s6.m
            @Override // java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                List names2 = names;
                kotlin.jvm.internal.l.f(names2, "$names");
                o this$0 = oVar;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                E7.a aVar2 = aVar;
                Iterator it = names2.iterator();
                while (it.hasNext()) {
                    C5195A c5195a2 = (C5195A) this$0.f46116f.get((String) it.next());
                    if (c5195a2 != null) {
                        c5195a2.c(aVar2);
                    }
                }
            }
        };
        C5526c c5526c = new C5526c(this);
        this.f45733l = this.f45727e.e(this.f45728f, c5526c);
        b();
    }

    public final void b() {
        RuntimeException runtimeException;
        C4420a.a();
        y yVar = this.f45739r;
        if (yVar == null) {
            return;
        }
        boolean z10 = yVar instanceof C0675l;
        final C0675l c0675l = z10 ? (C0675l) yVar : null;
        if (c0675l != null) {
            if (!c0675l.getInMiddleOfBind$div_release()) {
                c0675l = null;
            }
            if (c0675l != null) {
                this.f45738q.close();
                final C5527d c5527d = new C5527d(c0675l, this);
                this.f45738q = new j6.d() { // from class: r6.a
                    @Override // java.lang.AutoCloseable, java.io.Closeable
                    public final void close() {
                        C0675l c0675l2 = c0675l;
                        C5527d c5527d2 = c5527d;
                        synchronized (c0675l2.f2167K) {
                            c0675l2.f2201z.c(c5527d2);
                        }
                    }
                };
                synchronized (c0675l.f2167K) {
                    c0675l.f2201z.b(c5527d);
                }
                return;
            }
        }
        try {
            boolean zBooleanValue = ((Boolean) this.f45725c.b(this.f45724b)).booleanValue();
            boolean z11 = this.f45735n;
            this.f45735n = zBooleanValue;
            if (zBooleanValue) {
                if (this.f45734m == Vb.a.ON_CONDITION && z11 && zBooleanValue) {
                    return;
                }
                for (C1175g0 c1175g0 : this.f45726d) {
                    if ((z10 ? (C0675l) yVar : null) != null) {
                        this.i.getClass();
                    }
                }
                this.f45731j.d(yVar, this.f45728f, this.f45726d, "trigger", null);
            }
        } catch (Exception e4) {
            boolean z12 = e4 instanceof ClassCastException;
            String str = this.f45723a;
            if (z12) {
                runtimeException = new RuntimeException(C1154e9.i("Condition evaluated in non-boolean result! (expression: '", str, "')"), e4);
            } else {
                if (!(e4 instanceof C1665b)) {
                    throw e4;
                }
                runtimeException = new RuntimeException(C1154e9.i("Condition evaluation failed! (expression: '", str, "')"), e4);
            }
            this.f45730h.a(runtimeException);
        }
    }
}
