package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yx1 implements jz1 {

    /* renamed from: a, reason: collision with root package name */
    public final u51 f18925a;

    /* renamed from: b, reason: collision with root package name */
    public long f18926b;

    public yx1(List list, List list2) {
        v41 v41Var = x41.f18307b;
        yr1.u(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i4 = 0;
        mq0.m(list.size() == list2.size());
        int i10 = 0;
        while (i4 < list.size()) {
            xx1 xx1Var = new xx1((jz1) list.get(i4), (List) list2.get(i4));
            int length = objArrCopyOf.length;
            int i11 = i10 + 1;
            int iD = s41.d(length, i11);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i10] = xx1Var;
            i4++;
            i10 = i11;
        }
        this.f18925a = x41.s(objArrCopyOf, i10);
        this.f18926b = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long B1() {
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            u51 u51Var = this.f18925a;
            if (i4 >= u51Var.f17098d) {
                break;
            }
            long jB1 = ((xx1) u51Var.get(i4)).f18561a.B1();
            if (jB1 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB1);
            }
            i4++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long C1() {
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            u51 u51Var = this.f18925a;
            if (i4 >= u51Var.f17098d) {
                break;
            }
            xx1 xx1Var = (xx1) u51Var.get(i4);
            long jC1 = xx1Var.f18561a.C1();
            x41 x41Var = xx1Var.f18562b;
            if ((x41Var.contains(1) || x41Var.contains(2) || x41Var.contains(4)) && jC1 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC1);
            }
            if (jC1 != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jC1);
            }
            i4++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f18926b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f18926b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean G1() {
        int i4 = 0;
        while (true) {
            u51 u51Var = this.f18925a;
            if (i4 >= u51Var.f17098d) {
                return false;
            }
            if (((xx1) u51Var.get(i4)).f18561a.G1()) {
                return true;
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean g(rt1 rt1Var) {
        boolean zG;
        boolean z3 = false;
        do {
            long jB1 = B1();
            if (jB1 == Long.MIN_VALUE) {
                break;
            }
            int i4 = 0;
            zG = false;
            while (true) {
                u51 u51Var = this.f18925a;
                if (i4 >= u51Var.f17098d) {
                    break;
                }
                long jB12 = ((xx1) u51Var.get(i4)).f18561a.B1();
                boolean z10 = jB12 != Long.MIN_VALUE && jB12 <= rt1Var.f15762a;
                if (jB12 == jB1 || z10) {
                    zG |= ((xx1) u51Var.get(i4)).f18561a.g(rt1Var);
                }
                i4++;
            }
            z3 |= zG;
        } while (zG);
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final void l(long j) {
        int i4 = 0;
        while (true) {
            u51 u51Var = this.f18925a;
            if (i4 >= u51Var.f17098d) {
                return;
            }
            ((xx1) u51Var.get(i4)).l(j);
            i4++;
        }
    }
}
