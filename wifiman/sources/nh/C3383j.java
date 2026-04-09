package Nh;

import Bh.AbstractC2514y;
import Bh.InterfaceC2495e;
import Bh.s0;
import Qh.InterfaceC3444a;
import Qh.InterfaceC3445b;
import Qh.InterfaceC3446c;
import Zg.AbstractC3689v;
import di.AbstractC5398g;
import di.C5392a;
import di.C5400i;
import di.C5402k;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.AbstractC7346d0;
import pi.I0;
import pi.N0;

/* renamed from: Nh.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3383j implements Lh.g {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ th.l[] f16516i = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C3383j.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C3383j.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C3383j.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a, reason: collision with root package name */
    private final Mh.k f16517a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3444a f16518b;

    /* renamed from: c, reason: collision with root package name */
    private final oi.j f16519c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.i f16520d;

    /* renamed from: e, reason: collision with root package name */
    private final Ph.a f16521e;

    /* renamed from: f, reason: collision with root package name */
    private final oi.i f16522f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16523g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f16524h;

    public C3383j(Mh.k c10, InterfaceC3444a javaAnnotation, boolean z10) {
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(javaAnnotation, "javaAnnotation");
        this.f16517a = c10;
        this.f16518b = javaAnnotation;
        this.f16519c = c10.e().b(new C3380g(this));
        this.f16520d = c10.e().f(new C3381h(this));
        this.f16521e = c10.a().t().a(javaAnnotation);
        this.f16522f = c10.e().f(new C3382i(this));
        this.f16523g = javaAnnotation.d();
        this.f16524h = javaAnnotation.u() || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map g(C3383j c3383j) {
        Collection<InterfaceC3445b> collectionJ = c3383j.f16518b.j();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3445b interfaceC3445b : collectionJ) {
            Zh.f name = interfaceC3445b.getName();
            if (name == null) {
                name = Jh.I.f10104c;
            }
            AbstractC5398g abstractC5398gN = c3383j.n(interfaceC3445b);
            Yg.s sVarA = abstractC5398gN != null ? Yg.z.a(name, abstractC5398gN) : null;
            if (sVarA != null) {
                arrayList.add(sVarA);
            }
        }
        return Zg.U.r(arrayList);
    }

    private final InterfaceC2495e h(Zh.c cVar) {
        return AbstractC2514y.d(this.f16517a.d(), Zh.b.f25401d.c(cVar), this.f16517a.a().b().f().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Zh.c i(C3383j c3383j) {
        Zh.b bVarB = c3383j.f16518b.b();
        if (bVarB != null) {
            return bVarB.a();
        }
        return null;
    }

    private final AbstractC5398g n(InterfaceC3445b interfaceC3445b) {
        if (interfaceC3445b instanceof Qh.o) {
            return C5400i.f(C5400i.f46097a, ((Qh.o) interfaceC3445b).getValue(), null, 2, null);
        }
        if (interfaceC3445b instanceof Qh.m) {
            Qh.m mVar = (Qh.m) interfaceC3445b;
            return q(mVar.b(), mVar.d());
        }
        if (!(interfaceC3445b instanceof Qh.e)) {
            if (interfaceC3445b instanceof InterfaceC3446c) {
                return o(((InterfaceC3446c) interfaceC3445b).a());
            }
            if (interfaceC3445b instanceof Qh.h) {
                return r(((Qh.h) interfaceC3445b).c());
            }
            return null;
        }
        Qh.e eVar = (Qh.e) interfaceC3445b;
        Zh.f name = eVar.getName();
        if (name == null) {
            name = Jh.I.f10104c;
        }
        AbstractC6492s.f(name);
        return p(name, eVar.e());
    }

    private final AbstractC5398g o(InterfaceC3444a interfaceC3444a) {
        return new C5392a(new C3383j(this.f16517a, interfaceC3444a, false, 4, null));
    }

    private final AbstractC5398g p(Zh.f fVar, List list) {
        pi.S sL;
        if (pi.W.a(getType())) {
            return null;
        }
        InterfaceC2495e interfaceC2495eL = AbstractC5833e.l(this);
        AbstractC6492s.f(interfaceC2495eL);
        s0 s0VarB = Kh.a.b(fVar, interfaceC2495eL);
        if (s0VarB == null || (sL = s0VarB.getType()) == null) {
            sL = this.f16517a.a().m().q().l(N0.INVARIANT, kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            AbstractC6492s.h(sL, "getArrayType(...)");
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC5398g abstractC5398gN = n((InterfaceC3445b) it.next());
            if (abstractC5398gN == null) {
                abstractC5398gN = new di.u();
            }
            arrayList.add(abstractC5398gN);
        }
        return C5400i.f46097a.c(arrayList, sL);
    }

    private final AbstractC5398g q(Zh.b bVar, Zh.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new C5402k(bVar, fVar);
    }

    private final AbstractC5398g r(Qh.x xVar) {
        return di.s.f46111b.a(this.f16517a.g().p(xVar, Oh.b.b(I0.COMMON, false, false, null, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7346d0 s(C3383j c3383j) {
        Zh.c cVarE = c3383j.e();
        if (cVarE == null) {
            return kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, c3383j.f16518b.toString());
        }
        InterfaceC2495e interfaceC2495eF = Ah.d.f(Ah.d.f791a, cVarE, c3383j.f16517a.d().q(), null, 4, null);
        if (interfaceC2495eF == null) {
            Qh.g gVarY = c3383j.f16518b.y();
            interfaceC2495eF = gVarY != null ? c3383j.f16517a.a().n().a(gVarY) : null;
            if (interfaceC2495eF == null) {
                interfaceC2495eF = c3383j.h(cVarE);
            }
        }
        return interfaceC2495eF.u();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return (Map) oi.m.a(this.f16522f, this, f16516i[2]);
    }

    @Override // Lh.g
    public boolean d() {
        return this.f16523g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Zh.c e() {
        return (Zh.c) oi.m.b(this.f16519c, this, f16516i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Ph.a j() {
        return this.f16521e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 getType() {
        return (AbstractC7346d0) oi.m.a(this.f16520d, this, f16516i[1]);
    }

    public final boolean m() {
        return this.f16524h;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.n.Q(kotlin.reflect.jvm.internal.impl.renderer.n.f52068h, this, null, 2, null);
    }

    public /* synthetic */ C3383j(Mh.k kVar, InterfaceC3444a interfaceC3444a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC3444a, (i10 & 4) != 0 ? false : z10);
    }
}
