package k6;

import Y5.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: k6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6396c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f51239a = new LinkedHashMap();

    public static /* synthetic */ C6397d b(C6396c c6396c, c.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        return c6396c.a(bVar);
    }

    public static /* synthetic */ void e(C6396c c6396c, float f10, float f11, float f12, float f13, x6.b bVar, c.b bVar2, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            bVar2 = null;
        }
        c6396c.d(f10, f11, f12, f13, bVar, bVar2);
    }

    public final C6397d a(c.b bVar) {
        C6397d c6397d = (C6397d) this.f51239a.get(bVar);
        if (c6397d != null) {
            if (!c6397d.h()) {
                c6397d = null;
            }
            if (c6397d != null) {
                return c6397d;
            }
        }
        Map map = this.f51239a;
        Object c6397d2 = map.get(null);
        if (c6397d2 == null) {
            c6397d2 = new C6397d();
            map.put(null, c6397d2);
        }
        return (C6397d) c6397d2;
    }

    public final void c() {
        Iterator it = this.f51239a.values().iterator();
        while (it.hasNext()) {
            ((C6397d) it.next()).i();
        }
    }

    public final void d(float f10, float f11, float f12, float f13, x6.b chartEntryModel, c.b bVar) {
        AbstractC6492s.i(chartEntryModel, "chartEntryModel");
        Map map = this.f51239a;
        Object c6397d = map.get(bVar);
        if (c6397d == null) {
            c6397d = new C6397d();
            map.put(bVar, c6397d);
        }
        ((C6397d) c6397d).k(Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13), chartEntryModel);
        if (bVar != null) {
            e(this, f10, f11, f12, f13, chartEntryModel, null, 32, null);
            return;
        }
        C6397d c6397dA = a(null);
        for (Map.Entry entry : this.f51239a.entrySet()) {
            c.b bVar2 = (c.b) entry.getKey();
            C6397d c6397d2 = (C6397d) entry.getValue();
            if (bVar2 != null) {
                C6397d.l(c6397d2, Float.valueOf(c6397dA.e()), Float.valueOf(c6397dA.b()), null, null, null, 28, null);
            }
        }
    }
}
