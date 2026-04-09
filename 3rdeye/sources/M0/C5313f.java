package m0;

import c9.C2088i;
import com.applovin.impl.sdk.utils.JsonUtils;
import g0.C4356c;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import n0.C5346a;

/* compiled from: LongSparseArray.jvm.kt */
/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5313f<E> implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f44023b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long[] f44024c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object[] f44025d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f44026e;

    public C5313f(int i) {
        if (i == 0) {
            this.f44024c = C5346a.f44191b;
            this.f44025d = C5346a.f44192c;
            return;
        }
        int i10 = i * 8;
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
        this.f44024c = new long[i13];
        this.f44025d = new Object[i13];
    }

    public final void a(long j4, Long l5) {
        int i = this.f44026e;
        if (i != 0 && j4 <= this.f44024c[i - 1]) {
            i(j4, l5);
            return;
        }
        if (this.f44023b) {
            long[] jArr = this.f44024c;
            if (i >= jArr.length) {
                Object[] objArr = this.f44025d;
                int i10 = 0;
                for (int i11 = 0; i11 < i; i11++) {
                    Object obj = objArr[i11];
                    if (obj != C5314g.f44027a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f44023b = false;
                this.f44026e = i10;
            }
        }
        int i12 = this.f44026e;
        if (i12 >= this.f44024c.length) {
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
            long[] jArrCopyOf = Arrays.copyOf(this.f44024c, i16);
            l.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f44024c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f44025d, i16);
            l.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f44025d = objArrCopyOf;
        }
        this.f44024c[i12] = j4;
        this.f44025d[i12] = l5;
        this.f44026e = i12 + 1;
    }

    public final void b() {
        int i = this.f44026e;
        Object[] objArr = this.f44025d;
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = null;
        }
        this.f44026e = 0;
        this.f44023b = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C5313f<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        l.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C5313f<E> c5313f = (C5313f) objClone;
        c5313f.f44024c = (long[]) this.f44024c.clone();
        c5313f.f44025d = (Object[]) this.f44025d.clone();
        return c5313f;
    }

    public final E e(long j4) {
        E e4;
        int iB = C5346a.b(this.f44024c, this.f44026e, j4);
        if (iB < 0 || (e4 = (E) this.f44025d[iB]) == C5314g.f44027a) {
            return null;
        }
        return e4;
    }

    public final Object f(long j4) {
        Object obj;
        int iB = C5346a.b(this.f44024c, this.f44026e, j4);
        if (iB < 0 || (obj = this.f44025d[iB]) == C5314g.f44027a) {
            return -1L;
        }
        return obj;
    }

    public final int g(long j4) {
        if (this.f44023b) {
            int i = this.f44026e;
            long[] jArr = this.f44024c;
            Object[] objArr = this.f44025d;
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                Object obj = objArr[i11];
                if (obj != C5314g.f44027a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f44023b = false;
            this.f44026e = i10;
        }
        return C5346a.b(this.f44024c, this.f44026e, j4);
    }

    public final long h(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f44026e)) {
            throw new IllegalArgumentException(C4356c.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f44023b) {
            long[] jArr = this.f44024c;
            Object[] objArr = this.f44025d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C5314g.f44027a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f44023b = false;
            this.f44026e = i11;
        }
        return this.f44024c[i];
    }

    public final void i(long j4, E e4) {
        int iB = C5346a.b(this.f44024c, this.f44026e, j4);
        if (iB >= 0) {
            this.f44025d[iB] = e4;
            return;
        }
        int i = ~iB;
        int i10 = this.f44026e;
        Object obj = C5314g.f44027a;
        if (i < i10) {
            Object[] objArr = this.f44025d;
            if (objArr[i] == obj) {
                this.f44024c[i] = j4;
                objArr[i] = e4;
                return;
            }
        }
        if (this.f44023b) {
            long[] jArr = this.f44024c;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f44025d;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = objArr2[i12];
                    if (obj2 != obj) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj2;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f44023b = false;
                this.f44026e = i11;
                i = ~C5346a.b(this.f44024c, i11, j4);
            }
        }
        int i13 = this.f44026e;
        if (i13 >= this.f44024c.length) {
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
            long[] jArrCopyOf = Arrays.copyOf(this.f44024c, i17);
            l.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f44024c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f44025d, i17);
            l.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f44025d = objArrCopyOf;
        }
        int i18 = this.f44026e - i;
        if (i18 != 0) {
            long[] jArr2 = this.f44024c;
            int i19 = i + 1;
            l.f(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i19, i18);
            Object[] objArr3 = this.f44025d;
            C2088i.e(objArr3, i19, objArr3, i, this.f44026e);
        }
        this.f44024c[i] = j4;
        this.f44025d[i] = e4;
        this.f44026e++;
    }

    public final int j() {
        if (this.f44023b) {
            int i = this.f44026e;
            long[] jArr = this.f44024c;
            Object[] objArr = this.f44025d;
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                Object obj = objArr[i11];
                if (obj != C5314g.f44027a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f44023b = false;
            this.f44026e = i10;
        }
        return this.f44026e;
    }

    public final E k(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f44026e)) {
            throw new IllegalArgumentException(C4356c.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f44023b) {
            long[] jArr = this.f44024c;
            Object[] objArr = this.f44025d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C5314g.f44027a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f44023b = false;
            this.f44026e = i11;
        }
        return (E) this.f44025d[i];
    }

    public final String toString() {
        if (j() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f44026e * 28);
        sb.append('{');
        int i = this.f44026e;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(h(i10));
            sb.append('=');
            E eK = k(i10);
            if (eK != sb) {
                sb.append(eK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        l.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C5313f() {
        this(10);
    }
}
