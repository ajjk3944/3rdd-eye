package kotlin.reflect.jvm.internal.impl.types.checker;

import Zg.AbstractC3689v;
import ci.C4266c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import pi.AbstractC7346d0;
import pi.AbstractC7370q;
import pi.B0;
import pi.I;
import pi.L0;
import pi.M0;
import pi.N0;
import pi.Q;
import pi.S;
import pi.V;
import pi.v0;
import ri.EnumC7611b;
import ri.InterfaceC7618i;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public abstract class f extends AbstractC7370q {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52145a = new a();

        private a() {
        }
    }

    /* synthetic */ class b extends AbstractC6489o implements InterfaceC6835l {
        b(Object obj) {
            super(1, obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M0 invoke(InterfaceC7618i p02) {
            AbstractC6492s.i(p02, "p0");
            return ((f) this.receiver).a(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return O.b(f.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }
    }

    private final AbstractC7346d0 c(AbstractC7346d0 abstractC7346d0) {
        S type;
        v0 v0VarN0 = abstractC7346d0.N0();
        Q qS = null;
        m0Q0 = null;
        M0 m0Q0 = null;
        if (!(v0VarN0 instanceof C4266c)) {
            if (!(v0VarN0 instanceof Q) || !abstractC7346d0.O0()) {
                return abstractC7346d0;
            }
            Q q10 = (Q) v0VarN0;
            Collection collectionA = q10.a();
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(collectionA, 10));
            Iterator it = collectionA.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                arrayList.add(AbstractC7984d.B((S) it.next()));
                z10 = true;
            }
            if (z10) {
                S sL = q10.l();
                qS = new Q(arrayList).s(sL != null ? AbstractC7984d.B(sL) : null);
            }
            if (qS != null) {
                q10 = qS;
            }
            return q10.j();
        }
        C4266c c4266c = (C4266c) v0VarN0;
        B0 b0E = c4266c.e();
        if (b0E.a() != N0.IN_VARIANCE) {
            b0E = null;
        }
        if (b0E != null && (type = b0E.getType()) != null) {
            m0Q0 = type.Q0();
        }
        M0 m02 = m0Q0;
        if (c4266c.g() == null) {
            B0 b0E2 = c4266c.e();
            Collection collectionA2 = c4266c.a();
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(collectionA2, 10));
            Iterator it2 = collectionA2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((S) it2.next()).Q0());
            }
            c4266c.i(new n(b0E2, arrayList2, null, 4, null));
        }
        EnumC7611b enumC7611b = EnumC7611b.FOR_SUBTYPING;
        n nVarG = c4266c.g();
        AbstractC6492s.f(nVarG);
        return new i(enumC7611b, nVarG, m02, abstractC7346d0.M0(), abstractC7346d0.O0(), false, 32, null);
    }

    @Override // pi.AbstractC7370q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M0 a(InterfaceC7618i type) {
        M0 m0E;
        AbstractC6492s.i(type, "type");
        if (!(type instanceof S)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        M0 m0Q0 = ((S) type).Q0();
        if (m0Q0 instanceof AbstractC7346d0) {
            m0E = c((AbstractC7346d0) m0Q0);
        } else {
            if (!(m0Q0 instanceof I)) {
                throw new NoWhenBranchMatchedException();
            }
            I i10 = (I) m0Q0;
            AbstractC7346d0 abstractC7346d0C = c(i10.V0());
            AbstractC7346d0 abstractC7346d0C2 = c(i10.W0());
            m0E = (abstractC7346d0C == i10.V0() && abstractC7346d0C2 == i10.W0()) ? m0Q0 : V.e(abstractC7346d0C, abstractC7346d0C2);
        }
        return L0.c(m0E, m0Q0, new b(this));
    }
}
