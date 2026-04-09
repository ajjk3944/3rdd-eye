package sh;

import Zg.Q;
import gh.AbstractC5918c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;

/* renamed from: sh.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7972g implements Iterable, InterfaceC6944a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f61622d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f61623a;

    /* renamed from: b, reason: collision with root package name */
    private final int f61624b;

    /* renamed from: c, reason: collision with root package name */
    private final int f61625c;

    /* renamed from: sh.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7972g a(int i10, int i11, int i12) {
            return new C7972g(i10, i11, i12);
        }

        private a() {
        }
    }

    public C7972g(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f61623a = i10;
        this.f61624b = AbstractC5918c.c(i10, i11, i12);
        this.f61625c = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7972g) {
            if (!isEmpty() || !((C7972g) obj).isEmpty()) {
                C7972g c7972g = (C7972g) obj;
                if (this.f61623a != c7972g.f61623a || this.f61624b != c7972g.f61624b || this.f61625c != c7972g.f61625c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f61623a * 31) + this.f61624b) * 31) + this.f61625c;
    }

    public final int i() {
        return this.f61623a;
    }

    public boolean isEmpty() {
        if (this.f61625c > 0) {
            if (this.f61623a <= this.f61624b) {
                return false;
            }
        } else if (this.f61623a >= this.f61624b) {
            return false;
        }
        return true;
    }

    public final int j() {
        return this.f61624b;
    }

    public final int k() {
        return this.f61625c;
    }

    @Override // java.lang.Iterable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Q iterator() {
        return new C7973h(this.f61623a, this.f61624b, this.f61625c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f61625c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f61623a);
            sb2.append("..");
            sb2.append(this.f61624b);
            sb2.append(" step ");
            i10 = this.f61625c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f61623a);
            sb2.append(" downTo ");
            sb2.append(this.f61624b);
            sb2.append(" step ");
            i10 = -this.f61625c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
