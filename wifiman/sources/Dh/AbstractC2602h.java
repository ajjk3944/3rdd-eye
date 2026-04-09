package Dh;

import Bh.InterfaceC2498h;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.g0;
import Bh.j0;
import Bh.l0;
import fi.AbstractC5833e;
import ii.C6162i;
import ii.C6177x;
import ii.InterfaceC6164k;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import mh.InterfaceC6824a;
import pi.AbstractC7346d0;
import pi.AbstractC7369p;
import pi.N0;
import pi.r0;
import pi.v0;

/* renamed from: Dh.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2602h extends AbstractC2608n implements l0 {

    /* renamed from: e, reason: collision with root package name */
    private final N0 f3447e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3448f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3449g;

    /* renamed from: h, reason: collision with root package name */
    private final oi.i f3450h;

    /* renamed from: i, reason: collision with root package name */
    private final oi.i f3451i;

    /* renamed from: j, reason: collision with root package name */
    private final oi.n f3452j;

    /* renamed from: Dh.h$a */
    class a implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ oi.n f3453a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f3454b;

        a(oi.n nVar, j0 j0Var) {
            this.f3453a = nVar;
            this.f3454b = j0Var;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0 invoke() {
            return new c(AbstractC2602h.this, this.f3453a, this.f3454b);
        }
    }

    /* renamed from: Dh.h$b */
    class b implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Zh.f f3456a;

        /* renamed from: Dh.h$b$a */
        class a implements InterfaceC6824a {
            a() {
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC6164k invoke() {
                return C6177x.m("Scope for type parameter " + b.this.f3456a.b(), AbstractC2602h.this.getUpperBounds());
            }
        }

        b(Zh.f fVar) {
            this.f3456a = fVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC7346d0 invoke() {
            return pi.V.m(r0.f58162b.j(), AbstractC2602h.this.k(), Collections.emptyList(), false, new C6162i(new a()));
        }
    }

    /* renamed from: Dh.h$c */
    private class c extends AbstractC7369p {

        /* renamed from: d, reason: collision with root package name */
        private final j0 f3459d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC2602h f3460e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC2602h abstractC2602h, oi.n nVar, j0 j0Var) {
            super(nVar);
            if (nVar == null) {
                H(0);
            }
            this.f3460e = abstractC2602h;
            this.f3459d = j0Var;
        }

        private static /* synthetic */ void H(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // pi.AbstractC7374v, pi.v0
        public InterfaceC2498h c() {
            AbstractC2602h abstractC2602h = this.f3460e;
            if (abstractC2602h == null) {
                H(3);
            }
            return abstractC2602h;
        }

        @Override // pi.v0
        public boolean d() {
            return true;
        }

        @Override // pi.v0
        public List getParameters() {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                H(2);
            }
            return listEmptyList;
        }

        @Override // pi.AbstractC7374v
        protected boolean h(InterfaceC2498h interfaceC2498h) {
            if (interfaceC2498h == null) {
                H(9);
            }
            return (interfaceC2498h instanceof l0) && bi.g.f33354a.m(this.f3460e, (l0) interfaceC2498h, true);
        }

        @Override // pi.v0
        public kotlin.reflect.jvm.internal.impl.builtins.i q() {
            kotlin.reflect.jvm.internal.impl.builtins.i iVarM = AbstractC5833e.m(this.f3460e);
            if (iVarM == null) {
                H(4);
            }
            return iVarM;
        }

        @Override // pi.AbstractC7369p
        protected Collection r() {
            List listL0 = this.f3460e.L0();
            if (listL0 == null) {
                H(1);
            }
            return listL0;
        }

        @Override // pi.AbstractC7369p
        protected pi.S s() {
            return kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        public String toString() {
            return this.f3460e.getName().toString();
        }

        @Override // pi.AbstractC7369p
        protected j0 v() {
            j0 j0Var = this.f3459d;
            if (j0Var == null) {
                H(5);
            }
            return j0Var;
        }

        @Override // pi.AbstractC7369p
        protected List x(List list) {
            if (list == null) {
                H(7);
            }
            List listG0 = this.f3460e.G0(list);
            if (listG0 == null) {
                H(8);
            }
            return listG0;
        }

        @Override // pi.AbstractC7369p
        protected void z(pi.S s10) {
            if (s10 == null) {
                H(6);
            }
            this.f3460e.K0(s10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC2602h(oi.n nVar, InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, N0 n02, boolean z10, int i10, g0 g0Var, j0 j0Var) {
        super(interfaceC2503m, hVar, fVar, g0Var);
        if (nVar == null) {
            I(0);
        }
        if (interfaceC2503m == null) {
            I(1);
        }
        if (hVar == null) {
            I(2);
        }
        if (fVar == null) {
            I(3);
        }
        if (n02 == null) {
            I(4);
        }
        if (g0Var == null) {
            I(5);
        }
        if (j0Var == null) {
            I(6);
        }
        this.f3447e = n02;
        this.f3448f = z10;
        this.f3449g = i10;
        this.f3450h = nVar.f(new a(nVar, j0Var));
        this.f3451i = nVar.f(new b(fVar));
        this.f3452j = nVar;
    }

    private static /* synthetic */ void I(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Bh.l0
    public boolean G() {
        return this.f3448f;
    }

    protected List G0(List list) {
        if (list == null) {
            I(12);
        }
        if (list == null) {
            I(13);
        }
        return list;
    }

    protected abstract void K0(pi.S s10);

    protected abstract List L0();

    @Override // Bh.l0
    public oi.n g0() {
        oi.n nVar = this.f3452j;
        if (nVar == null) {
            I(14);
        }
        return nVar;
    }

    @Override // Bh.l0
    public int getIndex() {
        return this.f3449g;
    }

    @Override // Bh.l0
    public List getUpperBounds() {
        List listA = ((c) k()).a();
        if (listA == null) {
            I(8);
        }
        return listA;
    }

    @Override // Bh.l0, Bh.InterfaceC2498h
    public final v0 k() {
        v0 v0Var = (v0) this.f3450h.invoke();
        if (v0Var == null) {
            I(9);
        }
        return v0Var;
    }

    @Override // Bh.l0
    public boolean m0() {
        return false;
    }

    @Override // Bh.l0
    public N0 p() {
        N0 n02 = this.f3447e;
        if (n02 == null) {
            I(7);
        }
        return n02;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return interfaceC2505o.c(this, obj);
    }

    @Override // Bh.InterfaceC2498h
    public AbstractC7346d0 u() {
        AbstractC7346d0 abstractC7346d0 = (AbstractC7346d0) this.f3451i.invoke();
        if (abstractC7346d0 == null) {
            I(10);
        }
        return abstractC7346d0;
    }

    @Override // Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    public l0 a() {
        l0 l0Var = (l0) super.a();
        if (l0Var == null) {
            I(11);
        }
        return l0Var;
    }
}
