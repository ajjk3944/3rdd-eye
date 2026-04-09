package T;

import T.InterfaceC3540l;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C7007F;
import org.snmp4j.mp.PduHandle;

/* renamed from: T.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3525e1 {

    /* renamed from: y, reason: collision with root package name */
    public static final a f21050y = new a(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f21051z = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C3516b1 f21052a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f21053b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f21054c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f21055d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f21056e;

    /* renamed from: f, reason: collision with root package name */
    private o.z f21057f;

    /* renamed from: g, reason: collision with root package name */
    private int f21058g;

    /* renamed from: h, reason: collision with root package name */
    private int f21059h;

    /* renamed from: i, reason: collision with root package name */
    private int f21060i;

    /* renamed from: j, reason: collision with root package name */
    private int f21061j;

    /* renamed from: k, reason: collision with root package name */
    private int f21062k;

    /* renamed from: l, reason: collision with root package name */
    private int f21063l;

    /* renamed from: m, reason: collision with root package name */
    private int f21064m;

    /* renamed from: n, reason: collision with root package name */
    private int f21065n;

    /* renamed from: o, reason: collision with root package name */
    private int f21066o;

    /* renamed from: s, reason: collision with root package name */
    private o.z f21070s;

    /* renamed from: t, reason: collision with root package name */
    private int f21071t;

    /* renamed from: u, reason: collision with root package name */
    private int f21072u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21074w;

    /* renamed from: x, reason: collision with root package name */
    private E0 f21075x;

    /* renamed from: p, reason: collision with root package name */
    private final V f21067p = new V();

    /* renamed from: q, reason: collision with root package name */
    private final V f21068q = new V();

    /* renamed from: r, reason: collision with root package name */
    private final V f21069r = new V();

    /* renamed from: v, reason: collision with root package name */
    private int f21073v = -1;

    /* renamed from: T.e1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List b(C3525e1 c3525e1, int i10, C3525e1 c3525e12, boolean z10, boolean z11, boolean z12) {
            boolean zM0;
            List listL;
            int i11;
            int iK0 = c3525e1.k0(i10);
            int i12 = i10 + iK0;
            int iP = c3525e1.P(i10);
            int iP2 = c3525e1.P(i12);
            int i13 = iP2 - iP;
            boolean zM = c3525e1.M(i10);
            c3525e12.o0(iK0);
            c3525e12.p0(i13, c3525e12.a0());
            if (c3525e1.f21058g < i12) {
                c3525e1.x0(i12);
            }
            if (c3525e1.f21062k < iP2) {
                c3525e1.z0(iP2, i12);
            }
            int[] iArr = c3525e12.f21053b;
            int iA0 = c3525e12.a0();
            AbstractC3682n.k(c3525e1.f21053b, iArr, iA0 * 5, i10 * 5, i12 * 5);
            Object[] objArr = c3525e12.f21054c;
            int i14 = c3525e12.f21060i;
            AbstractC3682n.m(c3525e1.f21054c, objArr, i14, iP, iP2);
            int iC0 = c3525e12.c0();
            AbstractC3522d1.b0(iArr, iA0, iC0);
            int i15 = iA0 - i10;
            int i16 = iA0 + iK0;
            int iQ = i14 - c3525e12.Q(iArr, iA0);
            int i17 = c3525e12.f21064m;
            int i18 = c3525e12.f21063l;
            int length = objArr.length;
            int i19 = i17;
            int i20 = iA0;
            while (true) {
                zM0 = false;
                if (i20 >= i16) {
                    break;
                }
                if (i20 != iA0) {
                    i11 = i16;
                    AbstractC3522d1.b0(iArr, i20, AbstractC3522d1.T(iArr, i20) + i15);
                } else {
                    i11 = i16;
                }
                int i21 = iQ;
                AbstractC3522d1.X(iArr, i20, c3525e12.S(c3525e12.Q(iArr, i20) + iQ, i19 >= i20 ? c3525e12.f21062k : 0, i18, length));
                if (i20 == i19) {
                    i19++;
                }
                i20++;
                iQ = i21;
                i16 = i11;
            }
            int i22 = i16;
            c3525e12.f21064m = i19;
            int iP3 = AbstractC3522d1.P(c3525e1.f21055d, i10, c3525e1.d0());
            int iP4 = AbstractC3522d1.P(c3525e1.f21055d, i12, c3525e1.d0());
            if (iP3 < iP4) {
                ArrayList arrayList = c3525e1.f21055d;
                ArrayList arrayList2 = new ArrayList(iP4 - iP3);
                for (int i23 = iP3; i23 < iP4; i23++) {
                    C3520d c3520d = (C3520d) arrayList.get(i23);
                    c3520d.c(c3520d.a() + i15);
                    arrayList2.add(c3520d);
                }
                c3525e12.f21055d.addAll(AbstractC3522d1.P(c3525e12.f21055d, c3525e12.a0(), c3525e12.d0()), arrayList2);
                arrayList.subList(iP3, iP4).clear();
                listL = arrayList2;
            } else {
                listL = AbstractC3689v.l();
            }
            if (!listL.isEmpty()) {
                HashMap map = c3525e1.f21056e;
                HashMap map2 = c3525e12.f21056e;
                if (map != null && map2 != null) {
                    int size = listL.size();
                    for (int i24 = 0; i24 < size; i24++) {
                    }
                }
            }
            c3525e12.c0();
            c3525e12.e1(iC0);
            int iE0 = c3525e1.E0(i10);
            if (z12) {
                if (z10) {
                    boolean z13 = iE0 >= 0;
                    if (z13) {
                        c3525e1.g1();
                        c3525e1.D(iE0 - c3525e1.a0());
                        c3525e1.g1();
                    }
                    c3525e1.D(i10 - c3525e1.a0());
                    boolean zL0 = c3525e1.L0();
                    if (z13) {
                        c3525e1.W0();
                        c3525e1.T();
                        c3525e1.W0();
                        c3525e1.T();
                    }
                    zM0 = zL0;
                } else {
                    zM0 = c3525e1.M0(i10, iK0);
                    c3525e1.N0(iP, i13, i10 - 1);
                }
            }
            if (zM0) {
                AbstractC3546o.r("Unexpectedly removed anchors");
            }
            c3525e12.f21066o += AbstractC3522d1.N(iArr, iA0) ? 1 : AbstractC3522d1.Q(iArr, iA0);
            if (z11) {
                c3525e12.f21071t = i22;
                c3525e12.f21060i = i14 + i13;
            }
            if (zM) {
                c3525e12.p1(iC0);
            }
            return listL;
        }

        static /* synthetic */ List c(a aVar, C3525e1 c3525e1, int i10, C3525e1 c3525e12, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return aVar.b(c3525e1, i10, c3525e12, z10, z11, z12);
        }

        private a() {
        }
    }

    public C3525e1(C3516b1 c3516b1) {
        this.f21052a = c3516b1;
        this.f21053b = c3516b1.u();
        this.f21054c = c3516b1.w();
        this.f21055d = c3516b1.q();
        this.f21056e = c3516b1.y();
        this.f21057f = c3516b1.s();
        this.f21058g = c3516b1.v();
        this.f21059h = (this.f21053b.length / 5) - c3516b1.v();
        this.f21062k = c3516b1.x();
        this.f21063l = this.f21054c.length - c3516b1.x();
        this.f21064m = c3516b1.v();
        this.f21072u = c3516b1.v();
    }

    private final int D0(int[] iArr, int i10) {
        return Q(iArr, i10);
    }

    private final int F0(int[] iArr, int i10) {
        return G0(AbstractC3522d1.T(iArr, h0(i10)));
    }

    private final int G0(int i10) {
        return i10 > -2 ? i10 : d0() + i10 + 2;
    }

    private final int H(int[] iArr, int i10) {
        return Q(iArr, i10) + AbstractC3522d1.E(AbstractC3522d1.H(iArr, i10) >> 29);
    }

    private final int H0(int i10, int i11) {
        return i10 < i11 ? i10 : -((d0() - i10) + 2);
    }

    private final Object I0(Object obj) {
        Object objU0 = U0();
        T0(obj);
        return objU0;
    }

    private final boolean J(int i10) {
        int iK0 = i10 + 1;
        int iK02 = i10 + k0(i10);
        while (iK0 < iK02) {
            if (AbstractC3522d1.C(this.f21053b, h0(iK0))) {
                return true;
            }
            iK0 += k0(iK0);
        }
        return false;
    }

    private final void J0() {
        E0 e02 = this.f21075x;
        if (e02 != null) {
            while (e02.b()) {
                q1(e02.d(), e02);
            }
        }
    }

    private final void K() {
        int i10 = this.f21062k;
        AbstractC3682n.v(this.f21054c, null, i10, this.f21063l + i10);
    }

    private final boolean K0(int i10, int i11, HashMap map) {
        int i12 = i11 + i10;
        int iP = AbstractC3522d1.P(this.f21055d, i12, Y() - this.f21059h);
        if (iP >= this.f21055d.size()) {
            iP--;
        }
        int i13 = iP + 1;
        int i14 = 0;
        while (iP >= 0) {
            C3520d c3520d = (C3520d) this.f21055d.get(iP);
            int iF = F(c3520d);
            if (iF < i10) {
                break;
            }
            if (iF < i12) {
                c3520d.c(PduHandle.NONE);
                if (map != null) {
                }
                if (i14 == 0) {
                    i14 = iP + 1;
                }
                i13 = iP;
            }
            iP--;
        }
        boolean z10 = i13 < i14;
        if (z10) {
            this.f21055d.subList(i13, i14).clear();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M(int i10) {
        return i10 >= 0 && AbstractC3522d1.C(this.f21053b, h0(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M0(int i10, int i11) {
        if (i11 > 0) {
            ArrayList arrayList = this.f21055d;
            x0(i10);
            zK0 = arrayList.isEmpty() ? false : K0(i10, i11, this.f21056e);
            this.f21058g = i10;
            this.f21059h += i11;
            int i12 = this.f21064m;
            if (i12 > i10) {
                this.f21064m = Math.max(i10, i12 - i11);
            }
            int i13 = this.f21072u;
            if (i13 >= this.f21058g) {
                this.f21072u = i13 - i11;
            }
            int i14 = this.f21073v;
            if (N(i14)) {
                p1(i14);
            }
        }
        return zK0;
    }

    private final boolean N(int i10) {
        return i10 >= 0 && AbstractC3522d1.D(this.f21053b, h0(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f21063l;
            int i14 = i10 + i11;
            z0(i14, i12);
            this.f21062k = i10;
            this.f21063l = i13 + i11;
            AbstractC3682n.v(this.f21054c, null, i10, i14);
            int i15 = this.f21061j;
            if (i15 >= i10) {
                this.f21061j = i15 - i11;
            }
        }
    }

    private final int O(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int i10) {
        return Q(this.f21053b, h0(i10));
    }

    private final int P0() {
        int iY = (Y() - this.f21059h) - this.f21068q.i();
        this.f21072u = iY;
        return iY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int[] iArr, int i10) {
        return i10 >= Y() ? this.f21054c.length - this.f21063l : O(AbstractC3522d1.F(iArr, i10), this.f21063l, this.f21054c.length);
    }

    private final void Q0() {
        this.f21068q.j((Y() - this.f21059h) - this.f21072u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int i10) {
        return i10 < this.f21062k ? i10 : i10 + this.f21063l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    private final void X(int i10, int i11, int i12) {
        int iH0 = H0(i10, this.f21058g);
        while (i12 < i11) {
            AbstractC3522d1.b0(this.f21053b, h0(i12), iH0);
            int I10 = AbstractC3522d1.I(this.f21053b, h0(i12)) + i12;
            X(i12, I10, i12 + 1);
            i12 = I10;
        }
    }

    private final int Y() {
        return this.f21053b.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Z0(int[] iArr, int i10) {
        return i10 >= Y() ? this.f21054c.length - this.f21063l : O(AbstractC3522d1.V(iArr, i10), this.f21063l, this.f21054c.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U e1(int i10) {
        C3520d c3520dL1;
        HashMap map = this.f21056e;
        if (map == null || (c3520dL1 = l1(i10)) == null) {
            return null;
        }
        return (U) map.get(c3520dL1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h0(int i10) {
        return i10 < this.f21058g ? i10 : i10 + this.f21059h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i1(int i10, Object obj, boolean z10, Object obj2) {
        int I10;
        int i11 = this.f21073v;
        byte b10 = this.f21065n > 0;
        this.f21069r.j(this.f21066o);
        if (b10 == true) {
            int i12 = this.f21071t;
            int iQ = Q(this.f21053b, h0(i12));
            o0(1);
            this.f21060i = iQ;
            this.f21061j = iQ;
            int iH0 = h0(i12);
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            int i13 = obj != aVar.a() ? 1 : 0;
            int i14 = (z10 || obj2 == aVar.a()) ? 0 : 1;
            int iS = S(iQ, this.f21062k, this.f21063l, this.f21054c.length);
            if (iS >= 0 && this.f21064m < i12) {
                iS = -(((this.f21054c.length - this.f21063l) - iS) + 1);
            }
            AbstractC3522d1.M(this.f21053b, iH0, i10, z10, i13, i14, this.f21073v, iS);
            int i15 = (z10 ? 1 : 0) + i13 + i14;
            if (i15 > 0) {
                p0(i15, i12);
                Object[] objArr = this.f21054c;
                int i16 = this.f21060i;
                if (z10) {
                    objArr[i16] = obj2;
                    i16++;
                }
                if (i13 != 0) {
                    objArr[i16] = obj;
                    i16++;
                }
                if (i14 != 0) {
                    objArr[i16] = obj2;
                    i16++;
                }
                this.f21060i = i16;
            }
            this.f21066o = 0;
            I10 = i12 + 1;
            this.f21073v = i12;
            this.f21071t = I10;
            if (i11 >= 0) {
                e1(i11);
            }
        } else {
            this.f21067p.j(i11);
            Q0();
            int i17 = this.f21071t;
            int iH02 = h0(i17);
            if (!AbstractC6492s.d(obj2, InterfaceC3540l.f21100a.a())) {
                if (z10) {
                    t1(obj2);
                } else {
                    o1(obj2);
                }
            }
            this.f21060i = Z0(this.f21053b, iH02);
            this.f21061j = Q(this.f21053b, h0(this.f21071t + 1));
            this.f21066o = AbstractC3522d1.Q(this.f21053b, iH02);
            this.f21073v = i17;
            this.f21071t = i17 + 1;
            I10 = i17 + AbstractC3522d1.I(this.f21053b, iH02);
        }
        this.f21072u = I10;
    }

    private final void n1(int i10, int i11) {
        C3520d c3520d;
        int iA;
        C3520d c3520d2;
        int iA2;
        int i12;
        int iY = Y() - this.f21059h;
        if (i10 >= i11) {
            for (int iP = AbstractC3522d1.P(this.f21055d, i11, iY); iP < this.f21055d.size() && (iA = (c3520d = (C3520d) this.f21055d.get(iP)).a()) >= 0; iP++) {
                c3520d.c(-(iY - iA));
            }
            return;
        }
        for (int iP2 = AbstractC3522d1.P(this.f21055d, i10, iY); iP2 < this.f21055d.size() && (iA2 = (c3520d2 = (C3520d) this.f21055d.get(iP2)).a()) < 0 && (i12 = iA2 + iY) < i11; iP2++) {
            c3520d2.c(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(int i10) {
        if (i10 > 0) {
            int i11 = this.f21071t;
            x0(i11);
            int i12 = this.f21058g;
            int i13 = this.f21059h;
            int[] iArr = this.f21053b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                AbstractC3682n.k(iArr, iArr2, 0, 0, i12 * 5);
                AbstractC3682n.k(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.f21053b = iArr2;
                i13 = i15;
            }
            int i16 = this.f21072u;
            if (i16 >= i12) {
                this.f21072u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f21058g = i17;
            this.f21059h = i13 - i10;
            int iS = S(i14 > 0 ? P(i11 + i10) : 0, this.f21064m >= i12 ? this.f21062k : 0, this.f21063l, this.f21054c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                AbstractC3522d1.X(this.f21053b, i18, iS);
            }
            int i19 = this.f21064m;
            if (i19 >= i12) {
                this.f21064m = i19 + i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(int i10, int i11) {
        if (i10 > 0) {
            z0(this.f21060i, i11);
            int i12 = this.f21062k;
            int i13 = this.f21063l;
            if (i13 < i10) {
                Object[] objArr = this.f21054c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                AbstractC3682n.m(objArr, objArr2, 0, 0, i12);
                AbstractC3682n.m(objArr, objArr2, i12 + i16, i13 + i12, length);
                this.f21054c = objArr2;
                i13 = i16;
            }
            int i17 = this.f21061j;
            if (i17 >= i12) {
                this.f21061j = i17 + i10;
            }
            this.f21062k = i12 + i10;
            this.f21063l = i13 - i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p1(int i10) {
        if (i10 >= 0) {
            E0 e02 = this.f21075x;
            if (e02 == null) {
                e02 = new E0(null, 1, 0 == true ? 1 : 0);
                this.f21075x = e02;
            }
            e02.a(i10);
        }
    }

    private final void q1(int i10, E0 e02) {
        int iH0 = h0(i10);
        boolean zJ = J(i10);
        if (AbstractC3522d1.D(this.f21053b, iH0) != zJ) {
            AbstractC3522d1.W(this.f21053b, iH0, zJ);
            int iE0 = E0(i10);
            if (iE0 >= 0) {
                e02.a(iE0);
            }
        }
    }

    private final void r1(int[] iArr, int i10, int i11) {
        AbstractC3522d1.X(iArr, i10, S(i11, this.f21062k, this.f21063l, this.f21054c.length));
    }

    public static /* synthetic */ void t0(C3525e1 c3525e1, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c3525e1.f21073v;
        }
        c3525e1.s0(i10);
    }

    private final void u0(int i10, int i11, int i12) {
        C3520d c3520d;
        int iF;
        int i13 = i12 + i10;
        int iD0 = d0();
        int iP = AbstractC3522d1.P(this.f21055d, i10, iD0);
        ArrayList arrayList = new ArrayList();
        if (iP >= 0) {
            while (iP < this.f21055d.size() && (iF = F((c3520d = (C3520d) this.f21055d.get(iP)))) >= i10 && iF < i13) {
                arrayList.add(c3520d);
                this.f21055d.remove(iP);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            C3520d c3520d2 = (C3520d) arrayList.get(i15);
            int iF2 = F(c3520d2) + i14;
            if (iF2 >= this.f21058g) {
                c3520d2.c(-(iD0 - iF2));
            } else {
                c3520d2.c(iF2);
            }
            this.f21055d.add(AbstractC3522d1.P(this.f21055d, iF2, iD0), c3520d2);
        }
    }

    private final void u1(int i10, Object obj) {
        int iH0 = h0(i10);
        int[] iArr = this.f21053b;
        if (!(iH0 < iArr.length && AbstractC3522d1.N(iArr, iH0))) {
            AbstractC3546o.r("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f21054c[R(D0(this.f21053b, iH0))] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(int i10) {
        int i11 = this.f21059h;
        int i12 = this.f21058g;
        if (i12 != i10) {
            if (!this.f21055d.isEmpty()) {
                n1(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.f21053b;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    AbstractC3682n.k(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    AbstractC3682n.k(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int iY = Y();
            AbstractC3546o.O(i12 < iY);
            while (i12 < iY) {
                int iT = AbstractC3522d1.T(this.f21053b, i12);
                int iH0 = H0(G0(iT), i10);
                if (iH0 != iT) {
                    AbstractC3522d1.b0(this.f21053b, i12, iH0);
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.f21058g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(int i10, int i11) {
        int i12 = this.f21063l;
        int i13 = this.f21062k;
        int i14 = this.f21064m;
        if (i13 != i10) {
            Object[] objArr = this.f21054c;
            if (i10 < i13) {
                AbstractC3682n.m(objArr, objArr, i10 + i12, i10, i13);
            } else {
                AbstractC3682n.m(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
        }
        int iMin = Math.min(i11 + 1, d0());
        if (i14 != iMin) {
            int length = this.f21054c.length - i12;
            if (iMin < i14) {
                int iH0 = h0(iMin);
                int iH02 = h0(i14);
                int i15 = this.f21058g;
                while (iH0 < iH02) {
                    int iF = AbstractC3522d1.F(this.f21053b, iH0);
                    if (!(iF >= 0)) {
                        AbstractC3546o.r("Unexpected anchor value, expected a positive anchor");
                    }
                    AbstractC3522d1.X(this.f21053b, iH0, -((length - iF) + 1));
                    iH0++;
                    if (iH0 == i15) {
                        iH0 += this.f21059h;
                    }
                }
            } else {
                int iH03 = h0(i14);
                int iH04 = h0(iMin);
                while (iH03 < iH04) {
                    int iF2 = AbstractC3522d1.F(this.f21053b, iH03);
                    if (!(iF2 < 0)) {
                        AbstractC3546o.r("Unexpected anchor value, expected a negative anchor");
                    }
                    AbstractC3522d1.X(this.f21053b, iH03, iF2 + length + 1);
                    iH03++;
                    if (iH03 == this.f21058g) {
                        iH03 += this.f21059h;
                    }
                }
            }
            this.f21064m = iMin;
        }
        this.f21062k = i10;
    }

    public final Object A0(int i10) {
        int iH0 = h0(i10);
        if (AbstractC3522d1.N(this.f21053b, iH0)) {
            return this.f21054c[R(D0(this.f21053b, iH0))];
        }
        return null;
    }

    public final Object B0(C3520d c3520d) {
        return A0(c3520d.e(this));
    }

    public final int C0(int i10) {
        return AbstractC3522d1.Q(this.f21053b, h0(i10));
    }

    public final void D(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            AbstractC3546o.r("Cannot seek backwards");
        }
        if (!(this.f21065n <= 0)) {
            B0.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f21071t + i10;
        if (i11 >= this.f21073v && i11 <= this.f21072u) {
            z10 = true;
        }
        if (!z10) {
            AbstractC3546o.r("Cannot seek outside the current group (" + this.f21073v + '-' + this.f21072u + ')');
        }
        this.f21071t = i11;
        int iQ = Q(this.f21053b, h0(i11));
        this.f21060i = iQ;
        this.f21061j = iQ;
    }

    public final C3520d E(int i10) {
        ArrayList arrayList = this.f21055d;
        int iU = AbstractC3522d1.U(arrayList, i10, d0());
        if (iU >= 0) {
            return (C3520d) arrayList.get(iU);
        }
        if (i10 > this.f21058g) {
            i10 = -(d0() - i10);
        }
        C3520d c3520d = new C3520d(i10);
        arrayList.add(-(iU + 1), c3520d);
        return c3520d;
    }

    public final int E0(int i10) {
        return F0(this.f21053b, i10);
    }

    public final int F(C3520d c3520d) {
        int iA = c3520d.a();
        return iA < 0 ? iA + d0() : iA;
    }

    public final void G(C3520d c3520d, Object obj) {
        if (!(this.f21065n == 0)) {
            AbstractC3546o.r("Can only append a slot if not current inserting");
        }
        int i10 = this.f21060i;
        int i11 = this.f21061j;
        int iF = F(c3520d);
        int iQ = Q(this.f21053b, h0(iF + 1));
        this.f21060i = iQ;
        this.f21061j = iQ;
        p0(1, iF);
        if (i10 >= iQ) {
            i10++;
            i11++;
        }
        this.f21054c[iQ] = obj;
        this.f21060i = i10;
        this.f21061j = i11;
    }

    public final void I() {
        int i10 = this.f21065n;
        this.f21065n = i10 + 1;
        if (i10 == 0) {
            Q0();
        }
    }

    public final void L(boolean z10) {
        this.f21074w = true;
        if (z10 && this.f21067p.d()) {
            x0(d0());
            z0(this.f21054c.length - this.f21063l, this.f21058g);
            K();
            J0();
        }
        this.f21052a.g(this, this.f21053b, this.f21058g, this.f21054c, this.f21062k, this.f21055d, this.f21056e, this.f21057f);
    }

    public final boolean L0() {
        if (!(this.f21065n == 0)) {
            AbstractC3546o.r("Cannot remove group while inserting");
        }
        int i10 = this.f21071t;
        int i11 = this.f21060i;
        int iQ = Q(this.f21053b, h0(i10));
        int iV0 = V0();
        e1(this.f21073v);
        E0 e02 = this.f21075x;
        if (e02 != null) {
            while (e02.b() && e02.c() >= i10) {
                e02.d();
            }
        }
        boolean zM0 = M0(i10, this.f21071t - i10);
        N0(iQ, this.f21060i - iQ, i10 - 1);
        this.f21071t = i10;
        this.f21060i = i11;
        this.f21066o -= iV0;
        return zM0;
    }

    public final void O0() {
        if (!(this.f21065n == 0)) {
            AbstractC3546o.r("Cannot reset when inserting");
        }
        J0();
        this.f21071t = 0;
        this.f21072u = Y() - this.f21059h;
        this.f21060i = 0;
        this.f21061j = 0;
        this.f21066o = 0;
    }

    public final Object R0(int i10, int i11, Object obj) {
        int iR = R(a1(i10, i11));
        Object[] objArr = this.f21054c;
        Object obj2 = objArr[iR];
        objArr[iR] = obj;
        return obj2;
    }

    public final Object S0(int i10, Object obj) {
        return R0(this.f21071t, i10, obj);
    }

    public final int T() {
        C7007F c7007f;
        boolean z10 = this.f21065n > 0;
        int i10 = this.f21071t;
        int i11 = this.f21072u;
        int i12 = this.f21073v;
        int iH0 = h0(i12);
        int i13 = this.f21066o;
        int i14 = i10 - i12;
        boolean zN = AbstractC3522d1.N(this.f21053b, iH0);
        if (z10) {
            o.z zVar = this.f21070s;
            if (zVar != null && (c7007f = (C7007F) zVar.c(i12)) != null) {
                Object[] objArr = c7007f.f54910a;
                int i15 = c7007f.f54911b;
                for (int i16 = 0; i16 < i15; i16++) {
                    I0(objArr[i16]);
                }
            }
            AbstractC3522d1.Y(this.f21053b, iH0, i14);
            AbstractC3522d1.a0(this.f21053b, iH0, i13);
            this.f21066o = this.f21069r.i() + (zN ? 1 : i13);
            int iF0 = F0(this.f21053b, i12);
            this.f21073v = iF0;
            int iD0 = iF0 < 0 ? d0() : h0(iF0 + 1);
            int iQ = iD0 >= 0 ? Q(this.f21053b, iD0) : 0;
            this.f21060i = iQ;
            this.f21061j = iQ;
        } else {
            if (!(i10 == i11)) {
                AbstractC3546o.r("Expected to be at the end of a group");
            }
            int I10 = AbstractC3522d1.I(this.f21053b, iH0);
            int iQ2 = AbstractC3522d1.Q(this.f21053b, iH0);
            AbstractC3522d1.Y(this.f21053b, iH0, i14);
            AbstractC3522d1.a0(this.f21053b, iH0, i13);
            int i17 = this.f21067p.i();
            P0();
            this.f21073v = i17;
            int iF02 = F0(this.f21053b, i12);
            int i18 = this.f21069r.i();
            this.f21066o = i18;
            if (iF02 == i17) {
                this.f21066o = i18 + (zN ? 0 : i13 - iQ2);
            } else {
                int i19 = i14 - I10;
                int i20 = zN ? 0 : i13 - iQ2;
                if (i19 != 0 || i20 != 0) {
                    while (iF02 != 0 && iF02 != i17 && (i20 != 0 || i19 != 0)) {
                        int iH02 = h0(iF02);
                        if (i19 != 0) {
                            AbstractC3522d1.Y(this.f21053b, iH02, AbstractC3522d1.I(this.f21053b, iH02) + i19);
                        }
                        if (i20 != 0) {
                            int[] iArr = this.f21053b;
                            AbstractC3522d1.a0(iArr, iH02, AbstractC3522d1.Q(iArr, iH02) + i20);
                        }
                        if (AbstractC3522d1.N(this.f21053b, iH02)) {
                            i20 = 0;
                        }
                        iF02 = F0(this.f21053b, iF02);
                    }
                }
                this.f21066o += i20;
            }
        }
        return i13;
    }

    public final void T0(Object obj) {
        if (!(this.f21060i <= this.f21061j)) {
            AbstractC3546o.r("Writing to an invalid slot");
        }
        this.f21054c[R(this.f21060i - 1)] = obj;
    }

    public final void U() {
        if (!(this.f21065n > 0)) {
            B0.b("Unbalanced begin/end insert");
        }
        int i10 = this.f21065n - 1;
        this.f21065n = i10;
        if (i10 == 0) {
            if (!(this.f21069r.b() == this.f21067p.b())) {
                AbstractC3546o.r("startGroup/endGroup mismatch while inserting");
            }
            P0();
        }
    }

    public final Object U0() {
        if (this.f21065n > 0) {
            p0(1, this.f21073v);
        }
        Object[] objArr = this.f21054c;
        int i10 = this.f21060i;
        this.f21060i = i10 + 1;
        return objArr[R(i10)];
    }

    public final void V(int i10) {
        boolean z10 = false;
        if (!(this.f21065n <= 0)) {
            AbstractC3546o.r("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f21073v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f21072u) {
                z10 = true;
            }
            if (!z10) {
                AbstractC3546o.r("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f21071t;
            int i13 = this.f21060i;
            int i14 = this.f21061j;
            this.f21071t = i10;
            g1();
            this.f21071t = i12;
            this.f21060i = i13;
            this.f21061j = i14;
        }
    }

    public final int V0() {
        int iH0 = h0(this.f21071t);
        int I10 = this.f21071t + AbstractC3522d1.I(this.f21053b, iH0);
        this.f21071t = I10;
        this.f21060i = Q(this.f21053b, h0(I10));
        if (AbstractC3522d1.N(this.f21053b, iH0)) {
            return 1;
        }
        return AbstractC3522d1.Q(this.f21053b, iH0);
    }

    public final void W(C3520d c3520d) {
        V(c3520d.e(this));
    }

    public final void W0() {
        int i10 = this.f21072u;
        this.f21071t = i10;
        this.f21060i = Q(this.f21053b, h0(i10));
    }

    public final Object X0(int i10, int i11) {
        int iZ0 = Z0(this.f21053b, h0(i10));
        int iQ = Q(this.f21053b, h0(i10 + 1));
        int i12 = i11 + iZ0;
        if (iZ0 > i12 || i12 >= iQ) {
            return InterfaceC3540l.f21100a.a();
        }
        return this.f21054c[R(i12)];
    }

    public final Object Y0(C3520d c3520d, int i10) {
        return X0(F(c3520d), i10);
    }

    public final boolean Z() {
        return this.f21074w;
    }

    public final int a0() {
        return this.f21071t;
    }

    public final int a1(int i10, int i11) {
        int iZ0 = Z0(this.f21053b, h0(i10));
        int i12 = iZ0 + i11;
        if (!(i12 >= iZ0 && i12 < Q(this.f21053b, h0(i10 + 1)))) {
            AbstractC3546o.r("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int b0() {
        return this.f21072u;
    }

    public final int b1(int i10) {
        return Q(this.f21053b, h0(i10 + k0(i10)));
    }

    public final int c0() {
        return this.f21073v;
    }

    public final int c1(int i10) {
        return Q(this.f21053b, h0(i10 + 1));
    }

    public final int d0() {
        return Y() - this.f21059h;
    }

    public final int d1(int i10) {
        return Z0(this.f21053b, h0(i10));
    }

    public final int e0() {
        return this.f21054c.length - this.f21063l;
    }

    public final C3516b1 f0() {
        return this.f21052a;
    }

    public final void f1(int i10, Object obj, Object obj2) {
        i1(i10, obj, false, obj2);
    }

    public final Object g0(int i10) {
        int iH0 = h0(i10);
        return AbstractC3522d1.J(this.f21053b, iH0) ? this.f21054c[H(this.f21053b, iH0)] : InterfaceC3540l.f21100a.a();
    }

    public final void g1() {
        if (!(this.f21065n == 0)) {
            AbstractC3546o.r("Key must be supplied when inserting");
        }
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        i1(0, aVar.a(), false, aVar.a());
    }

    public final void h1(int i10, Object obj) {
        i1(i10, obj, false, InterfaceC3540l.f21100a.a());
    }

    public final int i0(int i10) {
        return AbstractC3522d1.O(this.f21053b, h0(i10));
    }

    public final Object j0(int i10) {
        int iH0 = h0(i10);
        if (AbstractC3522d1.L(this.f21053b, iH0)) {
            return this.f21054c[AbstractC3522d1.S(this.f21053b, iH0)];
        }
        return null;
    }

    public final void j1(int i10, Object obj) {
        i1(i10, obj, true, InterfaceC3540l.f21100a.a());
    }

    public final int k0(int i10) {
        return AbstractC3522d1.I(this.f21053b, h0(i10));
    }

    public final void k1(int i10) {
        AbstractC3546o.O(i10 > 0);
        int i11 = this.f21073v;
        int iZ0 = Z0(this.f21053b, h0(i11));
        int iQ = Q(this.f21053b, h0(i11 + 1)) - i10;
        AbstractC3546o.O(iQ >= iZ0);
        N0(iQ, i10, i11);
        int i12 = this.f21060i;
        if (i12 >= iZ0) {
            this.f21060i = i12 - i10;
        }
    }

    public final boolean l0(int i10) {
        return m0(i10, this.f21071t);
    }

    public final C3520d l1(int i10) {
        if (i10 < 0 || i10 >= d0()) {
            return null;
        }
        return AbstractC3522d1.G(this.f21055d, i10, d0());
    }

    public final boolean m0(int i10, int i11) {
        int iC;
        int iY;
        if (i11 == this.f21073v) {
            iY = this.f21072u;
        } else if (i11 <= this.f21067p.h(0) && (iC = this.f21067p.c(i11)) >= 0) {
            iY = (Y() - this.f21059h) - this.f21068q.f(iC);
        } else {
            int iK0 = k0(i11);
            iY = iK0 + i11;
        }
        return i10 > i11 && i10 < iY;
    }

    public final Object m1(Object obj) {
        if (this.f21065n <= 0 || this.f21060i == this.f21062k) {
            return I0(obj);
        }
        o.z zVar = this.f21070s;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i10 = 1;
        int i11 = 0;
        if (zVar == null) {
            zVar = new o.z(i11, i10, defaultConstructorMarker);
        }
        this.f21070s = zVar;
        int i12 = this.f21073v;
        Object objC = zVar.c(i12);
        if (objC == null) {
            objC = new C7007F(i11, i10, defaultConstructorMarker);
            zVar.t(i12, objC);
        }
        ((C7007F) objC).g(obj);
        return InterfaceC3540l.f21100a.a();
    }

    public final boolean n0(int i10) {
        int i11 = this.f21073v;
        return (i10 > i11 && i10 < this.f21072u) || (i11 == 0 && i10 == 0);
    }

    public final void o1(Object obj) {
        int iH0 = h0(this.f21071t);
        if (!AbstractC3522d1.J(this.f21053b, iH0)) {
            AbstractC3546o.r("Updating the data of a group that was not created with a data slot");
        }
        this.f21054c[R(H(this.f21053b, iH0))] = obj;
    }

    public final boolean q0() {
        int i10 = this.f21071t;
        return i10 < this.f21072u && AbstractC3522d1.N(this.f21053b, h0(i10));
    }

    public final boolean r0(int i10) {
        return AbstractC3522d1.N(this.f21053b, h0(i10));
    }

    public final void s0(int i10) {
        int iH0 = h0(i10);
        if (AbstractC3522d1.K(this.f21053b, iH0)) {
            return;
        }
        AbstractC3522d1.Z(this.f21053b, iH0, true);
        if (AbstractC3522d1.D(this.f21053b, iH0)) {
            return;
        }
        p1(E0(i10));
    }

    public final void s1(C3520d c3520d, Object obj) {
        u1(c3520d.e(this), obj);
    }

    public final void t1(Object obj) {
        u1(this.f21071t, obj);
    }

    public String toString() {
        return "SlotWriter(current = " + this.f21071t + " end=" + this.f21072u + " size = " + d0() + " gap=" + this.f21058g + '-' + (this.f21058g + this.f21059h) + ')';
    }

    public final List v0(C3516b1 c3516b1, int i10, boolean z10) {
        AbstractC3546o.O(this.f21065n > 0);
        if (i10 != 0 || this.f21071t != 0 || this.f21052a.v() != 0 || AbstractC3522d1.I(c3516b1.u(), i10) != c3516b1.v()) {
            C3525e1 c3525e1G = c3516b1.G();
            try {
                List listB = f21050y.b(c3525e1G, i10, this, true, true, z10);
                c3525e1G.L(true);
                return listB;
            } catch (Throwable th2) {
                c3525e1G.L(false);
                throw th2;
            }
        }
        int[] iArr = this.f21053b;
        Object[] objArr = this.f21054c;
        ArrayList arrayList = this.f21055d;
        HashMap map = this.f21056e;
        o.z zVar = this.f21057f;
        int[] iArrU = c3516b1.u();
        int iV = c3516b1.v();
        Object[] objArrW = c3516b1.w();
        int iX = c3516b1.x();
        HashMap mapY = c3516b1.y();
        o.z zVarS = c3516b1.s();
        this.f21053b = iArrU;
        this.f21054c = objArrW;
        this.f21055d = c3516b1.q();
        this.f21058g = iV;
        this.f21059h = (iArrU.length / 5) - iV;
        this.f21062k = iX;
        this.f21063l = objArrW.length - iX;
        this.f21064m = iV;
        this.f21056e = mapY;
        this.f21057f = zVarS;
        c3516b1.I(iArr, 0, objArr, 0, arrayList, map, zVar);
        return this.f21055d;
    }

    public final void v1() {
        this.f21056e = this.f21052a.y();
        this.f21057f = this.f21052a.s();
    }

    public final void w0(int i10) {
        if (!(this.f21065n == 0)) {
            AbstractC3546o.r("Cannot move a group while inserting");
        }
        if (!(i10 >= 0)) {
            AbstractC3546o.r("Parameter offset is out of bounds");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f21071t;
        int i12 = this.f21073v;
        int i13 = this.f21072u;
        int I10 = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            I10 += AbstractC3522d1.I(this.f21053b, h0(I10));
            if (!(I10 <= i13)) {
                AbstractC3546o.r("Parameter offset is out of bounds");
            }
        }
        int I11 = AbstractC3522d1.I(this.f21053b, h0(I10));
        int iQ = Q(this.f21053b, h0(this.f21071t));
        int iQ2 = Q(this.f21053b, h0(I10));
        int i15 = I10 + I11;
        int iQ3 = Q(this.f21053b, h0(i15));
        int i16 = iQ3 - iQ2;
        p0(i16, Math.max(this.f21071t - 1, 0));
        o0(I11);
        int[] iArr = this.f21053b;
        int iH0 = h0(i15) * 5;
        AbstractC3682n.k(iArr, iArr, h0(i11) * 5, iH0, (I11 * 5) + iH0);
        if (i16 > 0) {
            Object[] objArr = this.f21054c;
            AbstractC3682n.m(objArr, objArr, iQ, R(iQ2 + i16), R(iQ3 + i16));
        }
        int i17 = iQ2 + i16;
        int i18 = i17 - iQ;
        int i19 = this.f21062k;
        int i20 = this.f21063l;
        int length = this.f21054c.length;
        int i21 = this.f21064m;
        int i22 = i11 + I11;
        int i23 = i11;
        while (i23 < i22) {
            int iH02 = h0(i23);
            int i24 = i19;
            int i25 = i18;
            r1(iArr, iH02, S(Q(iArr, iH02) - i18, i21 < iH02 ? 0 : i24, i20, length));
            i23++;
            i19 = i24;
            i18 = i25;
        }
        u0(i15, i11, I11);
        if (M0(i15, I11)) {
            AbstractC3546o.r("Unexpectedly removed anchors");
        }
        X(i12, this.f21072u, i11);
        if (i16 > 0) {
            N0(i17, i16, i15 - 1);
        }
    }

    public final List y0(int i10, C3516b1 c3516b1, int i11) {
        AbstractC3546o.O(this.f21065n <= 0 && k0(this.f21071t + i10) == 1);
        int i12 = this.f21071t;
        int i13 = this.f21060i;
        int i14 = this.f21061j;
        D(i10);
        g1();
        I();
        C3525e1 c3525e1G = c3516b1.G();
        try {
            List listC = a.c(f21050y, c3525e1G, i11, this, false, true, false, 32, null);
            c3525e1G.L(true);
            U();
            T();
            this.f21071t = i12;
            this.f21060i = i13;
            this.f21061j = i14;
            return listC;
        } catch (Throwable th2) {
            c3525e1G.L(false);
            throw th2;
        }
    }
}
