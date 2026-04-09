package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.n0;
import com.google.crypto.tink.shaded.protobuf.o0;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5084k implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f38544a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38545a;

        static {
            int[] iArr = new int[n0.b.values().length];
            f38545a = iArr;
            try {
                iArr[n0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38545a[n0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38545a[n0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38545a[n0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38545a[n0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38545a[n0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38545a[n0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38545a[n0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38545a[n0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38545a[n0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38545a[n0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38545a[n0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C5084k(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) AbstractC5097y.b(codedOutputStream, "output");
        this.f38544a = codedOutputStream2;
        codedOutputStream2.f38433a = this;
    }

    public static C5084k P(CodedOutputStream codedOutputStream) {
        C5084k c5084k = codedOutputStream.f38433a;
        return c5084k != null ? c5084k : new C5084k(codedOutputStream);
    }

    private void Q(int i10, F.a aVar, Map map) {
        int[] iArr = a.f38545a;
        throw null;
    }

    private void R(int i10, Object obj) {
        if (obj instanceof String) {
            this.f38544a.C0(i10, (String) obj);
        } else {
            this.f38544a.a0(i10, (AbstractC5081h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void A(int i10, float f10) {
        this.f38544a.j0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void B(int i10) {
        this.f38544a.D0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.y0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iG = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iG += CodedOutputStream.G(((Integer) list.get(i12)).intValue());
        }
        this.f38544a.F0(iG);
        while (i11 < list.size()) {
            this.f38544a.z0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void D(int i10, int i11) {
        this.f38544a.d0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.p0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.w(((Long) list.get(i12)).longValue());
        }
        this.f38544a.F0(iW);
        while (i11 < list.size()) {
            this.f38544a.q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.d0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += CodedOutputStream.k(((Integer) list.get(i12)).intValue());
        }
        this.f38544a.F0(iK);
        while (i11 < list.size()) {
            this.f38544a.e0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.b0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += CodedOutputStream.i(((Double) list.get(i13)).doubleValue());
        }
        this.f38544a.F0(i12);
        while (i11 < list.size()) {
            this.f38544a.c0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void H(int i10, int i11) {
        this.f38544a.y0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f38544a.a0(i10, (AbstractC5081h) list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void J(int i10, Object obj, c0 c0Var) {
        this.f38544a.r0(i10, (M) obj, c0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void K(int i10, F.a aVar, Map map) {
        if (this.f38544a.T()) {
            Q(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f38544a.D0(i10, 2);
            this.f38544a.F0(F.a(aVar, entry.getKey(), entry.getValue()));
            F.b(this.f38544a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void L(int i10, Object obj, c0 c0Var) {
        this.f38544a.l0(i10, (M) obj, c0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void M(int i10, List list, c0 c0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), c0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void N(int i10, List list, c0 c0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            J(i10, list.get(i11), c0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void O(int i10, AbstractC5081h abstractC5081h) {
        this.f38544a.a0(i10, abstractC5081h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.j0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.q(((Float) list.get(i12)).floatValue());
        }
        this.f38544a.F0(iQ);
        while (i11 < list.size()) {
            this.f38544a.k0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void b(int i10, int i11) {
        this.f38544a.E0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final void c(int i10, Object obj) {
        if (obj instanceof AbstractC5081h) {
            this.f38544a.t0(i10, (AbstractC5081h) obj);
        } else {
            this.f38544a.s0(i10, (M) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void d(int i10, int i11) {
        this.f38544a.f0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void e(int i10, double d10) {
        this.f38544a.b0(i10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += CodedOutputStream.E(((Long) list.get(i12)).longValue());
        }
        this.f38544a.F0(iE);
        while (i11 < list.size()) {
            this.f38544a.x0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.G0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.P(((Long) list.get(i12)).longValue());
        }
        this.f38544a.F0(iP);
        while (i11 < list.size()) {
            this.f38544a.H0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void h(int i10, long j10) {
        this.f38544a.h0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public o0.a i() {
        return o0.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void j(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof B)) {
            while (i11 < list.size()) {
                this.f38544a.C0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            B b10 = (B) list;
            while (i11 < list.size()) {
                R(i10, b10.B(i11));
                i11++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void k(int i10, String str) {
        this.f38544a.C0(i10, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void l(int i10, long j10) {
        this.f38544a.G0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.n0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iU = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iU += CodedOutputStream.u(((Integer) list.get(i12)).intValue());
        }
        this.f38544a.F0(iU);
        while (i11 < list.size()) {
            this.f38544a.o0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void n(int i10, long j10) {
        this.f38544a.p0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void o(int i10, boolean z10) {
        this.f38544a.Y(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void p(int i10, int i11) {
        this.f38544a.u0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void q(int i10) {
        this.f38544a.D0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void r(int i10, int i11) {
        this.f38544a.n0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.o(((Long) list.get(i12)).longValue());
        }
        this.f38544a.F0(iO);
        while (i11 < list.size()) {
            this.f38544a.i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iC = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iC += CodedOutputStream.C(((Integer) list.get(i12)).intValue());
        }
        this.f38544a.F0(iC);
        while (i11 < list.size()) {
            this.f38544a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void u(int i10, long j10) {
        this.f38544a.w0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.m(((Integer) list.get(i12)).intValue());
        }
        this.f38544a.F0(iM);
        while (i11 < list.size()) {
            this.f38544a.g0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.Y(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += CodedOutputStream.e(((Boolean) list.get(i12)).booleanValue());
        }
        this.f38544a.F0(iE);
        while (i11 < list.size()) {
            this.f38544a.Z(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.E0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.N(((Integer) list.get(i12)).intValue());
        }
        this.f38544a.F0(iN);
        while (i11 < list.size()) {
            this.f38544a.F0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f38544a.A0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f38544a.D0(i10, 2);
        int I10 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            I10 += CodedOutputStream.I(((Long) list.get(i12)).longValue());
        }
        this.f38544a.F0(I10);
        while (i11 < list.size()) {
            this.f38544a.B0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public void z(int i10, long j10) {
        this.f38544a.A0(i10, j10);
    }
}
