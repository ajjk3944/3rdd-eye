package pi;

import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import ii.C6177x;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import ri.InterfaceC7617h;

/* loaded from: classes4.dex */
public final class Q implements v0, InterfaceC7617h {

    /* renamed from: a, reason: collision with root package name */
    private S f58083a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f58084b;

    /* renamed from: c, reason: collision with root package name */
    private final int f58085c;

    public static final class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f58086a;

        public a(InterfaceC6835l interfaceC6835l) {
            this.f58086a = interfaceC6835l;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            S s10 = (S) obj;
            InterfaceC6835l interfaceC6835l = this.f58086a;
            AbstractC6492s.f(s10);
            String string = interfaceC6835l.invoke(s10).toString();
            S s11 = (S) obj2;
            InterfaceC6835l interfaceC6835l2 = this.f58086a;
            AbstractC6492s.f(s11);
            return AbstractC4260a.e(string, interfaceC6835l2.invoke(s11).toString());
        }
    }

    public Q(Collection typesToIntersect) {
        AbstractC6492s.i(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f58084b = linkedHashSet;
        this.f58085c = linkedHashSet.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7346d0 k(Q q10, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return q10.b(kotlinTypeRefiner).j();
    }

    public static /* synthetic */ String n(Q q10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6835l = O.f58081a;
        }
        return q10.m(interfaceC6835l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(S it) {
        AbstractC6492s.i(it, "it");
        return it.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence p(InterfaceC6835l interfaceC6835l, S s10) {
        AbstractC6492s.f(s10);
        return interfaceC6835l.invoke(s10).toString();
    }

    @Override // pi.v0
    public Collection a() {
        return this.f58084b;
    }

    @Override // pi.v0
    public InterfaceC2498h c() {
        return null;
    }

    @Override // pi.v0
    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return AbstractC6492s.d(this.f58084b, ((Q) obj).f58084b);
        }
        return false;
    }

    @Override // pi.v0
    public List getParameters() {
        return AbstractC3689v.l();
    }

    public int hashCode() {
        return this.f58085c;
    }

    public final InterfaceC6164k i() {
        return C6177x.f49241d.a("member scope for intersection type", this.f58084b);
    }

    public final AbstractC7346d0 j() {
        return V.n(r0.f58162b.j(), this, AbstractC3689v.l(), false, i(), new P(this));
    }

    public final S l() {
        return this.f58083a;
    }

    public final String m(InterfaceC6835l getProperTypeRelatedToStringify) {
        AbstractC6492s.i(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return AbstractC3689v.z0(AbstractC3689v.X0(this.f58084b, new a(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new N(getProperTypeRelatedToStringify), 24, null);
    }

    @Override // pi.v0
    public kotlin.reflect.jvm.internal.impl.builtins.i q() {
        kotlin.reflect.jvm.internal.impl.builtins.i iVarQ = ((S) this.f58084b.iterator().next()).N0().q();
        AbstractC6492s.h(iVarQ, "getBuiltIns(...)");
        return iVarQ;
    }

    @Override // pi.v0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Q b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection collectionA = a();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(collectionA, 10));
        Iterator it = collectionA.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((S) it.next()).X0(kotlinTypeRefiner));
            z10 = true;
        }
        Q qS = null;
        if (z10) {
            S sL = l();
            qS = new Q(arrayList).s(sL != null ? sL.X0(kotlinTypeRefiner) : null);
        }
        return qS == null ? this : qS;
    }

    public final Q s(S s10) {
        return new Q(this.f58084b, s10);
    }

    public String toString() {
        return n(this, null, 1, null);
    }

    private Q(Collection collection, S s10) {
        this(collection);
        this.f58083a = s10;
    }
}
