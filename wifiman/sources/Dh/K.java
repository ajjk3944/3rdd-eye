package Dh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.InterfaceC2512w;
import Bh.InterfaceC2515z;
import Bh.Z;
import Bh.a0;
import Bh.b0;
import Bh.g0;
import Bh.s0;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ji.C6342c;
import ji.C6343d;
import ji.InterfaceC6345f;
import mh.InterfaceC6824a;
import pi.AbstractC7335C;
import pi.E0;
import pi.G0;
import pi.N0;
import xi.C8545l;

/* loaded from: classes4.dex */
public class K extends Y implements Bh.Y {

    /* renamed from: A, reason: collision with root package name */
    private InterfaceC2512w f3364A;

    /* renamed from: B, reason: collision with root package name */
    private InterfaceC2512w f3365B;

    /* renamed from: i, reason: collision with root package name */
    private final Bh.D f3366i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC2510u f3367j;

    /* renamed from: k, reason: collision with root package name */
    private Collection f3368k;

    /* renamed from: l, reason: collision with root package name */
    private final Bh.Y f3369l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC2492b.a f3370m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f3371n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f3372o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f3373p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f3374q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f3375r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f3376s;

    /* renamed from: t, reason: collision with root package name */
    private List f3377t;

    /* renamed from: u, reason: collision with root package name */
    private b0 f3378u;

    /* renamed from: v, reason: collision with root package name */
    private b0 f3379v;

    /* renamed from: w, reason: collision with root package name */
    private List f3380w;

    /* renamed from: x, reason: collision with root package name */
    private L f3381x;

    /* renamed from: y, reason: collision with root package name */
    private a0 f3382y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f3383z;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC2503m f3384a;

        /* renamed from: b, reason: collision with root package name */
        private Bh.D f3385b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC2510u f3386c;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC2492b.a f3389f;

        /* renamed from: i, reason: collision with root package name */
        private b0 f3392i;

        /* renamed from: k, reason: collision with root package name */
        private Zh.f f3394k;

        /* renamed from: l, reason: collision with root package name */
        private pi.S f3395l;

        /* renamed from: d, reason: collision with root package name */
        private Bh.Y f3387d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3388e = false;

        /* renamed from: g, reason: collision with root package name */
        private E0 f3390g = E0.f58057b;

        /* renamed from: h, reason: collision with root package name */
        private boolean f3391h = true;

        /* renamed from: j, reason: collision with root package name */
        private List f3393j = null;

        public a() {
            this.f3384a = K.this.b();
            this.f3385b = K.this.l();
            this.f3386c = K.this.getVisibility();
            this.f3389f = K.this.h();
            this.f3392i = K.this.f3378u;
            this.f3394k = K.this.getName();
            this.f3395l = K.this.getType();
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public Bh.Y n() {
            return K.this.Q0(this);
        }

        Z o() {
            Bh.Y y10 = this.f3387d;
            if (y10 == null) {
                return null;
            }
            return y10.d();
        }

        a0 p() {
            Bh.Y y10 = this.f3387d;
            if (y10 == null) {
                return null;
            }
            return y10.g();
        }

        public a q(boolean z10) {
            this.f3391h = z10;
            return this;
        }

        public a r(InterfaceC2492b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f3389f = aVar;
            return this;
        }

        public a s(Bh.D d10) {
            if (d10 == null) {
                a(6);
            }
            this.f3385b = d10;
            return this;
        }

        public a t(InterfaceC2492b interfaceC2492b) {
            this.f3387d = (Bh.Y) interfaceC2492b;
            return this;
        }

        public a u(InterfaceC2503m interfaceC2503m) {
            if (interfaceC2503m == null) {
                a(0);
            }
            this.f3384a = interfaceC2503m;
            return this;
        }

        public a v(E0 e02) {
            if (e02 == null) {
                a(15);
            }
            this.f3390g = e02;
            return this;
        }

        public a w(AbstractC2510u abstractC2510u) {
            if (abstractC2510u == null) {
                a(8);
            }
            this.f3386c = abstractC2510u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected K(InterfaceC2503m interfaceC2503m, Bh.Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Bh.D d10, AbstractC2510u abstractC2510u, boolean z10, Zh.f fVar, InterfaceC2492b.a aVar, g0 g0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(interfaceC2503m, hVar, fVar, null, z10, g0Var);
        if (interfaceC2503m == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (d10 == null) {
            I(2);
        }
        if (abstractC2510u == null) {
            I(3);
        }
        if (fVar == null) {
            I(4);
        }
        if (aVar == null) {
            I(5);
        }
        if (g0Var == null) {
            I(6);
        }
        this.f3368k = null;
        this.f3377t = Collections.emptyList();
        this.f3366i = d10;
        this.f3367j = abstractC2510u;
        this.f3369l = y10 == null ? this : y10;
        this.f3370m = aVar;
        this.f3371n = z11;
        this.f3372o = z12;
        this.f3373p = z13;
        this.f3374q = z14;
        this.f3375r = z15;
        this.f3376s = z16;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void I(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.K.I(int):void");
    }

    public static K O0(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Bh.D d10, AbstractC2510u abstractC2510u, boolean z10, Zh.f fVar, InterfaceC2492b.a aVar, g0 g0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (interfaceC2503m == null) {
            I(7);
        }
        if (hVar == null) {
            I(8);
        }
        if (d10 == null) {
            I(9);
        }
        if (abstractC2510u == null) {
            I(10);
        }
        if (fVar == null) {
            I(11);
        }
        if (aVar == null) {
            I(12);
        }
        if (g0Var == null) {
            I(13);
        }
        return new K(interfaceC2503m, null, hVar, d10, abstractC2510u, z10, fVar, aVar, g0Var, z11, z12, z13, z14, z15, z16);
    }

    private g0 S0(boolean z10, Bh.Y y10) {
        g0 g0VarJ;
        if (z10) {
            if (y10 == null) {
                y10 = a();
            }
            g0VarJ = y10.j();
        } else {
            g0VarJ = g0.f1784a;
        }
        if (g0VarJ == null) {
            I(28);
        }
        return g0VarJ;
    }

    private static InterfaceC2515z T0(G0 g02, Bh.X x10) {
        if (g02 == null) {
            I(30);
        }
        if (x10 == null) {
            I(31);
        }
        if (x10.a0() != null) {
            return x10.a0().c(g02);
        }
        return null;
    }

    private static AbstractC2510u Y0(AbstractC2510u abstractC2510u, InterfaceC2492b.a aVar) {
        return (aVar == InterfaceC2492b.a.FAKE_OVERRIDE && AbstractC2509t.g(abstractC2510u.f())) ? AbstractC2509t.f1799h : abstractC2510u;
    }

    private static b0 d1(G0 g02, Bh.Y y10, b0 b0Var) {
        pi.S sP = g02.p(b0Var.getType(), N0.IN_VARIANCE);
        if (sP == null) {
            return null;
        }
        return new N(y10, new C6342c(y10, sP, ((InterfaceC6345f) b0Var.getValue()).a(), b0Var.getValue()), b0Var.getAnnotations());
    }

    private static b0 e1(G0 g02, Bh.Y y10, b0 b0Var) {
        pi.S sP = g02.p(b0Var.getType(), N0.IN_VARIANCE);
        if (sP == null) {
            return null;
        }
        return new N(y10, new C6343d(y10, sP, b0Var.getValue()), b0Var.getAnnotations());
    }

    @Override // Bh.t0
    public boolean A() {
        return this.f3372o;
    }

    @Override // Bh.C
    public boolean F0() {
        return this.f3374q;
    }

    @Override // Bh.C
    public boolean L() {
        return this.f3373p;
    }

    @Override // Bh.u0
    public boolean N() {
        return this.f3376s;
    }

    @Override // Bh.InterfaceC2492b
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public Bh.Y c0(InterfaceC2503m interfaceC2503m, Bh.D d10, AbstractC2510u abstractC2510u, InterfaceC2492b.a aVar, boolean z10) {
        Bh.Y yN = X0().u(interfaceC2503m).t(null).s(d10).w(abstractC2510u).r(aVar).q(z10).n();
        if (yN == null) {
            I(42);
        }
        return yN;
    }

    protected K P0(InterfaceC2503m interfaceC2503m, Bh.D d10, AbstractC2510u abstractC2510u, Bh.Y y10, InterfaceC2492b.a aVar, Zh.f fVar, g0 g0Var) {
        if (interfaceC2503m == null) {
            I(32);
        }
        if (d10 == null) {
            I(33);
        }
        if (abstractC2510u == null) {
            I(34);
        }
        if (aVar == null) {
            I(35);
        }
        if (fVar == null) {
            I(36);
        }
        if (g0Var == null) {
            I(37);
        }
        return new K(interfaceC2503m, y10, getAnnotations(), d10, abstractC2510u, h0(), fVar, aVar, g0Var, q0(), A(), L(), F0(), isExternal(), N());
    }

    protected Bh.Y Q0(a aVar) {
        b0 b0Var;
        InterfaceC6824a interfaceC6824a;
        if (aVar == null) {
            I(29);
        }
        K kP0 = P0(aVar.f3384a, aVar.f3385b, aVar.f3386c, aVar.f3387d, aVar.f3389f, aVar.f3394k, S0(aVar.f3388e, aVar.f3387d));
        List typeParameters = aVar.f3393j == null ? getTypeParameters() : aVar.f3393j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        G0 g0B = AbstractC7335C.b(typeParameters, aVar.f3390g, kP0, arrayList);
        pi.S s10 = aVar.f3395l;
        pi.S sP = g0B.p(s10, N0.OUT_VARIANCE);
        if (sP == null) {
            return null;
        }
        pi.S sP2 = g0B.p(s10, N0.IN_VARIANCE);
        if (sP2 != null) {
            kP0.Z0(sP2);
        }
        b0 b0Var2 = aVar.f3392i;
        if (b0Var2 != null) {
            b0 b0VarC = b0Var2.c(g0B);
            if (b0VarC == null) {
                return null;
            }
            b0Var = b0VarC;
        } else {
            b0Var = null;
        }
        b0 b0Var3 = this.f3379v;
        b0 b0VarE1 = b0Var3 != null ? e1(g0B, kP0, b0Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f3377t.iterator();
        while (it.hasNext()) {
            b0 b0VarD1 = d1(g0B, kP0, (b0) it.next());
            if (b0VarD1 != null) {
                arrayList2.add(b0VarD1);
            }
        }
        kP0.b1(sP, arrayList, b0Var, b0VarE1, arrayList2);
        L l10 = this.f3381x == null ? null : new L(kP0, this.f3381x.getAnnotations(), aVar.f3385b, Y0(this.f3381x.getVisibility(), aVar.f3389f), this.f3381x.T(), this.f3381x.isExternal(), this.f3381x.isInline(), aVar.f3389f, aVar.o(), g0.f1784a);
        if (l10 != null) {
            pi.S returnType = this.f3381x.getReturnType();
            l10.M0(T0(g0B, this.f3381x));
            l10.P0(returnType != null ? g0B.p(returnType, N0.OUT_VARIANCE) : null);
        }
        M m10 = this.f3382y == null ? null : new M(kP0, this.f3382y.getAnnotations(), aVar.f3385b, Y0(this.f3382y.getVisibility(), aVar.f3389f), this.f3382y.T(), this.f3382y.isExternal(), this.f3382y.isInline(), aVar.f3389f, aVar.p(), g0.f1784a);
        if (m10 != null) {
            List listP0 = AbstractC2612s.P0(m10, this.f3382y.i(), g0B, false, false, null);
            if (listP0 == null) {
                kP0.a1(true);
                listP0 = Collections.singletonList(M.O0(m10, AbstractC5833e.m(aVar.f3384a).H(), ((s0) this.f3382y.i().get(0)).getAnnotations()));
            }
            if (listP0.size() != 1) {
                throw new IllegalStateException();
            }
            m10.M0(T0(g0B, this.f3382y));
            m10.Q0((s0) listP0.get(0));
        }
        InterfaceC2512w interfaceC2512w = this.f3364A;
        r rVar = interfaceC2512w == null ? null : new r(interfaceC2512w.getAnnotations(), kP0);
        InterfaceC2512w interfaceC2512w2 = this.f3365B;
        kP0.V0(l10, m10, rVar, interfaceC2512w2 != null ? new r(interfaceC2512w2.getAnnotations(), kP0) : null);
        if (aVar.f3391h) {
            C8545l c8545lJ = C8545l.j();
            Iterator it2 = f().iterator();
            while (it2.hasNext()) {
                c8545lJ.add(((Bh.Y) it2.next()).c(g0B));
            }
            kP0.x0(c8545lJ);
        }
        if (A() && (interfaceC6824a = this.f3428h) != null) {
            kP0.K0(this.f3427g, interfaceC6824a);
        }
        return kP0;
    }

    @Override // Bh.Y
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public L d() {
        return this.f3381x;
    }

    public void U0(L l10, a0 a0Var) {
        V0(l10, a0Var, null, null);
    }

    public void V0(L l10, a0 a0Var, InterfaceC2512w interfaceC2512w, InterfaceC2512w interfaceC2512w2) {
        this.f3381x = l10;
        this.f3382y = a0Var;
        this.f3364A = interfaceC2512w;
        this.f3365B = interfaceC2512w2;
    }

    public boolean W0() {
        return this.f3383z;
    }

    public a X0() {
        return new a();
    }

    public void Z0(pi.S s10) {
        if (s10 == null) {
            I(14);
        }
    }

    public void a1(boolean z10) {
        this.f3383z = z10;
    }

    public void b1(pi.S s10, List list, b0 b0Var, b0 b0Var2, List list2) {
        if (s10 == null) {
            I(17);
        }
        if (list == null) {
            I(18);
        }
        if (list2 == null) {
            I(19);
        }
        G0(s10);
        this.f3380w = new ArrayList(list);
        this.f3379v = b0Var2;
        this.f3378u = b0Var;
        this.f3377t = list2;
    }

    public void c1(AbstractC2510u abstractC2510u) {
        if (abstractC2510u == null) {
            I(20);
        }
        this.f3367j = abstractC2510u;
    }

    @Override // Dh.X, Bh.InterfaceC2491a
    public b0 d0() {
        return this.f3378u;
    }

    @Override // Bh.InterfaceC2491a
    public Object e0(InterfaceC2491a.InterfaceC0071a interfaceC0071a) {
        return null;
    }

    @Override // Bh.InterfaceC2491a
    public Collection f() {
        Collection collectionEmptyList = this.f3368k;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            I(41);
        }
        return collectionEmptyList;
    }

    @Override // Bh.Y
    public a0 g() {
        return this.f3382y;
    }

    @Override // Dh.X, Bh.InterfaceC2491a
    public pi.S getReturnType() {
        pi.S type = getType();
        if (type == null) {
            I(23);
        }
        return type;
    }

    @Override // Dh.X, Bh.InterfaceC2491a
    public List getTypeParameters() {
        List list = this.f3380w;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u abstractC2510u = this.f3367j;
        if (abstractC2510u == null) {
            I(25);
        }
        return abstractC2510u;
    }

    @Override // Bh.InterfaceC2492b
    public InterfaceC2492b.a h() {
        InterfaceC2492b.a aVar = this.f3370m;
        if (aVar == null) {
            I(39);
        }
        return aVar;
    }

    @Override // Bh.C
    public boolean isExternal() {
        return this.f3375r;
    }

    @Override // Dh.X, Bh.InterfaceC2491a
    public b0 k0() {
        return this.f3379v;
    }

    @Override // Bh.C
    public Bh.D l() {
        Bh.D d10 = this.f3366i;
        if (d10 == null) {
            I(24);
        }
        return d10;
    }

    @Override // Bh.Y
    public InterfaceC2512w l0() {
        return this.f3365B;
    }

    @Override // Bh.Y
    public InterfaceC2512w o0() {
        return this.f3364A;
    }

    @Override // Bh.InterfaceC2491a
    public List p0() {
        List list = this.f3377t;
        if (list == null) {
            I(22);
        }
        return list;
    }

    @Override // Bh.t0
    public boolean q0() {
        return this.f3371n;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return interfaceC2505o.e(this, obj);
    }

    @Override // Bh.Y
    public List x() {
        ArrayList arrayList = new ArrayList(2);
        L l10 = this.f3381x;
        if (l10 != null) {
            arrayList.add(l10);
        }
        a0 a0Var = this.f3382y;
        if (a0Var != null) {
            arrayList.add(a0Var);
        }
        return arrayList;
    }

    @Override // Bh.InterfaceC2492b
    public void x0(Collection collection) {
        if (collection == null) {
            I(40);
        }
        this.f3368k = collection;
    }

    @Override // Bh.i0
    public Bh.Y c(G0 g02) {
        if (g02 == null) {
            I(27);
        }
        return g02.k() ? this : X0().v(g02.j()).t(a()).n();
    }

    @Override // Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    public Bh.Y a() {
        Bh.Y y10 = this.f3369l;
        Bh.Y yA = y10 == this ? this : y10.a();
        if (yA == null) {
            I(38);
        }
        return yA;
    }
}
