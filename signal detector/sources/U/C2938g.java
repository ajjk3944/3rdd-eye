package u;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import d5.AbstractC2281i;
import java.util.Arrays;
import v.AbstractC2959a;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2938g implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f23697a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f23698b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f23699c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f23700d;

    public C2938g() {
        int i;
        int i3 = 4;
        while (true) {
            i = 80;
            if (i3 >= 32) {
                break;
            }
            int i6 = (1 << i3) - 12;
            if (80 <= i6) {
                i = i6;
                break;
            }
            i3++;
        }
        int i7 = i / 8;
        this.f23698b = new long[i7];
        this.f23699c = new Object[i7];
    }

    public final void a(long j6, Long l2) {
        int i = this.f23700d;
        if (i != 0 && j6 <= this.f23698b[i - 1]) {
            h(j6, l2);
            return;
        }
        if (this.f23697a) {
            long[] jArr = this.f23698b;
            if (i >= jArr.length) {
                Object[] objArr = this.f23699c;
                int i3 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    Object obj = objArr[i6];
                    if (obj != AbstractC2939h.f23701a) {
                        if (i6 != i3) {
                            jArr[i3] = jArr[i6];
                            objArr[i3] = obj;
                            objArr[i6] = null;
                        }
                        i3++;
                    }
                }
                this.f23697a = false;
                this.f23700d = i3;
            }
        }
        int i7 = this.f23700d;
        if (i7 >= this.f23698b.length) {
            int i8 = (i7 + 1) * 8;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f23698b, i11);
            q5.i.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f23698b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23699c, i11);
            q5.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f23699c = objArrCopyOf;
        }
        this.f23698b[i7] = j6;
        this.f23699c[i7] = l2;
        this.f23700d = i7 + 1;
    }

    public final void b() {
        int i = this.f23700d;
        Object[] objArr = this.f23699c;
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = null;
        }
        this.f23700d = 0;
        this.f23697a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C2938g clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        q5.i.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C2938g c2938g = (C2938g) objClone;
        c2938g.f23698b = (long[]) this.f23698b.clone();
        c2938g.f23699c = (Object[]) this.f23699c.clone();
        return c2938g;
    }

    public final Object d(long j6) {
        Object obj;
        int iB = AbstractC2959a.b(this.f23698b, this.f23700d, j6);
        if (iB < 0 || (obj = this.f23699c[iB]) == AbstractC2939h.f23701a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j6) {
        Object obj;
        int iB = AbstractC2959a.b(this.f23698b, this.f23700d, j6);
        if (iB < 0 || (obj = this.f23699c[iB]) == AbstractC2939h.f23701a) {
            return -1L;
        }
        return obj;
    }

    public final int f(long j6) {
        if (this.f23697a) {
            int i = this.f23700d;
            long[] jArr = this.f23698b;
            Object[] objArr = this.f23699c;
            int i3 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC2939h.f23701a) {
                    if (i6 != i3) {
                        jArr[i3] = jArr[i6];
                        objArr[i3] = obj;
                        objArr[i6] = null;
                    }
                    i3++;
                }
            }
            this.f23697a = false;
            this.f23700d = i3;
        }
        return AbstractC2959a.b(this.f23698b, this.f23700d, j6);
    }

    public final long g(int i) {
        int i3;
        if (i < 0 || i >= (i3 = this.f23700d)) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f23697a) {
            long[] jArr = this.f23698b;
            Object[] objArr = this.f23699c;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                Object obj = objArr[i7];
                if (obj != AbstractC2939h.f23701a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f23697a = false;
            this.f23700d = i6;
        }
        return this.f23698b[i];
    }

    public final void h(long j6, Object obj) {
        Object obj2 = AbstractC2939h.f23701a;
        int iB = AbstractC2959a.b(this.f23698b, this.f23700d, j6);
        if (iB >= 0) {
            this.f23699c[iB] = obj;
            return;
        }
        int i = ~iB;
        int i3 = this.f23700d;
        if (i < i3) {
            Object[] objArr = this.f23699c;
            if (objArr[i] == obj2) {
                this.f23698b[i] = j6;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f23697a) {
            long[] jArr = this.f23698b;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.f23699c;
                int i6 = 0;
                for (int i7 = 0; i7 < i3; i7++) {
                    Object obj3 = objArr2[i7];
                    if (obj3 != obj2) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj3;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                this.f23697a = false;
                this.f23700d = i6;
                i = ~AbstractC2959a.b(this.f23698b, i6, j6);
            }
        }
        int i8 = this.f23700d;
        if (i8 >= this.f23698b.length) {
            int i9 = (i8 + 1) * 8;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f23698b, i12);
            q5.i.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f23698b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23699c, i12);
            q5.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f23699c = objArrCopyOf;
        }
        int i13 = this.f23700d - i;
        if (i13 != 0) {
            long[] jArr2 = this.f23698b;
            int i14 = i + 1;
            q5.i.e(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i14, i13);
            Object[] objArr3 = this.f23699c;
            AbstractC2281i.S(i14, i, this.f23700d, objArr3, objArr3);
        }
        this.f23698b[i] = j6;
        this.f23699c[i] = obj;
        this.f23700d++;
    }

    public final void i(long j6) {
        int iB = AbstractC2959a.b(this.f23698b, this.f23700d, j6);
        if (iB >= 0) {
            Object[] objArr = this.f23699c;
            Object obj = objArr[iB];
            Object obj2 = AbstractC2939h.f23701a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f23697a = true;
            }
        }
    }

    public final int j() {
        if (this.f23697a) {
            int i = this.f23700d;
            long[] jArr = this.f23698b;
            Object[] objArr = this.f23699c;
            int i3 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC2939h.f23701a) {
                    if (i6 != i3) {
                        jArr[i3] = jArr[i6];
                        objArr[i3] = obj;
                        objArr[i6] = null;
                    }
                    i3++;
                }
            }
            this.f23697a = false;
            this.f23700d = i3;
        }
        return this.f23700d;
    }

    public final Object k(int i) {
        int i3;
        if (i < 0 || i >= (i3 = this.f23700d)) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f23697a) {
            long[] jArr = this.f23698b;
            Object[] objArr = this.f23699c;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                Object obj = objArr[i7];
                if (obj != AbstractC2939h.f23701a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f23697a = false;
            this.f23700d = i6;
        }
        return this.f23699c[i];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f23700d * 28);
        sb.append('{');
        int i = this.f23700d;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(g(i3));
            sb.append('=');
            Object objK = k(i3);
            if (objK != sb) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        q5.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
