package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import f.AbstractC5487d;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class J1 implements InterfaceC4627k3 {

    /* renamed from: a, reason: collision with root package name */
    private final I1 f35606a;

    private J1(I1 i12) {
        byte[] bArr = AbstractC4593h2.f35692b;
        this.f35606a = i12;
        i12.f35601a = this;
    }

    public static J1 u(I1 i12) {
        J1 j12 = i12.f35601a;
        return j12 != null ? j12 : new J1(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void a(int i10, C4702r2 c4702r2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f35606a.C(i10, 2);
            this.f35606a.E(C4713s2.b(c4702r2, entry.getKey(), entry.getValue()));
            C4713s2.e(this.f35606a, c4702r2, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4527b2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.q(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f35606a.E(i12);
            while (i11 < list.size()) {
                this.f35606a.r(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C4527b2 c4527b2 = (C4527b2) list;
        if (!z10) {
            while (i11 < c4527b2.size()) {
                this.f35606a.q(i10, c4527b2.e(i11));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c4527b2.size(); i15++) {
            c4527b2.e(i15);
            i14 += 4;
        }
        this.f35606a.E(i14);
        while (i11 < c4527b2.size()) {
            this.f35606a.r(c4527b2.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4659n2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    I1 i12 = this.f35606a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    i12.F(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int iG = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long jLongValue2 = ((Long) list.get(i13)).longValue();
                iG += I1.g((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f35606a.E(iG);
            while (i11 < list.size()) {
                I1 i14 = this.f35606a;
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                i14.G((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C4659n2 c4659n2 = (C4659n2) list;
        if (!z10) {
            while (i11 < c4659n2.size()) {
                I1 i15 = this.f35606a;
                long jE = c4659n2.e(i11);
                i15.F(i10, (jE >> 63) ^ (jE + jE));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int iG2 = 0;
        for (int i16 = 0; i16 < c4659n2.size(); i16++) {
            long jE2 = c4659n2.e(i16);
            iG2 += I1.g((jE2 >> 63) ^ (jE2 + jE2));
        }
        this.f35606a.E(iG2);
        while (i11 < c4659n2.size()) {
            I1 i17 = this.f35606a;
            long jE3 = c4659n2.e(i11);
            i17.G((jE3 >> 63) ^ (jE3 + jE3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void d(int i10, long j10) {
        this.f35606a.s(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void e(int i10, B1 b12) {
        this.f35606a.o(i10, b12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void f(int i10, int i11) {
        this.f35606a.q(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void g(int i10, Object obj, J2 j22) {
        I1 i12 = this.f35606a;
        i12.C(i10, 3);
        j22.a((InterfaceC4790z2) obj, i12.f35601a);
        i12.C(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void h(int i10, String str) {
        this.f35606a.A(i10, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void i(int i10, long j10) {
        this.f35606a.F(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void j(int i10, Object obj) {
        if (obj instanceof B1) {
            this.f35606a.z(i10, (B1) obj);
        } else {
            this.f35606a.y(i10, (InterfaceC4790z2) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void k(int i10) {
        this.f35606a.C(i10, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4659n2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.s(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.f35606a.E(i12);
            while (i11 < list.size()) {
                this.f35606a.t(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C4659n2 c4659n2 = (C4659n2) list;
        if (!z10) {
            while (i11 < c4659n2.size()) {
                this.f35606a.s(i10, c4659n2.e(i11));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c4659n2.size(); i15++) {
            c4659n2.e(i15);
            i14 += 8;
        }
        this.f35606a.E(i14);
        while (i11 < c4659n2.size()) {
            this.f35606a.t(c4659n2.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void m(int i10, long j10) {
        this.f35606a.F(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4527b2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.D(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int iF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF += I1.f(((Integer) list.get(i12)).intValue());
            }
            this.f35606a.E(iF);
            while (i11 < list.size()) {
                this.f35606a.E(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C4527b2 c4527b2 = (C4527b2) list;
        if (!z10) {
            while (i11 < c4527b2.size()) {
                this.f35606a.D(i10, c4527b2.e(i11));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int iF2 = 0;
        for (int i13 = 0; i13 < c4527b2.size(); i13++) {
            iF2 += I1.f(c4527b2.e(i13));
        }
        this.f35606a.E(iF2);
        while (i11 < c4527b2.size()) {
            this.f35606a.E(c4527b2.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void o(int i10, Object obj, J2 j22) {
        this.f35606a.w(i10, (InterfaceC4790z2) obj, j22);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void p(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC4626k2)) {
            while (i11 < list.size()) {
                this.f35606a.A(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC4626k2 interfaceC4626k2 = (InterfaceC4626k2) list;
        while (i11 < list.size()) {
            Object objZzc = interfaceC4626k2.zzc();
            if (objZzc instanceof String) {
                this.f35606a.A(i10, (String) objZzc);
            } else {
                this.f35606a.o(i10, (B1) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void q(int i10, int i11) {
        this.f35606a.D(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4527b2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    I1 i12 = this.f35606a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    i12.D(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int iF = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int iIntValue2 = ((Integer) list.get(i13)).intValue();
                iF += I1.f((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f35606a.E(iF);
            while (i11 < list.size()) {
                I1 i14 = this.f35606a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                i14.E((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C4527b2 c4527b2 = (C4527b2) list;
        if (!z10) {
            while (i11 < c4527b2.size()) {
                I1 i15 = this.f35606a;
                int iE = c4527b2.e(i11);
                i15.D(i10, (iE >> 31) ^ (iE + iE));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int iF2 = 0;
        for (int i16 = 0; i16 < c4527b2.size(); i16++) {
            int iE2 = c4527b2.e(i16);
            iF2 += I1.f((iE2 >> 31) ^ (iE2 + iE2));
        }
        this.f35606a.E(iF2);
        while (i11 < c4527b2.size()) {
            I1 i17 = this.f35606a;
            int iE3 = c4527b2.e(i11);
            i17.E((iE3 >> 31) ^ (iE3 + iE3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4659n2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.F(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += I1.g(((Long) list.get(i12)).longValue());
            }
            this.f35606a.E(iG);
            while (i11 < list.size()) {
                this.f35606a.G(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C4659n2 c4659n2 = (C4659n2) list;
        if (!z10) {
            while (i11 < c4659n2.size()) {
                this.f35606a.F(i10, c4659n2.e(i11));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c4659n2.size(); i13++) {
            iG2 += I1.g(c4659n2.e(i13));
        }
        this.f35606a.E(iG2);
        while (i11 < c4659n2.size()) {
            this.f35606a.G(c4659n2.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void t(int i10, int i11) {
        this.f35606a.D(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzb(int i10, boolean z10) {
        this.f35606a.l(i10, z10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzc(int i10, List list, boolean z10) {
        if (list instanceof AbstractC4701r1) {
            AbstractC5487d.a(list);
            if (!z10) {
                throw null;
            }
            this.f35606a.C(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f35606a.l(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.f35606a.E(i12);
        while (i11 < list.size()) {
            this.f35606a.k(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f35606a.o(i10, (B1) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzf(int i10, double d10) {
        this.f35606a.s(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzg(int i10, List list, boolean z10) {
        if (list instanceof K1) {
            AbstractC5487d.a(list);
            if (!z10) {
                throw null;
            }
            this.f35606a.C(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f35606a.s(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.f35606a.E(i12);
        while (i11 < list.size()) {
            this.f35606a.t(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzh(int i10) {
        this.f35606a.C(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzi(int i10, int i11) {
        this.f35606a.u(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4527b2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.u(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += I1.g(((Integer) list.get(i12)).intValue());
            }
            this.f35606a.E(iG);
            while (i11 < list.size()) {
                this.f35606a.v(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C4527b2 c4527b2 = (C4527b2) list;
        if (!z10) {
            while (i11 < c4527b2.size()) {
                this.f35606a.u(i10, c4527b2.e(i11));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c4527b2.size(); i13++) {
            iG2 += I1.g(c4527b2.e(i13));
        }
        this.f35606a.E(iG2);
        while (i11 < c4527b2.size()) {
            this.f35606a.v(c4527b2.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzk(int i10, int i11) {
        this.f35606a.q(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4527b2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.q(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f35606a.E(i12);
            while (i11 < list.size()) {
                this.f35606a.r(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C4527b2 c4527b2 = (C4527b2) list;
        if (!z10) {
            while (i11 < c4527b2.size()) {
                this.f35606a.q(i10, c4527b2.e(i11));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c4527b2.size(); i15++) {
            c4527b2.e(i15);
            i14 += 4;
        }
        this.f35606a.E(i14);
        while (i11 < c4527b2.size()) {
            this.f35606a.r(c4527b2.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzm(int i10, long j10) {
        this.f35606a.s(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4659n2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.s(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.f35606a.E(i12);
            while (i11 < list.size()) {
                this.f35606a.t(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C4659n2 c4659n2 = (C4659n2) list;
        if (!z10) {
            while (i11 < c4659n2.size()) {
                this.f35606a.s(i10, c4659n2.e(i11));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c4659n2.size(); i15++) {
            c4659n2.e(i15);
            i14 += 8;
        }
        this.f35606a.E(i14);
        while (i11 < c4659n2.size()) {
            this.f35606a.t(c4659n2.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzo(int i10, float f10) {
        this.f35606a.q(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof U1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.q(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.f35606a.E(i12);
            while (i11 < list.size()) {
                this.f35606a.r(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        U1 u12 = (U1) list;
        if (!z10) {
            while (i11 < u12.size()) {
                this.f35606a.q(i10, Float.floatToRawIntBits(u12.e(i11)));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < u12.size(); i15++) {
            u12.e(i15);
            i14 += 4;
        }
        this.f35606a.E(i14);
        while (i11 < u12.size()) {
            this.f35606a.r(Float.floatToRawIntBits(u12.e(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzr(int i10, int i11) {
        this.f35606a.u(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4527b2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.u(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += I1.g(((Integer) list.get(i12)).intValue());
            }
            this.f35606a.E(iG);
            while (i11 < list.size()) {
                this.f35606a.v(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C4527b2 c4527b2 = (C4527b2) list;
        if (!z10) {
            while (i11 < c4527b2.size()) {
                this.f35606a.u(i10, c4527b2.e(i11));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c4527b2.size(); i13++) {
            iG2 += I1.g(c4527b2.e(i13));
        }
        this.f35606a.E(iG2);
        while (i11 < c4527b2.size()) {
            this.f35606a.v(c4527b2.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzt(int i10, long j10) {
        this.f35606a.F(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4627k3
    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C4659n2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f35606a.F(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f35606a.C(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += I1.g(((Long) list.get(i12)).longValue());
            }
            this.f35606a.E(iG);
            while (i11 < list.size()) {
                this.f35606a.G(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C4659n2 c4659n2 = (C4659n2) list;
        if (!z10) {
            while (i11 < c4659n2.size()) {
                this.f35606a.F(i10, c4659n2.e(i11));
                i11++;
            }
            return;
        }
        this.f35606a.C(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c4659n2.size(); i13++) {
            iG2 += I1.g(c4659n2.e(i13));
        }
        this.f35606a.E(iG2);
        while (i11 < c4659n2.size()) {
            this.f35606a.G(c4659n2.e(i11));
            i11++;
        }
    }
}
