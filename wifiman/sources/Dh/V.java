package Dh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.g0;
import Bh.s0;
import Zg.AbstractC3689v;
import di.AbstractC5398g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import pi.G0;

/* loaded from: classes4.dex */
public class V extends X implements s0 {

    /* renamed from: l, reason: collision with root package name */
    public static final a f3416l = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final int f3417f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f3418g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f3419h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f3420i;

    /* renamed from: j, reason: collision with root package name */
    private final pi.S f3421j;

    /* renamed from: k, reason: collision with root package name */
    private final s0 f3422k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final V a(InterfaceC2491a containingDeclaration, s0 s0Var, int i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, Zh.f name, pi.S outType, boolean z10, boolean z11, boolean z12, pi.S s10, g0 source, InterfaceC6824a interfaceC6824a) {
            AbstractC6492s.i(containingDeclaration, "containingDeclaration");
            AbstractC6492s.i(annotations, "annotations");
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(outType, "outType");
            AbstractC6492s.i(source, "source");
            return interfaceC6824a == null ? new V(containingDeclaration, s0Var, i10, annotations, name, outType, z10, z11, z12, s10, source) : new b(containingDeclaration, s0Var, i10, annotations, name, outType, z10, z11, z12, s10, source, interfaceC6824a);
        }

        private a() {
        }
    }

    public static final class b extends V {

        /* renamed from: m, reason: collision with root package name */
        private final Yg.m f3423m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2491a containingDeclaration, s0 s0Var, int i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, Zh.f name, pi.S outType, boolean z10, boolean z11, boolean z12, pi.S s10, g0 source, InterfaceC6824a destructuringVariables) {
            super(containingDeclaration, s0Var, i10, annotations, name, outType, z10, z11, z12, s10, source);
            AbstractC6492s.i(containingDeclaration, "containingDeclaration");
            AbstractC6492s.i(annotations, "annotations");
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(outType, "outType");
            AbstractC6492s.i(source, "source");
            AbstractC6492s.i(destructuringVariables, "destructuringVariables");
            this.f3423m = Yg.n.b(destructuringVariables);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List O0(b bVar) {
            return bVar.P0();
        }

        @Override // Dh.V, Bh.s0
        public s0 E(InterfaceC2491a newOwner, Zh.f newName, int i10) {
            AbstractC6492s.i(newOwner, "newOwner");
            AbstractC6492s.i(newName, "newName");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = getAnnotations();
            AbstractC6492s.h(annotations, "<get-annotations>(...)");
            pi.S type = getType();
            AbstractC6492s.h(type, "getType(...)");
            boolean zS0 = s0();
            boolean zY = Y();
            boolean zW = W();
            pi.S sJ0 = j0();
            g0 NO_SOURCE = g0.f1784a;
            AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
            return new b(newOwner, null, i10, annotations, newName, type, zS0, zY, zW, sJ0, NO_SOURCE, new W(this));
        }

        public final List P0() {
            return (List) this.f3423m.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(InterfaceC2491a containingDeclaration, s0 s0Var, int i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations, Zh.f name, pi.S outType, boolean z10, boolean z11, boolean z12, pi.S s10, g0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        AbstractC6492s.i(containingDeclaration, "containingDeclaration");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(outType, "outType");
        AbstractC6492s.i(source, "source");
        this.f3417f = i10;
        this.f3418g = z10;
        this.f3419h = z11;
        this.f3420i = z12;
        this.f3421j = s10;
        this.f3422k = s0Var == null ? this : s0Var;
    }

    public static final V K0(InterfaceC2491a interfaceC2491a, s0 s0Var, int i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, pi.S s10, boolean z10, boolean z11, boolean z12, pi.S s11, g0 g0Var, InterfaceC6824a interfaceC6824a) {
        return f3416l.a(interfaceC2491a, s0Var, i10, hVar, fVar, s10, z10, z11, z12, s11, g0Var, interfaceC6824a);
    }

    @Override // Bh.s0
    public s0 E(InterfaceC2491a newOwner, Zh.f newName, int i10) {
        AbstractC6492s.i(newOwner, "newOwner");
        AbstractC6492s.i(newName, "newName");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = getAnnotations();
        AbstractC6492s.h(annotations, "<get-annotations>(...)");
        pi.S type = getType();
        AbstractC6492s.h(type, "getType(...)");
        boolean zS0 = s0();
        boolean zY = Y();
        boolean zW = W();
        pi.S sJ0 = j0();
        g0 NO_SOURCE = g0.f1784a;
        AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
        return new V(newOwner, null, i10, annotations, newName, type, zS0, zY, zW, sJ0, NO_SOURCE);
    }

    public Void L0() {
        return null;
    }

    @Override // Bh.i0
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public s0 c(G0 substitutor) {
        AbstractC6492s.i(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // Bh.t0
    public /* bridge */ /* synthetic */ AbstractC5398g V() {
        return (AbstractC5398g) L0();
    }

    @Override // Bh.s0
    public boolean W() {
        return this.f3420i;
    }

    @Override // Bh.s0
    public boolean Y() {
        return this.f3419h;
    }

    @Override // Bh.InterfaceC2491a
    public Collection f() {
        Collection collectionF = b().f();
        AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
        Collection collection = collectionF;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((s0) ((InterfaceC2491a) it.next()).i().get(getIndex()));
        }
        return arrayList;
    }

    @Override // Bh.s0
    public int getIndex() {
        return this.f3417f;
    }

    @Override // Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u LOCAL = AbstractC2509t.f1797f;
        AbstractC6492s.h(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // Bh.t0
    public boolean h0() {
        return false;
    }

    @Override // Bh.s0
    public pi.S j0() {
        return this.f3421j;
    }

    @Override // Bh.s0
    public boolean s0() {
        if (this.f3418g) {
            InterfaceC2491a interfaceC2491aB = b();
            AbstractC6492s.g(interfaceC2491aB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((InterfaceC2492b) interfaceC2491aB).h().isReal()) {
                return true;
            }
        }
        return false;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o visitor, Object obj) {
        AbstractC6492s.i(visitor, "visitor");
        return visitor.d(this, obj);
    }

    @Override // Dh.AbstractC2608n, Bh.InterfaceC2503m
    public InterfaceC2491a b() {
        InterfaceC2503m interfaceC2503mB = super.b();
        AbstractC6492s.g(interfaceC2503mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC2491a) interfaceC2503mB;
    }

    @Override // Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    public s0 a() {
        s0 s0Var = this.f3422k;
        return s0Var == this ? this : s0Var.a();
    }
}
