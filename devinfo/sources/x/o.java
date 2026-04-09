package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f36921a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f36922b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f36923c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f36924d;

    public o(int i4) {
        if (i4 == 0) {
            this.f36922b = y.a.f37285b;
            this.f36923c = y.a.f37286c;
            return;
        }
        int i10 = i4 * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f36922b = new long[i13];
        this.f36923c = new Object[i13];
    }

    public final void a(long j, Long l10) {
        int i4 = this.f36924d;
        if (i4 != 0 && j <= this.f36922b[i4 - 1]) {
            i(l10, j);
            return;
        }
        if (this.f36921a) {
            long[] jArr = this.f36922b;
            if (i4 >= jArr.length) {
                Object[] objArr = this.f36923c;
                int i10 = 0;
                for (int i11 = 0; i11 < i4; i11++) {
                    Object obj = objArr[i11];
                    if (obj != p.f36928a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f36921a = false;
                this.f36924d = i10;
            }
        }
        int i12 = this.f36924d;
        if (i12 >= this.f36922b.length) {
            int i13 = (i12 + 1) * 8;
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
            int i16 = i13 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f36922b, i16);
            nk.k.d(jArrCopyOf, "copyOf(...)");
            this.f36922b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f36923c, i16);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            this.f36923c = objArrCopyOf;
        }
        this.f36922b[i12] = j;
        this.f36923c[i12] = l10;
        this.f36924d = i12 + 1;
    }

    public final void b() {
        int i4 = this.f36924d;
        Object[] objArr = this.f36923c;
        for (int i10 = 0; i10 < i4; i10++) {
            objArr[i10] = null;
        }
        this.f36924d = 0;
        this.f36921a = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final o clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        nk.k.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        o oVar = (o) objClone;
        oVar.f36922b = (long[]) this.f36922b.clone();
        oVar.f36923c = (Object[]) this.f36923c.clone();
        return oVar;
    }

    public final Object e(long j) {
        Object obj;
        int iB = y.a.b(this.f36922b, this.f36924d, j);
        if (iB < 0 || (obj = this.f36923c[iB]) == p.f36928a) {
            return null;
        }
        return obj;
    }

    public final Object f(long j) {
        Object obj;
        int iB = y.a.b(this.f36922b, this.f36924d, j);
        if (iB < 0 || (obj = this.f36923c[iB]) == p.f36928a) {
            return -1L;
        }
        return obj;
    }

    public final int g(long j) {
        if (this.f36921a) {
            int i4 = this.f36924d;
            long[] jArr = this.f36922b;
            Object[] objArr = this.f36923c;
            int i10 = 0;
            for (int i11 = 0; i11 < i4; i11++) {
                Object obj = objArr[i11];
                if (obj != p.f36928a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f36921a = false;
            this.f36924d = i10;
        }
        return y.a.b(this.f36922b, this.f36924d, j);
    }

    public final long h(int i4) {
        int i10;
        if (i4 < 0 || i4 >= (i10 = this.f36924d)) {
            y.a.c("Expected index to be within 0..size()-1, but was " + i4);
            throw null;
        }
        if (this.f36921a) {
            long[] jArr = this.f36922b;
            Object[] objArr = this.f36923c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != p.f36928a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f36921a = false;
            this.f36924d = i11;
        }
        return this.f36922b[i4];
    }

    public final void i(Object obj, long j) {
        Object obj2 = p.f36928a;
        int iB = y.a.b(this.f36922b, this.f36924d, j);
        if (iB >= 0) {
            this.f36923c[iB] = obj;
            return;
        }
        int i4 = ~iB;
        int i10 = this.f36924d;
        if (i4 < i10) {
            Object[] objArr = this.f36923c;
            if (objArr[i4] == obj2) {
                this.f36922b[i4] = j;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f36921a) {
            long[] jArr = this.f36922b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f36923c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f36921a = false;
                this.f36924d = i11;
                i4 = ~y.a.b(this.f36922b, i11, j);
            }
        }
        int i13 = this.f36924d;
        if (i13 >= this.f36922b.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f36922b, i17);
            nk.k.d(jArrCopyOf, "copyOf(...)");
            this.f36922b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f36923c, i17);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            this.f36923c = objArrCopyOf;
        }
        int i18 = this.f36924d;
        if (i18 - i4 != 0) {
            long[] jArr2 = this.f36922b;
            int i19 = i4 + 1;
            zj.m.P(jArr2, jArr2, i19, i4, i18);
            Object[] objArr3 = this.f36923c;
            zj.m.N(i19, i4, this.f36924d, objArr3, objArr3);
        }
        this.f36922b[i4] = j;
        this.f36923c[i4] = obj;
        this.f36924d++;
    }

    public final void j(long j) {
        int iB = y.a.b(this.f36922b, this.f36924d, j);
        if (iB >= 0) {
            Object[] objArr = this.f36923c;
            Object obj = objArr[iB];
            Object obj2 = p.f36928a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f36921a = true;
            }
        }
    }

    public final int k() {
        if (this.f36921a) {
            int i4 = this.f36924d;
            long[] jArr = this.f36922b;
            Object[] objArr = this.f36923c;
            int i10 = 0;
            for (int i11 = 0; i11 < i4; i11++) {
                Object obj = objArr[i11];
                if (obj != p.f36928a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f36921a = false;
            this.f36924d = i10;
        }
        return this.f36924d;
    }

    public final Object l(int i4) {
        int i10;
        if (i4 < 0 || i4 >= (i10 = this.f36924d)) {
            y.a.c("Expected index to be within 0..size()-1, but was " + i4);
            throw null;
        }
        if (this.f36921a) {
            long[] jArr = this.f36922b;
            Object[] objArr = this.f36923c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != p.f36928a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f36921a = false;
            this.f36924d = i11;
        }
        return this.f36923c[i4];
    }

    public final String toString() {
        if (k() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f36924d * 28);
        sb2.append('{');
        int i4 = this.f36924d;
        for (int i10 = 0; i10 < i4; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i10));
            sb2.append('=');
            Object objL = l(i10);
            if (objL != sb2) {
                sb2.append(objL);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ o(Object obj) {
        this(10);
    }
}
