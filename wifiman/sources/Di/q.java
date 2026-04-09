package di;

import Bh.G;
import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.AbstractC7346d0;
import pi.D0;
import pi.F0;
import pi.N0;
import pi.S;
import pi.V;
import pi.r0;
import pi.v0;

/* loaded from: classes4.dex */
public final class q implements v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f46104f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f46105a;

    /* renamed from: b, reason: collision with root package name */
    private final G f46106b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f46107c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7346d0 f46108d;

    /* renamed from: e, reason: collision with root package name */
    private final Yg.m f46109e;

    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: di.q$a$a, reason: collision with other inner class name */
        private static final class EnumC1724a {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ EnumC1724a[] $VALUES;
            public static final EnumC1724a COMMON_SUPER_TYPE = new EnumC1724a("COMMON_SUPER_TYPE", 0);
            public static final EnumC1724a INTERSECTION_TYPE = new EnumC1724a("INTERSECTION_TYPE", 1);

            private static final /* synthetic */ EnumC1724a[] $values() {
                return new EnumC1724a[]{COMMON_SUPER_TYPE, INTERSECTION_TYPE};
            }

            static {
                EnumC1724a[] enumC1724aArr$values = $values();
                $VALUES = enumC1724aArr$values;
                $ENTRIES = AbstractC5827b.a(enumC1724aArr$values);
            }

            private EnumC1724a(String str, int i10) {
            }

            public static EnumC1724a valueOf(String str) {
                return (EnumC1724a) Enum.valueOf(EnumC1724a.class, str);
            }

            public static EnumC1724a[] values() {
                return (EnumC1724a[]) $VALUES.clone();
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f46110a;

            static {
                int[] iArr = new int[EnumC1724a.values().length];
                try {
                    iArr[EnumC1724a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1724a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f46110a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AbstractC7346d0 a(Collection collection, EnumC1724a enumC1724a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) it.next();
                next = q.f46104f.e((AbstractC7346d0) next, abstractC7346d0, enumC1724a);
            }
            return (AbstractC7346d0) next;
        }

        private final AbstractC7346d0 c(q qVar, q qVar2, EnumC1724a enumC1724a) {
            Set setV0;
            int i10 = b.f46110a[enumC1724a.ordinal()];
            if (i10 == 1) {
                setV0 = AbstractC3689v.v0(qVar.j(), qVar2.j());
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setV0 = AbstractC3689v.o1(qVar.j(), qVar2.j());
            }
            return V.f(r0.f58162b.j(), new q(qVar.f46105a, qVar.f46106b, setV0, null), false);
        }

        private final AbstractC7346d0 d(q qVar, AbstractC7346d0 abstractC7346d0) {
            if (qVar.j().contains(abstractC7346d0)) {
                return abstractC7346d0;
            }
            return null;
        }

        private final AbstractC7346d0 e(AbstractC7346d0 abstractC7346d0, AbstractC7346d0 abstractC7346d02, EnumC1724a enumC1724a) {
            if (abstractC7346d0 == null || abstractC7346d02 == null) {
                return null;
            }
            v0 v0VarN0 = abstractC7346d0.N0();
            v0 v0VarN02 = abstractC7346d02.N0();
            boolean z10 = v0VarN0 instanceof q;
            if (z10 && (v0VarN02 instanceof q)) {
                return c((q) v0VarN0, (q) v0VarN02, enumC1724a);
            }
            if (z10) {
                return d((q) v0VarN0, abstractC7346d02);
            }
            if (v0VarN02 instanceof q) {
                return d((q) v0VarN02, abstractC7346d0);
            }
            return null;
        }

        public final AbstractC7346d0 b(Collection types) {
            AbstractC6492s.i(types, "types");
            return a(types, EnumC1724a.INTERSECTION_TYPE);
        }

        private a() {
        }
    }

    public /* synthetic */ q(long j10, G g10, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, g10, set);
    }

    private final List k() {
        return (List) this.f46109e.getValue();
    }

    private final boolean l() {
        Collection collectionA = v.a(this.f46106b);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return true;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.f46107c.contains((S) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(q qVar) {
        AbstractC7346d0 abstractC7346d0U = qVar.q().x().u();
        AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
        List listR = AbstractC3689v.r(F0.f(abstractC7346d0U, AbstractC3689v.e(new D0(N0.IN_VARIANCE, qVar.f46108d)), null, 2, null));
        if (!qVar.l()) {
            listR.add(qVar.q().L());
        }
        return listR;
    }

    private final String n() {
        return '[' + AbstractC3689v.z0(this.f46107c, ",", null, null, 0, null, p.f46103a, 30, null) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o(S it) {
        AbstractC6492s.i(it, "it");
        return it.toString();
    }

    @Override // pi.v0
    public Collection a() {
        return k();
    }

    @Override // pi.v0
    public v0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // pi.v0
    public InterfaceC2498h c() {
        return null;
    }

    @Override // pi.v0
    public boolean d() {
        return false;
    }

    @Override // pi.v0
    public List getParameters() {
        return AbstractC3689v.l();
    }

    public final Set j() {
        return this.f46107c;
    }

    @Override // pi.v0
    public kotlin.reflect.jvm.internal.impl.builtins.i q() {
        return this.f46106b.q();
    }

    public String toString() {
        return "IntegerLiteralType" + n();
    }

    private q(long j10, G g10, Set set) {
        this.f46108d = V.f(r0.f58162b.j(), this, false);
        this.f46109e = Yg.n.b(new o(this));
        this.f46105a = j10;
        this.f46106b = g10;
        this.f46107c = set;
    }
}
