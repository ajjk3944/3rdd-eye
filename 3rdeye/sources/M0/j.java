package m0;

import c9.C2088i;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import n0.C5346a;

/* compiled from: SparseArrayCompat.jvm.kt */
/* loaded from: classes.dex */
public final class j<E> implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f44031b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f44032c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f44033d;

    public j() {
        int i;
        int i10 = 4;
        while (true) {
            i = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i = i11;
                break;
            }
            i10++;
        }
        int i12 = i / 4;
        this.f44031b = new int[i12];
        this.f44032c = new Object[i12];
    }

    public final void a(int i, E e4) {
        int i10 = this.f44033d;
        if (i10 != 0 && i <= this.f44031b[i10 - 1]) {
            e(i, e4);
            return;
        }
        if (i10 >= this.f44031b.length) {
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
            int[] iArrCopyOf = Arrays.copyOf(this.f44031b, i14);
            l.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f44031b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f44032c, i14);
            l.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f44032c = objArrCopyOf;
        }
        this.f44031b[i10] = i;
        this.f44032c[i10] = e4;
        this.f44033d = i10 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        l.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j<E> jVar = (j) objClone;
        jVar.f44031b = (int[]) this.f44031b.clone();
        jVar.f44032c = (Object[]) this.f44032c.clone();
        return jVar;
    }

    public final E d(int i) {
        E e4;
        int iA = C5346a.a(this.f44033d, i, this.f44031b);
        if (iA < 0 || (e4 = (E) this.f44032c[iA]) == k.f44034a) {
            return null;
        }
        return e4;
    }

    public final void e(int i, E e4) {
        int iA = C5346a.a(this.f44033d, i, this.f44031b);
        if (iA >= 0) {
            this.f44032c[iA] = e4;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f44033d;
        if (i10 < i11) {
            Object[] objArr = this.f44032c;
            if (objArr[i10] == k.f44034a) {
                this.f44031b[i10] = i;
                objArr[i10] = e4;
                return;
            }
        }
        if (i11 >= this.f44031b.length) {
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
            int[] iArrCopyOf = Arrays.copyOf(this.f44031b, i15);
            l.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f44031b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f44032c, i15);
            l.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f44032c = objArrCopyOf;
        }
        int i16 = this.f44033d;
        if (i16 - i10 != 0) {
            int[] iArr = this.f44031b;
            int i17 = i10 + 1;
            C2088i.c(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f44032c;
            C2088i.e(objArr2, i17, objArr2, i10, this.f44033d);
        }
        this.f44031b[i10] = i;
        this.f44032c[i10] = e4;
        this.f44033d++;
    }

    public final String toString() {
        int i = this.f44033d;
        if (i <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i10 = this.f44033d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(this.f44031b[i11]);
            sb.append('=');
            Object obj = this.f44032c[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        l.e(string, "buffer.toString()");
        return string;
    }
}
