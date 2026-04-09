package u;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f23083a;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object[] f23084d;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f23085g;

    public j0(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f23083a = new int[i14];
        this.f23084d = new Object[i14];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f23085g;
        if (i11 != 0 && i10 <= this.f23083a[i11 - 1]) {
            d(i10, obj);
            return;
        }
        if (i11 >= this.f23083a.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f23083a, i15);
            br.l.d(iArrCopyOf, "copyOf(...)");
            this.f23083a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23084d, i15);
            br.l.d(objArrCopyOf, "copyOf(...)");
            this.f23084d = objArrCopyOf;
        }
        this.f23083a[i11] = i10;
        this.f23084d[i11] = obj;
        this.f23085g = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        br.l.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j0 j0Var = (j0) objClone;
        j0Var.f23083a = (int[]) this.f23083a.clone();
        j0Var.f23084d = (Object[]) this.f23084d.clone();
        return j0Var;
    }

    public final Object c(int i10) {
        Object obj;
        int iA = v.a.a(this.f23085g, i10, this.f23083a);
        if (iA < 0 || (obj = this.f23084d[iA]) == p.f23096b) {
            return null;
        }
        return obj;
    }

    public final void d(int i10, Object obj) {
        int iA = v.a.a(this.f23085g, i10, this.f23083a);
        if (iA >= 0) {
            this.f23084d[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f23085g;
        if (i11 < i12) {
            Object[] objArr = this.f23084d;
            if (objArr[i11] == p.f23096b) {
                this.f23083a[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f23083a.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f23083a, i16);
            br.l.d(iArrCopyOf, "copyOf(...)");
            this.f23083a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23084d, i16);
            br.l.d(objArrCopyOf, "copyOf(...)");
            this.f23084d = objArrCopyOf;
        }
        int i17 = this.f23085g;
        if (i17 - i11 != 0) {
            int[] iArr = this.f23083a;
            int i18 = i11 + 1;
            mq.l.b0(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.f23084d;
            mq.l.c0(i18, i11, this.f23085g, objArr2, objArr2);
        }
        this.f23083a[i11] = i10;
        this.f23084d[i11] = obj;
        this.f23085g++;
    }

    public final Object e(int i10) {
        Object[] objArr = this.f23084d;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i10 = this.f23085g;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        int i11 = this.f23085g;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f23083a[i12]);
            sb2.append('=');
            Object objE = e(i12);
            if (objE != this) {
                sb2.append(objE);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }
}
