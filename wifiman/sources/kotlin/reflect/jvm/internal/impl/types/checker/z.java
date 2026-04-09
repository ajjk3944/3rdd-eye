package kotlin.reflect.jvm.internal.impl.types.checker;

import Zg.AbstractC3689v;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6489o;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mh.InterfaceC6839p;
import pi.AbstractC7346d0;
import pi.AbstractC7354h0;
import pi.C7377y;
import pi.L;
import pi.M0;
import pi.Q;
import pi.S;
import pi.r0;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f52176a = new z();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a START = new c("START", 0);
        public static final a ACCEPT_NULL = new C1929a("ACCEPT_NULL", 1);
        public static final a UNKNOWN = new d("UNKNOWN", 2);
        public static final a NOT_NULL = new b("NOT_NULL", 3);

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.z$a$a, reason: collision with other inner class name */
        static final class C1929a extends a {
            C1929a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.z.a
            public a combine(M0 nextType) {
                AbstractC6492s.i(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.z.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b combine(M0 nextType) {
                AbstractC6492s.i(nextType, "nextType");
                return this;
            }
        }

        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.z.a
            public a combine(M0 nextType) {
                AbstractC6492s.i(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.z.a
            public a combine(M0 nextType) {
                AbstractC6492s.i(nextType, "nextType");
                a resultNullability = getResultNullability(nextType);
                return resultNullability == a.ACCEPT_NULL ? this : resultNullability;
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract a combine(M0 m02);

        protected final a getResultNullability(M0 m02) {
            AbstractC6492s.i(m02, "<this>");
            if (m02.O0()) {
                return ACCEPT_NULL;
            }
            if (m02 instanceof C7377y) {
                ((C7377y) m02).Z0();
            }
            return r.f52170a.a(m02) ? NOT_NULL : UNKNOWN;
        }

        private a(String str, int i10) {
        }
    }

    /* synthetic */ class b extends AbstractC6489o implements InterfaceC6839p {
        b(Object obj) {
            super(2, obj);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(S p02, S p12) {
            AbstractC6492s.i(p02, "p0");
            AbstractC6492s.i(p12, "p1");
            return Boolean.valueOf(((z) this.receiver).g(p02, p12));
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return O.b(z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    /* synthetic */ class c extends AbstractC6489o implements InterfaceC6839p {
        c(Object obj) {
            super(2, obj);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(S p02, S p12) {
            AbstractC6492s.i(p02, "p0");
            AbstractC6492s.i(p12, "p1");
            return Boolean.valueOf(((q) this.receiver).b(p02, p12));
        }

        @Override // kotlin.jvm.internal.AbstractC6480f, th.c
        public final String getName() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final th.f getOwner() {
            return O.b(q.class);
        }

        @Override // kotlin.jvm.internal.AbstractC6480f
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    private z() {
    }

    private final Collection c(Collection collection, InterfaceC6839p interfaceC6839p) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        AbstractC6492s.h(it, "iterator(...)");
        while (it.hasNext()) {
            AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC7346d0 abstractC7346d02 = (AbstractC7346d0) it2.next();
                    if (abstractC7346d02 != abstractC7346d0) {
                        AbstractC6492s.f(abstractC7346d02);
                        AbstractC6492s.f(abstractC7346d0);
                        if (((Boolean) interfaceC6839p.invoke(abstractC7346d02, abstractC7346d0)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final AbstractC7346d0 e(Set set) {
        if (set.size() == 1) {
            return (AbstractC7346d0) AbstractC3689v.Q0(set);
        }
        new y(set);
        Set set2 = set;
        Collection collectionC = c(set2, new b(this));
        collectionC.isEmpty();
        AbstractC7346d0 abstractC7346d0B = di.q.f46104f.b(collectionC);
        if (abstractC7346d0B != null) {
            return abstractC7346d0B;
        }
        Collection collectionC2 = c(collectionC, new c(p.f52164b.a()));
        collectionC2.isEmpty();
        return collectionC2.size() < 2 ? (AbstractC7346d0) AbstractC3689v.Q0(collectionC2) : new Q(set2).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + AbstractC3689v.z0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(S s10, S s11) {
        q qVarA = p.f52164b.a();
        return qVarA.c(s10, s11) && !qVarA.c(s11, s10);
    }

    public final AbstractC7346d0 d(List types) {
        AbstractC6492s.i(types, "types");
        types.size();
        ArrayList<AbstractC7346d0> arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) it.next();
            if (abstractC7346d0.N0() instanceof Q) {
                Collection collectionA = abstractC7346d0.N0().a();
                AbstractC6492s.h(collectionA, "getSupertypes(...)");
                Collection<S> collection = collectionA;
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(collection, 10));
                for (S s10 : collection) {
                    AbstractC6492s.f(s10);
                    AbstractC7346d0 abstractC7346d0D = L.d(s10);
                    if (abstractC7346d0.O0()) {
                        abstractC7346d0D = abstractC7346d0D.R0(true);
                    }
                    arrayList2.add(abstractC7346d0D);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC7346d0);
            }
        }
        a aVarCombine = a.START;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVarCombine = aVarCombine.combine((M0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC7346d0 abstractC7346d0I : arrayList) {
            if (aVarCombine == a.NOT_NULL) {
                if (abstractC7346d0I instanceof i) {
                    abstractC7346d0I = AbstractC7354h0.k((i) abstractC7346d0I);
                }
                abstractC7346d0I = AbstractC7354h0.i(abstractC7346d0I, false, 1, null);
            }
            linkedHashSet.add(abstractC7346d0I);
        }
        List list = types;
        ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AbstractC7346d0) it3.next()).M0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((r0) next).q((r0) it4.next());
        }
        return e(linkedHashSet).T0((r0) next);
    }
}
