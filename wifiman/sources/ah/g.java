package Ah;

import Bh.D;
import Bh.EnumC2496f;
import Bh.G;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.g0;
import Dh.C2605k;
import Zg.AbstractC3689v;
import Zg.d0;
import Zh.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class g implements Ch.b {

    /* renamed from: g, reason: collision with root package name */
    private static final Zh.f f798g;

    /* renamed from: h, reason: collision with root package name */
    private static final Zh.b f799h;

    /* renamed from: a, reason: collision with root package name */
    private final G f800a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f801b;

    /* renamed from: c, reason: collision with root package name */
    private final oi.i f802c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ th.l[] f796e = {O.h(new F(O.b(g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d, reason: collision with root package name */
    public static final a f795d = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Zh.c f797f = kotlin.reflect.jvm.internal.impl.builtins.o.f51769A;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Zh.b a() {
            return g.f799h;
        }

        private a() {
        }
    }

    static {
        Zh.d dVar = o.a.f51850d;
        Zh.f fVarI = dVar.i();
        AbstractC6492s.h(fVarI, "shortName(...)");
        f798g = fVarI;
        b.a aVar = Zh.b.f25401d;
        Zh.c cVarL = dVar.l();
        AbstractC6492s.h(cVarL, "toSafe(...)");
        f799h = aVar.c(cVarL);
    }

    public g(oi.n storageManager, G moduleDescriptor, InterfaceC6835l computeContainingDeclaration) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(moduleDescriptor, "moduleDescriptor");
        AbstractC6492s.i(computeContainingDeclaration, "computeContainingDeclaration");
        this.f800a = moduleDescriptor;
        this.f801b = computeContainingDeclaration;
        this.f802c = storageManager.f(new e(this, storageManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.builtins.c d(G module) {
        AbstractC6492s.i(module, "module");
        List listJ = module.y(f797f).J();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.c) {
                arrayList.add(obj);
            }
        }
        return (kotlin.reflect.jvm.internal.impl.builtins.c) AbstractC3689v.q0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2605k h(g gVar, oi.n nVar) {
        C2605k c2605k = new C2605k((InterfaceC2503m) gVar.f801b.invoke(gVar.f800a), f798g, D.ABSTRACT, EnumC2496f.INTERFACE, AbstractC3689v.e(gVar.f800a.q().i()), g0.f1784a, false, nVar);
        c2605k.K0(new Ah.a(nVar, c2605k), d0.e(), null);
        return c2605k;
    }

    private final C2605k i() {
        return (C2605k) oi.m.a(this.f802c, this, f796e[0]);
    }

    @Override // Ch.b
    public boolean a(Zh.c packageFqName, Zh.f name) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        AbstractC6492s.i(name, "name");
        return AbstractC6492s.d(name, f798g) && AbstractC6492s.d(packageFqName, f797f);
    }

    @Override // Ch.b
    public InterfaceC2495e b(Zh.b classId) {
        AbstractC6492s.i(classId, "classId");
        if (AbstractC6492s.d(classId, f799h)) {
            return i();
        }
        return null;
    }

    @Override // Ch.b
    public Collection c(Zh.c packageFqName) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        return AbstractC6492s.d(packageFqName, f797f) ? d0.c(i()) : d0.e();
    }

    public /* synthetic */ g(oi.n nVar, G g10, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, g10, (i10 & 4) != 0 ? f.f794a : interfaceC6835l);
    }
}
