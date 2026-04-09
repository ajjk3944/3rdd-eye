package E0;

import C0.AbstractC2521a;
import androidx.compose.ui.layout.t;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o.C7005D;
import o.C7009H;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class P extends androidx.compose.ui.layout.t implements T, W {

    /* renamed from: n, reason: collision with root package name */
    public static final b f3767n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    private static final InterfaceC6835l f3768o = a.f3777a;

    /* renamed from: f, reason: collision with root package name */
    private C0.Q f3769f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3770g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3771h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3772i;

    /* renamed from: j, reason: collision with root package name */
    private final t.a f3773j = androidx.compose.ui.layout.u.a(this);

    /* renamed from: k, reason: collision with root package name */
    private C7005D f3774k;

    /* renamed from: l, reason: collision with root package name */
    private C7005D f3775l;

    /* renamed from: m, reason: collision with root package name */
    private C7009H f3776m;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3777a = new a();

        a() {
            super(1);
        }

        public final void a(r0 r0Var) {
            if (r0Var.h0()) {
                r0Var.a().V0(r0Var);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r0) obj);
            return Yg.J.f24997a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r0 f3778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f3779b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r0 r0Var, P p10) {
            super(0);
            this.f3778a = r0Var;
            this.f3779b = p10;
        }

        public final void a() {
            InterfaceC6835l interfaceC6835lR = this.f3778a.b().r();
            if (interfaceC6835lR != null) {
                interfaceC6835lR.invoke(this.f3779b.z1());
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public static final class d implements C0.D {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3781b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f3782c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f3783d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f3784e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P f3785f;

        d(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, P p10) {
            this.f3780a = i10;
            this.f3781b = i11;
            this.f3782c = map;
            this.f3783d = interfaceC6835l;
            this.f3784e = interfaceC6835l2;
            this.f3785f = p10;
        }

        @Override // C0.D
        public int getHeight() {
            return this.f3781b;
        }

        @Override // C0.D
        public int getWidth() {
            return this.f3780a;
        }

        @Override // C0.D
        public Map p() {
            return this.f3782c;
        }

        @Override // C0.D
        public void q() {
            this.f3784e.invoke(this.f3785f.q1());
        }

        @Override // C0.D
        public InterfaceC6835l r() {
            return this.f3783d;
        }
    }

    public static final class e implements C0.Q {
        e() {
        }

        @Override // Y0.d
        public float getDensity() {
            return P.this.getDensity();
        }

        @Override // Y0.l
        public float y() {
            return P.this.y();
        }
    }

    private final void E1(C0.P p10) {
        C7009H c7009h = Y0(p10).f3776m;
        o.I i10 = c7009h != null ? (o.I) c7009h.p(p10) : null;
        if (i10 != null) {
            O1(i10);
        }
    }

    private final void O1(o.I i10) {
        G g10;
        Object[] objArr = i10.f54929b;
        long[] jArr = i10.f54928a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128 && (g10 = (G) ((WeakReference) objArr[(i11 << 3) + i13]).get()) != null) {
                        if (a1()) {
                            g10.p1(false);
                        } else {
                            g10.t1(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V0(E0.r0 r25) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.P.V0(E0.r0):void");
    }

    private final P Y0(C0.P p10) {
        P pO1;
        P p11 = this;
        while (true) {
            C7005D c7005d = p11.f3774k;
            if ((c7005d != null && c7005d.a(p10)) || (pO1 = p11.o1()) == null) {
                return p11;
            }
            p11 = pO1;
        }
    }

    protected final void B1(AbstractC2624c0 abstractC2624c0) {
        AbstractC2619a abstractC2619aP;
        AbstractC2624c0 abstractC2624c0H2 = abstractC2624c0.H2();
        if (!AbstractC6492s.d(abstractC2624c0H2 != null ? abstractC2624c0H2.G1() : null, abstractC2624c0.G1())) {
            abstractC2624c0.x2().p().m();
            return;
        }
        InterfaceC2621b interfaceC2621bL = abstractC2624c0.x2().L();
        if (interfaceC2621bL == null || (abstractC2619aP = interfaceC2621bL.p()) == null) {
            return;
        }
        abstractC2619aP.m();
    }

    @Override // E0.T
    public abstract G G1();

    public boolean J1() {
        return this.f3770g;
    }

    public final boolean L1() {
        return this.f3772i;
    }

    public final boolean M1() {
        return this.f3771h;
    }

    public abstract void R1();

    public final void S1(boolean z10) {
        this.f3772i = z10;
    }

    public abstract int U0(AbstractC2521a abstractC2521a);

    public final void U1(boolean z10) {
        this.f3771h = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0(C0.D r14) {
        /*
            r13 = this;
            if (r14 == 0) goto Lb
            E0.r0 r0 = new E0.r0
            r0.<init>(r14, r13)
            r13.V0(r0)
            goto L62
        Lb:
            o.H r14 = r13.f3776m
            if (r14 == 0) goto L54
            java.lang.Object[] r0 = r14.f54923c
            long[] r14 = r14.f54921a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L54
            r2 = 0
            r3 = r2
        L1a:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4f
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L34:
            if (r8 >= r6) goto L4d
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L49
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            o.I r9 = (o.I) r9
            r13.O1(r9)
        L49:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L34
        L4d:
            if (r6 != r7) goto L54
        L4f:
            if (r3 == r1) goto L54
            int r3 = r3 + 1
            goto L1a
        L54:
            o.H r14 = r13.f3776m
            if (r14 == 0) goto L5b
            r14.i()
        L5b:
            o.D r14 = r13.f3774k
            if (r14 == 0) goto L62
            r14.i()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.P.W0(C0.D):void");
    }

    @Override // C0.E
    public final int X(AbstractC2521a abstractC2521a) {
        int iU0;
        return (g1() && (iU0 = U0(abstractC2521a)) != Integer.MIN_VALUE) ? iU0 + Y0.n.i(A0()) : PduHandle.NONE;
    }

    public abstract P Z0();

    @Override // C0.InterfaceC2535o
    public boolean a1() {
        return false;
    }

    public abstract C0.r c1();

    public abstract boolean g1();

    public abstract C0.D h1();

    @Override // androidx.compose.ui.layout.m
    public C0.D i1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            B0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(i10, i11, map, interfaceC6835l, interfaceC6835l2, this);
    }

    @Override // E0.W
    public void k0(boolean z10) {
        this.f3770g = z10;
    }

    public abstract P o1();

    public final t.a q1() {
        return this.f3773j;
    }

    public abstract long r1();

    public final C0.Q z1() {
        C0.Q q10 = this.f3769f;
        return q10 == null ? new e() : q10;
    }
}
