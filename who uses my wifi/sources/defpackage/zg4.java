package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zg4 implements mi4 {
    public final sn3 f;
    public long g;

    public zg4(List list, List list2) {
        vm3 vm3Var = xm3.g;
        ob1.z("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        zt0.D(list.size() == list2.size());
        int i2 = 0;
        while (i < list.size()) {
            yg4 yg4Var = new yg4((mi4) list.get(i), (List) list2.get(i));
            int length = objArrCopyOf.length;
            int i3 = i2 + 1;
            int iD = rm3.d(length, i3);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i2] = yg4Var;
            i++;
            i2 = i3;
        }
        this.f = xm3.o(objArrCopyOf, i2);
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.mi4
    public final boolean b(nb4 nb4Var) {
        boolean zB;
        boolean z = false;
        do {
            long jI = i();
            if (jI == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zB = false;
            while (true) {
                sn3 sn3Var = this.f;
                if (i >= sn3Var.i) {
                    break;
                }
                long jI2 = ((yg4) sn3Var.get(i)).f.i();
                boolean z2 = jI2 != Long.MIN_VALUE && jI2 <= nb4Var.a;
                if (jI2 == jI || z2) {
                    zB |= ((yg4) sn3Var.get(i)).f.b(nb4Var);
                }
                i++;
            }
            z |= zB;
        } while (zB);
        return z;
    }

    @Override // defpackage.mi4
    public final long i() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            sn3 sn3Var = this.f;
            if (i >= sn3Var.i) {
                break;
            }
            long jI = ((yg4) sn3Var.get(i)).f.i();
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

    @Override // defpackage.mi4
    public final long j() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            sn3 sn3Var = this.f;
            if (i >= sn3Var.i) {
                break;
            }
            yg4 yg4Var = (yg4) sn3Var.get(i);
            long j = yg4Var.f.j();
            xm3 xm3Var = yg4Var.g;
            if ((xm3Var.contains(1) || xm3Var.contains(2) || xm3Var.contains(4)) && j != Long.MIN_VALUE) {
                jMin = Math.min(jMin, j);
            }
            if (j != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, j);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.g = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j2 = this.g;
        return j2 != -9223372036854775807L ? j2 : jMin2;
    }

    @Override // defpackage.mi4
    public final void k(long j) {
        int i = 0;
        while (true) {
            sn3 sn3Var = this.f;
            if (i >= sn3Var.i) {
                return;
            }
            ((yg4) sn3Var.get(i)).k(j);
            i++;
        }
    }

    @Override // defpackage.mi4
    public final boolean o() {
        int i = 0;
        while (true) {
            sn3 sn3Var = this.f;
            if (i >= sn3Var.i) {
                return false;
            }
            if (((yg4) sn3Var.get(i)).f.o()) {
                return true;
            }
            i++;
        }
    }
}
