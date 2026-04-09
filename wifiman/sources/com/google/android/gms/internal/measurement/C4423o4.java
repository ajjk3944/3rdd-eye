package com.google.android.gms.internal.measurement;

import f.AbstractC5487d;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4423o4 implements InterfaceC4331d6 {

    /* renamed from: a, reason: collision with root package name */
    private final zzjr f35412a;

    private C4423o4(zzjr zzjrVar) {
        zzjr zzjrVar2 = (zzjr) F4.f(zzjrVar, "output");
        this.f35412a = zzjrVar2;
        zzjrVar2.f35550a = this;
    }

    public static C4423o4 I(zzjr zzjrVar) {
        C4423o4 c4423o4 = zzjrVar.f35550a;
        return c4423o4 != null ? c4423o4 : new C4423o4(zzjrVar);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void A(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof O4)) {
            while (i11 < list.size()) {
                this.f35412a.q(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        O4 o42 = (O4) list;
        while (i11 < list.size()) {
            Object objZza = o42.zza(i11);
            if (objZza instanceof String) {
                this.f35412a.q(i10, (String) objZza);
            } else {
                this.f35412a.n(i10, (V3) objZza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void B(int i10, int i11) {
        this.f35412a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void C(int i10, long j10) {
        this.f35412a.q0(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void D(int i10, V3 v32) {
        this.f35412a.n(i10, v32);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void E(int i10, List list, boolean z10) {
        if (list instanceof C4) {
            AbstractC5487d.a(list);
            if (!z10) {
                throw null;
            }
            this.f35412a.V(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f35412a.J(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iD = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD += zzjr.d(((Float) list.get(i12)).floatValue());
        }
        this.f35412a.U(iD);
        while (i11 < list.size()) {
            this.f35412a.G(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void F(int i10, int i11) {
        this.f35412a.y0(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void G(int i10, long j10) {
        this.f35412a.L(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void H(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f35412a.n(i10, (V3) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void a(int i10, boolean z10) {
        this.f35412a.r(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iK0 += zzjr.k0(((Integer) list.get(i12)).intValue());
            }
            this.f35412a.U(iK0);
            while (i11 < list.size()) {
                this.f35412a.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f35412a.l(i10, g42.e(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iK02 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iK02 += zzjr.k0(g42.e(i13));
        }
        this.f35412a.U(iK02);
        while (i11 < g42.size()) {
            this.f35412a.k(g42.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void c(int i10, long j10) {
        this.f35412a.L(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void d(int i10, Object obj, InterfaceC4495x5 interfaceC4495x5) {
        this.f35412a.p(i10, (InterfaceC4366h5) obj, interfaceC4495x5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void e(int i10, int i11) {
        this.f35412a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void f(int i10, List list, boolean z10) {
        if (list instanceof T3) {
            AbstractC5487d.a(list);
            if (!z10) {
                throw null;
            }
            this.f35412a.V(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f35412a.r(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iH = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iH += zzjr.h(((Boolean) list.get(i12)).booleanValue());
        }
        this.f35412a.U(iH);
        while (i11 < list.size()) {
            this.f35412a.O(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof S4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.L(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iA0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA0 += zzjr.a0(((Long) list.get(i12)).longValue());
            }
            this.f35412a.U(iA0);
            while (i11 < list.size()) {
                this.f35412a.N(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        S4 s42 = (S4) list;
        if (!z10) {
            while (i11 < s42.size()) {
                this.f35412a.L(i10, s42.r(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iA02 = 0;
        for (int i13 = 0; i13 < s42.size(); i13++) {
            iA02 += zzjr.a0(s42.r(i13));
        }
        this.f35412a.U(iA02);
        while (i11 < s42.size()) {
            this.f35412a.N(s42.r(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void h(int i10, int i11) {
        this.f35412a.K(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void i(int i10, long j10) {
        this.f35412a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void j(int i10, Object obj) {
        if (obj instanceof V3) {
            this.f35412a.M(i10, (V3) obj);
        } else {
            this.f35412a.o(i10, (InterfaceC4366h5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void k(int i10, List list, InterfaceC4495x5 interfaceC4495x5) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            s(i10, list.get(i11), interfaceC4495x5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void l(int i10, List list, boolean z10) {
        if (list instanceof AbstractC4415n4) {
            AbstractC5487d.a(list);
            if (!z10) {
                throw null;
            }
            this.f35412a.V(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f35412a.I(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iC = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iC += zzjr.c(((Double) list.get(i12)).doubleValue());
        }
        this.f35412a.U(iC);
        while (i11 < list.size()) {
            this.f35412a.F(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void m(int i10, Y4 y42, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f35412a.V(i10, 2);
            this.f35412a.U(Z4.a(y42, entry.getKey(), entry.getValue()));
            Z4.b(this.f35412a, y42, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void n(int i10, String str) {
        this.f35412a.q(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void o(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.y0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iO0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iO0 += zzjr.o0(((Integer) list.get(i12)).intValue());
            }
            this.f35412a.U(iO0);
            while (i11 < list.size()) {
                this.f35412a.x0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f35412a.y0(i10, g42.e(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iO02 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iO02 += zzjr.o0(g42.e(i13));
        }
        this.f35412a.U(iO02);
        while (i11 < g42.size()) {
            this.f35412a.x0(g42.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void p(int i10, int i11) {
        this.f35412a.K(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void q(int i10, long j10) {
        this.f35412a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void r(int i10) {
        this.f35412a.V(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void s(int i10, Object obj, InterfaceC4495x5 interfaceC4495x5) {
        zzjr zzjrVar = this.f35412a;
        zzjrVar.V(i10, 3);
        interfaceC4495x5.d((InterfaceC4366h5) obj, zzjrVar.f35550a);
        zzjrVar.V(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void t(int i10, double d10) {
        this.f35412a.I(i10, d10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void u(int i10, float f10) {
        this.f35412a.J(i10, f10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof S4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iS += zzjr.S(((Long) list.get(i12)).longValue());
            }
            this.f35412a.U(iS);
            while (i11 < list.size()) {
                this.f35412a.s(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        S4 s42 = (S4) list;
        if (!z10) {
            while (i11 < s42.size()) {
                this.f35412a.m(i10, s42.r(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < s42.size(); i13++) {
            iS2 += zzjr.S(s42.r(i13));
        }
        this.f35412a.U(iS2);
        while (i11 < s42.size()) {
            this.f35412a.s(s42.r(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void w(int i10, int i11) {
        this.f35412a.b0(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iC0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iC0 += zzjr.c0(((Integer) list.get(i12)).intValue());
            }
            this.f35412a.U(iC0);
            while (i11 < list.size()) {
                this.f35412a.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f35412a.l(i10, g42.e(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iC02 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iC02 += zzjr.c0(g42.e(i13));
        }
        this.f35412a.U(iC02);
        while (i11 < g42.size()) {
            this.f35412a.k(g42.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void y(int i10, List list, InterfaceC4495x5 interfaceC4495x5) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            d(i10, list.get(i11), interfaceC4495x5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.b0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iV0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iV0 += zzjr.v0(((Integer) list.get(i12)).intValue());
            }
            this.f35412a.U(iV0);
            while (i11 < list.size()) {
                this.f35412a.U(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f35412a.b0(i10, g42.e(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iV02 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iV02 += zzjr.v0(g42.e(i13));
        }
        this.f35412a.U(iV02);
        while (i11 < g42.size()) {
            this.f35412a.U(g42.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.K(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iX = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iX += zzjr.X(((Integer) list.get(i12)).intValue());
            }
            this.f35412a.U(iX);
            while (i11 < list.size()) {
                this.f35412a.H(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f35412a.K(i10, g42.e(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iX2 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iX2 += zzjr.X(g42.e(i13));
        }
        this.f35412a.U(iX2);
        while (i11 < g42.size()) {
            this.f35412a.H(g42.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.K(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iG0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG0 += zzjr.g0(((Integer) list.get(i12)).intValue());
            }
            this.f35412a.U(iG0);
            while (i11 < list.size()) {
                this.f35412a.H(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G4 g42 = (G4) list;
        if (!z10) {
            while (i11 < g42.size()) {
                this.f35412a.K(i10, g42.e(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iG02 = 0;
        for (int i13 = 0; i13 < g42.size(); i13++) {
            iG02 += zzjr.g0(g42.e(i13));
        }
        this.f35412a.U(iG02);
        while (i11 < g42.size()) {
            this.f35412a.H(g42.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof S4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iF0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF0 += zzjr.f0(((Long) list.get(i12)).longValue());
            }
            this.f35412a.U(iF0);
            while (i11 < list.size()) {
                this.f35412a.s(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        S4 s42 = (S4) list;
        if (!z10) {
            while (i11 < s42.size()) {
                this.f35412a.m(i10, s42.r(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iF02 = 0;
        for (int i13 = 0; i13 < s42.size(); i13++) {
            iF02 += zzjr.f0(s42.r(i13));
        }
        this.f35412a.U(iF02);
        while (i11 < s42.size()) {
            this.f35412a.s(s42.r(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof S4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.q0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iJ0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iJ0 += zzjr.j0(((Long) list.get(i12)).longValue());
            }
            this.f35412a.U(iJ0);
            while (i11 < list.size()) {
                this.f35412a.r0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        S4 s42 = (S4) list;
        if (!z10) {
            while (i11 < s42.size()) {
                this.f35412a.q0(i10, s42.r(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iJ02 = 0;
        for (int i13 = 0; i13 < s42.size(); i13++) {
            iJ02 += zzjr.j0(s42.r(i13));
        }
        this.f35412a.U(iJ02);
        while (i11 < s42.size()) {
            this.f35412a.r0(s42.r(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof S4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35412a.L(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f35412a.V(i10, 2);
            int iN0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iN0 += zzjr.n0(((Long) list.get(i12)).longValue());
            }
            this.f35412a.U(iN0);
            while (i11 < list.size()) {
                this.f35412a.N(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        S4 s42 = (S4) list;
        if (!z10) {
            while (i11 < s42.size()) {
                this.f35412a.L(i10, s42.r(i11));
                i11++;
            }
            return;
        }
        this.f35412a.V(i10, 2);
        int iN02 = 0;
        for (int i13 = 0; i13 < s42.size(); i13++) {
            iN02 += zzjr.n0(s42.r(i13));
        }
        this.f35412a.U(iN02);
        while (i11 < s42.size()) {
            this.f35412a.N(s42.r(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4331d6
    public final void zza(int i10) {
        this.f35412a.V(i10, 4);
    }
}
