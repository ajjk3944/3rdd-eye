package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1156fQ implements NQ {

    /* renamed from: a, reason: collision with root package name */
    public final C1197gC f14082a;

    /* renamed from: b, reason: collision with root package name */
    public long f14083b;

    public C1156fQ(List list, List list2) {
        JB jb = LB.f9635b;
        C1476lN.v(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        AbstractC0582Jp.m(list.size() == list2.size());
        int i3 = 0;
        while (i < list.size()) {
            C1101eQ c1101eQ = new C1101eQ((NQ) list.get(i), (List) list2.get(i));
            int length = objArrCopyOf.length;
            int i6 = i3 + 1;
            int iD = GB.d(length, i6);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i3] = c1101eQ;
            i++;
            i3 = i6;
        }
        this.f14082a = LB.o(i3, objArrCopyOf);
        this.f14083b = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean f(C1045dO c1045dO) {
        boolean zF;
        boolean z6 = false;
        do {
            long jI = i();
            if (jI == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zF = false;
            while (true) {
                C1197gC c1197gC = this.f14082a;
                if (i >= c1197gC.f14229d) {
                    break;
                }
                long jI2 = ((C1101eQ) c1197gC.get(i)).f13900a.i();
                boolean z7 = jI2 != Long.MIN_VALUE && jI2 <= c1045dO.f13758a;
                if (jI2 == jI || z7) {
                    zF |= ((C1101eQ) c1197gC.get(i)).f13900a.f(c1045dO);
                }
                i++;
            }
            z6 |= zF;
        } while (zF);
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long i() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            C1197gC c1197gC = this.f14082a;
            if (i >= c1197gC.f14229d) {
                break;
            }
            long jI = ((C1101eQ) c1197gC.get(i)).f13900a.i();
            if (jI != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jI);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long j() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            C1197gC c1197gC = this.f14082a;
            if (i >= c1197gC.f14229d) {
                break;
            }
            C1101eQ c1101eQ = (C1101eQ) c1197gC.get(i);
            long j6 = c1101eQ.f13900a.j();
            LB lb = c1101eQ.f13901b;
            if ((lb.contains(1) || lb.contains(2) || lb.contains(4)) && j6 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, j6);
            }
            if (j6 != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, j6);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f14083b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j7 = this.f14083b;
        return j7 != -9223372036854775807L ? j7 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final void l(long j6) {
        int i = 0;
        while (true) {
            C1197gC c1197gC = this.f14082a;
            if (i >= c1197gC.f14229d) {
                return;
            }
            ((C1101eQ) c1197gC.get(i)).l(j6);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean o() {
        int i = 0;
        while (true) {
            C1197gC c1197gC = this.f14082a;
            if (i >= c1197gC.f14229d) {
                return false;
            }
            if (((C1101eQ) c1197gC.get(i)).f13900a.o()) {
                return true;
            }
            i++;
        }
    }
}
