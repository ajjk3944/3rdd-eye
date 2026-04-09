package q9;

import kotlin.jvm.internal.i;
import z8.e0;

/* loaded from: classes4.dex */
public class a implements Iterable, m9.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0472a f24084d = new C0472a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f24085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24087c;

    /* renamed from: q9.a$a, reason: collision with other inner class name */
    public static final class C0472a {
        public /* synthetic */ C0472a(i iVar) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }

        public C0472a() {
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f24085a = i10;
        this.f24086b = f9.c.b(i10, i11, i12);
        this.f24087c = i12;
    }

    public final int c() {
        return this.f24085a;
    }

    public final int d() {
        return this.f24086b;
    }

    public final int e() {
        return this.f24087c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f24085a == aVar.f24085a && this.f24086b == aVar.f24086b && this.f24087c == aVar.f24087c;
    }

    @Override // java.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e0 iterator() {
        return new b(this.f24085a, this.f24086b, this.f24087c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f24085a * 31) + this.f24086b) * 31) + this.f24087c;
    }

    public boolean isEmpty() {
        return this.f24087c > 0 ? this.f24085a > this.f24086b : this.f24085a < this.f24086b;
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        if (this.f24087c > 0) {
            sb = new StringBuilder();
            sb.append(this.f24085a);
            sb.append("..");
            sb.append(this.f24086b);
            sb.append(" step ");
            i10 = this.f24087c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f24085a);
            sb.append(" downTo ");
            sb.append(this.f24086b);
            sb.append(" step ");
            i10 = -this.f24087c;
        }
        sb.append(i10);
        return sb.toString();
    }
}
