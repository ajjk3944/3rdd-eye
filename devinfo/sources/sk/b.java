package sk;

import com.bumptech.glide.e;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class b implements Iterable, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f33817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33819c;

    public b(int i4, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f33817a = i4;
        this.f33818b = e.E(i4, i10, i11);
        this.f33819c = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f33817a == bVar.f33817a && this.f33818b == bVar.f33818b && this.f33819c == bVar.f33819c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f33817a * 31) + this.f33818b) * 31) + this.f33819c;
    }

    public boolean isEmpty() {
        int i4 = this.f33819c;
        int i10 = this.f33818b;
        int i11 = this.f33817a;
        return i4 > 0 ? i11 > i10 : i11 < i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f33817a, this.f33818b, this.f33819c);
    }

    public String toString() {
        StringBuilder sb2;
        int i4 = this.f33818b;
        int i10 = this.f33817a;
        int i11 = this.f33819c;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i4);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i4);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
