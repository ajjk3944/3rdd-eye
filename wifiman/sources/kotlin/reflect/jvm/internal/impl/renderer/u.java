package kotlin.reflect.jvm.internal.impl.renderer;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.EnumC2496f;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2499i;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.InterfaceC2506p;
import Bh.InterfaceC2512w;
import Bh.InterfaceC2515z;
import Bh.L;
import Bh.M;
import Bh.U;
import Bh.X;
import Bh.Y;
import Bh.Z;
import Bh.a0;
import Bh.b0;
import Bh.k0;
import Bh.l0;
import Bh.p0;
import Bh.s0;
import Bh.t0;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.H;
import Zg.d0;
import di.AbstractC5398g;
import di.C5392a;
import di.C5393b;
import di.s;
import fi.AbstractC5833e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import kotlin.reflect.jvm.internal.impl.renderer.n;
import kotlin.text.AbstractC6507a;
import mh.InterfaceC6835l;
import pi.AbstractC7346d0;
import pi.AbstractC7354h0;
import pi.B0;
import pi.C7339a;
import pi.C7377y;
import pi.I;
import pi.J0;
import pi.M0;
import pi.N0;
import pi.O0;
import pi.Q;
import pi.S;
import pi.W;
import pi.v0;
import si.AbstractC7984d;
import vi.AbstractC8233a;

/* loaded from: classes4.dex */
public final class u extends n implements w {

    /* renamed from: m, reason: collision with root package name */
    private final z f52081m;

    /* renamed from: n, reason: collision with root package name */
    private final Yg.m f52082n;

    private final class a implements InterfaceC2505o {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.u$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1927a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52084a;

            static {
                int[] iArr = new int[E.values().length];
                try {
                    iArr[E.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[E.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[E.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f52084a = iArr;
            }
        }

        public a() {
        }

        private final void t(X x10, StringBuilder sb2, String str) throws IOException {
            int i10 = C1927a.f52084a[u.this.P0().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    p(x10, sb2);
                    return;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            u.this.w1(x10, sb2);
            sb2.append(str + " for ");
            u uVar = u.this;
            Y yC0 = x10.C0();
            AbstractC6492s.h(yC0, "getCorrespondingProperty(...)");
            uVar.h2(yC0, sb2);
        }

        public void A(s0 descriptor, StringBuilder builder) {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.B2(descriptor, true, builder, true);
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object a(InterfaceC2515z interfaceC2515z, Object obj) throws IOException {
            p(interfaceC2515z, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object b(U u10, Object obj) {
            s(u10, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object c(l0 l0Var, Object obj) {
            z(l0Var, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object d(s0 s0Var, Object obj) {
            A(s0Var, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object e(Y y10, Object obj) throws IOException {
            u(y10, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object f(InterfaceC2502l interfaceC2502l, Object obj) throws IOException {
            o(interfaceC2502l, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object g(k0 k0Var, Object obj) {
            y(k0Var, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object h(Bh.G g10, Object obj) {
            q(g10, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object i(b0 b0Var, Object obj) {
            x(b0Var, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object j(a0 a0Var, Object obj) throws IOException {
            w(a0Var, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object k(M m10, Object obj) {
            r(m10, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object l(InterfaceC2495e interfaceC2495e, Object obj) throws IOException {
            n(interfaceC2495e, (StringBuilder) obj);
            return J.f24997a;
        }

        @Override // Bh.InterfaceC2505o
        public /* bridge */ /* synthetic */ Object m(Z z10, Object obj) throws IOException {
            v(z10, (StringBuilder) obj);
            return J.f24997a;
        }

        public void n(InterfaceC2495e descriptor, StringBuilder builder) throws IOException {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.C1(descriptor, builder);
        }

        public void o(InterfaceC2502l constructorDescriptor, StringBuilder builder) throws IOException {
            AbstractC6492s.i(constructorDescriptor, "constructorDescriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.H1(constructorDescriptor, builder);
        }

        public void p(InterfaceC2515z descriptor, StringBuilder builder) throws IOException {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.P1(descriptor, builder);
        }

        public void q(Bh.G descriptor, StringBuilder builder) {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.Z1(descriptor, builder, true);
        }

        public void r(M descriptor, StringBuilder builder) {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.d2(descriptor, builder);
        }

        public void s(U descriptor, StringBuilder builder) {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.f2(descriptor, builder);
        }

        public void u(Y descriptor, StringBuilder builder) throws IOException {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.h2(descriptor, builder);
        }

        public void v(Z descriptor, StringBuilder builder) throws IOException {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(a0 descriptor, StringBuilder builder) throws IOException {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(b0 descriptor, StringBuilder builder) {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(k0 descriptor, StringBuilder builder) {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.q2(descriptor, builder);
        }

        public void z(l0 descriptor, StringBuilder builder) {
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(builder, "builder");
            u.this.w2(descriptor, builder, true);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52085a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52086b;

        static {
            int[] iArr = new int[F.values().length];
            try {
                iArr[F.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52085a = iArr;
            int[] iArr2 = new int[D.values().length];
            try {
                iArr2[D.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[D.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[D.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f52086b = iArr2;
        }
    }

    public u(z options) {
        AbstractC6492s.i(options, "options");
        this.f52081m = options;
        options.p0();
        this.f52082n = Yg.n.b(new o(this));
    }

    static /* synthetic */ void A1(u uVar, StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        uVar.z1(sb2, aVar, eVar);
    }

    static /* synthetic */ void A2(u uVar, t0 t0Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        uVar.z2(t0Var, sb2, z10);
    }

    private final void B1(InterfaceC2499i interfaceC2499i, StringBuilder sb2) {
        List listW = interfaceC2499i.w();
        AbstractC6492s.h(listW, "getDeclaredTypeParameters(...)");
        List parameters = interfaceC2499i.k().getParameters();
        AbstractC6492s.h(parameters, "getParameters(...)");
        if (j1() && interfaceC2499i.M() && parameters.size() > listW.size()) {
            sb2.append(" /*captured type parameters: ");
            x2(sb2, parameters.subList(listW.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B2(Bh.s0 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L10
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.S1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L10:
            boolean r0 = r9.j1()
            if (r0 == 0) goto L27
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r12.append(r0)
        L27:
            r5 = 2
            r6 = 0
            r4 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            A1(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.Y()
            java.lang.String r1 = "crossinline"
            r9.Y1(r12, r0, r1)
            boolean r0 = r10.W()
            java.lang.String r1 = "noinline"
            r9.Y1(r12, r0, r1)
            boolean r0 = r9.Y0()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            Bh.a r0 = r10.b()
            boolean r3 = r0 instanceof Bh.InterfaceC2494d
            if (r3 == 0) goto L55
            Bh.d r0 = (Bh.InterfaceC2494d) r0
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L60
            boolean r0 = r0.B()
            if (r0 != r2) goto L60
            r8 = r2
            goto L61
        L60:
            r8 = r1
        L61:
            if (r8 == 0) goto L6c
            boolean r0 = r9.v0()
            java.lang.String r3 = "actual"
            r9.Y1(r12, r0, r3)
        L6c:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.D2(r4, r5, r6, r7, r8)
            mh.l r11 = r9.B0()
            if (r11 == 0) goto L8c
            boolean r11 = r9.p()
            if (r11 == 0) goto L85
            boolean r11 = r10.s0()
            goto L89
        L85:
            boolean r11 = fi.AbstractC5833e.f(r10)
        L89:
            if (r11 == 0) goto L8c
            r1 = r2
        L8c:
            if (r1 == 0) goto Laf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            mh.l r13 = r9.B0()
            kotlin.jvm.internal.AbstractC6492s.f(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.u.B2(Bh.s0, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(InterfaceC2495e interfaceC2495e, StringBuilder sb2) throws IOException {
        InterfaceC2494d interfaceC2494dP;
        boolean z10 = interfaceC2495e.h() == EnumC2496f.ENUM_ENTRY;
        if (!d1()) {
            List listH0 = interfaceC2495e.H0();
            AbstractC6492s.h(listH0, "getContextReceivers(...)");
            J1(listH0, sb2);
            A1(this, sb2, interfaceC2495e, null, 2, null);
            if (!z10) {
                AbstractC2510u visibility = interfaceC2495e.getVisibility();
                AbstractC6492s.h(visibility, "getVisibility(...)");
                E2(visibility, sb2);
            }
            if ((interfaceC2495e.h() != EnumC2496f.INTERFACE || interfaceC2495e.l() != Bh.D.ABSTRACT) && (!interfaceC2495e.h().isSingleton() || interfaceC2495e.l() != Bh.D.FINAL)) {
                Bh.D dL = interfaceC2495e.l();
                AbstractC6492s.h(dL, "getModality(...)");
                W1(dL, sb2, r1(interfaceC2495e));
            }
            U1(interfaceC2495e, sb2);
            Y1(sb2, I0().contains(v.INNER) && interfaceC2495e.M(), "inner");
            Y1(sb2, I0().contains(v.DATA) && interfaceC2495e.I0(), "data");
            Y1(sb2, I0().contains(v.INLINE) && interfaceC2495e.isInline(), "inline");
            Y1(sb2, I0().contains(v.VALUE) && interfaceC2495e.o(), "value");
            Y1(sb2, I0().contains(v.FUN) && interfaceC2495e.D(), "fun");
            D1(interfaceC2495e, sb2);
        }
        if (bi.i.x(interfaceC2495e)) {
            F1(interfaceC2495e, sb2);
        } else {
            if (!d1()) {
                m2(sb2);
            }
            Z1(interfaceC2495e, sb2, true);
        }
        if (z10) {
            return;
        }
        List listW = interfaceC2495e.w();
        AbstractC6492s.h(listW, "getDeclaredTypeParameters(...)");
        y2(listW, sb2, false);
        B1(interfaceC2495e, sb2);
        if (!interfaceC2495e.h().isSingleton() && z0() && (interfaceC2494dP = interfaceC2495e.P()) != null) {
            sb2.append(" ");
            A1(this, sb2, interfaceC2494dP, null, 2, null);
            AbstractC2510u visibility2 = interfaceC2494dP.getVisibility();
            AbstractC6492s.h(visibility2, "getVisibility(...)");
            E2(visibility2, sb2);
            sb2.append(S1("constructor"));
            List listI = interfaceC2494dP.i();
            AbstractC6492s.h(listI, "getValueParameters(...)");
            C2(listI, interfaceC2494dP.H(), sb2);
        }
        n2(interfaceC2495e, sb2);
        F2(listW, sb2);
    }

    private final void C2(Collection collection, boolean z10, StringBuilder sb2) {
        boolean zH2 = H2(z10);
        int size = collection.size();
        i1().c(size, sb2);
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            i1().a(s0Var, i10, size, sb2);
            B2(s0Var, zH2, sb2, false);
            i1().b(s0Var, i10, size, sb2);
            i10++;
        }
        i1().d(size, sb2);
    }

    private final void D1(InterfaceC2495e interfaceC2495e, StringBuilder sb2) {
        sb2.append(S1(n.f52061a.a(interfaceC2495e)));
    }

    private final void D2(t0 t0Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        S type = t0Var.getType();
        AbstractC6492s.h(type, "getType(...)");
        s0 s0Var = t0Var instanceof s0 ? (s0) t0Var : null;
        S sJ0 = s0Var != null ? s0Var.j0() : null;
        S s10 = sJ0 == null ? type : sJ0;
        Y1(sb2, sJ0 != null, "vararg");
        if (z12 || (z11 && !d1())) {
            z2(t0Var, sb2, z12);
        }
        if (z10) {
            Z1(t0Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(U(s10));
        R1(t0Var, sb2);
        if (!j1() || sJ0 == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(U(type));
        sb2.append("*/");
    }

    private final u E0() {
        return (u) this.f52082n.getValue();
    }

    private final boolean E2(AbstractC2510u abstractC2510u, StringBuilder sb2) {
        if (!I0().contains(v.VISIBILITY)) {
            return false;
        }
        if (J0()) {
            abstractC2510u = abstractC2510u.f();
        }
        if (!X0() && AbstractC6492s.d(abstractC2510u, AbstractC2509t.f1803l)) {
            return false;
        }
        sb2.append(S1(abstractC2510u.c()));
        sb2.append(" ");
        return true;
    }

    private final void F1(InterfaceC2503m interfaceC2503m, StringBuilder sb2) {
        if (S0()) {
            if (d1()) {
                sb2.append("companion object");
            }
            m2(sb2);
            InterfaceC2503m interfaceC2503mB = interfaceC2503m.b();
            if (interfaceC2503mB != null) {
                sb2.append("of ");
                Zh.f name = interfaceC2503mB.getName();
                AbstractC6492s.h(name, "getName(...)");
                sb2.append(T(name, false));
            }
        }
        if (j1() || !AbstractC6492s.d(interfaceC2503m.getName(), Zh.h.f25424d)) {
            if (!d1()) {
                m2(sb2);
            }
            Zh.f name2 = interfaceC2503m.getName();
            AbstractC6492s.h(name2, "getName(...)");
            sb2.append(T(name2, true));
        }
    }

    private final void F2(List list, StringBuilder sb2) throws IOException {
        if (o1()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            List upperBounds = l0Var.getUpperBounds();
            AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
            for (S s10 : AbstractC3689v.h0(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                Zh.f name = l0Var.getName();
                AbstractC6492s.h(name, "getName(...)");
                sb3.append(T(name, false));
                sb3.append(" : ");
                AbstractC6492s.f(s10);
                sb3.append(U(s10));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(S1("where"));
        sb2.append(" ");
        H.w0(arrayList, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
    }

    private final String G1(AbstractC5398g abstractC5398g) {
        InterfaceC6835l interfaceC6835lP = this.f52081m.P();
        if (interfaceC6835lP != null) {
            return (String) interfaceC6835lP.invoke(abstractC5398g);
        }
        if (abstractC5398g instanceof C5393b) {
            Iterable iterable = (Iterable) ((C5393b) abstractC5398g).b();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strG1 = G1((AbstractC5398g) it.next());
                if (strG1 != null) {
                    arrayList.add(strG1);
                }
            }
            return AbstractC3689v.z0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (abstractC5398g instanceof C5392a) {
            return kotlin.text.t.G0(n.Q(this, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) ((C5392a) abstractC5398g).b(), null, 2, null), "@");
        }
        if (!(abstractC5398g instanceof di.s)) {
            return abstractC5398g.toString();
        }
        s.b bVar = (s.b) ((di.s) abstractC5398g).b();
        if (bVar instanceof s.b.a) {
            return ((s.b.a) bVar).a() + "::class";
        }
        if (!(bVar instanceof s.b.C1725b)) {
            throw new NoWhenBranchMatchedException();
        }
        s.b.C1725b c1725b = (s.b.C1725b) bVar;
        String strB = c1725b.b().a().b();
        AbstractC6492s.h(strB, "asString(...)");
        for (int i10 = 0; i10 < c1725b.a(); i10++) {
            strB = "kotlin.Array<" + strB + '>';
        }
        return strB + "::class";
    }

    private final boolean G2(S s10) {
        if (kotlin.reflect.jvm.internal.impl.builtins.h.p(s10)) {
            List listL0 = s10.L0();
            if (!(listL0 instanceof Collection) || !listL0.isEmpty()) {
                Iterator it = listL0.iterator();
                while (it.hasNext()) {
                    if (((B0) it.next()).c()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H1(Bh.InterfaceC2502l r18, java.lang.StringBuilder r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.u.H1(Bh.l, java.lang.StringBuilder):void");
    }

    private final boolean H2(boolean z10) {
        int i10 = b.f52086b[M0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z10) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence I1(s0 s0Var) {
        return "";
    }

    private final void J1(List list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            b0 b0Var = (b0) it.next();
            z1(sb2, b0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.RECEIVER);
            S type = b0Var.getType();
            AbstractC6492s.h(type, "getType(...)");
            sb2.append(N1(type));
            if (i10 == AbstractC3689v.n(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    private final void K1(StringBuilder sb2, S s10) {
        A1(this, sb2, s10, null, 2, null);
        C7377y c7377y = s10 instanceof C7377y ? (C7377y) s10 : null;
        if (c7377y != null) {
            c7377y.Z0();
        }
        if (!W.a(s10)) {
            v2(this, sb2, s10, null, 2, null);
            J j10 = J.f24997a;
        } else if (AbstractC7984d.z(s10) && O0()) {
            sb2.append(L1(kotlin.reflect.jvm.internal.impl.types.error.l.f52198a.p(s10)));
        } else {
            if (!(s10 instanceof kotlin.reflect.jvm.internal.impl.types.error.i) || H0()) {
                sb2.append(s10.N0().toString());
            } else {
                sb2.append(((kotlin.reflect.jvm.internal.impl.types.error.i) s10).W0());
            }
            sb2.append(r2(s10.L0()));
        }
        if (s10.O0()) {
            sb2.append("?");
        }
        if (AbstractC7354h0.c(s10)) {
            sb2.append(" & Any");
        }
    }

    private final String L1(String str) {
        int i10 = b.f52085a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final void M1(StringBuilder sb2, C7339a c7339a) {
        F fE1 = e1();
        F f10 = F.HTML;
        if (fE1 == f10) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        b2(sb2, c7339a.U());
        sb2.append(" */");
        if (e1() == f10) {
            sb2.append("</i></font>");
        }
    }

    private final String N1(S s10) {
        String strU = U(s10);
        if ((!G2(s10) || J0.l(s10)) && !(s10 instanceof C7377y)) {
            return strU;
        }
        return '(' + strU + ')';
    }

    private final String O1(List list) {
        return s0(G.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(InterfaceC2515z interfaceC2515z, StringBuilder sb2) throws IOException {
        if (!d1()) {
            if (!c1()) {
                List listP0 = interfaceC2515z.p0();
                AbstractC6492s.h(listP0, "getContextReceiverParameters(...)");
                J1(listP0, sb2);
                A1(this, sb2, interfaceC2515z, null, 2, null);
                AbstractC2510u visibility = interfaceC2515z.getVisibility();
                AbstractC6492s.h(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                X1(interfaceC2515z, sb2);
                if (F0()) {
                    U1(interfaceC2515z, sb2);
                }
                c2(interfaceC2515z, sb2);
                if (F0()) {
                    x1(interfaceC2515z, sb2);
                } else {
                    p2(interfaceC2515z, sb2);
                }
                T1(interfaceC2515z, sb2);
                if (j1()) {
                    if (interfaceC2515z.v0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC2515z.D0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(S1("fun"));
            sb2.append(" ");
            List typeParameters = interfaceC2515z.getTypeParameters();
            AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(interfaceC2515z, sb2);
        }
        Z1(interfaceC2515z, sb2, true);
        List listI = interfaceC2515z.i();
        AbstractC6492s.h(listI, "getValueParameters(...)");
        C2(listI, interfaceC2515z.H(), sb2);
        k2(interfaceC2515z, sb2);
        S returnType = interfaceC2515z.getReturnType();
        if (!m1() && (h1() || returnType == null || !kotlin.reflect.jvm.internal.impl.builtins.i.C0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : U(returnType));
        }
        List typeParameters2 = interfaceC2515z.getTypeParameters();
        AbstractC6492s.h(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void Q1(StringBuilder sb2, S s10) {
        Zh.f fVarD;
        int length = sb2.length();
        A1(E0(), sb2, s10, null, 2, null);
        boolean z10 = sb2.length() != length;
        S sK = kotlin.reflect.jvm.internal.impl.builtins.h.k(s10);
        List listE = kotlin.reflect.jvm.internal.impl.builtins.h.e(s10);
        boolean zR = kotlin.reflect.jvm.internal.impl.builtins.h.r(s10);
        boolean zO0 = s10.O0();
        boolean z11 = zO0 || (z10 && sK != null);
        if (z11) {
            if (zR) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    AbstractC6507a.c(kotlin.text.t.v1(sb2));
                    if (sb2.charAt(kotlin.text.t.e0(sb2) - 1) != ')') {
                        sb2.insert(kotlin.text.t.e0(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!listE.isEmpty()) {
            sb2.append("context(");
            Iterator it = listE.subList(0, AbstractC3689v.n(listE)).iterator();
            while (it.hasNext()) {
                a2(sb2, (S) it.next());
                sb2.append(", ");
            }
            a2(sb2, (S) AbstractC3689v.B0(listE));
            sb2.append(") ");
        }
        Y1(sb2, zR, "suspend");
        if (sK != null) {
            boolean z12 = (G2(sK) && !sK.O0()) || q1(sK) || (sK instanceof C7377y);
            if (z12) {
                sb2.append("(");
            }
            a2(sb2, sK);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!kotlin.reflect.jvm.internal.impl.builtins.h.n(s10) || s10.L0().size() > 1) {
            int i10 = 0;
            for (B0 b02 : kotlin.reflect.jvm.internal.impl.builtins.h.m(s10)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (N0()) {
                    S type = b02.getType();
                    AbstractC6492s.h(type, "getType(...)");
                    fVarD = kotlin.reflect.jvm.internal.impl.builtins.h.d(type);
                } else {
                    fVarD = null;
                }
                if (fVarD != null) {
                    sb2.append(T(fVarD, false));
                    sb2.append(": ");
                }
                sb2.append(V(b02));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(r0());
        sb2.append(" ");
        a2(sb2, kotlin.reflect.jvm.internal.impl.builtins.h.l(s10));
        if (z11) {
            sb2.append(")");
        }
        if (zO0) {
            sb2.append("?");
        }
    }

    private final void R1(t0 t0Var, StringBuilder sb2) {
        AbstractC5398g abstractC5398gV;
        String strG1;
        if (!G0() || (abstractC5398gV = t0Var.V()) == null || (strG1 = G1(abstractC5398gV)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(s0(strG1));
    }

    private final String S1(String str) {
        int i10 = b.f52085a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (y0()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    private final void T1(InterfaceC2492b interfaceC2492b, StringBuilder sb2) {
        if (I0().contains(v.MEMBER_KIND) && j1() && interfaceC2492b.h() != InterfaceC2492b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(AbstractC8233a.f(interfaceC2492b.h().name()));
            sb2.append("*/ ");
        }
    }

    private final void U1(Bh.C c10, StringBuilder sb2) {
        Y1(sb2, c10.isExternal(), "external");
        boolean z10 = false;
        Y1(sb2, I0().contains(v.EXPECT) && c10.L(), "expect");
        if (I0().contains(v.ACTUAL) && c10.F0()) {
            z10 = true;
        }
        Y1(sb2, z10, "actual");
    }

    private final void W1(Bh.D d10, StringBuilder sb2, Bh.D d11) {
        if (W0() || d10 != d11) {
            Y1(sb2, I0().contains(v.MODALITY), AbstractC8233a.f(d10.name()));
        }
    }

    private final void X1(InterfaceC2492b interfaceC2492b, StringBuilder sb2) {
        if (bi.i.J(interfaceC2492b) && interfaceC2492b.l() == Bh.D.FINAL) {
            return;
        }
        if (L0() == C.RENDER_OVERRIDE && interfaceC2492b.l() == Bh.D.OPEN && u1(interfaceC2492b)) {
            return;
        }
        Bh.D dL = interfaceC2492b.l();
        AbstractC6492s.h(dL, "getModality(...)");
        W1(dL, sb2, r1(interfaceC2492b));
    }

    private final void Y1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(S1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(InterfaceC2503m interfaceC2503m, StringBuilder sb2, boolean z10) {
        Zh.f name = interfaceC2503m.getName();
        AbstractC6492s.h(name, "getName(...)");
        sb2.append(T(name, z10));
    }

    private final void a2(StringBuilder sb2, S s10) {
        M0 m0Q0 = s10.Q0();
        C7339a c7339a = m0Q0 instanceof C7339a ? (C7339a) m0Q0 : null;
        if (c7339a == null) {
            b2(sb2, s10);
            return;
        }
        if (Z0()) {
            b2(sb2, c7339a.U());
            if (R0()) {
                v1(sb2, c7339a);
                return;
            }
            return;
        }
        b2(sb2, c7339a.Z0());
        if (a1()) {
            M1(sb2, c7339a);
        }
    }

    private final void b2(StringBuilder sb2, S s10) {
        if ((s10 instanceof O0) && p() && !((O0) s10).S0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            sb2.append(((I) m0Q0).X0(this, this));
        } else {
            if (!(m0Q0 instanceof AbstractC7346d0)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(sb2, (AbstractC7346d0) m0Q0);
        }
    }

    private final void c2(InterfaceC2492b interfaceC2492b, StringBuilder sb2) {
        if (I0().contains(v.OVERRIDE) && u1(interfaceC2492b) && L0() != C.RENDER_OPEN) {
            Y1(sb2, true, "override");
            if (j1()) {
                sb2.append("/*");
                sb2.append(interfaceC2492b.f().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(M m10, StringBuilder sb2) {
        e2(m10.e(), "package-fragment", sb2);
        if (p()) {
            sb2.append(" in ");
            Z1(m10.b(), sb2, false);
        }
    }

    private final void e2(Zh.c cVar, String str, StringBuilder sb2) {
        sb2.append(S1(str));
        Zh.d dVarJ = cVar.j();
        AbstractC6492s.h(dVarJ, "toUnsafe(...)");
        String strS = S(dVarJ);
        if (strS.length() > 0) {
            sb2.append(" ");
            sb2.append(strS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(U u10, StringBuilder sb2) {
        e2(u10.e(), "package", sb2);
        if (p()) {
            sb2.append(" in context of ");
            Z1(u10.u0(), sb2, false);
        }
    }

    private final void g2(StringBuilder sb2, Bh.W w10) {
        Bh.W wC = w10.c();
        if (wC != null) {
            g2(sb2, wC);
            sb2.append('.');
            Zh.f name = w10.b().getName();
            AbstractC6492s.h(name, "getName(...)");
            sb2.append(T(name, false));
        } else {
            v0 v0VarK = w10.b().k();
            AbstractC6492s.h(v0VarK, "getTypeConstructor(...)");
            sb2.append(s2(v0VarK));
        }
        sb2.append(r2(w10.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(Y y10, StringBuilder sb2) throws IOException {
        if (!d1()) {
            if (!c1()) {
                List listP0 = y10.p0();
                AbstractC6492s.h(listP0, "getContextReceiverParameters(...)");
                J1(listP0, sb2);
                i2(y10, sb2);
                AbstractC2510u visibility = y10.getVisibility();
                AbstractC6492s.h(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                boolean z10 = false;
                Y1(sb2, I0().contains(v.CONST) && y10.A(), "const");
                U1(y10, sb2);
                X1(y10, sb2);
                c2(y10, sb2);
                if (I0().contains(v.LATEINIT) && y10.q0()) {
                    z10 = true;
                }
                Y1(sb2, z10, "lateinit");
                T1(y10, sb2);
            }
            A2(this, y10, sb2, false, 4, null);
            List typeParameters = y10.getTypeParameters();
            AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(y10, sb2);
        }
        Z1(y10, sb2, true);
        sb2.append(": ");
        S type = y10.getType();
        AbstractC6492s.h(type, "getType(...)");
        sb2.append(U(type));
        k2(y10, sb2);
        R1(y10, sb2);
        List typeParameters2 = y10.getTypeParameters();
        AbstractC6492s.h(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void i2(Y y10, StringBuilder sb2) {
        if (I0().contains(v.ANNOTATIONS)) {
            A1(this, sb2, y10, null, 2, null);
            InterfaceC2512w interfaceC2512wO0 = y10.o0();
            if (interfaceC2512wO0 != null) {
                z1(sb2, interfaceC2512wO0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.FIELD);
            }
            InterfaceC2512w interfaceC2512wL0 = y10.l0();
            if (interfaceC2512wL0 != null) {
                z1(sb2, interfaceC2512wL0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_DELEGATE_FIELD);
            }
            if (P0() == E.NONE) {
                Z zD = y10.d();
                if (zD != null) {
                    z1(sb2, zD, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_GETTER);
                }
                a0 a0VarG = y10.g();
                if (a0VarG != null) {
                    z1(sb2, a0VarG, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.PROPERTY_SETTER);
                    List listI = a0VarG.i();
                    AbstractC6492s.h(listI, "getValueParameters(...)");
                    s0 s0Var = (s0) AbstractC3689v.R0(listI);
                    AbstractC6492s.f(s0Var);
                    z1(sb2, s0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void j2(InterfaceC2491a interfaceC2491a, StringBuilder sb2) {
        b0 b0VarK0 = interfaceC2491a.k0();
        if (b0VarK0 != null) {
            z1(sb2, b0VarK0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.RECEIVER);
            S type = b0VarK0.getType();
            AbstractC6492s.h(type, "getType(...)");
            sb2.append(N1(type));
            sb2.append(".");
        }
    }

    private final void k2(InterfaceC2491a interfaceC2491a, StringBuilder sb2) {
        b0 b0VarK0;
        if (Q0() && (b0VarK0 = interfaceC2491a.k0()) != null) {
            sb2.append(" on ");
            S type = b0VarK0.getType();
            AbstractC6492s.h(type, "getType(...)");
            sb2.append(U(type));
        }
    }

    private final void l2(StringBuilder sb2, AbstractC7346d0 abstractC7346d0) {
        if (AbstractC6492s.d(abstractC7346d0, J0.f58071b) || J0.k(abstractC7346d0)) {
            sb2.append("???");
            return;
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.l.o(abstractC7346d0)) {
            if (!g1()) {
                sb2.append("???");
                return;
            }
            v0 v0VarN0 = abstractC7346d0.N0();
            AbstractC6492s.g(v0VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(L1(((kotlin.reflect.jvm.internal.impl.types.error.j) v0VarN0).g(0)));
            return;
        }
        if (W.a(abstractC7346d0)) {
            K1(sb2, abstractC7346d0);
        } else if (G2(abstractC7346d0)) {
            Q1(sb2, abstractC7346d0);
        } else {
            K1(sb2, abstractC7346d0);
        }
    }

    private final void m2(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void n2(InterfaceC2495e interfaceC2495e, StringBuilder sb2) throws IOException {
        if (n1() || kotlin.reflect.jvm.internal.impl.builtins.i.n0(interfaceC2495e.u())) {
            return;
        }
        Collection collectionA = interfaceC2495e.k().a();
        AbstractC6492s.h(collectionA, "getSupertypes(...)");
        if (collectionA.isEmpty()) {
            return;
        }
        if (collectionA.size() == 1 && kotlin.reflect.jvm.internal.impl.builtins.i.b0((S) collectionA.iterator().next())) {
            return;
        }
        m2(sb2);
        sb2.append(": ");
        H.w0(collectionA, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new s(this));
    }

    private final void o0(StringBuilder sb2, InterfaceC2503m interfaceC2503m) {
        InterfaceC2503m interfaceC2503mB;
        String name;
        if ((interfaceC2503m instanceof M) || (interfaceC2503m instanceof U) || (interfaceC2503mB = interfaceC2503m.b()) == null || (interfaceC2503mB instanceof Bh.G)) {
            return;
        }
        sb2.append(" ");
        sb2.append(V1("defined in"));
        sb2.append(" ");
        Zh.d dVarM = bi.i.m(interfaceC2503mB);
        AbstractC6492s.h(dVarM, "getFqName(...)");
        sb2.append(dVarM.e() ? "root package" : S(dVarM));
        if (l1() && (interfaceC2503mB instanceof M) && (interfaceC2503m instanceof InterfaceC2506p) && (name = ((InterfaceC2506p) interfaceC2503m).j().a().getName()) != null) {
            sb2.append(" ");
            sb2.append(V1("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o2(u uVar, S s10) {
        AbstractC6492s.f(s10);
        return uVar.U(s10);
    }

    private final void p0(StringBuilder sb2, List list) throws IOException {
        H.w0(list, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new q(this));
    }

    private final String p1() {
        return s0(">");
    }

    private final void p2(InterfaceC2515z interfaceC2515z, StringBuilder sb2) {
        Y1(sb2, interfaceC2515z.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q0(u uVar, B0 it) {
        AbstractC6492s.i(it, "it");
        if (it.c()) {
            return "*";
        }
        S type = it.getType();
        AbstractC6492s.h(type, "getType(...)");
        String strU = uVar.U(type);
        if (it.a() == N0.INVARIANT) {
            return strU;
        }
        return it.a() + ' ' + strU;
    }

    private final boolean q1(S s10) {
        return kotlin.reflect.jvm.internal.impl.builtins.h.r(s10) || !s10.getAnnotations().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(k0 k0Var, StringBuilder sb2) {
        A1(this, sb2, k0Var, null, 2, null);
        AbstractC2510u visibility = k0Var.getVisibility();
        AbstractC6492s.h(visibility, "getVisibility(...)");
        E2(visibility, sb2);
        U1(k0Var, sb2);
        sb2.append(S1("typealias"));
        sb2.append(" ");
        Z1(k0Var, sb2, true);
        List listW = k0Var.w();
        AbstractC6492s.h(listW, "getDeclaredTypeParameters(...)");
        y2(listW, sb2, false);
        B1(k0Var, sb2);
        sb2.append(" = ");
        sb2.append(U(k0Var.f0()));
    }

    private final String r0() {
        int i10 = b.f52085a[e1().ordinal()];
        if (i10 == 1) {
            return s0("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Bh.D r1(Bh.C c10) {
        if (c10 instanceof InterfaceC2495e) {
            return ((InterfaceC2495e) c10).h() == EnumC2496f.INTERFACE ? Bh.D.ABSTRACT : Bh.D.FINAL;
        }
        InterfaceC2503m interfaceC2503mB = c10.b();
        InterfaceC2495e interfaceC2495e = interfaceC2503mB instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2503mB : null;
        if (interfaceC2495e != null && (c10 instanceof InterfaceC2492b)) {
            InterfaceC2492b interfaceC2492b = (InterfaceC2492b) c10;
            Collection collectionF = interfaceC2492b.f();
            AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
            if (!collectionF.isEmpty() && interfaceC2495e.l() != Bh.D.FINAL) {
                return Bh.D.OPEN;
            }
            if (interfaceC2495e.h() != EnumC2496f.INTERFACE || AbstractC6492s.d(interfaceC2492b.getVisibility(), AbstractC2509t.f1792a)) {
                return Bh.D.FINAL;
            }
            Bh.D dL = interfaceC2492b.l();
            Bh.D d10 = Bh.D.ABSTRACT;
            return dL == d10 ? d10 : Bh.D.OPEN;
        }
        return Bh.D.FINAL;
    }

    private final String s0(String str) {
        return e1().escape(str);
    }

    private final boolean s1(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        return AbstractC6492s.d(cVar.e(), o.a.f51811E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u t0(u uVar) {
        n nVarW = uVar.W(t.f52080a);
        AbstractC6492s.g(nVarW, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (u) nVarW;
    }

    private final String t1() {
        return s0("<");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t2(S it) {
        AbstractC6492s.i(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J u0(w withOptions) {
        AbstractC6492s.i(withOptions, "$this$withOptions");
        withOptions.a(d0.l(withOptions.o(), AbstractC3689v.o(o.a.f51807C, o.a.f51809D)));
        return J.f24997a;
    }

    private final boolean u1(InterfaceC2492b interfaceC2492b) {
        return !interfaceC2492b.f().isEmpty();
    }

    private final void u2(StringBuilder sb2, S s10, v0 v0Var) {
        Bh.W wD = p0.d(s10);
        if (wD != null) {
            g2(sb2, wD);
        } else {
            sb2.append(s2(v0Var));
            sb2.append(r2(s10.L0()));
        }
    }

    private final void v1(StringBuilder sb2, C7339a c7339a) {
        F fE1 = e1();
        F f10 = F.HTML;
        if (fE1 == f10) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        b2(sb2, c7339a.Z0());
        sb2.append(" */");
        if (e1() == f10) {
            sb2.append("</i></font>");
        }
    }

    static /* synthetic */ void v2(u uVar, StringBuilder sb2, S s10, v0 v0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = s10.N0();
        }
        uVar.u2(sb2, s10, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(X x10, StringBuilder sb2) {
        U1(x10, sb2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(l0 l0Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(t1());
        }
        if (j1()) {
            sb2.append("/*");
            sb2.append(l0Var.getIndex());
            sb2.append("*/ ");
        }
        Y1(sb2, l0Var.G(), "reified");
        String label = l0Var.p().getLabel();
        boolean z11 = true;
        Y1(sb2, label.length() > 0, label);
        A1(this, sb2, l0Var, null, 2, null);
        Z1(l0Var, sb2, z10);
        int size = l0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            S s10 = (S) l0Var.getUpperBounds().iterator().next();
            if (!kotlin.reflect.jvm.internal.impl.builtins.i.j0(s10)) {
                sb2.append(" : ");
                AbstractC6492s.f(s10);
                sb2.append(U(s10));
            }
        } else if (z10) {
            for (S s11 : l0Var.getUpperBounds()) {
                if (!kotlin.reflect.jvm.internal.impl.builtins.i.j0(s11)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    AbstractC6492s.f(s11);
                    sb2.append(U(s11));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(p1());
        }
    }

    private final void x1(InterfaceC2515z interfaceC2515z, StringBuilder sb2) {
        boolean z10;
        boolean z11 = false;
        if (interfaceC2515z.isOperator()) {
            Collection collectionF = interfaceC2515z.f();
            AbstractC6492s.h(collectionF, "getOverriddenDescriptors(...)");
            Collection collection = collectionF;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC2515z) it.next()).isOperator()) {
                        if (w0()) {
                            break;
                        }
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (interfaceC2515z.isInfix()) {
            Collection collectionF2 = interfaceC2515z.f();
            AbstractC6492s.h(collectionF2, "getOverriddenDescriptors(...)");
            Collection collection2 = collectionF2;
            if (collection2.isEmpty()) {
                z11 = true;
            } else {
                Iterator it2 = collection2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((InterfaceC2515z) it2.next()).isInfix()) {
                        if (w0()) {
                            break;
                        }
                    }
                }
            }
        }
        Y1(sb2, interfaceC2515z.O(), "tailrec");
        p2(interfaceC2515z, sb2);
        Y1(sb2, interfaceC2515z.isInline(), "inline");
        Y1(sb2, z11, "infix");
        Y1(sb2, z10, "operator");
    }

    private final void x2(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w2((l0) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final List y1(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        InterfaceC2494d interfaceC2494dP;
        List listI;
        Map mapA = cVar.a();
        List listL = null;
        InterfaceC2495e interfaceC2495eL = V0() ? AbstractC5833e.l(cVar) : null;
        if (interfaceC2495eL != null && (interfaceC2494dP = interfaceC2495eL.P()) != null && (listI = interfaceC2494dP.i()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (((s0) obj).s0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((s0) it.next()).getName());
            }
            listL = arrayList2;
        }
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listL) {
            if (!mapA.containsKey((Zh.f) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC3689v.w(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Zh.f) it2.next()).b() + " = ...");
        }
        Set<Map.Entry> setEntrySet = mapA.entrySet();
        ArrayList arrayList5 = new ArrayList(AbstractC3689v.w(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            Zh.f fVar = (Zh.f) entry.getKey();
            AbstractC5398g abstractC5398g = (AbstractC5398g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.b());
            sb2.append(" = ");
            sb2.append(!listL.contains(fVar) ? G1(abstractC5398g) : "...");
            arrayList5.add(sb2.toString());
        }
        return AbstractC3689v.V0(AbstractC3689v.M0(arrayList4, arrayList5));
    }

    private final void y2(List list, StringBuilder sb2, boolean z10) {
        if (o1() || list.isEmpty()) {
            return;
        }
        sb2.append(t1());
        x2(sb2, list);
        sb2.append(p1());
        if (z10) {
            sb2.append(" ");
        }
    }

    private final void z1(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) {
        if (I0().contains(v.ANNOTATIONS)) {
            Set setO = aVar instanceof S ? o() : D0();
            InterfaceC6835l interfaceC6835lX0 = x0();
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : aVar.getAnnotations()) {
                if (!AbstractC3689v.f0(setO, cVar.e()) && !s1(cVar) && (interfaceC6835lX0 == null || ((Boolean) interfaceC6835lX0.invoke(cVar)).booleanValue())) {
                    sb2.append(P(cVar, eVar));
                    if (C0()) {
                        sb2.append('\n');
                        AbstractC6492s.h(sb2, "append(...)");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void z2(t0 t0Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(t0Var instanceof s0)) {
            sb2.append(S1(t0Var.h0() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    public InterfaceC6500b A0() {
        return this.f52081m.B();
    }

    public InterfaceC6835l B0() {
        return this.f52081m.C();
    }

    public boolean C0() {
        return this.f52081m.D();
    }

    public Set D0() {
        return this.f52081m.E();
    }

    public String E1(InterfaceC2498h klass) {
        AbstractC6492s.i(klass, "klass");
        return kotlin.reflect.jvm.internal.impl.types.error.l.m(klass) ? klass.k().toString() : A0().a(klass, this);
    }

    public boolean F0() {
        return this.f52081m.F();
    }

    public boolean G0() {
        return this.f52081m.G();
    }

    public boolean H0() {
        return this.f52081m.H();
    }

    public Set I0() {
        return this.f52081m.I();
    }

    public boolean J0() {
        return this.f52081m.J();
    }

    public final z K0() {
        return this.f52081m;
    }

    public C L0() {
        return this.f52081m.K();
    }

    public D M0() {
        return this.f52081m.L();
    }

    public boolean N0() {
        return this.f52081m.M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.n
    public String O(InterfaceC2503m declarationDescriptor) {
        AbstractC6492s.i(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.t0(new a(), sb2);
        if (k1()) {
            o0(sb2, declarationDescriptor);
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public boolean O0() {
        return this.f52081m.N();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.n
    public String P(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotation, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar) throws IOException {
        AbstractC6492s.i(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.getRenderName() + ':');
        }
        S type = annotation.getType();
        sb2.append(U(type));
        if (n()) {
            List listY1 = y1(annotation);
            if (b() || !listY1.isEmpty()) {
                H.w0(listY1, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
            }
        }
        if (j1() && (W.a(type) || (type.N0().c() instanceof L.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public E P0() {
        return this.f52081m.O();
    }

    public boolean Q0() {
        return this.f52081m.Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.n
    public String R(String lowerRendered, String upperRendered, kotlin.reflect.jvm.internal.impl.builtins.i builtIns) {
        AbstractC6492s.i(lowerRendered, "lowerRendered");
        AbstractC6492s.i(upperRendered, "upperRendered");
        AbstractC6492s.i(builtIns, "builtIns");
        if (G.f(lowerRendered, upperRendered)) {
            if (!kotlin.text.t.P(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        InterfaceC6500b interfaceC6500bA0 = A0();
        InterfaceC2495e interfaceC2495eW = builtIns.w();
        AbstractC6492s.h(interfaceC2495eW, "getCollection(...)");
        String strL1 = kotlin.text.t.l1(interfaceC6500bA0.a(interfaceC2495eW, this), "Collection", null, 2, null);
        String strD = G.d(lowerRendered, strL1 + "Mutable", upperRendered, strL1, strL1 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        String strD2 = G.d(lowerRendered, strL1 + "MutableMap.MutableEntry", upperRendered, strL1 + "Map.Entry", strL1 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        InterfaceC6500b interfaceC6500bA02 = A0();
        InterfaceC2495e interfaceC2495eJ = builtIns.j();
        AbstractC6492s.h(interfaceC2495eJ, "getArray(...)");
        String strL12 = kotlin.text.t.l1(interfaceC6500bA02.a(interfaceC2495eJ, this), "Array", null, 2, null);
        String strD3 = G.d(lowerRendered, strL12 + s0("Array<"), upperRendered, strL12 + s0("Array<out "), strL12 + s0("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public boolean R0() {
        return this.f52081m.R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.n
    public String S(Zh.d fqName) {
        AbstractC6492s.i(fqName, "fqName");
        List listH = fqName.h();
        AbstractC6492s.h(listH, "pathSegments(...)");
        return O1(listH);
    }

    public boolean S0() {
        return this.f52081m.S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.n
    public String T(Zh.f name, boolean z10) {
        AbstractC6492s.i(name, "name");
        String strS0 = s0(G.b(name));
        if (!y0() || e1() != F.HTML || !z10) {
            return strS0;
        }
        return "<b>" + strS0 + "</b>";
    }

    public boolean T0() {
        return this.f52081m.T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.n
    public String U(S type) {
        AbstractC6492s.i(type, "type");
        StringBuilder sb2 = new StringBuilder();
        a2(sb2, (S) f1().invoke(type));
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public boolean U0() {
        return this.f52081m.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.n
    public String V(B0 typeProjection) throws IOException {
        AbstractC6492s.i(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        p0(sb2, AbstractC3689v.e(typeProjection));
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public boolean V0() {
        return this.f52081m.V();
    }

    public String V1(String message) {
        AbstractC6492s.i(message, "message");
        int i10 = b.f52085a[e1().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    public boolean W0() {
        return this.f52081m.W();
    }

    public boolean X0() {
        return this.f52081m.X();
    }

    public boolean Y0() {
        return this.f52081m.Y();
    }

    public boolean Z0() {
        return this.f52081m.Z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void a(Set set) {
        AbstractC6492s.i(set, "<set-?>");
        this.f52081m.a(set);
    }

    public boolean a1() {
        return this.f52081m.a0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public boolean b() {
        return this.f52081m.b();
    }

    public boolean b1() {
        return this.f52081m.b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void c(boolean z10) {
        this.f52081m.c(z10);
    }

    public boolean c1() {
        return this.f52081m.c0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void d(Set set) {
        AbstractC6492s.i(set, "<set-?>");
        this.f52081m.d(set);
    }

    public boolean d1() {
        return this.f52081m.d0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void e(D d10) {
        AbstractC6492s.i(d10, "<set-?>");
        this.f52081m.e(d10);
    }

    public F e1() {
        return this.f52081m.e0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void f(boolean z10) {
        this.f52081m.f(z10);
    }

    public InterfaceC6835l f1() {
        return this.f52081m.f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public boolean g() {
        return this.f52081m.g();
    }

    public boolean g1() {
        return this.f52081m.g0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void h(InterfaceC6500b interfaceC6500b) {
        AbstractC6492s.i(interfaceC6500b, "<set-?>");
        this.f52081m.h(interfaceC6500b);
    }

    public boolean h1() {
        return this.f52081m.h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void i(boolean z10) {
        this.f52081m.i(z10);
    }

    public n.b i1() {
        return this.f52081m.i0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void j(boolean z10) {
        this.f52081m.j(z10);
    }

    public boolean j1() {
        return this.f52081m.j0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void k(boolean z10) {
        this.f52081m.k(z10);
    }

    public boolean k1() {
        return this.f52081m.k0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void l(boolean z10) {
        this.f52081m.l(z10);
    }

    public boolean l1() {
        return this.f52081m.l0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void m(F f10) {
        AbstractC6492s.i(f10, "<set-?>");
        this.f52081m.m(f10);
    }

    public boolean m1() {
        return this.f52081m.m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public boolean n() {
        return this.f52081m.n();
    }

    public boolean n1() {
        return this.f52081m.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public Set o() {
        return this.f52081m.o();
    }

    public boolean o1() {
        return this.f52081m.o0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public boolean p() {
        return this.f52081m.p();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public EnumC6499a q() {
        return this.f52081m.q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.w
    public void r(boolean z10) {
        this.f52081m.r(z10);
    }

    public String r2(List typeArguments) throws IOException {
        AbstractC6492s.i(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t1());
        p0(sb2, typeArguments);
        sb2.append(p1());
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    public String s2(v0 typeConstructor) {
        AbstractC6492s.i(typeConstructor, "typeConstructor");
        InterfaceC2498h interfaceC2498hC = typeConstructor.c();
        if ((interfaceC2498hC instanceof l0) || (interfaceC2498hC instanceof InterfaceC2495e) || (interfaceC2498hC instanceof k0)) {
            return E1(interfaceC2498hC);
        }
        if (interfaceC2498hC == null) {
            return typeConstructor instanceof Q ? ((Q) typeConstructor).m(p.f52076a) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC2498hC.getClass()).toString());
    }

    public boolean v0() {
        return this.f52081m.w();
    }

    public boolean w0() {
        return this.f52081m.x();
    }

    public InterfaceC6835l x0() {
        return this.f52081m.y();
    }

    public boolean y0() {
        return this.f52081m.z();
    }

    public boolean z0() {
        return this.f52081m.A();
    }
}
