package ns;

import br.l;
import java.util.ArrayList;
import java.util.List;
import mq.m;
import mq.o;
import mq.w;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f18519a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18520b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18521c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18522d;

    /* renamed from: e, reason: collision with root package name */
    public final List f18523e;

    public a(int... iArr) {
        List listQ0;
        l.e(iArr, "numbers");
        this.f18519a = iArr;
        Integer numP0 = mq.l.p0(iArr, 0);
        this.f18520b = numP0 != null ? numP0.intValue() : -1;
        Integer numP02 = mq.l.p0(iArr, 1);
        this.f18521c = numP02 != null ? numP02.intValue() : -1;
        Integer numP03 = mq.l.p0(iArr, 2);
        this.f18522d = numP03 != null ? numP03.intValue() : -1;
        if (iArr.length <= 3) {
            listQ0 = w.f16945a;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(c7.a.q(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            listQ0 = o.Q0(new mq.c(new m(iArr), 3, iArr.length));
        }
        this.f18523e = listQ0;
    }

    public final boolean a(int i10, int i11, int i12) {
        int i13 = this.f18520b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f18521c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f18522d >= i12;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18520b == aVar.f18520b && this.f18521c == aVar.f18521c && this.f18522d == aVar.f18522d && l.a(this.f18523e, aVar.f18523e);
    }

    public final int hashCode() {
        int i10 = this.f18520b;
        int i11 = (i10 * 31) + this.f18521c + i10;
        int i12 = (i11 * 31) + this.f18522d + i11;
        return this.f18523e.hashCode() + (i12 * 31) + i12;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f18519a) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : o.x0(arrayList, ".", null, null, null, 62);
    }
}
