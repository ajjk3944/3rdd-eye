package o;

import Zg.AbstractC3682n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.AbstractC7173a;

/* loaded from: classes.dex */
public class W implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f54938a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f54939b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f54940c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f54941d;

    public W() {
        this(0, 1, null);
    }

    public void b(int i10, Object obj) {
        int i11 = this.f54941d;
        if (i11 != 0 && i10 <= this.f54939b[i11 - 1]) {
            l(i10, obj);
            return;
        }
        if (this.f54938a && i11 >= this.f54939b.length) {
            X.e(this);
        }
        int i12 = this.f54941d;
        if (i12 >= this.f54939b.length) {
            int iE = AbstractC7173a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f54939b, iE);
            AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
            this.f54939b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f54940c, iE);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f54940c = objArrCopyOf;
        }
        this.f54939b[i12] = i10;
        this.f54940c[i12] = obj;
        this.f54941d = i12 + 1;
    }

    public void c() {
        int i10 = this.f54941d;
        Object[] objArr = this.f54940c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f54941d = 0;
        this.f54938a = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public W clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC6492s.g(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        W w10 = (W) objClone;
        w10.f54939b = (int[]) this.f54939b.clone();
        w10.f54940c = (Object[]) this.f54940c.clone();
        return w10;
    }

    public boolean e(int i10) {
        return h(i10) >= 0;
    }

    public Object f(int i10) {
        return X.c(this, i10);
    }

    public int h(int i10) {
        if (this.f54938a) {
            X.e(this);
        }
        return AbstractC7173a.a(this.f54939b, this.f54941d, i10);
    }

    public int i(Object obj) {
        if (this.f54938a) {
            X.e(this);
        }
        int i10 = this.f54941d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f54940c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int k(int i10) {
        if (this.f54938a) {
            X.e(this);
        }
        return this.f54939b[i10];
    }

    public void l(int i10, Object obj) {
        int iA = AbstractC7173a.a(this.f54939b, this.f54941d, i10);
        if (iA >= 0) {
            this.f54940c[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f54941d && this.f54940c[i11] == X.f54942a) {
            this.f54939b[i11] = i10;
            this.f54940c[i11] = obj;
            return;
        }
        if (this.f54938a && this.f54941d >= this.f54939b.length) {
            X.e(this);
            i11 = ~AbstractC7173a.a(this.f54939b, this.f54941d, i10);
        }
        int i12 = this.f54941d;
        if (i12 >= this.f54939b.length) {
            int iE = AbstractC7173a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f54939b, iE);
            AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
            this.f54939b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f54940c, iE);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f54940c = objArrCopyOf;
        }
        int i13 = this.f54941d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f54939b;
            int i14 = i11 + 1;
            AbstractC3682n.k(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f54940c;
            AbstractC3682n.m(objArr, objArr, i14, i11, this.f54941d);
        }
        this.f54939b[i11] = i10;
        this.f54940c[i11] = obj;
        this.f54941d++;
    }

    public void m(int i10) {
        X.d(this, i10);
    }

    public void n(int i10) {
        if (this.f54940c[i10] != X.f54942a) {
            this.f54940c[i10] = X.f54942a;
            this.f54938a = true;
        }
    }

    public Object o(int i10, Object obj) {
        int iH = h(i10);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f54940c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public int p() {
        if (this.f54938a) {
            X.e(this);
        }
        return this.f54941d;
    }

    public Object q(int i10) {
        if (this.f54938a) {
            X.e(this);
        }
        return this.f54940c[i10];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f54941d * 28);
        sb2.append('{');
        int i10 = this.f54941d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(k(i11));
            sb2.append('=');
            Object objQ = q(i11);
            if (objQ != this) {
                sb2.append(objQ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC6492s.h(string, "buffer.toString()");
        return string;
    }

    public W(int i10) {
        if (i10 == 0) {
            this.f54939b = AbstractC7173a.f57281a;
            this.f54940c = AbstractC7173a.f57283c;
        } else {
            int iE = AbstractC7173a.e(i10);
            this.f54939b = new int[iE];
            this.f54940c = new Object[iE];
        }
    }

    public /* synthetic */ W(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
