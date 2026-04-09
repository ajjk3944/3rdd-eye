package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o0 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f36925a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f36926b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f36927c;

    public o0(int i4) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f36925a = new int[i13];
        this.f36926b = new Object[i13];
    }

    public final void a(int i4, Object obj) {
        int i10 = this.f36927c;
        if (i10 != 0 && i4 <= this.f36925a[i10 - 1]) {
            e(i4, obj);
            return;
        }
        if (i10 >= this.f36925a.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f36925a, i14);
            nk.k.d(iArrCopyOf, "copyOf(...)");
            this.f36925a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f36926b, i14);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            this.f36926b = objArrCopyOf;
        }
        this.f36925a[i10] = i4;
        this.f36926b[i10] = obj;
        this.f36927c = i10 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        nk.k.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        o0 o0Var = (o0) objClone;
        o0Var.f36925a = (int[]) this.f36925a.clone();
        o0Var.f36926b = (Object[]) this.f36926b.clone();
        return o0Var;
    }

    public final Object d(int i4) {
        Object obj;
        int iA = y.a.a(this.f36925a, this.f36927c, i4);
        if (iA < 0 || (obj = this.f36926b[iA]) == p.f36930c) {
            return null;
        }
        return obj;
    }

    public final void e(int i4, Object obj) {
        int iA = y.a.a(this.f36925a, this.f36927c, i4);
        if (iA >= 0) {
            this.f36926b[iA] = obj;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f36927c;
        if (i10 < i11) {
            Object[] objArr = this.f36926b;
            if (objArr[i10] == p.f36930c) {
                this.f36925a[i10] = i4;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f36925a.length) {
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
            int[] iArrCopyOf = Arrays.copyOf(this.f36925a, i15);
            nk.k.d(iArrCopyOf, "copyOf(...)");
            this.f36925a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f36926b, i15);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            this.f36926b = objArrCopyOf;
        }
        int i16 = this.f36927c;
        if (i16 - i10 != 0) {
            int[] iArr = this.f36925a;
            int i17 = i10 + 1;
            zj.m.M(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f36926b;
            zj.m.N(i17, i10, this.f36927c, objArr2, objArr2);
        }
        this.f36925a[i10] = i4;
        this.f36926b[i10] = obj;
        this.f36927c++;
    }

    public final Object f(int i4) {
        Object[] objArr = this.f36926b;
        if (i4 < objArr.length) {
            return objArr[i4];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i4 = this.f36927c;
        if (i4 <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(i4 * 28);
        sb2.append('{');
        int i10 = this.f36927c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f36925a[i11]);
            sb2.append('=');
            Object objF = f(i11);
            if (objF != this) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }
}
