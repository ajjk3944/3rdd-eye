package kotlin.reflect.jvm.internal.impl.types.checker;

import Bh.InterfaceC2498h;
import Bh.l0;
import Zg.AbstractC3689v;
import ci.InterfaceC4265b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import pi.B0;
import pi.M0;
import pi.S;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public final class n implements InterfaceC4265b {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f52159a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6824a f52160b;

    /* renamed from: c, reason: collision with root package name */
    private final n f52161c;

    /* renamed from: d, reason: collision with root package name */
    private final l0 f52162d;

    /* renamed from: e, reason: collision with root package name */
    private final Yg.m f52163e;

    public n(B0 projection, InterfaceC6824a interfaceC6824a, n nVar, l0 l0Var) {
        AbstractC6492s.i(projection, "projection");
        this.f52159a = projection;
        this.f52160b = interfaceC6824a;
        this.f52161c = nVar;
        this.f52162d = l0Var;
        this.f52163e = Yg.n.a(Yg.q.PUBLICATION, new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(n nVar) {
        InterfaceC6824a interfaceC6824a = nVar.f52160b;
        if (interfaceC6824a != null) {
            return (List) interfaceC6824a.invoke();
        }
        return null;
    }

    private final List m() {
        return (List) this.f52163e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(n nVar, g gVar) {
        List listA = nVar.a();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((M0) it.next()).X0(gVar));
        }
        return arrayList;
    }

    @Override // pi.v0
    public InterfaceC2498h c() {
        return null;
    }

    @Override // pi.v0
    public boolean d() {
        return false;
    }

    @Override // ci.InterfaceC4265b
    public B0 e() {
        return this.f52159a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        n nVar = (n) obj;
        n nVar2 = this.f52161c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f52161c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        return nVar2 == obj;
    }

    @Override // pi.v0
    public List getParameters() {
        return AbstractC3689v.l();
    }

    public int hashCode() {
        n nVar = this.f52161c;
        return nVar != null ? nVar.hashCode() : super.hashCode();
    }

    @Override // pi.v0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public List a() {
        List listM = m();
        return listM == null ? AbstractC3689v.l() : listM;
    }

    public final void n(List supertypes) {
        AbstractC6492s.i(supertypes, "supertypes");
        this.f52160b = new l(supertypes);
    }

    @Override // pi.v0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public n b(g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0B = e().b(kotlinTypeRefiner);
        AbstractC6492s.h(b0B, "refine(...)");
        m mVar = this.f52160b != null ? new m(this, kotlinTypeRefiner) : null;
        n nVar = this.f52161c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(b0B, mVar, nVar, this.f52162d);
    }

    @Override // pi.v0
    public kotlin.reflect.jvm.internal.impl.builtins.i q() {
        S type = e().getType();
        AbstractC6492s.h(type, "getType(...)");
        return AbstractC7984d.n(type);
    }

    public String toString() {
        return "CapturedType(" + e() + ')';
    }

    public /* synthetic */ n(B0 b02, InterfaceC6824a interfaceC6824a, n nVar, l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, (i10 & 2) != 0 ? null : interfaceC6824a, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : l0Var);
    }

    public /* synthetic */ n(B0 b02, List list, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, list, (i10 & 4) != 0 ? null : nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(B0 projection, List supertypes, n nVar) {
        this(projection, new k(supertypes), nVar, null, 8, null);
        AbstractC6492s.i(projection, "projection");
        AbstractC6492s.i(supertypes, "supertypes");
    }
}
