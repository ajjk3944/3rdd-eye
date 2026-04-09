package ii;

import Bh.EnumC2496f;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.Y;
import Bh.f0;
import Zg.AbstractC3689v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import xi.C8544k;

/* renamed from: ii.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6170q extends AbstractC6165l {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ th.l[] f49226f = {O.h(new F(O.b(C6170q.class), "functions", "getFunctions()Ljava/util/List;")), O.h(new F(O.b(C6170q.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2495e f49227b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f49228c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.i f49229d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.i f49230e;

    public C6170q(oi.n storageManager, InterfaceC2495e containingClass, boolean z10) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(containingClass, "containingClass");
        this.f49227b = containingClass;
        this.f49228c = z10;
        containingClass.h();
        EnumC2496f enumC2496f = EnumC2496f.CLASS;
        this.f49229d = storageManager.f(new C6168o(this));
        this.f49230e = storageManager.f(new C6169p(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(C6170q c6170q) {
        return AbstractC3689v.o(bi.h.g(c6170q.f49227b), bi.h.h(c6170q.f49227b));
    }

    private final List n() {
        return (List) oi.m.a(this.f49229d, this, f49226f[0]);
    }

    private final List o() {
        return (List) oi.m.a(this.f49230e, this, f49226f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(C6170q c6170q) {
        return c6170q.f49228c ? AbstractC3689v.p(bi.h.f(c6170q.f49227b)) : AbstractC3689v.l();
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    public Collection d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        List listO = o();
        C8544k c8544k = new C8544k();
        for (Object obj : listO) {
            if (AbstractC6492s.d(((Y) obj).getName(), name)) {
                c8544k.add(obj);
            }
        }
        return c8544k;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    public /* bridge */ /* synthetic */ InterfaceC2498h g(Zh.f fVar, Ih.b bVar) {
        return (InterfaceC2498h) k(fVar, bVar);
    }

    public Void k(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return null;
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6167n
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public List e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return AbstractC3689v.M0(n(), o());
    }

    @Override // ii.AbstractC6165l, ii.InterfaceC6164k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C8544k b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        List listN = n();
        C8544k c8544k = new C8544k();
        for (Object obj : listN) {
            if (AbstractC6492s.d(((f0) obj).getName(), name)) {
                c8544k.add(obj);
            }
        }
        return c8544k;
    }
}
