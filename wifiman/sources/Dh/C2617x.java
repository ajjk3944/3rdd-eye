package Dh;

import Bh.InterfaceC2505o;
import Zg.AbstractC3689v;
import ii.C6155b;
import ii.C6162i;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Dh.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2617x extends AbstractC2607m implements Bh.U {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ th.l[] f3551h = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C2617x.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C2617x.class), "empty", "getEmpty()Z"))};

    /* renamed from: c, reason: collision with root package name */
    private final F f3552c;

    /* renamed from: d, reason: collision with root package name */
    private final Zh.c f3553d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.i f3554e;

    /* renamed from: f, reason: collision with root package name */
    private final oi.i f3555f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6164k f3556g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2617x(F module, Zh.c fqName, oi.n storageManager) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), fqName.h());
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(storageManager, "storageManager");
        this.f3552c = module;
        this.f3553d = fqName;
        this.f3554e = storageManager.f(new C2614u(this));
        this.f3555f = storageManager.f(new C2615v(this));
        this.f3556g = new C6162i(storageManager, new C2616w(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L0(C2617x c2617x) {
        return Bh.S.b(c2617x.u0().M0(), c2617x.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List M0(C2617x c2617x) {
        return Bh.S.c(c2617x.u0().M0(), c2617x.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6164k Q0(C2617x c2617x) {
        if (c2617x.isEmpty()) {
            return InterfaceC6164k.b.f49223b;
        }
        List listJ = c2617x.J();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((Bh.M) it.next()).r());
        }
        List listN0 = AbstractC3689v.N0(arrayList, new P(c2617x.u0(), c2617x.e()));
        return C6155b.f49176d.a("package view scope for " + c2617x.e() + " in " + c2617x.u0().getName(), listN0);
    }

    @Override // Bh.U
    public List J() {
        return (List) oi.m.a(this.f3554e, this, f3551h[0]);
    }

    @Override // Bh.InterfaceC2503m
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public Bh.U b() {
        if (e().d()) {
            return null;
        }
        F fU0 = u0();
        Zh.c cVarE = e().e();
        AbstractC6492s.h(cVarE, "parent(...)");
        return fU0.y(cVarE);
    }

    protected final boolean O0() {
        return ((Boolean) oi.m.a(this.f3555f, this, f3551h[1])).booleanValue();
    }

    @Override // Bh.U
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public F u0() {
        return this.f3552c;
    }

    @Override // Bh.U
    public Zh.c e() {
        return this.f3553d;
    }

    public boolean equals(Object obj) {
        Bh.U u10 = obj instanceof Bh.U ? (Bh.U) obj : null;
        return u10 != null && AbstractC6492s.d(e(), u10.e()) && AbstractC6492s.d(u0(), u10.u0());
    }

    public int hashCode() {
        return (u0().hashCode() * 31) + e().hashCode();
    }

    @Override // Bh.U
    public boolean isEmpty() {
        return O0();
    }

    @Override // Bh.U
    public InterfaceC6164k r() {
        return this.f3556g;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o visitor, Object obj) {
        AbstractC6492s.i(visitor, "visitor");
        return visitor.b(this, obj);
    }
}
