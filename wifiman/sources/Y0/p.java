package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final a f24539e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final p f24540f = new p(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f24541a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24542b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24543c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24544d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a() {
            return p.f24540f;
        }

        private a() {
        }
    }

    public p(int i10, int i11, int i12, int i13) {
        this.f24541a = i10;
        this.f24542b = i11;
        this.f24543c = i12;
        this.f24544d = i13;
    }

    public static /* synthetic */ p c(p pVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = pVar.f24541a;
        }
        if ((i14 & 2) != 0) {
            i11 = pVar.f24542b;
        }
        if ((i14 & 4) != 0) {
            i12 = pVar.f24543c;
        }
        if ((i14 & 8) != 0) {
            i13 = pVar.f24544d;
        }
        return pVar.b(i10, i11, i12, i13);
    }

    public final p b(int i10, int i11, int i12, int i13) {
        return new p(i10, i11, i12, i13);
    }

    public final int d() {
        return this.f24544d;
    }

    public final int e() {
        return this.f24544d - this.f24542b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f24541a == pVar.f24541a && this.f24542b == pVar.f24542b && this.f24543c == pVar.f24543c && this.f24544d == pVar.f24544d;
    }

    public final int f() {
        return this.f24541a;
    }

    public final int g() {
        return this.f24543c;
    }

    public final int h() {
        return this.f24542b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f24541a) * 31) + Integer.hashCode(this.f24542b)) * 31) + Integer.hashCode(this.f24543c)) * 31) + Integer.hashCode(this.f24544d);
    }

    public final long i() {
        return o.a(this.f24541a, this.f24542b);
    }

    public final int j() {
        return this.f24543c - this.f24541a;
    }

    public final boolean k() {
        return this.f24541a >= this.f24543c || this.f24542b >= this.f24544d;
    }

    public final p l(int i10, int i11) {
        return new p(this.f24541a + i10, this.f24542b + i11, this.f24543c + i10, this.f24544d + i11);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f24541a + ", " + this.f24542b + ", " + this.f24543c + ", " + this.f24544d + ')';
    }
}
