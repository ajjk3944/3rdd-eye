package u;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f23091a;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long[] f23092d;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object[] f23093g;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f23094r;

    public o(int i10) {
        if (i10 == 0) {
            this.f23092d = v.a.f23730b;
            this.f23093g = v.a.f23731c;
            return;
        }
        int i11 = i10 * 8;
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
        int i14 = i11 / 8;
        this.f23092d = new long[i14];
        this.f23093g = new Object[i14];
    }

    public final void a() {
        int i10 = this.f23094r;
        Object[] objArr = this.f23093g;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f23094r = 0;
        this.f23091a = false;
    }

    public final Object b(long j) {
        Object obj;
        int iB = v.a.b(this.f23092d, this.f23094r, j);
        if (iB < 0 || (obj = this.f23093g[iB]) == p.f23095a) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.f23091a) {
            int i10 = this.f23094r;
            long[] jArr = this.f23092d;
            Object[] objArr = this.f23093g;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != p.f23095a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f23091a = false;
            this.f23094r = i11;
        }
        return v.a.b(this.f23092d, this.f23094r, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        br.l.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        o oVar = (o) objClone;
        oVar.f23092d = (long[]) this.f23092d.clone();
        oVar.f23093g = (Object[]) this.f23093g.clone();
        return oVar;
    }

    public final long d(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f23094r)) {
            v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f23091a) {
            long[] jArr = this.f23092d;
            Object[] objArr = this.f23093g;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != p.f23095a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f23091a = false;
            this.f23094r = i12;
        }
        return this.f23092d[i10];
    }

    public final void e(Object obj, long j) {
        Object obj2 = p.f23095a;
        int iB = v.a.b(this.f23092d, this.f23094r, j);
        if (iB >= 0) {
            this.f23093g[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f23094r;
        if (i10 < i11) {
            Object[] objArr = this.f23093g;
            if (objArr[i10] == obj2) {
                this.f23092d[i10] = j;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f23091a) {
            long[] jArr = this.f23092d;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f23093g;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f23091a = false;
                this.f23094r = i12;
                i10 = ~v.a.b(this.f23092d, i12, j);
            }
        }
        int i14 = this.f23094r;
        if (i14 >= this.f23092d.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f23092d, i18);
            br.l.d(jArrCopyOf, "copyOf(...)");
            this.f23092d = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23093g, i18);
            br.l.d(objArrCopyOf, "copyOf(...)");
            this.f23093g = objArrCopyOf;
        }
        int i19 = this.f23094r;
        if (i19 - i10 != 0) {
            long[] jArr2 = this.f23092d;
            int i20 = i10 + 1;
            mq.l.d0(jArr2, jArr2, i20, i10, i19);
            Object[] objArr3 = this.f23093g;
            mq.l.c0(i20, i10, this.f23094r, objArr3, objArr3);
        }
        this.f23092d[i10] = j;
        this.f23093g[i10] = obj;
        this.f23094r++;
    }

    public final void f(long j) {
        int iB = v.a.b(this.f23092d, this.f23094r, j);
        if (iB >= 0) {
            Object[] objArr = this.f23093g;
            Object obj = objArr[iB];
            Object obj2 = p.f23095a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f23091a = true;
            }
        }
    }

    public final int g() {
        if (this.f23091a) {
            int i10 = this.f23094r;
            long[] jArr = this.f23092d;
            Object[] objArr = this.f23093g;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != p.f23095a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f23091a = false;
            this.f23094r = i11;
        }
        return this.f23094r;
    }

    public final Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f23094r)) {
            v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f23091a) {
            long[] jArr = this.f23092d;
            Object[] objArr = this.f23093g;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != p.f23095a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f23091a = false;
            this.f23094r = i12;
        }
        return this.f23093g[i10];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f23094r * 28);
        sb2.append('{');
        int i10 = this.f23094r;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i11));
            sb2.append('=');
            Object objH = h(i11);
            if (objH != sb2) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ o(Object obj) {
        this(10);
    }
}
