package Dh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2505o;
import Bh.b0;
import Bh.k0;
import fi.AbstractC5833e;
import ii.C6160g;
import ii.C6173t;
import ii.InterfaceC6164k;
import java.util.Collections;
import java.util.List;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import pi.AbstractC7346d0;
import pi.E0;
import pi.G0;
import pi.J0;

/* renamed from: Dh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2595a extends z {

    /* renamed from: b, reason: collision with root package name */
    private final Zh.f f3429b;

    /* renamed from: c, reason: collision with root package name */
    protected final oi.i f3430c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.i f3431d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.i f3432e;

    /* renamed from: Dh.a$a, reason: collision with other inner class name */
    class C0160a implements InterfaceC6824a {

        /* renamed from: Dh.a$a$a, reason: collision with other inner class name */
        class C0161a implements InterfaceC6835l {
            C0161a() {
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC7346d0 invoke(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
                InterfaceC2498h interfaceC2498hF = gVar.f(AbstractC2595a.this);
                return interfaceC2498hF == null ? (AbstractC7346d0) AbstractC2595a.this.f3430c.invoke() : interfaceC2498hF instanceof k0 ? pi.V.c((k0) interfaceC2498hF, J0.g(interfaceC2498hF.k().getParameters())) : interfaceC2498hF instanceof z ? J0.v(interfaceC2498hF.k().b(gVar), ((z) interfaceC2498hF).i0(gVar), this) : interfaceC2498hF.u();
            }
        }

        C0160a() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC7346d0 invoke() {
            AbstractC2595a abstractC2595a = AbstractC2595a.this;
            return J0.u(abstractC2595a, abstractC2595a.E0(), new C0161a());
        }
    }

    /* renamed from: Dh.a$b */
    class b implements InterfaceC6824a {
        b() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC6164k invoke() {
            return new C6160g(AbstractC2595a.this.E0());
        }
    }

    /* renamed from: Dh.a$c */
    class c implements InterfaceC6824a {
        c() {
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 invoke() {
            return new C2613t(AbstractC2595a.this);
        }
    }

    public AbstractC2595a(oi.n nVar, Zh.f fVar) {
        if (nVar == null) {
            B0(0);
        }
        if (fVar == null) {
            B0(1);
        }
        this.f3429b = fVar;
        this.f3430c = nVar.f(new C0160a());
        this.f3431d = nVar.f(new b());
        this.f3432e = nVar.f(new c());
    }

    private static /* synthetic */ void B0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k E0() {
        InterfaceC6164k interfaceC6164kI0 = i0(AbstractC5833e.r(bi.i.g(this)));
        if (interfaceC6164kI0 == null) {
            B0(17);
        }
        return interfaceC6164kI0;
    }

    @Override // Bh.i0
    /* renamed from: G0 */
    public InterfaceC2495e c(G0 g02) {
        if (g02 == null) {
            B0(18);
        }
        return g02.k() ? this : new C2618y(this, g02);
    }

    @Override // Bh.InterfaceC2495e
    public List H0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            B0(6);
        }
        return listEmptyList;
    }

    @Override // Dh.z
    public InterfaceC6164k I(E0 e02, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (e02 == null) {
            B0(10);
        }
        if (gVar == null) {
            B0(11);
        }
        if (!e02.f()) {
            return new C6173t(i0(gVar), G0.g(e02));
        }
        InterfaceC6164k interfaceC6164kI0 = i0(gVar);
        if (interfaceC6164kI0 == null) {
            B0(12);
        }
        return interfaceC6164kI0;
    }

    @Override // Bh.InterfaceC2495e
    public b0 J0() {
        b0 b0Var = (b0) this.f3432e.invoke();
        if (b0Var == null) {
            B0(5);
        }
        return b0Var;
    }

    @Override // Bh.I
    public Zh.f getName() {
        Zh.f fVar = this.f3429b;
        if (fVar == null) {
            B0(2);
        }
        return fVar;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return interfaceC2505o.l(this, obj);
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2498h
    public AbstractC7346d0 u() {
        AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) this.f3430c.invoke();
        if (abstractC7346d0 == null) {
            B0(20);
        }
        return abstractC7346d0;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k w0(E0 e02) {
        if (e02 == null) {
            B0(15);
        }
        InterfaceC6164k interfaceC6164kI = I(e02, AbstractC5833e.r(bi.i.g(this)));
        if (interfaceC6164kI == null) {
            B0(16);
        }
        return interfaceC6164kI;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k y0() {
        InterfaceC6164k interfaceC6164k = (InterfaceC6164k) this.f3431d.invoke();
        if (interfaceC6164k == null) {
            B0(4);
        }
        return interfaceC6164k;
    }

    @Override // Bh.InterfaceC2503m
    public InterfaceC2495e a() {
        return this;
    }
}
