package o;

import Zg.AbstractC3682n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.AbstractC7173a;
import p.AbstractC7176d;

/* renamed from: o.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7028t implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f55004a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f55005b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f55006c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f55007d;

    public C7028t() {
        this(0, 1, null);
    }

    public void b() {
        int i10 = this.f55007d;
        Object[] objArr = this.f55006c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f55007d = 0;
        this.f55004a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C7028t clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC6492s.g(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C7028t c7028t = (C7028t) objClone;
        c7028t.f55005b = (long[]) this.f55005b.clone();
        c7028t.f55006c = (Object[]) this.f55006c.clone();
        return c7028t;
    }

    public boolean d(long j10) {
        return f(j10) >= 0;
    }

    public Object e(long j10) {
        int iB = AbstractC7173a.b(this.f55005b, this.f55007d, j10);
        if (iB < 0 || this.f55006c[iB] == AbstractC7029u.f55008a) {
            return null;
        }
        return this.f55006c[iB];
    }

    public int f(long j10) {
        if (this.f55004a) {
            int i10 = this.f55007d;
            long[] jArr = this.f55005b;
            Object[] objArr = this.f55006c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC7029u.f55008a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f55004a = false;
            this.f55007d = i11;
        }
        return AbstractC7173a.b(this.f55005b, this.f55007d, j10);
    }

    public boolean h() {
        return o() == 0;
    }

    public long i(int i10) {
        if (!(i10 >= 0 && i10 < this.f55007d)) {
            AbstractC7176d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f55004a) {
            int i11 = this.f55007d;
            long[] jArr = this.f55005b;
            Object[] objArr = this.f55006c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC7029u.f55008a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f55004a = false;
            this.f55007d = i12;
        }
        return this.f55005b[i10];
    }

    public void k(long j10, Object obj) {
        int iB = AbstractC7173a.b(this.f55005b, this.f55007d, j10);
        if (iB >= 0) {
            this.f55006c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f55007d && this.f55006c[i10] == AbstractC7029u.f55008a) {
            this.f55005b[i10] = j10;
            this.f55006c[i10] = obj;
            return;
        }
        if (this.f55004a) {
            int i11 = this.f55007d;
            long[] jArr = this.f55005b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f55006c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != AbstractC7029u.f55008a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f55004a = false;
                this.f55007d = i12;
                i10 = ~AbstractC7173a.b(this.f55005b, i12, j10);
            }
        }
        int i14 = this.f55007d;
        if (i14 >= this.f55005b.length) {
            int iF = AbstractC7173a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f55005b, iF);
            AbstractC6492s.h(jArrCopyOf, "copyOf(this, newSize)");
            this.f55005b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f55006c, iF);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f55006c = objArrCopyOf;
        }
        int i15 = this.f55007d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f55005b;
            int i16 = i10 + 1;
            AbstractC3682n.l(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f55006c;
            AbstractC3682n.m(objArr2, objArr2, i16, i10, this.f55007d);
        }
        this.f55005b[i10] = j10;
        this.f55006c[i10] = obj;
        this.f55007d++;
    }

    public void l(C7028t other) {
        AbstractC6492s.i(other, "other");
        int iO = other.o();
        for (int i10 = 0; i10 < iO; i10++) {
            k(other.i(i10), other.p(i10));
        }
    }

    public void m(long j10) {
        int iB = AbstractC7173a.b(this.f55005b, this.f55007d, j10);
        if (iB < 0 || this.f55006c[iB] == AbstractC7029u.f55008a) {
            return;
        }
        this.f55006c[iB] = AbstractC7029u.f55008a;
        this.f55004a = true;
    }

    public void n(int i10) {
        if (this.f55006c[i10] != AbstractC7029u.f55008a) {
            this.f55006c[i10] = AbstractC7029u.f55008a;
            this.f55004a = true;
        }
    }

    public int o() {
        if (this.f55004a) {
            int i10 = this.f55007d;
            long[] jArr = this.f55005b;
            Object[] objArr = this.f55006c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC7029u.f55008a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f55004a = false;
            this.f55007d = i11;
        }
        return this.f55007d;
    }

    public Object p(int i10) {
        if (!(i10 >= 0 && i10 < this.f55007d)) {
            AbstractC7176d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f55004a) {
            int i11 = this.f55007d;
            long[] jArr = this.f55005b;
            Object[] objArr = this.f55006c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC7029u.f55008a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f55004a = false;
            this.f55007d = i12;
        }
        return this.f55006c[i10];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f55007d * 28);
        sb2.append('{');
        int i10 = this.f55007d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i11));
            sb2.append('=');
            Object objP = p(i11);
            if (objP != sb2) {
                sb2.append(objP);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C7028t(int i10) {
        if (i10 == 0) {
            this.f55005b = AbstractC7173a.f57282b;
            this.f55006c = AbstractC7173a.f57283c;
        } else {
            int iF = AbstractC7173a.f(i10);
            this.f55005b = new long[iF];
            this.f55006c = new Object[iF];
        }
    }

    public /* synthetic */ C7028t(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
