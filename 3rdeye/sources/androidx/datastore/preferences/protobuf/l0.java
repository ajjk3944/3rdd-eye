package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t0;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final l0 f15661f = new l0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f15662a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f15663b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f15664c;

    /* renamed from: d, reason: collision with root package name */
    public int f15665d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15666e;

    public l0() {
        this(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iJ;
        int iM;
        int iE;
        int i = this.f15665d;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f15662a; i11++) {
            int i12 = this.f15663b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f15664c[i11]).getClass();
                    iE = AbstractC1733k.e(i13);
                } else if (i14 == 2) {
                    iE = AbstractC1733k.b(i13, (AbstractC1730h) this.f15664c[i11]);
                } else if (i14 == 3) {
                    iJ = AbstractC1733k.j(i13) * 2;
                    iM = ((l0) this.f15664c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(C1747z.b());
                    }
                    ((Integer) this.f15664c[i11]).getClass();
                    iE = AbstractC1733k.d(i13);
                }
                i10 = iE + i10;
            } else {
                long jLongValue = ((Long) this.f15664c[i11]).longValue();
                iJ = AbstractC1733k.j(i13);
                iM = AbstractC1733k.m(jLongValue);
            }
            i10 = iM + iJ + i10;
        }
        this.f15665d = i10;
        return i10;
    }

    public final void b(int i, Object obj) {
        if (!this.f15666e) {
            throw new UnsupportedOperationException();
        }
        int i10 = this.f15662a;
        int[] iArr = this.f15663b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f15663b = Arrays.copyOf(iArr, i11);
            this.f15664c = Arrays.copyOf(this.f15664c, i11);
        }
        int[] iArr2 = this.f15663b;
        int i12 = this.f15662a;
        iArr2[i12] = i;
        this.f15664c[i12] = obj;
        this.f15662a = i12 + 1;
    }

    public final void c(t0 t0Var) throws IOException {
        if (this.f15662a == 0) {
            return;
        }
        C1734l c1734l = (C1734l) t0Var;
        c1734l.getClass();
        t0.a aVar = t0.a.ASCENDING;
        for (int i = 0; i < this.f15662a; i++) {
            int i10 = this.f15663b[i];
            Object obj = this.f15664c[i];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                c1734l.j(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                c1734l.f(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                c1734l.b(i11, (AbstractC1730h) obj);
            } else if (i12 == 3) {
                c1734l.getClass();
                t0.a aVar2 = t0.a.ASCENDING;
                AbstractC1733k abstractC1733k = c1734l.f15660a;
                abstractC1733k.F(i11, 3);
                ((l0) obj).c(t0Var);
                abstractC1733k.F(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(C1747z.b());
                }
                c1734l.e(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        int i = this.f15662a;
        if (i == l0Var.f15662a) {
            int[] iArr = this.f15663b;
            int[] iArr2 = l0Var.f15663b;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.f15664c;
                    Object[] objArr2 = l0Var.f15664c;
                    int i11 = this.f15662a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f15662a;
        int i10 = (527 + i) * 31;
        int[] iArr = this.f15663b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f15664c;
        int i14 = this.f15662a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public l0(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.f15665d = -1;
        this.f15662a = i;
        this.f15663b = iArr;
        this.f15664c = objArr;
        this.f15666e = z10;
    }
}
