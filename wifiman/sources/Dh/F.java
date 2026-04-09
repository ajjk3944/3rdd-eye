package Dh;

import Bh.G;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Dh.I;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.d0;
import ai.AbstractC3859a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class F extends AbstractC2607m implements Bh.G {

    /* renamed from: c, reason: collision with root package name */
    private final oi.n f3332c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.builtins.i f3333d;

    /* renamed from: e, reason: collision with root package name */
    private final Zh.f f3334e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f3335f;

    /* renamed from: g, reason: collision with root package name */
    private final I f3336g;

    /* renamed from: h, reason: collision with root package name */
    private B f3337h;

    /* renamed from: i, reason: collision with root package name */
    private Bh.N f3338i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3339j;

    /* renamed from: k, reason: collision with root package name */
    private final oi.g f3340k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f3341l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(Zh.f moduleName, oi.n storageManager, kotlin.reflect.jvm.internal.impl.builtins.i builtIns, AbstractC3859a abstractC3859a) {
        this(moduleName, storageManager, builtIns, abstractC3859a, null, null, 48, null);
        AbstractC6492s.i(moduleName, "moduleName");
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(builtIns, "builtIns");
    }

    private final String L0() {
        String string = getName().toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    private final C2606l N0() {
        return (C2606l) this.f3341l.getValue();
    }

    private final boolean P0() {
        return this.f3338i != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2606l R0(F f10) {
        B b10 = f10.f3337h;
        if (b10 == null) {
            throw new AssertionError("Dependencies of module " + f10.L0() + " were not set before querying module content");
        }
        List listA = b10.a();
        f10.K0();
        listA.contains(f10);
        List list = listA;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((F) it.next()).P0();
        }
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Bh.N n10 = ((F) it2.next()).f3338i;
            AbstractC6492s.f(n10);
            arrayList.add(n10);
        }
        return new C2606l(arrayList, "CompositeProvider@ModuleDescriptor for " + f10.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bh.U S0(F f10, Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return f10.f3336g.a(f10, fqName, f10.f3332c);
    }

    @Override // Bh.G
    public boolean K(Bh.G targetModule) {
        AbstractC6492s.i(targetModule, "targetModule");
        if (AbstractC6492s.d(this, targetModule)) {
            return true;
        }
        B b10 = this.f3337h;
        AbstractC6492s.f(b10);
        return AbstractC3689v.f0(b10.b(), targetModule) || r0().contains(targetModule) || targetModule.r0().contains(this);
    }

    public void K0() {
        if (Q0()) {
            return;
        }
        Bh.B.a(this);
    }

    public final Bh.N M0() {
        K0();
        return N0();
    }

    public final void O0(Bh.N providerForModuleContent) {
        AbstractC6492s.i(providerForModuleContent, "providerForModuleContent");
        P0();
        this.f3338i = providerForModuleContent;
    }

    public boolean Q0() {
        return this.f3339j;
    }

    public final void T0(B dependencies) {
        AbstractC6492s.i(dependencies, "dependencies");
        this.f3337h = dependencies;
    }

    public final void U0(List descriptors) {
        AbstractC6492s.i(descriptors, "descriptors");
        V0(descriptors, d0.e());
    }

    public final void V0(List descriptors, Set friends) {
        AbstractC6492s.i(descriptors, "descriptors");
        AbstractC6492s.i(friends, "friends");
        T0(new C(descriptors, friends, AbstractC3689v.l(), d0.e()));
    }

    public final void W0(F... descriptors) {
        AbstractC6492s.i(descriptors, "descriptors");
        U0(AbstractC3682n.d1(descriptors));
    }

    @Override // Bh.InterfaceC2503m
    public InterfaceC2503m b() {
        return G.a.b(this);
    }

    @Override // Bh.G
    public Object b0(Bh.F capability) {
        AbstractC6492s.i(capability, "capability");
        Object obj = this.f3335f.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // Bh.G
    public kotlin.reflect.jvm.internal.impl.builtins.i q() {
        return this.f3333d;
    }

    @Override // Bh.G
    public List r0() {
        B b10 = this.f3337h;
        if (b10 != null) {
            return b10.c();
        }
        throw new AssertionError("Dependencies of module " + L0() + " were not set");
    }

    @Override // Bh.G
    public Collection s(Zh.c fqName, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(nameFilter, "nameFilter");
        K0();
        return M0().s(fqName, nameFilter);
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return G.a.a(this, interfaceC2505o, obj);
    }

    @Override // Dh.AbstractC2607m
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!Q0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        Bh.N n10 = this.f3338i;
        sb2.append(n10 != null ? n10.getClass().getSimpleName() : null);
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    @Override // Bh.G
    public Bh.U y(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        K0();
        return (Bh.U) this.f3340k.invoke(fqName);
    }

    public /* synthetic */ F(Zh.f fVar, oi.n nVar, kotlin.reflect.jvm.internal.impl.builtins.i iVar, AbstractC3859a abstractC3859a, Map map, Zh.f fVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, nVar, iVar, (i10 & 8) != 0 ? null : abstractC3859a, (i10 & 16) != 0 ? Zg.U.h() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Zh.f moduleName, oi.n storageManager, kotlin.reflect.jvm.internal.impl.builtins.i builtIns, AbstractC3859a abstractC3859a, Map capabilities, Zh.f fVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), moduleName);
        AbstractC6492s.i(moduleName, "moduleName");
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(builtIns, "builtIns");
        AbstractC6492s.i(capabilities, "capabilities");
        this.f3332c = storageManager;
        this.f3333d = builtIns;
        this.f3334e = fVar;
        if (moduleName.j()) {
            this.f3335f = capabilities;
            I i10 = (I) b0(I.f3352a.a());
            this.f3336g = i10 == null ? I.b.f3355b : i10;
            this.f3339j = true;
            this.f3340k = storageManager.e(new D(this));
            this.f3341l = Yg.n.b(new E(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
