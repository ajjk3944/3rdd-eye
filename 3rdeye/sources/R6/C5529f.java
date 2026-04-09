package r6;

import K6.C0745n;
import N7.Vb;
import a7.AbstractC1664a;
import a7.C1665b;
import a7.C1668e;
import j6.g;
import j6.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import o6.C5425b;
import s6.o;

/* compiled from: TriggersController.kt */
/* renamed from: r6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5529f {

    /* renamed from: a, reason: collision with root package name */
    public final o f45740a;

    /* renamed from: b, reason: collision with root package name */
    public final C5425b f45741b;

    /* renamed from: c, reason: collision with root package name */
    public final C1668e f45742c;

    /* renamed from: d, reason: collision with root package name */
    public final Q6.c f45743d;

    /* renamed from: e, reason: collision with root package name */
    public final g.a f45744e;

    /* renamed from: f, reason: collision with root package name */
    public final C0745n f45745f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f45746g;

    /* renamed from: h, reason: collision with root package name */
    public y f45747h;
    public List<Vb> i;

    public C5529f(o oVar, C5425b c5425b, C1668e c1668e, Q6.c cVar, g.a logger, C0745n c0745n) {
        l.f(logger, "logger");
        this.f45740a = oVar;
        this.f45741b = c5425b;
        this.f45742c = c1668e;
        this.f45743d = cVar;
        this.f45744e = logger;
        this.f45745f = c0745n;
        this.f45746g = new LinkedHashMap();
    }

    public final void a() {
        this.f45747h = null;
        Iterator it = this.f45746g.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
            while (it2.hasNext()) {
                ((C5528e) it2.next()).a(null);
            }
        }
    }

    public final void b(List<Vb> divTriggers) {
        l.f(divTriggers, "divTriggers");
        if (this.i == divTriggers) {
            return;
        }
        this.i = divTriggers;
        y yVar = this.f45747h;
        LinkedHashMap linkedHashMap = this.f45746g;
        Object arrayList = linkedHashMap.get(divTriggers);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(divTriggers, arrayList);
        }
        List list = (List) arrayList;
        a();
        for (Vb vb : divTriggers) {
            String expr = vb.f7600b.b().toString();
            try {
                l.f(expr, "expr");
                AbstractC1664a.c cVar = new AbstractC1664a.c(expr);
                RuntimeException runtimeException = cVar.c().isEmpty() ? new RuntimeException("No variables defined!") : null;
                Q6.c cVar2 = this.f45743d;
                if (runtimeException != null) {
                    cVar2.a(new IllegalStateException("Invalid condition: '" + vb.f7600b + '\'', runtimeException));
                } else {
                    list.add(new C5528e(expr, cVar, this.f45742c, vb.f7599a, vb.f7601c, this.f45741b, this.f45740a, cVar2, this.f45744e, this.f45745f));
                }
            } catch (C1665b unused) {
            }
        }
        if (yVar != null) {
            c(yVar);
        }
    }

    public final void c(y view) {
        List list;
        l.f(view, "view");
        if (l.b(this.f45747h, view)) {
            return;
        }
        this.f45747h = view;
        List<Vb> list2 = this.i;
        if (list2 == null || (list = (List) this.f45746g.get(list2)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C5528e) it.next()).a(view);
        }
    }
}
