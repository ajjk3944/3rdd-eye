package Qe;

import Li.P;
import Li.z;
import Qe.c;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final List f19310a;

    /* renamed from: b, reason: collision with root package name */
    private c.a f19311b;

    /* renamed from: c, reason: collision with root package name */
    private final z f19312c;

    /* renamed from: d, reason: collision with root package name */
    private final z f19313d;

    /* renamed from: e, reason: collision with root package name */
    private final z f19314e;

    public b(c.a initialTab) {
        AbstractC6492s.i(initialTab, "initialTab");
        this.f19310a = c.f19315a.b();
        this.f19311b = initialTab;
        this.f19312c = P.a(initialTab);
        this.f19313d = P.a(i());
        this.f19314e = P.a(Boolean.valueOf(m()));
    }

    private final J9.a g(c.a aVar, boolean z10) {
        return new J9.a(aVar.ordinal(), aVar.getTitle(), z10 ? aVar.getIconSelected() : aVar.getIcon(), z10, null, null, 48, null);
    }

    private final J9.j i() {
        List<c.a> list = this.f19310a;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (c.a aVar : list) {
            arrayList.add(g(aVar, aVar == this.f19311b));
        }
        return new J9.j(arrayList);
    }

    private final boolean m() {
        return this.f19311b != c.f19315a.a();
    }

    @Override // Qe.d
    public void a() {
        n(c.f19315a.a());
    }

    @Override // Qe.d
    public void b(int i10) {
        Object next;
        Iterator it = this.f19310a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((c.a) next).ordinal() == i10) {
                    break;
                }
            }
        }
        c.a aVar = (c.a) next;
        if (aVar != null) {
            n(aVar);
        }
    }

    @Override // Qe.d
    public void f(c.a aVar) {
        if (aVar == null) {
            aVar = c.f19315a.a();
        }
        n(aVar);
    }

    @Override // Qe.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public z c() {
        return this.f19312c;
    }

    @Override // Qe.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public z d() {
        return this.f19313d;
    }

    public final c.a k() {
        return this.f19311b;
    }

    @Override // Qe.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public z e() {
        return this.f19314e;
    }

    public final void n(c.a value) {
        AbstractC6492s.i(value, "value");
        this.f19311b = value;
        J9.j jVarI = i();
        if (!AbstractC6492s.d(d().getValue(), jVarI)) {
            d().setValue(jVarI);
        }
        if (c().getValue() != value) {
            c().setValue(value);
        }
        boolean zM = m();
        if (((Boolean) e().getValue()).booleanValue() != zM) {
            e().setValue(Boolean.valueOf(zM));
        }
    }

    public /* synthetic */ b(c.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? c.f19315a.a() : aVar);
    }
}
