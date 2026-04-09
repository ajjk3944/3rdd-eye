package hr;

import com.google.android.gms.internal.measurement.y3;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b implements Iterable, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10863a;

    /* renamed from: d, reason: collision with root package name */
    public final int f10864d;

    /* renamed from: g, reason: collision with root package name */
    public final int f10865g;

    public b(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f10863a = i10;
        this.f10864d = y3.v(i10, i11, i12);
        this.f10865g = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f10863a == bVar.f10863a && this.f10864d == bVar.f10864d && this.f10865g == bVar.f10865g;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f10863a * 31) + this.f10864d) * 31) + this.f10865g;
    }

    public boolean isEmpty() {
        int i10 = this.f10865g;
        int i11 = this.f10864d;
        int i12 = this.f10863a;
        return i10 > 0 ? i12 > i11 : i12 < i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f10863a, this.f10864d, this.f10865g);
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f10864d;
        int i11 = this.f10863a;
        int i12 = this.f10865g;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
