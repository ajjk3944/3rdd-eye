package T;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.C7006E;
import o.C7009H;

/* loaded from: classes.dex */
public final class K0 implements X0, J0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f20880h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f20881i = 8;

    /* renamed from: a, reason: collision with root package name */
    private int f20882a;

    /* renamed from: b, reason: collision with root package name */
    private M0 f20883b;

    /* renamed from: c, reason: collision with root package name */
    private C3520d f20884c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6839p f20885d;

    /* renamed from: e, reason: collision with root package name */
    private int f20886e;

    /* renamed from: f, reason: collision with root package name */
    private C7006E f20887f;

    /* renamed from: g, reason: collision with root package name */
    private C7009H f20888g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(C3525e1 c3525e1, List list, M0 m02) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objY0 = c3525e1.Y0((C3520d) list.get(i10), 0);
                K0 k02 = objY0 instanceof K0 ? (K0) objY0 : null;
                if (k02 != null) {
                    k02.e(m02);
                }
            }
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20890b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7006E f20891c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, C7006E c7006e) {
            super(1);
            this.f20890b = i10;
            this.f20891c = c7006e;
        }

        public final void a(InterfaceC3548p interfaceC3548p) {
            int i10;
            if (K0.this.f20886e != this.f20890b || !AbstractC6492s.d(this.f20891c, K0.this.f20887f) || !(interfaceC3548p instanceof C3553s)) {
                return;
            }
            C7006E c7006e = this.f20891c;
            int i11 = this.f20890b;
            K0 k02 = K0.this;
            long[] jArr = c7006e.f54904a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = c7006e.f54905b[i16];
                            boolean z10 = c7006e.f54906c[i16] != i11;
                            if (z10) {
                                C3553s c3553s = (C3553s) interfaceC3548p;
                                c3553s.J(obj, k02);
                                if (obj instanceof H) {
                                    c3553s.I((H) obj);
                                    C7009H c7009h = k02.f20888g;
                                    if (c7009h != null) {
                                        c7009h.p(obj);
                                    }
                                }
                            }
                            if (z10) {
                                c7006e.p(i16);
                            }
                            i10 = 8;
                        } else {
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        return;
                    }
                }
                if (i12 == length) {
                    return;
                } else {
                    i12++;
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3548p) obj);
            return Yg.J.f24997a;
        }
    }

    public K0(M0 m02) {
        this.f20883b = m02;
    }

    private final void F(boolean z10) {
        if (z10) {
            this.f20882a |= 32;
        } else {
            this.f20882a &= -33;
        }
    }

    private final void G(boolean z10) {
        if (z10) {
            this.f20882a |= 16;
        } else {
            this.f20882a &= -17;
        }
    }

    private final boolean f(H h10, C7009H c7009h) {
        AbstractC6492s.g(h10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        n1 n1VarD = h10.d();
        if (n1VarD == null) {
            n1VarD = o1.p();
        }
        return !n1VarD.a(h10.o().a(), c7009h.c(h10));
    }

    private final boolean o() {
        return (this.f20882a & 32) != 0;
    }

    public final void A(C3520d c3520d) {
        this.f20884c = c3520d;
    }

    public final void B(boolean z10) {
        if (z10) {
            this.f20882a |= 2;
        } else {
            this.f20882a &= -3;
        }
    }

    public final void C(boolean z10) {
        if (z10) {
            this.f20882a |= 4;
        } else {
            this.f20882a &= -5;
        }
    }

    public final void D(boolean z10) {
        if (z10) {
            this.f20882a |= 64;
        } else {
            this.f20882a &= -65;
        }
    }

    public final void E(boolean z10) {
        if (z10) {
            this.f20882a |= 8;
        } else {
            this.f20882a &= -9;
        }
    }

    public final void H(boolean z10) {
        if (z10) {
            this.f20882a |= 1;
        } else {
            this.f20882a &= -2;
        }
    }

    public final void I(int i10) {
        this.f20886e = i10;
        G(false);
    }

    @Override // T.X0
    public void a(InterfaceC6839p interfaceC6839p) {
        this.f20885d = interfaceC6839p;
    }

    public final void e(M0 m02) {
        this.f20883b = m02;
    }

    public final void g(InterfaceC3540l interfaceC3540l) {
        Yg.J j10;
        InterfaceC6839p interfaceC6839p = this.f20885d;
        if (interfaceC6839p != null) {
            interfaceC6839p.invoke(interfaceC3540l, 1);
            j10 = Yg.J.f24997a;
        } else {
            j10 = null;
        }
        if (j10 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    public final InterfaceC6835l h(int i10) {
        C7006E c7006e = this.f20887f;
        if (c7006e == null || p()) {
            return null;
        }
        Object[] objArr = c7006e.f54905b;
        int[] iArr = c7006e.f54906c;
        long[] jArr = c7006e.f54904a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj = objArr[i14];
                        if (iArr[i14] != i10) {
                            return new b(i10, c7006e);
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return null;
                }
            }
            if (i11 == length) {
                return null;
            }
            i11++;
        }
    }

    public final C3520d i() {
        return this.f20884c;
    }

    @Override // T.J0
    public void invalidate() {
        M0 m02 = this.f20883b;
        if (m02 != null) {
            m02.h(this, null);
        }
    }

    public final boolean j() {
        return this.f20885d != null;
    }

    public final boolean k() {
        return (this.f20882a & 2) != 0;
    }

    public final boolean l() {
        return (this.f20882a & 4) != 0;
    }

    public final boolean m() {
        return (this.f20882a & 64) != 0;
    }

    public final boolean n() {
        return (this.f20882a & 8) != 0;
    }

    public final boolean p() {
        return (this.f20882a & 16) != 0;
    }

    public final boolean q() {
        return (this.f20882a & 1) != 0;
    }

    public final boolean r() {
        if (this.f20883b == null) {
            return false;
        }
        C3520d c3520d = this.f20884c;
        return c3520d != null ? c3520d.b() : false;
    }

    public final Y s(Object obj) {
        Y yH;
        M0 m02 = this.f20883b;
        return (m02 == null || (yH = m02.h(this, obj)) == null) ? Y.IGNORED : yH;
    }

    public final boolean t() {
        return this.f20888g != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != 0) goto L8
            return r2
        L8:
            o.H r3 = r0.f20888g
            if (r3 != 0) goto Ld
            return r2
        Ld:
            boolean r4 = r1 instanceof T.H
            if (r4 == 0) goto L18
            T.H r1 = (T.H) r1
            boolean r2 = r0.f(r1, r3)
            goto L72
        L18:
            boolean r4 = r1 instanceof o.T
            if (r4 == 0) goto L72
            o.T r1 = (o.T) r1
            boolean r4 = r1.e()
            r5 = 0
            if (r4 == 0) goto L71
            java.lang.Object[] r4 = r1.f54929b
            long[] r1 = r1.f54928a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L71
            r7 = r5
        L2f:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L49:
            if (r12 >= r10) goto L6a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            boolean r14 = r13 instanceof T.H
            if (r14 == 0) goto L72
            T.H r13 = (T.H) r13
            boolean r13 = r0.f(r13, r3)
            if (r13 == 0) goto L66
            goto L72
        L66:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L49
        L6a:
            if (r10 != r11) goto L71
        L6c:
            if (r7 == r6) goto L71
            int r7 = r7 + 1
            goto L2f
        L71:
            r2 = r5
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T.K0.u(java.lang.Object):boolean");
    }

    public final void v(H h10, Object obj) {
        C7009H c7009h = this.f20888g;
        if (c7009h == null) {
            c7009h = new C7009H(0, 1, null);
            this.f20888g = c7009h;
        }
        c7009h.s(h10, obj);
    }

    public final boolean w(Object obj) {
        if (o()) {
            return false;
        }
        C7006E c7006e = this.f20887f;
        if (c7006e == null) {
            c7006e = new C7006E(0, 1, null);
            this.f20887f = c7006e;
        }
        return c7006e.o(obj, this.f20886e, -1) == this.f20886e;
    }

    public final void x() {
        M0 m02 = this.f20883b;
        if (m02 != null) {
            m02.g(this);
        }
        this.f20883b = null;
        this.f20887f = null;
        this.f20888g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            r17 = this;
            r1 = r17
            T.M0 r0 = r1.f20883b
            if (r0 == 0) goto L60
            o.E r2 = r1.f20887f
            if (r2 == 0) goto L60
            r3 = 1
            r1.F(r3)
            r3 = 0
            java.lang.Object[] r4 = r2.f54905b     // Catch: java.lang.Throwable -> L4b
            int[] r5 = r2.f54906c     // Catch: java.lang.Throwable -> L4b
            long[] r2 = r2.f54904a     // Catch: java.lang.Throwable -> L4b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L4b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L58
            r7 = r3
        L1b:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L4b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L4b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L53
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L4b
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L35:
            if (r12 >= r10) goto L51
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L4b
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L4b
            r0.a(r14)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L35
        L51:
            if (r10 != r11) goto L58
        L53:
            if (r7 == r6) goto L58
            int r7 = r7 + 1
            goto L1b
        L58:
            r1.F(r3)
            goto L60
        L5c:
            r1.F(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.K0.y():void");
    }

    public final void z() {
        G(true);
    }
}
