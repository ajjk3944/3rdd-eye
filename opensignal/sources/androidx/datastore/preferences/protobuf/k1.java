package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: f, reason: collision with root package name */
    public static final k1 f1305f = new k1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f1306a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1307b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1308c;

    /* renamed from: d, reason: collision with root package name */
    public int f1309d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1310e;

    public k1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f1306a = i10;
        this.f1307b = iArr;
        this.f1308c = objArr;
        this.f1310e = z10;
    }

    public final void a(int i10) {
        int[] iArr = this.f1307b;
        if (i10 > iArr.length) {
            int i11 = this.f1306a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f1307b = Arrays.copyOf(iArr, i10);
            this.f1308c = Arrays.copyOf(this.f1308c, i10);
        }
    }

    public final int b() {
        int iV;
        int iX;
        int iV2;
        int i10 = this.f1309d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f1306a; i12++) {
            int i13 = this.f1307b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f1308c[i12]).getClass();
                    iV2 = n.V(i14) + 8;
                } else if (i15 == 2) {
                    iV2 = n.T(i14, (g) this.f1308c[i12]);
                } else if (i15 == 3) {
                    iV = n.V(i14) * 2;
                    iX = ((k1) this.f1308c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(e0.b());
                    }
                    ((Integer) this.f1308c[i12]).getClass();
                    iV2 = n.V(i14) + 4;
                }
                i11 = iV2 + i11;
            } else {
                long jLongValue = ((Long) this.f1308c[i12]).longValue();
                iV = n.V(i14);
                iX = n.X(jLongValue);
            }
            i11 = iX + iV + i11;
        }
        this.f1309d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.f1310e) {
            throw new UnsupportedOperationException();
        }
        a(this.f1306a + 1);
        int[] iArr = this.f1307b;
        int i11 = this.f1306a;
        iArr[i11] = i10;
        this.f1308c[i11] = obj;
        this.f1306a = i11 + 1;
    }

    public final void d(l0 l0Var) throws IOException {
        if (this.f1306a == 0) {
            return;
        }
        l0Var.getClass();
        n nVar = (n) l0Var.f1316a;
        x1 x1Var = x1.ASCENDING;
        for (int i10 = 0; i10 < this.f1306a; i10++) {
            int i11 = this.f1307b[i10];
            Object obj = this.f1308c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                nVar.r0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                nVar.h0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                l0Var.a(i12, (g) obj);
            } else if (i13 == 3) {
                x1 x1Var2 = x1.ASCENDING;
                nVar.o0(i12, 3);
                ((k1) obj).d(l0Var);
                nVar.o0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(e0.b());
                }
                nVar.f0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        int i10 = this.f1306a;
        if (i10 == k1Var.f1306a) {
            int[] iArr = this.f1307b;
            int[] iArr2 = k1Var.f1307b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f1308c;
                    Object[] objArr2 = k1Var.f1308c;
                    int i12 = this.f1306a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f1306a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f1307b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f1308c;
        int i15 = this.f1306a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
