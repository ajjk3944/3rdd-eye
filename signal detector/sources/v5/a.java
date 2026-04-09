package v5;

import java.util.Iterator;

/* loaded from: classes3.dex */
public class a implements Iterable, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23896c;

    public a(int i, int i3, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f23894a = i;
        if (i6 > 0) {
            if (i < i3) {
                int i7 = i3 % i6;
                int i8 = i % i6;
                int i9 = ((i7 < 0 ? i7 + i6 : i7) - (i8 < 0 ? i8 + i6 : i8)) % i6;
                i3 -= i9 < 0 ? i9 + i6 : i9;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i3) {
                int i10 = -i6;
                int i11 = i % i10;
                int i12 = i3 % i10;
                int i13 = ((i11 < 0 ? i11 + i10 : i11) - (i12 < 0 ? i12 + i10 : i12)) % i10;
                i3 += i13 < 0 ? i13 + i10 : i13;
            }
        }
        this.f23895b = i3;
        this.f23896c = i6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f23894a == aVar.f23894a && this.f23895b == aVar.f23895b && this.f23896c == aVar.f23896c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f23894a * 31) + this.f23895b) * 31) + this.f23896c;
    }

    public boolean isEmpty() {
        int i = this.f23896c;
        int i3 = this.f23895b;
        int i6 = this.f23894a;
        return i > 0 ? i6 > i3 : i6 < i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f23894a, this.f23895b, this.f23896c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f23895b;
        int i3 = this.f23894a;
        int i6 = this.f23896c;
        if (i6 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i6);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i6);
        }
        return sb.toString();
    }
}
