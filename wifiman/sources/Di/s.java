package di;

import Bh.AbstractC2514y;
import Bh.G;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.l0;
import Zg.AbstractC3689v;
import Zh.b;
import fi.AbstractC5833e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import pi.AbstractC7346d0;
import pi.B0;
import pi.D0;
import pi.N0;
import pi.S;
import pi.V;
import pi.W;
import pi.r0;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public final class s extends AbstractC5398g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46111b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC5398g a(S argumentType) {
            AbstractC6492s.i(argumentType, "argumentType");
            if (W.a(argumentType)) {
                return null;
            }
            S type = argumentType;
            int i10 = 0;
            while (kotlin.reflect.jvm.internal.impl.builtins.i.c0(type)) {
                type = ((B0) AbstractC3689v.R0(type.L0())).getType();
                i10++;
            }
            InterfaceC2498h interfaceC2498hC = type.N0().c();
            if (interfaceC2498hC instanceof InterfaceC2495e) {
                Zh.b bVarN = AbstractC5833e.n(interfaceC2498hC);
                return bVarN == null ? new s(new b.a(argumentType)) : new s(bVarN, i10);
            }
            if (!(interfaceC2498hC instanceof l0)) {
                return null;
            }
            b.a aVar = Zh.b.f25401d;
            Zh.c cVarL = o.a.f51846b.l();
            AbstractC6492s.h(cVarL, "toSafe(...)");
            return new s(aVar.c(cVarL), 0);
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final S f46112a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(S type) {
                super(null);
                AbstractC6492s.i(type, "type");
                this.f46112a = type;
            }

            public final S a() {
                return this.f46112a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f46112a, ((a) obj).f46112a);
            }

            public int hashCode() {
                return this.f46112a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f46112a + ')';
            }
        }

        /* renamed from: di.s$b$b, reason: collision with other inner class name */
        public static final class C1725b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C5397f f46113a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1725b(C5397f value) {
                super(null);
                AbstractC6492s.i(value, "value");
                this.f46113a = value;
            }

            public final int a() {
                return this.f46113a.c();
            }

            public final Zh.b b() {
                return this.f46113a.d();
            }

            public final C5397f c() {
                return this.f46113a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1725b) && AbstractC6492s.d(this.f46113a, ((C1725b) obj).f46113a);
            }

            public int hashCode() {
                return this.f46113a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f46113a + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b value) {
        super(value);
        AbstractC6492s.i(value, "value");
    }

    @Override // di.AbstractC5398g
    public S a(G module) {
        AbstractC6492s.i(module, "module");
        r0 r0VarJ = r0.f58162b.j();
        InterfaceC2495e interfaceC2495eE = module.q().E();
        AbstractC6492s.h(interfaceC2495eE, "getKClass(...)");
        return V.h(r0VarJ, interfaceC2495eE, AbstractC3689v.e(new D0(c(module))));
    }

    public final S c(G module) {
        AbstractC6492s.i(module, "module");
        b bVar = (b) b();
        if (bVar instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVar instanceof b.C1725b)) {
            throw new NoWhenBranchMatchedException();
        }
        C5397f c5397fC = ((b.C1725b) b()).c();
        Zh.b bVarA = c5397fC.a();
        int iB = c5397fC.b();
        InterfaceC2495e interfaceC2495eB = AbstractC2514y.b(module, bVarA);
        if (interfaceC2495eB == null) {
            return kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.UNRESOLVED_KCLASS_CONSTANT_VALUE, bVarA.toString(), String.valueOf(iB));
        }
        AbstractC7346d0 abstractC7346d0U = interfaceC2495eB.u();
        AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
        S sD = AbstractC7984d.D(abstractC7346d0U);
        for (int i10 = 0; i10 < iB; i10++) {
            sD = module.q().l(N0.INVARIANT, sD);
        }
        return sD;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(C5397f value) {
        this(new b.C1725b(value));
        AbstractC6492s.i(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(Zh.b classId, int i10) {
        this(new C5397f(classId, i10));
        AbstractC6492s.i(classId, "classId");
    }
}
