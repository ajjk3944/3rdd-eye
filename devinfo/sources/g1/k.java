package g1;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements Iterable, ok.a {

    /* renamed from: e, reason: collision with root package name */
    public static final k f24250e = new k(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f24251a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24252b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24253c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f24254d;

    public k(long j, long j8, long j9, long[] jArr) {
        this.f24251a = j;
        this.f24252b = j8;
        this.f24253c = j9;
        this.f24254d = jArr;
    }

    public final k a(k kVar) {
        k kVarC;
        long j;
        long[] jArr;
        k kVar2 = f24250e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar2;
        }
        long j8 = kVar.f24253c;
        long j9 = kVar.f24253c;
        long[] jArr2 = kVar.f24254d;
        long j10 = kVar.f24252b;
        long j11 = kVar.f24251a;
        long j12 = this.f24253c;
        if (j8 == j12 && jArr2 == (jArr = this.f24254d)) {
            return new k(this.f24251a & (~j11), this.f24252b & (~j10), j12, jArr);
        }
        if (jArr2 != null) {
            kVarC = this;
            for (long j13 : jArr2) {
                kVarC = kVarC.c(j13);
            }
        } else {
            kVarC = this;
        }
        long j14 = 0;
        if (j10 != 0) {
            int i4 = 0;
            while (i4 < 64) {
                if (((1 << i4) & j10) != j14) {
                    j = j14;
                    kVarC = kVarC.c(i4 + j9);
                } else {
                    j = j14;
                }
                i4++;
                j14 = j;
            }
        }
        long j15 = j14;
        if (j11 != j15) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j11) != j15) {
                    kVarC = kVarC.c(i10 + j9 + 64);
                }
            }
        }
        return kVarC;
    }

    public final k c(long j) {
        long[] jArr;
        int iD;
        long[] jArr2;
        long j8 = j - this.f24253c;
        long j9 = 0;
        if (nk.k.g(j8, j9) >= 0 && nk.k.g(j8, 64) < 0) {
            long j10 = 1 << ((int) j8);
            long j11 = this.f24252b;
            if ((j11 & j10) != 0) {
                return new k(this.f24251a, j11 & (~j10), this.f24253c, this.f24254d);
            }
        } else if (nk.k.g(j8, 64) >= 0 && nk.k.g(j8, 128) < 0) {
            long j12 = 1 << (((int) j8) - 64);
            long j13 = this.f24251a;
            if ((j13 & j12) != 0) {
                return new k(j13 & (~j12), this.f24252b, this.f24253c, this.f24254d);
            }
        } else if (nk.k.g(j8, j9) < 0 && (jArr = this.f24254d) != null && (iD = r.d(jArr, j)) >= 0) {
            int length = jArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i4];
                if (iD > 0) {
                    zj.m.P(jArr, jArr3, 0, 0, iD);
                }
                if (iD < i4) {
                    zj.m.P(jArr, jArr3, iD, iD + 1, length);
                }
                jArr2 = jArr3;
            }
            return new k(this.f24251a, this.f24252b, this.f24253c, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j8 = j - this.f24253c;
        long j9 = 0;
        return (nk.k.g(j8, j9) < 0 || nk.k.g(j8, (long) 64) >= 0) ? (nk.k.g(j8, (long) 64) < 0 || nk.k.g(j8, (long) 128) >= 0) ? nk.k.g(j8, j9) <= 0 && (jArr = this.f24254d) != null && r.d(jArr, j) >= 0 : ((1 << (((int) j8) - 64)) & this.f24251a) != 0 : ((1 << ((int) j8)) & this.f24252b) != 0;
    }

    public final k f(k kVar) {
        k kVarG;
        k kVarG2;
        long[] jArr;
        k kVar2 = f24250e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar;
        }
        long j = kVar.f24253c;
        long j8 = kVar.f24253c;
        long[] jArr2 = kVar.f24254d;
        long j9 = kVar.f24252b;
        long j10 = kVar.f24251a;
        long j11 = this.f24253c;
        long j12 = this.f24252b;
        long j13 = this.f24251a;
        if (j == j11 && jArr2 == (jArr = this.f24254d)) {
            return new k(j13 | j10, j12 | j9, j11, jArr);
        }
        int i4 = 0;
        long[] jArr3 = this.f24254d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                kVarG = this;
                for (long j14 : jArr2) {
                    kVarG = kVarG.g(j14);
                }
            } else {
                kVarG = this;
            }
            if (j9 != 0) {
                for (int i10 = 0; i10 < 64; i10++) {
                    if (((1 << i10) & j9) != 0) {
                        kVarG = kVarG.g(i10 + j8);
                    }
                }
            }
            if (j10 != 0) {
                while (i4 < 64) {
                    if (((1 << i4) & j10) != 0) {
                        kVarG = kVarG.g(i4 + j8 + 64);
                    }
                    i4++;
                }
            }
            return kVarG;
        }
        if (jArr3 != null) {
            kVarG2 = kVar;
            for (long j15 : jArr3) {
                kVarG2 = kVarG2.g(j15);
            }
        } else {
            kVarG2 = kVar;
        }
        long j16 = this.f24253c;
        if (j12 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j12) != 0) {
                    kVarG2 = kVarG2.g(i11 + j16);
                }
            }
        }
        if (j13 != 0) {
            while (i4 < 64) {
                if (((1 << i4) & j13) != 0) {
                    kVarG2 = kVarG2.g(i4 + j16 + 64);
                }
                i4++;
            }
        }
        return kVarG2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g1.k g(long r30) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.k.g(long):g1.k");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return jm.a.r(new j(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(zj.o.T(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i4 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            i4++;
            if (i4 > 1) {
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
