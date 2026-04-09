package v9;

import q9.InterfaceC5499a;

/* compiled from: Progressions.kt */
/* loaded from: classes3.dex */
public class e implements Iterable<Integer>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final int f47096b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47097c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47098d;

    public e(int i, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f47096b = i;
        this.f47097c = B7.d.p(i, i10, i11);
        this.f47098d = i11;
    }

    @Override // java.lang.Iterable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f iterator() {
        return new f(this.f47096b, this.f47097c, this.f47098d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f47096b == eVar.f47096b && this.f47097c == eVar.f47097c && this.f47098d == eVar.f47098d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f47096b * 31) + this.f47097c) * 31) + this.f47098d;
    }

    public boolean isEmpty() {
        int i = this.f47098d;
        int i10 = this.f47097c;
        int i11 = this.f47096b;
        return i > 0 ? i11 > i10 : i11 < i10;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f47097c;
        int i10 = this.f47096b;
        int i11 = this.f47098d;
        if (i11 > 0) {
            sb = new StringBuilder();
            sb.append(i10);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i11);
        } else {
            sb = new StringBuilder();
            sb.append(i10);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i11);
        }
        return sb.toString();
    }
}
