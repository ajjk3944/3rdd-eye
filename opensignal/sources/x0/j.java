package x0;

import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Iterable, cr.a {

    /* renamed from: x, reason: collision with root package name */
    public static final j f24707x = new j(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f24708a;

    /* renamed from: d, reason: collision with root package name */
    public final long f24709d;

    /* renamed from: g, reason: collision with root package name */
    public final long f24710g;

    /* renamed from: r, reason: collision with root package name */
    public final long[] f24711r;

    public j(long j, long j7, long j10, long[] jArr) {
        this.f24708a = j;
        this.f24709d = j7;
        this.f24710g = j10;
        this.f24711r = jArr;
    }

    public final j a(j jVar) {
        j jVarB;
        long j;
        long[] jArr;
        j jVar2 = f24707x;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar2;
        }
        long j7 = jVar.f24710g;
        long j10 = jVar.f24710g;
        long[] jArr2 = jVar.f24711r;
        long j11 = jVar.f24709d;
        long j12 = jVar.f24708a;
        long j13 = this.f24710g;
        if (j7 == j13 && jArr2 == (jArr = this.f24711r)) {
            return new j(this.f24708a & (~j12), this.f24709d & (~j11), j13, jArr);
        }
        if (jArr2 != null) {
            jVarB = this;
            for (long j14 : jArr2) {
                jVarB = jVarB.b(j14);
            }
        } else {
            jVarB = this;
        }
        long j15 = 0;
        if (j11 != 0) {
            int i10 = 0;
            while (i10 < 64) {
                if (((1 << i10) & j11) != j15) {
                    j = j15;
                    jVarB = jVarB.b(i10 + j10);
                } else {
                    j = j15;
                }
                i10++;
                j15 = j;
            }
        }
        long j16 = j15;
        if (j12 != j16) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j12) != j16) {
                    jVarB = jVarB.b(i11 + j10 + 64);
                }
            }
        }
        return jVarB;
    }

    public final j b(long j) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j7 = j - this.f24710g;
        long j10 = 0;
        if (br.l.h(j7, j10) >= 0 && br.l.h(j7, 64) < 0) {
            long j11 = 1 << ((int) j7);
            long j12 = this.f24709d;
            if ((j12 & j11) != 0) {
                return new j(this.f24708a, j12 & (~j11), this.f24710g, this.f24711r);
            }
        } else if (br.l.h(j7, 64) >= 0 && br.l.h(j7, 128) < 0) {
            long j13 = 1 << (((int) j7) - 64);
            long j14 = this.f24708a;
            if ((j14 & j13) != 0) {
                return new j(j14 & (~j13), this.f24709d, this.f24710g, this.f24711r);
            }
        } else if (br.l.h(j7, j10) < 0 && (jArr = this.f24711r) != null && (iC = p.c(jArr, j)) >= 0) {
            int length = jArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i10];
                if (iC > 0) {
                    mq.l.d0(jArr, jArr3, 0, 0, iC);
                }
                if (iC < i10) {
                    mq.l.d0(jArr, jArr3, iC, iC + 1, length);
                }
                jArr2 = jArr3;
            }
            return new j(this.f24708a, this.f24709d, this.f24710g, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j7 = j - this.f24710g;
        long j10 = 0;
        return (br.l.h(j7, j10) < 0 || br.l.h(j7, (long) 64) >= 0) ? (br.l.h(j7, (long) 64) < 0 || br.l.h(j7, (long) 128) >= 0) ? br.l.h(j7, j10) <= 0 && (jArr = this.f24711r) != null && p.c(jArr, j) >= 0 : ((1 << (((int) j7) - 64)) & this.f24708a) != 0 : ((1 << ((int) j7)) & this.f24709d) != 0;
    }

    public final j d(j jVar) {
        j jVarE;
        j jVarE2;
        long[] jArr;
        j jVar2 = f24707x;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar;
        }
        long j = jVar.f24710g;
        long j7 = jVar.f24710g;
        long[] jArr2 = jVar.f24711r;
        long j10 = jVar.f24709d;
        long j11 = jVar.f24708a;
        long j12 = this.f24710g;
        long j13 = this.f24709d;
        long j14 = this.f24708a;
        if (j == j12 && jArr2 == (jArr = this.f24711r)) {
            return new j(j14 | j11, j13 | j10, j12, jArr);
        }
        int i10 = 0;
        long[] jArr3 = this.f24711r;
        if (jArr3 != null) {
            if (jArr2 != null) {
                jVarE = this;
                for (long j15 : jArr2) {
                    jVarE = jVarE.e(j15);
                }
            } else {
                jVarE = this;
            }
            if (j10 != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if (((1 << i11) & j10) != 0) {
                        jVarE = jVarE.e(i11 + j7);
                    }
                }
            }
            if (j11 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j11) != 0) {
                        jVarE = jVarE.e(i10 + j7 + 64);
                    }
                    i10++;
                }
            }
            return jVarE;
        }
        if (jArr3 != null) {
            jVarE2 = jVar;
            for (long j16 : jArr3) {
                jVarE2 = jVarE2.e(j16);
            }
        } else {
            jVarE2 = jVar;
        }
        long j17 = this.f24710g;
        if (j13 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j13) != 0) {
                    jVarE2 = jVarE2.e(i12 + j17);
                }
            }
        }
        if (j14 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j14) != 0) {
                    jVarE2 = jVarE2.e(i10 + j17 + 64);
                }
                i10++;
            }
        }
        return jVarE2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x0.j e(long r30) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.j.e(long):x0.j");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return i4.u(new i(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(mq.p.a0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
