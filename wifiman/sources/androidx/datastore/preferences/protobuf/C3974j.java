package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.p0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3974j implements p0 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f30896a;

    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30897a;

        static {
            int[] iArr = new int[o0.b.values().length];
            f30897a = iArr;
            try {
                iArr[o0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30897a[o0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30897a[o0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30897a[o0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30897a[o0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30897a[o0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30897a[o0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30897a[o0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30897a[o0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30897a[o0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30897a[o0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30897a[o0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C3974j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) AbstractC3987x.b(codedOutputStream, "output");
        this.f30896a = codedOutputStream2;
        codedOutputStream2.f30771a = this;
    }

    public static C3974j P(CodedOutputStream codedOutputStream) {
        C3974j c3974j = codedOutputStream.f30771a;
        return c3974j != null ? c3974j : new C3974j(codedOutputStream);
    }

    private void Q(int i10, boolean z10, Object obj, F.a aVar) {
        this.f30896a.N0(i10, 2);
        this.f30896a.P0(F.b(aVar, Boolean.valueOf(z10), obj));
        F.e(this.f30896a, aVar, Boolean.valueOf(z10), obj);
    }

    private void R(int i10, F.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f30896a.N0(i10, 2);
            this.f30896a.P0(F.b(aVar, Integer.valueOf(i13), obj));
            F.e(this.f30896a, aVar, Integer.valueOf(i13), obj);
        }
    }

    private void S(int i10, F.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f30896a.N0(i10, 2);
            this.f30896a.P0(F.b(aVar, Long.valueOf(j10), obj));
            F.e(this.f30896a, aVar, Long.valueOf(j10), obj);
        }
    }

    private void T(int i10, F.a aVar, Map map) {
        switch (a.f30897a[aVar.f30784a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f30784a);
        }
    }

    private void U(int i10, F.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f30896a.N0(i10, 2);
            this.f30896a.P0(F.b(aVar, str, obj));
            F.e(this.f30896a, aVar, str, obj);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f30896a.L0(i10, (String) obj);
        } else {
            this.f30896a.f0(i10, (AbstractC3971g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void A(int i10, float f10) {
        this.f30896a.p0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void B(int i10) {
        this.f30896a.N0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.H0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += CodedOutputStream.K(((Integer) list.get(i12)).intValue());
        }
        this.f30896a.P0(iK);
        while (i11 < list.size()) {
            this.f30896a.I0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void D(int i10, int i11) {
        this.f30896a.j0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.x0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += CodedOutputStream.x(((Long) list.get(i12)).longValue());
        }
        this.f30896a.P0(iX);
        while (i11 < list.size()) {
            this.f30896a.y0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.j0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += CodedOutputStream.k(((Integer) list.get(i12)).intValue());
        }
        this.f30896a.P0(iK);
        while (i11 < list.size()) {
            this.f30896a.k0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.h0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += CodedOutputStream.i(((Double) list.get(i13)).doubleValue());
        }
        this.f30896a.P0(i12);
        while (i11 < list.size()) {
            this.f30896a.i0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void H(int i10, int i11) {
        this.f30896a.H0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f30896a.f0(i10, (AbstractC3971g) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void J(int i10, List list, c0 c0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            M(i10, list.get(i11), c0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void K(int i10, List list, c0 c0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            O(i10, list.get(i11), c0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void L(int i10, AbstractC3971g abstractC3971g) {
        this.f30896a.f0(i10, abstractC3971g);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void M(int i10, Object obj, c0 c0Var) {
        this.f30896a.z0(i10, (M) obj, c0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void N(int i10, F.a aVar, Map map) {
        if (this.f30896a.Y()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f30896a.N0(i10, 2);
            this.f30896a.P0(F.b(aVar, entry.getKey(), entry.getValue()));
            F.e(this.f30896a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void O(int i10, Object obj, c0 c0Var) {
        this.f30896a.s0(i10, (M) obj, c0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.p0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.q(((Float) list.get(i12)).floatValue());
        }
        this.f30896a.P0(iQ);
        while (i11 < list.size()) {
            this.f30896a.q0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void b(int i10, int i11) {
        this.f30896a.O0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final void c(int i10, Object obj) {
        if (obj instanceof AbstractC3971g) {
            this.f30896a.C0(i10, (AbstractC3971g) obj);
        } else {
            this.f30896a.B0(i10, (M) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void d(int i10, int i11) {
        this.f30896a.l0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void e(int i10, double d10) {
        this.f30896a.h0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.F0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int I10 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            I10 += CodedOutputStream.I(((Long) list.get(i12)).longValue());
        }
        this.f30896a.P0(I10);
        while (i11 < list.size()) {
            this.f30896a.G0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.Q0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iT += CodedOutputStream.T(((Long) list.get(i12)).longValue());
        }
        this.f30896a.P0(iT);
        while (i11 < list.size()) {
            this.f30896a.R0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void h(int i10, long j10) {
        this.f30896a.n0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public p0.a i() {
        return p0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void j(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof B)) {
            while (i11 < list.size()) {
                this.f30896a.L0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            B b10 = (B) list;
            while (i11 < list.size()) {
                V(i10, b10.B(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void k(int i10, String str) {
        this.f30896a.L0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void l(int i10, long j10) {
        this.f30896a.Q0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.v0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += CodedOutputStream.v(((Integer) list.get(i12)).intValue());
        }
        this.f30896a.P0(iV);
        while (i11 < list.size()) {
            this.f30896a.w0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void n(int i10, long j10) {
        this.f30896a.x0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void o(int i10, boolean z10) {
        this.f30896a.b0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void p(int i10, int i11) {
        this.f30896a.D0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void q(int i10) {
        this.f30896a.N0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void r(int i10, int i11) {
        this.f30896a.v0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.n0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.o(((Long) list.get(i12)).longValue());
        }
        this.f30896a.P0(iO);
        while (i11 < list.size()) {
            this.f30896a.o0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.D0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iG = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iG += CodedOutputStream.G(((Integer) list.get(i12)).intValue());
        }
        this.f30896a.P0(iG);
        while (i11 < list.size()) {
            this.f30896a.E0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void u(int i10, long j10) {
        this.f30896a.F0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.l0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.m(((Integer) list.get(i12)).intValue());
        }
        this.f30896a.P0(iM);
        while (i11 < list.size()) {
            this.f30896a.m0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.b0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iD = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD += CodedOutputStream.d(((Boolean) list.get(i12)).booleanValue());
        }
        this.f30896a.P0(iD);
        while (i11 < list.size()) {
            this.f30896a.c0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.O0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.R(((Integer) list.get(i12)).intValue());
        }
        this.f30896a.P0(iR);
        while (i11 < list.size()) {
            this.f30896a.P0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30896a.J0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f30896a.N0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.M(((Long) list.get(i12)).longValue());
        }
        this.f30896a.P0(iM);
        while (i11 < list.size()) {
            this.f30896a.K0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void z(int i10, long j10) {
        this.f30896a.J0(i10, j10);
    }
}
